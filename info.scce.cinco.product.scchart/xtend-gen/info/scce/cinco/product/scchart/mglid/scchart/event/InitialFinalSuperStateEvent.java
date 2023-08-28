package info.scce.cinco.product.scchart.mglid.scchart.event;

import de.jabc.cinco.meta.core.event.hub.Subscriber;
import de.jabc.cinco.meta.core.event.hub.impl.PayloadSubscriber;
import de.jabc.cinco.meta.plugin.event.api.event.ContainerEvent;
import de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostDoubleClickPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostSelectPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreAttributeChangePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreCreateNodePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreDoubleClickPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreSelectPayload;
import de.jabc.cinco.meta.plugin.event.api.util.EventApiExtension;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateEvent;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public final class InitialFinalSuperStateEvent implements ContainerEvent<InitialFinalSuperState> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static InitialFinalSuperStateEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected InitialFinalSuperStateEvent() {
  }
  
  public static final InitialFinalSuperStateEvent getInstance() {
    if ((InitialFinalSuperStateEvent.eventInstance == null)) {
      InitialFinalSuperStateEvent _initialFinalSuperStateEvent = new InitialFinalSuperStateEvent();
      InitialFinalSuperStateEvent.eventInstance = _initialFinalSuperStateEvent;
    }
    return InitialFinalSuperStateEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<InitialFinalSuperState>> _function = (PreAttributeChangePayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function);
    final Procedure1<PreCreateNodePayload<InitialFinalSuperState>> _function_1 = (PreCreateNodePayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_1);
    final Procedure1<PreDeletePayload<InitialFinalSuperState>> _function_2 = (PreDeletePayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_2);
    final Procedure1<PreDoubleClickPayload<InitialFinalSuperState>> _function_3 = (PreDoubleClickPayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_3);
    final Procedure1<PreMovePayload<InitialFinalSuperState>> _function_4 = (PreMovePayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_4);
    final Procedure1<PreResizePayload<InitialFinalSuperState>> _function_5 = (PreResizePayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_5);
    final Procedure1<PreSelectPayload<InitialFinalSuperState>> _function_6 = (PreSelectPayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_6);
    final Procedure1<PostAttributeChangePayload<InitialFinalSuperState>> _function_7 = (PostAttributeChangePayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_7);
    final Procedure1<PostCreatePayload<InitialFinalSuperState>> _function_8 = (PostCreatePayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_8);
    final Function1<PostDeletePayload<InitialFinalSuperState>, Runnable> _function_9 = (PostDeletePayload<InitialFinalSuperState> payload) -> {
      return InitialFinalSuperStateEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<InitialFinalSuperState>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<InitialFinalSuperState>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_9);
    final Procedure1<PostDoubleClickPayload<InitialFinalSuperState>> _function_10 = (PostDoubleClickPayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_10);
    final Procedure1<PostMovePayload<InitialFinalSuperState>> _function_11 = (PostMovePayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_11);
    final Procedure1<PostResizePayload<InitialFinalSuperState>> _function_12 = (PostResizePayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_12);
    final Procedure1<PostSelectPayload<InitialFinalSuperState>> _function_13 = (PostSelectPayload<InitialFinalSuperState> payload) -> {
      InitialFinalSuperStateEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<InitialFinalSuperState>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<InitialFinalSuperState>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", _function_13);
    this.subscribers = Collections.<Subscriber>unmodifiableList(CollectionLiterals.<Subscriber>newArrayList(_subscribePayloadSubscriber, _subscribePayloadSubscriber_1, _subscribePayloadSubscriber_2, _subscribePayloadSubscriber_3, _subscribePayloadSubscriber_4, _subscribePayloadSubscriber_5, _subscribePayloadSubscriber_6, _subscribePayloadSubscriber_7, _subscribePayloadSubscriber_8, _subscribePayloadSubscriber_9, _subscribePayloadSubscriber_10, _subscribePayloadSubscriber_11, _subscribePayloadSubscriber_12, _subscribePayloadSubscriber_13));
  }
  
  @Override
  public final void unsubscribe() {
    if (this.subscribers!=null) {
      final Consumer<Subscriber> _function = (Subscriber it) -> {
        it.unsubscribe();
      };
      this.subscribers.forEach(_function);
    }
    this.subscribers = null;
  }
  
  @Override
  public final void preAttributeChange(final InitialFinalSuperState element, final String attribute, final Object newValue) {
    SuperStateEvent.getInstance().preAttributeChange(element, attribute, newValue);
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<InitialFinalSuperState> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends InitialFinalSuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
    SuperStateEvent.getInstance().preCreate(elementClass, container, x, y, width, height);
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<InitialFinalSuperState> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final InitialFinalSuperState element) {
    SuperStateEvent.getInstance().preDelete(element);
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<InitialFinalSuperState> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final InitialFinalSuperState element) {
    SuperStateEvent.getInstance().preDoubleClick(element);
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<InitialFinalSuperState> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final InitialFinalSuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
    SuperStateEvent.getInstance().preMove(element, newContainer, newX, newY);
  }
  
  @Override
  public final void preMove(final PreMovePayload<InitialFinalSuperState> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final InitialFinalSuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
    SuperStateEvent.getInstance().preResize(element, newWidth, newHeight, newX, newY, direction);
  }
  
  @Override
  public final void preResize(final PreResizePayload<InitialFinalSuperState> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final InitialFinalSuperState element) {
    SuperStateEvent.getInstance().preSelect(element);
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<InitialFinalSuperState> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final InitialFinalSuperState element, final String attribute, final Object oldValue) {
    SuperStateEvent.getInstance().postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<InitialFinalSuperState> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final InitialFinalSuperState element) {
    SuperStateEvent.getInstance().postCreate(element);
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<InitialFinalSuperState> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final InitialFinalSuperState element) {
    return SuperStateEvent.getInstance().postDelete(element);
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<InitialFinalSuperState> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final InitialFinalSuperState element) {
    SuperStateEvent.getInstance().postDoubleClick(element);
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<InitialFinalSuperState> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final InitialFinalSuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
    SuperStateEvent.getInstance().postMove(element, oldContainer, oldX, oldY);
  }
  
  @Override
  public final void postMove(final PostMovePayload<InitialFinalSuperState> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final InitialFinalSuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    SuperStateEvent.getInstance().postResize(element, oldWidth, oldHeight, oldX, oldY, direction);
  }
  
  @Override
  public final void postResize(final PostResizePayload<InitialFinalSuperState> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final InitialFinalSuperState element) {
    SuperStateEvent.getInstance().postSelect(element);
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<InitialFinalSuperState> it) {
    this.postSelect(it.getElement());
  }
}

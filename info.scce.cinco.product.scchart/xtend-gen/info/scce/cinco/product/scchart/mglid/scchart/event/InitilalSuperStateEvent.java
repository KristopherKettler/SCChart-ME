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
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateEvent;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class InitilalSuperStateEvent implements ContainerEvent<InitilalSuperState> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static InitilalSuperStateEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected InitilalSuperStateEvent() {
  }
  
  public static final InitilalSuperStateEvent getInstance() {
    if ((InitilalSuperStateEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.InitilalSuperStateEvent _initilalSuperStateEvent = new info.scce.cinco.product.scchart.events.InitilalSuperStateEvent();
      InitilalSuperStateEvent.eventInstance = _initilalSuperStateEvent;
    }
    return InitilalSuperStateEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<InitilalSuperState>> _function = (PreAttributeChangePayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<InitilalSuperState>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<InitilalSuperState>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function);
    final Procedure1<PreCreateNodePayload<InitilalSuperState>> _function_1 = (PreCreateNodePayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<InitilalSuperState>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_1);
    final Procedure1<PreDeletePayload<InitilalSuperState>> _function_2 = (PreDeletePayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<InitilalSuperState>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_2);
    final Procedure1<PreDoubleClickPayload<InitilalSuperState>> _function_3 = (PreDoubleClickPayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<InitilalSuperState>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_3);
    final Procedure1<PreMovePayload<InitilalSuperState>> _function_4 = (PreMovePayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<InitilalSuperState>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_4);
    final Procedure1<PreResizePayload<InitilalSuperState>> _function_5 = (PreResizePayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<InitilalSuperState>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_5);
    final Procedure1<PreSelectPayload<InitilalSuperState>> _function_6 = (PreSelectPayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<InitilalSuperState>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_6);
    final Procedure1<PostAttributeChangePayload<InitilalSuperState>> _function_7 = (PostAttributeChangePayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<InitilalSuperState>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_7);
    final Procedure1<PostCreatePayload<InitilalSuperState>> _function_8 = (PostCreatePayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<InitilalSuperState>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_8);
    final Function1<PostDeletePayload<InitilalSuperState>, Runnable> _function_9 = (PostDeletePayload<InitilalSuperState> payload) -> {
      return InitilalSuperStateEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<InitilalSuperState>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<InitilalSuperState>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_9);
    final Procedure1<PostDoubleClickPayload<InitilalSuperState>> _function_10 = (PostDoubleClickPayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<InitilalSuperState>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_10);
    final Procedure1<PostMovePayload<InitilalSuperState>> _function_11 = (PostMovePayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<InitilalSuperState>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_11);
    final Procedure1<PostResizePayload<InitilalSuperState>> _function_12 = (PostResizePayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<InitilalSuperState>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_12);
    final Procedure1<PostSelectPayload<InitilalSuperState>> _function_13 = (PostSelectPayload<InitilalSuperState> payload) -> {
      InitilalSuperStateEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<InitilalSuperState>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<InitilalSuperState>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", _function_13);
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
  public final void preAttributeChange(final InitilalSuperState element, final String attribute, final Object newValue) {
    SuperStateEvent.getInstance().preAttributeChange(element, attribute, newValue);
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<InitilalSuperState> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends InitilalSuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
    SuperStateEvent.getInstance().preCreate(elementClass, container, x, y, width, height);
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<InitilalSuperState> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final InitilalSuperState element) {
    SuperStateEvent.getInstance().preDelete(element);
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<InitilalSuperState> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final InitilalSuperState element) {
    SuperStateEvent.getInstance().preDoubleClick(element);
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<InitilalSuperState> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final InitilalSuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
    SuperStateEvent.getInstance().preMove(element, newContainer, newX, newY);
  }
  
  @Override
  public final void preMove(final PreMovePayload<InitilalSuperState> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final InitilalSuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
    SuperStateEvent.getInstance().preResize(element, newWidth, newHeight, newX, newY, direction);
  }
  
  @Override
  public final void preResize(final PreResizePayload<InitilalSuperState> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final InitilalSuperState element) {
    SuperStateEvent.getInstance().preSelect(element);
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<InitilalSuperState> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final InitilalSuperState element, final String attribute, final Object oldValue) {
    SuperStateEvent.getInstance().postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<InitilalSuperState> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final InitilalSuperState element) {
    SuperStateEvent.getInstance().postCreate(element);
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<InitilalSuperState> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final InitilalSuperState element) {
    return SuperStateEvent.getInstance().postDelete(element);
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<InitilalSuperState> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final InitilalSuperState element) {
    SuperStateEvent.getInstance().postDoubleClick(element);
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<InitilalSuperState> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final InitilalSuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
    SuperStateEvent.getInstance().postMove(element, oldContainer, oldX, oldY);
  }
  
  @Override
  public final void postMove(final PostMovePayload<InitilalSuperState> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final InitilalSuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    SuperStateEvent.getInstance().postResize(element, oldWidth, oldHeight, oldX, oldY, direction);
  }
  
  @Override
  public final void postResize(final PostResizePayload<InitilalSuperState> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final InitilalSuperState element) {
    SuperStateEvent.getInstance().postSelect(element);
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<InitilalSuperState> it) {
    this.postSelect(it.getElement());
  }
}

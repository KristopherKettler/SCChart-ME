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
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateEvent;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public final class FinalSuperStateEvent implements ContainerEvent<FinalSuperState> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static FinalSuperStateEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected FinalSuperStateEvent() {
  }
  
  public static final FinalSuperStateEvent getInstance() {
    if ((FinalSuperStateEvent.eventInstance == null)) {
      FinalSuperStateEvent _finalSuperStateEvent = new FinalSuperStateEvent();
      FinalSuperStateEvent.eventInstance = _finalSuperStateEvent;
    }
    return FinalSuperStateEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<FinalSuperState>> _function = (PreAttributeChangePayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<FinalSuperState>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<FinalSuperState>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function);
    final Procedure1<PreCreateNodePayload<FinalSuperState>> _function_1 = (PreCreateNodePayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<FinalSuperState>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<FinalSuperState>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_1);
    final Procedure1<PreDeletePayload<FinalSuperState>> _function_2 = (PreDeletePayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<FinalSuperState>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<FinalSuperState>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_2);
    final Procedure1<PreDoubleClickPayload<FinalSuperState>> _function_3 = (PreDoubleClickPayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<FinalSuperState>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<FinalSuperState>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_3);
    final Procedure1<PreMovePayload<FinalSuperState>> _function_4 = (PreMovePayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<FinalSuperState>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<FinalSuperState>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_4);
    final Procedure1<PreResizePayload<FinalSuperState>> _function_5 = (PreResizePayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<FinalSuperState>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<FinalSuperState>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_5);
    final Procedure1<PreSelectPayload<FinalSuperState>> _function_6 = (PreSelectPayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<FinalSuperState>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<FinalSuperState>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_6);
    final Procedure1<PostAttributeChangePayload<FinalSuperState>> _function_7 = (PostAttributeChangePayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<FinalSuperState>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<FinalSuperState>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_7);
    final Procedure1<PostCreatePayload<FinalSuperState>> _function_8 = (PostCreatePayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<FinalSuperState>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<FinalSuperState>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_8);
    final Function1<PostDeletePayload<FinalSuperState>, Runnable> _function_9 = (PostDeletePayload<FinalSuperState> payload) -> {
      return FinalSuperStateEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<FinalSuperState>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<FinalSuperState>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_9);
    final Procedure1<PostDoubleClickPayload<FinalSuperState>> _function_10 = (PostDoubleClickPayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<FinalSuperState>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<FinalSuperState>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_10);
    final Procedure1<PostMovePayload<FinalSuperState>> _function_11 = (PostMovePayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<FinalSuperState>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<FinalSuperState>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_11);
    final Procedure1<PostResizePayload<FinalSuperState>> _function_12 = (PostResizePayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<FinalSuperState>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<FinalSuperState>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_12);
    final Procedure1<PostSelectPayload<FinalSuperState>> _function_13 = (PostSelectPayload<FinalSuperState> payload) -> {
      FinalSuperStateEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<FinalSuperState>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<FinalSuperState>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", _function_13);
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
  public final void preAttributeChange(final FinalSuperState element, final String attribute, final Object newValue) {
    SuperStateEvent.getInstance().preAttributeChange(element, attribute, newValue);
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<FinalSuperState> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends FinalSuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
    SuperStateEvent.getInstance().preCreate(elementClass, container, x, y, width, height);
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<FinalSuperState> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final FinalSuperState element) {
    SuperStateEvent.getInstance().preDelete(element);
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<FinalSuperState> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final FinalSuperState element) {
    SuperStateEvent.getInstance().preDoubleClick(element);
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<FinalSuperState> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final FinalSuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
    SuperStateEvent.getInstance().preMove(element, newContainer, newX, newY);
  }
  
  @Override
  public final void preMove(final PreMovePayload<FinalSuperState> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final FinalSuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
    SuperStateEvent.getInstance().preResize(element, newWidth, newHeight, newX, newY, direction);
  }
  
  @Override
  public final void preResize(final PreResizePayload<FinalSuperState> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final FinalSuperState element) {
    SuperStateEvent.getInstance().preSelect(element);
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<FinalSuperState> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final FinalSuperState element, final String attribute, final Object oldValue) {
    SuperStateEvent.getInstance().postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<FinalSuperState> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final FinalSuperState element) {
    SuperStateEvent.getInstance().postCreate(element);
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<FinalSuperState> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final FinalSuperState element) {
    return SuperStateEvent.getInstance().postDelete(element);
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<FinalSuperState> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final FinalSuperState element) {
    SuperStateEvent.getInstance().postDoubleClick(element);
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<FinalSuperState> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final FinalSuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
    SuperStateEvent.getInstance().postMove(element, oldContainer, oldX, oldY);
  }
  
  @Override
  public final void postMove(final PostMovePayload<FinalSuperState> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final FinalSuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    SuperStateEvent.getInstance().postResize(element, oldWidth, oldHeight, oldX, oldY, direction);
  }
  
  @Override
  public final void postResize(final PostResizePayload<FinalSuperState> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final FinalSuperState element) {
    SuperStateEvent.getInstance().postSelect(element);
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<FinalSuperState> it) {
    this.postSelect(it.getElement());
  }
}

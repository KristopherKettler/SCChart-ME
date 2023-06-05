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
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class SuperStateEvent implements ContainerEvent<SuperState> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static SuperStateEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected SuperStateEvent() {
  }
  
  public static final SuperStateEvent getInstance() {
    if ((SuperStateEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.SuperStateEvent _superStateEvent = new info.scce.cinco.product.scchart.events.SuperStateEvent();
      SuperStateEvent.eventInstance = _superStateEvent;
    }
    return SuperStateEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<SuperState>> _function = (PreAttributeChangePayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<SuperState>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<SuperState>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function);
    final Procedure1<PreCreateNodePayload<SuperState>> _function_1 = (PreCreateNodePayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<SuperState>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<SuperState>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_1);
    final Procedure1<PreDeletePayload<SuperState>> _function_2 = (PreDeletePayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<SuperState>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<SuperState>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_2);
    final Procedure1<PreDoubleClickPayload<SuperState>> _function_3 = (PreDoubleClickPayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<SuperState>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<SuperState>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_3);
    final Procedure1<PreMovePayload<SuperState>> _function_4 = (PreMovePayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<SuperState>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<SuperState>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_4);
    final Procedure1<PreResizePayload<SuperState>> _function_5 = (PreResizePayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<SuperState>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<SuperState>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_5);
    final Procedure1<PreSelectPayload<SuperState>> _function_6 = (PreSelectPayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<SuperState>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<SuperState>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_6);
    final Procedure1<PostAttributeChangePayload<SuperState>> _function_7 = (PostAttributeChangePayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<SuperState>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<SuperState>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_7);
    final Procedure1<PostCreatePayload<SuperState>> _function_8 = (PostCreatePayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<SuperState>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<SuperState>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_8);
    final Function1<PostDeletePayload<SuperState>, Runnable> _function_9 = (PostDeletePayload<SuperState> payload) -> {
      return SuperStateEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<SuperState>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<SuperState>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_9);
    final Procedure1<PostDoubleClickPayload<SuperState>> _function_10 = (PostDoubleClickPayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<SuperState>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<SuperState>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_10);
    final Procedure1<PostMovePayload<SuperState>> _function_11 = (PostMovePayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<SuperState>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<SuperState>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_11);
    final Procedure1<PostResizePayload<SuperState>> _function_12 = (PostResizePayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<SuperState>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<SuperState>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_12);
    final Procedure1<PostSelectPayload<SuperState>> _function_13 = (PostSelectPayload<SuperState> payload) -> {
      SuperStateEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<SuperState>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<SuperState>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_SuperState", _function_13);
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
  public final void preAttributeChange(final SuperState element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<SuperState> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends SuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<SuperState> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final SuperState element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<SuperState> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final SuperState element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<SuperState> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final SuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<SuperState> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final SuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<SuperState> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final SuperState element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<SuperState> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final SuperState element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<SuperState> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final SuperState element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<SuperState> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final SuperState element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<SuperState> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final SuperState element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<SuperState> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final SuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<SuperState> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final SuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<SuperState> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final SuperState element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<SuperState> it) {
    this.postSelect(it.getElement());
  }
}

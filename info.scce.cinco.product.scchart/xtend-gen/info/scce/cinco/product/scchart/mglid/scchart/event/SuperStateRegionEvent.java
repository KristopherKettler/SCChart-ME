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
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class SuperStateRegionEvent implements ContainerEvent<SuperStateRegion> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static SuperStateRegionEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected SuperStateRegionEvent() {
  }
  
  public static final SuperStateRegionEvent getInstance() {
    if ((SuperStateRegionEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.SuperStateRegionEvent _superStateRegionEvent = new info.scce.cinco.product.scchart.events.SuperStateRegionEvent();
      SuperStateRegionEvent.eventInstance = _superStateRegionEvent;
    }
    return SuperStateRegionEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<SuperStateRegion>> _function = (PreAttributeChangePayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<SuperStateRegion>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<SuperStateRegion>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function);
    final Procedure1<PreCreateNodePayload<SuperStateRegion>> _function_1 = (PreCreateNodePayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<SuperStateRegion>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_1);
    final Procedure1<PreDeletePayload<SuperStateRegion>> _function_2 = (PreDeletePayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<SuperStateRegion>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_2);
    final Procedure1<PreDoubleClickPayload<SuperStateRegion>> _function_3 = (PreDoubleClickPayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<SuperStateRegion>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_3);
    final Procedure1<PreMovePayload<SuperStateRegion>> _function_4 = (PreMovePayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<SuperStateRegion>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_4);
    final Procedure1<PreResizePayload<SuperStateRegion>> _function_5 = (PreResizePayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<SuperStateRegion>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_5);
    final Procedure1<PreSelectPayload<SuperStateRegion>> _function_6 = (PreSelectPayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<SuperStateRegion>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_6);
    final Procedure1<PostAttributeChangePayload<SuperStateRegion>> _function_7 = (PostAttributeChangePayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<SuperStateRegion>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_7);
    final Procedure1<PostCreatePayload<SuperStateRegion>> _function_8 = (PostCreatePayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<SuperStateRegion>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_8);
    final Function1<PostDeletePayload<SuperStateRegion>, Runnable> _function_9 = (PostDeletePayload<SuperStateRegion> payload) -> {
      return SuperStateRegionEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<SuperStateRegion>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<SuperStateRegion>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_9);
    final Procedure1<PostDoubleClickPayload<SuperStateRegion>> _function_10 = (PostDoubleClickPayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<SuperStateRegion>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_10);
    final Procedure1<PostMovePayload<SuperStateRegion>> _function_11 = (PostMovePayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<SuperStateRegion>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_11);
    final Procedure1<PostResizePayload<SuperStateRegion>> _function_12 = (PostResizePayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<SuperStateRegion>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_12);
    final Procedure1<PostSelectPayload<SuperStateRegion>> _function_13 = (PostSelectPayload<SuperStateRegion> payload) -> {
      SuperStateRegionEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<SuperStateRegion>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<SuperStateRegion>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion", _function_13);
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
  public final void preAttributeChange(final SuperStateRegion element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<SuperStateRegion> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends SuperStateRegion> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<SuperStateRegion> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final SuperStateRegion element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<SuperStateRegion> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final SuperStateRegion element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<SuperStateRegion> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final SuperStateRegion element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<SuperStateRegion> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final SuperStateRegion element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<SuperStateRegion> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final SuperStateRegion element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<SuperStateRegion> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final SuperStateRegion element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<SuperStateRegion> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final SuperStateRegion element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<SuperStateRegion> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final SuperStateRegion element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<SuperStateRegion> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final SuperStateRegion element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<SuperStateRegion> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final SuperStateRegion element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<SuperStateRegion> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final SuperStateRegion element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<SuperStateRegion> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final SuperStateRegion element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<SuperStateRegion> it) {
    this.postSelect(it.getElement());
  }
}

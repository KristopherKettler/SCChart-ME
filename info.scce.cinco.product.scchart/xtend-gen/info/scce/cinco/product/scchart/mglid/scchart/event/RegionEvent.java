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
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class RegionEvent implements ContainerEvent<Region> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static RegionEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected RegionEvent() {
  }
  
  public static final RegionEvent getInstance() {
    if ((RegionEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.RegionEvent _regionEvent = new info.scce.cinco.product.scchart.events.RegionEvent();
      RegionEvent.eventInstance = _regionEvent;
    }
    return RegionEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<Region>> _function = (PreAttributeChangePayload<Region> payload) -> {
      RegionEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<Region>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<Region>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Region", _function);
    final Procedure1<PreCreateNodePayload<Region>> _function_1 = (PreCreateNodePayload<Region> payload) -> {
      RegionEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<Region>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<Region>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_1);
    final Procedure1<PreDeletePayload<Region>> _function_2 = (PreDeletePayload<Region> payload) -> {
      RegionEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<Region>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<Region>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_2);
    final Procedure1<PreDoubleClickPayload<Region>> _function_3 = (PreDoubleClickPayload<Region> payload) -> {
      RegionEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<Region>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<Region>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_3);
    final Procedure1<PreMovePayload<Region>> _function_4 = (PreMovePayload<Region> payload) -> {
      RegionEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<Region>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<Region>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_4);
    final Procedure1<PreResizePayload<Region>> _function_5 = (PreResizePayload<Region> payload) -> {
      RegionEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<Region>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<Region>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_5);
    final Procedure1<PreSelectPayload<Region>> _function_6 = (PreSelectPayload<Region> payload) -> {
      RegionEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<Region>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<Region>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_6);
    final Procedure1<PostAttributeChangePayload<Region>> _function_7 = (PostAttributeChangePayload<Region> payload) -> {
      RegionEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<Region>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<Region>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_7);
    final Procedure1<PostCreatePayload<Region>> _function_8 = (PostCreatePayload<Region> payload) -> {
      RegionEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<Region>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<Region>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_8);
    final Function1<PostDeletePayload<Region>, Runnable> _function_9 = (PostDeletePayload<Region> payload) -> {
      return RegionEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<Region>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<Region>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_9);
    final Procedure1<PostDoubleClickPayload<Region>> _function_10 = (PostDoubleClickPayload<Region> payload) -> {
      RegionEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<Region>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<Region>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_10);
    final Procedure1<PostMovePayload<Region>> _function_11 = (PostMovePayload<Region> payload) -> {
      RegionEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<Region>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<Region>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_11);
    final Procedure1<PostResizePayload<Region>> _function_12 = (PostResizePayload<Region> payload) -> {
      RegionEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<Region>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<Region>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_12);
    final Procedure1<PostSelectPayload<Region>> _function_13 = (PostSelectPayload<Region> payload) -> {
      RegionEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<Region>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<Region>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_Region", _function_13);
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
  public final void preAttributeChange(final Region element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<Region> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends Region> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<Region> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final Region element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<Region> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final Region element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<Region> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final Region element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<Region> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final Region element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<Region> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final Region element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<Region> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final Region element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<Region> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final Region element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<Region> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final Region element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<Region> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final Region element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<Region> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final Region element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<Region> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final Region element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<Region> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final Region element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<Region> it) {
    this.postSelect(it.getElement());
  }
}

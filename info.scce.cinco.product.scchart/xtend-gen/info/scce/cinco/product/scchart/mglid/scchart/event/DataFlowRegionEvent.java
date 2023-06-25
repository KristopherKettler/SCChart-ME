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
import info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion;
import info.scce.cinco.product.scchart.mglid.scchart.event.RegionEvent;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public final class DataFlowRegionEvent implements ContainerEvent<DataFlowRegion> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static DataFlowRegionEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected DataFlowRegionEvent() {
  }
  
  public static final DataFlowRegionEvent getInstance() {
    if ((DataFlowRegionEvent.eventInstance == null)) {
      DataFlowRegionEvent _dataFlowRegionEvent = new DataFlowRegionEvent();
      DataFlowRegionEvent.eventInstance = _dataFlowRegionEvent;
    }
    return DataFlowRegionEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<DataFlowRegion>> _function = (PreAttributeChangePayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<DataFlowRegion>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<DataFlowRegion>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function);
    final Procedure1<PreCreateNodePayload<DataFlowRegion>> _function_1 = (PreCreateNodePayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<DataFlowRegion>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_1);
    final Procedure1<PreDeletePayload<DataFlowRegion>> _function_2 = (PreDeletePayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<DataFlowRegion>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_2);
    final Procedure1<PreDoubleClickPayload<DataFlowRegion>> _function_3 = (PreDoubleClickPayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<DataFlowRegion>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_3);
    final Procedure1<PreMovePayload<DataFlowRegion>> _function_4 = (PreMovePayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<DataFlowRegion>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_4);
    final Procedure1<PreResizePayload<DataFlowRegion>> _function_5 = (PreResizePayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<DataFlowRegion>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_5);
    final Procedure1<PreSelectPayload<DataFlowRegion>> _function_6 = (PreSelectPayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<DataFlowRegion>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_6);
    final Procedure1<PostAttributeChangePayload<DataFlowRegion>> _function_7 = (PostAttributeChangePayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<DataFlowRegion>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_7);
    final Procedure1<PostCreatePayload<DataFlowRegion>> _function_8 = (PostCreatePayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<DataFlowRegion>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_8);
    final Function1<PostDeletePayload<DataFlowRegion>, Runnable> _function_9 = (PostDeletePayload<DataFlowRegion> payload) -> {
      return DataFlowRegionEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<DataFlowRegion>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<DataFlowRegion>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_9);
    final Procedure1<PostDoubleClickPayload<DataFlowRegion>> _function_10 = (PostDoubleClickPayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<DataFlowRegion>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_10);
    final Procedure1<PostMovePayload<DataFlowRegion>> _function_11 = (PostMovePayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<DataFlowRegion>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_11);
    final Procedure1<PostResizePayload<DataFlowRegion>> _function_12 = (PostResizePayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<DataFlowRegion>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_12);
    final Procedure1<PostSelectPayload<DataFlowRegion>> _function_13 = (PostSelectPayload<DataFlowRegion> payload) -> {
      DataFlowRegionEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<DataFlowRegion>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<DataFlowRegion>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", _function_13);
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
  public final void preAttributeChange(final DataFlowRegion element, final String attribute, final Object newValue) {
    RegionEvent.getInstance().preAttributeChange(element, attribute, newValue);
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<DataFlowRegion> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends DataFlowRegion> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
    RegionEvent.getInstance().preCreate(elementClass, container, x, y, width, height);
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<DataFlowRegion> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final DataFlowRegion element) {
    RegionEvent.getInstance().preDelete(element);
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<DataFlowRegion> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final DataFlowRegion element) {
    RegionEvent.getInstance().preDoubleClick(element);
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<DataFlowRegion> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final DataFlowRegion element, final ModelElementContainer newContainer, final int newX, final int newY) {
    RegionEvent.getInstance().preMove(element, newContainer, newX, newY);
  }
  
  @Override
  public final void preMove(final PreMovePayload<DataFlowRegion> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final DataFlowRegion element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
    RegionEvent.getInstance().preResize(element, newWidth, newHeight, newX, newY, direction);
  }
  
  @Override
  public final void preResize(final PreResizePayload<DataFlowRegion> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final DataFlowRegion element) {
    RegionEvent.getInstance().preSelect(element);
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<DataFlowRegion> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final DataFlowRegion element, final String attribute, final Object oldValue) {
    RegionEvent.getInstance().postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<DataFlowRegion> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final DataFlowRegion element) {
    RegionEvent.getInstance().postCreate(element);
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<DataFlowRegion> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final DataFlowRegion element) {
    return RegionEvent.getInstance().postDelete(element);
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<DataFlowRegion> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final DataFlowRegion element) {
    RegionEvent.getInstance().postDoubleClick(element);
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<DataFlowRegion> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final DataFlowRegion element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
    RegionEvent.getInstance().postMove(element, oldContainer, oldX, oldY);
  }
  
  @Override
  public final void postMove(final PostMovePayload<DataFlowRegion> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final DataFlowRegion element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    RegionEvent.getInstance().postResize(element, oldWidth, oldHeight, oldX, oldY, direction);
  }
  
  @Override
  public final void postResize(final PostResizePayload<DataFlowRegion> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final DataFlowRegion element) {
    RegionEvent.getInstance().postSelect(element);
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<DataFlowRegion> it) {
    this.postSelect(it.getElement());
  }
}

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
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class SCChartRefereceEvent implements ContainerEvent<SCChartReferece> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static SCChartRefereceEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected SCChartRefereceEvent() {
  }
  
  public static final SCChartRefereceEvent getInstance() {
    if ((SCChartRefereceEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.SCChartRefereceEvent _sCChartRefereceEvent = new info.scce.cinco.product.scchart.events.SCChartRefereceEvent();
      SCChartRefereceEvent.eventInstance = _sCChartRefereceEvent;
    }
    return SCChartRefereceEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<SCChartReferece>> _function = (PreAttributeChangePayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<SCChartReferece>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<SCChartReferece>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function);
    final Procedure1<PreCreateNodePayload<SCChartReferece>> _function_1 = (PreCreateNodePayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<SCChartReferece>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<SCChartReferece>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_1);
    final Procedure1<PreDeletePayload<SCChartReferece>> _function_2 = (PreDeletePayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<SCChartReferece>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<SCChartReferece>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_2);
    final Procedure1<PreDoubleClickPayload<SCChartReferece>> _function_3 = (PreDoubleClickPayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<SCChartReferece>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<SCChartReferece>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_3);
    final Procedure1<PreMovePayload<SCChartReferece>> _function_4 = (PreMovePayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<SCChartReferece>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<SCChartReferece>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_4);
    final Procedure1<PreResizePayload<SCChartReferece>> _function_5 = (PreResizePayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<SCChartReferece>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<SCChartReferece>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_5);
    final Procedure1<PreSelectPayload<SCChartReferece>> _function_6 = (PreSelectPayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<SCChartReferece>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<SCChartReferece>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_6);
    final Procedure1<PostAttributeChangePayload<SCChartReferece>> _function_7 = (PostAttributeChangePayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<SCChartReferece>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<SCChartReferece>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_7);
    final Procedure1<PostCreatePayload<SCChartReferece>> _function_8 = (PostCreatePayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<SCChartReferece>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<SCChartReferece>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_8);
    final Function1<PostDeletePayload<SCChartReferece>, Runnable> _function_9 = (PostDeletePayload<SCChartReferece> payload) -> {
      return SCChartRefereceEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<SCChartReferece>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<SCChartReferece>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_9);
    final Procedure1<PostDoubleClickPayload<SCChartReferece>> _function_10 = (PostDoubleClickPayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<SCChartReferece>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<SCChartReferece>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_10);
    final Procedure1<PostMovePayload<SCChartReferece>> _function_11 = (PostMovePayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<SCChartReferece>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<SCChartReferece>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_11);
    final Procedure1<PostResizePayload<SCChartReferece>> _function_12 = (PostResizePayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<SCChartReferece>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<SCChartReferece>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_12);
    final Procedure1<PostSelectPayload<SCChartReferece>> _function_13 = (PostSelectPayload<SCChartReferece> payload) -> {
      SCChartRefereceEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<SCChartReferece>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<SCChartReferece>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", _function_13);
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
  public final void preAttributeChange(final SCChartReferece element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<SCChartReferece> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends SCChartReferece> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<SCChartReferece> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final SCChartReferece element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<SCChartReferece> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final SCChartReferece element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<SCChartReferece> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final SCChartReferece element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<SCChartReferece> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final SCChartReferece element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<SCChartReferece> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final SCChartReferece element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<SCChartReferece> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final SCChartReferece element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<SCChartReferece> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final SCChartReferece element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<SCChartReferece> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final SCChartReferece element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<SCChartReferece> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final SCChartReferece element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<SCChartReferece> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final SCChartReferece element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<SCChartReferece> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final SCChartReferece element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<SCChartReferece> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final SCChartReferece element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<SCChartReferece> it) {
    this.postSelect(it.getElement());
  }
}

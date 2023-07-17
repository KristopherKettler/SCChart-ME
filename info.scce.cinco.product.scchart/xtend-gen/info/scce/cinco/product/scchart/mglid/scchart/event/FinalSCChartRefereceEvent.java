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
import info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.event.SCChartRefereceEvent;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public final class FinalSCChartRefereceEvent implements ContainerEvent<FinalSCChartReferece> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static FinalSCChartRefereceEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected FinalSCChartRefereceEvent() {
  }
  
  public static final FinalSCChartRefereceEvent getInstance() {
    if ((FinalSCChartRefereceEvent.eventInstance == null)) {
      FinalSCChartRefereceEvent _finalSCChartRefereceEvent = new FinalSCChartRefereceEvent();
      FinalSCChartRefereceEvent.eventInstance = _finalSCChartRefereceEvent;
    }
    return FinalSCChartRefereceEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<FinalSCChartReferece>> _function = (PreAttributeChangePayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function);
    final Procedure1<PreCreateNodePayload<FinalSCChartReferece>> _function_1 = (PreCreateNodePayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_1);
    final Procedure1<PreDeletePayload<FinalSCChartReferece>> _function_2 = (PreDeletePayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_2);
    final Procedure1<PreDoubleClickPayload<FinalSCChartReferece>> _function_3 = (PreDoubleClickPayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_3);
    final Procedure1<PreMovePayload<FinalSCChartReferece>> _function_4 = (PreMovePayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_4);
    final Procedure1<PreResizePayload<FinalSCChartReferece>> _function_5 = (PreResizePayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_5);
    final Procedure1<PreSelectPayload<FinalSCChartReferece>> _function_6 = (PreSelectPayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_6);
    final Procedure1<PostAttributeChangePayload<FinalSCChartReferece>> _function_7 = (PostAttributeChangePayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_7);
    final Procedure1<PostCreatePayload<FinalSCChartReferece>> _function_8 = (PostCreatePayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_8);
    final Function1<PostDeletePayload<FinalSCChartReferece>, Runnable> _function_9 = (PostDeletePayload<FinalSCChartReferece> payload) -> {
      return FinalSCChartRefereceEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<FinalSCChartReferece>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<FinalSCChartReferece>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_9);
    final Procedure1<PostDoubleClickPayload<FinalSCChartReferece>> _function_10 = (PostDoubleClickPayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_10);
    final Procedure1<PostMovePayload<FinalSCChartReferece>> _function_11 = (PostMovePayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_11);
    final Procedure1<PostResizePayload<FinalSCChartReferece>> _function_12 = (PostResizePayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_12);
    final Procedure1<PostSelectPayload<FinalSCChartReferece>> _function_13 = (PostSelectPayload<FinalSCChartReferece> payload) -> {
      FinalSCChartRefereceEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<FinalSCChartReferece>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<FinalSCChartReferece>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", _function_13);
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
  public final void preAttributeChange(final FinalSCChartReferece element, final String attribute, final Object newValue) {
    SCChartRefereceEvent.getInstance().preAttributeChange(element, attribute, newValue);
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<FinalSCChartReferece> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends FinalSCChartReferece> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
    SCChartRefereceEvent.getInstance().preCreate(elementClass, container, x, y, width, height);
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<FinalSCChartReferece> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final FinalSCChartReferece element) {
    SCChartRefereceEvent.getInstance().preDelete(element);
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<FinalSCChartReferece> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final FinalSCChartReferece element) {
    SCChartRefereceEvent.getInstance().preDoubleClick(element);
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<FinalSCChartReferece> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final FinalSCChartReferece element, final ModelElementContainer newContainer, final int newX, final int newY) {
    SCChartRefereceEvent.getInstance().preMove(element, newContainer, newX, newY);
  }
  
  @Override
  public final void preMove(final PreMovePayload<FinalSCChartReferece> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final FinalSCChartReferece element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
    SCChartRefereceEvent.getInstance().preResize(element, newWidth, newHeight, newX, newY, direction);
  }
  
  @Override
  public final void preResize(final PreResizePayload<FinalSCChartReferece> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final FinalSCChartReferece element) {
    SCChartRefereceEvent.getInstance().preSelect(element);
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<FinalSCChartReferece> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final FinalSCChartReferece element, final String attribute, final Object oldValue) {
    SCChartRefereceEvent.getInstance().postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<FinalSCChartReferece> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final FinalSCChartReferece element) {
    SCChartRefereceEvent.getInstance().postCreate(element);
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<FinalSCChartReferece> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final FinalSCChartReferece element) {
    return SCChartRefereceEvent.getInstance().postDelete(element);
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<FinalSCChartReferece> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final FinalSCChartReferece element) {
    SCChartRefereceEvent.getInstance().postDoubleClick(element);
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<FinalSCChartReferece> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final FinalSCChartReferece element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
    SCChartRefereceEvent.getInstance().postMove(element, oldContainer, oldX, oldY);
  }
  
  @Override
  public final void postMove(final PostMovePayload<FinalSCChartReferece> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final FinalSCChartReferece element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    SCChartRefereceEvent.getInstance().postResize(element, oldWidth, oldHeight, oldX, oldY, direction);
  }
  
  @Override
  public final void postResize(final PostResizePayload<FinalSCChartReferece> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final FinalSCChartReferece element) {
    SCChartRefereceEvent.getInstance().postSelect(element);
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<FinalSCChartReferece> it) {
    this.postSelect(it.getElement());
  }
}

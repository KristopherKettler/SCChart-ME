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
import info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.event.SCChartRefereceEvent;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public final class InitialSCChartRefereceEvent implements ContainerEvent<InitialSCChartReferece> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static InitialSCChartRefereceEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected InitialSCChartRefereceEvent() {
  }
  
  public static final InitialSCChartRefereceEvent getInstance() {
    if ((InitialSCChartRefereceEvent.eventInstance == null)) {
      InitialSCChartRefereceEvent _initialSCChartRefereceEvent = new InitialSCChartRefereceEvent();
      InitialSCChartRefereceEvent.eventInstance = _initialSCChartRefereceEvent;
    }
    return InitialSCChartRefereceEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<InitialSCChartReferece>> _function = (PreAttributeChangePayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function);
    final Procedure1<PreCreateNodePayload<InitialSCChartReferece>> _function_1 = (PreCreateNodePayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_1);
    final Procedure1<PreDeletePayload<InitialSCChartReferece>> _function_2 = (PreDeletePayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_2);
    final Procedure1<PreDoubleClickPayload<InitialSCChartReferece>> _function_3 = (PreDoubleClickPayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_3);
    final Procedure1<PreMovePayload<InitialSCChartReferece>> _function_4 = (PreMovePayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_4);
    final Procedure1<PreResizePayload<InitialSCChartReferece>> _function_5 = (PreResizePayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_5);
    final Procedure1<PreSelectPayload<InitialSCChartReferece>> _function_6 = (PreSelectPayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_6);
    final Procedure1<PostAttributeChangePayload<InitialSCChartReferece>> _function_7 = (PostAttributeChangePayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_7);
    final Procedure1<PostCreatePayload<InitialSCChartReferece>> _function_8 = (PostCreatePayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_8);
    final Function1<PostDeletePayload<InitialSCChartReferece>, Runnable> _function_9 = (PostDeletePayload<InitialSCChartReferece> payload) -> {
      return InitialSCChartRefereceEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<InitialSCChartReferece>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<InitialSCChartReferece>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_9);
    final Procedure1<PostDoubleClickPayload<InitialSCChartReferece>> _function_10 = (PostDoubleClickPayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_10);
    final Procedure1<PostMovePayload<InitialSCChartReferece>> _function_11 = (PostMovePayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_11);
    final Procedure1<PostResizePayload<InitialSCChartReferece>> _function_12 = (PostResizePayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_12);
    final Procedure1<PostSelectPayload<InitialSCChartReferece>> _function_13 = (PostSelectPayload<InitialSCChartReferece> payload) -> {
      InitialSCChartRefereceEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<InitialSCChartReferece>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<InitialSCChartReferece>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", _function_13);
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
  public final void preAttributeChange(final InitialSCChartReferece element, final String attribute, final Object newValue) {
    SCChartRefereceEvent.getInstance().preAttributeChange(element, attribute, newValue);
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<InitialSCChartReferece> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends InitialSCChartReferece> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
    SCChartRefereceEvent.getInstance().preCreate(elementClass, container, x, y, width, height);
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<InitialSCChartReferece> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final InitialSCChartReferece element) {
    SCChartRefereceEvent.getInstance().preDelete(element);
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<InitialSCChartReferece> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final InitialSCChartReferece element) {
    SCChartRefereceEvent.getInstance().preDoubleClick(element);
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<InitialSCChartReferece> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final InitialSCChartReferece element, final ModelElementContainer newContainer, final int newX, final int newY) {
    SCChartRefereceEvent.getInstance().preMove(element, newContainer, newX, newY);
  }
  
  @Override
  public final void preMove(final PreMovePayload<InitialSCChartReferece> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final InitialSCChartReferece element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
    SCChartRefereceEvent.getInstance().preResize(element, newWidth, newHeight, newX, newY, direction);
  }
  
  @Override
  public final void preResize(final PreResizePayload<InitialSCChartReferece> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final InitialSCChartReferece element) {
    SCChartRefereceEvent.getInstance().preSelect(element);
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<InitialSCChartReferece> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final InitialSCChartReferece element, final String attribute, final Object oldValue) {
    SCChartRefereceEvent.getInstance().postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<InitialSCChartReferece> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final InitialSCChartReferece element) {
    SCChartRefereceEvent.getInstance().postCreate(element);
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<InitialSCChartReferece> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final InitialSCChartReferece element) {
    return SCChartRefereceEvent.getInstance().postDelete(element);
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<InitialSCChartReferece> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final InitialSCChartReferece element) {
    SCChartRefereceEvent.getInstance().postDoubleClick(element);
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<InitialSCChartReferece> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final InitialSCChartReferece element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
    SCChartRefereceEvent.getInstance().postMove(element, oldContainer, oldX, oldY);
  }
  
  @Override
  public final void postMove(final PostMovePayload<InitialSCChartReferece> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final InitialSCChartReferece element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    SCChartRefereceEvent.getInstance().postResize(element, oldWidth, oldHeight, oldX, oldY, direction);
  }
  
  @Override
  public final void postResize(final PostResizePayload<InitialSCChartReferece> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final InitialSCChartReferece element) {
    SCChartRefereceEvent.getInstance().postSelect(element);
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<InitialSCChartReferece> it) {
    this.postSelect(it.getElement());
  }
}

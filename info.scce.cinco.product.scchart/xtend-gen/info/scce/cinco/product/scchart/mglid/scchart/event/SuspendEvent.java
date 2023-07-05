package info.scce.cinco.product.scchart.mglid.scchart.event;

import de.jabc.cinco.meta.core.event.hub.Subscriber;
import de.jabc.cinco.meta.core.event.hub.impl.PayloadSubscriber;
import de.jabc.cinco.meta.plugin.event.api.event.NodeEvent;
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
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class SuspendEvent implements NodeEvent<Suspend> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static SuspendEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected SuspendEvent() {
  }
  
  public static final SuspendEvent getInstance() {
    if ((SuspendEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.SuspendEvent _suspendEvent = new info.scce.cinco.product.scchart.events.SuspendEvent();
      SuspendEvent.eventInstance = _suspendEvent;
    }
    return SuspendEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<Suspend>> _function = (PreAttributeChangePayload<Suspend> payload) -> {
      SuspendEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<Suspend>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<Suspend>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function);
    final Procedure1<PreCreateNodePayload<Suspend>> _function_1 = (PreCreateNodePayload<Suspend> payload) -> {
      SuspendEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<Suspend>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<Suspend>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_1);
    final Procedure1<PreDeletePayload<Suspend>> _function_2 = (PreDeletePayload<Suspend> payload) -> {
      SuspendEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<Suspend>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<Suspend>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_2);
    final Procedure1<PreDoubleClickPayload<Suspend>> _function_3 = (PreDoubleClickPayload<Suspend> payload) -> {
      SuspendEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<Suspend>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<Suspend>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_3);
    final Procedure1<PreMovePayload<Suspend>> _function_4 = (PreMovePayload<Suspend> payload) -> {
      SuspendEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<Suspend>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<Suspend>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_4);
    final Procedure1<PreResizePayload<Suspend>> _function_5 = (PreResizePayload<Suspend> payload) -> {
      SuspendEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<Suspend>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<Suspend>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_5);
    final Procedure1<PreSelectPayload<Suspend>> _function_6 = (PreSelectPayload<Suspend> payload) -> {
      SuspendEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<Suspend>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<Suspend>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_6);
    final Procedure1<PostAttributeChangePayload<Suspend>> _function_7 = (PostAttributeChangePayload<Suspend> payload) -> {
      SuspendEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<Suspend>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<Suspend>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_7);
    final Procedure1<PostCreatePayload<Suspend>> _function_8 = (PostCreatePayload<Suspend> payload) -> {
      SuspendEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<Suspend>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<Suspend>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_8);
    final Function1<PostDeletePayload<Suspend>, Runnable> _function_9 = (PostDeletePayload<Suspend> payload) -> {
      return SuspendEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<Suspend>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<Suspend>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_9);
    final Procedure1<PostDoubleClickPayload<Suspend>> _function_10 = (PostDoubleClickPayload<Suspend> payload) -> {
      SuspendEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<Suspend>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<Suspend>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_10);
    final Procedure1<PostMovePayload<Suspend>> _function_11 = (PostMovePayload<Suspend> payload) -> {
      SuspendEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<Suspend>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<Suspend>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_11);
    final Procedure1<PostResizePayload<Suspend>> _function_12 = (PostResizePayload<Suspend> payload) -> {
      SuspendEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<Suspend>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<Suspend>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_12);
    final Procedure1<PostSelectPayload<Suspend>> _function_13 = (PostSelectPayload<Suspend> payload) -> {
      SuspendEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<Suspend>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<Suspend>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_Suspend", _function_13);
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
  public final void preAttributeChange(final Suspend element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<Suspend> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends Suspend> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<Suspend> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final Suspend element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<Suspend> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final Suspend element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<Suspend> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final Suspend element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<Suspend> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final Suspend element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<Suspend> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final Suspend element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<Suspend> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final Suspend element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<Suspend> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final Suspend element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<Suspend> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final Suspend element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<Suspend> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final Suspend element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<Suspend> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final Suspend element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<Suspend> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final Suspend element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<Suspend> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final Suspend element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<Suspend> it) {
    this.postSelect(it.getElement());
  }
}

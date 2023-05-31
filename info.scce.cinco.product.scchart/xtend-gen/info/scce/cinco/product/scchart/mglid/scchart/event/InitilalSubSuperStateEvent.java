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
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.event.SubSuperStateEvent;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class InitilalSubSuperStateEvent implements ContainerEvent<InitilalSubSuperState> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static InitilalSubSuperStateEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected InitilalSubSuperStateEvent() {
  }
  
  public static final InitilalSubSuperStateEvent getInstance() {
    if ((InitilalSubSuperStateEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.InitilalSubSuperStateEvent _initilalSubSuperStateEvent = new info.scce.cinco.product.scchart.events.InitilalSubSuperStateEvent();
      InitilalSubSuperStateEvent.eventInstance = _initilalSubSuperStateEvent;
    }
    return InitilalSubSuperStateEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<InitilalSubSuperState>> _function = (PreAttributeChangePayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function);
    final Procedure1<PreCreateNodePayload<InitilalSubSuperState>> _function_1 = (PreCreateNodePayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_1);
    final Procedure1<PreDeletePayload<InitilalSubSuperState>> _function_2 = (PreDeletePayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_2);
    final Procedure1<PreDoubleClickPayload<InitilalSubSuperState>> _function_3 = (PreDoubleClickPayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_3);
    final Procedure1<PreMovePayload<InitilalSubSuperState>> _function_4 = (PreMovePayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_4);
    final Procedure1<PreResizePayload<InitilalSubSuperState>> _function_5 = (PreResizePayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_5);
    final Procedure1<PreSelectPayload<InitilalSubSuperState>> _function_6 = (PreSelectPayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_6);
    final Procedure1<PostAttributeChangePayload<InitilalSubSuperState>> _function_7 = (PostAttributeChangePayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_7);
    final Procedure1<PostCreatePayload<InitilalSubSuperState>> _function_8 = (PostCreatePayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_8);
    final Function1<PostDeletePayload<InitilalSubSuperState>, Runnable> _function_9 = (PostDeletePayload<InitilalSubSuperState> payload) -> {
      return InitilalSubSuperStateEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<InitilalSubSuperState>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<InitilalSubSuperState>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_9);
    final Procedure1<PostDoubleClickPayload<InitilalSubSuperState>> _function_10 = (PostDoubleClickPayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_10);
    final Procedure1<PostMovePayload<InitilalSubSuperState>> _function_11 = (PostMovePayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_11);
    final Procedure1<PostResizePayload<InitilalSubSuperState>> _function_12 = (PostResizePayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_12);
    final Procedure1<PostSelectPayload<InitilalSubSuperState>> _function_13 = (PostSelectPayload<InitilalSubSuperState> payload) -> {
      InitilalSubSuperStateEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<InitilalSubSuperState>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<InitilalSubSuperState>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState", _function_13);
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
  public final void preAttributeChange(final InitilalSubSuperState element, final String attribute, final Object newValue) {
    SubSuperStateEvent.getInstance().preAttributeChange(element, attribute, newValue);
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<InitilalSubSuperState> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends InitilalSubSuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
    SubSuperStateEvent.getInstance().preCreate(elementClass, container, x, y, width, height);
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<InitilalSubSuperState> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final InitilalSubSuperState element) {
    SubSuperStateEvent.getInstance().preDelete(element);
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<InitilalSubSuperState> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final InitilalSubSuperState element) {
    SubSuperStateEvent.getInstance().preDoubleClick(element);
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<InitilalSubSuperState> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final InitilalSubSuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
    SubSuperStateEvent.getInstance().preMove(element, newContainer, newX, newY);
  }
  
  @Override
  public final void preMove(final PreMovePayload<InitilalSubSuperState> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final InitilalSubSuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
    SubSuperStateEvent.getInstance().preResize(element, newWidth, newHeight, newX, newY, direction);
  }
  
  @Override
  public final void preResize(final PreResizePayload<InitilalSubSuperState> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final InitilalSubSuperState element) {
    SubSuperStateEvent.getInstance().preSelect(element);
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<InitilalSubSuperState> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final InitilalSubSuperState element, final String attribute, final Object oldValue) {
    SubSuperStateEvent.getInstance().postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<InitilalSubSuperState> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final InitilalSubSuperState element) {
    SubSuperStateEvent.getInstance().postCreate(element);
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<InitilalSubSuperState> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final InitilalSubSuperState element) {
    return SubSuperStateEvent.getInstance().postDelete(element);
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<InitilalSubSuperState> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final InitilalSubSuperState element) {
    SubSuperStateEvent.getInstance().postDoubleClick(element);
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<InitilalSubSuperState> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final InitilalSubSuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
    SubSuperStateEvent.getInstance().postMove(element, oldContainer, oldX, oldY);
  }
  
  @Override
  public final void postMove(final PostMovePayload<InitilalSubSuperState> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final InitilalSubSuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    SubSuperStateEvent.getInstance().postResize(element, oldWidth, oldHeight, oldX, oldY, direction);
  }
  
  @Override
  public final void postResize(final PostResizePayload<InitilalSubSuperState> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final InitilalSubSuperState element) {
    SubSuperStateEvent.getInstance().postSelect(element);
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<InitilalSubSuperState> it) {
    this.postSelect(it.getElement());
  }
}

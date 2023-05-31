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
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class RootStateEvent implements ContainerEvent<RootState> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static RootStateEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected RootStateEvent() {
  }
  
  public static final RootStateEvent getInstance() {
    if ((RootStateEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.RootStateEvent _rootStateEvent = new info.scce.cinco.product.scchart.events.RootStateEvent();
      RootStateEvent.eventInstance = _rootStateEvent;
    }
    return RootStateEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<RootState>> _function = (PreAttributeChangePayload<RootState> payload) -> {
      RootStateEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<RootState>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<RootState>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function);
    final Procedure1<PreCreateNodePayload<RootState>> _function_1 = (PreCreateNodePayload<RootState> payload) -> {
      RootStateEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<RootState>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<RootState>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_1);
    final Procedure1<PreDeletePayload<RootState>> _function_2 = (PreDeletePayload<RootState> payload) -> {
      RootStateEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<RootState>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<RootState>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_2);
    final Procedure1<PreDoubleClickPayload<RootState>> _function_3 = (PreDoubleClickPayload<RootState> payload) -> {
      RootStateEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<RootState>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<RootState>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_3);
    final Procedure1<PreMovePayload<RootState>> _function_4 = (PreMovePayload<RootState> payload) -> {
      RootStateEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<RootState>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<RootState>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_4);
    final Procedure1<PreResizePayload<RootState>> _function_5 = (PreResizePayload<RootState> payload) -> {
      RootStateEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<RootState>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<RootState>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_5);
    final Procedure1<PreSelectPayload<RootState>> _function_6 = (PreSelectPayload<RootState> payload) -> {
      RootStateEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<RootState>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<RootState>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_6);
    final Procedure1<PostAttributeChangePayload<RootState>> _function_7 = (PostAttributeChangePayload<RootState> payload) -> {
      RootStateEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<RootState>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<RootState>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_7);
    final Procedure1<PostCreatePayload<RootState>> _function_8 = (PostCreatePayload<RootState> payload) -> {
      RootStateEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<RootState>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<RootState>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_8);
    final Function1<PostDeletePayload<RootState>, Runnable> _function_9 = (PostDeletePayload<RootState> payload) -> {
      return RootStateEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<RootState>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<RootState>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_9);
    final Procedure1<PostDoubleClickPayload<RootState>> _function_10 = (PostDoubleClickPayload<RootState> payload) -> {
      RootStateEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<RootState>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<RootState>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_10);
    final Procedure1<PostMovePayload<RootState>> _function_11 = (PostMovePayload<RootState> payload) -> {
      RootStateEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<RootState>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<RootState>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_11);
    final Procedure1<PostResizePayload<RootState>> _function_12 = (PostResizePayload<RootState> payload) -> {
      RootStateEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<RootState>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<RootState>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_12);
    final Procedure1<PostSelectPayload<RootState>> _function_13 = (PostSelectPayload<RootState> payload) -> {
      RootStateEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<RootState>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<RootState>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_RootState", _function_13);
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
  public final void preAttributeChange(final RootState element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<RootState> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends RootState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<RootState> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final RootState element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<RootState> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final RootState element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<RootState> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final RootState element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<RootState> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final RootState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<RootState> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final RootState element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<RootState> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final RootState element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<RootState> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final RootState element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<RootState> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final RootState element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<RootState> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final RootState element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<RootState> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final RootState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<RootState> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final RootState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<RootState> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final RootState element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<RootState> it) {
    this.postSelect(it.getElement());
  }
}

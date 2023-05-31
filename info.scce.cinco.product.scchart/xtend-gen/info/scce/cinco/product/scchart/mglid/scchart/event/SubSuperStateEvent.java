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
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperState;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class SubSuperStateEvent implements ContainerEvent<SubSuperState> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static SubSuperStateEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected SubSuperStateEvent() {
  }
  
  public static final SubSuperStateEvent getInstance() {
    if ((SubSuperStateEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.SubSuperStateEvent _subSuperStateEvent = new info.scce.cinco.product.scchart.events.SubSuperStateEvent();
      SubSuperStateEvent.eventInstance = _subSuperStateEvent;
    }
    return SubSuperStateEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<SubSuperState>> _function = (PreAttributeChangePayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<SubSuperState>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<SubSuperState>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function);
    final Procedure1<PreCreateNodePayload<SubSuperState>> _function_1 = (PreCreateNodePayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<SubSuperState>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<SubSuperState>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_1);
    final Procedure1<PreDeletePayload<SubSuperState>> _function_2 = (PreDeletePayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<SubSuperState>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<SubSuperState>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_2);
    final Procedure1<PreDoubleClickPayload<SubSuperState>> _function_3 = (PreDoubleClickPayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<SubSuperState>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<SubSuperState>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_3);
    final Procedure1<PreMovePayload<SubSuperState>> _function_4 = (PreMovePayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<SubSuperState>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<SubSuperState>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_4);
    final Procedure1<PreResizePayload<SubSuperState>> _function_5 = (PreResizePayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<SubSuperState>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<SubSuperState>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_5);
    final Procedure1<PreSelectPayload<SubSuperState>> _function_6 = (PreSelectPayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<SubSuperState>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<SubSuperState>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_6);
    final Procedure1<PostAttributeChangePayload<SubSuperState>> _function_7 = (PostAttributeChangePayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<SubSuperState>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<SubSuperState>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_7);
    final Procedure1<PostCreatePayload<SubSuperState>> _function_8 = (PostCreatePayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<SubSuperState>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<SubSuperState>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_8);
    final Function1<PostDeletePayload<SubSuperState>, Runnable> _function_9 = (PostDeletePayload<SubSuperState> payload) -> {
      return SubSuperStateEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<SubSuperState>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<SubSuperState>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_9);
    final Procedure1<PostDoubleClickPayload<SubSuperState>> _function_10 = (PostDoubleClickPayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<SubSuperState>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<SubSuperState>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_10);
    final Procedure1<PostMovePayload<SubSuperState>> _function_11 = (PostMovePayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<SubSuperState>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<SubSuperState>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_11);
    final Procedure1<PostResizePayload<SubSuperState>> _function_12 = (PostResizePayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<SubSuperState>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<SubSuperState>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_12);
    final Procedure1<PostSelectPayload<SubSuperState>> _function_13 = (PostSelectPayload<SubSuperState> payload) -> {
      SubSuperStateEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<SubSuperState>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<SubSuperState>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState", _function_13);
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
  public final void preAttributeChange(final SubSuperState element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<SubSuperState> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends SubSuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<SubSuperState> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final SubSuperState element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<SubSuperState> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final SubSuperState element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<SubSuperState> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final SubSuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<SubSuperState> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final SubSuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<SubSuperState> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final SubSuperState element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<SubSuperState> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final SubSuperState element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<SubSuperState> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final SubSuperState element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<SubSuperState> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final SubSuperState element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<SubSuperState> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final SubSuperState element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<SubSuperState> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final SubSuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<SubSuperState> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final SubSuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<SubSuperState> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final SubSuperState element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<SubSuperState> it) {
    this.postSelect(it.getElement());
  }
}

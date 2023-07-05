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
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class SuperStateDeclarationEvent implements NodeEvent<SuperStateDeclaration> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static SuperStateDeclarationEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected SuperStateDeclarationEvent() {
  }
  
  public static final SuperStateDeclarationEvent getInstance() {
    if ((SuperStateDeclarationEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.SuperStateDeclarationEvent _superStateDeclarationEvent = new info.scce.cinco.product.scchart.events.SuperStateDeclarationEvent();
      SuperStateDeclarationEvent.eventInstance = _superStateDeclarationEvent;
    }
    return SuperStateDeclarationEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<SuperStateDeclaration>> _function = (PreAttributeChangePayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function);
    final Procedure1<PreCreateNodePayload<SuperStateDeclaration>> _function_1 = (PreCreateNodePayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_1);
    final Procedure1<PreDeletePayload<SuperStateDeclaration>> _function_2 = (PreDeletePayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_2);
    final Procedure1<PreDoubleClickPayload<SuperStateDeclaration>> _function_3 = (PreDoubleClickPayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_3);
    final Procedure1<PreMovePayload<SuperStateDeclaration>> _function_4 = (PreMovePayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_4);
    final Procedure1<PreResizePayload<SuperStateDeclaration>> _function_5 = (PreResizePayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_5);
    final Procedure1<PreSelectPayload<SuperStateDeclaration>> _function_6 = (PreSelectPayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_6);
    final Procedure1<PostAttributeChangePayload<SuperStateDeclaration>> _function_7 = (PostAttributeChangePayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_7);
    final Procedure1<PostCreatePayload<SuperStateDeclaration>> _function_8 = (PostCreatePayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_8);
    final Function1<PostDeletePayload<SuperStateDeclaration>, Runnable> _function_9 = (PostDeletePayload<SuperStateDeclaration> payload) -> {
      return SuperStateDeclarationEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<SuperStateDeclaration>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<SuperStateDeclaration>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_9);
    final Procedure1<PostDoubleClickPayload<SuperStateDeclaration>> _function_10 = (PostDoubleClickPayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_10);
    final Procedure1<PostMovePayload<SuperStateDeclaration>> _function_11 = (PostMovePayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_11);
    final Procedure1<PostResizePayload<SuperStateDeclaration>> _function_12 = (PostResizePayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_12);
    final Procedure1<PostSelectPayload<SuperStateDeclaration>> _function_13 = (PostSelectPayload<SuperStateDeclaration> payload) -> {
      SuperStateDeclarationEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<SuperStateDeclaration>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<SuperStateDeclaration>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration", _function_13);
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
  public final void preAttributeChange(final SuperStateDeclaration element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<SuperStateDeclaration> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends SuperStateDeclaration> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<SuperStateDeclaration> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final SuperStateDeclaration element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<SuperStateDeclaration> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final SuperStateDeclaration element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<SuperStateDeclaration> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final SuperStateDeclaration element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<SuperStateDeclaration> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final SuperStateDeclaration element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<SuperStateDeclaration> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final SuperStateDeclaration element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<SuperStateDeclaration> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final SuperStateDeclaration element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<SuperStateDeclaration> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final SuperStateDeclaration element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<SuperStateDeclaration> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final SuperStateDeclaration element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<SuperStateDeclaration> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final SuperStateDeclaration element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<SuperStateDeclaration> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final SuperStateDeclaration element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<SuperStateDeclaration> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final SuperStateDeclaration element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<SuperStateDeclaration> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final SuperStateDeclaration element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<SuperStateDeclaration> it) {
    this.postSelect(it.getElement());
  }
}

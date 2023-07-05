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
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class RootStateDeclarationEvent implements NodeEvent<RootStateDeclaration> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static RootStateDeclarationEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected RootStateDeclarationEvent() {
  }
  
  public static final RootStateDeclarationEvent getInstance() {
    if ((RootStateDeclarationEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.RootStateDeclarationEvent _rootStateDeclarationEvent = new info.scce.cinco.product.scchart.events.RootStateDeclarationEvent();
      RootStateDeclarationEvent.eventInstance = _rootStateDeclarationEvent;
    }
    return RootStateDeclarationEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<RootStateDeclaration>> _function = (PreAttributeChangePayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<RootStateDeclaration>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function);
    final Procedure1<PreCreateNodePayload<RootStateDeclaration>> _function_1 = (PreCreateNodePayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<RootStateDeclaration>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_1);
    final Procedure1<PreDeletePayload<RootStateDeclaration>> _function_2 = (PreDeletePayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<RootStateDeclaration>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_2);
    final Procedure1<PreDoubleClickPayload<RootStateDeclaration>> _function_3 = (PreDoubleClickPayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<RootStateDeclaration>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_3);
    final Procedure1<PreMovePayload<RootStateDeclaration>> _function_4 = (PreMovePayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<RootStateDeclaration>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_4);
    final Procedure1<PreResizePayload<RootStateDeclaration>> _function_5 = (PreResizePayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<RootStateDeclaration>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_5);
    final Procedure1<PreSelectPayload<RootStateDeclaration>> _function_6 = (PreSelectPayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<RootStateDeclaration>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_6);
    final Procedure1<PostAttributeChangePayload<RootStateDeclaration>> _function_7 = (PostAttributeChangePayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<RootStateDeclaration>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_7);
    final Procedure1<PostCreatePayload<RootStateDeclaration>> _function_8 = (PostCreatePayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<RootStateDeclaration>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_8);
    final Function1<PostDeletePayload<RootStateDeclaration>, Runnable> _function_9 = (PostDeletePayload<RootStateDeclaration> payload) -> {
      return RootStateDeclarationEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<RootStateDeclaration>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<RootStateDeclaration>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_9);
    final Procedure1<PostDoubleClickPayload<RootStateDeclaration>> _function_10 = (PostDoubleClickPayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<RootStateDeclaration>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_10);
    final Procedure1<PostMovePayload<RootStateDeclaration>> _function_11 = (PostMovePayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<RootStateDeclaration>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_11);
    final Procedure1<PostResizePayload<RootStateDeclaration>> _function_12 = (PostResizePayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<RootStateDeclaration>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_12);
    final Procedure1<PostSelectPayload<RootStateDeclaration>> _function_13 = (PostSelectPayload<RootStateDeclaration> payload) -> {
      RootStateDeclarationEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<RootStateDeclaration>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<RootStateDeclaration>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", _function_13);
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
  public final void preAttributeChange(final RootStateDeclaration element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<RootStateDeclaration> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends RootStateDeclaration> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<RootStateDeclaration> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final RootStateDeclaration element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<RootStateDeclaration> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final RootStateDeclaration element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<RootStateDeclaration> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final RootStateDeclaration element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<RootStateDeclaration> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final RootStateDeclaration element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<RootStateDeclaration> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final RootStateDeclaration element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<RootStateDeclaration> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final RootStateDeclaration element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<RootStateDeclaration> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final RootStateDeclaration element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<RootStateDeclaration> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final RootStateDeclaration element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<RootStateDeclaration> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final RootStateDeclaration element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<RootStateDeclaration> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final RootStateDeclaration element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<RootStateDeclaration> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final RootStateDeclaration element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<RootStateDeclaration> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final RootStateDeclaration element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<RootStateDeclaration> it) {
    this.postSelect(it.getElement());
  }
}

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
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class DeclarationEvent implements NodeEvent<Declaration> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static DeclarationEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected DeclarationEvent() {
  }
  
  public static final DeclarationEvent getInstance() {
    if ((DeclarationEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.DeclarationEvent _declarationEvent = new info.scce.cinco.product.scchart.events.DeclarationEvent();
      DeclarationEvent.eventInstance = _declarationEvent;
    }
    return DeclarationEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<Declaration>> _function = (PreAttributeChangePayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<Declaration>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<Declaration>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function);
    final Procedure1<PreCreateNodePayload<Declaration>> _function_1 = (PreCreateNodePayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<Declaration>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<Declaration>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_1);
    final Procedure1<PreDeletePayload<Declaration>> _function_2 = (PreDeletePayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<Declaration>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<Declaration>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_2);
    final Procedure1<PreDoubleClickPayload<Declaration>> _function_3 = (PreDoubleClickPayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<Declaration>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<Declaration>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_3);
    final Procedure1<PreMovePayload<Declaration>> _function_4 = (PreMovePayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<Declaration>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<Declaration>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_4);
    final Procedure1<PreResizePayload<Declaration>> _function_5 = (PreResizePayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<Declaration>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<Declaration>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_5);
    final Procedure1<PreSelectPayload<Declaration>> _function_6 = (PreSelectPayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<Declaration>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<Declaration>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_6);
    final Procedure1<PostAttributeChangePayload<Declaration>> _function_7 = (PostAttributeChangePayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<Declaration>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<Declaration>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_7);
    final Procedure1<PostCreatePayload<Declaration>> _function_8 = (PostCreatePayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<Declaration>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<Declaration>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_8);
    final Function1<PostDeletePayload<Declaration>, Runnable> _function_9 = (PostDeletePayload<Declaration> payload) -> {
      return DeclarationEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<Declaration>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<Declaration>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_9);
    final Procedure1<PostDoubleClickPayload<Declaration>> _function_10 = (PostDoubleClickPayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<Declaration>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<Declaration>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_10);
    final Procedure1<PostMovePayload<Declaration>> _function_11 = (PostMovePayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<Declaration>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<Declaration>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_11);
    final Procedure1<PostResizePayload<Declaration>> _function_12 = (PostResizePayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<Declaration>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<Declaration>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_12);
    final Procedure1<PostSelectPayload<Declaration>> _function_13 = (PostSelectPayload<Declaration> payload) -> {
      DeclarationEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<Declaration>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<Declaration>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_Declaration", _function_13);
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
  public final void preAttributeChange(final Declaration element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<Declaration> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends Declaration> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<Declaration> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final Declaration element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<Declaration> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final Declaration element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<Declaration> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final Declaration element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<Declaration> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final Declaration element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<Declaration> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final Declaration element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<Declaration> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final Declaration element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<Declaration> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final Declaration element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<Declaration> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final Declaration element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<Declaration> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final Declaration element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<Declaration> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final Declaration element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<Declaration> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final Declaration element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<Declaration> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final Declaration element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<Declaration> it) {
    this.postSelect(it.getElement());
  }
}

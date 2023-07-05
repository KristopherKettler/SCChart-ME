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
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class ActionEvent implements NodeEvent<Action> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static ActionEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected ActionEvent() {
  }
  
  public static final ActionEvent getInstance() {
    if ((ActionEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.ActionEvent _actionEvent = new info.scce.cinco.product.scchart.events.ActionEvent();
      ActionEvent.eventInstance = _actionEvent;
    }
    return ActionEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<Action>> _function = (PreAttributeChangePayload<Action> payload) -> {
      ActionEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<Action>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<Action>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Action", _function);
    final Procedure1<PreCreateNodePayload<Action>> _function_1 = (PreCreateNodePayload<Action> payload) -> {
      ActionEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateNodePayload<Action>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateNodePayload<Action>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_1);
    final Procedure1<PreDeletePayload<Action>> _function_2 = (PreDeletePayload<Action> payload) -> {
      ActionEvent.getInstance().preDelete(payload);
    };
    PayloadSubscriber<PreDeletePayload<Action>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreDeletePayload<Action>>subscribePayloadSubscriber("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_2);
    final Procedure1<PreDoubleClickPayload<Action>> _function_3 = (PreDoubleClickPayload<Action> payload) -> {
      ActionEvent.getInstance().preDoubleClick(payload);
    };
    PayloadSubscriber<PreDoubleClickPayload<Action>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PreDoubleClickPayload<Action>>subscribePayloadSubscriber("event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_3);
    final Procedure1<PreMovePayload<Action>> _function_4 = (PreMovePayload<Action> payload) -> {
      ActionEvent.getInstance().preMove(payload);
    };
    PayloadSubscriber<PreMovePayload<Action>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PreMovePayload<Action>>subscribePayloadSubscriber("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_4);
    final Procedure1<PreResizePayload<Action>> _function_5 = (PreResizePayload<Action> payload) -> {
      ActionEvent.getInstance().preResize(payload);
    };
    PayloadSubscriber<PreResizePayload<Action>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PreResizePayload<Action>>subscribePayloadSubscriber("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_5);
    final Procedure1<PreSelectPayload<Action>> _function_6 = (PreSelectPayload<Action> payload) -> {
      ActionEvent.getInstance().preSelect(payload);
    };
    PayloadSubscriber<PreSelectPayload<Action>, Void> _subscribePayloadSubscriber_6 = this._eventApiExtension.<PreSelectPayload<Action>>subscribePayloadSubscriber("event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_6);
    final Procedure1<PostAttributeChangePayload<Action>> _function_7 = (PostAttributeChangePayload<Action> payload) -> {
      ActionEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<Action>, Void> _subscribePayloadSubscriber_7 = this._eventApiExtension.<PostAttributeChangePayload<Action>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_7);
    final Procedure1<PostCreatePayload<Action>> _function_8 = (PostCreatePayload<Action> payload) -> {
      ActionEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<Action>, Void> _subscribePayloadSubscriber_8 = this._eventApiExtension.<PostCreatePayload<Action>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_8);
    final Function1<PostDeletePayload<Action>, Runnable> _function_9 = (PostDeletePayload<Action> payload) -> {
      return ActionEvent.getInstance().postDelete(payload);
    };
    PayloadSubscriber<PostDeletePayload<Action>, Runnable> _subscribePayloadSubscriber_9 = this._eventApiExtension.<PostDeletePayload<Action>, Runnable>subscribePayloadSubscriber("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_9);
    final Procedure1<PostDoubleClickPayload<Action>> _function_10 = (PostDoubleClickPayload<Action> payload) -> {
      ActionEvent.getInstance().postDoubleClick(payload);
    };
    PayloadSubscriber<PostDoubleClickPayload<Action>, Void> _subscribePayloadSubscriber_10 = this._eventApiExtension.<PostDoubleClickPayload<Action>>subscribePayloadSubscriber("event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_10);
    final Procedure1<PostMovePayload<Action>> _function_11 = (PostMovePayload<Action> payload) -> {
      ActionEvent.getInstance().postMove(payload);
    };
    PayloadSubscriber<PostMovePayload<Action>, Void> _subscribePayloadSubscriber_11 = this._eventApiExtension.<PostMovePayload<Action>>subscribePayloadSubscriber("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_11);
    final Procedure1<PostResizePayload<Action>> _function_12 = (PostResizePayload<Action> payload) -> {
      ActionEvent.getInstance().postResize(payload);
    };
    PayloadSubscriber<PostResizePayload<Action>, Void> _subscribePayloadSubscriber_12 = this._eventApiExtension.<PostResizePayload<Action>>subscribePayloadSubscriber("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_12);
    final Procedure1<PostSelectPayload<Action>> _function_13 = (PostSelectPayload<Action> payload) -> {
      ActionEvent.getInstance().postSelect(payload);
    };
    PayloadSubscriber<PostSelectPayload<Action>, Void> _subscribePayloadSubscriber_13 = this._eventApiExtension.<PostSelectPayload<Action>>subscribePayloadSubscriber("event.post.select.info_scce_cinco_product_scchart_mglid_scchart_Action", _function_13);
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
  public final void preAttributeChange(final Action element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<Action> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends Action> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public final void preCreate(final PreCreateNodePayload<Action> it) {
    this.preCreate(it.getElementClass(), it.getContainer(), it.getX(), it.getY(), it.getWidth(), it.getHeight());
  }
  
  @Override
  public void preDelete(final Action element) {
  }
  
  @Override
  public final void preDelete(final PreDeletePayload<Action> it) {
    this.preDelete(it.getElement());
  }
  
  @Override
  public final void preDoubleClick(final Action element) {
  }
  
  @Override
  public final void preDoubleClick(final PreDoubleClickPayload<Action> it) {
    this.preDoubleClick(it.getElement());
  }
  
  @Override
  public void preMove(final Action element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public final void preMove(final PreMovePayload<Action> it) {
    this.preMove(it.getElement(), it.getNewContainer(), it.getNewX(), it.getNewY());
  }
  
  @Override
  public void preResize(final Action element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public final void preResize(final PreResizePayload<Action> it) {
    this.preResize(it.getElement(), it.getNewWidth(), it.getNewHeight(), it.getNewX(), it.getNewY(), it.getDirection());
  }
  
  @Override
  public final void preSelect(final Action element) {
  }
  
  @Override
  public final void preSelect(final PreSelectPayload<Action> it) {
    this.preSelect(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final Action element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<Action> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final Action element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<Action> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public Runnable postDelete(final Action element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public final Runnable postDelete(final PostDeletePayload<Action> it) {
    return this.postDelete(it.getElement());
  }
  
  @Override
  public void postDoubleClick(final Action element) {
  }
  
  @Override
  public final void postDoubleClick(final PostDoubleClickPayload<Action> it) {
    this.postDoubleClick(it.getElement());
  }
  
  @Override
  public void postMove(final Action element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public final void postMove(final PostMovePayload<Action> it) {
    this.postMove(it.getElement(), it.getOldContainer(), it.getOldX(), it.getOldY());
  }
  
  @Override
  public void postResize(final Action element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public final void postResize(final PostResizePayload<Action> it) {
    this.postResize(it.getElement(), it.getOldWidth(), it.getOldHeight(), it.getOldX(), it.getOldY(), it.getDirection());
  }
  
  @Override
  public void postSelect(final Action element) {
  }
  
  @Override
  public final void postSelect(final PostSelectPayload<Action> it) {
    this.postSelect(it.getElement());
  }
}

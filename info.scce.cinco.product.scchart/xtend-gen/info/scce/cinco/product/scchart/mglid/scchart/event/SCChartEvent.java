package info.scce.cinco.product.scchart.mglid.scchart.event;

import de.jabc.cinco.meta.core.event.hub.Subscriber;
import de.jabc.cinco.meta.core.event.hub.impl.PayloadSubscriber;
import de.jabc.cinco.meta.plugin.event.api.event.GraphModelEvent;
import de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PostSavePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreAttributeChangePayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreCreateGraphModelPayload;
import de.jabc.cinco.meta.plugin.event.api.payload.PreSavePayload;
import de.jabc.cinco.meta.plugin.event.api.util.EventApiExtension;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class SCChartEvent implements GraphModelEvent<SCChart> {
  @Extension
  protected EventApiExtension _eventApiExtension = new EventApiExtension();
  
  private static SCChartEvent eventInstance;
  
  private List<Subscriber> subscribers;
  
  protected SCChartEvent() {
  }
  
  public static final SCChartEvent getInstance() {
    if ((SCChartEvent.eventInstance == null)) {
      info.scce.cinco.product.scchart.events.SCChartEvent _sCChartEvent = new info.scce.cinco.product.scchart.events.SCChartEvent();
      SCChartEvent.eventInstance = _sCChartEvent;
    }
    return SCChartEvent.eventInstance;
  }
  
  @Override
  public final void subscribe() {
    final Procedure1<PreAttributeChangePayload<SCChart>> _function = (PreAttributeChangePayload<SCChart> payload) -> {
      SCChartEvent.getInstance().preAttributeChange(payload);
    };
    PayloadSubscriber<PreAttributeChangePayload<SCChart>, Void> _subscribePayloadSubscriber = this._eventApiExtension.<PreAttributeChangePayload<SCChart>>subscribePayloadSubscriber("event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SCChart", _function);
    final Procedure1<PreCreateGraphModelPayload<SCChart>> _function_1 = (PreCreateGraphModelPayload<SCChart> payload) -> {
      SCChartEvent.getInstance().preCreate(payload);
    };
    PayloadSubscriber<PreCreateGraphModelPayload<SCChart>, Void> _subscribePayloadSubscriber_1 = this._eventApiExtension.<PreCreateGraphModelPayload<SCChart>>subscribePayloadSubscriber("event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_SCChart", _function_1);
    final Procedure1<PreSavePayload<SCChart>> _function_2 = (PreSavePayload<SCChart> payload) -> {
      SCChartEvent.getInstance().preSave(payload);
    };
    PayloadSubscriber<PreSavePayload<SCChart>, Void> _subscribePayloadSubscriber_2 = this._eventApiExtension.<PreSavePayload<SCChart>>subscribePayloadSubscriber("event.pre.save.info_scce_cinco_product_scchart_mglid_scchart_SCChart", _function_2);
    final Procedure1<PostAttributeChangePayload<SCChart>> _function_3 = (PostAttributeChangePayload<SCChart> payload) -> {
      SCChartEvent.getInstance().postAttributeChange(payload);
    };
    PayloadSubscriber<PostAttributeChangePayload<SCChart>, Void> _subscribePayloadSubscriber_3 = this._eventApiExtension.<PostAttributeChangePayload<SCChart>>subscribePayloadSubscriber("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SCChart", _function_3);
    final Procedure1<PostCreatePayload<SCChart>> _function_4 = (PostCreatePayload<SCChart> payload) -> {
      SCChartEvent.getInstance().postCreate(payload);
    };
    PayloadSubscriber<PostCreatePayload<SCChart>, Void> _subscribePayloadSubscriber_4 = this._eventApiExtension.<PostCreatePayload<SCChart>>subscribePayloadSubscriber("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SCChart", _function_4);
    final Procedure1<PostSavePayload<SCChart>> _function_5 = (PostSavePayload<SCChart> payload) -> {
      SCChartEvent.getInstance().postSave(payload);
    };
    PayloadSubscriber<PostSavePayload<SCChart>, Void> _subscribePayloadSubscriber_5 = this._eventApiExtension.<PostSavePayload<SCChart>>subscribePayloadSubscriber("event.post.save.info_scce_cinco_product_scchart_mglid_scchart_SCChart", _function_5);
    this.subscribers = Collections.<Subscriber>unmodifiableList(CollectionLiterals.<Subscriber>newArrayList(_subscribePayloadSubscriber, _subscribePayloadSubscriber_1, _subscribePayloadSubscriber_2, _subscribePayloadSubscriber_3, _subscribePayloadSubscriber_4, _subscribePayloadSubscriber_5));
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
  public final void preAttributeChange(final SCChart element, final String attribute, final Object newValue) {
  }
  
  @Override
  public final void preAttributeChange(final PreAttributeChangePayload<SCChart> it) {
    this.preAttributeChange(it.getElement(), it.getAttribute(), it.getNewValue());
  }
  
  @Override
  public void preCreate(final Class<? extends SCChart> elementClass, final String name, final IPath path) {
  }
  
  @Override
  public final void preCreate(final PreCreateGraphModelPayload<SCChart> it) {
    this.preCreate(it.getElementClass(), it.getName(), it.getPath());
  }
  
  @Override
  public void preSave(final SCChart element) {
  }
  
  @Override
  public final void preSave(final PreSavePayload<SCChart> it) {
    this.preSave(it.getElement());
  }
  
  @Override
  public void postAttributeChange(final SCChart element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public final void postAttributeChange(final PostAttributeChangePayload<SCChart> it) {
    this.postAttributeChange(it.getElement(), it.getAttribute(), it.getOldValue());
  }
  
  @Override
  public void postCreate(final SCChart element) {
  }
  
  @Override
  public final void postCreate(final PostCreatePayload<SCChart> it) {
    this.postCreate(it.getElement());
  }
  
  @Override
  public void postSave(final SCChart element) {
  }
  
  @Override
  public final void postSave(final PostSavePayload<SCChart> it) {
    this.postSave(it.getElement());
  }
}

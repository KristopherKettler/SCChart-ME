// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventGeneratedClassTemplate

package info.scce.cinco.product.scchart.mglid.scchart.event

import de.jabc.cinco.meta.core.event.hub.Subscriber
import de.jabc.cinco.meta.plugin.event.api.event.ContainerEvent
import de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostDoubleClickPayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PostSelectPayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreAttributeChangePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreCreateNodePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreDoubleClickPayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload
import de.jabc.cinco.meta.plugin.event.api.payload.PreSelectPayload
import de.jabc.cinco.meta.plugin.event.api.util.EventApiExtension
import graphmodel.Direction
import graphmodel.ModelElementContainer
import info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion
import java.util.List

final class DataFlowRegionEvent implements ContainerEvent<DataFlowRegion> {
	
	protected extension EventApiExtension = new EventApiExtension
	
	var static DataFlowRegionEvent eventInstance
	
	var List<Subscriber> subscribers
	
	protected new () {
		// Intentionally left blank
	}
	
	def final static DataFlowRegionEvent getInstance() {
		if (eventInstance === null) {
			eventInstance = new DataFlowRegionEvent
		}
		return eventInstance
	}
	
	override final subscribe() {
		subscribers = #[
			subscribePayloadSubscriber('event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PreAttributeChangePayload<DataFlowRegion> payload |
					instance.preAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PreCreateNodePayload<DataFlowRegion> payload |
					instance.preCreate(payload)
			],
			subscribePayloadSubscriber('event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PreDeletePayload<DataFlowRegion> payload |
					instance.preDelete(payload)
			],
			subscribePayloadSubscriber('event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PreDoubleClickPayload<DataFlowRegion> payload |
					instance.preDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PreMovePayload<DataFlowRegion> payload |
					instance.preMove(payload)
			],
			subscribePayloadSubscriber('event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PreResizePayload<DataFlowRegion> payload |
					instance.preResize(payload)
			],
			subscribePayloadSubscriber('event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PreSelectPayload<DataFlowRegion> payload |
					instance.preSelect(payload)
			],
			subscribePayloadSubscriber('event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PostAttributeChangePayload<DataFlowRegion> payload |
					instance.postAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PostCreatePayload<DataFlowRegion> payload |
					instance.postCreate(payload)
			],
			subscribePayloadSubscriber('event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PostDeletePayload<DataFlowRegion> payload |
					instance.postDelete(payload)
			],
			subscribePayloadSubscriber('event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PostDoubleClickPayload<DataFlowRegion> payload |
					instance.postDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.post.move.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PostMovePayload<DataFlowRegion> payload |
					instance.postMove(payload)
			],
			subscribePayloadSubscriber('event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PostResizePayload<DataFlowRegion> payload |
					instance.postResize(payload)
			],
			subscribePayloadSubscriber('event.post.select.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion') [
				PostSelectPayload<DataFlowRegion> payload |
					instance.postSelect(payload)
			]
		]
	}
	
	override final unsubscribe() {
		subscribers?.forEach [ unsubscribe ]
		subscribers = null
	}
	
	override final preAttributeChange(DataFlowRegion element, String attribute, Object newValue) {
		RegionEvent.instance.preAttributeChange(element, attribute, newValue)
	}
	
	override final preAttributeChange(PreAttributeChangePayload<DataFlowRegion> it) {
		preAttributeChange(element, attribute, newValue)
	}
	
	override preCreate(Class<? extends DataFlowRegion> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		RegionEvent.instance.preCreate(elementClass, container, x, y, width, height)
	}
	
	override final preCreate(PreCreateNodePayload<DataFlowRegion> it) {
		preCreate(elementClass, container, x, y, width, height)
	}
	
	override preDelete(DataFlowRegion element) {
		RegionEvent.instance.preDelete(element)
	}
	
	override final preDelete(PreDeletePayload<DataFlowRegion> it) {
		preDelete(element)
	}
	
	override final preDoubleClick(DataFlowRegion element) {
		RegionEvent.instance.preDoubleClick(element)
	}
	
	override final preDoubleClick(PreDoubleClickPayload<DataFlowRegion> it) {
		preDoubleClick(element)
	}
	
	override preMove(DataFlowRegion element, ModelElementContainer newContainer, int newX, int newY) {
		RegionEvent.instance.preMove(element, newContainer, newX, newY)
	}
	
	override final preMove(PreMovePayload<DataFlowRegion> it) {
		preMove(element, newContainer, newX, newY)
	}
	
	override preResize(DataFlowRegion element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		RegionEvent.instance.preResize(element, newWidth, newHeight, newX, newY, direction)
	}
	
	override final preResize(PreResizePayload<DataFlowRegion> it) {
		preResize(element, newWidth, newHeight, newX, newY, direction)
	}
	
	override final preSelect(DataFlowRegion element) {
		RegionEvent.instance.preSelect(element)
	}
	
	override final preSelect(PreSelectPayload<DataFlowRegion> it) {
		preSelect(element)
	}
	
	override postAttributeChange(DataFlowRegion element, String attribute, Object oldValue) {
		RegionEvent.instance.postAttributeChange(element, attribute, oldValue)
	}
	
	override final postAttributeChange(PostAttributeChangePayload<DataFlowRegion> it) {
		postAttributeChange(element, attribute, oldValue)
	}
	
	override postCreate(DataFlowRegion element) {
		RegionEvent.instance.postCreate(element)
	}
	
	override final postCreate(PostCreatePayload<DataFlowRegion> it) {
		postCreate(element)
	}
	
	override postDelete(DataFlowRegion element) {
		RegionEvent.instance.postDelete(element)
	}
	
	override final postDelete(PostDeletePayload<DataFlowRegion> it) {
		postDelete(element)
	}
	
	override postDoubleClick(DataFlowRegion element) {
		RegionEvent.instance.postDoubleClick(element)
	}
	
	override final postDoubleClick(PostDoubleClickPayload<DataFlowRegion> it) {
		postDoubleClick(element)
	}
	
	override postMove(DataFlowRegion element, ModelElementContainer oldContainer, int oldX, int oldY) {
		RegionEvent.instance.postMove(element, oldContainer, oldX, oldY)
	}
	
	override final postMove(PostMovePayload<DataFlowRegion> it) {
		postMove(element, oldContainer, oldX, oldY)
	}
	
	override postResize(DataFlowRegion element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		RegionEvent.instance.postResize(element, oldWidth, oldHeight, oldX, oldY, direction)
	}
	
	override final postResize(PostResizePayload<DataFlowRegion> it) {
		postResize(element, oldWidth, oldHeight, oldX, oldY, direction)
	}
	
	override postSelect(DataFlowRegion element) {
		RegionEvent.instance.postSelect(element)
	}
	
	override final postSelect(PostSelectPayload<DataFlowRegion> it) {
		postSelect(element)
	}
	
}

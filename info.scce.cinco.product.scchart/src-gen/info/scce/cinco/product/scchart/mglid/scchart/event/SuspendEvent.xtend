// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventGeneratedClassTemplate

package info.scce.cinco.product.scchart.mglid.scchart.event

import de.jabc.cinco.meta.core.event.hub.Subscriber
import de.jabc.cinco.meta.plugin.event.api.event.NodeEvent
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
import info.scce.cinco.product.scchart.mglid.scchart.Suspend
import java.util.List

abstract class SuspendEvent implements NodeEvent<Suspend> {
	
	protected extension EventApiExtension = new EventApiExtension
	
	var static SuspendEvent eventInstance
	
	var List<Subscriber> subscribers
	
	protected new () {
		// Intentionally left blank
	}
	
	def final static SuspendEvent getInstance() {
		if (eventInstance === null) {
			eventInstance = new info.scce.cinco.product.scchart.events.SuspendEvent
		}
		return eventInstance
	}
	
	override final subscribe() {
		subscribers = #[
			subscribePayloadSubscriber('event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PreAttributeChangePayload<Suspend> payload |
					instance.preAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PreCreateNodePayload<Suspend> payload |
					instance.preCreate(payload)
			],
			subscribePayloadSubscriber('event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PreDeletePayload<Suspend> payload |
					instance.preDelete(payload)
			],
			subscribePayloadSubscriber('event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PreDoubleClickPayload<Suspend> payload |
					instance.preDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PreMovePayload<Suspend> payload |
					instance.preMove(payload)
			],
			subscribePayloadSubscriber('event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PreResizePayload<Suspend> payload |
					instance.preResize(payload)
			],
			subscribePayloadSubscriber('event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PreSelectPayload<Suspend> payload |
					instance.preSelect(payload)
			],
			subscribePayloadSubscriber('event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PostAttributeChangePayload<Suspend> payload |
					instance.postAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PostCreatePayload<Suspend> payload |
					instance.postCreate(payload)
			],
			subscribePayloadSubscriber('event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PostDeletePayload<Suspend> payload |
					instance.postDelete(payload)
			],
			subscribePayloadSubscriber('event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PostDoubleClickPayload<Suspend> payload |
					instance.postDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.post.move.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PostMovePayload<Suspend> payload |
					instance.postMove(payload)
			],
			subscribePayloadSubscriber('event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PostResizePayload<Suspend> payload |
					instance.postResize(payload)
			],
			subscribePayloadSubscriber('event.post.select.info_scce_cinco_product_scchart_mglid_scchart_Suspend') [
				PostSelectPayload<Suspend> payload |
					instance.postSelect(payload)
			]
		]
	}
	
	override final unsubscribe() {
		subscribers?.forEach [ unsubscribe ]
		subscribers = null
	}
	
	override final preAttributeChange(Suspend element, String attribute, Object newValue) {
		// Intentionally left blank
	}
	
	override final preAttributeChange(PreAttributeChangePayload<Suspend> it) {
		preAttributeChange(element, attribute, newValue)
	}
	
	override preCreate(Class<? extends Suspend> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		// Intentionally left blank
	}
	
	override final preCreate(PreCreateNodePayload<Suspend> it) {
		preCreate(elementClass, container, x, y, width, height)
	}
	
	override preDelete(Suspend element) {
		// Intentionally left blank
	}
	
	override final preDelete(PreDeletePayload<Suspend> it) {
		preDelete(element)
	}
	
	override final preDoubleClick(Suspend element) {
		// Intentionally left blank
	}
	
	override final preDoubleClick(PreDoubleClickPayload<Suspend> it) {
		preDoubleClick(element)
	}
	
	override preMove(Suspend element, ModelElementContainer newContainer, int newX, int newY) {
		// Intentionally left blank
	}
	
	override final preMove(PreMovePayload<Suspend> it) {
		preMove(element, newContainer, newX, newY)
	}
	
	override preResize(Suspend element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		// Intentionally left blank
	}
	
	override final preResize(PreResizePayload<Suspend> it) {
		preResize(element, newWidth, newHeight, newX, newY, direction)
	}
	
	override final preSelect(Suspend element) {
		// Intentionally left blank
	}
	
	override final preSelect(PreSelectPayload<Suspend> it) {
		preSelect(element)
	}
	
	override postAttributeChange(Suspend element, String attribute, Object oldValue) {
		// Intentionally left blank
	}
	
	override final postAttributeChange(PostAttributeChangePayload<Suspend> it) {
		postAttributeChange(element, attribute, oldValue)
	}
	
	override postCreate(Suspend element) {
		// Intentionally left blank
	}
	
	override final postCreate(PostCreatePayload<Suspend> it) {
		postCreate(element)
	}
	
	override postDelete(Suspend element) {
		[ /* Intentionally left blank */ ]
	}
	
	override final postDelete(PostDeletePayload<Suspend> it) {
		postDelete(element)
	}
	
	override postDoubleClick(Suspend element) {
		// Intentionally left blank
	}
	
	override final postDoubleClick(PostDoubleClickPayload<Suspend> it) {
		postDoubleClick(element)
	}
	
	override postMove(Suspend element, ModelElementContainer oldContainer, int oldX, int oldY) {
		// Intentionally left blank
	}
	
	override final postMove(PostMovePayload<Suspend> it) {
		postMove(element, oldContainer, oldX, oldY)
	}
	
	override postResize(Suspend element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		// Intentionally left blank
	}
	
	override final postResize(PostResizePayload<Suspend> it) {
		postResize(element, oldWidth, oldHeight, oldX, oldY, direction)
	}
	
	override postSelect(Suspend element) {
		// Intentionally left blank
	}
	
	override final postSelect(PostSelectPayload<Suspend> it) {
		postSelect(element)
	}
	
}

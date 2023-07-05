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
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration
import java.util.List

abstract class SuperStateDeclarationEvent implements NodeEvent<SuperStateDeclaration> {
	
	protected extension EventApiExtension = new EventApiExtension
	
	var static SuperStateDeclarationEvent eventInstance
	
	var List<Subscriber> subscribers
	
	protected new () {
		// Intentionally left blank
	}
	
	def final static SuperStateDeclarationEvent getInstance() {
		if (eventInstance === null) {
			eventInstance = new info.scce.cinco.product.scchart.events.SuperStateDeclarationEvent
		}
		return eventInstance
	}
	
	override final subscribe() {
		subscribers = #[
			subscribePayloadSubscriber('event.pre.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PreAttributeChangePayload<SuperStateDeclaration> payload |
					instance.preAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.pre.create.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PreCreateNodePayload<SuperStateDeclaration> payload |
					instance.preCreate(payload)
			],
			subscribePayloadSubscriber('event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PreDeletePayload<SuperStateDeclaration> payload |
					instance.preDelete(payload)
			],
			subscribePayloadSubscriber('event.pre.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PreDoubleClickPayload<SuperStateDeclaration> payload |
					instance.preDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PreMovePayload<SuperStateDeclaration> payload |
					instance.preMove(payload)
			],
			subscribePayloadSubscriber('event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PreResizePayload<SuperStateDeclaration> payload |
					instance.preResize(payload)
			],
			subscribePayloadSubscriber('event.pre.select.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PreSelectPayload<SuperStateDeclaration> payload |
					instance.preSelect(payload)
			],
			subscribePayloadSubscriber('event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PostAttributeChangePayload<SuperStateDeclaration> payload |
					instance.postAttributeChange(payload)
			],
			subscribePayloadSubscriber('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PostCreatePayload<SuperStateDeclaration> payload |
					instance.postCreate(payload)
			],
			subscribePayloadSubscriber('event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PostDeletePayload<SuperStateDeclaration> payload |
					instance.postDelete(payload)
			],
			subscribePayloadSubscriber('event.post.doubleClick.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PostDoubleClickPayload<SuperStateDeclaration> payload |
					instance.postDoubleClick(payload)
			],
			subscribePayloadSubscriber('event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PostMovePayload<SuperStateDeclaration> payload |
					instance.postMove(payload)
			],
			subscribePayloadSubscriber('event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PostResizePayload<SuperStateDeclaration> payload |
					instance.postResize(payload)
			],
			subscribePayloadSubscriber('event.post.select.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration') [
				PostSelectPayload<SuperStateDeclaration> payload |
					instance.postSelect(payload)
			]
		]
	}
	
	override final unsubscribe() {
		subscribers?.forEach [ unsubscribe ]
		subscribers = null
	}
	
	override final preAttributeChange(SuperStateDeclaration element, String attribute, Object newValue) {
		// Intentionally left blank
	}
	
	override final preAttributeChange(PreAttributeChangePayload<SuperStateDeclaration> it) {
		preAttributeChange(element, attribute, newValue)
	}
	
	override preCreate(Class<? extends SuperStateDeclaration> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		// Intentionally left blank
	}
	
	override final preCreate(PreCreateNodePayload<SuperStateDeclaration> it) {
		preCreate(elementClass, container, x, y, width, height)
	}
	
	override preDelete(SuperStateDeclaration element) {
		// Intentionally left blank
	}
	
	override final preDelete(PreDeletePayload<SuperStateDeclaration> it) {
		preDelete(element)
	}
	
	override final preDoubleClick(SuperStateDeclaration element) {
		// Intentionally left blank
	}
	
	override final preDoubleClick(PreDoubleClickPayload<SuperStateDeclaration> it) {
		preDoubleClick(element)
	}
	
	override preMove(SuperStateDeclaration element, ModelElementContainer newContainer, int newX, int newY) {
		// Intentionally left blank
	}
	
	override final preMove(PreMovePayload<SuperStateDeclaration> it) {
		preMove(element, newContainer, newX, newY)
	}
	
	override preResize(SuperStateDeclaration element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		// Intentionally left blank
	}
	
	override final preResize(PreResizePayload<SuperStateDeclaration> it) {
		preResize(element, newWidth, newHeight, newX, newY, direction)
	}
	
	override final preSelect(SuperStateDeclaration element) {
		// Intentionally left blank
	}
	
	override final preSelect(PreSelectPayload<SuperStateDeclaration> it) {
		preSelect(element)
	}
	
	override postAttributeChange(SuperStateDeclaration element, String attribute, Object oldValue) {
		// Intentionally left blank
	}
	
	override final postAttributeChange(PostAttributeChangePayload<SuperStateDeclaration> it) {
		postAttributeChange(element, attribute, oldValue)
	}
	
	override postCreate(SuperStateDeclaration element) {
		// Intentionally left blank
	}
	
	override final postCreate(PostCreatePayload<SuperStateDeclaration> it) {
		postCreate(element)
	}
	
	override postDelete(SuperStateDeclaration element) {
		[ /* Intentionally left blank */ ]
	}
	
	override final postDelete(PostDeletePayload<SuperStateDeclaration> it) {
		postDelete(element)
	}
	
	override postDoubleClick(SuperStateDeclaration element) {
		// Intentionally left blank
	}
	
	override final postDoubleClick(PostDoubleClickPayload<SuperStateDeclaration> it) {
		postDoubleClick(element)
	}
	
	override postMove(SuperStateDeclaration element, ModelElementContainer oldContainer, int oldX, int oldY) {
		// Intentionally left blank
	}
	
	override final postMove(PostMovePayload<SuperStateDeclaration> it) {
		postMove(element, oldContainer, oldX, oldY)
	}
	
	override postResize(SuperStateDeclaration element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		// Intentionally left blank
	}
	
	override final postResize(PostResizePayload<SuperStateDeclaration> it) {
		postResize(element, oldWidth, oldHeight, oldX, oldY, direction)
	}
	
	override postSelect(SuperStateDeclaration element) {
		// Intentionally left blank
	}
	
	override final postSelect(PostSelectPayload<SuperStateDeclaration> it) {
		postSelect(element)
	}
	
}

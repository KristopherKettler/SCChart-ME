package info.scce.cinco.product.scchart.mglid.adapter

class SuperStateDeclarationEContentAdapter extends org.eclipse.emf.ecore.util.EContentAdapter implements de.jabc.cinco.meta.runtime.contentadapter.CincoEContentAdapter{

	override notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
		super.notifyChanged(notification)
		val o = notification.notifier
		val feature = notification.feature
		if (o instanceof info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration) {
			if (o.eContainer == null && !(o instanceof graphmodel.internal.InternalGraphModel)) return;
			switch feature {
				org.eclipse.emf.ecore.EStructuralFeature case feature.isRelevant: {
					// event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration
					val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration>(o.element as info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration, feature.name, notification.oldValue)
					val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration>, java.lang.Void>('event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_SuperStateDeclaration', eventPayload)
					de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
					//o.element.update
					o.element?.rootElement?.updateModelElements
				}
			}
		}
	}
	
	private def isRelevant(org.eclipse.emf.ecore.EStructuralFeature ftr) {
		ftr.eDeliver 
			&& info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage.eINSTANCE.EClassifiers.contains(ftr?.eContainer)
			&& ftr.name != "libraryComponentUID"
	}
}

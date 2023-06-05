// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventStartupClassTemplate

package info.scce.cinco.product.scchart.mglid.scchart.event

import de.jabc.cinco.meta.runtime.IStartup

class EventStartup implements IStartup {
	
	override startup() {
		subscribe
	}
	
	def static void subscribe() {
		RootStateEvent.instance.subscribe
		RegionEvent.instance.subscribe
		SuperStateEvent.instance.subscribe
		InitilalSuperStateEvent.instance.subscribe
		SCChartEvent.instance.subscribe
	}
	
	def static void unsubscribe() {
		RootStateEvent.instance.unsubscribe
		RegionEvent.instance.unsubscribe
		SuperStateEvent.instance.unsubscribe
		InitilalSuperStateEvent.instance.unsubscribe
		SCChartEvent.instance.unsubscribe
	}
	
}

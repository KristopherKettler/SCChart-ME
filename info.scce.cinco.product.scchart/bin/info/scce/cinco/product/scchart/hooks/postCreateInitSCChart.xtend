package info.scce.cinco.product.scchart.hooks

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook
import info.scce.cinco.product.scchart.mglid.scchart.InitSCChart

class postCreateInitSCChart extends CincoPostCreateHook<InitSCChart>{
	
	override postCreate(InitSCChart initChart) {
		initChart.newSuperState(10,30,680,870)
	}
}
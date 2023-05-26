package info.scce.cinco.product.scchart.hooks

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook
import info.scce.cinco.product.scchart.mglid.scchart.SCChart

class postCreateSCChartModel extends CincoPostCreateHook<SCChart>{
	
	override postCreate(SCChart model) {
		model.newInitSCChart(20,20,700,900)
	}
}
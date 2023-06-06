package info.scce.cinco.product.scchart.hooks


import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import de.jabc.cinco.meta.runtime.hook.CincoPreSaveHook

class PreSaveSCChart extends CincoPreSaveHook<SCChart> {
	
	override preSave(SCChart model) {
//		var size = model.getInitSCCharts.head.getSuperStates.size
//		var initSCC = model.getInitSCCharts.head
//		val varCount = initSCC.getDeclaration.size 
//		var height = model.getInitSCCharts.head.height - 30 - varCount * 10
//		val distance = height/size
//		model.getInitSCCharts.head.getSuperStates.forEach[ superState, index |
//			superState.resize(model.getInitSCCharts.head.width-20,distance-10)
//			superState.moveTo(model.getInitSCCharts.head,10,25 + varCount * 10+ distance*index)
//		]
	}
}
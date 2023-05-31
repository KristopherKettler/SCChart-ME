package info.scce.cinco.product.scchart.hooks

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook
import info.scce.cinco.product.scchart.mglid.scchart.SuperState

class PostCreateSuperState extends CincoPostCreateHook<SuperState>{
	
	override postCreate(SuperState superStateArg) {
		var size = superStateArg.getRootElement.getInitSCCharts.head.getSuperStates.size
		var initSCC = superStateArg.getRootElement.getInitSCCharts.head
		val varCount = initSCC.getDeclaration.size
		var height = superStateArg.getRootElement.getInitSCCharts.head.height - 30 - varCount * 10
		val distance = height/size
		superStateArg.getRootElement.getInitSCCharts.head.getSuperStates.forEach[ superState, index |
			superState.resize(superStateArg.getRootElement.getInitSCCharts.head.width-20,distance-10)
			superState.moveTo(superStateArg.getRootElement.getInitSCCharts.head,10,25 + varCount * 10+ distance*index)
		]
	}
}
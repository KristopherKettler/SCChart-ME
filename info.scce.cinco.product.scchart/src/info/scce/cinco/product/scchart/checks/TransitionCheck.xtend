package info.scce.cinco.product.scchart.checks

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck
import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState
import info.scce.cinco.product.scchart.mglid.scchart.RootState
import info.scce.cinco.product.scchart.mglid.scchart.Region
import info.scce.cinco.product.scchart.mglid.scchart.SuperState

class TransitionCheck extends SCChartCheck{
	
	override check(SCChart scchart) {
		checkTransitionorder(scchart)
	}
	
	def checkTransitionorder(SCChart scchart){
		
		scchart.findThe(RootState).find(Region).forEach[find(SimpleState).filter[getOutgoing.size>1].forEach[
				var notValidTrans = false
				for(firstEdge:it.getOutgoing){
					for(secondEdge:it.getOutgoing){
						if(firstEdge.priority==secondEdge.priority&&firstEdge!=secondEdge){
							notValidTrans = true
						}
					}
				}
				if(notValidTrans)it.addError("order of transitions not valid")
			]
		]
		
		scchart.findThe(RootState).find(Region).forEach[find(SuperState).filter[getOutgoing.size>1].forEach[
				var notValidTrans = false
				for(firstEdge:it.getOutgoing){
					for(secondEdge:it.getOutgoing){
						if(firstEdge.priority==secondEdge.priority&&firstEdge!=secondEdge){
							notValidTrans = true
						}
					}
				}
				if(notValidTrans)it.addError("order of transitions not valid")
			]
		]
	}
}
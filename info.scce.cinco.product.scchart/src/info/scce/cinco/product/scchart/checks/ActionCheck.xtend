package info.scce.cinco.product.scchart.checks

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck
import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import info.scce.cinco.product.scchart.mglid.scchart.Action
import info.scce.cinco.product.scchart.mglid.scchart.RootState
import static extension java.lang.Character.*

class ActionCheck extends SCChartCheck{
	
	override check(SCChart scchart) {
		checkNameConvention(scchart)
	}
	
	def checkNameConvention(SCChart scchart){
		scchart.findThe(RootState).find(Action).forEach[
			if(it.actionType == "<set action>") {
				it.addError("set actiontype")
			}
//			else if{
//				var break = false
//				var i = 1
//				while(i<it.effect.length&&!break){
//					if(!((it.effect.charAt(i) >= 'a' && it.effect.charAt(i) <= 'z') || (it.effect.charAt(i) >= 'A' && it.effect.charAt(i) <= 'Z') || it.effect.charAt(i).isDigit)){
//						it.addError("name should only contain letters and numbers")
//						break = true
//					}
//					i++
//				}
//			}
			else {
				var break = false
				var i = 1
				while(i<it.effect.length&&!break){
					if(!((it.effect.charAt(i) >= 'a' && it.effect.charAt(i) <= 'z') || (it.effect.charAt(i) >= 'A' && it.effect.charAt(i) <= 'Z') || it.effect.charAt(i).isDigit)){
						it.addError("name should only contain letters and numbers")
						break = true
					}
					i++
				}
			}
		]
	}
}
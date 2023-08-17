package info.scce.cinco.product.scchart.extensions

import info.scce.cinco.product.scchart.mglid.scchart.SuperState

class HelperMethods {
	
	/*returns distance between top of superState and first region */
	def static Integer getDeclarationsDistance(SuperState superState){
		var declarationCount = 0
		if(superState.declarations!==null){
			declarationCount += superState.declarations.size
		}
		if(superState.suspends!==null){
			declarationCount += superState.suspends.size
		}
		if(superState.actions!==null){
			declarationCount += superState.actions.size
		}
		return 33+13*declarationCount
	}
}
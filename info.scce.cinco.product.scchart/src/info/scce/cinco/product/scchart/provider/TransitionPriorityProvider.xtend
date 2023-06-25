package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import info.scce.cinco.product.scchart.mglid.scchart.Transition

class TransitionPriorityProvider extends CincoValuesProvider<Transition, String>{
	
	override getPossibleValues(Transition transition) {
		var map = newLinkedHashMap
		for(var i = 0 ; i <= transition.getSourceElement.getOutgoing.size;i++){
			map.put(i.toString,i.toString)
		}
		return map
	}
}
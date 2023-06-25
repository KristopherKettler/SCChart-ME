package info.scce.cinco.product.scchart.provider


import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState

class SimplesStateNameTest extends CincoValuesProvider<SimpleState, String>{
	
	override getPossibleValues(SimpleState arg0) {
		var map = newLinkedHashMap
		for(var i = 1 ; i <= arg0.getOutgoing.size;i++){
			map.put(i.toString,i.toString)
		}
		return map
	}
}
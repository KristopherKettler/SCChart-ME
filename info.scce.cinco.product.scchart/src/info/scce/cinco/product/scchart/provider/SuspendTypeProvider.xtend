package info.scce.cinco.product.scchart.provider

import info.scce.cinco.product.scchart.mglid.scchart.Suspend
import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import java.util.Map

class SuspendTypeProvider extends CincoValuesProvider<Suspend, String> {
	
	override Map<String, String> getPossibleValues(Suspend type) {
		val String[] arr = #['<set suspend>','suspend','immediate suspend','weak suspend','immediate weak suspend'] 
		var map = newLinkedHashMap
		for(string : arr){
			map.put(string,string)
		}
		return map
	}
}
package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import java.util.Map
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration

class RootStateDeclarationTypeProvider extends CincoValuesProvider<RootStateDeclaration, String> {
	override Map<String, String> getPossibleValues(RootStateDeclaration type) {
		val String[] arr = #['string','bool','int','float'] 
		
		var map = newLinkedHashMap
		for(string : arr){
			map.put(string,string)
		}
		return map
	}
}
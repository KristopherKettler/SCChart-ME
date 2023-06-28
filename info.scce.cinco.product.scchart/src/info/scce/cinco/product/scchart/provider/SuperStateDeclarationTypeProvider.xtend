package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration
import java.util.Map

class SuperStateDeclarationTypeProvider extends CincoValuesProvider<SuperStateDeclaration, String> {
	override Map<String, String> getPossibleValues(SuperStateDeclaration type) {
		val String[] arr = #['string','bool','int','float'] 
		
		var map = newLinkedHashMap
		for(string : arr){
			map.put(string,string)
		}
		return map
	}
}
package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration
import java.util.Map

class SuperStateDeclarationTypeProvider extends CincoValuesProvider<SuperStateDeclaration, String> {
	override Map<String, String> getPossibleValues(SuperStateDeclaration type) {
		return #{
			"String" -> "String",
			"bool" -> "bool",
			"int" -> "int",
			"float" -> "float"
		}
	}
}
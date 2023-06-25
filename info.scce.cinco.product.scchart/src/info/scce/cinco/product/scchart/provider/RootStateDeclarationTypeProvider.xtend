package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import java.util.Map
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration

class RootStateDeclarationTypeProvider extends CincoValuesProvider<RootStateDeclaration, String> {
	override Map<String, String> getPossibleValues(RootStateDeclaration type) {
		return #{
			"select type" -> "select type",
			"String" -> "String",
			"bool" -> "bool",
			"int" -> "int",
			"float" -> "float"
		}
	}
}
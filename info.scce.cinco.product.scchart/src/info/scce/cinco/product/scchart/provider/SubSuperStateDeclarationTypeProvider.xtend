package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperStateDeclaration
import java.util.Map

class SubSuperStateDeclarationTypeProvider extends CincoValuesProvider<SubSuperStateDeclaration, String> {
	override Map<String, String> getPossibleValues(SubSuperStateDeclaration type) {
		return #{
			"String" -> "String",
			"bool" -> "bool",
			"int" -> "int",
			"float" -> "float"
		}
	}
}
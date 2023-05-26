package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import java.util.Map
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration

class SuperStateDeclarationInputOutputProvider extends CincoValuesProvider<SuperStateDeclaration, String> {
	override Map<String, String> getPossibleValues(SuperStateDeclaration inputOutput) {
		return #{
			"" -> "",
			"Input" -> "Input",
			"Output" -> "Output",
			"InputOutput" -> "InputOutput"
		}
	}
}
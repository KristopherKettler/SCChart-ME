package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import java.util.Map
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration

class RootStateDeclarationInputOutputProvider extends CincoValuesProvider<RootStateDeclaration, String> {

	override Map<String, String> getPossibleValues(RootStateDeclaration inputOutput) {
		return #{
			"" -> "",
			"Input" -> "Input",
			"Output" -> "Output",
			"InputOutput" -> "InputOutput"
		}
	}
	
}
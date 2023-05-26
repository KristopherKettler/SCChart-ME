package info.scce.cinco.product.scchart.provider

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition
import java.util.Map

class IntProvider extends CincoValuesProvider<ImmediateTransition, Integer> {
	
	override Map<Integer, String> getPossibleValues(ImmediateTransition modelElement) {
		return #{
			-1 -> "Unknown",
			18 -> "18",
			19 -> "19",
			20 -> "20",
			21 -> "21",
			22 -> "22",
			23 -> "23",
			24 -> "24",
			25 -> "25"
		}
	}

}
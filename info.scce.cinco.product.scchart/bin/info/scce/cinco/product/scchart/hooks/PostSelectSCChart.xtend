package info.scce.cinco.product.scchart.hooks

import de.jabc.cinco.meta.runtime.hook.CincoPostSelectHook
import info.scce.cinco.product.scchart.mglid.scchart.InitSCChart
import info.scce.cinco.product.scchart.mglid.scchart.SuperState
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperState

class PostSelectSCChart extends CincoPostSelectHook<InitSCChart> {
	
	override postSelect(InitSCChart initSCChart) {
		initSCChart.superStateDeclarationNodes.forEach[it.delete]
		initSCChart.getDeclaration.forEach[ declaration , i |
			initSCChart.newSuperStateDeclarationNode(10,10 + 10*(i+1),initSCChart.width-20,10)
			initSCChart.superStateDeclarationNodes.last.setInputOutput(declaration.inputOutput)
			initSCChart.superStateDeclarationNodes.last.setDeclarationType(declaration.declarationType)
			initSCChart.superStateDeclarationNodes.last.setName(declaration.name)
			]
		initSCChart.getSuperStates.forEach[ superState |
			superState.getSubSuperStates.forEach[ subSuperState |
				setDeclaration(subSuperState)
			]
		]
	}
	
	def setDeclaration(SubSuperState subsuperstate) {
		subsuperstate.subSuperStateDeclarationNodes.forEach[it.delete]
		subsuperstate.getDeclaration.forEach[ declaration , i |
			subsuperstate.newSubSuperStateDeclarationNode(10,10 + 10*(i+1),subsuperstate.width-20,10)
			subsuperstate.subSuperStateDeclarationNodes.last.setDeclarationType(declaration.declarationType)
			subsuperstate.subSuperStateDeclarationNodes.last.setName(declaration.name)
			]
		subsuperstate.getSubSuperStateRegions.forEach[
			if(it.getSubSuperStates !== null){
				it.getSubSuperStates.forEach[ superState |
				setDeclaration(superState)
				]
			}
		]
	}
}
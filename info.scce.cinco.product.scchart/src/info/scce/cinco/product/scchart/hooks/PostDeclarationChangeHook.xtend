package info.scce.cinco.product.scchart.hooks

import info.scce.cinco.product.scchart.mglid.scchart.InitSCChart
import de.jabc.cinco.meta.runtime.action.CincoPostAttributeChangeHook
import org.eclipse.emf.ecore.EStructuralFeature

class PostDeclarationChangeHook extends CincoPostAttributeChangeHook<InitSCChart>{
	
	override canHandleChange(InitSCChart initChart, EStructuralFeature attribute) {
		true
	}
	
	override handleChange(InitSCChart initChart, EStructuralFeature attribute) {
		initChart.superStateDeclarationNodes.forEach[it.delete]
		initChart.getDeclaration.forEach[ declaration , i |
			initChart.newSuperStateDeclarationNode(10,10 + 10*(i+1),initChart.width-20,10)
			initChart.superStateDeclarationNodes.last.setInputOutput(declaration.inputOutput)
			initChart.superStateDeclarationNodes.last.setDeclarationType(declaration.declarationType)
			initChart.superStateDeclarationNodes.last.setName(declaration.name)
			]
	}
}
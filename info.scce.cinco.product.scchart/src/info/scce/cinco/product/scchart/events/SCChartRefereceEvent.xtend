// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventUserClassTemplate

package info.scce.cinco.product.scchart.events

import graphmodel.Direction
import graphmodel.ModelElementContainer
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece

/* 
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SCChartRefereceEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "SCChartReferece" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends SCChartReferece> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(SCChartReferece element)
 * - preMove(SCChartReferece element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(SCChartReferece element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(SCChartReferece element, String attribute, Object oldValue)
 * - postCreate(SCChartReferece element)
 * - postDelete(SCChartReferece element)
 * - postDoubleClick(SCChartReferece element)
 * - postMove(SCChartReferece element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(SCChartReferece element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(SCChartReferece element)
 */
final class SCChartRefereceEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SCChartRefereceEvent {
	
	override preCreate(Class<? extends SCChartReferece> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		// TODO: Auto-generated method stub
	}
	
	override preDelete(SCChartReferece element) {
		// TODO: Auto-generated method stub
	}
	
	override preMove(SCChartReferece element, ModelElementContainer newContainer, int newX, int newY) {
		// TODO: Auto-generated method stub
	}
	
	override preResize(SCChartReferece element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postAttributeChange(SCChartReferece element, String attribute, Object oldValue) {
		// TODO: Auto-generated method stub
	}
	
	override postCreate(SCChartReferece element) {
		if(element.reference.getDeclarations !== null){
//			element.reference.getDeclarations.forEach[ it ,index |
//				if(it.inputOutput!= ' '){
//					element.addInputsOutputs(it.inputOutput+ ' (assignment ' +index+ ')')
//					element.addAssignments('<insert assignment ' + index + '>')
//				} 
//			]
		}
		// TODO: Auto-generated method stub
	}
	
	override postDelete(SCChartReferece element) {
		// TODO: Auto-generated method stub
		// Set up your post delete Runnable here.
		// This will be executed pre delete.
		return [
			// This is your post delete Runnable.
			// This will be executed post delete.
		]
	}
	
	override postDoubleClick(SCChartReferece element) {
		// TODO: Auto-generated method stub
	}
	
	override postMove(SCChartReferece element, ModelElementContainer oldContainer, int oldX, int oldY) {
		// TODO: Auto-generated method stub
	}
	
	override postResize(SCChartReferece element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postSelect(SCChartReferece element) {
		// TODO: Auto-generated method stub
	}
	
}

// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventUserClassTemplate

package info.scce.cinco.product.scchart.events

import graphmodel.Direction
import graphmodel.ModelElementContainer
import info.scce.cinco.product.scchart.mglid.scchart.RootState

/* 
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.RootStateEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "RootState" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends RootState> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(RootState element)
 * - preMove(RootState element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(RootState element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(RootState element, String attribute, Object oldValue)
 * - postCreate(RootState element)
 * - postDelete(RootState element)
 * - postDoubleClick(RootState element)
 * - postMove(RootState element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(RootState element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(RootState element)
 */
final class RootStateEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.RootStateEvent {
	
	override preCreate(Class<? extends RootState> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		// TODO: Auto-generated method stub
	}
	
	override preDelete(RootState element) {
		// TODO: Auto-generated method stub
	}
	
	override preMove(RootState element, ModelElementContainer newContainer, int newX, int newY) {
		// TODO: Auto-generated method stub
	}
	
	override preResize(RootState element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postAttributeChange(RootState element, String attribute, Object oldValue) {
		element.rootStateDeclarationNodes.forEach[it.delete]
		element.getDeclaration.forEach[ declaration , i |
			element.newRootStateDeclarationNode(10,10 + 15*(i+1),element.width-20,15)
			element.rootStateDeclarationNodes.last.setInputOutput(declaration.inputOutput)
			element.rootStateDeclarationNodes.last.setDeclarationType(declaration.declarationType)
			element.rootStateDeclarationNodes.last.setName(declaration.name)
			]
	}
	
	override postCreate(RootState element) {
		element.newRegion(10,20,180,90)
	}
	
	override postDelete(RootState element) {
		// TODO: Auto-generated method stub
		// Set up your post delete Runnable here.
		// This will be executed pre delete.
		return [
			// This is your post delete Runnable.
			// This will be executed post delete.
		]
	}
	
	override postDoubleClick(RootState element) {
		// TODO: Auto-generated method stub
	}
	
	override postMove(RootState element, ModelElementContainer oldContainer, int oldX, int oldY) {
		// TODO: Auto-generated method stub
	}
	
	override postResize(RootState element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postSelect(RootState element) {
		// TODO: Auto-generated method stub
	}
	
}

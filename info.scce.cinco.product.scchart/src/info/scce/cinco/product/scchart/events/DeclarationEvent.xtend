// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventUserClassTemplate

package info.scce.cinco.product.scchart.events

import graphmodel.Direction
import graphmodel.ModelElementContainer
import info.scce.cinco.product.scchart.mglid.scchart.Declaration

/* 
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.DeclarationEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "Declaration" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Declaration> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Declaration element)
 * - preMove(Declaration element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Declaration element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Declaration element, String attribute, Object oldValue)
 * - postCreate(Declaration element)
 * - postDelete(Declaration element)
 * - postDoubleClick(Declaration element)
 * - postMove(Declaration element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Declaration element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Declaration element)
 */
final class DeclarationEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.DeclarationEvent {
	
	override preCreate(Class<? extends Declaration> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		// TODO: Auto-generated method stub
	}
	
	override preDelete(Declaration element) {
		// TODO: Auto-generated method stub
	}
	
	override preMove(Declaration element, ModelElementContainer newContainer, int newX, int newY) {
		// TODO: Auto-generated method stub
	}
	
	override preResize(Declaration element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postAttributeChange(Declaration element, String attribute, Object oldValue) {
		// TODO: Auto-generated method stub
	}
	
	override postCreate(Declaration element) {
		element.rootElement.rootStates.head.declarations.forEach[	declaration , index |
			declaration.x =10
			declaration.y =30+ 13*index
			declaration.width =element.rootElement.rootStates.head.width-20
			declaration.height = 13
		]
		if(element.rootElement.rootStates.head.suspends!==null){
			element.rootElement.rootStates.head.suspends.forEach[	suspend , index |
				suspend.x =10
				suspend.y =30+ 13*element.rootElement.rootStates.head.declarations.size+13*index
				suspend.width =element.rootElement.rootStates.head.width-20
				suspend.height = 13
			]
			if(element.rootElement.rootStates.head.regions!== null){
				for(region : element.rootElement.rootStates.head.regions){
					if(region.y<element.rootElement.rootStates.head.declarations.last.y+13||region.y<element.rootElement.rootStates.head.suspends.last.y+13){
						for(region1 : element.rootElement.rootStates.head.regions){
							region1.y = region1.y + 13
						}
						element.rootElement.rootStates.head.height = element.rootElement.rootStates.head.height + 13
					}
				}
			}
		}
		else{
			if(element.rootElement.rootStates.head.regions!== null){
				for(region : element.rootElement.rootStates.head.regions){
					if(region.y<element.rootElement.rootStates.head.declarations.last.y+13){
						for(region1 : element.rootElement.rootStates.head.regions){
							region1.y = region1.y + 13
						}
						element.rootElement.rootStates.head.height = element.rootElement.rootStates.head.height + 13
					}
				}
			}
		}
	}
	
	override postDelete(Declaration element) {
		// TODO: Auto-generated method stub
		// Set up your post delete Runnable here.
		// This will be executed pre delete.
		return [
			// This is your post delete Runnable.
			// This will be executed post delete.
		]
	}
	
	override postDoubleClick(Declaration element) {
		// TODO: Auto-generated method stub
	}
	
	override postMove(Declaration element, ModelElementContainer oldContainer, int oldX, int oldY) {
		// TODO: Auto-generated method stub
	}
	
	override postResize(Declaration element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postSelect(Declaration element) {
		// TODO: Auto-generated method stub
	}
	
}

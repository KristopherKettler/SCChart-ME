// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventUserClassTemplate

package info.scce.cinco.product.scchart.events

import graphmodel.Direction
import graphmodel.ModelElementContainer
import info.scce.cinco.product.scchart.mglid.scchart.SuperState
import info.scce.cinco.product.scchart.mglid.scchart.Suspend
import java.util.UUID

/* 
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SuspendEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "Suspend" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Suspend> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Suspend element)
 * - preMove(Suspend element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Suspend element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Suspend element, String attribute, Object oldValue)
 * - postCreate(Suspend element)
 * - postDelete(Suspend element)
 * - postDoubleClick(Suspend element)
 * - postMove(Suspend element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Suspend element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Suspend element)
 */
final class SuspendEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SuspendEvent {
	
	override preCreate(Class<? extends Suspend> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		// TODO: Auto-generated method stub
	}
	
	override preDelete(Suspend element) {
		// TODO: Auto-generated method stub
	}
	
	override preMove(Suspend element, ModelElementContainer newContainer, int newX, int newY) {
		// TODO: Auto-generated method stub
	}
	
	override preResize(Suspend element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postAttributeChange(Suspend element, String attribute, Object oldValue) {
		// TODO: Auto-generated method stub
	}
	
	override postCreate(Suspend element) {
		element.uuid=UUID.randomUUID.toString
		var boolean continue= false
		if(element.rootElement.rootStates.head.suspends!==null){
			for(suspend : element.rootElement.rootStates.head.suspends){
				if(suspend.uuid==element.uuid){
					var int declarationCount = 0
					if(element.rootElement.rootStates.head.declarations !== null){
						declarationCount=element.rootElement.getRootStates.head.declarations.size
					}
					for(var i = 0; i<element.rootElement.rootStates.head.suspends.size;i++){
						element.rootElement.rootStates.head.suspends.get(i).x=10
						element.rootElement.rootStates.head.suspends.get(i).y=30+13*declarationCount+13*i
						element.rootElement.rootStates.head.suspends.get(i).width=element.rootElement.rootStates.head.width-20
						element.rootElement.rootStates.head.suspends.get(i).height=13
					}
					if(element.rootElement.rootStates.head.actions !== null){
						for(action : element.rootElement.rootStates.head.actions){
							action.y = action.y + 13
						}
						declarationCount+=element.rootElement.getRootStates.head.actions.size
					}
					declarationCount+=element.rootElement.getRootStates.head.suspends.size
					if(element.rootElement.rootStates.head.regions!==null){
						for(region : element.rootElement.rootStates.head.regions){
							if(region.y<30+declarationCount*13){
								for(region1 : element.rootElement.rootStates.head.regions){
									region1.y = region1.y + 13
								}
								element.rootElement.rootStates.head.height = element.rootElement.rootStates.head.height + 13
							}
						}
					}
					continue = true
				}
			}
		}
		if(!continue){
			for(region : element.rootElement.rootStates.head.regions){
				if(region.superStates !== null){
					for(superState : region.superStates){
						postCreateSuspend(superState,element)
					}
				}
			}
		}
	}
	
	def postCreateSuspend(SuperState superState, Suspend suspend){
		var boolean continue = false
		if(superState.suspends !== null){
			for(suspendList : superState.suspends){
				if(suspendList.uuid==suspend.uuid){
					var int declarationCount = 0
					if(superState.declarations !== null){
						declarationCount=superState.declarations.size
					}
					for(var i = 0; i<superState.suspends.size;i++){
						superState.suspends.get(i).x=10
						superState.suspends.get(i).y=30+13*declarationCount+13*i
						superState.suspends.get(i).width=superState.width-20
						superState.suspends.get(i).height=13
					}
					if(superState.actions !== null){
						for(action : superState.actions){
							action.y = action.y + 13
						}
						declarationCount+=superState.actions.size
					}	
					declarationCount+=superState.suspends.size
					if(superState.regions!==null){
						for(region : superState.regions){
							if(region.y<30+declarationCount*13){
								for(region1 : superState.regions){
									region1.y = region1.y + 13
								}
								superState.height = superState.height + 13
							}
						}
					}
					continue = true
				}
			}
		}
		if(!continue && superState.regions!==null){
			for(region : superState.regions){
				if(region.superStates !== null){
					for(superStateList: region.superStates){
						postCreateSuspend(superStateList,suspend)
					}
				}
			}
		}
	}
	
	override postDelete(Suspend element) {
		var boolean continue= false
		if(element.rootElement.rootStates.head.suspends!==null){
			for(var j = 0; j<element.rootElement.rootStates.head.suspends.size;j++){
				if(element.rootElement.rootStates.head.suspends.get(j).uuid==element.uuid){
					var int declarationCount = 0
					if(element.rootElement.rootStates.head.declarations !== null){
						declarationCount=element.rootElement.getRootStates.head.declarations.size
					}
					for(var i = j; i<element.rootElement.rootStates.head.suspends.size;i++){
						element.rootElement.rootStates.head.suspends.get(i).y=element.rootElement.rootStates.head.suspends.get(i).y-13
					}
					if(element.rootElement.rootStates.head.actions !== null){
						for(action : element.rootElement.rootStates.head.actions){
							action.y = action.y - 13
						}
						declarationCount+=element.rootElement.getRootStates.head.actions.size
					}
					declarationCount+=element.rootElement.getRootStates.head.suspends.size
					if(element.rootElement.rootStates.head.regions!==null){
						for(region : element.rootElement.rootStates.head.regions){
							region.y = region.y - 13
						}
					}
					element.rootElement.rootStates.head.height = element.rootElement.rootStates.head.height - 13
					continue = true
				}
			}
		}
		if(!continue){
			for(region : element.rootElement.rootStates.head.regions){
				if(region.superStates !== null){
					for(superState : region.superStates){
						postDeleteSuspend(superState,element)
					}
				}
			}
		}
		// TODO: Auto-generated method stub
		// Set up your post delete Runnable here.
		// This will be executed pre delete.
		return [
			// This is your post delete Runnable.
			// This will be executed post delete.
		]
	}
	
	def postDeleteSuspend(SuperState superState, Suspend suspend){
		var boolean continue = false
		if(superState.suspends !== null){
			for(var j = 0; j<superState.suspends.size;j++){
				if(superState.suspends.get(j).uuid==suspend.uuid){
					var int declarationCount = 0
					if(superState.declarations !== null){
						declarationCount=superState.declarations.size
					}
					for(var i = j; i<superState.suspends.size;i++){
						superState.suspends.get(i).y=superState.suspends.get(i).y-13
					}
					if(superState.actions !== null){
						for(action : superState.actions){
							action.y = action.y - 13
						}
						declarationCount+=superState.actions.size
					}	
					declarationCount+=superState.suspends.size
					if(superState.regions!==null){
						for(region : superState.regions){
							region.y = region.y - 13
						}
					}
					superState.height = superState.height - 13
					continue = true
				}
			}
		}
		if(!continue && superState.regions!==null){
			for(region : superState.regions){
				if(region.superStates !== null){
					for(superStateList: region.superStates){
						postDeleteSuspend(superStateList,suspend)
					}
				}
			}
		}
	}
	
	override postDoubleClick(Suspend element) {
		// TODO: Auto-generated method stub
	}
	
	override postMove(Suspend element, ModelElementContainer oldContainer, int oldX, int oldY) {
		// TODO: Auto-generated method stub
	}
	
	override postResize(Suspend element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postSelect(Suspend element) {
		// TODO: Auto-generated method stub
	}
	
}

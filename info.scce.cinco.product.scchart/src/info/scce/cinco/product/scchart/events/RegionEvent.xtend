// Generated by de.jabc.cinco.meta.plugin.event.generator.template.EventUserClassTemplate

package info.scce.cinco.product.scchart.events

import graphmodel.Direction
import graphmodel.ModelElementContainer
import info.scce.cinco.product.scchart.mglid.scchart.Region
import java.util.UUID
import java.lang.Math
import info.scce.cinco.product.scchart.mglid.scchart.SuperState
import java.util.Arrays
import graphmodel.Container

/* 
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.RegionEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "Region" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Region> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Region element)
 * - preMove(Region element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Region element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Region element, String attribute, Object oldValue)
 * - postCreate(Region element)
 * - postDelete(Region element)
 * - postDoubleClick(Region element)
 * - postMove(Region element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Region element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Region element)
 */
final class RegionEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.RegionEvent {
	
	override preCreate(Class<? extends Region> elementClass, ModelElementContainer container, int x, int y, int width, int height) {
		// TODO: Auto-generated method stub
	}
	
	override preDelete(Region element) {
		// TODO: Auto-generated method stub
	}
	
	override preMove(Region element, ModelElementContainer newContainer, int newX, int newY) {
		// TODO: Auto-generated method stub
	}
	
	override preResize(Region element, int newWidth, int newHeight, int newX, int newY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postAttributeChange(Region element, String attribute, Object oldValue) {
		// TODO: Auto-generated method stub
	}
	
	override postCreate(Region element) {
		element.uuid=UUID.randomUUID.toString 
		element.getRootElement.getRootStates.head.getRegions.forEach[
			searchElement(element.getRootElement.getRootStates.head,it)
			//check if container contains region
			if(it.uuid==element.uuid){
				//if the region is the only one in the container
				if(element.getRootElement.getRootStates.head.getRegions.size==1){
					it.x=10
					it.y=30+element.getRootElement.getRootStates.head.getRootStateDeclarationNodes.size*13
					it.width=element.getRootElement.getRootStates.head.width-20
					it.height=element.getRootElement.getRootStates.head.height-40-element.getRootElement.getRootStates.head.getRootStateDeclarationNodes.size*13
				}
				else {
					//manual break
					var break = true
					for(region1 : element.getRootElement.getRootStates.head.getRegions){
						if((it.x-region1.x-region1.width<=13&&it.x-region1.x-region1.width>-1)&&break&&region1.y<it.y&&region1.y+region1.height>it.y &&it.uuid!=region1.uuid){
							region1.width = (region1.width - 10)/2
							it.width = region1.width
							it.height = region1.height
							it.x = region1.x+region1.width+10
							it.y = region1.y
							//legacy code for resize all regions on the same level
//							it.y=region1.y
//							it.height = region1.height
//							var countYHeight = 0
//							for(r : element.getRootElement.getRootStates.head.getRegions){
//								if(it.y==r.y){
//									countYHeight++f()
//								}
//							}
//							val containerWidth = (element.getRootElement.getRootStates.head.width-10-countYHeight*10)/countYHeight
//							val itOldX = it.x
//							var count = 0
//							for(region2: element.getRootElement.getRootStates.head.getRegions){
//								if(region2.y==it.y&&region2.x<itOldX){
//										region2.x = (containerWidth +10) *  count + 10  
//										region2.width = containerWidth 
//										count++
//									}
//							}
//							for(region2: element.getRootElement.getRootStates.head.getRegions){
//								if(region2.y==it.y&&region2.x>itOldX){
//										region2.x = (containerWidth + 10) * count + 10  
//										region2.width = containerWidth 
//										count++
//									}
//							}
//							for(region2: element.getRootElement.getRootStates.head.getRegions){
//								if(region2.y==it.y&&region2.x==itOldX){
//										region2.x = (containerWidth + 10 ) * count + 10  
//										region2.width = containerWidth 
//										count++
//									}
//							}
							break = false
						}
						else if((region1.x-it.x<=13&&region1.x-it.x>-1)&&break&&region1.y<it.y&&region1.y+region1.height>it.y &&it.uuid!=region1.uuid){
							region1.width = (region1.width - 10)/2
							it.width = region1.width
							it.height = region1.height
							it.x = region1.x
							it.y = region1.y
							region1.x= region1.x + region1.width+10
							break = false
						}
						else if((it.y-region1.y-region1.height<=13&&it.y-region1.y-region1.height>-1)&&break&&region1.x<it.x&&region1.x+region1.width>it.x &&it.uuid!=region1.uuid){
							region1.height = (region1.height - 10)/2
							it.width = region1.width
							it.height = region1.height
							it.x = region1.x
							it.y = region1.y+region1.height+10
							//legacy code for resize all regions on the same level
//							it.x=region1.x
//							it.width = region1.width
//							var countXWidth = 0
//							for(r : element.getRootElement.getRootStates.head.getRegions){
//								if(it.x==r.x){
//									countXWidth++
//								}
//							}
//							val containerHeight = (element.getRootElement.getRootStates.head.height-30-13*element.getRootElement.getRootStates.head.getRootStateDeclarationNodes.size-countXWidth*10)/countXWidth
//							val itOldY = it.y
//							var count = 0
//							for(region2: element.getRootElement.getRootStates.head.getRegions){
//								if(region2.x==it.x&&region2.y<itOldY){
//										region2.y = (containerHeight +10) *  count + 30-13*element.getRootElement.getRootStates.head.getRootStateDeclarationNodes.size 
//										region2.height = containerHeight 
//										count++
//									}
//							}
//							for(region2: element.getRootElement.getRootStates.head.getRegions){
//								if(region2.x==it.x&&region2.y>itOldY){
//										region2.y = (containerHeight + 10) * count + 30-13*element.getRootElement.getRootStates.head.getRootStateDeclarationNodes.size
//										region2.height = containerHeight 
//										count++
//									}
//							}
//							for(region2: element.getRootElement.getRootStates.head.getRegions){
//								if(region2.x==it.x&&region2.y==itOldY){
//										region2.y = (containerHeight + 10 ) * count + 30-13*element.getRootElement.getRootStates.head.getRootStateDeclarationNodes.size
//										region2.height = containerHeight 
//										count++
//									}
//							}
							break = false
						}
						else if((region1.y-it.y<=13&&region1.y-it.y>-1)&&break&&region1.x<it.x&&region1.x+region1.width>it.x &&it.uuid!=region1.uuid){
							region1.height = (region1.height - 10)/2
							it.width = region1.width
							it.height = region1.height
							it.x = region1.x
							it.y = region1.y
							region1.y = region1.y +region1.height+10
							break = false
						}
						else if((region1.y-it.y<=13&&region1.y-it.y>-1)&&break&&region1.x<it.x&&region1.x+region1.width>it.x &&it.uuid!=region1.uuid){
							
						}
					}
//				element.width = element.getRootElement.getRootStates.head.width-20
//				element.height = 100
//				element.moveTo(element.getRootElement.getRootStates.head,10,element.getRootElement.getRootStates.head.height)
//				element.getRootElement.getRootStates.head.width = element.getRootElement.getRootStates.head.width
//				element.getRootElement.getRootStates.head.height = element.getRootElement.getRootStates.head.height+110
				
				}
				
			}
			else{
				if(it.getSuperStates!=null)	{
					for(superState : it.getSuperStates){
						if(superState.getRegions!=null){
							for(region : superState.getRegions){
								searchElement(superState,region)
							}
						}
					}
				}
			}
		]// TODO: Auto-generated method stub
	}
	
	def searchElement(Container superState,Region element){
		// TODO: rekursiv postCreate
	}
	
	override postDelete(Region element) {
		// TODO: Auto-generated method stub
		// Set up your post delete Runnable here.
		// This will be executed pre delete.
		return [
			// This is your post delete Runnable.
			// This will be executed post delete.
		]
	}
	
	override postDoubleClick(Region element) {
		// TODO: Auto-generated method stub
	}
	
	override postMove(Region element, ModelElementContainer oldContainer, int oldX, int oldY) {
//		if(element.x>0&&element.x<11){
//			
//		} 
//		element.getRootElement.getRootStates.head.getRegions.forEach[
//			if(it.uuid==element.uuid){
//				element.width = element.getRootElement.getRootStates.head.width-20
//				element.height = 100
//				element.moveTo(element.getRootElement.getRootStates.head,10,element.getRootElement.getRootStates.head.height)
//				element.getRootElement.getRootStates.head.width = element.getRootElement.getRootStates.head.width
//				element.getRootElement.getRootStates.head.height = element.getRootElement.getRootStates.head.height+110
//			}
//		]// TODO: Auto-generated method stub
	}
	
	override postResize(Region element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction) {
		// TODO: Auto-generated method stub
	}
	
	override postSelect(Region element) {
		// TODO: Auto-generated method stub
	}
	
}

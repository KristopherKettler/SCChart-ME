package info.scce.cinco.product.scchart.events;

import graphmodel.Container;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Region;

/**
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
@SuppressWarnings("all")
public final class RegionEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.RegionEvent {
  @Override
  public void preCreate(final Class<? extends Region> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final Region element) {
  }
  
  @Override
  public void preMove(final Region element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final Region element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final Region element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final Region element) {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \')\'");
  }
  
  public Object searchElement(final Container superState, final Region element) {
    return null;
  }
  
  @Override
  public Runnable postDelete(final Region element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final Region element) {
  }
  
  @Override
  public void postMove(final Region element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final Region element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final Region element) {
  }
}

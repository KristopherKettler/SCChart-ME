package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateRegionEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "SuperStateRegion" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends SuperStateRegion> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(SuperStateRegion element)
 * - preMove(SuperStateRegion element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(SuperStateRegion element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(SuperStateRegion element, String attribute, Object oldValue)
 * - postCreate(SuperStateRegion element)
 * - postDelete(SuperStateRegion element)
 * - postDoubleClick(SuperStateRegion element)
 * - postMove(SuperStateRegion element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(SuperStateRegion element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(SuperStateRegion element)
 */
@SuppressWarnings("all")
public final class SuperStateRegionEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateRegionEvent {
  @Override
  public void preCreate(final Class<? extends SuperStateRegion> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final SuperStateRegion element) {
  }
  
  @Override
  public void preMove(final SuperStateRegion element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final SuperStateRegion element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final SuperStateRegion element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final SuperStateRegion element) {
  }
  
  @Override
  public Runnable postDelete(final SuperStateRegion element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final SuperStateRegion element) {
  }
  
  @Override
  public void postMove(final SuperStateRegion element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final SuperStateRegion element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final SuperStateRegion element) {
  }
}

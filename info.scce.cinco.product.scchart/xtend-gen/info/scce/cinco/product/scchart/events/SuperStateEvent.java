package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "SuperState" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends SuperState> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(SuperState element)
 * - preMove(SuperState element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(SuperState element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(SuperState element, String attribute, Object oldValue)
 * - postCreate(SuperState element)
 * - postDelete(SuperState element)
 * - postDoubleClick(SuperState element)
 * - postMove(SuperState element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(SuperState element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(SuperState element)
 */
@SuppressWarnings("all")
public final class SuperStateEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateEvent {
  @Override
  public void preCreate(final Class<? extends SuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final SuperState element) {
  }
  
  @Override
  public void preMove(final SuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final SuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final SuperState element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final SuperState element) {
  }
  
  @Override
  public Runnable postDelete(final SuperState element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final SuperState element) {
  }
  
  @Override
  public void postMove(final SuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final SuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final SuperState element) {
  }
}

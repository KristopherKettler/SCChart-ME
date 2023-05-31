package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;

/**
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
@SuppressWarnings("all")
public final class RootStateEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.RootStateEvent {
  @Override
  public void preCreate(final Class<? extends RootState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final RootState element) {
  }
  
  @Override
  public void preMove(final RootState element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final RootState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final RootState element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final RootState element) {
  }
  
  @Override
  public Runnable postDelete(final RootState element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final RootState element) {
  }
  
  @Override
  public void postMove(final RootState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final RootState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final RootState element) {
  }
}

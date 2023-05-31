package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperState;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SubSuperStateEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "SubSuperState" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends SubSuperState> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(SubSuperState element)
 * - preMove(SubSuperState element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(SubSuperState element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(SubSuperState element, String attribute, Object oldValue)
 * - postCreate(SubSuperState element)
 * - postDelete(SubSuperState element)
 * - postDoubleClick(SubSuperState element)
 * - postMove(SubSuperState element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(SubSuperState element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(SubSuperState element)
 */
@SuppressWarnings("all")
public final class SubSuperStateEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SubSuperStateEvent {
  @Override
  public void preCreate(final Class<? extends SubSuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final SubSuperState element) {
  }
  
  @Override
  public void preMove(final SubSuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final SubSuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final SubSuperState element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final SubSuperState element) {
  }
  
  @Override
  public Runnable postDelete(final SubSuperState element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final SubSuperState element) {
  }
  
  @Override
  public void postMove(final SubSuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final SubSuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final SubSuperState element) {
  }
}

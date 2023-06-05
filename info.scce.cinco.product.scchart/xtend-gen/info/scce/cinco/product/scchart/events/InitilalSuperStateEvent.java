package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.InitilalSuperStateEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "InitilalSuperState" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Edit this class:
 * - If you wish InitilalSuperState to react the same way as its super class SuperState,
 *   you may delete the method or leave it as is (with only the super call).
 * - If you wish to only add functionality, leave the super call in the
 *   corresponding method and add your code to it.
 * - If you wish to break the inheritance chain, remove the super call, but do
 *   not delete the corresponding method. You may leave it empty or write new
 *   code.
 * 
 * Available event methods:
 * - preCreate(Class<? extends InitilalSuperState> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(InitilalSuperState element)
 * - preMove(InitilalSuperState element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(InitilalSuperState element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(InitilalSuperState element, String attribute, Object oldValue)
 * - postCreate(InitilalSuperState element)
 * - postDelete(InitilalSuperState element)
 * - postDoubleClick(InitilalSuperState element)
 * - postMove(InitilalSuperState element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(InitilalSuperState element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(InitilalSuperState element)
 */
@SuppressWarnings("all")
public final class InitilalSuperStateEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.InitilalSuperStateEvent {
  @Override
  public void preCreate(final Class<? extends InitilalSuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
    super.preCreate(elementClass, container, x, y, width, height);
  }
  
  @Override
  public void preDelete(final InitilalSuperState element) {
    super.preDelete(element);
  }
  
  @Override
  public void preMove(final InitilalSuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
    super.preMove(element, newContainer, newX, newY);
  }
  
  @Override
  public void preResize(final InitilalSuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
    super.preResize(element, newWidth, newHeight, newX, newY, direction);
  }
  
  @Override
  public void postAttributeChange(final InitilalSuperState element, final String attribute, final Object oldValue) {
    super.postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public void postCreate(final InitilalSuperState element) {
    super.postCreate(element);
  }
  
  @Override
  public Runnable postDelete(final InitilalSuperState element) {
    final Runnable superPostDelete = super.postDelete(element);
    final Runnable _function = () -> {
      superPostDelete.run();
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final InitilalSuperState element) {
    super.postDoubleClick(element);
  }
  
  @Override
  public void postMove(final InitilalSuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
    super.postMove(element, oldContainer, oldX, oldY);
  }
  
  @Override
  public void postResize(final InitilalSuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    super.postResize(element, oldWidth, oldHeight, oldX, oldY, direction);
  }
  
  @Override
  public void postSelect(final InitilalSuperState element) {
    super.postSelect(element);
  }
}

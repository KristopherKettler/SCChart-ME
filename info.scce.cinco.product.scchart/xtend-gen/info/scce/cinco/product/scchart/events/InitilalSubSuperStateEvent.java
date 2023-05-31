package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.InitilalSubSuperStateEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "InitilalSubSuperState" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Edit this class:
 * - If you wish InitilalSubSuperState to react the same way as its super class SubSuperState,
 *   you may delete the method or leave it as is (with only the super call).
 * - If you wish to only add functionality, leave the super call in the
 *   corresponding method and add your code to it.
 * - If you wish to break the inheritance chain, remove the super call, but do
 *   not delete the corresponding method. You may leave it empty or write new
 *   code.
 * 
 * Available event methods:
 * - preCreate(Class<? extends InitilalSubSuperState> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(InitilalSubSuperState element)
 * - preMove(InitilalSubSuperState element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(InitilalSubSuperState element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(InitilalSubSuperState element, String attribute, Object oldValue)
 * - postCreate(InitilalSubSuperState element)
 * - postDelete(InitilalSubSuperState element)
 * - postDoubleClick(InitilalSubSuperState element)
 * - postMove(InitilalSubSuperState element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(InitilalSubSuperState element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(InitilalSubSuperState element)
 */
@SuppressWarnings("all")
public final class InitilalSubSuperStateEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.InitilalSubSuperStateEvent {
  @Override
  public void preCreate(final Class<? extends InitilalSubSuperState> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
    super.preCreate(elementClass, container, x, y, width, height);
  }
  
  @Override
  public void preDelete(final InitilalSubSuperState element) {
    super.preDelete(element);
  }
  
  @Override
  public void preMove(final InitilalSubSuperState element, final ModelElementContainer newContainer, final int newX, final int newY) {
    super.preMove(element, newContainer, newX, newY);
  }
  
  @Override
  public void preResize(final InitilalSubSuperState element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
    super.preResize(element, newWidth, newHeight, newX, newY, direction);
  }
  
  @Override
  public void postAttributeChange(final InitilalSubSuperState element, final String attribute, final Object oldValue) {
    super.postAttributeChange(element, attribute, oldValue);
  }
  
  @Override
  public void postCreate(final InitilalSubSuperState element) {
    super.postCreate(element);
  }
  
  @Override
  public Runnable postDelete(final InitilalSubSuperState element) {
    final Runnable superPostDelete = super.postDelete(element);
    final Runnable _function = () -> {
      superPostDelete.run();
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final InitilalSubSuperState element) {
    super.postDoubleClick(element);
  }
  
  @Override
  public void postMove(final InitilalSubSuperState element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
    super.postMove(element, oldContainer, oldX, oldY);
  }
  
  @Override
  public void postResize(final InitilalSubSuperState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    super.postResize(element, oldWidth, oldHeight, oldX, oldY, direction);
  }
  
  @Override
  public void postSelect(final InitilalSubSuperState element) {
    super.postSelect(element);
  }
}

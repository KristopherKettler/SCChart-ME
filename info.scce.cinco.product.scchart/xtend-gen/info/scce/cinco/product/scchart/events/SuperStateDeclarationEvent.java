package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateDeclarationEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "SuperStateDeclaration" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends SuperStateDeclaration> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(SuperStateDeclaration element)
 * - preMove(SuperStateDeclaration element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(SuperStateDeclaration element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(SuperStateDeclaration element, String attribute, Object oldValue)
 * - postCreate(SuperStateDeclaration element)
 * - postDelete(SuperStateDeclaration element)
 * - postDoubleClick(SuperStateDeclaration element)
 * - postMove(SuperStateDeclaration element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(SuperStateDeclaration element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(SuperStateDeclaration element)
 */
@SuppressWarnings("all")
public final class SuperStateDeclarationEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateDeclarationEvent {
  @Override
  public void preCreate(final Class<? extends SuperStateDeclaration> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final SuperStateDeclaration element) {
  }
  
  @Override
  public void preMove(final SuperStateDeclaration element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final SuperStateDeclaration element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final SuperStateDeclaration element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final SuperStateDeclaration element) {
  }
  
  @Override
  public Runnable postDelete(final SuperStateDeclaration element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final SuperStateDeclaration element) {
  }
  
  @Override
  public void postMove(final SuperStateDeclaration element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final SuperStateDeclaration element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final SuperStateDeclaration element) {
  }
}

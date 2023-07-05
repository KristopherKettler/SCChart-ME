package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Action;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.ActionEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "Action" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Action> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Action element)
 * - preMove(Action element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Action element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Action element, String attribute, Object oldValue)
 * - postCreate(Action element)
 * - postDelete(Action element)
 * - postDoubleClick(Action element)
 * - postMove(Action element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Action element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Action element)
 */
@SuppressWarnings("all")
public final class ActionEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.ActionEvent {
  @Override
  public void preCreate(final Class<? extends Action> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final Action element) {
  }
  
  @Override
  public void preMove(final Action element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final Action element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final Action element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final Action element) {
  }
  
  @Override
  public Runnable postDelete(final Action element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final Action element) {
  }
  
  @Override
  public void postMove(final Action element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final Action element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final Action element) {
  }
}

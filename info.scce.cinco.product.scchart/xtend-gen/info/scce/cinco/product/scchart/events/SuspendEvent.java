package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SuspendEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "Suspend" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Suspend> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Suspend element)
 * - preMove(Suspend element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Suspend element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Suspend element, String attribute, Object oldValue)
 * - postCreate(Suspend element)
 * - postDelete(Suspend element)
 * - postDoubleClick(Suspend element)
 * - postMove(Suspend element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Suspend element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Suspend element)
 */
@SuppressWarnings("all")
public final class SuspendEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SuspendEvent {
  @Override
  public void preCreate(final Class<? extends Suspend> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final Suspend element) {
  }
  
  @Override
  public void preMove(final Suspend element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final Suspend element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final Suspend element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final Suspend element) {
    final Procedure2<RootStateDeclaration, Integer> _function = (RootStateDeclaration declaration, Integer index) -> {
      declaration.setX(10);
      declaration.setY((30 + (13 * (index).intValue())));
      int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
      int _minus = (_width - 20);
      declaration.setWidth(_minus);
      declaration.setHeight(13);
    };
    IterableExtensions.<RootStateDeclaration>forEach(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations(), _function);
    final Procedure2<Suspend, Integer> _function_1 = (Suspend suspend, Integer index) -> {
      suspend.setX(10);
      int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations().size();
      int _multiply = (13 * _size);
      int _plus = (30 + _multiply);
      int _plus_1 = (_plus + (13 * (index).intValue()));
      suspend.setY(_plus_1);
      int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
      int _minus = (_width - 20);
      suspend.setWidth(_minus);
      suspend.setHeight(13);
    };
    IterableExtensions.<Suspend>forEach(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends(), _function_1);
  }
  
  @Override
  public Runnable postDelete(final Suspend element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final Suspend element) {
  }
  
  @Override
  public void postMove(final Suspend element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final Suspend element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final Suspend element) {
  }
}

package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
    int _width = element.getWidth();
    int _minus = (_width - 20);
    int _height = element.getHeight();
    int _minus_1 = (_height - 40);
    element.newRegion(10, 30, _minus, _minus_1);
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
    EList<RootStateDeclaration> _rootStateDeclarations = element.getRootStateDeclarations();
    for (final RootStateDeclaration declaration : _rootStateDeclarations) {
      int _width = element.getWidth();
      int _minus = (_width - 20);
      declaration.setWidth(_minus);
    }
    EList<Suspend> _suspends = element.getSuspends();
    for (final Suspend suspend : _suspends) {
      int _width_1 = element.getWidth();
      int _minus_1 = (_width_1 - 20);
      suspend.setWidth(_minus_1);
    }
    EList<Region> _regions = element.getRegions();
    for (final Region region : _regions) {
      {
        int _x = element.getX();
        boolean _notEquals = (oldX != _x);
        if (_notEquals) {
          int _x_1 = region.getX();
          boolean _lessThan = (_x_1 < 12);
          if (_lessThan) {
            int _width_2 = region.getWidth();
            int _x_2 = element.getX();
            int _minus_2 = (oldX - _x_2);
            int _plus = (_width_2 + _minus_2);
            region.setWidth(_plus);
          } else {
            int _x_3 = region.getX();
            int _x_4 = element.getX();
            int _minus_3 = (oldX - _x_4);
            int _plus_1 = (_x_3 + _minus_3);
            region.setX(_plus_1);
          }
        }
        int _y = element.getY();
        boolean _notEquals_1 = (oldY != _y);
        if (_notEquals_1) {
          int _y_1 = region.getY();
          int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations().size();
          int _multiply = (_size * 13);
          int _plus_2 = (35 + _multiply);
          int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
          int _multiply_1 = (_size_1 * 13);
          int _plus_3 = (_plus_2 + _multiply_1);
          boolean _lessThan_1 = (_y_1 < _plus_3);
          if (_lessThan_1) {
            int _height = region.getHeight();
            int _y_2 = element.getY();
            int _minus_4 = (oldY - _y_2);
            int _plus_4 = (_height + _minus_4);
            region.setHeight(_plus_4);
          } else {
            int _y_3 = region.getY();
            int _y_4 = element.getY();
            int _minus_5 = (oldY - _y_4);
            int _plus_5 = (_y_3 + _minus_5);
            region.setY(_plus_5);
          }
        }
        if (((oldX == element.getX()) && (oldWidth != element.getWidth()))) {
          int _x_5 = region.getX();
          int _width_3 = region.getWidth();
          int _plus_6 = (_x_5 + _width_3);
          int _minus_6 = (oldWidth - _plus_6);
          boolean _lessThan_2 = (_minus_6 < 12);
          if (_lessThan_2) {
            int _width_4 = region.getWidth();
            int _width_5 = element.getWidth();
            int _minus_7 = (_width_5 - oldWidth);
            int _plus_7 = (_width_4 + _minus_7);
            region.setWidth(_plus_7);
          }
        }
        if (((oldY == element.getY()) && (oldHeight != element.getHeight()))) {
          int _y_5 = region.getY();
          int _height_1 = region.getHeight();
          int _plus_8 = (_y_5 + _height_1);
          int _minus_8 = (oldHeight - _plus_8);
          boolean _lessThan_3 = (_minus_8 < 12);
          if (_lessThan_3) {
            int _height_2 = region.getHeight();
            int _height_3 = element.getHeight();
            int _minus_9 = (_height_3 - oldHeight);
            int _plus_9 = (_height_2 + _minus_9);
            region.setHeight(_plus_9);
          }
        }
      }
    }
  }
  
  @Override
  public void postSelect(final RootState element) {
  }
}

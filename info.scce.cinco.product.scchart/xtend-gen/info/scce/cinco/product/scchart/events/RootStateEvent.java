package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
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
  public void postCreate(final RootState element) {
    int _width = element.getWidth();
    int _minus = (_width - 20);
    int _height = element.getHeight();
    int _minus_1 = (_height - 40);
    element.newRegion(10, 33, _minus, _minus_1);
  }
  
  @Override
  public void postResize(final RootState element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
    EList<Declaration> _declarations = element.getDeclarations();
    boolean _tripleNotEquals = (_declarations != null);
    if (_tripleNotEquals) {
      EList<Declaration> _declarations_1 = element.getDeclarations();
      for (final Declaration declaration : _declarations_1) {
        int _width = element.getWidth();
        int _minus = (_width - 20);
        declaration.setWidth(_minus);
      }
    }
    EList<Suspend> _suspends = element.getSuspends();
    boolean _tripleNotEquals_1 = (_suspends != null);
    if (_tripleNotEquals_1) {
      EList<Suspend> _suspends_1 = element.getSuspends();
      for (final Suspend suspend : _suspends_1) {
        int _width_1 = element.getWidth();
        int _minus_1 = (_width_1 - 20);
        suspend.setWidth(_minus_1);
      }
    }
    EList<Action> _actions = element.getActions();
    boolean _tripleNotEquals_2 = (_actions != null);
    if (_tripleNotEquals_2) {
      EList<Action> _actions_1 = element.getActions();
      for (final Action action : _actions_1) {
        int _width_2 = element.getWidth();
        int _minus_2 = (_width_2 - 20);
        action.setWidth(_minus_2);
      }
    }
    EList<Region> _regions = element.getRegions();
    boolean _tripleNotEquals_3 = (_regions != null);
    if (_tripleNotEquals_3) {
      EList<Region> _regions_1 = element.getRegions();
      for (final Region region : _regions_1) {
        {
          int _x = element.getX();
          boolean _notEquals = (oldX != _x);
          if (_notEquals) {
            int _x_1 = region.getX();
            boolean _lessThan = (_x_1 < 12);
            if (_lessThan) {
              int _width_3 = region.getWidth();
              int _x_2 = element.getX();
              int _minus_3 = (oldX - _x_2);
              int _plus = (_width_3 + _minus_3);
              region.setWidth(_plus);
            } else {
              int _x_3 = region.getX();
              int _x_4 = element.getX();
              int _minus_4 = (oldX - _x_4);
              int _plus_1 = (_x_3 + _minus_4);
              region.setX(_plus_1);
            }
          }
          int _y = element.getY();
          boolean _notEquals_1 = (oldY != _y);
          if (_notEquals_1) {
            int _y_1 = region.getY();
            int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size();
            int _multiply = (_size * 13);
            int _plus_2 = (35 + _multiply);
            int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
            int _multiply_1 = (_size_1 * 13);
            int _plus_3 = (_plus_2 + _multiply_1);
            int _size_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size();
            int _multiply_2 = (_size_2 * 13);
            int _plus_4 = (_plus_3 + _multiply_2);
            boolean _lessThan_1 = (_y_1 < _plus_4);
            if (_lessThan_1) {
              int _height = region.getHeight();
              int _y_2 = element.getY();
              int _minus_5 = (oldY - _y_2);
              int _plus_5 = (_height + _minus_5);
              region.setHeight(_plus_5);
            } else {
              int _y_3 = region.getY();
              int _y_4 = element.getY();
              int _minus_6 = (oldY - _y_4);
              int _plus_6 = (_y_3 + _minus_6);
              region.setY(_plus_6);
            }
          }
          if (((oldX == element.getX()) && (oldWidth != element.getWidth()))) {
            int _x_5 = region.getX();
            int _width_4 = region.getWidth();
            int _plus_7 = (_x_5 + _width_4);
            int _minus_7 = (oldWidth - _plus_7);
            boolean _lessThan_2 = (_minus_7 < 12);
            if (_lessThan_2) {
              int _width_5 = region.getWidth();
              int _width_6 = element.getWidth();
              int _minus_8 = (_width_6 - oldWidth);
              int _plus_8 = (_width_5 + _minus_8);
              region.setWidth(_plus_8);
            }
          }
          if (((oldY == element.getY()) && (oldHeight != element.getHeight()))) {
            int _y_5 = region.getY();
            int _height_1 = region.getHeight();
            int _plus_9 = (_y_5 + _height_1);
            int _minus_9 = (oldHeight - _plus_9);
            boolean _lessThan_3 = (_minus_9 < 12);
            if (_lessThan_3) {
              int _height_2 = region.getHeight();
              int _height_3 = element.getHeight();
              int _minus_10 = (_height_3 - oldHeight);
              int _plus_10 = (_height_2 + _minus_10);
              region.setHeight(_plus_10);
            }
          }
        }
      }
    }
  }
}

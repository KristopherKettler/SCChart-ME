package info.scce.cinco.product.scchart.events;

import com.google.common.base.Objects;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.RegionEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "Region" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Region> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Region element)
 * - preMove(Region element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Region element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Region element, String attribute, Object oldValue)
 * - postCreate(Region element)
 * - postDelete(Region element)
 * - postDoubleClick(Region element)
 * - postMove(Region element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Region element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Region element)
 */
@SuppressWarnings("all")
public final class RegionEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.RegionEvent {
  @Override
  public void preCreate(final Class<? extends Region> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final Region element) {
  }
  
  @Override
  public void preMove(final Region element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final Region element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final Region element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final Region element) {
    element.setUuid(UUID.randomUUID().toString());
    boolean regionFound = false;
    EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
    for (final Region it : _regions) {
      String _uuid = it.getUuid();
      String _uuid_1 = element.getUuid();
      boolean _equals = Objects.equal(_uuid, _uuid_1);
      if (_equals) {
        regionFound = true;
        boolean break_ = true;
        int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions().size();
        boolean _equals_1 = (_size == 1);
        if (_equals_1) {
          it.setX(10);
          int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations().size();
          int _multiply = (_size_1 * 13);
          int _plus = (33 + _multiply);
          int _size_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
          int _multiply_1 = (_size_2 * 13);
          int _plus_1 = (_plus + _multiply_1);
          it.setY(_plus_1);
          int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
          int _minus = (_width - 20);
          it.setWidth(_minus);
          int _height = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
          int _minus_1 = (_height - 43);
          int _size_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations().size();
          int _multiply_2 = (_size_3 * 13);
          int _minus_2 = (_minus_1 - _multiply_2);
          int _size_4 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
          int _multiply_3 = (_size_4 * 13);
          int _plus_2 = (_minus_2 + _multiply_3);
          it.setHeight(_plus_2);
        } else {
          EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          for (final Region region1 : _regions_1) {
            if (((((((((it.getX() - region1.getX()) - region1.getWidth()) <= 13) && (((it.getX() - region1.getX()) - region1.getWidth()) > (-3))) && break_) && (region1.getY() < it.getY())) && ((region1.getY() + region1.getHeight()) > it.getY())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
              int _width_1 = region1.getWidth();
              int _minus_3 = (_width_1 - 10);
              int _divide = (_minus_3 / 2);
              region1.setWidth(_divide);
              it.setWidth(region1.getWidth());
              it.setHeight(region1.getHeight());
              int _x = region1.getX();
              int _width_2 = region1.getWidth();
              int _plus_3 = (_x + _width_2);
              int _plus_4 = (_plus_3 + 10);
              it.setX(_plus_4);
              it.setY(region1.getY());
              break_ = false;
            } else {
              if ((((((((region1.getX() - it.getX()) <= 13) && ((region1.getX() - it.getX()) > (-3))) && break_) && (region1.getY() < it.getY())) && ((region1.getY() + region1.getHeight()) > it.getY())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
                int _width_3 = region1.getWidth();
                int _minus_4 = (_width_3 - 10);
                int _divide_1 = (_minus_4 / 2);
                region1.setWidth(_divide_1);
                it.setWidth(region1.getWidth());
                it.setHeight(region1.getHeight());
                it.setX(region1.getX());
                it.setY(region1.getY());
                int _x_1 = region1.getX();
                int _width_4 = region1.getWidth();
                int _plus_5 = (_x_1 + _width_4);
                int _plus_6 = (_plus_5 + 10);
                region1.setX(_plus_6);
                break_ = false;
              } else {
                if (((((((((it.getY() - region1.getY()) - region1.getHeight()) <= 13) && (((it.getY() - region1.getY()) - region1.getHeight()) > (-1))) && break_) && (region1.getX() < it.getX())) && ((region1.getX() + region1.getWidth()) > it.getX())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
                  int _height_1 = region1.getHeight();
                  int _minus_5 = (_height_1 - 10);
                  int _divide_2 = (_minus_5 / 2);
                  region1.setHeight(_divide_2);
                  it.setWidth(region1.getWidth());
                  it.setHeight(region1.getHeight());
                  it.setX(region1.getX());
                  int _y = region1.getY();
                  int _height_2 = region1.getHeight();
                  int _plus_7 = (_y + _height_2);
                  int _plus_8 = (_plus_7 + 10);
                  it.setY(_plus_8);
                  break_ = false;
                } else {
                  if ((((((((region1.getY() - it.getY()) <= 13) && ((region1.getY() - it.getY()) > (-1))) && break_) && (region1.getX() < it.getX())) && ((region1.getX() + region1.getWidth()) > it.getX())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
                    int _height_3 = region1.getHeight();
                    int _minus_6 = (_height_3 - 10);
                    int _divide_3 = (_minus_6 / 2);
                    region1.setHeight(_divide_3);
                    it.setWidth(region1.getWidth());
                    it.setHeight(region1.getHeight());
                    it.setX(region1.getX());
                    it.setY(region1.getY());
                    int _y_1 = region1.getY();
                    int _height_4 = region1.getHeight();
                    int _plus_9 = (_y_1 + _height_4);
                    int _plus_10 = (_plus_9 + 10);
                    region1.setY(_plus_10);
                    break_ = false;
                  }
                }
              }
            }
          }
          if (break_) {
            EList<Region> _regions_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region1_1 : _regions_2) {
              if (((((((it.getY() - region1_1.getY()) - region1_1.getHeight()) <= 13) && (((it.getY() - region1_1.getY()) - region1_1.getHeight()) > (-1))) && break_) && (!Objects.equal(it.getUuid(), region1_1.getUuid())))) {
                EList<Region> _regions_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
                for (final Region region2 : _regions_3) {
                  int _y_2 = region2.getY();
                  int _y_3 = it.getY();
                  int _minus_7 = (_y_3 - 3);
                  boolean _greaterThan = (_y_2 > _minus_7);
                  if (_greaterThan) {
                    int _y_4 = region2.getY();
                    int _plus_11 = (_y_4 + 160);
                    region2.setY(_plus_11);
                  }
                }
                RootState _head = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
                int _height_5 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
                int _plus_12 = (_height_5 + 160);
                _head.setHeight(_plus_12);
                int _y_5 = region1_1.getY();
                int _height_6 = region1_1.getHeight();
                int _plus_13 = (_y_5 + _height_6);
                int _plus_14 = (_plus_13 + 10);
                it.setY(_plus_14);
                it.setX(10);
                it.setHeight(150);
                int _width_5 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
                int _minus_8 = (_width_5 - 20);
                it.setWidth(_minus_8);
                break_ = false;
              } else {
                if (break_) {
                  int declarationCount = 0;
                  EList<RootStateDeclaration> _rootStateDeclarations = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations();
                  boolean _tripleNotEquals = (_rootStateDeclarations != null);
                  if (_tripleNotEquals) {
                    int _declarationCount = declarationCount;
                    int _size_5 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations().size();
                    declarationCount = (_declarationCount + _size_5);
                  }
                  EList<Suspend> _suspends = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
                  boolean _tripleNotEquals_1 = (_suspends != null);
                  if (_tripleNotEquals_1) {
                    int _declarationCount_1 = declarationCount;
                    int _size_6 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
                    declarationCount = (_declarationCount_1 + _size_6);
                  }
                  EList<Action> _actions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
                  boolean _tripleNotEquals_2 = (_actions != null);
                  if (_tripleNotEquals_2) {
                    int _declarationCount_2 = declarationCount;
                    int _size_7 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size();
                    declarationCount = (_declarationCount_2 + _size_7);
                  }
                  int _y_6 = it.getY();
                  boolean _lessThan = (_y_6 < (33 + (13 * declarationCount)));
                  if (_lessThan) {
                    EList<Region> _regions_4 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
                    for (final Region region2_1 : _regions_4) {
                      String _uuid_2 = region2_1.getUuid();
                      String _uuid_3 = it.getUuid();
                      boolean _notEquals = (!Objects.equal(_uuid_2, _uuid_3));
                      if (_notEquals) {
                        int _y_7 = region2_1.getY();
                        int _plus_15 = (_y_7 + 160);
                        region2_1.setY(_plus_15);
                      }
                    }
                    RootState _head_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
                    int _height_7 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
                    int _plus_16 = (_height_7 + 160);
                    _head_1.setHeight(_plus_16);
                    it.setY((33 + (13 * declarationCount)));
                    it.setX(10);
                    it.setHeight(150);
                    int _width_6 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
                    int _minus_9 = (_width_6 - 20);
                    it.setWidth(_minus_9);
                    break_ = false;
                  }
                }
              }
            }
          }
        }
      } else {
        EList<SuperState> _superStates = it.getSuperStates();
        boolean _tripleNotEquals_3 = (_superStates != null);
        if (_tripleNotEquals_3) {
          EList<SuperState> _superStates_1 = it.getSuperStates();
          for (final SuperState superState : _superStates_1) {
            EList<Region> _regions_5 = superState.getRegions();
            boolean _tripleNotEquals_4 = (_regions_5 != null);
            if (_tripleNotEquals_4) {
              EList<Region> _regions_6 = superState.getRegions();
              for (final Region region : _regions_6) {
                this.postCreateInSuperState(superState, element);
              }
            }
          }
        }
      }
    }
    if ((!regionFound)) {
    }
  }
  
  public Object postCreateInSuperState(final SuperState superState, final Region element) {
    return null;
  }
  
  @Override
  public Runnable postDelete(final Region element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final Region element) {
  }
  
  @Override
  public void postMove(final Region element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final Region element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final Region element) {
  }
}

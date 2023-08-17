package info.scce.cinco.product.scchart.events;

import com.google.common.base.Objects;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
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
        boolean continue_ = true;
        int declarationCount = 0;
        EList<Declaration> _declarations = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations();
        boolean _tripleNotEquals = (_declarations != null);
        if (_tripleNotEquals) {
          int _declarationCount = declarationCount;
          int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size();
          declarationCount = (_declarationCount + _size);
        }
        EList<Suspend> _suspends = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
        boolean _tripleNotEquals_1 = (_suspends != null);
        if (_tripleNotEquals_1) {
          int _declarationCount_1 = declarationCount;
          int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
          declarationCount = (_declarationCount_1 + _size_1);
        }
        EList<Action> _actions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
        boolean _tripleNotEquals_2 = (_actions != null);
        if (_tripleNotEquals_2) {
          int _declarationCount_2 = declarationCount;
          int _size_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size();
          declarationCount = (_declarationCount_2 + _size_2);
        }
        int _size_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions().size();
        boolean _equals_1 = (_size_3 == 1);
        if (_equals_1) {
          it.setX(10);
          it.setY((33 + (declarationCount * 13)));
          int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
          int _minus = (_width - 20);
          it.setWidth(_minus);
          int _height = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
          int _minus_1 = (_height - 43);
          int _minus_2 = (_minus_1 - (declarationCount * 13));
          it.setHeight(_minus_2);
        } else {
          EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          for (final Region region1 : _regions_1) {
            if (((((((((it.getX() - region1.getX()) - region1.getWidth()) <= 13) && (((it.getX() - region1.getX()) - region1.getWidth()) > (-1))) && continue_) && (region1.getY() < it.getY())) && ((region1.getY() + region1.getHeight()) > it.getY())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
              int _width_1 = region1.getWidth();
              int _minus_3 = (_width_1 - 10);
              int _divide = (_minus_3 / 2);
              region1.setWidth(_divide);
              it.setWidth(region1.getWidth());
              it.setHeight(region1.getHeight());
              int _x = region1.getX();
              int _width_2 = region1.getWidth();
              int _plus = (_x + _width_2);
              int _plus_1 = (_plus + 10);
              it.setX(_plus_1);
              it.setY(region1.getY());
              continue_ = false;
            } else {
              if ((((((it.getX() <= 10) && continue_) && (region1.getY() < it.getY())) && ((region1.getY() + region1.getHeight()) > it.getY())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
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
                int _plus_2 = (_x_1 + _width_4);
                int _plus_3 = (_plus_2 + 10);
                region1.setX(_plus_3);
                continue_ = false;
              } else {
                if (((((((((it.getY() - region1.getY()) - region1.getHeight()) <= 13) && (((it.getY() - region1.getY()) - region1.getHeight()) > (-1))) && continue_) && (region1.getX() < it.getX())) && ((region1.getX() + region1.getWidth()) > it.getX())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
                  int _height_1 = region1.getHeight();
                  int _minus_5 = (_height_1 - 10);
                  int _divide_2 = (_minus_5 / 2);
                  region1.setHeight(_divide_2);
                  it.setWidth(region1.getWidth());
                  it.setHeight(region1.getHeight());
                  it.setX(region1.getX());
                  int _y = region1.getY();
                  int _height_2 = region1.getHeight();
                  int _plus_4 = (_y + _height_2);
                  int _plus_5 = (_plus_4 + 10);
                  it.setY(_plus_5);
                  continue_ = false;
                } else {
                  if ((((((it.getY() < (33 + (declarationCount * 13))) && continue_) && (region1.getX() < it.getX())) && ((region1.getX() + region1.getWidth()) > it.getX())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
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
                    int _plus_6 = (_y_1 + _height_4);
                    int _plus_7 = (_plus_6 + 10);
                    region1.setY(_plus_7);
                    continue_ = false;
                  }
                }
              }
            }
          }
          if (continue_) {
            it.setY(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight());
            it.setX(10);
            it.setHeight(150);
            int _width_5 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
            int _minus_7 = (_width_5 - 20);
            it.setWidth(_minus_7);
            RootState _head = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
            int _height_5 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
            int _plus_8 = (_height_5 + 160);
            _head.setHeight(_plus_8);
            continue_ = false;
          }
        }
      }
    }
    if ((!regionFound)) {
      EList<Region> _regions_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
      for (final Region region : _regions_2) {
        EList<SuperState> _superStates = region.getSuperStates();
        boolean _tripleNotEquals_3 = (_superStates != null);
        if (_tripleNotEquals_3) {
          EList<SuperState> _superStates_1 = region.getSuperStates();
          for (final SuperState superState : _superStates_1) {
            EList<Region> _regions_3 = superState.getRegions();
            boolean _tripleNotEquals_4 = (_regions_3 != null);
            if (_tripleNotEquals_4) {
              this.postCreateInSuperState(superState, element);
            }
          }
        }
      }
    }
  }
  
  public void postCreateInSuperState(final SuperState superState, final Region element) {
    boolean regionFound = false;
    EList<Region> _regions = superState.getRegions();
    for (final Region it : _regions) {
      String _uuid = it.getUuid();
      String _uuid_1 = element.getUuid();
      boolean _equals = Objects.equal(_uuid, _uuid_1);
      if (_equals) {
        regionFound = true;
        int declarationCount = 0;
        EList<Declaration> _declarations = superState.getDeclarations();
        boolean _tripleNotEquals = (_declarations != null);
        if (_tripleNotEquals) {
          int _declarationCount = declarationCount;
          int _size = superState.getDeclarations().size();
          declarationCount = (_declarationCount + _size);
        }
        EList<Suspend> _suspends = superState.getSuspends();
        boolean _tripleNotEquals_1 = (_suspends != null);
        if (_tripleNotEquals_1) {
          int _declarationCount_1 = declarationCount;
          int _size_1 = superState.getSuspends().size();
          declarationCount = (_declarationCount_1 + _size_1);
        }
        EList<Action> _actions = superState.getActions();
        boolean _tripleNotEquals_2 = (_actions != null);
        if (_tripleNotEquals_2) {
          int _declarationCount_2 = declarationCount;
          int _size_2 = superState.getActions().size();
          declarationCount = (_declarationCount_2 + _size_2);
        }
        int _size_3 = superState.getRegions().size();
        boolean _equals_1 = (_size_3 == 1);
        if (_equals_1) {
          it.setX(10);
          it.setY((33 + (declarationCount * 13)));
          int _width = superState.getWidth();
          int _minus = (_width - 20);
          it.setWidth(_minus);
          int _height = superState.getHeight();
          int _minus_1 = (_height - 43);
          int _minus_2 = (_minus_1 - (declarationCount * 13));
          it.setHeight(_minus_2);
        } else {
          boolean continue_ = true;
          EList<Region> _regions_1 = superState.getRegions();
          for (final Region region1 : _regions_1) {
            if (((((((((it.getX() - region1.getX()) - region1.getWidth()) <= 13) && (((it.getX() - region1.getX()) - region1.getWidth()) > (-1))) && continue_) && (region1.getY() < it.getY())) && ((region1.getY() + region1.getHeight()) > it.getY())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
              int _width_1 = region1.getWidth();
              int _minus_3 = (_width_1 - 10);
              int _divide = (_minus_3 / 2);
              region1.setWidth(_divide);
              it.setWidth(region1.getWidth());
              it.setHeight(region1.getHeight());
              int _x = region1.getX();
              int _width_2 = region1.getWidth();
              int _plus = (_x + _width_2);
              int _plus_1 = (_plus + 10);
              it.setX(_plus_1);
              it.setY(region1.getY());
              continue_ = false;
            } else {
              if ((((((it.getX() <= 10) && continue_) && (region1.getY() < it.getY())) && ((region1.getY() + region1.getHeight()) > it.getY())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
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
                int _plus_2 = (_x_1 + _width_4);
                int _plus_3 = (_plus_2 + 10);
                region1.setX(_plus_3);
                continue_ = false;
              } else {
                if (((((((((it.getY() - region1.getY()) - region1.getHeight()) <= 13) && (((it.getY() - region1.getY()) - region1.getHeight()) > (-1))) && continue_) && (region1.getX() < it.getX())) && ((region1.getX() + region1.getWidth()) > it.getX())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
                  int _height_1 = region1.getHeight();
                  int _minus_5 = (_height_1 - 10);
                  int _divide_2 = (_minus_5 / 2);
                  region1.setHeight(_divide_2);
                  it.setWidth(region1.getWidth());
                  it.setHeight(region1.getHeight());
                  it.setX(region1.getX());
                  int _y = region1.getY();
                  int _height_2 = region1.getHeight();
                  int _plus_4 = (_y + _height_2);
                  int _plus_5 = (_plus_4 + 10);
                  it.setY(_plus_5);
                  continue_ = false;
                } else {
                  if ((((((it.getY() < (33 + (declarationCount * 13))) && continue_) && (region1.getX() < it.getX())) && ((region1.getX() + region1.getWidth()) > it.getX())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
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
                    int _plus_6 = (_y_1 + _height_4);
                    int _plus_7 = (_plus_6 + 10);
                    region1.setY(_plus_7);
                    continue_ = false;
                  }
                }
              }
            }
          }
          if (continue_) {
            it.setY(superState.getHeight());
            it.setX(10);
            it.setHeight(150);
            int _width_5 = superState.getWidth();
            int _minus_7 = (_width_5 - 20);
            it.setWidth(_minus_7);
            int _height_5 = superState.getHeight();
            int _plus_8 = (_height_5 + 160);
            superState.setHeight(_plus_8);
            continue_ = false;
          }
        }
      }
    }
    if ((!regionFound)) {
      EList<Region> _regions_2 = superState.getRegions();
      for (final Region region : _regions_2) {
        EList<SuperState> _superStates = region.getSuperStates();
        boolean _tripleNotEquals_3 = (_superStates != null);
        if (_tripleNotEquals_3) {
          EList<SuperState> _superStates_1 = region.getSuperStates();
          for (final SuperState innerSuperState : _superStates_1) {
            EList<Region> _regions_3 = superState.getRegions();
            boolean _tripleNotEquals_4 = (_regions_3 != null);
            if (_tripleNotEquals_4) {
              this.postCreateInSuperState(innerSuperState, element);
            }
          }
        }
      }
    }
  }
  
  @Override
  public Runnable postDelete(final Region element) {
    boolean regionFound = false;
    EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
    for (final Region it : _regions) {
      String _uuid = it.getUuid();
      String _uuid_1 = element.getUuid();
      boolean _equals = Objects.equal(_uuid, _uuid_1);
      if (_equals) {
        regionFound = true;
        boolean continue_ = true;
        int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions().size();
        boolean _equals_1 = (_size == 1);
        if (_equals_1) {
        } else {
          EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          for (final Region region1 : _regions_1) {
            if ((((((it.getX() == region1.getX()) && continue_) && (region1.getWidth() == it.getWidth())) && ((((it.getY() - region1.getY()) - region1.getHeight()) < 13) && (((it.getY() - region1.getY()) - region1.getHeight()) > 5))) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
              int _height = region1.getHeight();
              int _height_1 = it.getHeight();
              int _plus = (_height + _height_1);
              int _plus_1 = (_plus + 10);
              region1.setHeight(_plus_1);
              continue_ = false;
            } else {
              if ((((((it.getY() == region1.getY()) && continue_) && (region1.getHeight() == it.getHeight())) && ((((it.getX() - region1.getX()) - region1.getWidth()) < 13) && (((it.getX() - region1.getX()) - region1.getWidth()) > 5))) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
                int _width = region1.getWidth();
                int _width_1 = it.getWidth();
                int _plus_2 = (_width + _width_1);
                int _plus_3 = (_plus_2 + 10);
                region1.setWidth(_plus_3);
                continue_ = false;
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region1_1 : _regions_2) {
              if ((((((it.getX() == region1_1.getX()) && continue_) && (region1_1.getWidth() == it.getWidth())) && ((((region1_1.getY() - it.getY()) - it.getHeight()) < 13) && (((region1_1.getY() - it.getY()) - it.getHeight()) > 5))) && (!Objects.equal(it.getUuid(), region1_1.getUuid())))) {
                region1_1.setY(it.getY());
                int _height_2 = region1_1.getHeight();
                int _height_3 = it.getHeight();
                int _plus_4 = (_height_2 + _height_3);
                int _plus_5 = (_plus_4 + 10);
                region1_1.setHeight(_plus_5);
                continue_ = false;
              } else {
                if ((((((it.getY() == region1_1.getY()) && continue_) && (region1_1.getHeight() == it.getHeight())) && ((((region1_1.getX() - it.getX()) - it.getWidth()) < 13) && (((region1_1.getX() - it.getX()) - it.getWidth()) > 5))) && (!Objects.equal(it.getUuid(), region1_1.getUuid())))) {
                  region1_1.setX(it.getX());
                  int _width_2 = region1_1.getWidth();
                  int _width_3 = it.getWidth();
                  int _plus_6 = (_width_2 + _width_3);
                  int _plus_7 = (_plus_6 + 10);
                  region1_1.setWidth(_plus_7);
                  continue_ = false;
                }
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region1_2 : _regions_3) {
              if ((((((region1_2.getY() - it.getY()) - it.getHeight()) < 13) && (((region1_2.getY() - it.getY()) - it.getHeight()) > 5)) && (!Objects.equal(it.getUuid(), region1_2.getUuid())))) {
                region1_2.setY(it.getY());
                int _height_4 = region1_2.getHeight();
                int _height_5 = it.getHeight();
                int _plus_8 = (_height_4 + _height_5);
                int _plus_9 = (_plus_8 + 10);
                region1_2.setHeight(_plus_9);
                continue_ = false;
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_4 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region1_3 : _regions_4) {
              if ((((((region1_3.getX() - it.getX()) - it.getWidth()) < 13) && (((region1_3.getX() - it.getX()) - it.getWidth()) > 5)) && (!Objects.equal(it.getUuid(), region1_3.getUuid())))) {
                region1_3.setX(it.getX());
                int _width_4 = region1_3.getWidth();
                int _width_5 = it.getWidth();
                int _plus_10 = (_width_4 + _width_5);
                int _plus_11 = (_plus_10 + 10);
                region1_3.setWidth(_plus_11);
                continue_ = false;
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_5 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region1_4 : _regions_5) {
              if ((((((it.getY() - region1_4.getY()) - region1_4.getHeight()) < 13) && (((it.getY() - region1_4.getY()) - region1_4.getHeight()) > 5)) && (!Objects.equal(it.getUuid(), region1_4.getUuid())))) {
                int _height_6 = region1_4.getHeight();
                int _height_7 = it.getHeight();
                int _plus_12 = (_height_6 + _height_7);
                int _plus_13 = (_plus_12 + 10);
                region1_4.setHeight(_plus_13);
                continue_ = false;
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_6 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region1_5 : _regions_6) {
              if ((((((it.getX() - region1_5.getX()) - region1_5.getWidth()) < 13) && (((it.getX() - region1_5.getX()) - region1_5.getWidth()) > 5)) && (!Objects.equal(it.getUuid(), region1_5.getUuid())))) {
                int _width_6 = region1_5.getWidth();
                int _width_7 = it.getWidth();
                int _plus_14 = (_width_6 + _width_7);
                int _plus_15 = (_plus_14 + 10);
                region1_5.setWidth(_plus_15);
                continue_ = false;
              }
            }
          }
        }
      }
    }
    if ((!regionFound)) {
      EList<Region> _regions_7 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
      for (final Region region : _regions_7) {
        EList<SuperState> _superStates = region.getSuperStates();
        boolean _tripleNotEquals = (_superStates != null);
        if (_tripleNotEquals) {
          EList<SuperState> _superStates_1 = region.getSuperStates();
          for (final SuperState superState : _superStates_1) {
            EList<Region> _regions_8 = superState.getRegions();
            boolean _tripleNotEquals_1 = (_regions_8 != null);
            if (_tripleNotEquals_1) {
              this.postDeleteInSuperState(superState, element);
            }
          }
        }
      }
    }
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  public void postDeleteInSuperState(final SuperState superState, final Region element) {
    boolean regionFound = false;
    EList<Region> _regions = superState.getRegions();
    for (final Region it : _regions) {
      String _uuid = it.getUuid();
      String _uuid_1 = element.getUuid();
      boolean _equals = Objects.equal(_uuid, _uuid_1);
      if (_equals) {
        regionFound = true;
        int _size = superState.getRegions().size();
        boolean _equals_1 = (_size == 1);
        if (_equals_1) {
        } else {
          boolean continue_ = true;
          EList<Region> _regions_1 = superState.getRegions();
          for (final Region region1 : _regions_1) {
            if ((((((it.getX() == region1.getX()) && continue_) && (region1.getWidth() == it.getWidth())) && ((((it.getY() - region1.getY()) - region1.getHeight()) < 13) && (((it.getY() - region1.getY()) - region1.getHeight()) > 5))) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
              int _height = region1.getHeight();
              int _height_1 = it.getHeight();
              int _plus = (_height + _height_1);
              int _plus_1 = (_plus + 10);
              region1.setHeight(_plus_1);
              continue_ = false;
            } else {
              if ((((((it.getY() == region1.getY()) && continue_) && (region1.getHeight() == it.getHeight())) && ((((it.getX() - region1.getX()) - region1.getWidth()) < 13) && (((it.getX() - region1.getX()) - region1.getWidth()) > 5))) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
                int _width = region1.getWidth();
                int _width_1 = it.getWidth();
                int _plus_2 = (_width + _width_1);
                int _plus_3 = (_plus_2 + 10);
                region1.setWidth(_plus_3);
                continue_ = false;
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_2 = superState.getRegions();
            for (final Region region1_1 : _regions_2) {
              if ((((((it.getX() == region1_1.getX()) && continue_) && (region1_1.getWidth() == it.getWidth())) && ((((region1_1.getY() - it.getY()) - it.getHeight()) < 13) && (((region1_1.getY() - it.getY()) - it.getHeight()) > 5))) && (!Objects.equal(it.getUuid(), region1_1.getUuid())))) {
                region1_1.setY(it.getY());
                int _height_2 = region1_1.getHeight();
                int _height_3 = it.getHeight();
                int _plus_4 = (_height_2 + _height_3);
                int _plus_5 = (_plus_4 + 10);
                region1_1.setHeight(_plus_5);
                continue_ = false;
              } else {
                if ((((((it.getY() == region1_1.getY()) && continue_) && (region1_1.getHeight() == it.getHeight())) && ((((region1_1.getX() - it.getX()) - it.getWidth()) < 13) && (((region1_1.getX() - it.getX()) - it.getWidth()) > 5))) && (!Objects.equal(it.getUuid(), region1_1.getUuid())))) {
                  region1_1.setX(it.getX());
                  int _width_2 = region1_1.getWidth();
                  int _width_3 = it.getWidth();
                  int _plus_6 = (_width_2 + _width_3);
                  int _plus_7 = (_plus_6 + 10);
                  region1_1.setWidth(_plus_7);
                  continue_ = false;
                }
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_3 = superState.getRegions();
            for (final Region region1_2 : _regions_3) {
              if ((((((region1_2.getY() - it.getY()) - it.getHeight()) < 13) && (((region1_2.getY() - it.getY()) - it.getHeight()) > 5)) && (!Objects.equal(it.getUuid(), region1_2.getUuid())))) {
                region1_2.setY(it.getY());
                int _height_4 = region1_2.getHeight();
                int _height_5 = it.getHeight();
                int _plus_8 = (_height_4 + _height_5);
                int _plus_9 = (_plus_8 + 10);
                region1_2.setHeight(_plus_9);
                continue_ = false;
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_4 = superState.getRegions();
            for (final Region region1_3 : _regions_4) {
              if ((((((region1_3.getX() - it.getX()) - it.getWidth()) < 13) && (((region1_3.getX() - it.getX()) - it.getWidth()) > 5)) && (!Objects.equal(it.getUuid(), region1_3.getUuid())))) {
                region1_3.setX(it.getX());
                int _width_4 = region1_3.getWidth();
                int _width_5 = it.getWidth();
                int _plus_10 = (_width_4 + _width_5);
                int _plus_11 = (_plus_10 + 10);
                region1_3.setWidth(_plus_11);
                continue_ = false;
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_5 = superState.getRegions();
            for (final Region region1_4 : _regions_5) {
              if ((((((it.getY() - region1_4.getY()) - region1_4.getHeight()) < 13) && (((it.getY() - region1_4.getY()) - region1_4.getHeight()) > 5)) && (!Objects.equal(it.getUuid(), region1_4.getUuid())))) {
                int _height_6 = region1_4.getHeight();
                int _height_7 = it.getHeight();
                int _plus_12 = (_height_6 + _height_7);
                int _plus_13 = (_plus_12 + 10);
                region1_4.setHeight(_plus_13);
                continue_ = false;
              }
            }
          }
          if (continue_) {
            EList<Region> _regions_6 = superState.getRegions();
            for (final Region region1_5 : _regions_6) {
              if ((((((it.getX() - region1_5.getX()) - region1_5.getWidth()) < 13) && (((it.getX() - region1_5.getX()) - region1_5.getWidth()) > 5)) && (!Objects.equal(it.getUuid(), region1_5.getUuid())))) {
                int _width_6 = region1_5.getWidth();
                int _width_7 = it.getWidth();
                int _plus_14 = (_width_6 + _width_7);
                int _plus_15 = (_plus_14 + 10);
                region1_5.setWidth(_plus_15);
                continue_ = false;
              }
            }
          }
        }
      }
    }
    if ((!regionFound)) {
      EList<Region> _regions_7 = superState.getRegions();
      for (final Region region : _regions_7) {
        EList<SuperState> _superStates = region.getSuperStates();
        boolean _tripleNotEquals = (_superStates != null);
        if (_tripleNotEquals) {
          EList<SuperState> _superStates_1 = region.getSuperStates();
          for (final SuperState innerSuperState : _superStates_1) {
            EList<Region> _regions_8 = superState.getRegions();
            boolean _tripleNotEquals_1 = (_regions_8 != null);
            if (_tripleNotEquals_1) {
              this.postDeleteInSuperState(innerSuperState, element);
            }
          }
        }
      }
    }
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

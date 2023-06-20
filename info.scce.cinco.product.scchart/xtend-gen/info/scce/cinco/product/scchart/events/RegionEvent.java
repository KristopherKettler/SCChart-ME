package info.scce.cinco.product.scchart.events;

import com.google.common.base.Objects;
import graphmodel.Container;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import java.util.UUID;
import java.util.function.Consumer;
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
    final Consumer<Region> _function = (Region it) -> {
      this.searchElement(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()), it);
      String _uuid = it.getUuid();
      String _uuid_1 = element.getUuid();
      boolean _equals = Objects.equal(_uuid, _uuid_1);
      if (_equals) {
        int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions().size();
        boolean _equals_1 = (_size == 1);
        if (_equals_1) {
          it.setX(10);
          int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarationNodes().size();
          int _multiply = (_size_1 * 13);
          int _plus = (30 + _multiply);
          it.setY(_plus);
          int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
          int _minus = (_width - 20);
          it.setWidth(_minus);
          int _height = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
          int _minus_1 = (_height - 40);
          int _size_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarationNodes().size();
          int _multiply_1 = (_size_2 * 13);
          int _minus_2 = (_minus_1 - _multiply_1);
          it.setHeight(_minus_2);
        } else {
          boolean break_ = true;
          EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          for (final Region region1 : _regions) {
            if (((((((((it.getX() - region1.getX()) - region1.getWidth()) <= 13) && (((it.getX() - region1.getX()) - region1.getWidth()) > (-1))) && break_) && (region1.getY() < it.getY())) && ((region1.getY() + region1.getHeight()) > it.getY())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
              int _width_1 = region1.getWidth();
              int _minus_3 = (_width_1 - 10);
              int _divide = (_minus_3 / 2);
              region1.setWidth(_divide);
              it.setWidth(region1.getWidth());
              it.setHeight(region1.getHeight());
              int _x = region1.getX();
              int _width_2 = region1.getWidth();
              int _plus_1 = (_x + _width_2);
              int _plus_2 = (_plus_1 + 10);
              it.setX(_plus_2);
              it.setY(region1.getY());
              break_ = false;
            } else {
              if ((((((((region1.getX() - it.getX()) <= 13) && ((region1.getX() - it.getX()) > (-1))) && break_) && (region1.getY() < it.getY())) && ((region1.getY() + region1.getHeight()) > it.getY())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
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
                int _plus_3 = (_x_1 + _width_4);
                int _plus_4 = (_plus_3 + 10);
                region1.setX(_plus_4);
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
                  int _plus_5 = (_y + _height_2);
                  int _plus_6 = (_plus_5 + 10);
                  it.setY(_plus_6);
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
                    int _plus_7 = (_y_1 + _height_4);
                    int _plus_8 = (_plus_7 + 10);
                    region1.setY(_plus_8);
                    break_ = false;
                  } else {
                    if ((((((((region1.getY() - it.getY()) <= 13) && ((region1.getY() - it.getY()) > (-1))) && break_) && (region1.getX() < it.getX())) && ((region1.getX() + region1.getWidth()) > it.getX())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        EList<SuperState> _superStates = it.getSuperStates();
        boolean _notEquals = (!Objects.equal(_superStates, null));
        if (_notEquals) {
          EList<SuperState> _superStates_1 = it.getSuperStates();
          for (final SuperState superState : _superStates_1) {
            EList<Region> _regions_1 = superState.getRegions();
            boolean _notEquals_1 = (!Objects.equal(_regions_1, null));
            if (_notEquals_1) {
              EList<Region> _regions_2 = superState.getRegions();
              for (final Region region : _regions_2) {
                this.searchElement(superState, region);
              }
            }
          }
        }
      }
    };
    IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions().forEach(_function);
  }
  
  public Object searchElement(final Container superState, final Region element) {
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

package info.scce.cinco.product.scchart.events;

import com.google.common.base.Objects;
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
      String _uuid = it.getUuid();
      String _uuid_1 = element.getUuid();
      boolean _equals = Objects.equal(_uuid, _uuid_1);
      if (_equals) {
        int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions().size();
        boolean _equals_1 = (_size == 1);
        if (_equals_1) {
          RootState _head = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
          _head.setWidth(200);
          RootState _head_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
          _head_1.setHeight(150);
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
            if ((((((((((it.getX() - region1.getX()) - region1.getWidth()) <= 13) && (((it.getX() - region1.getX()) - region1.getWidth()) > (-1))) || (((region1.getX() - it.getX()) <= 13) && ((region1.getX() - it.getX()) > (-1)))) && break_) && (region1.getY() < it.getY())) && ((region1.getY() + region1.getHeight()) > it.getY())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
              it.setY(region1.getY());
              it.setHeight(region1.getHeight());
              int countYHeight = 0;
              EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
              for (final Region r : _regions_1) {
                int _y = it.getY();
                int _y_1 = r.getY();
                boolean _equals_2 = (_y == _y_1);
                if (_equals_2) {
                  countYHeight++;
                }
              }
              int _width_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
              int _minus_3 = (_width_1 - 10);
              int _minus_4 = (_minus_3 - (countYHeight * 10));
              final int containerWidth = (_minus_4 / countYHeight);
              final int itOldX = it.getX();
              int count = 0;
              EList<Region> _regions_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
              for (final Region region2 : _regions_2) {
                if (((region2.getY() == it.getY()) && (region2.getX() < itOldX))) {
                  region2.setX((((containerWidth + 10) * count) + 10));
                  region2.setWidth(containerWidth);
                  count++;
                }
              }
              EList<Region> _regions_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
              for (final Region region2_1 : _regions_3) {
                if (((region2_1.getY() == it.getY()) && (region2_1.getX() > itOldX))) {
                  region2_1.setX((((containerWidth + 10) * count) + 10));
                  region2_1.setWidth(containerWidth);
                  count++;
                }
              }
              EList<Region> _regions_4 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
              for (final Region region2_2 : _regions_4) {
                if (((region2_2.getY() == it.getY()) && (region2_2.getX() == itOldX))) {
                  region2_2.setX((((containerWidth + 10) * count) + 10));
                  region2_2.setWidth(containerWidth);
                  count++;
                }
              }
              break_ = false;
            } else {
              if ((((((((((it.getY() - region1.getY()) - region1.getHeight()) <= 13) && (((it.getY() - region1.getY()) - region1.getHeight()) > (-1))) || (((region1.getY() - it.getY()) <= 13) && ((region1.getY() - it.getY()) > (-1)))) && break_) && (region1.getX() < it.getX())) && ((region1.getX() + region1.getWidth()) > it.getX())) && (!Objects.equal(it.getUuid(), region1.getUuid())))) {
                it.setX(region1.getX());
                it.setWidth(region1.getWidth());
                int countXWidth = 0;
                EList<Region> _regions_5 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
                for (final Region r_1 : _regions_5) {
                  int _x = it.getX();
                  int _x_1 = r_1.getX();
                  boolean _equals_3 = (_x == _x_1);
                  if (_equals_3) {
                    countXWidth++;
                  }
                }
                int _height_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
                int _minus_5 = (_height_1 - 30);
                int _size_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarationNodes().size();
                int _multiply_2 = (13 * _size_3);
                int _minus_6 = (_minus_5 - _multiply_2);
                int _minus_7 = (_minus_6 - (countXWidth * 10));
                final int containerHeight = (_minus_7 / countXWidth);
                final int itOldY = it.getY();
                int count_1 = 0;
                EList<Region> _regions_6 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
                for (final Region region2_3 : _regions_6) {
                  if (((region2_3.getX() == it.getX()) && (region2_3.getY() < itOldY))) {
                    int _size_4 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarationNodes().size();
                    int _multiply_3 = (13 * _size_4);
                    int _minus_8 = ((((containerHeight + 10) * count_1) + 30) - _multiply_3);
                    region2_3.setY(_minus_8);
                    region2_3.setHeight(containerHeight);
                    count_1++;
                  }
                }
                EList<Region> _regions_7 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
                for (final Region region2_4 : _regions_7) {
                  if (((region2_4.getX() == it.getX()) && (region2_4.getY() > itOldY))) {
                    int _size_5 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarationNodes().size();
                    int _multiply_4 = (13 * _size_5);
                    int _minus_9 = ((((containerHeight + 10) * count_1) + 30) - _multiply_4);
                    region2_4.setY(_minus_9);
                    region2_4.setHeight(containerHeight);
                    count_1++;
                  }
                }
                EList<Region> _regions_8 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
                for (final Region region2_5 : _regions_8) {
                  if (((region2_5.getX() == it.getX()) && (region2_5.getY() == itOldY))) {
                    int _size_6 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarationNodes().size();
                    int _multiply_5 = (13 * _size_6);
                    int _minus_10 = ((((containerHeight + 10) * count_1) + 30) - _multiply_5);
                    region2_5.setY(_minus_10);
                    region2_5.setHeight(containerHeight);
                    count_1++;
                  }
                }
                break_ = false;
              }
            }
          }
        }
      }
    };
    IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions().forEach(_function);
  }
  
  public Object searchElement(final SuperState superState, final Region element) {
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

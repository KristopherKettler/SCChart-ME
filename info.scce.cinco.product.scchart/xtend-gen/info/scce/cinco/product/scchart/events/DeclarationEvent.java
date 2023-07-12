package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.declarationEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "declaration" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends declaration> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(declaration element)
 * - preMove(declaration element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(declaration element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(declaration element, String attribute, Object oldValue)
 * - postCreate(declaration element)
 * - postDelete(declaration element)
 * - postDoubleClick(declaration element)
 * - postMove(declaration element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(declaration element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(declaration element)
 */
@SuppressWarnings("all")
public final class DeclarationEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.DeclarationEvent {
  @Override
  public void preCreate(final Class<? extends Declaration> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final Declaration element) {
  }
  
  @Override
  public void preMove(final Declaration element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final Declaration element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final Declaration element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final Declaration element) {
    final Procedure2<Declaration, Integer> _function = (Declaration declaration, Integer index) -> {
      declaration.setX(10);
      declaration.setY((30 + (13 * (index).intValue())));
      int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
      int _minus = (_width - 20);
      declaration.setWidth(_minus);
      declaration.setHeight(13);
    };
    IterableExtensions.<Declaration>forEach(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations(), _function);
    EList<Suspend> _suspends = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
    boolean _tripleNotEquals = (_suspends != null);
    if (_tripleNotEquals) {
      final Procedure2<Suspend, Integer> _function_1 = (Suspend suspend, Integer index) -> {
        suspend.setX(10);
        int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size();
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
      EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
      boolean _tripleNotEquals_1 = (_regions != null);
      if (_tripleNotEquals_1) {
        EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
        for (final Region region : _regions_1) {
          if (((region.getY() < (IterableExtensions.<Declaration>last(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations()).getY() + 13)) || (region.getY() < (IterableExtensions.<Suspend>last(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends()).getY() + 13)))) {
            EList<Region> _regions_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region1 : _regions_2) {
              int _y = region1.getY();
              int _plus = (_y + 13);
              region1.setY(_plus);
            }
            RootState _head = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
            int _height = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
            int _plus_1 = (_height + 13);
            _head.setHeight(_plus_1);
          }
        }
      }
    } else {
      EList<Region> _regions_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
      boolean _tripleNotEquals_2 = (_regions_3 != null);
      if (_tripleNotEquals_2) {
        EList<Region> _regions_4 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
        for (final Region region_1 : _regions_4) {
          int _y_1 = region_1.getY();
          int _y_2 = IterableExtensions.<Declaration>last(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations()).getY();
          int _plus_2 = (_y_2 + 13);
          boolean _lessThan = (_y_1 < _plus_2);
          if (_lessThan) {
            EList<Region> _regions_5 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region1_1 : _regions_5) {
              int _y_3 = region1_1.getY();
              int _plus_3 = (_y_3 + 13);
              region1_1.setY(_plus_3);
            }
            RootState _head_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
            int _height_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
            int _plus_4 = (_height_1 + 13);
            _head_1.setHeight(_plus_4);
          }
        }
      }
    }
  }
  
  @Override
  public Runnable postDelete(final Declaration element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final Declaration element) {
  }
  
  @Override
  public void postMove(final Declaration element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final Declaration element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final Declaration element) {
  }
}

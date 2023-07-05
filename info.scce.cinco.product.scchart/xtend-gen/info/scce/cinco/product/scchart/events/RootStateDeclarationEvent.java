package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.RootStateDeclarationEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "RootStateDeclaration" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends RootStateDeclaration> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(RootStateDeclaration element)
 * - preMove(RootStateDeclaration element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(RootStateDeclaration element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(RootStateDeclaration element, String attribute, Object oldValue)
 * - postCreate(RootStateDeclaration element)
 * - postDelete(RootStateDeclaration element)
 * - postDoubleClick(RootStateDeclaration element)
 * - postMove(RootStateDeclaration element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(RootStateDeclaration element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(RootStateDeclaration element)
 */
@SuppressWarnings("all")
public final class RootStateDeclarationEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.RootStateDeclarationEvent {
  @Override
  public void preCreate(final Class<? extends RootStateDeclaration> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final RootStateDeclaration element) {
  }
  
  @Override
  public void preMove(final RootStateDeclaration element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final RootStateDeclaration element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final RootStateDeclaration element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final RootStateDeclaration element) {
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
    EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
    for (final Region region : _regions) {
      if (((region.getY() < (IterableExtensions.<RootStateDeclaration>last(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations()).getY() + 13)) || (region.getY() < (IterableExtensions.<Suspend>last(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends()).getY() + 13)))) {
        EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
        for (final Region region1 : _regions_1) {
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
  
  @Override
  public Runnable postDelete(final RootStateDeclaration element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final RootStateDeclaration element) {
  }
  
  @Override
  public void postMove(final RootStateDeclaration element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final RootStateDeclaration element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final RootStateDeclaration element) {
  }
}

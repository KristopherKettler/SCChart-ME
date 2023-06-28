package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclarationNode;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import info.scce.cinco.product.scchart.mglid.scchart.SuspendNode;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

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
    final Consumer<RootStateDeclarationNode> _function = (RootStateDeclarationNode it) -> {
      it.delete();
    };
    element.getRootStateDeclarationNodes().forEach(_function);
    final Procedure2<RootStateDeclaration, Integer> _function_1 = (RootStateDeclaration declaration, Integer index) -> {
      int _width = element.getWidth();
      int _minus = (_width - 20);
      element.newRootStateDeclarationNode(10, (30 + (13 * (index).intValue())), _minus, 13);
      IterableExtensions.<RootStateDeclarationNode>last(element.getRootStateDeclarationNodes()).setInputOutput(declaration.getInputOutput());
      IterableExtensions.<RootStateDeclarationNode>last(element.getRootStateDeclarationNodes()).setDeclarationType(declaration.getDeclarationType());
      IterableExtensions.<RootStateDeclarationNode>last(element.getRootStateDeclarationNodes()).setName(declaration.getName());
    };
    IterableExtensions.<RootStateDeclaration>forEach(element.getDeclaration(), _function_1);
    final Consumer<SuspendNode> _function_2 = (SuspendNode it) -> {
      it.delete();
    };
    element.getSuspendNodes().forEach(_function_2);
    final Procedure2<Suspend, Integer> _function_3 = (Suspend suspend, Integer index) -> {
      int _size = element.getDeclaration().size();
      int _multiply = (13 * _size);
      int _plus = (30 + _multiply);
      int _plus_1 = (_plus + (13 * (index).intValue()));
      int _width = element.getWidth();
      int _minus = (_width - 20);
      element.newSuspendNode(10, _plus_1, _minus, 13);
      IterableExtensions.<SuspendNode>last(element.getSuspendNodes()).setSuspendType(suspend.getSuspendType());
      IterableExtensions.<SuspendNode>last(element.getSuspendNodes()).setCondition(suspend.getCondition());
    };
    IterableExtensions.<Suspend>forEach(element.getSuspends(), _function_3);
    boolean break_ = true;
    EList<Region> _regions = element.getRegions();
    for (final Region region : _regions) {
      if (((region.getY() < (IterableExtensions.<RootStateDeclarationNode>last(element.getRootStateDeclarationNodes()).getY() + 13)) || (region.getY() < (IterableExtensions.<SuspendNode>last(element.getSuspendNodes()).getY() + 13)))) {
        EList<Region> _regions_1 = element.getRegions();
        for (final Region region1 : _regions_1) {
          int _y = region1.getY();
          int _plus = (_y + 13);
          region1.setY(_plus);
        }
        int _height = element.getHeight();
        int _plus_1 = (_height + 13);
        element.setHeight(_plus_1);
      }
    }
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
    final float eleOldWidth = oldWidth;
    final float eleOldHeight = oldHeight;
    final float eleWidth = element.getWidth();
    final float eleHeight = element.getHeight();
    final float proportionWidth = (eleWidth / eleOldWidth);
    final float proportionHeight = (eleHeight / eleOldHeight);
    EList<Region> _regions = element.getRegions();
    for (final Region region : _regions) {
      {
        final float regWidth = region.getWidth();
        final float regHeight = region.getHeight();
        final float width = (proportionWidth * regWidth);
        final float height = (proportionHeight * regHeight);
        region.setWidth(Math.round(width));
        region.setHeight(Math.round(height));
      }
    }
  }
  
  @Override
  public void postSelect(final RootState element) {
  }
}

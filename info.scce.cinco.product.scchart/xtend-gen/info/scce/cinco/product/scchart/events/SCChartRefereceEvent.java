package info.scce.cinco.product.scchart.events;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece;
import org.eclipse.emf.common.util.EList;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SCChartRefereceEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Container "SCChartReferece" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends SCChartReferece> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(SCChartReferece element)
 * - preMove(SCChartReferece element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(SCChartReferece element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(SCChartReferece element, String attribute, Object oldValue)
 * - postCreate(SCChartReferece element)
 * - postDelete(SCChartReferece element)
 * - postDoubleClick(SCChartReferece element)
 * - postMove(SCChartReferece element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(SCChartReferece element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(SCChartReferece element)
 */
@SuppressWarnings("all")
public final class SCChartRefereceEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SCChartRefereceEvent {
  @Override
  public void preCreate(final Class<? extends SCChartReferece> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final SCChartReferece element) {
  }
  
  @Override
  public void preMove(final SCChartReferece element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final SCChartReferece element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final SCChartReferece element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final SCChartReferece element) {
    EList<Declaration> _declarations = element.getReference().getDeclarations();
    boolean _tripleNotEquals = (_declarations != null);
    if (_tripleNotEquals) {
    }
  }
  
  @Override
  public Runnable postDelete(final SCChartReferece element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final SCChartReferece element) {
  }
  
  @Override
  public void postMove(final SCChartReferece element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final SCChartReferece element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final SCChartReferece element) {
  }
}

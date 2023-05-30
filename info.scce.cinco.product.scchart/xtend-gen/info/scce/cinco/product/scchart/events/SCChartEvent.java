package info.scce.cinco.product.scchart.events;

import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import org.eclipse.core.runtime.IPath;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SCChartEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   GraphModel "SCChart" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends SCChart> elementClass, String name, IPath path)
 * - preSave(SCChart element)
 * - postAttributeChange(SCChart element, String attribute, Object oldValue)
 * - postCreate(SCChart element)
 * - postSave(SCChart element)
 */
@SuppressWarnings("all")
public final class SCChartEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SCChartEvent {
  @Override
  public void preCreate(final Class<? extends SCChart> elementClass, final String name, final IPath path) {
  }
  
  @Override
  public void preSave(final SCChart element) {
  }
  
  @Override
  public void postAttributeChange(final SCChart element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final SCChart element) {
    element.newRootState(20, 20, 700, 900);
  }
  
  @Override
  public void postSave(final SCChart element) {
  }
}

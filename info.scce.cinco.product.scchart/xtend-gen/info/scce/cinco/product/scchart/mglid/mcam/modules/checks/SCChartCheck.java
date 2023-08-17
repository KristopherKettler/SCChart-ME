package info.scce.cinco.product.scchart.mglid.mcam.modules.checks;

import de.jabc.cinco.meta.plugin.mcam.runtime.core.CincoCheckModule;
import info.scce.cinco.product.scchart.mglid.mcam.adapter.SCChartAdapter;
import info.scce.cinco.product.scchart.mglid.mcam.adapter.SCChartId;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;

@SuppressWarnings("all")
public abstract class SCChartCheck extends CincoCheckModule<SCChartId, SCChart, SCChartAdapter> {
  @Override
  public abstract void check(final SCChart model);
}

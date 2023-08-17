package info.scce.cinco.product.scchart.checks;

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RegionCheck extends SCChartCheck {
  @Override
  public void check(final SCChart scchart) {
    this.checkNameConvention(scchart);
  }
  
  public EList<Region> checkNameConvention(final SCChart scchart) {
    EList<Region> _xifexpression = null;
    EList<Region> _regions = IterableExtensions.<RootState>head(scchart.getRootStates()).getRegions();
    boolean _tripleNotEquals = (_regions != null);
    if (_tripleNotEquals) {
      _xifexpression = IterableExtensions.<RootState>head(scchart.getRootStates()).getRegions();
    }
    return _xifexpression;
  }
}

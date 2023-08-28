package info.scce.cinco.product.scchart.checks;

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import java.util.function.Consumer;

@SuppressWarnings("all")
public class RegionCheck extends SCChartCheck {
  @Override
  public void check(final SCChart scchart) {
    this.checkNameConvention(scchart);
  }
  
  public void checkNameConvention(final SCChart scchart) {
    final Consumer<Region> _function = (Region it) -> {
      if (((it.getName() != null) && (!it.getName().isEmpty()))) {
        boolean _not = (!(((it.getName().charAt(0) >= 'a') && (it.getName().charAt(0) <= 'z')) || ((it.getName().charAt(0) >= 'A') && (it.getName().charAt(0) <= 'Z'))));
        if (_not) {
          this.addError(it, "name should start a with letter");
        } else {
          boolean break_ = false;
          int i = 1;
          while (((i < it.getName().length()) && (!break_))) {
            {
              boolean _not_1 = (!((((it.getName().charAt(i) >= 'a') && (it.getName().charAt(i) <= 'z')) || ((it.getName().charAt(i) >= 'A') && (it.getName().charAt(i) <= 'Z'))) || Character.isDigit(it.getName().charAt(i))));
              if (_not_1) {
                this.addError(it, "name should only contain letters and numbers");
                break_ = true;
              }
              i++;
            }
          }
        }
      }
    };
    this._graphModelExtension.<Region>find(this._graphModelExtension.<RootState>findThe(scchart, RootState.class), Region.class).forEach(_function);
  }
}

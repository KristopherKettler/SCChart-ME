package info.scce.cinco.product.scchart.checks;

import com.google.common.base.Objects;
import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import java.util.function.Consumer;

@SuppressWarnings("all")
public class SuperStateCheck extends SCChartCheck {
  @Override
  public void check(final SCChart scchart) {
    this.checkNameConvention(scchart);
  }
  
  public void checkNameConvention(final SCChart scchart) {
    final Consumer<SuperState> _function = (SuperState it) -> {
      if ((Objects.equal(it.getName(), "<set name>") || it.getName().isEmpty())) {
        this.addError(it, "set name");
      } else {
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
    this._graphModelExtension.<SuperState>find(this._graphModelExtension.<RootState>findThe(scchart, RootState.class), SuperState.class).forEach(_function);
  }
}

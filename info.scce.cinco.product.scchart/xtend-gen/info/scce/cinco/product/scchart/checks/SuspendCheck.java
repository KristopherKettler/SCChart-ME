package info.scce.cinco.product.scchart.checks;

import com.google.common.base.Objects;
import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import java.util.function.Consumer;

@SuppressWarnings("all")
public class SuspendCheck extends SCChartCheck {
  @Override
  public void check(final SCChart scchart) {
    this.checkNameConvention(scchart);
  }
  
  public void checkNameConvention(final SCChart scchart) {
    final Consumer<Suspend> _function = (Suspend it) -> {
      String _suspendType = it.getSuspendType();
      boolean _equals = Objects.equal(_suspendType, "<set suspend>");
      if (_equals) {
        this.addError(it, "set suspendtype");
      } else {
        boolean break_ = false;
        int i = 1;
        while (((i < it.getCondition().length()) && (!break_))) {
          {
            boolean _not = (!((((it.getCondition().charAt(i) >= 'a') && (it.getCondition().charAt(i) <= 'z')) || ((it.getCondition().charAt(i) >= 'A') && (it.getCondition().charAt(i) <= 'Z'))) || Character.isDigit(it.getCondition().charAt(i))));
            if (_not) {
              this.addError(it, "name should only contain letters and numbers");
              break_ = true;
            }
            i++;
          }
        }
      }
    };
    this._graphModelExtension.<Suspend>find(this._graphModelExtension.<RootState>findThe(scchart, RootState.class), Suspend.class).forEach(_function);
  }
}

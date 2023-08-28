package info.scce.cinco.product.scchart.checks;

import com.google.common.base.Objects;
import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import java.util.function.Consumer;

@SuppressWarnings("all")
public class ActionCheck extends SCChartCheck {
  @Override
  public void check(final SCChart scchart) {
    this.checkNameConvention(scchart);
  }
  
  public void checkNameConvention(final SCChart scchart) {
    final Consumer<Action> _function = (Action it) -> {
      String _actionType = it.getActionType();
      boolean _equals = Objects.equal(_actionType, "<set action>");
      if (_equals) {
        this.addError(it, "set actiontype");
      } else {
        boolean break_ = false;
        int i = 1;
        while (((i < it.getEffect().length()) && (!break_))) {
          {
            boolean _not = (!((((it.getEffect().charAt(i) >= 'a') && (it.getEffect().charAt(i) <= 'z')) || ((it.getEffect().charAt(i) >= 'A') && (it.getEffect().charAt(i) <= 'Z'))) || Character.isDigit(it.getEffect().charAt(i))));
            if (_not) {
              this.addError(it, "name should only contain letters and numbers");
              break_ = true;
            }
            i++;
          }
        }
      }
    };
    this._graphModelExtension.<Action>find(this._graphModelExtension.<RootState>findThe(scchart, RootState.class), Action.class).forEach(_function);
  }
}

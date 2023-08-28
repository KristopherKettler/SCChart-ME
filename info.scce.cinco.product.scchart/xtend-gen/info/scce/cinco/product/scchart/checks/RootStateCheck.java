package info.scce.cinco.product.scchart.checks;

import com.google.common.base.Objects;
import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class RootStateCheck extends SCChartCheck {
  @Override
  public void check(final SCChart scchart) {
    this.checkNameConvention(scchart);
  }
  
  public void checkNameConvention(final SCChart scchart) {
    EList<RootState> _rootStates = scchart.getRootStates();
    for (final RootState rootState : _rootStates) {
      if ((Objects.equal(rootState.getName(), "<set name>") || rootState.getName().isEmpty())) {
        this.addError(rootState, "set name");
      } else {
        boolean _not = (!(((rootState.getName().charAt(0) >= 'a') && (rootState.getName().charAt(0) <= 'z')) || ((rootState.getName().charAt(0) >= 'A') && (rootState.getName().charAt(0) <= 'Z'))));
        if (_not) {
          this.addError(rootState, "name should start a with letter");
        } else {
          boolean break_ = false;
          int i = 1;
          while (((i < rootState.getName().length()) && (!break_))) {
            {
              boolean _not_1 = (!((((rootState.getName().charAt(i) >= 'a') && (rootState.getName().charAt(i) <= 'z')) || ((rootState.getName().charAt(i) >= 'A') && (rootState.getName().charAt(i) <= 'Z'))) || Character.isDigit(rootState.getName().charAt(i))));
              if (_not_1) {
                this.addError(rootState, "name should only contain letters and numbers");
                break_ = true;
              }
              i++;
            }
          }
        }
      }
    }
  }
}

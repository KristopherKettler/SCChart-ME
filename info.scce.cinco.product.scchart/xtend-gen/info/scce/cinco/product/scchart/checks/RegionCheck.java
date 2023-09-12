package info.scce.cinco.product.scchart.checks;

import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class RegionCheck extends SCChartCheck {
  @Override
  public void check(final SCChart scchart) {
    this.checkNameConvention(scchart);
    this.checkForInitialState(scchart);
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
  
  public void checkForInitialState(final SCChart scchart) {
    final Consumer<Region> _function = (Region it) -> {
      int count = 0;
      EList<InitialState> _initialStates = it.getInitialStates();
      boolean _tripleNotEquals = (_initialStates != null);
      if (_tripleNotEquals) {
        int _size = it.getInitialStates().size();
        int _plus = (count + _size);
        count = _plus;
      }
      EList<InitialFinalState> _initialFinalStates = it.getInitialFinalStates();
      boolean _tripleNotEquals_1 = (_initialFinalStates != null);
      if (_tripleNotEquals_1) {
        int _size_1 = it.getInitialFinalStates().size();
        int _plus_1 = (count + _size_1);
        count = _plus_1;
      }
      EList<InitialSuperState> _initialSuperStates = it.getInitialSuperStates();
      boolean _tripleNotEquals_2 = (_initialSuperStates != null);
      if (_tripleNotEquals_2) {
        int _size_2 = it.getInitialSuperStates().size();
        int _plus_2 = (count + _size_2);
        count = _plus_2;
      }
      EList<InitialFinalSuperState> _initialFinalSuperStates = it.getInitialFinalSuperStates();
      boolean _tripleNotEquals_3 = (_initialFinalSuperStates != null);
      if (_tripleNotEquals_3) {
        int _size_3 = it.getInitialFinalSuperStates().size();
        int _plus_3 = (count + _size_3);
        count = _plus_3;
      }
      if ((count != 1)) {
        this.addError(it, "region may only have one initial state");
      }
    };
    this._graphModelExtension.<Region>find(this._graphModelExtension.<RootState>findThe(scchart, RootState.class), Region.class).forEach(_function);
  }
}

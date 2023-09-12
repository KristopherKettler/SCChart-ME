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
        String _condition = it.getCondition();
        boolean _tripleNotEquals = (_condition != null);
        if (_tripleNotEquals) {
          boolean break_ = false;
          int i = 1;
          while (((i < it.getCondition().length()) && (!break_))) {
            {
              boolean _not = (!(((((((((((it.getCondition().charAt(i) >= 'a') && (it.getCondition().charAt(i) <= 'z')) || ((it.getCondition().charAt(i) >= 'A') && (it.getCondition().charAt(i) <= 'Z'))) || Character.isDigit(it.getCondition().charAt(i))) || Objects.equal(Character.valueOf(it.getEffect().charAt(i)), ">")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i)), "<")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i)), "+")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i)), "*")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i)), "-")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i)), "/")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i)), "=")));
              if (_not) {
                this.addError(it, "invalid condition");
                break_ = true;
              }
              i++;
            }
          }
        } else {
          String _effect = it.getEffect();
          boolean _tripleNotEquals_1 = (_effect != null);
          if (_tripleNotEquals_1) {
            boolean break__1 = false;
            int i_1 = 1;
            while (((i_1 < it.getEffect().length()) && (!break__1))) {
              {
                boolean _not = (!(((((((((it.getEffect().charAt(i_1) >= 'a') && (it.getEffect().charAt(i_1) <= 'z')) || ((it.getEffect().charAt(i_1) >= 'A') && (it.getEffect().charAt(i_1) <= 'Z'))) || Character.isDigit(it.getEffect().charAt(i_1))) || Objects.equal(Character.valueOf(it.getEffect().charAt(i_1)), "+")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i_1)), "*")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i_1)), "-")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i_1)), "/")) || Objects.equal(Character.valueOf(it.getEffect().charAt(i_1)), "=")));
                if (_not) {
                  this.addError(it, "invalid effect");
                  break__1 = true;
                }
                i_1++;
              }
            }
          }
        }
      }
    };
    this._graphModelExtension.<Action>find(this._graphModelExtension.<RootState>findThe(scchart, RootState.class), Action.class).forEach(_function);
  }
}

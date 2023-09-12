package info.scce.cinco.product.scchart.checks;

import com.google.common.base.Objects;
import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TransitionCheck extends SCChartCheck {
  @Override
  public void check(final SCChart scchart) {
    this.checkTransitionorder(scchart);
  }
  
  public void checkTransitionorder(final SCChart scchart) {
    final Consumer<Region> _function = (Region it) -> {
      final Function1<SimpleState, Boolean> _function_1 = (SimpleState it_1) -> {
        int _size = it_1.getOutgoing().size();
        return Boolean.valueOf((_size > 1));
      };
      final Consumer<SimpleState> _function_2 = (SimpleState it_1) -> {
        boolean notValidTrans = false;
        EList<? extends AbstractTransition> _outgoing = it_1.getOutgoing();
        for (final AbstractTransition firstEdge : _outgoing) {
          EList<? extends AbstractTransition> _outgoing_1 = it_1.getOutgoing();
          for (final AbstractTransition secondEdge : _outgoing_1) {
            if ((Objects.equal(firstEdge.getPriority(), secondEdge.getPriority()) && this._graphModelExtension.operator_notEquals(firstEdge, secondEdge))) {
              notValidTrans = true;
            }
          }
        }
        if (notValidTrans) {
          this.addError(it_1, "order of transitions not valid");
        }
      };
      IterableExtensions.<SimpleState>filter(this._graphModelExtension.<SimpleState>find(it, SimpleState.class), _function_1).forEach(_function_2);
    };
    this._graphModelExtension.<Region>find(this._graphModelExtension.<RootState>findThe(scchart, RootState.class), Region.class).forEach(_function);
    final Consumer<Region> _function_1 = (Region it) -> {
      final Function1<SuperState, Boolean> _function_2 = (SuperState it_1) -> {
        int _size = it_1.getOutgoing().size();
        return Boolean.valueOf((_size > 1));
      };
      final Consumer<SuperState> _function_3 = (SuperState it_1) -> {
        boolean notValidTrans = false;
        EList<? extends AbstractTransition> _outgoing = it_1.getOutgoing();
        for (final AbstractTransition firstEdge : _outgoing) {
          EList<? extends AbstractTransition> _outgoing_1 = it_1.getOutgoing();
          for (final AbstractTransition secondEdge : _outgoing_1) {
            if ((Objects.equal(firstEdge.getPriority(), secondEdge.getPriority()) && this._graphModelExtension.operator_notEquals(firstEdge, secondEdge))) {
              notValidTrans = true;
            }
          }
        }
        if (notValidTrans) {
          this.addError(it_1, "order of transitions not valid");
        }
      };
      IterableExtensions.<SuperState>filter(this._graphModelExtension.<SuperState>find(it, SuperState.class), _function_2).forEach(_function_3);
    };
    this._graphModelExtension.<Region>find(this._graphModelExtension.<RootState>findThe(scchart, RootState.class), Region.class).forEach(_function_1);
  }
}

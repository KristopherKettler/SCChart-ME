package info.scce.cinco.product.scchart.mglid.mcam.modules.checks;

import com.google.common.collect.Iterables;
import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;
import graphmodel.Edge;
import graphmodel.IdentifiableElement;
import graphmodel.Node;
import info.scce.cinco.product.scchart.mglid.mcam.adapter.SCChartId;
import info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartCheck;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class SCChartOutgoingCheck extends SCChartCheck {
  @Override
  public String getName() {
    return "OutgoingCheck";
  }
  
  @Override
  public void check(final SCChart model) {
    final Function1<SCChartId, IdentifiableElement> _function = (SCChartId it) -> {
      return it.getElement();
    };
    final Consumer<Node> _function_1 = (Node it) -> {
      this.check(it);
    };
    Iterables.<Node>filter(ListExtensions.<SCChartId, IdentifiableElement>map(this.adapter.getEntityIds(), _function), Node.class).forEach(_function_1);
  }
  
  public void check(final Node node) {
    EList<ConnectionConstraint> _outgoingConstraints = node.getOutgoingConstraints();
    for (final ConnectionConstraint it : _outgoingConstraints) {
      {
        boolean _checkLowerBound = it.checkLowerBound(node);
        boolean _not = (!_checkLowerBound);
        if (_not) {
          int _lowerBound = it.getLowerBound();
          String _plus = ("at least " + Integer.valueOf(_lowerBound));
          String _plus_1 = (_plus + " of OUTGOING [");
          final Function1<Class<? extends Edge>, String> _function = (Class<? extends Edge> it_1) -> {
            return it_1.getSimpleName();
          };
          String _join = IterableExtensions.join(ListExtensions.<Class<? extends Edge>, String>map(it.getEdgeTypes(), _function), ", ");
          String _plus_2 = (_plus_1 + _join);
          String _plus_3 = (_plus_2 + "] required");
          this.addError(node, _plus_3);
        }
        boolean _checkUpperBound = it.checkUpperBound(node);
        boolean _not_1 = (!_checkUpperBound);
        if (_not_1) {
          int _upperBound = it.getUpperBound();
          String _plus_4 = ("maximum of " + Integer.valueOf(_upperBound));
          String _plus_5 = (_plus_4 + " [");
          final Function1<Class<? extends Edge>, String> _function_1 = (Class<? extends Edge> it_1) -> {
            return it_1.getSimpleName();
          };
          String _join_1 = IterableExtensions.join(ListExtensions.<Class<? extends Edge>, String>map(it.getEdgeTypes(), _function_1), ", ");
          String _plus_6 = (_plus_5 + _join_1);
          String _plus_7 = (_plus_6 + "] allowed");
          this.addError(node, _plus_7);
        }
      }
    }
  }
  
  public String print(final ConnectionConstraint it) {
    List<Class<? extends Edge>> _edgeTypes = it.getEdgeTypes();
    String _plus = ("(" + _edgeTypes);
    String _plus_1 = (_plus + " [");
    int _lowerBound = it.getLowerBound();
    String _plus_2 = (_plus_1 + Integer.valueOf(_lowerBound));
    String _plus_3 = (_plus_2 + ",");
    int _upperBound = it.getUpperBound();
    String _plus_4 = (_plus_3 + Integer.valueOf(_upperBound));
    String _plus_5 = (_plus_4 + "]");
    String _plus_6 = (_plus_5 + ")");
    return InputOutput.<String>println(_plus_6);
  }
}

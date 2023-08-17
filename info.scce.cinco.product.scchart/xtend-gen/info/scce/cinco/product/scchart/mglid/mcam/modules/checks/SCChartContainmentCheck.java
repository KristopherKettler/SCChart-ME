package info.scce.cinco.product.scchart.mglid.mcam.modules.checks;

import com.google.common.collect.Iterables;
import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;
import graphmodel.Container;
import graphmodel.GraphModel;
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
public class SCChartContainmentCheck extends SCChartCheck {
  @Override
  public String getName() {
    return "ContainmentCheck";
  }
  
  @Override
  public void check(final SCChart model) {
    final Function1<SCChartId, IdentifiableElement> _function = (SCChartId it) -> {
      return it.getElement();
    };
    final Consumer<Container> _function_1 = (Container it) -> {
      this.check(it);
    };
    Iterables.<Container>filter(ListExtensions.<SCChartId, IdentifiableElement>map(this.adapter.getEntityIds(), _function), Container.class).forEach(_function_1);
    final Function1<SCChartId, IdentifiableElement> _function_2 = (SCChartId it) -> {
      return it.getElement();
    };
    final Consumer<GraphModel> _function_3 = (GraphModel it) -> {
      this.checkModel(it);
    };
    Iterables.<GraphModel>filter(ListExtensions.<SCChartId, IdentifiableElement>map(this.adapter.getEntityIds(), _function_2), GraphModel.class).forEach(_function_3);
  }
  
  public void checkModel(final GraphModel model) {
    EList<ContainmentConstraint> _containmentConstraints = model.getInternalContainerElement().getContainmentConstraints();
    for (final ContainmentConstraint it : _containmentConstraints) {
      {
        boolean _checkLowerBound = it.checkLowerBound(model);
        boolean _not = (!_checkLowerBound);
        if (_not) {
          int _lowerBound = it.getLowerBound();
          String _plus = ("at least " + Integer.valueOf(_lowerBound));
          String _plus_1 = (_plus + " of [");
          final Function1<Class<? extends Node>, String> _function = (Class<? extends Node> it_1) -> {
            return it_1.getSimpleName();
          };
          String _join = IterableExtensions.join(ListExtensions.<Class<? extends Node>, String>map(it.getTypes(), _function), ", ");
          String _plus_2 = (_plus_1 + _join);
          String _plus_3 = (_plus_2 + "] required");
          this.addError(model, _plus_3);
        }
        boolean _checkUpperBound = it.checkUpperBound(model);
        boolean _not_1 = (!_checkUpperBound);
        if (_not_1) {
          int _upperBound = it.getUpperBound();
          String _plus_4 = ("maximum of " + Integer.valueOf(_upperBound));
          String _plus_5 = (_plus_4 + " [");
          final Function1<Class<? extends Node>, String> _function_1 = (Class<? extends Node> it_1) -> {
            return it_1.getSimpleName();
          };
          String _join_1 = IterableExtensions.join(ListExtensions.<Class<? extends Node>, String>map(it.getTypes(), _function_1), ", ");
          String _plus_6 = (_plus_5 + _join_1);
          String _plus_7 = (_plus_6 + "] allowed");
          this.addError(model, _plus_7);
        }
      }
    }
  }
  
  public void check(final Container container) {
    EList<ContainmentConstraint> _containmentConstraints = container.getInternalContainerElement().getContainmentConstraints();
    for (final ContainmentConstraint it : _containmentConstraints) {
      {
        boolean _checkLowerBound = it.checkLowerBound(container);
        boolean _not = (!_checkLowerBound);
        if (_not) {
          int _lowerBound = it.getLowerBound();
          String _plus = ("at least " + Integer.valueOf(_lowerBound));
          String _plus_1 = (_plus + " of [");
          final Function1<Class<? extends Node>, String> _function = (Class<? extends Node> it_1) -> {
            return it_1.getSimpleName();
          };
          String _join = IterableExtensions.join(ListExtensions.<Class<? extends Node>, String>map(it.getTypes(), _function), ", ");
          String _plus_2 = (_plus_1 + _join);
          String _plus_3 = (_plus_2 + "] required");
          this.addError(container, _plus_3);
        }
        boolean _checkUpperBound = it.checkUpperBound(container);
        boolean _not_1 = (!_checkUpperBound);
        if (_not_1) {
          int _upperBound = it.getUpperBound();
          String _plus_4 = ("maximum of " + Integer.valueOf(_upperBound));
          String _plus_5 = (_plus_4 + " [");
          final Function1<Class<? extends Node>, String> _function_1 = (Class<? extends Node> it_1) -> {
            return it_1.getSimpleName();
          };
          String _join_1 = IterableExtensions.join(ListExtensions.<Class<? extends Node>, String>map(it.getTypes(), _function_1), ", ");
          String _plus_6 = (_plus_5 + _join_1);
          String _plus_7 = (_plus_6 + "] allowed");
          this.addError(container, _plus_7);
        }
      }
    }
  }
  
  public String print(final ContainmentConstraint it) {
    List<Class<? extends Node>> _types = it.getTypes();
    String _plus = ("(" + _types);
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

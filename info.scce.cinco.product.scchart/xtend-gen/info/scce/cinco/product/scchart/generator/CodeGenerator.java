package info.scce.cinco.product.scchart.generator;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import de.jabc.cinco.meta.runtime.CincoRuntimeBaseClass;
import graphmodel.Node;
import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;
import java.io.File;
import java.io.IOException;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CodeGenerator extends CincoRuntimeBaseClass implements IGenerator<SCChart> {
  private String fileName;
  
  @Override
  public void generate(final SCChart scchart, final IPath path, final IProgressMonitor monitor) {
    try {
      final String fullFileName = this._workspaceExtension.getFile(scchart).getName();
      this.fileName = fullFileName.substring(0, fullFileName.lastIndexOf("."));
      final IFile targetFile = this._workspaceExtension.getWorkspaceRoot().getFileForLocation(path.append((this.fileName + ".sctx")));
      EclipseFileUtils.writeToFile(targetFile, this.template(scchart));
      Thread.sleep(100);
      this.commandLineParser(targetFile, scchart, path);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence template(final SCChart scchart) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("scchart ");
    String _name = this._graphModelExtension.<RootState>findThe(scchart, RootState.class).getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Declaration> _find = this._graphModelExtension.<Declaration>find(scchart, Declaration.class);
      for(final Declaration declaration : _find) {
        _builder.append("\t");
        String _genDeclaration = this.genDeclaration(declaration);
        _builder.append(_genDeclaration, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Suspend> _find_1 = this._graphModelExtension.<Suspend>find(scchart, Suspend.class);
      for(final Suspend suspend : _find_1) {
        _builder.append("\t");
        String _genSuspend = this.genSuspend(suspend);
        _builder.append(_genSuspend, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Action> _find_2 = this._graphModelExtension.<Action>find(scchart, Action.class);
      for(final Action action : _find_2) {
        _builder.append("\t");
        String _genAction = this.genAction(action);
        _builder.append(_genAction, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Region> _find_3 = this._graphModelExtension.<Region>find(scchart, Region.class);
      for(final Region region : _find_3) {
        _builder.append("\t");
        CharSequence _genRegion = this.genRegion(region);
        _builder.append(_genRegion, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String genDeclaration(final Declaration declaration) {
    String string = "";
    boolean _isEmpty = declaration.getInputOutput().trim().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _inputOutput = declaration.getInputOutput();
      String _plus = (_inputOutput + " ");
      string = _plus;
    }
    boolean _isConstant = declaration.isConstant();
    if (_isConstant) {
      string = (string + "const ");
    }
    boolean _isSignal = declaration.isSignal();
    if (_isSignal) {
      string = (string + "signal ");
    }
    boolean _isEmpty_1 = declaration.getDeclarationType().trim().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      String _declarationType = declaration.getDeclarationType();
      String _plus_1 = (string + _declarationType);
      String _plus_2 = (_plus_1 + " ");
      string = _plus_2;
    }
    String _name = declaration.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      String _name_1 = declaration.getName();
      String _plus_3 = (string + _name_1);
      string = _plus_3;
    }
    String _assignment = declaration.getAssignment();
    boolean _tripleNotEquals_1 = (_assignment != null);
    if (_tripleNotEquals_1) {
      boolean _isEmpty_2 = declaration.getAssignment().trim().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        String _assignment_1 = declaration.getAssignment();
        String _plus_4 = ((string + " = ") + _assignment_1);
        string = _plus_4;
      }
    }
    return string;
  }
  
  public String genSuspend(final Suspend suspend) {
    String string = "";
    boolean _isEmpty = suspend.getSuspendType().trim().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _suspendType = suspend.getSuspendType();
      String _plus = (_suspendType + " ");
      string = _plus;
    }
    String _condition = suspend.getCondition();
    boolean _tripleNotEquals = (_condition != null);
    if (_tripleNotEquals) {
      boolean _isEmpty_1 = suspend.getCondition().trim().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        String _condition_1 = suspend.getCondition();
        String _plus_1 = ((string + "if ") + _condition_1);
        string = _plus_1;
      }
    }
    return string;
  }
  
  public String genAction(final Action action) {
    String string = "";
    boolean _isEmpty = action.getActionType().trim().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _actionType = action.getActionType();
      String _plus = (_actionType + " ");
      string = _plus;
    }
    String _condition = action.getCondition();
    boolean _tripleNotEquals = (_condition != null);
    if (_tripleNotEquals) {
      boolean _isEmpty_1 = action.getCondition().trim().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        String _effect = action.getEffect();
        String _plus_1 = ((string + "if ") + _effect);
        string = _plus_1;
      }
    }
    String _effect_1 = action.getEffect();
    boolean _tripleNotEquals_1 = (_effect_1 != null);
    if (_tripleNotEquals_1) {
      boolean _isEmpty_2 = action.getEffect().trim().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        String _condition_1 = action.getCondition();
        String _plus_2 = ((string + "do ") + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    return string;
  }
  
  public CharSequence genRegion(final Region region) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("region ");
    {
      String _name = region.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        String _name_1 = region.getName();
        _builder.append(_name_1);
      }
    }
    {
      String _label = region.getLabel();
      boolean _tripleNotEquals_1 = (_label != null);
      if (_tripleNotEquals_1) {
        _builder.append("\"");
        String _label_1 = region.getLabel();
        _builder.append(_label_1);
        _builder.append("\"");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      Iterable<SuperState> _find = this._graphModelExtension.<SuperState>find(region, SuperState.class);
      for(final SuperState superState : _find) {
        _builder.append("\t");
        CharSequence _genSuperState = this.genSuperState(superState);
        _builder.append(_genSuperState, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _genEdgesOrder = this.genEdgesOrder(superState.getOutgoingAbstractTransitions());
        _builder.append(_genEdgesOrder, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<SimpleState> _find_1 = this._graphModelExtension.<SimpleState>find(region, SimpleState.class);
      for(final SimpleState state : _find_1) {
        _builder.append("\t");
        String _genState = this.genState(state);
        _builder.append(_genState, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _genEdgesOrder_1 = this.genEdgesOrder(state.getOutgoingAbstractTransitions());
        _builder.append(_genEdgesOrder_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genSuperState(final SuperState superState) {
    StringConcatenation _builder = new StringConcatenation();
    String _superStateType = this.superStateType(superState);
    _builder.append(_superStateType);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Declaration> _find = this._graphModelExtension.<Declaration>find(superState, Declaration.class);
      for(final Declaration declaration : _find) {
        _builder.append("\t");
        String _genDeclaration = this.genDeclaration(declaration);
        _builder.append(_genDeclaration, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Suspend> _find_1 = this._graphModelExtension.<Suspend>find(superState, Suspend.class);
      for(final Suspend suspend : _find_1) {
        _builder.append("\t");
        String _genSuspend = this.genSuspend(suspend);
        _builder.append(_genSuspend, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Action> _find_2 = this._graphModelExtension.<Action>find(superState, Action.class);
      for(final Action action : _find_2) {
        _builder.append("\t");
        String _genAction = this.genAction(action);
        _builder.append(_genAction, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Region> _find_3 = this._graphModelExtension.<Region>find(superState, Region.class);
      for(final Region region : _find_3) {
        _builder.append("\t");
        Object _genRegion = this.genRegion(region);
        _builder.append(_genRegion, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String superStateType(final SuperState superState) {
    String string = "state ";
    String _name = superState.getName();
    String _plus = (string + _name);
    string = _plus;
    String _label = superState.getLabel();
    boolean _tripleNotEquals = (_label != null);
    if (_tripleNotEquals) {
      String _label_1 = superState.getLabel();
      String _plus_1 = ((string + " ") + _label_1);
      string = _plus_1;
    }
    boolean _matched = false;
    if ((superState instanceof InitialSuperState)) {
      _matched=true;
      return ("initial " + string);
    }
    if (!_matched) {
      if ((superState instanceof FinalSuperState)) {
        _matched=true;
        return ("final " + string);
      }
    }
    if (!_matched) {
      if ((superState instanceof InitialFinalSuperState)) {
        _matched=true;
        return ("initial final " + string);
      }
    }
    return string;
  }
  
  public String genState(final SimpleState simpleState) {
    String string = "state ";
    String _name = simpleState.getName();
    String _plus = (string + _name);
    string = _plus;
    String _label = simpleState.getLabel();
    boolean _tripleNotEquals = (_label != null);
    if (_tripleNotEquals) {
      String _label_1 = simpleState.getLabel();
      String _plus_1 = ((string + " ") + _label_1);
      string = _plus_1;
    }
    boolean _matched = false;
    if ((simpleState instanceof InitialState)) {
      _matched=true;
      return ("initial " + string);
    }
    if (!_matched) {
      if ((simpleState instanceof FinalState)) {
        _matched=true;
        return ("final " + string);
      }
    }
    if (!_matched) {
      if ((simpleState instanceof InitialFinalState)) {
        _matched=true;
        return ("initial final " + string);
      }
    }
    if (!_matched) {
      if ((simpleState instanceof Connector)) {
        _matched=true;
        return ("connector " + string);
      }
    }
    return string;
  }
  
  public CharSequence genEdgesOrder(final EList<AbstractTransition> transitions) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = transitions.size();
      IntegerRange _upTo = new IntegerRange(1, _size);
      for(final Integer i : _upTo) {
        {
          for(final AbstractTransition transition : transitions) {
            {
              String _priority = transition.getPriority();
              String _string = i.toString();
              boolean _equals = Objects.equal(_priority, _string);
              if (_equals) {
                String _genEdge = this.genEdge(transition);
                _builder.append(_genEdge);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public String genEdge(final AbstractTransition transition) {
    boolean _matched = false;
    if ((transition instanceof Transition)) {
      _matched=true;
      return this.genTransition(((Transition) transition));
    }
    if (!_matched) {
      if ((transition instanceof TerminationTransition)) {
        _matched=true;
        return this.genTerminationTransition(((TerminationTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof StrongAbortTransition)) {
        _matched=true;
        return this.genStrongAbortTransition(((StrongAbortTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof DeferredTransition)) {
        _matched=true;
        return this.genDeferredTransition(((DeferredTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof HistoryTransition)) {
        _matched=true;
        return this.genHistoryTransition(((HistoryTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof TerminationDeferredTransition)) {
        _matched=true;
        return this.genTerminationDeferredTransition(((TerminationDeferredTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof StrongAbortDeferredTransition)) {
        _matched=true;
        return this.genStrongAbortDeferredTransition(((StrongAbortDeferredTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof TerminationHistoryTransition)) {
        _matched=true;
        return this.genTerminationHistoryTransition(((TerminationHistoryTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof StrongAbortHistoryTransition)) {
        _matched=true;
        return this.genStrongAbortHistoryTransition(((StrongAbortHistoryTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof DeferredHistoryTransition)) {
        _matched=true;
        return this.genDeferredHistoryTransition(((DeferredHistoryTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof StrongAbortDeferredHistoryTransition)) {
        _matched=true;
        return this.genStrongAbortDeferredHistoryTransition(((StrongAbortDeferredHistoryTransition) transition));
      }
    }
    if (!_matched) {
      if ((transition instanceof TerminationDeferredHistoryTransition)) {
        _matched=true;
        return this.genTerminationDeferredHistoryTransition(((TerminationDeferredHistoryTransition) transition));
      }
    }
    return null;
  }
  
  public String genTransition(final Transition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    boolean _matched = false;
    Node _targetElement = transition.getTargetElement();
    if ((_targetElement instanceof SuperState)) {
      _matched=true;
      Node _targetElement_1 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_1).getName();
      return ((string + "go to ") + _name);
    }
    if (!_matched) {
      Node _targetElement_2 = transition.getTargetElement();
      if ((_targetElement_2 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_3 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_3).getName();
        return ((string + "go to ") + _name_1);
      }
    }
    return null;
  }
  
  public String genTerminationTransition(final TerminationTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    Node _targetElement = transition.getTargetElement();
    boolean _matched = false;
    Node _targetElement_1 = transition.getTargetElement();
    if ((_targetElement_1 instanceof SuperState)) {
      _matched=true;
      Node _targetElement_2 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_2).getName();
      return ((string + "join to ") + _name);
    }
    if (!_matched) {
      Node _targetElement_3 = transition.getTargetElement();
      if ((_targetElement_3 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_4 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_4).getName();
        return ((string + "join to ") + _name_1);
      }
    }
    return null;
  }
  
  public String genStrongAbortTransition(final StrongAbortTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    boolean _matched = false;
    Node _targetElement = transition.getTargetElement();
    if ((_targetElement instanceof SuperState)) {
      _matched=true;
      Node _targetElement_1 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_1).getName();
      /* ((string + "abort to ") + _name); */
    }
    if (!_matched) {
      Node _targetElement_2 = transition.getTargetElement();
      if ((_targetElement_2 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_3 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_3).getName();
        /* ((string + "abort to ") + _name_1); */
      }
    }
    return string;
  }
  
  public String genDeferredTransition(final DeferredTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    boolean _matched = false;
    Node _targetElement = transition.getTargetElement();
    if ((_targetElement instanceof SuperState)) {
      _matched=true;
      Node _targetElement_1 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_1).getName();
      String _plus_6 = ((string + "go to ") + _name);
      /* (_plus_6 + "deferred"); */
    }
    if (!_matched) {
      Node _targetElement_2 = transition.getTargetElement();
      if ((_targetElement_2 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_3 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_3).getName();
        String _plus_7 = ((string + "go to ") + _name_1);
        /* (_plus_7 + "deferred"); */
      }
    }
    return string;
  }
  
  public String genHistoryTransition(final HistoryTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    String history = "history";
    boolean _isDeepHistory = transition.isDeepHistory();
    boolean _not_3 = (!_isDeepHistory);
    if (_not_3) {
      history = ("shallow " + history);
    }
    boolean _matched = false;
    Node _targetElement = transition.getTargetElement();
    if ((_targetElement instanceof SuperState)) {
      _matched=true;
      Node _targetElement_1 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_1).getName();
      String _plus_6 = ((string + "go to ") + _name);
      /* (_plus_6 + history); */
    }
    if (!_matched) {
      Node _targetElement_2 = transition.getTargetElement();
      if ((_targetElement_2 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_3 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_3).getName();
        String _plus_7 = ((string + "go to ") + _name_1);
        /* (_plus_7 + history); */
      }
    }
    return string;
  }
  
  public String genTerminationDeferredTransition(final TerminationDeferredTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    Node _targetElement = transition.getTargetElement();
    boolean _matched = false;
    Node _targetElement_1 = transition.getTargetElement();
    if ((_targetElement_1 instanceof SuperState)) {
      _matched=true;
      Node _targetElement_2 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_2).getName();
      String _plus_6 = ((string + "join to ") + _name);
      return (_plus_6 + "deferred");
    }
    if (!_matched) {
      Node _targetElement_3 = transition.getTargetElement();
      if ((_targetElement_3 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_4 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_4).getName();
        String _plus_7 = ((string + "join to ") + _name_1);
        return (_plus_7 + "deferred");
      }
    }
    return null;
  }
  
  public String genStrongAbortDeferredTransition(final StrongAbortDeferredTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    boolean _matched = false;
    Node _targetElement = transition.getTargetElement();
    if ((_targetElement instanceof SuperState)) {
      _matched=true;
      Node _targetElement_1 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_1).getName();
      String _plus_6 = ((string + "abort to ") + _name);
      /* (_plus_6 + "deferred"); */
    }
    if (!_matched) {
      Node _targetElement_2 = transition.getTargetElement();
      if ((_targetElement_2 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_3 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_3).getName();
        String _plus_7 = ((string + "abort to ") + _name_1);
        /* (_plus_7 + "deferred"); */
      }
    }
    return string;
  }
  
  public String genTerminationHistoryTransition(final TerminationHistoryTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    String history = "history";
    boolean _isDeepHistory = transition.isDeepHistory();
    boolean _not_3 = (!_isDeepHistory);
    if (_not_3) {
      history = ("shallow " + history);
    }
    Node _targetElement = transition.getTargetElement();
    boolean _matched = false;
    Node _targetElement_1 = transition.getTargetElement();
    if ((_targetElement_1 instanceof SuperState)) {
      _matched=true;
      Node _targetElement_2 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_2).getName();
      String _plus_6 = ((string + "join to ") + _name);
      return (_plus_6 + history);
    }
    if (!_matched) {
      Node _targetElement_3 = transition.getTargetElement();
      if ((_targetElement_3 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_4 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_4).getName();
        String _plus_7 = ((string + "join to ") + _name_1);
        return (_plus_7 + history);
      }
    }
    return null;
  }
  
  public String genStrongAbortHistoryTransition(final StrongAbortHistoryTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    String history = "history";
    boolean _isDeepHistory = transition.isDeepHistory();
    boolean _not_3 = (!_isDeepHistory);
    if (_not_3) {
      history = ("shallow " + history);
    }
    boolean _matched = false;
    Node _targetElement = transition.getTargetElement();
    if ((_targetElement instanceof SuperState)) {
      _matched=true;
      Node _targetElement_1 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_1).getName();
      String _plus_6 = ((string + "abort to ") + _name);
      /* (_plus_6 + history); */
    }
    if (!_matched) {
      Node _targetElement_2 = transition.getTargetElement();
      if ((_targetElement_2 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_3 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_3).getName();
        String _plus_7 = ((string + "abort to ") + _name_1);
        /* (_plus_7 + history); */
      }
    }
    return string;
  }
  
  public String genDeferredHistoryTransition(final DeferredHistoryTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    String history = "history";
    boolean _isDeepHistory = transition.isDeepHistory();
    boolean _not_3 = (!_isDeepHistory);
    if (_not_3) {
      history = ("shallow " + history);
    }
    boolean _matched = false;
    Node _targetElement = transition.getTargetElement();
    if ((_targetElement instanceof SuperState)) {
      _matched=true;
      Node _targetElement_1 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_1).getName();
      String _plus_6 = ((string + "go to ") + _name);
      String _plus_7 = (_plus_6 + "deferred");
      /* (_plus_7 + history); */
    }
    if (!_matched) {
      Node _targetElement_2 = transition.getTargetElement();
      if ((_targetElement_2 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_3 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_3).getName();
        String _plus_8 = ((string + "go to ") + _name_1);
        String _plus_9 = (_plus_8 + "deferred");
        /* (_plus_9 + history); */
      }
    }
    return string;
  }
  
  public String genStrongAbortDeferredHistoryTransition(final StrongAbortDeferredHistoryTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    String history = "history";
    boolean _isDeepHistory = transition.isDeepHistory();
    boolean _not_3 = (!_isDeepHistory);
    if (_not_3) {
      history = ("shallow " + history);
    }
    boolean _matched = false;
    Node _targetElement = transition.getTargetElement();
    if ((_targetElement instanceof SuperState)) {
      _matched=true;
      Node _targetElement_1 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_1).getName();
      String _plus_6 = ((string + "abort to ") + _name);
      String _plus_7 = (_plus_6 + "deferred");
      /* (_plus_7 + history); */
    }
    if (!_matched) {
      Node _targetElement_2 = transition.getTargetElement();
      if ((_targetElement_2 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_3 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_3).getName();
        String _plus_8 = ((string + "abort to ") + _name_1);
        String _plus_9 = (_plus_8 + "deferred");
        /* (_plus_9 + history); */
      }
    }
    return string;
  }
  
  public String genTerminationDeferredHistoryTransition(final TerminationDeferredHistoryTransition transition) {
    String string = "";
    String _count_delay = transition.getCount_delay();
    boolean _tripleNotEquals = (_count_delay != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getCount_delay().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _count_delay_1 = transition.getCount_delay();
        String _plus = (string + _count_delay_1);
        String _plus_1 = (_plus + " ");
        string = _plus_1;
      }
    }
    String _condition = transition.getCondition();
    boolean _tripleNotEquals_1 = (_condition != null);
    if (_tripleNotEquals_1) {
      boolean _not_1 = (!(transition.getCondition().trim().isEmpty() || Objects.equal(transition.getCondition(), "<No condition>")));
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    boolean _isImmediate = transition.isImmediate();
    if (_isImmediate) {
      string = ("immediate " + string);
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _not_2 = (!(transition.getEffect().trim().isEmpty() || Objects.equal(transition.getEffect(), "<No effect>")));
      if (_not_2) {
        String _effect_1 = transition.getEffect();
        String _plus_4 = ((string + "do ") + _effect_1);
        String _plus_5 = (_plus_4 + " ");
        string = _plus_5;
      }
    }
    String history = "history";
    boolean _isDeepHistory = transition.isDeepHistory();
    boolean _not_3 = (!_isDeepHistory);
    if (_not_3) {
      history = ("shallow " + history);
    }
    boolean _matched = false;
    Node _targetElement = transition.getTargetElement();
    if ((_targetElement instanceof SuperState)) {
      _matched=true;
      Node _targetElement_1 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_1).getName();
      String _plus_6 = ((string + "join to ") + _name);
      String _plus_7 = (_plus_6 + "deferred");
      /* (_plus_7 + history); */
    }
    if (!_matched) {
      Node _targetElement_2 = transition.getTargetElement();
      if ((_targetElement_2 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_3 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_3).getName();
        String _plus_8 = ((string + "join to ") + _name_1);
        String _plus_9 = (_plus_8 + "deferred");
        /* (_plus_9 + history); */
      }
    }
    return string;
  }
  
  public Process commandLineParser(final IFile file, final SCChart scchart, final IPath path) throws ParseException {
    Process _xtrycatchfinallyexpression = null;
    try {
      Process _xblockexpression = null;
      {
        File f = new File("KIELER_CLI/kicodia-win.bat");
        String absolute = f.getAbsolutePath();
        final String targetFile = file.getLocation().removeLastSegments(1).toFile().getAbsolutePath();
        final String scchartSLTX = file.getLocation().toFile().getAbsolutePath();
        String generatorOutput = "";
        boolean _matched = false;
        String _generatorOutput = IterableExtensions.<RootState>head(scchart.getRootStates()).getGeneratorOutput();
        boolean _equals = Objects.equal(_generatorOutput, "Identity Diagram");
        if (_equals) {
          _matched=true;
          generatorOutput = "-s de.cau.cs.kieler.kicool.identity -d";
        }
        if (!_matched) {
          String _generatorOutput_1 = IterableExtensions.<RootState>head(scchart.getRootStates()).getGeneratorOutput();
          boolean _equals_1 = Objects.equal(_generatorOutput_1, "Netlist-based Compilation (C)");
          if (_equals_1) {
            _matched=true;
            generatorOutput = "-s de.cau.cs.kieler.sccharts.netlist";
          }
        }
        if (!_matched) {
          String _generatorOutput_2 = IterableExtensions.<RootState>head(scchart.getRootStates()).getGeneratorOutput();
          boolean _equals_2 = Objects.equal(_generatorOutput_2, "Netlist-based Compilation (Java)");
          if (_equals_2) {
            _matched=true;
            generatorOutput = "-s de.cau.cs.kieler.sccharts.netlist.java";
          }
        }
        if (!_matched) {
          String _generatorOutput_3 = IterableExtensions.<RootState>head(scchart.getRootStates()).getGeneratorOutput();
          boolean _equals_3 = Objects.equal(_generatorOutput_3, "Netlist-based Deployment (NXJ)");
          if (_equals_3) {
            _matched=true;
            generatorOutput = "-s de.cau.cs.kieler.sccharts.netlist.nxj.deploy";
          }
        }
        if (!_matched) {
          String _generatorOutput_4 = IterableExtensions.<RootState>head(scchart.getRootStates()).getGeneratorOutput();
          boolean _equals_4 = Objects.equal(_generatorOutput_4, "Priority-based Compilation (C)");
          if (_equals_4) {
            _matched=true;
            generatorOutput = "-s de.cau.cs.kieler.sccharts.priority";
          }
        }
        if (!_matched) {
          String _generatorOutput_5 = IterableExtensions.<RootState>head(scchart.getRootStates()).getGeneratorOutput();
          boolean _equals_5 = Objects.equal(_generatorOutput_5, "Priority-based Compilation (Java)");
          if (_equals_5) {
            _matched=true;
            generatorOutput = "-s de.cau.cs.kieler.sccharts.priority.java";
          }
        }
        if (!_matched) {
          String _generatorOutput_6 = IterableExtensions.<RootState>head(scchart.getRootStates()).getGeneratorOutput();
          boolean _equals_6 = Objects.equal(_generatorOutput_6, "State-based Compilation (C) lean-mode (Template)");
          if (_equals_6) {
            _matched=true;
            generatorOutput = "-s  de.cau.cs.kieler.sccharts.statebased.lean.c.template";
          }
        }
        System.out.println(
          ("generateSCChart: " + targetFile));
        String _path = f.getPath();
        String _plus = ("Original path: " + _path);
        System.out.println(_plus);
        System.out.println(
          ("Absolute path: " + absolute));
        System.out.println(
          (((((((("Absolute path: " + "start ") + absolute) + " ") + scchartSLTX) + " -o ") + targetFile) + " ") + generatorOutput));
        Process process = Runtime.getRuntime().exec(((((((("cmd.exe /c start " + absolute) + " ") + scchartSLTX) + " -o ") + targetFile) + " ") + generatorOutput));
        int exitVal = process.waitFor();
        Process _xifexpression = null;
        if ((exitVal == 0)) {
          Process _xblockexpression_1 = null;
          {
            System.out.println("Success!");
            _xblockexpression_1 = Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
          }
          _xifexpression = _xblockexpression_1;
        } else {
          System.out.println("Fail!");
        }
        _xblockexpression = _xifexpression;
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else if (_t instanceof InterruptedException) {
        final InterruptedException e_1 = (InterruptedException)_t;
        e_1.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
}

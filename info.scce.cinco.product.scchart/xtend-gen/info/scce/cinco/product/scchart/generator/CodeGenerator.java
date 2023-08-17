package info.scce.cinco.product.scchart.generator;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import de.jabc.cinco.meta.runtime.CincoRuntimeBaseClass;
import graphmodel.Node;
import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeGenerator extends CincoRuntimeBaseClass implements IGenerator<SCChart> {
  private String fileName;
  
  private double sum = 0.0;
  
  @Override
  public void generate(final SCChart scchart, final IPath path, final IProgressMonitor monitor) {
    final String fullFileName = this._workspaceExtension.getFile(scchart).getName();
    this.fileName = fullFileName.substring(0, fullFileName.lastIndexOf("."));
    final IFile targetFile = this._workspaceExtension.getWorkspaceRoot().getFileForLocation(path.append((this.fileName + ".sctx")));
    EclipseFileUtils.writeToFile(targetFile, this.template(scchart));
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
      Iterable<InitialState> _find = this._graphModelExtension.<InitialState>find(region, InitialState.class);
      for(final InitialState initState : _find) {
        _builder.append("\t");
        String _genInitState = this.genInitState(initState);
        _builder.append(_genInitState, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        this.genEdgesOrder(initState.getOutgoingAbstractTransitions());
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String genInitState(final InitialState initState) {
    String string = "initial state ";
    String _name = initState.getName();
    String _plus = (string + _name);
    string = _plus;
    String _label = initState.getLabel();
    boolean _tripleNotEquals = (_label != null);
    if (_tripleNotEquals) {
      String _label_1 = initState.getLabel();
      String _plus_1 = ((string + " ") + _label_1);
      string = _plus_1;
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
    return string;
  }
  
  public void genEdgesOrder(final EList<AbstractTransition> transitions) {
    for (int i = 0; (i < transitions.size()); i++) {
      {
        boolean continue_ = false;
        int j = 0;
        while (((!continue_) && (j < transitions.size()))) {
          String _priority = transitions.get(j).getPriority();
          boolean _equals = Objects.equal(_priority, Integer.valueOf(i));
          if (_equals) {
            this.genEdge(transitions.get(j));
            continue_ = true;
          }
        }
      }
    }
  }
  
  public String genEdge(final AbstractTransition transition) {
    boolean _matched = false;
    if ((transition instanceof Transition)) {
      _matched=true;
      return this.genTransition(((Transition) transition));
    }
    return "";
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
      boolean _isEmpty_1 = transition.getCondition().trim().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _isEmpty_2 = transition.getEffect().trim().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        string = (string + " do ");
        String _effect_1 = transition.getEffect();
        /* (_effect_1 + " "); */
      }
    }
    Node _targetElement = transition.getTargetElement();
    boolean _matched = false;
    Node _targetElement_1 = transition.getTargetElement();
    if ((_targetElement_1 instanceof SuperState)) {
      _matched=true;
      Node _targetElement_2 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_2).getName();
      /* ((string + "go to ") + _name); */
    }
    if (!_matched) {
      Node _targetElement_3 = transition.getTargetElement();
      if ((_targetElement_3 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_4 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_4).getName();
        /* ((string + "go to ") + _name_1); */
      }
    }
    return string;
  }
  
  public String genImmediateTransition(final ImmediateTransition transition) {
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
      boolean _isEmpty_1 = transition.getCondition().trim().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _isEmpty_2 = transition.getEffect().trim().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        string = (string + " do ");
        String _effect_1 = transition.getEffect();
        /* (_effect_1 + " "); */
      }
    }
    Node _targetElement = transition.getTargetElement();
    boolean _matched = false;
    Node _targetElement_1 = transition.getTargetElement();
    if ((_targetElement_1 instanceof SuperState)) {
      _matched=true;
      Node _targetElement_2 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_2).getName();
      /* ((string + "go to ") + _name); */
    }
    if (!_matched) {
      Node _targetElement_3 = transition.getTargetElement();
      if ((_targetElement_3 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_4 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_4).getName();
        /* ((string + "go to ") + _name_1); */
      }
    }
    return string;
  }
  
  public String genTerminationTransition(final TerminationTransition transition) {
    String string = "";
    String _effect = transition.getEffect();
    boolean _tripleNotEquals = (_effect != null);
    if (_tripleNotEquals) {
      boolean _isEmpty = transition.getEffect().trim().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        string = (string + " do ");
        String _effect_1 = transition.getEffect();
        /* (_effect_1 + " "); */
      }
    }
    Node _targetElement = transition.getTargetElement();
    boolean _matched = false;
    Node _targetElement_1 = transition.getTargetElement();
    if ((_targetElement_1 instanceof SuperState)) {
      _matched=true;
      Node _targetElement_2 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_2).getName();
      /* ((string + "join to ") + _name); */
    }
    if (!_matched) {
      Node _targetElement_3 = transition.getTargetElement();
      if ((_targetElement_3 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_4 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_4).getName();
        /* ((string + "join to ") + _name_1); */
      }
    }
    return string;
  }
  
  public String genConditionalTerminationTransition(final ConditionalTerminationTransition transition) {
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
      boolean _isEmpty_1 = transition.getCondition().trim().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _isEmpty_2 = transition.getEffect().trim().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        string = (string + " do ");
        String _effect_1 = transition.getEffect();
        /* (_effect_1 + " "); */
      }
    }
    Node _targetElement = transition.getTargetElement();
    boolean _matched = false;
    Node _targetElement_1 = transition.getTargetElement();
    if ((_targetElement_1 instanceof SuperState)) {
      _matched=true;
      Node _targetElement_2 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_2).getName();
      /* ((string + "join to ") + _name); */
    }
    if (!_matched) {
      Node _targetElement_3 = transition.getTargetElement();
      if ((_targetElement_3 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_4 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_4).getName();
        /* ((string + "join to ") + _name_1); */
      }
    }
    return string;
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
      boolean _isEmpty_1 = transition.getCondition().trim().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _isEmpty_2 = transition.getEffect().trim().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        string = (string + " do ");
        String _effect_1 = transition.getEffect();
        /* (_effect_1 + " "); */
      }
    }
    Node _targetElement = transition.getTargetElement();
    boolean _matched = false;
    Node _targetElement_1 = transition.getTargetElement();
    if ((_targetElement_1 instanceof SuperState)) {
      _matched=true;
      Node _targetElement_2 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_2).getName();
      /* ((string + "abort to ") + _name); */
    }
    if (!_matched) {
      Node _targetElement_3 = transition.getTargetElement();
      if ((_targetElement_3 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_4 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_4).getName();
        /* ((string + "abort to ") + _name_1); */
      }
    }
    return string;
  }
  
  public String genImmediateStrongAbortTransition(final ImmediateStrongAbortTransition transition) {
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
      boolean _isEmpty_1 = transition.getCondition().trim().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        String _condition_1 = transition.getCondition();
        String _plus_2 = (("immediate if " + string) + _condition_1);
        String _plus_3 = (_plus_2 + " ");
        string = _plus_3;
      }
    }
    String _effect = transition.getEffect();
    boolean _tripleNotEquals_2 = (_effect != null);
    if (_tripleNotEquals_2) {
      boolean _isEmpty_2 = transition.getEffect().trim().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        string = (string + " do ");
        String _effect_1 = transition.getEffect();
        /* (_effect_1 + " "); */
      }
    }
    Node _targetElement = transition.getTargetElement();
    boolean _matched = false;
    Node _targetElement_1 = transition.getTargetElement();
    if ((_targetElement_1 instanceof SuperState)) {
      _matched=true;
      Node _targetElement_2 = transition.getTargetElement();
      String _name = ((SuperState) _targetElement_2).getName();
      /* ((string + "abort to ") + _name); */
    }
    if (!_matched) {
      Node _targetElement_3 = transition.getTargetElement();
      if ((_targetElement_3 instanceof SimpleState)) {
        _matched=true;
        Node _targetElement_4 = transition.getTargetElement();
        String _name_1 = ((SimpleState) _targetElement_4).getName();
        /* ((string + "abort to ") + _name_1); */
      }
    }
    return string;
  }
}

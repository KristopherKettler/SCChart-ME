package info.scce.cinco.product.scchart.mglid.factory;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.core.event.hub.EventHub;
import de.jabc.cinco.meta.core.event.hub.impl.PayloadContext;
import de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload;
import de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Type;
import graphmodel.internal.InternalEdge;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;
import graphmodel.internal.InternalType;
import info.scce.cinco.product.scchart.mglid.adapter.AbstractTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ActionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.CircuitConnecterEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ConditionalTerminationDeferredTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ConditionalTerminationHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ConditionalTerminationTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ConnectionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ConnectorEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.DataFlowRegionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.DeclarationEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.DeferredTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.FinalStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.FinalSuperStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.HistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ImmediateDeferredTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ImmediateHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ImmediateStrongAbortDeferredTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ImmediateStrongAbortHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ImmediateStrongAbortTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.ImmediateTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.InitialStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.InitilalSuperStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.InputEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.OperatorEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.OutputEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.RegionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.RootStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.SCChartEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.SimpleStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.StrongAbortDeferredTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.StrongAbortHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.StrongAbortTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.SuperStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.SuspendEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.TerminationDefferdTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.TerminationHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.TerminationTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.TransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.CircuitConnecter;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Connection;
import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Input;
import info.scce.cinco.product.scchart.mglid.scchart.Operator;
import info.scce.cinco.product.scchart.mglid.scchart.Output;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;
import info.scce.cinco.product.scchart.mglid.scchart.impl.ScchartFactoryImpl;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalCircuitConnecter;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConditionalTerminationDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConditionalTerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConditionalTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnection;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDataFlowRegion;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFactory;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateStrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateStrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateStrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInput;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalOperator;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalOutput;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspend;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDefferdTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition;
import java.io.IOException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SCChartFactory extends ScchartFactoryImpl {
  @Extension
  private final InternalFactory _internalFactory = InternalFactory.eINSTANCE;
  
  public static SCChartFactory eINSTANCE = SCChartFactory.init();
  
  @Extension
  private WorkbenchExtension _workbenchExtension = new WorkbenchExtension();
  
  public static SCChartFactory init() {
    SCChartFactory _xblockexpression = null;
    {
      try {
        EFactory _eFactory = EPackage.Registry.INSTANCE.getEFactory(ScchartPackage.eNS_URI);
        final SCChartFactory fct = ((SCChartFactory) _eFactory);
        boolean _notEquals = (!Objects.equal(fct, null));
        if (_notEquals) {
          return ((SCChartFactory) fct);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exception = (Exception)_t;
          EcorePlugin.INSTANCE.log(exception);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = new SCChartFactory();
    }
    return _xblockexpression;
  }
  
  /**
   * This method creates an SCChart with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SCChart createSCChart(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SCChart _createSCChart = super.createSCChart();
    final Procedure1<SCChart> _function = (SCChart it) -> {
      EcoreUtil.setID(it, ID);
      InternalIdentifiableElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSCChart _createInternalSCChart = this._internalFactory.createInternalSCChart();
        _elvis = _createInternalSCChart;
      }
      final Procedure1<InternalIdentifiableElement> _function_1 = (InternalIdentifiableElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SCChartEContentAdapter _sCChartEContentAdapter = new SCChartEContentAdapter();
        _eAdapters.add(_sCChartEContentAdapter);
      };
      InternalIdentifiableElement _doubleArrow = ObjectExtensions.<InternalIdentifiableElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<SCChart>operator_doubleArrow(_createSCChart, _function);
  }
  
  /**
   * This method creates an SCChart with the given id. Post create hook won't be triggered.
   */
  public SCChart createSCChart(final String ID) {
    return this.createSCChart(ID, null, null, false);
  }
  
  /**
   * This method creates an SCChart with the given id. Post create hook will be triggered.
   */
  public SCChart createSCChart(final InternalModelElementContainer parent) {
    return this.createSCChart(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SCChart with the given id. Post create hook will be triggered.
   */
  public SCChart createSCChart(final String ID, final InternalModelElementContainer parent) {
    return this.createSCChart(ID, null, parent, true);
  }
  
  public SCChart createSCChart(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSCChart(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SCChart with the given id. Post create hook won't be triggered.
   */
  public SCChart createSCChart(final InternalModelElement ime) {
    return this.createSCChart(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SCChart createSCChart() {
    return this.createSCChart(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an InitilalSuperState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public InitilalSuperState createInitilalSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    InitilalSuperState _createInitilalSuperState = super.createInitilalSuperState();
    final Procedure1<InitilalSuperState> _function = (InitilalSuperState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalInitilalSuperState _createInternalInitilalSuperState = this._internalFactory.createInternalInitilalSuperState();
        _elvis = _createInternalInitilalSuperState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        InitilalSuperStateEContentAdapter _initilalSuperStateEContentAdapter = new InitilalSuperStateEContentAdapter();
        _eAdapters.add(_initilalSuperStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<InitilalSuperState>operator_doubleArrow(_createInitilalSuperState, _function);
  }
  
  /**
   * This method creates an InitilalSuperState with the given id. Post create hook won't be triggered.
   */
  public InitilalSuperState createInitilalSuperState(final String ID) {
    return this.createInitilalSuperState(ID, null, null, false);
  }
  
  /**
   * This method creates an InitilalSuperState with the given id. Post create hook will be triggered.
   */
  public InitilalSuperState createInitilalSuperState(final InternalModelElementContainer parent) {
    return this.createInitilalSuperState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an InitilalSuperState with the given id. Post create hook will be triggered.
   */
  public InitilalSuperState createInitilalSuperState(final String ID, final InternalModelElementContainer parent) {
    return this.createInitilalSuperState(ID, null, parent, true);
  }
  
  public InitilalSuperState createInitilalSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createInitilalSuperState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an InitilalSuperState with the given id. Post create hook won't be triggered.
   */
  public InitilalSuperState createInitilalSuperState(final InternalModelElement ime) {
    return this.createInitilalSuperState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public InitilalSuperState createInitilalSuperState() {
    return this.createInitilalSuperState(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Declaration with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Declaration createDeclaration(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Declaration _createDeclaration = super.createDeclaration();
    final Procedure1<Declaration> _function = (Declaration it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalDeclaration _createInternalDeclaration = this._internalFactory.createInternalDeclaration();
        _elvis = _createInternalDeclaration;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        DeclarationEContentAdapter _declarationEContentAdapter = new DeclarationEContentAdapter();
        _eAdapters.add(_declarationEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<Declaration>operator_doubleArrow(_createDeclaration, _function);
  }
  
  /**
   * This method creates an Declaration with the given id. Post create hook won't be triggered.
   */
  public Declaration createDeclaration(final String ID) {
    return this.createDeclaration(ID, null, null, false);
  }
  
  /**
   * This method creates an Declaration with the given id. Post create hook will be triggered.
   */
  public Declaration createDeclaration(final InternalModelElementContainer parent) {
    return this.createDeclaration(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Declaration with the given id. Post create hook will be triggered.
   */
  public Declaration createDeclaration(final String ID, final InternalModelElementContainer parent) {
    return this.createDeclaration(ID, null, parent, true);
  }
  
  public Declaration createDeclaration(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createDeclaration(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Declaration with the given id. Post create hook won't be triggered.
   */
  public Declaration createDeclaration(final InternalModelElement ime) {
    return this.createDeclaration(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Declaration createDeclaration() {
    return this.createDeclaration(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Output with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Output createOutput(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Output _createOutput = super.createOutput();
    final Procedure1<Output> _function = (Output it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalOutput _createInternalOutput = this._internalFactory.createInternalOutput();
        _elvis = _createInternalOutput;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        OutputEContentAdapter _outputEContentAdapter = new OutputEContentAdapter();
        _eAdapters.add(_outputEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Output>operator_doubleArrow(_createOutput, _function);
  }
  
  /**
   * This method creates an Output with the given id. Post create hook won't be triggered.
   */
  public Output createOutput(final String ID) {
    return this.createOutput(ID, null, null, false);
  }
  
  /**
   * This method creates an Output with the given id. Post create hook will be triggered.
   */
  public Output createOutput(final InternalModelElementContainer parent) {
    return this.createOutput(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Output with the given id. Post create hook will be triggered.
   */
  public Output createOutput(final String ID, final InternalModelElementContainer parent) {
    return this.createOutput(ID, null, parent, true);
  }
  
  public Output createOutput(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createOutput(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Output with the given id. Post create hook won't be triggered.
   */
  public Output createOutput(final InternalModelElement ime) {
    return this.createOutput(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Output createOutput() {
    return this.createOutput(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Operator with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Operator createOperator(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Operator _createOperator = super.createOperator();
    final Procedure1<Operator> _function = (Operator it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalOperator _createInternalOperator = this._internalFactory.createInternalOperator();
        _elvis = _createInternalOperator;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        OperatorEContentAdapter _operatorEContentAdapter = new OperatorEContentAdapter();
        _eAdapters.add(_operatorEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Operator>operator_doubleArrow(_createOperator, _function);
  }
  
  /**
   * This method creates an Operator with the given id. Post create hook won't be triggered.
   */
  public Operator createOperator(final String ID) {
    return this.createOperator(ID, null, null, false);
  }
  
  /**
   * This method creates an Operator with the given id. Post create hook will be triggered.
   */
  public Operator createOperator(final InternalModelElementContainer parent) {
    return this.createOperator(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Operator with the given id. Post create hook will be triggered.
   */
  public Operator createOperator(final String ID, final InternalModelElementContainer parent) {
    return this.createOperator(ID, null, parent, true);
  }
  
  public Operator createOperator(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createOperator(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Operator with the given id. Post create hook won't be triggered.
   */
  public Operator createOperator(final InternalModelElement ime) {
    return this.createOperator(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Operator createOperator() {
    return this.createOperator(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an SimpleState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SimpleState createSimpleState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SimpleState _createSimpleState = super.createSimpleState();
    final Procedure1<SimpleState> _function = (SimpleState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSimpleState _createInternalSimpleState = this._internalFactory.createInternalSimpleState();
        _elvis = _createInternalSimpleState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SimpleStateEContentAdapter _simpleStateEContentAdapter = new SimpleStateEContentAdapter();
        _eAdapters.add(_simpleStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<SimpleState>operator_doubleArrow(_createSimpleState, _function);
  }
  
  /**
   * This method creates an SimpleState with the given id. Post create hook won't be triggered.
   */
  public SimpleState createSimpleState(final String ID) {
    return this.createSimpleState(ID, null, null, false);
  }
  
  /**
   * This method creates an SimpleState with the given id. Post create hook will be triggered.
   */
  public SimpleState createSimpleState(final InternalModelElementContainer parent) {
    return this.createSimpleState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SimpleState with the given id. Post create hook will be triggered.
   */
  public SimpleState createSimpleState(final String ID, final InternalModelElementContainer parent) {
    return this.createSimpleState(ID, null, parent, true);
  }
  
  public SimpleState createSimpleState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSimpleState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SimpleState with the given id. Post create hook won't be triggered.
   */
  public SimpleState createSimpleState(final InternalModelElement ime) {
    return this.createSimpleState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SimpleState createSimpleState() {
    return this.createSimpleState(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Action with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Action createAction(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Action _createAction = super.createAction();
    final Procedure1<Action> _function = (Action it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalAction _createInternalAction = this._internalFactory.createInternalAction();
        _elvis = _createInternalAction;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ActionEContentAdapter _actionEContentAdapter = new ActionEContentAdapter();
        _eAdapters.add(_actionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<Action>operator_doubleArrow(_createAction, _function);
  }
  
  /**
   * This method creates an Action with the given id. Post create hook won't be triggered.
   */
  public Action createAction(final String ID) {
    return this.createAction(ID, null, null, false);
  }
  
  /**
   * This method creates an Action with the given id. Post create hook will be triggered.
   */
  public Action createAction(final InternalModelElementContainer parent) {
    return this.createAction(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Action with the given id. Post create hook will be triggered.
   */
  public Action createAction(final String ID, final InternalModelElementContainer parent) {
    return this.createAction(ID, null, parent, true);
  }
  
  public Action createAction(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createAction(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Action with the given id. Post create hook won't be triggered.
   */
  public Action createAction(final InternalModelElement ime) {
    return this.createAction(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Action createAction() {
    return this.createAction(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Input with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Input createInput(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Input _createInput = super.createInput();
    final Procedure1<Input> _function = (Input it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalInput _createInternalInput = this._internalFactory.createInternalInput();
        _elvis = _createInternalInput;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        InputEContentAdapter _inputEContentAdapter = new InputEContentAdapter();
        _eAdapters.add(_inputEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Input>operator_doubleArrow(_createInput, _function);
  }
  
  /**
   * This method creates an Input with the given id. Post create hook won't be triggered.
   */
  public Input createInput(final String ID) {
    return this.createInput(ID, null, null, false);
  }
  
  /**
   * This method creates an Input with the given id. Post create hook will be triggered.
   */
  public Input createInput(final InternalModelElementContainer parent) {
    return this.createInput(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Input with the given id. Post create hook will be triggered.
   */
  public Input createInput(final String ID, final InternalModelElementContainer parent) {
    return this.createInput(ID, null, parent, true);
  }
  
  public Input createInput(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createInput(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Input with the given id. Post create hook won't be triggered.
   */
  public Input createInput(final InternalModelElement ime) {
    return this.createInput(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Input createInput() {
    return this.createInput(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an RootState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public RootState createRootState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    RootState _createRootState = super.createRootState();
    final Procedure1<RootState> _function = (RootState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalRootState _createInternalRootState = this._internalFactory.createInternalRootState();
        _elvis = _createInternalRootState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        RootStateEContentAdapter _rootStateEContentAdapter = new RootStateEContentAdapter();
        _eAdapters.add(_rootStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<RootState>operator_doubleArrow(_createRootState, _function);
  }
  
  /**
   * This method creates an RootState with the given id. Post create hook won't be triggered.
   */
  public RootState createRootState(final String ID) {
    return this.createRootState(ID, null, null, false);
  }
  
  /**
   * This method creates an RootState with the given id. Post create hook will be triggered.
   */
  public RootState createRootState(final InternalModelElementContainer parent) {
    return this.createRootState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an RootState with the given id. Post create hook will be triggered.
   */
  public RootState createRootState(final String ID, final InternalModelElementContainer parent) {
    return this.createRootState(ID, null, parent, true);
  }
  
  public RootState createRootState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createRootState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an RootState with the given id. Post create hook won't be triggered.
   */
  public RootState createRootState(final InternalModelElement ime) {
    return this.createRootState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public RootState createRootState() {
    return this.createRootState(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Region with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Region createRegion(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Region _createRegion = super.createRegion();
    final Procedure1<Region> _function = (Region it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalRegion _createInternalRegion = this._internalFactory.createInternalRegion();
        _elvis = _createInternalRegion;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        RegionEContentAdapter _regionEContentAdapter = new RegionEContentAdapter();
        _eAdapters.add(_regionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<Region>operator_doubleArrow(_createRegion, _function);
  }
  
  /**
   * This method creates an Region with the given id. Post create hook won't be triggered.
   */
  public Region createRegion(final String ID) {
    return this.createRegion(ID, null, null, false);
  }
  
  /**
   * This method creates an Region with the given id. Post create hook will be triggered.
   */
  public Region createRegion(final InternalModelElementContainer parent) {
    return this.createRegion(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Region with the given id. Post create hook will be triggered.
   */
  public Region createRegion(final String ID, final InternalModelElementContainer parent) {
    return this.createRegion(ID, null, parent, true);
  }
  
  public Region createRegion(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createRegion(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Region with the given id. Post create hook won't be triggered.
   */
  public Region createRegion(final InternalModelElement ime) {
    return this.createRegion(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Region createRegion() {
    return this.createRegion(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Connector with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Connector createConnector(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Connector _createConnector = super.createConnector();
    final Procedure1<Connector> _function = (Connector it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalConnector _createInternalConnector = this._internalFactory.createInternalConnector();
        _elvis = _createInternalConnector;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ConnectorEContentAdapter _connectorEContentAdapter = new ConnectorEContentAdapter();
        _eAdapters.add(_connectorEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Connector>operator_doubleArrow(_createConnector, _function);
  }
  
  /**
   * This method creates an Connector with the given id. Post create hook won't be triggered.
   */
  public Connector createConnector(final String ID) {
    return this.createConnector(ID, null, null, false);
  }
  
  /**
   * This method creates an Connector with the given id. Post create hook will be triggered.
   */
  public Connector createConnector(final InternalModelElementContainer parent) {
    return this.createConnector(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Connector with the given id. Post create hook will be triggered.
   */
  public Connector createConnector(final String ID, final InternalModelElementContainer parent) {
    return this.createConnector(ID, null, parent, true);
  }
  
  public Connector createConnector(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createConnector(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Connector with the given id. Post create hook won't be triggered.
   */
  public Connector createConnector(final InternalModelElement ime) {
    return this.createConnector(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Connector createConnector() {
    return this.createConnector(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an CircuitConnecter with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public CircuitConnecter createCircuitConnecter(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    CircuitConnecter _createCircuitConnecter = super.createCircuitConnecter();
    final Procedure1<CircuitConnecter> _function = (CircuitConnecter it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalCircuitConnecter _createInternalCircuitConnecter = this._internalFactory.createInternalCircuitConnecter();
        _elvis = _createInternalCircuitConnecter;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        CircuitConnecterEContentAdapter _circuitConnecterEContentAdapter = new CircuitConnecterEContentAdapter();
        _eAdapters.add(_circuitConnecterEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<CircuitConnecter>operator_doubleArrow(_createCircuitConnecter, _function);
  }
  
  /**
   * This method creates an CircuitConnecter with the given id. Post create hook won't be triggered.
   */
  public CircuitConnecter createCircuitConnecter(final String ID) {
    return this.createCircuitConnecter(ID, null, null, false);
  }
  
  /**
   * This method creates an CircuitConnecter with the given id. Post create hook will be triggered.
   */
  public CircuitConnecter createCircuitConnecter(final InternalModelElementContainer parent) {
    return this.createCircuitConnecter(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an CircuitConnecter with the given id. Post create hook will be triggered.
   */
  public CircuitConnecter createCircuitConnecter(final String ID, final InternalModelElementContainer parent) {
    return this.createCircuitConnecter(ID, null, parent, true);
  }
  
  public CircuitConnecter createCircuitConnecter(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createCircuitConnecter(ID, ime, parent, true);
  }
  
  /**
   * This method creates an CircuitConnecter with the given id. Post create hook won't be triggered.
   */
  public CircuitConnecter createCircuitConnecter(final InternalModelElement ime) {
    return this.createCircuitConnecter(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public CircuitConnecter createCircuitConnecter() {
    return this.createCircuitConnecter(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an InitialState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public InitialState createInitialState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    InitialState _createInitialState = super.createInitialState();
    final Procedure1<InitialState> _function = (InitialState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalInitialState _createInternalInitialState = this._internalFactory.createInternalInitialState();
        _elvis = _createInternalInitialState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        InitialStateEContentAdapter _initialStateEContentAdapter = new InitialStateEContentAdapter();
        _eAdapters.add(_initialStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<InitialState>operator_doubleArrow(_createInitialState, _function);
  }
  
  /**
   * This method creates an InitialState with the given id. Post create hook won't be triggered.
   */
  public InitialState createInitialState(final String ID) {
    return this.createInitialState(ID, null, null, false);
  }
  
  /**
   * This method creates an InitialState with the given id. Post create hook will be triggered.
   */
  public InitialState createInitialState(final InternalModelElementContainer parent) {
    return this.createInitialState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an InitialState with the given id. Post create hook will be triggered.
   */
  public InitialState createInitialState(final String ID, final InternalModelElementContainer parent) {
    return this.createInitialState(ID, null, parent, true);
  }
  
  public InitialState createInitialState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createInitialState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an InitialState with the given id. Post create hook won't be triggered.
   */
  public InitialState createInitialState(final InternalModelElement ime) {
    return this.createInitialState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public InitialState createInitialState() {
    return this.createInitialState(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an FinalState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public FinalState createFinalState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    FinalState _createFinalState = super.createFinalState();
    final Procedure1<FinalState> _function = (FinalState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalFinalState _createInternalFinalState = this._internalFactory.createInternalFinalState();
        _elvis = _createInternalFinalState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        FinalStateEContentAdapter _finalStateEContentAdapter = new FinalStateEContentAdapter();
        _eAdapters.add(_finalStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<FinalState>operator_doubleArrow(_createFinalState, _function);
  }
  
  /**
   * This method creates an FinalState with the given id. Post create hook won't be triggered.
   */
  public FinalState createFinalState(final String ID) {
    return this.createFinalState(ID, null, null, false);
  }
  
  /**
   * This method creates an FinalState with the given id. Post create hook will be triggered.
   */
  public FinalState createFinalState(final InternalModelElementContainer parent) {
    return this.createFinalState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an FinalState with the given id. Post create hook will be triggered.
   */
  public FinalState createFinalState(final String ID, final InternalModelElementContainer parent) {
    return this.createFinalState(ID, null, parent, true);
  }
  
  public FinalState createFinalState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createFinalState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an FinalState with the given id. Post create hook won't be triggered.
   */
  public FinalState createFinalState(final InternalModelElement ime) {
    return this.createFinalState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public FinalState createFinalState() {
    return this.createFinalState(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an DataFlowRegion with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public DataFlowRegion createDataFlowRegion(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    DataFlowRegion _createDataFlowRegion = super.createDataFlowRegion();
    final Procedure1<DataFlowRegion> _function = (DataFlowRegion it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalDataFlowRegion _createInternalDataFlowRegion = this._internalFactory.createInternalDataFlowRegion();
        _elvis = _createInternalDataFlowRegion;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        DataFlowRegionEContentAdapter _dataFlowRegionEContentAdapter = new DataFlowRegionEContentAdapter();
        _eAdapters.add(_dataFlowRegionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<DataFlowRegion>operator_doubleArrow(_createDataFlowRegion, _function);
  }
  
  /**
   * This method creates an DataFlowRegion with the given id. Post create hook won't be triggered.
   */
  public DataFlowRegion createDataFlowRegion(final String ID) {
    return this.createDataFlowRegion(ID, null, null, false);
  }
  
  /**
   * This method creates an DataFlowRegion with the given id. Post create hook will be triggered.
   */
  public DataFlowRegion createDataFlowRegion(final InternalModelElementContainer parent) {
    return this.createDataFlowRegion(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an DataFlowRegion with the given id. Post create hook will be triggered.
   */
  public DataFlowRegion createDataFlowRegion(final String ID, final InternalModelElementContainer parent) {
    return this.createDataFlowRegion(ID, null, parent, true);
  }
  
  public DataFlowRegion createDataFlowRegion(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createDataFlowRegion(ID, ime, parent, true);
  }
  
  /**
   * This method creates an DataFlowRegion with the given id. Post create hook won't be triggered.
   */
  public DataFlowRegion createDataFlowRegion(final InternalModelElement ime) {
    return this.createDataFlowRegion(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public DataFlowRegion createDataFlowRegion() {
    return this.createDataFlowRegion(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Suspend with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Suspend createSuspend(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Suspend _createSuspend = super.createSuspend();
    final Procedure1<Suspend> _function = (Suspend it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSuspend _createInternalSuspend = this._internalFactory.createInternalSuspend();
        _elvis = _createInternalSuspend;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SuspendEContentAdapter _suspendEContentAdapter = new SuspendEContentAdapter();
        _eAdapters.add(_suspendEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<Suspend>operator_doubleArrow(_createSuspend, _function);
  }
  
  /**
   * This method creates an Suspend with the given id. Post create hook won't be triggered.
   */
  public Suspend createSuspend(final String ID) {
    return this.createSuspend(ID, null, null, false);
  }
  
  /**
   * This method creates an Suspend with the given id. Post create hook will be triggered.
   */
  public Suspend createSuspend(final InternalModelElementContainer parent) {
    return this.createSuspend(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Suspend with the given id. Post create hook will be triggered.
   */
  public Suspend createSuspend(final String ID, final InternalModelElementContainer parent) {
    return this.createSuspend(ID, null, parent, true);
  }
  
  public Suspend createSuspend(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSuspend(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Suspend with the given id. Post create hook won't be triggered.
   */
  public Suspend createSuspend(final InternalModelElement ime) {
    return this.createSuspend(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Suspend createSuspend() {
    return this.createSuspend(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an SuperState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SuperState createSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SuperState _createSuperState = super.createSuperState();
    final Procedure1<SuperState> _function = (SuperState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSuperState _createInternalSuperState = this._internalFactory.createInternalSuperState();
        _elvis = _createInternalSuperState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SuperStateEContentAdapter _superStateEContentAdapter = new SuperStateEContentAdapter();
        _eAdapters.add(_superStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<SuperState>operator_doubleArrow(_createSuperState, _function);
  }
  
  /**
   * This method creates an SuperState with the given id. Post create hook won't be triggered.
   */
  public SuperState createSuperState(final String ID) {
    return this.createSuperState(ID, null, null, false);
  }
  
  /**
   * This method creates an SuperState with the given id. Post create hook will be triggered.
   */
  public SuperState createSuperState(final InternalModelElementContainer parent) {
    return this.createSuperState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SuperState with the given id. Post create hook will be triggered.
   */
  public SuperState createSuperState(final String ID, final InternalModelElementContainer parent) {
    return this.createSuperState(ID, null, parent, true);
  }
  
  public SuperState createSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSuperState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SuperState with the given id. Post create hook won't be triggered.
   */
  public SuperState createSuperState(final InternalModelElement ime) {
    return this.createSuperState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SuperState createSuperState() {
    return this.createSuperState(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an FinalSuperState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public FinalSuperState createFinalSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    FinalSuperState _createFinalSuperState = super.createFinalSuperState();
    final Procedure1<FinalSuperState> _function = (FinalSuperState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalFinalSuperState _createInternalFinalSuperState = this._internalFactory.createInternalFinalSuperState();
        _elvis = _createInternalFinalSuperState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        FinalSuperStateEContentAdapter _finalSuperStateEContentAdapter = new FinalSuperStateEContentAdapter();
        _eAdapters.add(_finalSuperStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<FinalSuperState>operator_doubleArrow(_createFinalSuperState, _function);
  }
  
  /**
   * This method creates an FinalSuperState with the given id. Post create hook won't be triggered.
   */
  public FinalSuperState createFinalSuperState(final String ID) {
    return this.createFinalSuperState(ID, null, null, false);
  }
  
  /**
   * This method creates an FinalSuperState with the given id. Post create hook will be triggered.
   */
  public FinalSuperState createFinalSuperState(final InternalModelElementContainer parent) {
    return this.createFinalSuperState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an FinalSuperState with the given id. Post create hook will be triggered.
   */
  public FinalSuperState createFinalSuperState(final String ID, final InternalModelElementContainer parent) {
    return this.createFinalSuperState(ID, null, parent, true);
  }
  
  public FinalSuperState createFinalSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createFinalSuperState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an FinalSuperState with the given id. Post create hook won't be triggered.
   */
  public FinalSuperState createFinalSuperState(final InternalModelElement ime) {
    return this.createFinalSuperState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public FinalSuperState createFinalSuperState() {
    return this.createFinalSuperState(EcoreUtil.generateUUID());
  }
  
  public ConditionalTerminationDeferredTransition createConditionalTerminationDeferredTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    ConditionalTerminationDeferredTransition _createConditionalTerminationDeferredTransition = super.createConditionalTerminationDeferredTransition();
    final Procedure1<ConditionalTerminationDeferredTransition> _function = (ConditionalTerminationDeferredTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalConditionalTerminationDeferredTransition _createInternalConditionalTerminationDeferredTransition = this._internalFactory.createInternalConditionalTerminationDeferredTransition();
        _elvis = _createInternalConditionalTerminationDeferredTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ConditionalTerminationDeferredTransitionEContentAdapter _conditionalTerminationDeferredTransitionEContentAdapter = new ConditionalTerminationDeferredTransitionEContentAdapter();
        _eAdapters.add(_conditionalTerminationDeferredTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<ConditionalTerminationDeferredTransition>operator_doubleArrow(_createConditionalTerminationDeferredTransition, _function);
  }
  
  /**
   * This method creates an ConditionalTerminationDeferredTransition with the given id. Post create hook will be triggered.
   */
  public ConditionalTerminationDeferredTransition createConditionalTerminationDeferredTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createConditionalTerminationDeferredTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an ConditionalTerminationDeferredTransition with generated id. Post create hook will be triggered.
   */
  public ConditionalTerminationDeferredTransition createConditionalTerminationDeferredTransition(final InternalNode source, final InternalNode target) {
    return this.createConditionalTerminationDeferredTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an ConditionalTerminationDeferredTransition with the given id. Post create hook won't be triggered.
   */
  public ConditionalTerminationDeferredTransition createConditionalTerminationDeferredTransition(final String ID) {
    return this.createConditionalTerminationDeferredTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an ConditionalTerminationDeferredTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public ConditionalTerminationDeferredTransition createConditionalTerminationDeferredTransition() {
    return this.createConditionalTerminationDeferredTransition(EcoreUtil.generateUUID());
  }
  
  public TerminationHistoryTransition createTerminationHistoryTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    TerminationHistoryTransition _createTerminationHistoryTransition = super.createTerminationHistoryTransition();
    final Procedure1<TerminationHistoryTransition> _function = (TerminationHistoryTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTerminationHistoryTransition _createInternalTerminationHistoryTransition = this._internalFactory.createInternalTerminationHistoryTransition();
        _elvis = _createInternalTerminationHistoryTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TerminationHistoryTransitionEContentAdapter _terminationHistoryTransitionEContentAdapter = new TerminationHistoryTransitionEContentAdapter();
        _eAdapters.add(_terminationHistoryTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<TerminationHistoryTransition>operator_doubleArrow(_createTerminationHistoryTransition, _function);
  }
  
  /**
   * This method creates an TerminationHistoryTransition with the given id. Post create hook will be triggered.
   */
  public TerminationHistoryTransition createTerminationHistoryTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createTerminationHistoryTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an TerminationHistoryTransition with generated id. Post create hook will be triggered.
   */
  public TerminationHistoryTransition createTerminationHistoryTransition(final InternalNode source, final InternalNode target) {
    return this.createTerminationHistoryTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an TerminationHistoryTransition with the given id. Post create hook won't be triggered.
   */
  public TerminationHistoryTransition createTerminationHistoryTransition(final String ID) {
    return this.createTerminationHistoryTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an TerminationHistoryTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public TerminationHistoryTransition createTerminationHistoryTransition() {
    return this.createTerminationHistoryTransition(EcoreUtil.generateUUID());
  }
  
  public AbstractTransition createAbstractTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    AbstractTransition _createAbstractTransition = super.createAbstractTransition();
    final Procedure1<AbstractTransition> _function = (AbstractTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalAbstractTransition _createInternalAbstractTransition = this._internalFactory.createInternalAbstractTransition();
        _elvis = _createInternalAbstractTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        AbstractTransitionEContentAdapter _abstractTransitionEContentAdapter = new AbstractTransitionEContentAdapter();
        _eAdapters.add(_abstractTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<AbstractTransition>operator_doubleArrow(_createAbstractTransition, _function);
  }
  
  /**
   * This method creates an AbstractTransition with the given id. Post create hook will be triggered.
   */
  public AbstractTransition createAbstractTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createAbstractTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an AbstractTransition with generated id. Post create hook will be triggered.
   */
  public AbstractTransition createAbstractTransition(final InternalNode source, final InternalNode target) {
    return this.createAbstractTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an AbstractTransition with the given id. Post create hook won't be triggered.
   */
  public AbstractTransition createAbstractTransition(final String ID) {
    return this.createAbstractTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an AbstractTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public AbstractTransition createAbstractTransition() {
    return this.createAbstractTransition(EcoreUtil.generateUUID());
  }
  
  public DeferredTransition createDeferredTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    DeferredTransition _createDeferredTransition = super.createDeferredTransition();
    final Procedure1<DeferredTransition> _function = (DeferredTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalDeferredTransition _createInternalDeferredTransition = this._internalFactory.createInternalDeferredTransition();
        _elvis = _createInternalDeferredTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        DeferredTransitionEContentAdapter _deferredTransitionEContentAdapter = new DeferredTransitionEContentAdapter();
        _eAdapters.add(_deferredTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<DeferredTransition>operator_doubleArrow(_createDeferredTransition, _function);
  }
  
  /**
   * This method creates an DeferredTransition with the given id. Post create hook will be triggered.
   */
  public DeferredTransition createDeferredTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createDeferredTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an DeferredTransition with generated id. Post create hook will be triggered.
   */
  public DeferredTransition createDeferredTransition(final InternalNode source, final InternalNode target) {
    return this.createDeferredTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an DeferredTransition with the given id. Post create hook won't be triggered.
   */
  public DeferredTransition createDeferredTransition(final String ID) {
    return this.createDeferredTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an DeferredTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public DeferredTransition createDeferredTransition() {
    return this.createDeferredTransition(EcoreUtil.generateUUID());
  }
  
  public StrongAbortHistoryTransition createStrongAbortHistoryTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    StrongAbortHistoryTransition _createStrongAbortHistoryTransition = super.createStrongAbortHistoryTransition();
    final Procedure1<StrongAbortHistoryTransition> _function = (StrongAbortHistoryTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalStrongAbortHistoryTransition _createInternalStrongAbortHistoryTransition = this._internalFactory.createInternalStrongAbortHistoryTransition();
        _elvis = _createInternalStrongAbortHistoryTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        StrongAbortHistoryTransitionEContentAdapter _strongAbortHistoryTransitionEContentAdapter = new StrongAbortHistoryTransitionEContentAdapter();
        _eAdapters.add(_strongAbortHistoryTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<StrongAbortHistoryTransition>operator_doubleArrow(_createStrongAbortHistoryTransition, _function);
  }
  
  /**
   * This method creates an StrongAbortHistoryTransition with the given id. Post create hook will be triggered.
   */
  public StrongAbortHistoryTransition createStrongAbortHistoryTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createStrongAbortHistoryTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an StrongAbortHistoryTransition with generated id. Post create hook will be triggered.
   */
  public StrongAbortHistoryTransition createStrongAbortHistoryTransition(final InternalNode source, final InternalNode target) {
    return this.createStrongAbortHistoryTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an StrongAbortHistoryTransition with the given id. Post create hook won't be triggered.
   */
  public StrongAbortHistoryTransition createStrongAbortHistoryTransition(final String ID) {
    return this.createStrongAbortHistoryTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an StrongAbortHistoryTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public StrongAbortHistoryTransition createStrongAbortHistoryTransition() {
    return this.createStrongAbortHistoryTransition(EcoreUtil.generateUUID());
  }
  
  public ImmediateTransition createImmediateTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    ImmediateTransition _createImmediateTransition = super.createImmediateTransition();
    final Procedure1<ImmediateTransition> _function = (ImmediateTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalImmediateTransition _createInternalImmediateTransition = this._internalFactory.createInternalImmediateTransition();
        _elvis = _createInternalImmediateTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ImmediateTransitionEContentAdapter _immediateTransitionEContentAdapter = new ImmediateTransitionEContentAdapter();
        _eAdapters.add(_immediateTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<ImmediateTransition>operator_doubleArrow(_createImmediateTransition, _function);
  }
  
  /**
   * This method creates an ImmediateTransition with the given id. Post create hook will be triggered.
   */
  public ImmediateTransition createImmediateTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createImmediateTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateTransition with generated id. Post create hook will be triggered.
   */
  public ImmediateTransition createImmediateTransition(final InternalNode source, final InternalNode target) {
    return this.createImmediateTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateTransition with the given id. Post create hook won't be triggered.
   */
  public ImmediateTransition createImmediateTransition(final String ID) {
    return this.createImmediateTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an ImmediateTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public ImmediateTransition createImmediateTransition() {
    return this.createImmediateTransition(EcoreUtil.generateUUID());
  }
  
  public StrongAbortDeferredTransition createStrongAbortDeferredTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    StrongAbortDeferredTransition _createStrongAbortDeferredTransition = super.createStrongAbortDeferredTransition();
    final Procedure1<StrongAbortDeferredTransition> _function = (StrongAbortDeferredTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalStrongAbortDeferredTransition _createInternalStrongAbortDeferredTransition = this._internalFactory.createInternalStrongAbortDeferredTransition();
        _elvis = _createInternalStrongAbortDeferredTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        StrongAbortDeferredTransitionEContentAdapter _strongAbortDeferredTransitionEContentAdapter = new StrongAbortDeferredTransitionEContentAdapter();
        _eAdapters.add(_strongAbortDeferredTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<StrongAbortDeferredTransition>operator_doubleArrow(_createStrongAbortDeferredTransition, _function);
  }
  
  /**
   * This method creates an StrongAbortDeferredTransition with the given id. Post create hook will be triggered.
   */
  public StrongAbortDeferredTransition createStrongAbortDeferredTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createStrongAbortDeferredTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an StrongAbortDeferredTransition with generated id. Post create hook will be triggered.
   */
  public StrongAbortDeferredTransition createStrongAbortDeferredTransition(final InternalNode source, final InternalNode target) {
    return this.createStrongAbortDeferredTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an StrongAbortDeferredTransition with the given id. Post create hook won't be triggered.
   */
  public StrongAbortDeferredTransition createStrongAbortDeferredTransition(final String ID) {
    return this.createStrongAbortDeferredTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an StrongAbortDeferredTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public StrongAbortDeferredTransition createStrongAbortDeferredTransition() {
    return this.createStrongAbortDeferredTransition(EcoreUtil.generateUUID());
  }
  
  public ImmediateStrongAbortHistoryTransition createImmediateStrongAbortHistoryTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    ImmediateStrongAbortHistoryTransition _createImmediateStrongAbortHistoryTransition = super.createImmediateStrongAbortHistoryTransition();
    final Procedure1<ImmediateStrongAbortHistoryTransition> _function = (ImmediateStrongAbortHistoryTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalImmediateStrongAbortHistoryTransition _createInternalImmediateStrongAbortHistoryTransition = this._internalFactory.createInternalImmediateStrongAbortHistoryTransition();
        _elvis = _createInternalImmediateStrongAbortHistoryTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ImmediateStrongAbortHistoryTransitionEContentAdapter _immediateStrongAbortHistoryTransitionEContentAdapter = new ImmediateStrongAbortHistoryTransitionEContentAdapter();
        _eAdapters.add(_immediateStrongAbortHistoryTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<ImmediateStrongAbortHistoryTransition>operator_doubleArrow(_createImmediateStrongAbortHistoryTransition, _function);
  }
  
  /**
   * This method creates an ImmediateStrongAbortHistoryTransition with the given id. Post create hook will be triggered.
   */
  public ImmediateStrongAbortHistoryTransition createImmediateStrongAbortHistoryTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createImmediateStrongAbortHistoryTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateStrongAbortHistoryTransition with generated id. Post create hook will be triggered.
   */
  public ImmediateStrongAbortHistoryTransition createImmediateStrongAbortHistoryTransition(final InternalNode source, final InternalNode target) {
    return this.createImmediateStrongAbortHistoryTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateStrongAbortHistoryTransition with the given id. Post create hook won't be triggered.
   */
  public ImmediateStrongAbortHistoryTransition createImmediateStrongAbortHistoryTransition(final String ID) {
    return this.createImmediateStrongAbortHistoryTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an ImmediateStrongAbortHistoryTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public ImmediateStrongAbortHistoryTransition createImmediateStrongAbortHistoryTransition() {
    return this.createImmediateStrongAbortHistoryTransition(EcoreUtil.generateUUID());
  }
  
  public ImmediateDeferredTransition createImmediateDeferredTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    ImmediateDeferredTransition _createImmediateDeferredTransition = super.createImmediateDeferredTransition();
    final Procedure1<ImmediateDeferredTransition> _function = (ImmediateDeferredTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalImmediateDeferredTransition _createInternalImmediateDeferredTransition = this._internalFactory.createInternalImmediateDeferredTransition();
        _elvis = _createInternalImmediateDeferredTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ImmediateDeferredTransitionEContentAdapter _immediateDeferredTransitionEContentAdapter = new ImmediateDeferredTransitionEContentAdapter();
        _eAdapters.add(_immediateDeferredTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<ImmediateDeferredTransition>operator_doubleArrow(_createImmediateDeferredTransition, _function);
  }
  
  /**
   * This method creates an ImmediateDeferredTransition with the given id. Post create hook will be triggered.
   */
  public ImmediateDeferredTransition createImmediateDeferredTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createImmediateDeferredTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateDeferredTransition with generated id. Post create hook will be triggered.
   */
  public ImmediateDeferredTransition createImmediateDeferredTransition(final InternalNode source, final InternalNode target) {
    return this.createImmediateDeferredTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateDeferredTransition with the given id. Post create hook won't be triggered.
   */
  public ImmediateDeferredTransition createImmediateDeferredTransition(final String ID) {
    return this.createImmediateDeferredTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an ImmediateDeferredTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public ImmediateDeferredTransition createImmediateDeferredTransition() {
    return this.createImmediateDeferredTransition(EcoreUtil.generateUUID());
  }
  
  public ConditionalTerminationHistoryTransition createConditionalTerminationHistoryTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    ConditionalTerminationHistoryTransition _createConditionalTerminationHistoryTransition = super.createConditionalTerminationHistoryTransition();
    final Procedure1<ConditionalTerminationHistoryTransition> _function = (ConditionalTerminationHistoryTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalConditionalTerminationHistoryTransition _createInternalConditionalTerminationHistoryTransition = this._internalFactory.createInternalConditionalTerminationHistoryTransition();
        _elvis = _createInternalConditionalTerminationHistoryTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ConditionalTerminationHistoryTransitionEContentAdapter _conditionalTerminationHistoryTransitionEContentAdapter = new ConditionalTerminationHistoryTransitionEContentAdapter();
        _eAdapters.add(_conditionalTerminationHistoryTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<ConditionalTerminationHistoryTransition>operator_doubleArrow(_createConditionalTerminationHistoryTransition, _function);
  }
  
  /**
   * This method creates an ConditionalTerminationHistoryTransition with the given id. Post create hook will be triggered.
   */
  public ConditionalTerminationHistoryTransition createConditionalTerminationHistoryTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createConditionalTerminationHistoryTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an ConditionalTerminationHistoryTransition with generated id. Post create hook will be triggered.
   */
  public ConditionalTerminationHistoryTransition createConditionalTerminationHistoryTransition(final InternalNode source, final InternalNode target) {
    return this.createConditionalTerminationHistoryTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an ConditionalTerminationHistoryTransition with the given id. Post create hook won't be triggered.
   */
  public ConditionalTerminationHistoryTransition createConditionalTerminationHistoryTransition(final String ID) {
    return this.createConditionalTerminationHistoryTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an ConditionalTerminationHistoryTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public ConditionalTerminationHistoryTransition createConditionalTerminationHistoryTransition() {
    return this.createConditionalTerminationHistoryTransition(EcoreUtil.generateUUID());
  }
  
  public ConditionalTerminationTransition createConditionalTerminationTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    ConditionalTerminationTransition _createConditionalTerminationTransition = super.createConditionalTerminationTransition();
    final Procedure1<ConditionalTerminationTransition> _function = (ConditionalTerminationTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalConditionalTerminationTransition _createInternalConditionalTerminationTransition = this._internalFactory.createInternalConditionalTerminationTransition();
        _elvis = _createInternalConditionalTerminationTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ConditionalTerminationTransitionEContentAdapter _conditionalTerminationTransitionEContentAdapter = new ConditionalTerminationTransitionEContentAdapter();
        _eAdapters.add(_conditionalTerminationTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<ConditionalTerminationTransition>operator_doubleArrow(_createConditionalTerminationTransition, _function);
  }
  
  /**
   * This method creates an ConditionalTerminationTransition with the given id. Post create hook will be triggered.
   */
  public ConditionalTerminationTransition createConditionalTerminationTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createConditionalTerminationTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an ConditionalTerminationTransition with generated id. Post create hook will be triggered.
   */
  public ConditionalTerminationTransition createConditionalTerminationTransition(final InternalNode source, final InternalNode target) {
    return this.createConditionalTerminationTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an ConditionalTerminationTransition with the given id. Post create hook won't be triggered.
   */
  public ConditionalTerminationTransition createConditionalTerminationTransition(final String ID) {
    return this.createConditionalTerminationTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an ConditionalTerminationTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public ConditionalTerminationTransition createConditionalTerminationTransition() {
    return this.createConditionalTerminationTransition(EcoreUtil.generateUUID());
  }
  
  public TerminationTransition createTerminationTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    TerminationTransition _createTerminationTransition = super.createTerminationTransition();
    final Procedure1<TerminationTransition> _function = (TerminationTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTerminationTransition _createInternalTerminationTransition = this._internalFactory.createInternalTerminationTransition();
        _elvis = _createInternalTerminationTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TerminationTransitionEContentAdapter _terminationTransitionEContentAdapter = new TerminationTransitionEContentAdapter();
        _eAdapters.add(_terminationTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<TerminationTransition>operator_doubleArrow(_createTerminationTransition, _function);
  }
  
  /**
   * This method creates an TerminationTransition with the given id. Post create hook will be triggered.
   */
  public TerminationTransition createTerminationTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createTerminationTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an TerminationTransition with generated id. Post create hook will be triggered.
   */
  public TerminationTransition createTerminationTransition(final InternalNode source, final InternalNode target) {
    return this.createTerminationTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an TerminationTransition with the given id. Post create hook won't be triggered.
   */
  public TerminationTransition createTerminationTransition(final String ID) {
    return this.createTerminationTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an TerminationTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public TerminationTransition createTerminationTransition() {
    return this.createTerminationTransition(EcoreUtil.generateUUID());
  }
  
  public ImmediateStrongAbortTransition createImmediateStrongAbortTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    ImmediateStrongAbortTransition _createImmediateStrongAbortTransition = super.createImmediateStrongAbortTransition();
    final Procedure1<ImmediateStrongAbortTransition> _function = (ImmediateStrongAbortTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalImmediateStrongAbortTransition _createInternalImmediateStrongAbortTransition = this._internalFactory.createInternalImmediateStrongAbortTransition();
        _elvis = _createInternalImmediateStrongAbortTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ImmediateStrongAbortTransitionEContentAdapter _immediateStrongAbortTransitionEContentAdapter = new ImmediateStrongAbortTransitionEContentAdapter();
        _eAdapters.add(_immediateStrongAbortTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<ImmediateStrongAbortTransition>operator_doubleArrow(_createImmediateStrongAbortTransition, _function);
  }
  
  /**
   * This method creates an ImmediateStrongAbortTransition with the given id. Post create hook will be triggered.
   */
  public ImmediateStrongAbortTransition createImmediateStrongAbortTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createImmediateStrongAbortTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateStrongAbortTransition with generated id. Post create hook will be triggered.
   */
  public ImmediateStrongAbortTransition createImmediateStrongAbortTransition(final InternalNode source, final InternalNode target) {
    return this.createImmediateStrongAbortTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateStrongAbortTransition with the given id. Post create hook won't be triggered.
   */
  public ImmediateStrongAbortTransition createImmediateStrongAbortTransition(final String ID) {
    return this.createImmediateStrongAbortTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an ImmediateStrongAbortTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public ImmediateStrongAbortTransition createImmediateStrongAbortTransition() {
    return this.createImmediateStrongAbortTransition(EcoreUtil.generateUUID());
  }
  
  public Transition createTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    Transition _createTransition = super.createTransition();
    final Procedure1<Transition> _function = (Transition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTransition _createInternalTransition = this._internalFactory.createInternalTransition();
        _elvis = _createInternalTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TransitionEContentAdapter _transitionEContentAdapter = new TransitionEContentAdapter();
        _eAdapters.add(_transitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Transition>operator_doubleArrow(_createTransition, _function);
  }
  
  /**
   * This method creates an Transition with the given id. Post create hook will be triggered.
   */
  public Transition createTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an Transition with generated id. Post create hook will be triggered.
   */
  public Transition createTransition(final InternalNode source, final InternalNode target) {
    return this.createTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an Transition with the given id. Post create hook won't be triggered.
   */
  public Transition createTransition(final String ID) {
    return this.createTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an Transition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public Transition createTransition() {
    return this.createTransition(EcoreUtil.generateUUID());
  }
  
  public ImmediateStrongAbortDeferredTransition createImmediateStrongAbortDeferredTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    ImmediateStrongAbortDeferredTransition _createImmediateStrongAbortDeferredTransition = super.createImmediateStrongAbortDeferredTransition();
    final Procedure1<ImmediateStrongAbortDeferredTransition> _function = (ImmediateStrongAbortDeferredTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalImmediateStrongAbortDeferredTransition _createInternalImmediateStrongAbortDeferredTransition = this._internalFactory.createInternalImmediateStrongAbortDeferredTransition();
        _elvis = _createInternalImmediateStrongAbortDeferredTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ImmediateStrongAbortDeferredTransitionEContentAdapter _immediateStrongAbortDeferredTransitionEContentAdapter = new ImmediateStrongAbortDeferredTransitionEContentAdapter();
        _eAdapters.add(_immediateStrongAbortDeferredTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<ImmediateStrongAbortDeferredTransition>operator_doubleArrow(_createImmediateStrongAbortDeferredTransition, _function);
  }
  
  /**
   * This method creates an ImmediateStrongAbortDeferredTransition with the given id. Post create hook will be triggered.
   */
  public ImmediateStrongAbortDeferredTransition createImmediateStrongAbortDeferredTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createImmediateStrongAbortDeferredTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateStrongAbortDeferredTransition with generated id. Post create hook will be triggered.
   */
  public ImmediateStrongAbortDeferredTransition createImmediateStrongAbortDeferredTransition(final InternalNode source, final InternalNode target) {
    return this.createImmediateStrongAbortDeferredTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateStrongAbortDeferredTransition with the given id. Post create hook won't be triggered.
   */
  public ImmediateStrongAbortDeferredTransition createImmediateStrongAbortDeferredTransition(final String ID) {
    return this.createImmediateStrongAbortDeferredTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an ImmediateStrongAbortDeferredTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public ImmediateStrongAbortDeferredTransition createImmediateStrongAbortDeferredTransition() {
    return this.createImmediateStrongAbortDeferredTransition(EcoreUtil.generateUUID());
  }
  
  public ImmediateHistoryTransition createImmediateHistoryTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    ImmediateHistoryTransition _createImmediateHistoryTransition = super.createImmediateHistoryTransition();
    final Procedure1<ImmediateHistoryTransition> _function = (ImmediateHistoryTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalImmediateHistoryTransition _createInternalImmediateHistoryTransition = this._internalFactory.createInternalImmediateHistoryTransition();
        _elvis = _createInternalImmediateHistoryTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ImmediateHistoryTransitionEContentAdapter _immediateHistoryTransitionEContentAdapter = new ImmediateHistoryTransitionEContentAdapter();
        _eAdapters.add(_immediateHistoryTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<ImmediateHistoryTransition>operator_doubleArrow(_createImmediateHistoryTransition, _function);
  }
  
  /**
   * This method creates an ImmediateHistoryTransition with the given id. Post create hook will be triggered.
   */
  public ImmediateHistoryTransition createImmediateHistoryTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createImmediateHistoryTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateHistoryTransition with generated id. Post create hook will be triggered.
   */
  public ImmediateHistoryTransition createImmediateHistoryTransition(final InternalNode source, final InternalNode target) {
    return this.createImmediateHistoryTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an ImmediateHistoryTransition with the given id. Post create hook won't be triggered.
   */
  public ImmediateHistoryTransition createImmediateHistoryTransition(final String ID) {
    return this.createImmediateHistoryTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an ImmediateHistoryTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public ImmediateHistoryTransition createImmediateHistoryTransition() {
    return this.createImmediateHistoryTransition(EcoreUtil.generateUUID());
  }
  
  public Connection createConnection(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    Connection _createConnection = super.createConnection();
    final Procedure1<Connection> _function = (Connection it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalConnection _createInternalConnection = this._internalFactory.createInternalConnection();
        _elvis = _createInternalConnection;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ConnectionEContentAdapter _connectionEContentAdapter = new ConnectionEContentAdapter();
        _eAdapters.add(_connectionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Connection>operator_doubleArrow(_createConnection, _function);
  }
  
  /**
   * This method creates an Connection with the given id. Post create hook will be triggered.
   */
  public Connection createConnection(final String ID, final InternalNode source, final InternalNode target) {
    return this.createConnection(ID, null, source, target, true);
  }
  
  /**
   * This method creates an Connection with generated id. Post create hook will be triggered.
   */
  public Connection createConnection(final InternalNode source, final InternalNode target) {
    return this.createConnection(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an Connection with the given id. Post create hook won't be triggered.
   */
  public Connection createConnection(final String ID) {
    return this.createConnection(ID, null, null, null, false);
  }
  
  /**
   * This method creates an Connection with a generated id. Post create hook won't be triggered.
   */
  @Override
  public Connection createConnection() {
    return this.createConnection(EcoreUtil.generateUUID());
  }
  
  public HistoryTransition createHistoryTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    HistoryTransition _createHistoryTransition = super.createHistoryTransition();
    final Procedure1<HistoryTransition> _function = (HistoryTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalHistoryTransition _createInternalHistoryTransition = this._internalFactory.createInternalHistoryTransition();
        _elvis = _createInternalHistoryTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        HistoryTransitionEContentAdapter _historyTransitionEContentAdapter = new HistoryTransitionEContentAdapter();
        _eAdapters.add(_historyTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<HistoryTransition>operator_doubleArrow(_createHistoryTransition, _function);
  }
  
  /**
   * This method creates an HistoryTransition with the given id. Post create hook will be triggered.
   */
  public HistoryTransition createHistoryTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createHistoryTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an HistoryTransition with generated id. Post create hook will be triggered.
   */
  public HistoryTransition createHistoryTransition(final InternalNode source, final InternalNode target) {
    return this.createHistoryTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an HistoryTransition with the given id. Post create hook won't be triggered.
   */
  public HistoryTransition createHistoryTransition(final String ID) {
    return this.createHistoryTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an HistoryTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public HistoryTransition createHistoryTransition() {
    return this.createHistoryTransition(EcoreUtil.generateUUID());
  }
  
  public StrongAbortTransition createStrongAbortTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    StrongAbortTransition _createStrongAbortTransition = super.createStrongAbortTransition();
    final Procedure1<StrongAbortTransition> _function = (StrongAbortTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalStrongAbortTransition _createInternalStrongAbortTransition = this._internalFactory.createInternalStrongAbortTransition();
        _elvis = _createInternalStrongAbortTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        StrongAbortTransitionEContentAdapter _strongAbortTransitionEContentAdapter = new StrongAbortTransitionEContentAdapter();
        _eAdapters.add(_strongAbortTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<StrongAbortTransition>operator_doubleArrow(_createStrongAbortTransition, _function);
  }
  
  /**
   * This method creates an StrongAbortTransition with the given id. Post create hook will be triggered.
   */
  public StrongAbortTransition createStrongAbortTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createStrongAbortTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an StrongAbortTransition with generated id. Post create hook will be triggered.
   */
  public StrongAbortTransition createStrongAbortTransition(final InternalNode source, final InternalNode target) {
    return this.createStrongAbortTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an StrongAbortTransition with the given id. Post create hook won't be triggered.
   */
  public StrongAbortTransition createStrongAbortTransition(final String ID) {
    return this.createStrongAbortTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an StrongAbortTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public StrongAbortTransition createStrongAbortTransition() {
    return this.createStrongAbortTransition(EcoreUtil.generateUUID());
  }
  
  public TerminationDefferdTransition createTerminationDefferdTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    TerminationDefferdTransition _createTerminationDefferdTransition = super.createTerminationDefferdTransition();
    final Procedure1<TerminationDefferdTransition> _function = (TerminationDefferdTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTerminationDefferdTransition _createInternalTerminationDefferdTransition = this._internalFactory.createInternalTerminationDefferdTransition();
        _elvis = _createInternalTerminationDefferdTransition;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TerminationDefferdTransitionEContentAdapter _terminationDefferdTransitionEContentAdapter = new TerminationDefferdTransitionEContentAdapter();
        _eAdapters.add(_terminationDefferdTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<TerminationDefferdTransition>operator_doubleArrow(_createTerminationDefferdTransition, _function);
  }
  
  /**
   * This method creates an TerminationDefferdTransition with the given id. Post create hook will be triggered.
   */
  public TerminationDefferdTransition createTerminationDefferdTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createTerminationDefferdTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an TerminationDefferdTransition with generated id. Post create hook will be triggered.
   */
  public TerminationDefferdTransition createTerminationDefferdTransition(final InternalNode source, final InternalNode target) {
    return this.createTerminationDefferdTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an TerminationDefferdTransition with the given id. Post create hook won't be triggered.
   */
  public TerminationDefferdTransition createTerminationDefferdTransition(final String ID) {
    return this.createTerminationDefferdTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an TerminationDefferdTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public TerminationDefferdTransition createTerminationDefferdTransition() {
    return this.createTerminationDefferdTransition(EcoreUtil.generateUUID());
  }
  
  private <T extends IdentifiableElement> T setInternal(final T elm, final InternalIdentifiableElement internal) {
    final Procedure1<T> _function = (T it) -> {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it.getId());
      if (_isNullOrEmpty) {
        EcoreUtil.setID(it, EcoreUtil.generateUUID());
      }
      boolean _matched = false;
      if (elm instanceof GraphModel) {
        _matched=true;
        ((GraphModel)elm).setInternalElement(((InternalGraphModel) internal));
      }
      if (!_matched) {
        if (elm instanceof ModelElement) {
          _matched=true;
          ((ModelElement)elm).setInternalElement(((InternalModelElement) internal));
        }
      }
      if (!_matched) {
        if (elm instanceof Type) {
          _matched=true;
          ((Type)elm).setInternalElement(((InternalType) internal));
        }
      }
    };
    return ObjectExtensions.<T>operator_doubleArrow(elm, _function);
  }
  
  /**
   * This method creates a new SCChart object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can
   * simply call the SCChart's save method to save your changes.
   */
  public SCChart createSCChart(final String path, final String fileName) {
    IPath filePath = new Path(path).append(fileName).addFileExtension("scchart");
    URI uri = URI.createPlatformResourceURI(filePath.toOSString(), true);
    Resource res = new ResourceSetImpl().createResource(uri);
    SCChart graph = SCChartFactory.eINSTANCE.createSCChart();
    EcoreUtil.setID(graph, EcoreUtil.generateUUID());
    res.getContents().add(graph.getInternalElement());
    this.postCreates(graph);
    try {
      res.save(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return graph;
  }
  
  public void postCreates(final RootState me) {
    final Runnable _function = () -> {
      final PostCreatePayload<RootState> eventPayload = new PostCreatePayload<RootState>(me);
      final PayloadContext<PostCreatePayload<RootState>, Void> eventContext = new PayloadContext<PostCreatePayload<RootState>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_RootState", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final Region me) {
    final Runnable _function = () -> {
      final PostCreatePayload<Region> eventPayload = new PostCreatePayload<Region>(me);
      final PayloadContext<PostCreatePayload<Region>, Void> eventContext = new PayloadContext<PostCreatePayload<Region>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Region", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final DataFlowRegion me) {
    final Runnable _function = () -> {
      final PostCreatePayload<DataFlowRegion> eventPayload = new PostCreatePayload<DataFlowRegion>(me);
      final PayloadContext<PostCreatePayload<DataFlowRegion>, Void> eventContext = new PayloadContext<PostCreatePayload<DataFlowRegion>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final SuperState me) {
    final Runnable _function = () -> {
      final PostCreatePayload<SuperState> eventPayload = new PostCreatePayload<SuperState>(me);
      final PayloadContext<PostCreatePayload<SuperState>, Void> eventContext = new PayloadContext<PostCreatePayload<SuperState>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final InitilalSuperState me) {
    final Runnable _function = () -> {
      final PostCreatePayload<InitilalSuperState> eventPayload = new PostCreatePayload<InitilalSuperState>(me);
      final PayloadContext<PostCreatePayload<InitilalSuperState>, Void> eventContext = new PayloadContext<PostCreatePayload<InitilalSuperState>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final FinalSuperState me) {
    final Runnable _function = () -> {
      final PostCreatePayload<FinalSuperState> eventPayload = new PostCreatePayload<FinalSuperState>(me);
      final PayloadContext<PostCreatePayload<FinalSuperState>, Void> eventContext = new PayloadContext<PostCreatePayload<FinalSuperState>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_FinalSuperState", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final Declaration me) {
    final Runnable _function = () -> {
      final PostCreatePayload<Declaration> eventPayload = new PostCreatePayload<Declaration>(me);
      final PayloadContext<PostCreatePayload<Declaration>, Void> eventContext = new PayloadContext<PostCreatePayload<Declaration>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Declaration", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final Suspend me) {
    final Runnable _function = () -> {
      final PostCreatePayload<Suspend> eventPayload = new PostCreatePayload<Suspend>(me);
      final PayloadContext<PostCreatePayload<Suspend>, Void> eventContext = new PayloadContext<PostCreatePayload<Suspend>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Suspend", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final Action me) {
    final Runnable _function = () -> {
      final PostCreatePayload<Action> eventPayload = new PostCreatePayload<Action>(me);
      final PayloadContext<PostCreatePayload<Action>, Void> eventContext = new PayloadContext<PostCreatePayload<Action>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Action", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final SCChart me) {
    final Runnable _function = () -> {
      final PostCreatePayload<SCChart> eventPayload = new PostCreatePayload<SCChart>(me);
      final PayloadContext<PostCreatePayload<SCChart>, Void> eventContext = new PayloadContext<PostCreatePayload<SCChart>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SCChart", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
}

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
import info.scce.cinco.product.scchart.mglid.adapter.ConnectorEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.DeclarationEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.DeferredHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.DeferredTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.FinalSCChartRefereceEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.FinalStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.FinalSuperStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.HistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.InitialFinalStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.InitialFinalSuperStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.InitialSCChartRefereceEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.InitialStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.InitialSuperStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.RegionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.RootStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.SCChartEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.SCChartRefereceEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.SimpleStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.StrongAbortDeferredHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.StrongAbortDeferredTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.StrongAbortHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.StrongAbortTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.SuperStateEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.SuspendEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.TerminationDeferredHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.TerminationDeferredTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.TerminationHistoryTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.TerminationTransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.adapter.TransitionEContentAdapter;
import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
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
import info.scce.cinco.product.scchart.mglid.scchart.impl.ScchartFactoryImpl;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFactory;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialFinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspend;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDeferredTransition;
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
   * This method creates an InitialSCChartReferece with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public InitialSCChartReferece createInitialSCChartReferece(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    InitialSCChartReferece _createInitialSCChartReferece = super.createInitialSCChartReferece();
    final Procedure1<InitialSCChartReferece> _function = (InitialSCChartReferece it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalInitialSCChartReferece _createInternalInitialSCChartReferece = this._internalFactory.createInternalInitialSCChartReferece();
        _elvis = _createInternalInitialSCChartReferece;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        InitialSCChartRefereceEContentAdapter _initialSCChartRefereceEContentAdapter = new InitialSCChartRefereceEContentAdapter();
        _eAdapters.add(_initialSCChartRefereceEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<InitialSCChartReferece>operator_doubleArrow(_createInitialSCChartReferece, _function);
  }
  
  /**
   * This method creates an InitialSCChartReferece with the given id. Post create hook won't be triggered.
   */
  public InitialSCChartReferece createInitialSCChartReferece(final String ID) {
    return this.createInitialSCChartReferece(ID, null, null, false);
  }
  
  /**
   * This method creates an InitialSCChartReferece with the given id. Post create hook will be triggered.
   */
  public InitialSCChartReferece createInitialSCChartReferece(final InternalModelElementContainer parent) {
    return this.createInitialSCChartReferece(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an InitialSCChartReferece with the given id. Post create hook will be triggered.
   */
  public InitialSCChartReferece createInitialSCChartReferece(final String ID, final InternalModelElementContainer parent) {
    return this.createInitialSCChartReferece(ID, null, parent, true);
  }
  
  public InitialSCChartReferece createInitialSCChartReferece(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createInitialSCChartReferece(ID, ime, parent, true);
  }
  
  /**
   * This method creates an InitialSCChartReferece with the given id. Post create hook won't be triggered.
   */
  public InitialSCChartReferece createInitialSCChartReferece(final InternalModelElement ime) {
    return this.createInitialSCChartReferece(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public InitialSCChartReferece createInitialSCChartReferece() {
    return this.createInitialSCChartReferece(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an InitialFinalSuperState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public InitialFinalSuperState createInitialFinalSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    InitialFinalSuperState _createInitialFinalSuperState = super.createInitialFinalSuperState();
    final Procedure1<InitialFinalSuperState> _function = (InitialFinalSuperState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalInitialFinalSuperState _createInternalInitialFinalSuperState = this._internalFactory.createInternalInitialFinalSuperState();
        _elvis = _createInternalInitialFinalSuperState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        InitialFinalSuperStateEContentAdapter _initialFinalSuperStateEContentAdapter = new InitialFinalSuperStateEContentAdapter();
        _eAdapters.add(_initialFinalSuperStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<InitialFinalSuperState>operator_doubleArrow(_createInitialFinalSuperState, _function);
  }
  
  /**
   * This method creates an InitialFinalSuperState with the given id. Post create hook won't be triggered.
   */
  public InitialFinalSuperState createInitialFinalSuperState(final String ID) {
    return this.createInitialFinalSuperState(ID, null, null, false);
  }
  
  /**
   * This method creates an InitialFinalSuperState with the given id. Post create hook will be triggered.
   */
  public InitialFinalSuperState createInitialFinalSuperState(final InternalModelElementContainer parent) {
    return this.createInitialFinalSuperState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an InitialFinalSuperState with the given id. Post create hook will be triggered.
   */
  public InitialFinalSuperState createInitialFinalSuperState(final String ID, final InternalModelElementContainer parent) {
    return this.createInitialFinalSuperState(ID, null, parent, true);
  }
  
  public InitialFinalSuperState createInitialFinalSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createInitialFinalSuperState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an InitialFinalSuperState with the given id. Post create hook won't be triggered.
   */
  public InitialFinalSuperState createInitialFinalSuperState(final InternalModelElement ime) {
    return this.createInitialFinalSuperState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public InitialFinalSuperState createInitialFinalSuperState() {
    return this.createInitialFinalSuperState(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an InitialSuperState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public InitialSuperState createInitialSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    InitialSuperState _createInitialSuperState = super.createInitialSuperState();
    final Procedure1<InitialSuperState> _function = (InitialSuperState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalInitialSuperState _createInternalInitialSuperState = this._internalFactory.createInternalInitialSuperState();
        _elvis = _createInternalInitialSuperState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        InitialSuperStateEContentAdapter _initialSuperStateEContentAdapter = new InitialSuperStateEContentAdapter();
        _eAdapters.add(_initialSuperStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<InitialSuperState>operator_doubleArrow(_createInitialSuperState, _function);
  }
  
  /**
   * This method creates an InitialSuperState with the given id. Post create hook won't be triggered.
   */
  public InitialSuperState createInitialSuperState(final String ID) {
    return this.createInitialSuperState(ID, null, null, false);
  }
  
  /**
   * This method creates an InitialSuperState with the given id. Post create hook will be triggered.
   */
  public InitialSuperState createInitialSuperState(final InternalModelElementContainer parent) {
    return this.createInitialSuperState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an InitialSuperState with the given id. Post create hook will be triggered.
   */
  public InitialSuperState createInitialSuperState(final String ID, final InternalModelElementContainer parent) {
    return this.createInitialSuperState(ID, null, parent, true);
  }
  
  public InitialSuperState createInitialSuperState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createInitialSuperState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an InitialSuperState with the given id. Post create hook won't be triggered.
   */
  public InitialSuperState createInitialSuperState(final InternalModelElement ime) {
    return this.createInitialSuperState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public InitialSuperState createInitialSuperState() {
    return this.createInitialSuperState(EcoreUtil.generateUUID());
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
   * This method creates an FinalSCChartReferece with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public FinalSCChartReferece createFinalSCChartReferece(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    FinalSCChartReferece _createFinalSCChartReferece = super.createFinalSCChartReferece();
    final Procedure1<FinalSCChartReferece> _function = (FinalSCChartReferece it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalFinalSCChartReferece _createInternalFinalSCChartReferece = this._internalFactory.createInternalFinalSCChartReferece();
        _elvis = _createInternalFinalSCChartReferece;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        FinalSCChartRefereceEContentAdapter _finalSCChartRefereceEContentAdapter = new FinalSCChartRefereceEContentAdapter();
        _eAdapters.add(_finalSCChartRefereceEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<FinalSCChartReferece>operator_doubleArrow(_createFinalSCChartReferece, _function);
  }
  
  /**
   * This method creates an FinalSCChartReferece with the given id. Post create hook won't be triggered.
   */
  public FinalSCChartReferece createFinalSCChartReferece(final String ID) {
    return this.createFinalSCChartReferece(ID, null, null, false);
  }
  
  /**
   * This method creates an FinalSCChartReferece with the given id. Post create hook will be triggered.
   */
  public FinalSCChartReferece createFinalSCChartReferece(final InternalModelElementContainer parent) {
    return this.createFinalSCChartReferece(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an FinalSCChartReferece with the given id. Post create hook will be triggered.
   */
  public FinalSCChartReferece createFinalSCChartReferece(final String ID, final InternalModelElementContainer parent) {
    return this.createFinalSCChartReferece(ID, null, parent, true);
  }
  
  public FinalSCChartReferece createFinalSCChartReferece(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createFinalSCChartReferece(ID, ime, parent, true);
  }
  
  /**
   * This method creates an FinalSCChartReferece with the given id. Post create hook won't be triggered.
   */
  public FinalSCChartReferece createFinalSCChartReferece(final InternalModelElement ime) {
    return this.createFinalSCChartReferece(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public FinalSCChartReferece createFinalSCChartReferece() {
    return this.createFinalSCChartReferece(EcoreUtil.generateUUID());
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
   * This method creates an SCChartReferece with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SCChartReferece createSCChartReferece(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SCChartReferece _createSCChartReferece = super.createSCChartReferece();
    final Procedure1<SCChartReferece> _function = (SCChartReferece it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSCChartReferece _createInternalSCChartReferece = this._internalFactory.createInternalSCChartReferece();
        _elvis = _createInternalSCChartReferece;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SCChartRefereceEContentAdapter _sCChartRefereceEContentAdapter = new SCChartRefereceEContentAdapter();
        _eAdapters.add(_sCChartRefereceEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
      if (hook) {
        this.postCreates(it);
      }
    };
    return ObjectExtensions.<SCChartReferece>operator_doubleArrow(_createSCChartReferece, _function);
  }
  
  /**
   * This method creates an SCChartReferece with the given id. Post create hook won't be triggered.
   */
  public SCChartReferece createSCChartReferece(final String ID) {
    return this.createSCChartReferece(ID, null, null, false);
  }
  
  /**
   * This method creates an SCChartReferece with the given id. Post create hook will be triggered.
   */
  public SCChartReferece createSCChartReferece(final InternalModelElementContainer parent) {
    return this.createSCChartReferece(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SCChartReferece with the given id. Post create hook will be triggered.
   */
  public SCChartReferece createSCChartReferece(final String ID, final InternalModelElementContainer parent) {
    return this.createSCChartReferece(ID, null, parent, true);
  }
  
  public SCChartReferece createSCChartReferece(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSCChartReferece(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SCChartReferece with the given id. Post create hook won't be triggered.
   */
  public SCChartReferece createSCChartReferece(final InternalModelElement ime) {
    return this.createSCChartReferece(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SCChartReferece createSCChartReferece() {
    return this.createSCChartReferece(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an InitialFinalState with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public InitialFinalState createInitialFinalState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    InitialFinalState _createInitialFinalState = super.createInitialFinalState();
    final Procedure1<InitialFinalState> _function = (InitialFinalState it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalInitialFinalState _createInternalInitialFinalState = this._internalFactory.createInternalInitialFinalState();
        _elvis = _createInternalInitialFinalState;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        InitialFinalStateEContentAdapter _initialFinalStateEContentAdapter = new InitialFinalStateEContentAdapter();
        _eAdapters.add(_initialFinalStateEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<InitialFinalState>operator_doubleArrow(_createInitialFinalState, _function);
  }
  
  /**
   * This method creates an InitialFinalState with the given id. Post create hook won't be triggered.
   */
  public InitialFinalState createInitialFinalState(final String ID) {
    return this.createInitialFinalState(ID, null, null, false);
  }
  
  /**
   * This method creates an InitialFinalState with the given id. Post create hook will be triggered.
   */
  public InitialFinalState createInitialFinalState(final InternalModelElementContainer parent) {
    return this.createInitialFinalState(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an InitialFinalState with the given id. Post create hook will be triggered.
   */
  public InitialFinalState createInitialFinalState(final String ID, final InternalModelElementContainer parent) {
    return this.createInitialFinalState(ID, null, parent, true);
  }
  
  public InitialFinalState createInitialFinalState(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createInitialFinalState(ID, ime, parent, true);
  }
  
  /**
   * This method creates an InitialFinalState with the given id. Post create hook won't be triggered.
   */
  public InitialFinalState createInitialFinalState(final InternalModelElement ime) {
    return this.createInitialFinalState(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public InitialFinalState createInitialFinalState() {
    return this.createInitialFinalState(EcoreUtil.generateUUID());
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
  
  public TerminationDeferredHistoryTransition createTerminationDeferredHistoryTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    TerminationDeferredHistoryTransition _createTerminationDeferredHistoryTransition = super.createTerminationDeferredHistoryTransition();
    final Procedure1<TerminationDeferredHistoryTransition> _function = (TerminationDeferredHistoryTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTerminationDeferredHistoryTransition _createInternalTerminationDeferredHistoryTransition = this._internalFactory.createInternalTerminationDeferredHistoryTransition();
        _elvis = _createInternalTerminationDeferredHistoryTransition;
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
        TerminationDeferredHistoryTransitionEContentAdapter _terminationDeferredHistoryTransitionEContentAdapter = new TerminationDeferredHistoryTransitionEContentAdapter();
        _eAdapters.add(_terminationDeferredHistoryTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<TerminationDeferredHistoryTransition>operator_doubleArrow(_createTerminationDeferredHistoryTransition, _function);
  }
  
  /**
   * This method creates an TerminationDeferredHistoryTransition with the given id. Post create hook will be triggered.
   */
  public TerminationDeferredHistoryTransition createTerminationDeferredHistoryTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createTerminationDeferredHistoryTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an TerminationDeferredHistoryTransition with generated id. Post create hook will be triggered.
   */
  public TerminationDeferredHistoryTransition createTerminationDeferredHistoryTransition(final InternalNode source, final InternalNode target) {
    return this.createTerminationDeferredHistoryTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an TerminationDeferredHistoryTransition with the given id. Post create hook won't be triggered.
   */
  public TerminationDeferredHistoryTransition createTerminationDeferredHistoryTransition(final String ID) {
    return this.createTerminationDeferredHistoryTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an TerminationDeferredHistoryTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public TerminationDeferredHistoryTransition createTerminationDeferredHistoryTransition() {
    return this.createTerminationDeferredHistoryTransition(EcoreUtil.generateUUID());
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
  
  public TerminationDeferredTransition createTerminationDeferredTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    TerminationDeferredTransition _createTerminationDeferredTransition = super.createTerminationDeferredTransition();
    final Procedure1<TerminationDeferredTransition> _function = (TerminationDeferredTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTerminationDeferredTransition _createInternalTerminationDeferredTransition = this._internalFactory.createInternalTerminationDeferredTransition();
        _elvis = _createInternalTerminationDeferredTransition;
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
        TerminationDeferredTransitionEContentAdapter _terminationDeferredTransitionEContentAdapter = new TerminationDeferredTransitionEContentAdapter();
        _eAdapters.add(_terminationDeferredTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<TerminationDeferredTransition>operator_doubleArrow(_createTerminationDeferredTransition, _function);
  }
  
  /**
   * This method creates an TerminationDeferredTransition with the given id. Post create hook will be triggered.
   */
  public TerminationDeferredTransition createTerminationDeferredTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createTerminationDeferredTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an TerminationDeferredTransition with generated id. Post create hook will be triggered.
   */
  public TerminationDeferredTransition createTerminationDeferredTransition(final InternalNode source, final InternalNode target) {
    return this.createTerminationDeferredTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an TerminationDeferredTransition with the given id. Post create hook won't be triggered.
   */
  public TerminationDeferredTransition createTerminationDeferredTransition(final String ID) {
    return this.createTerminationDeferredTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an TerminationDeferredTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public TerminationDeferredTransition createTerminationDeferredTransition() {
    return this.createTerminationDeferredTransition(EcoreUtil.generateUUID());
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
      if (hook) {
        this.postCreates(it);
      }
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
  
  public StrongAbortDeferredHistoryTransition createStrongAbortDeferredHistoryTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    StrongAbortDeferredHistoryTransition _createStrongAbortDeferredHistoryTransition = super.createStrongAbortDeferredHistoryTransition();
    final Procedure1<StrongAbortDeferredHistoryTransition> _function = (StrongAbortDeferredHistoryTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalStrongAbortDeferredHistoryTransition _createInternalStrongAbortDeferredHistoryTransition = this._internalFactory.createInternalStrongAbortDeferredHistoryTransition();
        _elvis = _createInternalStrongAbortDeferredHistoryTransition;
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
        StrongAbortDeferredHistoryTransitionEContentAdapter _strongAbortDeferredHistoryTransitionEContentAdapter = new StrongAbortDeferredHistoryTransitionEContentAdapter();
        _eAdapters.add(_strongAbortDeferredHistoryTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<StrongAbortDeferredHistoryTransition>operator_doubleArrow(_createStrongAbortDeferredHistoryTransition, _function);
  }
  
  /**
   * This method creates an StrongAbortDeferredHistoryTransition with the given id. Post create hook will be triggered.
   */
  public StrongAbortDeferredHistoryTransition createStrongAbortDeferredHistoryTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createStrongAbortDeferredHistoryTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an StrongAbortDeferredHistoryTransition with generated id. Post create hook will be triggered.
   */
  public StrongAbortDeferredHistoryTransition createStrongAbortDeferredHistoryTransition(final InternalNode source, final InternalNode target) {
    return this.createStrongAbortDeferredHistoryTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an StrongAbortDeferredHistoryTransition with the given id. Post create hook won't be triggered.
   */
  public StrongAbortDeferredHistoryTransition createStrongAbortDeferredHistoryTransition(final String ID) {
    return this.createStrongAbortDeferredHistoryTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an StrongAbortDeferredHistoryTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public StrongAbortDeferredHistoryTransition createStrongAbortDeferredHistoryTransition() {
    return this.createStrongAbortDeferredHistoryTransition(EcoreUtil.generateUUID());
  }
  
  public DeferredHistoryTransition createDeferredHistoryTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    DeferredHistoryTransition _createDeferredHistoryTransition = super.createDeferredHistoryTransition();
    final Procedure1<DeferredHistoryTransition> _function = (DeferredHistoryTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalDeferredHistoryTransition _createInternalDeferredHistoryTransition = this._internalFactory.createInternalDeferredHistoryTransition();
        _elvis = _createInternalDeferredHistoryTransition;
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
        DeferredHistoryTransitionEContentAdapter _deferredHistoryTransitionEContentAdapter = new DeferredHistoryTransitionEContentAdapter();
        _eAdapters.add(_deferredHistoryTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<DeferredHistoryTransition>operator_doubleArrow(_createDeferredHistoryTransition, _function);
  }
  
  /**
   * This method creates an DeferredHistoryTransition with the given id. Post create hook will be triggered.
   */
  public DeferredHistoryTransition createDeferredHistoryTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createDeferredHistoryTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an DeferredHistoryTransition with generated id. Post create hook will be triggered.
   */
  public DeferredHistoryTransition createDeferredHistoryTransition(final InternalNode source, final InternalNode target) {
    return this.createDeferredHistoryTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an DeferredHistoryTransition with the given id. Post create hook won't be triggered.
   */
  public DeferredHistoryTransition createDeferredHistoryTransition(final String ID) {
    return this.createDeferredHistoryTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an DeferredHistoryTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public DeferredHistoryTransition createDeferredHistoryTransition() {
    return this.createDeferredHistoryTransition(EcoreUtil.generateUUID());
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
  
  public void postCreates(final SuperState me) {
    final Runnable _function = () -> {
      final PostCreatePayload<SuperState> eventPayload = new PostCreatePayload<SuperState>(me);
      final PayloadContext<PostCreatePayload<SuperState>, Void> eventContext = new PayloadContext<PostCreatePayload<SuperState>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final InitialSuperState me) {
    final Runnable _function = () -> {
      final PostCreatePayload<InitialSuperState> eventPayload = new PostCreatePayload<InitialSuperState>(me);
      final PayloadContext<PostCreatePayload<InitialSuperState>, Void> eventContext = new PayloadContext<PostCreatePayload<InitialSuperState>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitialSuperState", eventPayload);
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
  
  public void postCreates(final InitialFinalSuperState me) {
    final Runnable _function = () -> {
      final PostCreatePayload<InitialFinalSuperState> eventPayload = new PostCreatePayload<InitialFinalSuperState>(me);
      final PayloadContext<PostCreatePayload<InitialFinalSuperState>, Void> eventContext = new PayloadContext<PostCreatePayload<InitialFinalSuperState>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitialFinalSuperState", eventPayload);
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
  
  public void postCreates(final SCChartReferece me) {
    final Runnable _function = () -> {
      final PostCreatePayload<SCChartReferece> eventPayload = new PostCreatePayload<SCChartReferece>(me);
      final PayloadContext<PostCreatePayload<SCChartReferece>, Void> eventContext = new PayloadContext<PostCreatePayload<SCChartReferece>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SCChartReferece", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final InitialSCChartReferece me) {
    final Runnable _function = () -> {
      final PostCreatePayload<InitialSCChartReferece> eventPayload = new PostCreatePayload<InitialSCChartReferece>(me);
      final PayloadContext<PostCreatePayload<InitialSCChartReferece>, Void> eventContext = new PayloadContext<PostCreatePayload<InitialSCChartReferece>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitialSCChartReferece", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final FinalSCChartReferece me) {
    final Runnable _function = () -> {
      final PostCreatePayload<FinalSCChartReferece> eventPayload = new PostCreatePayload<FinalSCChartReferece>(me);
      final PayloadContext<PostCreatePayload<FinalSCChartReferece>, Void> eventContext = new PayloadContext<PostCreatePayload<FinalSCChartReferece>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", eventPayload);
      EventHub.getInstance().notifyFirst(eventContext);
    };
    this._workbenchExtension.transact(me, _function);
  }
  
  public void postCreates(final Transition me) {
    final Runnable _function = () -> {
      final PostCreatePayload<Transition> eventPayload = new PostCreatePayload<Transition>(me);
      final PayloadContext<PostCreatePayload<Transition>, Void> eventContext = new PayloadContext<PostCreatePayload<Transition>, Void>("event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Transition", eventPayload);
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

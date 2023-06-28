/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.views.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsFactoryImpl extends EFactoryImpl implements ViewsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewsFactory init() {
		try {
			ViewsFactory theViewsFactory = (ViewsFactory)EPackage.Registry.INSTANCE.getEFactory(ViewsPackage.eNS_URI);
			if (theViewsFactory != null) {
				return theViewsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViewsPackage.ROOT_STATE_VIEW: return createRootStateView();
			case ViewsPackage.REGION_VIEW: return createRegionView();
			case ViewsPackage.DATA_FLOW_REGION_VIEW: return createDataFlowRegionView();
			case ViewsPackage.SUPER_STATE_VIEW: return createSuperStateView();
			case ViewsPackage.INITILAL_SUPER_STATE_VIEW: return createInitilalSuperStateView();
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW: return createRootStateDeclarationNodeView();
			case ViewsPackage.SUSPEND_NODE_VIEW: return createSuspendNodeView();
			case ViewsPackage.ACTION_NODE_VIEW: return createActionNodeView();
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW: return createSuperStateDeclarationNodeView();
			case ViewsPackage.SIMPLE_STATE_VIEW: return createSimpleStateView();
			case ViewsPackage.INITIAL_STATE_VIEW: return createInitialStateView();
			case ViewsPackage.FINAL_STATE_VIEW: return createFinalStateView();
			case ViewsPackage.CONNECTOR_VIEW: return createConnectorView();
			case ViewsPackage.TRANSITION_VIEW: return createTransitionView();
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW: return createImmediateTransitionView();
			case ViewsPackage.TERMINATION_TRANSITION_VIEW: return createTerminationTransitionView();
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW: return createConditionalTerminationTransitionView();
			case ViewsPackage.WEAK_ABORT_TRANSITION_VIEW: return createWeakAbortTransitionView();
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW: return createStrongAbortTransitionView();
			case ViewsPackage.DEFERRED_TRANSITION_VIEW: return createDeferredTransitionView();
			case ViewsPackage.HISTORY_TRANSITION_VIEW: return createHistoryTransitionView();
			case ViewsPackage.SC_CHART_VIEW: return createSCChartView();
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW: return createRootStateDeclarationView();
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW: return createSuperStateDeclarationView();
			case ViewsPackage.SUSPEND_VIEW: return createSuspendView();
			case ViewsPackage.ACTION_VIEW: return createActionView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootStateView createRootStateView() {
		RootStateViewImpl rootStateView = new RootStateViewImpl();
		return rootStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionView createRegionView() {
		RegionViewImpl regionView = new RegionViewImpl();
		return regionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegionView createDataFlowRegionView() {
		DataFlowRegionViewImpl dataFlowRegionView = new DataFlowRegionViewImpl();
		return dataFlowRegionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateView createSuperStateView() {
		SuperStateViewImpl superStateView = new SuperStateViewImpl();
		return superStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperStateView createInitilalSuperStateView() {
		InitilalSuperStateViewImpl initilalSuperStateView = new InitilalSuperStateViewImpl();
		return initilalSuperStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootStateDeclarationNodeView createRootStateDeclarationNodeView() {
		RootStateDeclarationNodeViewImpl rootStateDeclarationNodeView = new RootStateDeclarationNodeViewImpl();
		return rootStateDeclarationNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuspendNodeView createSuspendNodeView() {
		SuspendNodeViewImpl suspendNodeView = new SuspendNodeViewImpl();
		return suspendNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionNodeView createActionNodeView() {
		ActionNodeViewImpl actionNodeView = new ActionNodeViewImpl();
		return actionNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclarationNodeView createSuperStateDeclarationNodeView() {
		SuperStateDeclarationNodeViewImpl superStateDeclarationNodeView = new SuperStateDeclarationNodeViewImpl();
		return superStateDeclarationNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleStateView createSimpleStateView() {
		SimpleStateViewImpl simpleStateView = new SimpleStateViewImpl();
		return simpleStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialStateView createInitialStateView() {
		InitialStateViewImpl initialStateView = new InitialStateViewImpl();
		return initialStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalStateView createFinalStateView() {
		FinalStateViewImpl finalStateView = new FinalStateViewImpl();
		return finalStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorView createConnectorView() {
		ConnectorViewImpl connectorView = new ConnectorViewImpl();
		return connectorView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionView createTransitionView() {
		TransitionViewImpl transitionView = new TransitionViewImpl();
		return transitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransitionView createImmediateTransitionView() {
		ImmediateTransitionViewImpl immediateTransitionView = new ImmediateTransitionViewImpl();
		return immediateTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransitionView createTerminationTransitionView() {
		TerminationTransitionViewImpl terminationTransitionView = new TerminationTransitionViewImpl();
		return terminationTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransitionView createConditionalTerminationTransitionView() {
		ConditionalTerminationTransitionViewImpl conditionalTerminationTransitionView = new ConditionalTerminationTransitionViewImpl();
		return conditionalTerminationTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransitionView createWeakAbortTransitionView() {
		WeakAbortTransitionViewImpl weakAbortTransitionView = new WeakAbortTransitionViewImpl();
		return weakAbortTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransitionView createStrongAbortTransitionView() {
		StrongAbortTransitionViewImpl strongAbortTransitionView = new StrongAbortTransitionViewImpl();
		return strongAbortTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransitionView createDeferredTransitionView() {
		DeferredTransitionViewImpl deferredTransitionView = new DeferredTransitionViewImpl();
		return deferredTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransitionView createHistoryTransitionView() {
		HistoryTransitionViewImpl historyTransitionView = new HistoryTransitionViewImpl();
		return historyTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartView createSCChartView() {
		SCChartViewImpl scChartView = new SCChartViewImpl();
		return scChartView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootStateDeclarationView createRootStateDeclarationView() {
		RootStateDeclarationViewImpl rootStateDeclarationView = new RootStateDeclarationViewImpl();
		return rootStateDeclarationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclarationView createSuperStateDeclarationView() {
		SuperStateDeclarationViewImpl superStateDeclarationView = new SuperStateDeclarationViewImpl();
		return superStateDeclarationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuspendView createSuspendView() {
		SuspendViewImpl suspendView = new SuspendViewImpl();
		return suspendView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionView createActionView() {
		ActionViewImpl actionView = new ActionViewImpl();
		return actionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewsPackage getViewsPackage() {
		return (ViewsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewsPackage getPackage() {
		return ViewsPackage.eINSTANCE;
	}

} //ViewsFactoryImpl

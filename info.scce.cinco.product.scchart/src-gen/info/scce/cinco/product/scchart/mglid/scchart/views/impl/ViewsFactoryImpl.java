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
			case ViewsPackage.SUPER_STATE_REGION_VIEW: return createSuperStateRegionView();
			case ViewsPackage.SUB_SUPER_STATE_VIEW: return createSubSuperStateView();
			case ViewsPackage.INITILAL_SUB_SUPER_STATE_VIEW: return createInitilalSubSuperStateView();
			case ViewsPackage.SUB_SUPER_STATE_REGION_VIEW: return createSubSuperStateRegionView();
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW: return createSuperStateDeclarationNodeView();
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW: return createSubSuperStateDeclarationNodeView();
			case ViewsPackage.SIMPLE_STATE_VIEW: return createSimpleStateView();
			case ViewsPackage.INITIAL_STATE_VIEW: return createInitialStateView();
			case ViewsPackage.FINAL_STATE_VIEW: return createFinalStateView();
			case ViewsPackage.CONNECTOR_VIEW: return createConnectorView();
			case ViewsPackage.TRANSITION_VIEW: return createTransitionView();
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW: return createImmediateTransitionView();
			case ViewsPackage.IMMEDIATE_TERMINATION_TRANSITION_VIEW: return createImmediateTerminationTransitionView();
			case ViewsPackage.WEAK_ABORT_TRANSITION_VIEW: return createWeakAbortTransitionView();
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW: return createStrongAbortTransitionView();
			case ViewsPackage.WEAK_ABORT_TERMINATION_TRANSITION_VIEW: return createWeakAbortTerminationTransitionView();
			case ViewsPackage.DEFFERED_TRANSITION_VIEW: return createDefferedTransitionView();
			case ViewsPackage.SC_CHART_VIEW: return createSCChartView();
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW: return createSuperStateDeclarationView();
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW: return createSubSuperStateDeclarationView();
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
	public SuperStateRegionView createSuperStateRegionView() {
		SuperStateRegionViewImpl superStateRegionView = new SuperStateRegionViewImpl();
		return superStateRegionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSuperStateView createSubSuperStateView() {
		SubSuperStateViewImpl subSuperStateView = new SubSuperStateViewImpl();
		return subSuperStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSubSuperStateView createInitilalSubSuperStateView() {
		InitilalSubSuperStateViewImpl initilalSubSuperStateView = new InitilalSubSuperStateViewImpl();
		return initilalSubSuperStateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSuperStateRegionView createSubSuperStateRegionView() {
		SubSuperStateRegionViewImpl subSuperStateRegionView = new SubSuperStateRegionViewImpl();
		return subSuperStateRegionView;
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
	public SubSuperStateDeclarationNodeView createSubSuperStateDeclarationNodeView() {
		SubSuperStateDeclarationNodeViewImpl subSuperStateDeclarationNodeView = new SubSuperStateDeclarationNodeViewImpl();
		return subSuperStateDeclarationNodeView;
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
	public ImmediateTerminationTransitionView createImmediateTerminationTransitionView() {
		ImmediateTerminationTransitionViewImpl immediateTerminationTransitionView = new ImmediateTerminationTransitionViewImpl();
		return immediateTerminationTransitionView;
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
	public WeakAbortTerminationTransitionView createWeakAbortTerminationTransitionView() {
		WeakAbortTerminationTransitionViewImpl weakAbortTerminationTransitionView = new WeakAbortTerminationTransitionViewImpl();
		return weakAbortTerminationTransitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransitionView createDefferedTransitionView() {
		DefferedTransitionViewImpl defferedTransitionView = new DefferedTransitionViewImpl();
		return defferedTransitionView;
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
	public SubSuperStateDeclarationView createSubSuperStateDeclarationView() {
		SubSuperStateDeclarationViewImpl subSuperStateDeclarationView = new SubSuperStateDeclarationViewImpl();
		return subSuperStateDeclarationView;
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

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import info.scce.cinco.product.scchart.mglid.scchart.*;

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
public class ScchartFactoryImpl extends EFactoryImpl implements ScchartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScchartFactory init() {
		try {
			ScchartFactory theScchartFactory = (ScchartFactory)EPackage.Registry.INSTANCE.getEFactory(ScchartPackage.eNS_URI);
			if (theScchartFactory != null) {
				return theScchartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScchartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScchartFactoryImpl() {
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
			case ScchartPackage.ROOT_STATE: return createRootState();
			case ScchartPackage.REGION: return createRegion();
			case ScchartPackage.DATA_FLOW_REGION: return createDataFlowRegion();
			case ScchartPackage.SUPER_STATE: return createSuperState();
			case ScchartPackage.INITILAL_SUPER_STATE: return createInitilalSuperState();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE: return createRootStateDeclarationNode();
			case ScchartPackage.SUPER_STATE_DECLARATION_NODE: return createSuperStateDeclarationNode();
			case ScchartPackage.SIMPLE_STATE: return createSimpleState();
			case ScchartPackage.INITIAL_STATE: return createInitialState();
			case ScchartPackage.FINAL_STATE: return createFinalState();
			case ScchartPackage.CONNECTOR: return createConnector();
			case ScchartPackage.TRANSITION: return createTransition();
			case ScchartPackage.IMMEDIATE_TRANSITION: return createImmediateTransition();
			case ScchartPackage.IMMEDIATE_TERMINATION_TRANSITION: return createImmediateTerminationTransition();
			case ScchartPackage.WEAK_ABORT_TRANSITION: return createWeakAbortTransition();
			case ScchartPackage.STRONG_ABORT_TRANSITION: return createStrongAbortTransition();
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION: return createWeakAbortTerminationTransition();
			case ScchartPackage.DEFFERED_TRANSITION: return createDefferedTransition();
			case ScchartPackage.SC_CHART: return createSCChart();
			case ScchartPackage.ROOT_STATE_DECLARATION: return createRootStateDeclaration();
			case ScchartPackage.SUPER_STATE_DECLARATION: return createSuperStateDeclaration();
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
	public RootState createRootState() {
		RootStateImpl rootState = new RootStateImpl();
		return rootState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion createDataFlowRegion() {
		DataFlowRegionImpl dataFlowRegion = new DataFlowRegionImpl();
		return dataFlowRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState createSuperState() {
		SuperStateImpl superState = new SuperStateImpl();
		return superState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState createInitilalSuperState() {
		InitilalSuperStateImpl initilalSuperState = new InitilalSuperStateImpl();
		return initilalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootStateDeclarationNode createRootStateDeclarationNode() {
		RootStateDeclarationNodeImpl rootStateDeclarationNode = new RootStateDeclarationNodeImpl();
		return rootStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclarationNode createSuperStateDeclarationNode() {
		SuperStateDeclarationNodeImpl superStateDeclarationNode = new SuperStateDeclarationNodeImpl();
		return superStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState createSimpleState() {
		SimpleStateImpl simpleState = new SimpleStateImpl();
		return simpleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition createImmediateTransition() {
		ImmediateTransitionImpl immediateTransition = new ImmediateTransitionImpl();
		return immediateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTerminationTransition createImmediateTerminationTransition() {
		ImmediateTerminationTransitionImpl immediateTerminationTransition = new ImmediateTerminationTransitionImpl();
		return immediateTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransition createWeakAbortTransition() {
		WeakAbortTransitionImpl weakAbortTransition = new WeakAbortTransitionImpl();
		return weakAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition createStrongAbortTransition() {
		StrongAbortTransitionImpl strongAbortTransition = new StrongAbortTransitionImpl();
		return strongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTerminationTransition createWeakAbortTerminationTransition() {
		WeakAbortTerminationTransitionImpl weakAbortTerminationTransition = new WeakAbortTerminationTransitionImpl();
		return weakAbortTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransition createDefferedTransition() {
		DefferedTransitionImpl defferedTransition = new DefferedTransitionImpl();
		return defferedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChart createSCChart() {
		SCChartImpl scChart = new SCChartImpl();
		return scChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootStateDeclaration createRootStateDeclaration() {
		RootStateDeclarationImpl rootStateDeclaration = new RootStateDeclarationImpl();
		return rootStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclaration createSuperStateDeclaration() {
		SuperStateDeclarationImpl superStateDeclaration = new SuperStateDeclarationImpl();
		return superStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScchartPackage getScchartPackage() {
		return (ScchartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScchartPackage getPackage() {
		return ScchartPackage.eINSTANCE;
	}

} //ScchartFactoryImpl

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
			case ScchartPackage.SUPER_STATE_REGION: return createSuperStateRegion();
			case ScchartPackage.SUB_SUPER_STATE: return createSubSuperState();
			case ScchartPackage.INITILAL_SUB_SUPER_STATE: return createInitilalSubSuperState();
			case ScchartPackage.SUB_SUPER_STATE_REGION: return createSubSuperStateRegion();
			case ScchartPackage.SUPER_STATE_DECLARATION_NODE: return createSuperStateDeclarationNode();
			case ScchartPackage.SUB_SUPER_STATE_DECLARATION_NODE: return createSubSuperStateDeclarationNode();
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
			case ScchartPackage.SUPER_STATE_DECLARATION: return createSuperStateDeclaration();
			case ScchartPackage.SUB_SUPER_STATE_DECLARATION: return createSubSuperStateDeclaration();
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
	public SuperStateRegion createSuperStateRegion() {
		SuperStateRegionImpl superStateRegion = new SuperStateRegionImpl();
		return superStateRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSuperState createSubSuperState() {
		SubSuperStateImpl subSuperState = new SubSuperStateImpl();
		return subSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSubSuperState createInitilalSubSuperState() {
		InitilalSubSuperStateImpl initilalSubSuperState = new InitilalSubSuperStateImpl();
		return initilalSubSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSuperStateRegion createSubSuperStateRegion() {
		SubSuperStateRegionImpl subSuperStateRegion = new SubSuperStateRegionImpl();
		return subSuperStateRegion;
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
	public SubSuperStateDeclarationNode createSubSuperStateDeclarationNode() {
		SubSuperStateDeclarationNodeImpl subSuperStateDeclarationNode = new SubSuperStateDeclarationNodeImpl();
		return subSuperStateDeclarationNode;
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
	public SubSuperStateDeclaration createSubSuperStateDeclaration() {
		SubSuperStateDeclarationImpl subSuperStateDeclaration = new SubSuperStateDeclarationImpl();
		return subSuperStateDeclaration;
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

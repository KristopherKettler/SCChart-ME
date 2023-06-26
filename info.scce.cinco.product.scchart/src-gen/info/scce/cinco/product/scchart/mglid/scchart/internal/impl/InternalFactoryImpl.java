/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.*;

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
public class InternalFactoryImpl extends EFactoryImpl implements InternalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InternalFactory init() {
		try {
			InternalFactory theInternalFactory = (InternalFactory)EPackage.Registry.INSTANCE.getEFactory(InternalPackage.eNS_URI);
			if (theInternalFactory != null) {
				return theInternalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InternalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFactoryImpl() {
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
			case InternalPackage.INTERNAL_ROOT_STATE: return createInternalRootState();
			case InternalPackage.INTERNAL_REGION: return createInternalRegion();
			case InternalPackage.INTERNAL_DATA_FLOW_REGION: return createInternalDataFlowRegion();
			case InternalPackage.INTERNAL_SUPER_STATE: return createInternalSuperState();
			case InternalPackage.INTERNAL_INITILAL_SUPER_STATE: return createInternalInitilalSuperState();
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION_NODE: return createInternalRootStateDeclarationNode();
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION_NODE: return createInternalSuperStateDeclarationNode();
			case InternalPackage.INTERNAL_SIMPLE_STATE: return createInternalSimpleState();
			case InternalPackage.INTERNAL_INITIAL_STATE: return createInternalInitialState();
			case InternalPackage.INTERNAL_FINAL_STATE: return createInternalFinalState();
			case InternalPackage.INTERNAL_CONNECTOR: return createInternalConnector();
			case InternalPackage.INTERNAL_TRANSITION: return createInternalTransition();
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION: return createInternalImmediateTransition();
			case InternalPackage.INTERNAL_TERMINATION_TRANSITION: return createInternalTerminationTransition();
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_TRANSITION: return createInternalConditionalTerminationTransition();
			case InternalPackage.INTERNAL_WEAK_ABORT_TRANSITION: return createInternalWeakAbortTransition();
			case InternalPackage.INTERNAL_STRONG_ABORT_TRANSITION: return createInternalStrongAbortTransition();
			case InternalPackage.INTERNAL_DEFERRED_TRANSITION: return createInternalDeferredTransition();
			case InternalPackage.INTERNAL_SHALLOW_HISTORY_TRANSITION: return createInternalShallowHistoryTransition();
			case InternalPackage.INTERNAL_HISTORY_TRANSITION: return createInternalHistoryTransition();
			case InternalPackage.INTERNAL_SC_CHART: return createInternalSCChart();
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION: return createInternalRootStateDeclaration();
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION: return createInternalSuperStateDeclaration();
			case InternalPackage.INTERNAL_SUSPEND: return createInternalSuspend();
			case InternalPackage.INTERNAL_ACTION: return createInternalAction();
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
	public InternalRootState createInternalRootState() {
		InternalRootStateImpl internalRootState = new InternalRootStateImpl();
		return internalRootState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRegion createInternalRegion() {
		InternalRegionImpl internalRegion = new InternalRegionImpl();
		return internalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDataFlowRegion createInternalDataFlowRegion() {
		InternalDataFlowRegionImpl internalDataFlowRegion = new InternalDataFlowRegionImpl();
		return internalDataFlowRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperState createInternalSuperState() {
		InternalSuperStateImpl internalSuperState = new InternalSuperStateImpl();
		return internalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitilalSuperState createInternalInitilalSuperState() {
		InternalInitilalSuperStateImpl internalInitilalSuperState = new InternalInitilalSuperStateImpl();
		return internalInitilalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRootStateDeclarationNode createInternalRootStateDeclarationNode() {
		InternalRootStateDeclarationNodeImpl internalRootStateDeclarationNode = new InternalRootStateDeclarationNodeImpl();
		return internalRootStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperStateDeclarationNode createInternalSuperStateDeclarationNode() {
		InternalSuperStateDeclarationNodeImpl internalSuperStateDeclarationNode = new InternalSuperStateDeclarationNodeImpl();
		return internalSuperStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSimpleState createInternalSimpleState() {
		InternalSimpleStateImpl internalSimpleState = new InternalSimpleStateImpl();
		return internalSimpleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitialState createInternalInitialState() {
		InternalInitialStateImpl internalInitialState = new InternalInitialStateImpl();
		return internalInitialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalState createInternalFinalState() {
		InternalFinalStateImpl internalFinalState = new InternalFinalStateImpl();
		return internalFinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConnector createInternalConnector() {
		InternalConnectorImpl internalConnector = new InternalConnectorImpl();
		return internalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTransition createInternalTransition() {
		InternalTransitionImpl internalTransition = new InternalTransitionImpl();
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateTransition createInternalImmediateTransition() {
		InternalImmediateTransitionImpl internalImmediateTransition = new InternalImmediateTransitionImpl();
		return internalImmediateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationTransition createInternalTerminationTransition() {
		InternalTerminationTransitionImpl internalTerminationTransition = new InternalTerminationTransitionImpl();
		return internalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConditionalTerminationTransition createInternalConditionalTerminationTransition() {
		InternalConditionalTerminationTransitionImpl internalConditionalTerminationTransition = new InternalConditionalTerminationTransitionImpl();
		return internalConditionalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalWeakAbortTransition createInternalWeakAbortTransition() {
		InternalWeakAbortTransitionImpl internalWeakAbortTransition = new InternalWeakAbortTransitionImpl();
		return internalWeakAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortTransition createInternalStrongAbortTransition() {
		InternalStrongAbortTransitionImpl internalStrongAbortTransition = new InternalStrongAbortTransitionImpl();
		return internalStrongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDeferredTransition createInternalDeferredTransition() {
		InternalDeferredTransitionImpl internalDeferredTransition = new InternalDeferredTransitionImpl();
		return internalDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalShallowHistoryTransition createInternalShallowHistoryTransition() {
		InternalShallowHistoryTransitionImpl internalShallowHistoryTransition = new InternalShallowHistoryTransitionImpl();
		return internalShallowHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalHistoryTransition createInternalHistoryTransition() {
		InternalHistoryTransitionImpl internalHistoryTransition = new InternalHistoryTransitionImpl();
		return internalHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSCChart createInternalSCChart() {
		InternalSCChartImpl internalSCChart = new InternalSCChartImpl();
		return internalSCChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRootStateDeclaration createInternalRootStateDeclaration() {
		InternalRootStateDeclarationImpl internalRootStateDeclaration = new InternalRootStateDeclarationImpl();
		return internalRootStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperStateDeclaration createInternalSuperStateDeclaration() {
		InternalSuperStateDeclarationImpl internalSuperStateDeclaration = new InternalSuperStateDeclarationImpl();
		return internalSuperStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuspend createInternalSuspend() {
		InternalSuspendImpl internalSuspend = new InternalSuspendImpl();
		return internalSuspend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAction createInternalAction() {
		InternalActionImpl internalAction = new InternalActionImpl();
		return internalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPackage getInternalPackage() {
		return (InternalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InternalPackage getPackage() {
		return InternalPackage.eINSTANCE;
	}

} //InternalFactoryImpl

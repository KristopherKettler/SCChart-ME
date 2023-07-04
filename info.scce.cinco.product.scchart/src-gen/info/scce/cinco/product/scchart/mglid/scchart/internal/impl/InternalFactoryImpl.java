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
			case InternalPackage.INTERNAL_SUSPEND_NODE: return createInternalSuspendNode();
			case InternalPackage.INTERNAL_ACTION_NODE: return createInternalActionNode();
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION_NODE: return createInternalSuperStateDeclarationNode();
			case InternalPackage.INTERNAL_SIMPLE_STATE: return createInternalSimpleState();
			case InternalPackage.INTERNAL_INITIAL_STATE: return createInternalInitialState();
			case InternalPackage.INTERNAL_FINAL_STATE: return createInternalFinalState();
			case InternalPackage.INTERNAL_CONNECTOR: return createInternalConnector();
			case InternalPackage.INTERNAL_TRANSITION: return createInternalTransition();
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION: return createInternalImmediateTransition();
			case InternalPackage.INTERNAL_TERMINATION_TRANSITION: return createInternalTerminationTransition();
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_TRANSITION: return createInternalConditionalTerminationTransition();
			case InternalPackage.INTERNAL_STRONG_ABORT_TRANSITION: return createInternalStrongAbortTransition();
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_TRANSITION: return createInternalImmediateStrongAbortTransition();
			case InternalPackage.INTERNAL_DEFERRED_TRANSITION: return createInternalDeferredTransition();
			case InternalPackage.INTERNAL_IMMEDIATE_DEFERRED_TRANSITION: return createInternalImmediateDeferredTransition();
			case InternalPackage.INTERNAL_TERMINATION_DEFFERD_TRANSITION: return createInternalTerminationDefferdTransition();
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION: return createInternalConditionalTerminationDeferredTransition();
			case InternalPackage.INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION: return createInternalStrongAbortDeferredTransition();
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION: return createInternalImmediateStrongAbortDeferredTransition();
			case InternalPackage.INTERNAL_HISTORY_TRANSITION: return createInternalHistoryTransition();
			case InternalPackage.INTERNAL_IMMEDIATE_HISTORY_TRANSITION: return createInternalImmediateHistoryTransition();
			case InternalPackage.INTERNAL_TERMINATION_HISTORY_TRANSITION: return createInternalTerminationHistoryTransition();
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION: return createInternalConditionalTerminationHistoryTransition();
			case InternalPackage.INTERNAL_STRONG_ABORT_HISTORY_TRANSITION: return createInternalStrongAbortHistoryTransition();
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION: return createInternalImmediateStrongAbortHistoryTransition();
			case InternalPackage.INTERNAL_CONNECTION: return createInternalConnection();
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
	public InternalSuspendNode createInternalSuspendNode() {
		InternalSuspendNodeImpl internalSuspendNode = new InternalSuspendNodeImpl();
		return internalSuspendNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalActionNode createInternalActionNode() {
		InternalActionNodeImpl internalActionNode = new InternalActionNodeImpl();
		return internalActionNode;
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
	public InternalImmediateStrongAbortTransition createInternalImmediateStrongAbortTransition() {
		InternalImmediateStrongAbortTransitionImpl internalImmediateStrongAbortTransition = new InternalImmediateStrongAbortTransitionImpl();
		return internalImmediateStrongAbortTransition;
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
	public InternalImmediateDeferredTransition createInternalImmediateDeferredTransition() {
		InternalImmediateDeferredTransitionImpl internalImmediateDeferredTransition = new InternalImmediateDeferredTransitionImpl();
		return internalImmediateDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationDefferdTransition createInternalTerminationDefferdTransition() {
		InternalTerminationDefferdTransitionImpl internalTerminationDefferdTransition = new InternalTerminationDefferdTransitionImpl();
		return internalTerminationDefferdTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConditionalTerminationDeferredTransition createInternalConditionalTerminationDeferredTransition() {
		InternalConditionalTerminationDeferredTransitionImpl internalConditionalTerminationDeferredTransition = new InternalConditionalTerminationDeferredTransitionImpl();
		return internalConditionalTerminationDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortDeferredTransition createInternalStrongAbortDeferredTransition() {
		InternalStrongAbortDeferredTransitionImpl internalStrongAbortDeferredTransition = new InternalStrongAbortDeferredTransitionImpl();
		return internalStrongAbortDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateStrongAbortDeferredTransition createInternalImmediateStrongAbortDeferredTransition() {
		InternalImmediateStrongAbortDeferredTransitionImpl internalImmediateStrongAbortDeferredTransition = new InternalImmediateStrongAbortDeferredTransitionImpl();
		return internalImmediateStrongAbortDeferredTransition;
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
	public InternalImmediateHistoryTransition createInternalImmediateHistoryTransition() {
		InternalImmediateHistoryTransitionImpl internalImmediateHistoryTransition = new InternalImmediateHistoryTransitionImpl();
		return internalImmediateHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationHistoryTransition createInternalTerminationHistoryTransition() {
		InternalTerminationHistoryTransitionImpl internalTerminationHistoryTransition = new InternalTerminationHistoryTransitionImpl();
		return internalTerminationHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConditionalTerminationHistoryTransition createInternalConditionalTerminationHistoryTransition() {
		InternalConditionalTerminationHistoryTransitionImpl internalConditionalTerminationHistoryTransition = new InternalConditionalTerminationHistoryTransitionImpl();
		return internalConditionalTerminationHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortHistoryTransition createInternalStrongAbortHistoryTransition() {
		InternalStrongAbortHistoryTransitionImpl internalStrongAbortHistoryTransition = new InternalStrongAbortHistoryTransitionImpl();
		return internalStrongAbortHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateStrongAbortHistoryTransition createInternalImmediateStrongAbortHistoryTransition() {
		InternalImmediateStrongAbortHistoryTransitionImpl internalImmediateStrongAbortHistoryTransition = new InternalImmediateStrongAbortHistoryTransitionImpl();
		return internalImmediateStrongAbortHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConnection createInternalConnection() {
		InternalConnectionImpl internalConnection = new InternalConnectionImpl();
		return internalConnection;
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

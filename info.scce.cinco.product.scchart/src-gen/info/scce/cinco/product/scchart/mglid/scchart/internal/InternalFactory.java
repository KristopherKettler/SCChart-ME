/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage
 * @generated
 */
public interface InternalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalFactory eINSTANCE = info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root State</em>'.
	 * @generated
	 */
	InternalRootState createInternalRootState();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	InternalRegion createInternalRegion();

	/**
	 * Returns a new object of class '<em>Data Flow Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow Region</em>'.
	 * @generated
	 */
	InternalDataFlowRegion createInternalDataFlowRegion();

	/**
	 * Returns a new object of class '<em>Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State</em>'.
	 * @generated
	 */
	InternalSuperState createInternalSuperState();

	/**
	 * Returns a new object of class '<em>Initilal Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initilal Super State</em>'.
	 * @generated
	 */
	InternalInitilalSuperState createInternalInitilalSuperState();

	/**
	 * Returns a new object of class '<em>Root State Declaration Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root State Declaration Node</em>'.
	 * @generated
	 */
	InternalRootStateDeclarationNode createInternalRootStateDeclarationNode();

	/**
	 * Returns a new object of class '<em>Suspend Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend Node</em>'.
	 * @generated
	 */
	InternalSuspendNode createInternalSuspendNode();

	/**
	 * Returns a new object of class '<em>Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Node</em>'.
	 * @generated
	 */
	InternalActionNode createInternalActionNode();

	/**
	 * Returns a new object of class '<em>Super State Declaration Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State Declaration Node</em>'.
	 * @generated
	 */
	InternalSuperStateDeclarationNode createInternalSuperStateDeclarationNode();

	/**
	 * Returns a new object of class '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple State</em>'.
	 * @generated
	 */
	InternalSimpleState createInternalSimpleState();

	/**
	 * Returns a new object of class '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial State</em>'.
	 * @generated
	 */
	InternalInitialState createInternalInitialState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	InternalFinalState createInternalFinalState();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	InternalConnector createInternalConnector();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	InternalTransition createInternalTransition();

	/**
	 * Returns a new object of class '<em>Immediate Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Transition</em>'.
	 * @generated
	 */
	InternalImmediateTransition createInternalImmediateTransition();

	/**
	 * Returns a new object of class '<em>Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termination Transition</em>'.
	 * @generated
	 */
	InternalTerminationTransition createInternalTerminationTransition();

	/**
	 * Returns a new object of class '<em>Conditional Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Termination Transition</em>'.
	 * @generated
	 */
	InternalConditionalTerminationTransition createInternalConditionalTerminationTransition();

	/**
	 * Returns a new object of class '<em>Weak Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weak Abort Transition</em>'.
	 * @generated
	 */
	InternalWeakAbortTransition createInternalWeakAbortTransition();

	/**
	 * Returns a new object of class '<em>Strong Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong Abort Transition</em>'.
	 * @generated
	 */
	InternalStrongAbortTransition createInternalStrongAbortTransition();

	/**
	 * Returns a new object of class '<em>Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deferred Transition</em>'.
	 * @generated
	 */
	InternalDeferredTransition createInternalDeferredTransition();

	/**
	 * Returns a new object of class '<em>History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Transition</em>'.
	 * @generated
	 */
	InternalHistoryTransition createInternalHistoryTransition();

	/**
	 * Returns a new object of class '<em>SC Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SC Chart</em>'.
	 * @generated
	 */
	InternalSCChart createInternalSCChart();

	/**
	 * Returns a new object of class '<em>Root State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root State Declaration</em>'.
	 * @generated
	 */
	InternalRootStateDeclaration createInternalRootStateDeclaration();

	/**
	 * Returns a new object of class '<em>Super State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State Declaration</em>'.
	 * @generated
	 */
	InternalSuperStateDeclaration createInternalSuperStateDeclaration();

	/**
	 * Returns a new object of class '<em>Suspend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend</em>'.
	 * @generated
	 */
	InternalSuspend createInternalSuspend();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	InternalAction createInternalAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InternalPackage getInternalPackage();

} //InternalFactory

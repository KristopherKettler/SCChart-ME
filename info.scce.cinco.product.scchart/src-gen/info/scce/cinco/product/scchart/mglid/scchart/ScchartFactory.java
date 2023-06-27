/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage
 * @generated
 */
public interface ScchartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScchartFactory eINSTANCE = info.scce.cinco.product.scchart.mglid.scchart.impl.ScchartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root State</em>'.
	 * @generated
	 */
	RootState createRootState();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Data Flow Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow Region</em>'.
	 * @generated
	 */
	DataFlowRegion createDataFlowRegion();

	/**
	 * Returns a new object of class '<em>Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State</em>'.
	 * @generated
	 */
	SuperState createSuperState();

	/**
	 * Returns a new object of class '<em>Initilal Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initilal Super State</em>'.
	 * @generated
	 */
	InitilalSuperState createInitilalSuperState();

	/**
	 * Returns a new object of class '<em>Root State Declaration Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root State Declaration Node</em>'.
	 * @generated
	 */
	RootStateDeclarationNode createRootStateDeclarationNode();

	/**
	 * Returns a new object of class '<em>Suspend Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend Node</em>'.
	 * @generated
	 */
	SuspendNode createSuspendNode();

	/**
	 * Returns a new object of class '<em>Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Node</em>'.
	 * @generated
	 */
	ActionNode createActionNode();

	/**
	 * Returns a new object of class '<em>Super State Declaration Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State Declaration Node</em>'.
	 * @generated
	 */
	SuperStateDeclarationNode createSuperStateDeclarationNode();

	/**
	 * Returns a new object of class '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple State</em>'.
	 * @generated
	 */
	SimpleState createSimpleState();

	/**
	 * Returns a new object of class '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial State</em>'.
	 * @generated
	 */
	InitialState createInitialState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Immediate Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Transition</em>'.
	 * @generated
	 */
	ImmediateTransition createImmediateTransition();

	/**
	 * Returns a new object of class '<em>Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termination Transition</em>'.
	 * @generated
	 */
	TerminationTransition createTerminationTransition();

	/**
	 * Returns a new object of class '<em>Conditional Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Termination Transition</em>'.
	 * @generated
	 */
	ConditionalTerminationTransition createConditionalTerminationTransition();

	/**
	 * Returns a new object of class '<em>Weak Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weak Abort Transition</em>'.
	 * @generated
	 */
	WeakAbortTransition createWeakAbortTransition();

	/**
	 * Returns a new object of class '<em>Strong Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong Abort Transition</em>'.
	 * @generated
	 */
	StrongAbortTransition createStrongAbortTransition();

	/**
	 * Returns a new object of class '<em>Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deferred Transition</em>'.
	 * @generated
	 */
	DeferredTransition createDeferredTransition();

	/**
	 * Returns a new object of class '<em>Shallow History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shallow History Transition</em>'.
	 * @generated
	 */
	ShallowHistoryTransition createShallowHistoryTransition();

	/**
	 * Returns a new object of class '<em>History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Transition</em>'.
	 * @generated
	 */
	HistoryTransition createHistoryTransition();

	/**
	 * Returns a new object of class '<em>SC Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SC Chart</em>'.
	 * @generated
	 */
	SCChart createSCChart();

	/**
	 * Returns a new object of class '<em>Root State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root State Declaration</em>'.
	 * @generated
	 */
	RootStateDeclaration createRootStateDeclaration();

	/**
	 * Returns a new object of class '<em>Super State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State Declaration</em>'.
	 * @generated
	 */
	SuperStateDeclaration createSuperStateDeclaration();

	/**
	 * Returns a new object of class '<em>Suspend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend</em>'.
	 * @generated
	 */
	Suspend createSuspend();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScchartPackage getScchartPackage();

} //ScchartFactory

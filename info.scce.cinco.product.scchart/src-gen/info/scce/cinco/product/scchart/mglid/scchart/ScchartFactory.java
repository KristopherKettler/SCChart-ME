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
	 * Returns a new object of class '<em>Super State Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State Region</em>'.
	 * @generated
	 */
	SuperStateRegion createSuperStateRegion();

	/**
	 * Returns a new object of class '<em>Sub Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Super State</em>'.
	 * @generated
	 */
	SubSuperState createSubSuperState();

	/**
	 * Returns a new object of class '<em>Initilal Sub Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initilal Sub Super State</em>'.
	 * @generated
	 */
	InitilalSubSuperState createInitilalSubSuperState();

	/**
	 * Returns a new object of class '<em>Sub Super State Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Super State Region</em>'.
	 * @generated
	 */
	SubSuperStateRegion createSubSuperStateRegion();

	/**
	 * Returns a new object of class '<em>Super State Declaration Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State Declaration Node</em>'.
	 * @generated
	 */
	SuperStateDeclarationNode createSuperStateDeclarationNode();

	/**
	 * Returns a new object of class '<em>Sub Super State Declaration Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Super State Declaration Node</em>'.
	 * @generated
	 */
	SubSuperStateDeclarationNode createSubSuperStateDeclarationNode();

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
	 * Returns a new object of class '<em>Immediate Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Termination Transition</em>'.
	 * @generated
	 */
	ImmediateTerminationTransition createImmediateTerminationTransition();

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
	 * Returns a new object of class '<em>Weak Abort Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weak Abort Termination Transition</em>'.
	 * @generated
	 */
	WeakAbortTerminationTransition createWeakAbortTerminationTransition();

	/**
	 * Returns a new object of class '<em>Deffered Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deffered Transition</em>'.
	 * @generated
	 */
	DefferedTransition createDefferedTransition();

	/**
	 * Returns a new object of class '<em>SC Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SC Chart</em>'.
	 * @generated
	 */
	SCChart createSCChart();

	/**
	 * Returns a new object of class '<em>Super State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State Declaration</em>'.
	 * @generated
	 */
	SuperStateDeclaration createSuperStateDeclaration();

	/**
	 * Returns a new object of class '<em>Sub Super State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Super State Declaration</em>'.
	 * @generated
	 */
	SubSuperStateDeclaration createSubSuperStateDeclaration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScchartPackage getScchartPackage();

} //ScchartFactory

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalEdge;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;
import graphmodel.internal.InternalType;

import info.scce.cinco.product.scchart.mglid.scchart.internal.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage
 * @generated
 */
public class InternalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InternalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSwitch() {
		if (modelPackage == null) {
			modelPackage = InternalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InternalPackage.INTERNAL_ROOT_STATE: {
				InternalRootState internalRootState = (InternalRootState)theEObject;
				T result = caseInternalRootState(internalRootState);
				if (result == null) result = caseInternalContainer(internalRootState);
				if (result == null) result = caseInternalNode(internalRootState);
				if (result == null) result = caseInternalModelElementContainer(internalRootState);
				if (result == null) result = caseInternalModelElement(internalRootState);
				if (result == null) result = caseInternalIdentifiableElement(internalRootState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUPER_STATE_REGION: {
				InternalSuperStateRegion internalSuperStateRegion = (InternalSuperStateRegion)theEObject;
				T result = caseInternalSuperStateRegion(internalSuperStateRegion);
				if (result == null) result = caseInternalContainer(internalSuperStateRegion);
				if (result == null) result = caseInternalNode(internalSuperStateRegion);
				if (result == null) result = caseInternalModelElementContainer(internalSuperStateRegion);
				if (result == null) result = caseInternalModelElement(internalSuperStateRegion);
				if (result == null) result = caseInternalIdentifiableElement(internalSuperStateRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUB_SUPER_STATE: {
				InternalSubSuperState internalSubSuperState = (InternalSubSuperState)theEObject;
				T result = caseInternalSubSuperState(internalSubSuperState);
				if (result == null) result = caseInternalContainer(internalSubSuperState);
				if (result == null) result = caseInternalNode(internalSubSuperState);
				if (result == null) result = caseInternalModelElementContainer(internalSubSuperState);
				if (result == null) result = caseInternalModelElement(internalSubSuperState);
				if (result == null) result = caseInternalIdentifiableElement(internalSubSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_INITILAL_SUB_SUPER_STATE: {
				InternalInitilalSubSuperState internalInitilalSubSuperState = (InternalInitilalSubSuperState)theEObject;
				T result = caseInternalInitilalSubSuperState(internalInitilalSubSuperState);
				if (result == null) result = caseInternalSubSuperState(internalInitilalSubSuperState);
				if (result == null) result = caseInternalContainer(internalInitilalSubSuperState);
				if (result == null) result = caseInternalNode(internalInitilalSubSuperState);
				if (result == null) result = caseInternalModelElementContainer(internalInitilalSubSuperState);
				if (result == null) result = caseInternalModelElement(internalInitilalSubSuperState);
				if (result == null) result = caseInternalIdentifiableElement(internalInitilalSubSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUB_SUPER_STATE_REGION: {
				InternalSubSuperStateRegion internalSubSuperStateRegion = (InternalSubSuperStateRegion)theEObject;
				T result = caseInternalSubSuperStateRegion(internalSubSuperStateRegion);
				if (result == null) result = caseInternalContainer(internalSubSuperStateRegion);
				if (result == null) result = caseInternalNode(internalSubSuperStateRegion);
				if (result == null) result = caseInternalModelElementContainer(internalSubSuperStateRegion);
				if (result == null) result = caseInternalModelElement(internalSubSuperStateRegion);
				if (result == null) result = caseInternalIdentifiableElement(internalSubSuperStateRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION_NODE: {
				InternalSuperStateDeclarationNode internalSuperStateDeclarationNode = (InternalSuperStateDeclarationNode)theEObject;
				T result = caseInternalSuperStateDeclarationNode(internalSuperStateDeclarationNode);
				if (result == null) result = caseInternalNode(internalSuperStateDeclarationNode);
				if (result == null) result = caseInternalModelElement(internalSuperStateDeclarationNode);
				if (result == null) result = caseInternalIdentifiableElement(internalSuperStateDeclarationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE: {
				InternalSubSuperStateDeclarationNode internalSubSuperStateDeclarationNode = (InternalSubSuperStateDeclarationNode)theEObject;
				T result = caseInternalSubSuperStateDeclarationNode(internalSubSuperStateDeclarationNode);
				if (result == null) result = caseInternalNode(internalSubSuperStateDeclarationNode);
				if (result == null) result = caseInternalModelElement(internalSubSuperStateDeclarationNode);
				if (result == null) result = caseInternalIdentifiableElement(internalSubSuperStateDeclarationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SIMPLE_STATE: {
				InternalSimpleState internalSimpleState = (InternalSimpleState)theEObject;
				T result = caseInternalSimpleState(internalSimpleState);
				if (result == null) result = caseInternalNode(internalSimpleState);
				if (result == null) result = caseInternalModelElement(internalSimpleState);
				if (result == null) result = caseInternalIdentifiableElement(internalSimpleState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_INITIAL_STATE: {
				InternalInitialState internalInitialState = (InternalInitialState)theEObject;
				T result = caseInternalInitialState(internalInitialState);
				if (result == null) result = caseInternalSimpleState(internalInitialState);
				if (result == null) result = caseInternalNode(internalInitialState);
				if (result == null) result = caseInternalModelElement(internalInitialState);
				if (result == null) result = caseInternalIdentifiableElement(internalInitialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_FINAL_STATE: {
				InternalFinalState internalFinalState = (InternalFinalState)theEObject;
				T result = caseInternalFinalState(internalFinalState);
				if (result == null) result = caseInternalSimpleState(internalFinalState);
				if (result == null) result = caseInternalNode(internalFinalState);
				if (result == null) result = caseInternalModelElement(internalFinalState);
				if (result == null) result = caseInternalIdentifiableElement(internalFinalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CONNECTOR: {
				InternalConnector internalConnector = (InternalConnector)theEObject;
				T result = caseInternalConnector(internalConnector);
				if (result == null) result = caseInternalNode(internalConnector);
				if (result == null) result = caseInternalModelElement(internalConnector);
				if (result == null) result = caseInternalIdentifiableElement(internalConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_TRANSITION: {
				InternalTransition internalTransition = (InternalTransition)theEObject;
				T result = caseInternalTransition(internalTransition);
				if (result == null) result = caseInternalEdge(internalTransition);
				if (result == null) result = caseInternalModelElement(internalTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION: {
				InternalImmediateTransition internalImmediateTransition = (InternalImmediateTransition)theEObject;
				T result = caseInternalImmediateTransition(internalImmediateTransition);
				if (result == null) result = caseInternalEdge(internalImmediateTransition);
				if (result == null) result = caseInternalModelElement(internalImmediateTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalImmediateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_IMMEDIATE_TERMINATION_TRANSITION: {
				InternalImmediateTerminationTransition internalImmediateTerminationTransition = (InternalImmediateTerminationTransition)theEObject;
				T result = caseInternalImmediateTerminationTransition(internalImmediateTerminationTransition);
				if (result == null) result = caseInternalEdge(internalImmediateTerminationTransition);
				if (result == null) result = caseInternalModelElement(internalImmediateTerminationTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalImmediateTerminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_WEAK_ABORT_TRANSITION: {
				InternalWeakAbortTransition internalWeakAbortTransition = (InternalWeakAbortTransition)theEObject;
				T result = caseInternalWeakAbortTransition(internalWeakAbortTransition);
				if (result == null) result = caseInternalEdge(internalWeakAbortTransition);
				if (result == null) result = caseInternalModelElement(internalWeakAbortTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalWeakAbortTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_STRONG_ABORT_TRANSITION: {
				InternalStrongAbortTransition internalStrongAbortTransition = (InternalStrongAbortTransition)theEObject;
				T result = caseInternalStrongAbortTransition(internalStrongAbortTransition);
				if (result == null) result = caseInternalEdge(internalStrongAbortTransition);
				if (result == null) result = caseInternalModelElement(internalStrongAbortTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalStrongAbortTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION: {
				InternalWeakAbortTerminationTransition internalWeakAbortTerminationTransition = (InternalWeakAbortTerminationTransition)theEObject;
				T result = caseInternalWeakAbortTerminationTransition(internalWeakAbortTerminationTransition);
				if (result == null) result = caseInternalEdge(internalWeakAbortTerminationTransition);
				if (result == null) result = caseInternalModelElement(internalWeakAbortTerminationTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalWeakAbortTerminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DEFFERED_TRANSITION: {
				InternalDefferedTransition internalDefferedTransition = (InternalDefferedTransition)theEObject;
				T result = caseInternalDefferedTransition(internalDefferedTransition);
				if (result == null) result = caseInternalEdge(internalDefferedTransition);
				if (result == null) result = caseInternalModelElement(internalDefferedTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalDefferedTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SC_CHART: {
				InternalSCChart internalSCChart = (InternalSCChart)theEObject;
				T result = caseInternalSCChart(internalSCChart);
				if (result == null) result = caseInternalGraphModel(internalSCChart);
				if (result == null) result = caseInternalModelElementContainer(internalSCChart);
				if (result == null) result = caseInternalIdentifiableElement(internalSCChart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION: {
				InternalSuperStateDeclaration internalSuperStateDeclaration = (InternalSuperStateDeclaration)theEObject;
				T result = caseInternalSuperStateDeclaration(internalSuperStateDeclaration);
				if (result == null) result = caseInternalType(internalSuperStateDeclaration);
				if (result == null) result = caseInternalIdentifiableElement(internalSuperStateDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUB_SUPER_STATE_DECLARATION: {
				InternalSubSuperStateDeclaration internalSubSuperStateDeclaration = (InternalSubSuperStateDeclaration)theEObject;
				T result = caseInternalSubSuperStateDeclaration(internalSubSuperStateDeclaration);
				if (result == null) result = caseInternalType(internalSubSuperStateDeclaration);
				if (result == null) result = caseInternalIdentifiableElement(internalSubSuperStateDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalRootState(InternalRootState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super State Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super State Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSuperStateRegion(InternalSuperStateRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Super State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Super State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSubSuperState(InternalSubSuperState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initilal Sub Super State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initilal Sub Super State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitilalSubSuperState(InternalInitilalSubSuperState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Super State Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Super State Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSubSuperStateRegion(InternalSubSuperStateRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super State Declaration Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super State Declaration Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSuperStateDeclarationNode(InternalSuperStateDeclarationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Super State Declaration Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Super State Declaration Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSubSuperStateDeclarationNode(InternalSubSuperStateDeclarationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSimpleState(InternalSimpleState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitialState(InternalInitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalFinalState(InternalFinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalConnector(InternalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTransition(InternalTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalImmediateTransition(InternalImmediateTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Termination Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalImmediateTerminationTransition(InternalImmediateTerminationTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weak Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weak Abort Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalWeakAbortTransition(InternalWeakAbortTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalStrongAbortTransition(InternalStrongAbortTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weak Abort Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weak Abort Termination Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalWeakAbortTerminationTransition(InternalWeakAbortTerminationTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deffered Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deffered Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDefferedTransition(InternalDefferedTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SC Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SC Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSCChart(InternalSCChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super State Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSuperStateDeclaration(InternalSuperStateDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Super State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Super State Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSubSuperStateDeclaration(InternalSubSuperStateDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalIdentifiableElement(InternalIdentifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalModelElement(InternalModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalNode(InternalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalModelElementContainer(InternalModelElementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalContainer(InternalContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEdge(InternalEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalGraphModel(InternalGraphModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalType(InternalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InternalSwitch

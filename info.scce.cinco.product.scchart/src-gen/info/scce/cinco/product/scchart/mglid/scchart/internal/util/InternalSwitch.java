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
			case InternalPackage.INTERNAL_REGION: {
				InternalRegion internalRegion = (InternalRegion)theEObject;
				T result = caseInternalRegion(internalRegion);
				if (result == null) result = caseInternalContainer(internalRegion);
				if (result == null) result = caseInternalNode(internalRegion);
				if (result == null) result = caseInternalModelElementContainer(internalRegion);
				if (result == null) result = caseInternalModelElement(internalRegion);
				if (result == null) result = caseInternalIdentifiableElement(internalRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DATA_FLOW_REGION: {
				InternalDataFlowRegion internalDataFlowRegion = (InternalDataFlowRegion)theEObject;
				T result = caseInternalDataFlowRegion(internalDataFlowRegion);
				if (result == null) result = caseInternalRegion(internalDataFlowRegion);
				if (result == null) result = caseInternalContainer(internalDataFlowRegion);
				if (result == null) result = caseInternalNode(internalDataFlowRegion);
				if (result == null) result = caseInternalModelElementContainer(internalDataFlowRegion);
				if (result == null) result = caseInternalModelElement(internalDataFlowRegion);
				if (result == null) result = caseInternalIdentifiableElement(internalDataFlowRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SUPER_STATE: {
				InternalSuperState internalSuperState = (InternalSuperState)theEObject;
				T result = caseInternalSuperState(internalSuperState);
				if (result == null) result = caseInternalContainer(internalSuperState);
				if (result == null) result = caseInternalNode(internalSuperState);
				if (result == null) result = caseInternalModelElementContainer(internalSuperState);
				if (result == null) result = caseInternalModelElement(internalSuperState);
				if (result == null) result = caseInternalIdentifiableElement(internalSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_INITILAL_SUPER_STATE: {
				InternalInitilalSuperState internalInitilalSuperState = (InternalInitilalSuperState)theEObject;
				T result = caseInternalInitilalSuperState(internalInitilalSuperState);
				if (result == null) result = caseInternalSuperState(internalInitilalSuperState);
				if (result == null) result = caseInternalContainer(internalInitilalSuperState);
				if (result == null) result = caseInternalNode(internalInitilalSuperState);
				if (result == null) result = caseInternalModelElementContainer(internalInitilalSuperState);
				if (result == null) result = caseInternalModelElement(internalInitilalSuperState);
				if (result == null) result = caseInternalIdentifiableElement(internalInitilalSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION_NODE: {
				InternalRootStateDeclarationNode internalRootStateDeclarationNode = (InternalRootStateDeclarationNode)theEObject;
				T result = caseInternalRootStateDeclarationNode(internalRootStateDeclarationNode);
				if (result == null) result = caseInternalNode(internalRootStateDeclarationNode);
				if (result == null) result = caseInternalModelElement(internalRootStateDeclarationNode);
				if (result == null) result = caseInternalIdentifiableElement(internalRootStateDeclarationNode);
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
			case InternalPackage.INTERNAL_TERMINATION_TRANSITION: {
				InternalTerminationTransition internalTerminationTransition = (InternalTerminationTransition)theEObject;
				T result = caseInternalTerminationTransition(internalTerminationTransition);
				if (result == null) result = caseInternalEdge(internalTerminationTransition);
				if (result == null) result = caseInternalModelElement(internalTerminationTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalTerminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_TRANSITION: {
				InternalConditionalTerminationTransition internalConditionalTerminationTransition = (InternalConditionalTerminationTransition)theEObject;
				T result = caseInternalConditionalTerminationTransition(internalConditionalTerminationTransition);
				if (result == null) result = caseInternalEdge(internalConditionalTerminationTransition);
				if (result == null) result = caseInternalModelElement(internalConditionalTerminationTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalConditionalTerminationTransition);
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
			case InternalPackage.INTERNAL_DEFERRED_TRANSITION: {
				InternalDeferredTransition internalDeferredTransition = (InternalDeferredTransition)theEObject;
				T result = caseInternalDeferredTransition(internalDeferredTransition);
				if (result == null) result = caseInternalEdge(internalDeferredTransition);
				if (result == null) result = caseInternalModelElement(internalDeferredTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_SHALLOW_HISTORY_TRANSITION: {
				InternalShallowHistoryTransition internalShallowHistoryTransition = (InternalShallowHistoryTransition)theEObject;
				T result = caseInternalShallowHistoryTransition(internalShallowHistoryTransition);
				if (result == null) result = caseInternalEdge(internalShallowHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalShallowHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalShallowHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_HISTORY_TRANSITION: {
				InternalHistoryTransition internalHistoryTransition = (InternalHistoryTransition)theEObject;
				T result = caseInternalHistoryTransition(internalHistoryTransition);
				if (result == null) result = caseInternalEdge(internalHistoryTransition);
				if (result == null) result = caseInternalModelElement(internalHistoryTransition);
				if (result == null) result = caseInternalIdentifiableElement(internalHistoryTransition);
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
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION: {
				InternalRootStateDeclaration internalRootStateDeclaration = (InternalRootStateDeclaration)theEObject;
				T result = caseInternalRootStateDeclaration(internalRootStateDeclaration);
				if (result == null) result = caseInternalType(internalRootStateDeclaration);
				if (result == null) result = caseInternalIdentifiableElement(internalRootStateDeclaration);
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
			case InternalPackage.INTERNAL_SUSPEND: {
				InternalSuspend internalSuspend = (InternalSuspend)theEObject;
				T result = caseInternalSuspend(internalSuspend);
				if (result == null) result = caseInternalType(internalSuspend);
				if (result == null) result = caseInternalIdentifiableElement(internalSuspend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_ACTION: {
				InternalAction internalAction = (InternalAction)theEObject;
				T result = caseInternalAction(internalAction);
				if (result == null) result = caseInternalType(internalAction);
				if (result == null) result = caseInternalIdentifiableElement(internalAction);
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
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalRegion(InternalRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDataFlowRegion(InternalDataFlowRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSuperState(InternalSuperState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initilal Super State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initilal Super State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalInitilalSuperState(InternalInitilalSuperState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root State Declaration Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root State Declaration Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalRootStateDeclarationNode(InternalRootStateDeclarationNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTerminationTransition(InternalTerminationTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Termination Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalConditionalTerminationTransition(InternalConditionalTerminationTransition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDeferredTransition(InternalDeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shallow History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shallow History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalShallowHistoryTransition(InternalShallowHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalHistoryTransition(InternalHistoryTransition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Root State Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root State Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalRootStateDeclaration(InternalRootStateDeclaration object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Suspend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSuspend(InternalSuspend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalAction(InternalAction object) {
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

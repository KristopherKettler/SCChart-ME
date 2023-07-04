/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.util;

import graphmodel.Container;
import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;
import graphmodel.Type;

import info.scce.cinco.product.scchart.mglid.scchart.*;

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
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage
 * @generated
 */
public class ScchartSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScchartPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScchartSwitch() {
		if (modelPackage == null) {
			modelPackage = ScchartPackage.eINSTANCE;
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
			case ScchartPackage.ROOT_STATE: {
				RootState rootState = (RootState)theEObject;
				T result = caseRootState(rootState);
				if (result == null) result = caseContainer(rootState);
				if (result == null) result = caseModelElementContainer(rootState);
				if (result == null) result = caseNode(rootState);
				if (result == null) result = caseModelElement(rootState);
				if (result == null) result = caseIdentifiableElement(rootState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseContainer(region);
				if (result == null) result = caseModelElementContainer(region);
				if (result == null) result = caseNode(region);
				if (result == null) result = caseModelElement(region);
				if (result == null) result = caseIdentifiableElement(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.DATA_FLOW_REGION: {
				DataFlowRegion dataFlowRegion = (DataFlowRegion)theEObject;
				T result = caseDataFlowRegion(dataFlowRegion);
				if (result == null) result = caseRegion(dataFlowRegion);
				if (result == null) result = caseContainer(dataFlowRegion);
				if (result == null) result = caseModelElementContainer(dataFlowRegion);
				if (result == null) result = caseNode(dataFlowRegion);
				if (result == null) result = caseModelElement(dataFlowRegion);
				if (result == null) result = caseIdentifiableElement(dataFlowRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUPER_STATE: {
				SuperState superState = (SuperState)theEObject;
				T result = caseSuperState(superState);
				if (result == null) result = caseContainer(superState);
				if (result == null) result = caseModelElementContainer(superState);
				if (result == null) result = caseNode(superState);
				if (result == null) result = caseModelElement(superState);
				if (result == null) result = caseIdentifiableElement(superState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.INITILAL_SUPER_STATE: {
				InitilalSuperState initilalSuperState = (InitilalSuperState)theEObject;
				T result = caseInitilalSuperState(initilalSuperState);
				if (result == null) result = caseSuperState(initilalSuperState);
				if (result == null) result = caseContainer(initilalSuperState);
				if (result == null) result = caseModelElementContainer(initilalSuperState);
				if (result == null) result = caseNode(initilalSuperState);
				if (result == null) result = caseModelElement(initilalSuperState);
				if (result == null) result = caseIdentifiableElement(initilalSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE: {
				RootStateDeclarationNode rootStateDeclarationNode = (RootStateDeclarationNode)theEObject;
				T result = caseRootStateDeclarationNode(rootStateDeclarationNode);
				if (result == null) result = caseNode(rootStateDeclarationNode);
				if (result == null) result = caseModelElement(rootStateDeclarationNode);
				if (result == null) result = caseIdentifiableElement(rootStateDeclarationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUSPEND_NODE: {
				SuspendNode suspendNode = (SuspendNode)theEObject;
				T result = caseSuspendNode(suspendNode);
				if (result == null) result = caseNode(suspendNode);
				if (result == null) result = caseModelElement(suspendNode);
				if (result == null) result = caseIdentifiableElement(suspendNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.ACTION_NODE: {
				ActionNode actionNode = (ActionNode)theEObject;
				T result = caseActionNode(actionNode);
				if (result == null) result = caseNode(actionNode);
				if (result == null) result = caseModelElement(actionNode);
				if (result == null) result = caseIdentifiableElement(actionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUPER_STATE_DECLARATION_NODE: {
				SuperStateDeclarationNode superStateDeclarationNode = (SuperStateDeclarationNode)theEObject;
				T result = caseSuperStateDeclarationNode(superStateDeclarationNode);
				if (result == null) result = caseNode(superStateDeclarationNode);
				if (result == null) result = caseModelElement(superStateDeclarationNode);
				if (result == null) result = caseIdentifiableElement(superStateDeclarationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SIMPLE_STATE: {
				SimpleState simpleState = (SimpleState)theEObject;
				T result = caseSimpleState(simpleState);
				if (result == null) result = caseNode(simpleState);
				if (result == null) result = caseModelElement(simpleState);
				if (result == null) result = caseIdentifiableElement(simpleState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseSimpleState(initialState);
				if (result == null) result = caseNode(initialState);
				if (result == null) result = caseModelElement(initialState);
				if (result == null) result = caseIdentifiableElement(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseSimpleState(finalState);
				if (result == null) result = caseNode(finalState);
				if (result == null) result = caseModelElement(finalState);
				if (result == null) result = caseIdentifiableElement(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseNode(connector);
				if (result == null) result = caseModelElement(connector);
				if (result == null) result = caseIdentifiableElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseEdge(transition);
				if (result == null) result = caseModelElement(transition);
				if (result == null) result = caseIdentifiableElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.IMMEDIATE_TRANSITION: {
				ImmediateTransition immediateTransition = (ImmediateTransition)theEObject;
				T result = caseImmediateTransition(immediateTransition);
				if (result == null) result = caseEdge(immediateTransition);
				if (result == null) result = caseModelElement(immediateTransition);
				if (result == null) result = caseIdentifiableElement(immediateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.TERMINATION_TRANSITION: {
				TerminationTransition terminationTransition = (TerminationTransition)theEObject;
				T result = caseTerminationTransition(terminationTransition);
				if (result == null) result = caseEdge(terminationTransition);
				if (result == null) result = caseModelElement(terminationTransition);
				if (result == null) result = caseIdentifiableElement(terminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.CONDITIONAL_TERMINATION_TRANSITION: {
				ConditionalTerminationTransition conditionalTerminationTransition = (ConditionalTerminationTransition)theEObject;
				T result = caseConditionalTerminationTransition(conditionalTerminationTransition);
				if (result == null) result = caseEdge(conditionalTerminationTransition);
				if (result == null) result = caseModelElement(conditionalTerminationTransition);
				if (result == null) result = caseIdentifiableElement(conditionalTerminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.STRONG_ABORT_TRANSITION: {
				StrongAbortTransition strongAbortTransition = (StrongAbortTransition)theEObject;
				T result = caseStrongAbortTransition(strongAbortTransition);
				if (result == null) result = caseEdge(strongAbortTransition);
				if (result == null) result = caseModelElement(strongAbortTransition);
				if (result == null) result = caseIdentifiableElement(strongAbortTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_TRANSITION: {
				ImmediateStrongAbortTransition immediateStrongAbortTransition = (ImmediateStrongAbortTransition)theEObject;
				T result = caseImmediateStrongAbortTransition(immediateStrongAbortTransition);
				if (result == null) result = caseEdge(immediateStrongAbortTransition);
				if (result == null) result = caseModelElement(immediateStrongAbortTransition);
				if (result == null) result = caseIdentifiableElement(immediateStrongAbortTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.DEFERRED_TRANSITION: {
				DeferredTransition deferredTransition = (DeferredTransition)theEObject;
				T result = caseDeferredTransition(deferredTransition);
				if (result == null) result = caseEdge(deferredTransition);
				if (result == null) result = caseModelElement(deferredTransition);
				if (result == null) result = caseIdentifiableElement(deferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.IMMEDIATE_DEFERRED_TRANSITION: {
				ImmediateDeferredTransition immediateDeferredTransition = (ImmediateDeferredTransition)theEObject;
				T result = caseImmediateDeferredTransition(immediateDeferredTransition);
				if (result == null) result = caseEdge(immediateDeferredTransition);
				if (result == null) result = caseModelElement(immediateDeferredTransition);
				if (result == null) result = caseIdentifiableElement(immediateDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.TERMINATION_DEFFERD_TRANSITION: {
				TerminationDefferdTransition terminationDefferdTransition = (TerminationDefferdTransition)theEObject;
				T result = caseTerminationDefferdTransition(terminationDefferdTransition);
				if (result == null) result = caseEdge(terminationDefferdTransition);
				if (result == null) result = caseModelElement(terminationDefferdTransition);
				if (result == null) result = caseIdentifiableElement(terminationDefferdTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.CONDITIONAL_TERMINATION_DEFERRED_TRANSITION: {
				ConditionalTerminationDeferredTransition conditionalTerminationDeferredTransition = (ConditionalTerminationDeferredTransition)theEObject;
				T result = caseConditionalTerminationDeferredTransition(conditionalTerminationDeferredTransition);
				if (result == null) result = caseEdge(conditionalTerminationDeferredTransition);
				if (result == null) result = caseModelElement(conditionalTerminationDeferredTransition);
				if (result == null) result = caseIdentifiableElement(conditionalTerminationDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.STRONG_ABORT_DEFERRED_TRANSITION: {
				StrongAbortDeferredTransition strongAbortDeferredTransition = (StrongAbortDeferredTransition)theEObject;
				T result = caseStrongAbortDeferredTransition(strongAbortDeferredTransition);
				if (result == null) result = caseEdge(strongAbortDeferredTransition);
				if (result == null) result = caseModelElement(strongAbortDeferredTransition);
				if (result == null) result = caseIdentifiableElement(strongAbortDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION: {
				ImmediateStrongAbortDeferredTransition immediateStrongAbortDeferredTransition = (ImmediateStrongAbortDeferredTransition)theEObject;
				T result = caseImmediateStrongAbortDeferredTransition(immediateStrongAbortDeferredTransition);
				if (result == null) result = caseEdge(immediateStrongAbortDeferredTransition);
				if (result == null) result = caseModelElement(immediateStrongAbortDeferredTransition);
				if (result == null) result = caseIdentifiableElement(immediateStrongAbortDeferredTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.HISTORY_TRANSITION: {
				HistoryTransition historyTransition = (HistoryTransition)theEObject;
				T result = caseHistoryTransition(historyTransition);
				if (result == null) result = caseEdge(historyTransition);
				if (result == null) result = caseModelElement(historyTransition);
				if (result == null) result = caseIdentifiableElement(historyTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.IMMEDIATE_HISTORY_TRANSITION: {
				ImmediateHistoryTransition immediateHistoryTransition = (ImmediateHistoryTransition)theEObject;
				T result = caseImmediateHistoryTransition(immediateHistoryTransition);
				if (result == null) result = caseEdge(immediateHistoryTransition);
				if (result == null) result = caseModelElement(immediateHistoryTransition);
				if (result == null) result = caseIdentifiableElement(immediateHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.TERMINATION_HISTORY_TRANSITION: {
				TerminationHistoryTransition terminationHistoryTransition = (TerminationHistoryTransition)theEObject;
				T result = caseTerminationHistoryTransition(terminationHistoryTransition);
				if (result == null) result = caseEdge(terminationHistoryTransition);
				if (result == null) result = caseModelElement(terminationHistoryTransition);
				if (result == null) result = caseIdentifiableElement(terminationHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.CONDITIONAL_TERMINATION_HISTORY_TRANSITION: {
				ConditionalTerminationHistoryTransition conditionalTerminationHistoryTransition = (ConditionalTerminationHistoryTransition)theEObject;
				T result = caseConditionalTerminationHistoryTransition(conditionalTerminationHistoryTransition);
				if (result == null) result = caseEdge(conditionalTerminationHistoryTransition);
				if (result == null) result = caseModelElement(conditionalTerminationHistoryTransition);
				if (result == null) result = caseIdentifiableElement(conditionalTerminationHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.STRONG_ABORT_HISTORY_TRANSITION: {
				StrongAbortHistoryTransition strongAbortHistoryTransition = (StrongAbortHistoryTransition)theEObject;
				T result = caseStrongAbortHistoryTransition(strongAbortHistoryTransition);
				if (result == null) result = caseEdge(strongAbortHistoryTransition);
				if (result == null) result = caseModelElement(strongAbortHistoryTransition);
				if (result == null) result = caseIdentifiableElement(strongAbortHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION: {
				ImmediateStrongAbortHistoryTransition immediateStrongAbortHistoryTransition = (ImmediateStrongAbortHistoryTransition)theEObject;
				T result = caseImmediateStrongAbortHistoryTransition(immediateStrongAbortHistoryTransition);
				if (result == null) result = caseEdge(immediateStrongAbortHistoryTransition);
				if (result == null) result = caseModelElement(immediateStrongAbortHistoryTransition);
				if (result == null) result = caseIdentifiableElement(immediateStrongAbortHistoryTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseEdge(connection);
				if (result == null) result = caseModelElement(connection);
				if (result == null) result = caseIdentifiableElement(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SC_CHART: {
				SCChart scChart = (SCChart)theEObject;
				T result = caseSCChart(scChart);
				if (result == null) result = caseGraphModel(scChart);
				if (result == null) result = caseModelElementContainer(scChart);
				if (result == null) result = caseIdentifiableElement(scChart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.ROOT_STATE_DECLARATION: {
				RootStateDeclaration rootStateDeclaration = (RootStateDeclaration)theEObject;
				T result = caseRootStateDeclaration(rootStateDeclaration);
				if (result == null) result = caseType(rootStateDeclaration);
				if (result == null) result = caseIdentifiableElement(rootStateDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUPER_STATE_DECLARATION: {
				SuperStateDeclaration superStateDeclaration = (SuperStateDeclaration)theEObject;
				T result = caseSuperStateDeclaration(superStateDeclaration);
				if (result == null) result = caseType(superStateDeclaration);
				if (result == null) result = caseIdentifiableElement(superStateDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUSPEND: {
				Suspend suspend = (Suspend)theEObject;
				T result = caseSuspend(suspend);
				if (result == null) result = caseType(suspend);
				if (result == null) result = caseIdentifiableElement(suspend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseType(action);
				if (result == null) result = caseIdentifiableElement(action);
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
	public T caseRootState(RootState object) {
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
	public T caseRegion(Region object) {
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
	public T caseDataFlowRegion(DataFlowRegion object) {
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
	public T caseSuperState(SuperState object) {
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
	public T caseInitilalSuperState(InitilalSuperState object) {
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
	public T caseRootStateDeclarationNode(RootStateDeclarationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspend Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspendNode(SuspendNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionNode(ActionNode object) {
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
	public T caseSuperStateDeclarationNode(SuperStateDeclarationNode object) {
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
	public T caseSimpleState(SimpleState object) {
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
	public T caseInitialState(InitialState object) {
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
	public T caseFinalState(FinalState object) {
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
	public T caseConnector(Connector object) {
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
	public T caseTransition(Transition object) {
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
	public T caseImmediateTransition(ImmediateTransition object) {
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
	public T caseTerminationTransition(TerminationTransition object) {
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
	public T caseConditionalTerminationTransition(ConditionalTerminationTransition object) {
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
	public T caseStrongAbortTransition(StrongAbortTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Strong Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Strong Abort Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateStrongAbortTransition(ImmediateStrongAbortTransition object) {
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
	public T caseDeferredTransition(DeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateDeferredTransition(ImmediateDeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Defferd Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Defferd Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationDefferdTransition(TerminationDefferdTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Termination Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Termination Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalTerminationDeferredTransition(ConditionalTerminationDeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongAbortDeferredTransition(StrongAbortDeferredTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Strong Abort Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Strong Abort Deferred Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateStrongAbortDeferredTransition(ImmediateStrongAbortDeferredTransition object) {
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
	public T caseHistoryTransition(HistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateHistoryTransition(ImmediateHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationHistoryTransition(TerminationHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Termination History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Termination History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalTerminationHistoryTransition(ConditionalTerminationHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongAbortHistoryTransition(StrongAbortHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Strong Abort History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Strong Abort History Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateStrongAbortHistoryTransition(ImmediateStrongAbortHistoryTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
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
	public T caseSCChart(SCChart object) {
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
	public T caseRootStateDeclaration(RootStateDeclaration object) {
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
	public T caseSuperStateDeclaration(SuperStateDeclaration object) {
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
	public T caseSuspend(Suspend object) {
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
	public T caseAction(Action object) {
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
	public T caseIdentifiableElement(IdentifiableElement object) {
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
	public T caseModelElementContainer(ModelElementContainer object) {
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
	public T caseModelElement(ModelElement object) {
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
	public T caseNode(Node object) {
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
	public T caseContainer(Container object) {
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
	public T caseEdge(Edge object) {
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
	public T caseGraphModel(GraphModel object) {
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
	public T caseType(Type object) {
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

} //ScchartSwitch

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
			case ScchartPackage.SUPER_STATE_REGION: {
				SuperStateRegion superStateRegion = (SuperStateRegion)theEObject;
				T result = caseSuperStateRegion(superStateRegion);
				if (result == null) result = caseContainer(superStateRegion);
				if (result == null) result = caseModelElementContainer(superStateRegion);
				if (result == null) result = caseNode(superStateRegion);
				if (result == null) result = caseModelElement(superStateRegion);
				if (result == null) result = caseIdentifiableElement(superStateRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUB_SUPER_STATE: {
				SubSuperState subSuperState = (SubSuperState)theEObject;
				T result = caseSubSuperState(subSuperState);
				if (result == null) result = caseContainer(subSuperState);
				if (result == null) result = caseModelElementContainer(subSuperState);
				if (result == null) result = caseNode(subSuperState);
				if (result == null) result = caseModelElement(subSuperState);
				if (result == null) result = caseIdentifiableElement(subSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.INITILAL_SUB_SUPER_STATE: {
				InitilalSubSuperState initilalSubSuperState = (InitilalSubSuperState)theEObject;
				T result = caseInitilalSubSuperState(initilalSubSuperState);
				if (result == null) result = caseSubSuperState(initilalSubSuperState);
				if (result == null) result = caseContainer(initilalSubSuperState);
				if (result == null) result = caseModelElementContainer(initilalSubSuperState);
				if (result == null) result = caseNode(initilalSubSuperState);
				if (result == null) result = caseModelElement(initilalSubSuperState);
				if (result == null) result = caseIdentifiableElement(initilalSubSuperState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUB_SUPER_STATE_REGION: {
				SubSuperStateRegion subSuperStateRegion = (SubSuperStateRegion)theEObject;
				T result = caseSubSuperStateRegion(subSuperStateRegion);
				if (result == null) result = caseContainer(subSuperStateRegion);
				if (result == null) result = caseModelElementContainer(subSuperStateRegion);
				if (result == null) result = caseNode(subSuperStateRegion);
				if (result == null) result = caseModelElement(subSuperStateRegion);
				if (result == null) result = caseIdentifiableElement(subSuperStateRegion);
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
			case ScchartPackage.SUB_SUPER_STATE_DECLARATION_NODE: {
				SubSuperStateDeclarationNode subSuperStateDeclarationNode = (SubSuperStateDeclarationNode)theEObject;
				T result = caseSubSuperStateDeclarationNode(subSuperStateDeclarationNode);
				if (result == null) result = caseNode(subSuperStateDeclarationNode);
				if (result == null) result = caseModelElement(subSuperStateDeclarationNode);
				if (result == null) result = caseIdentifiableElement(subSuperStateDeclarationNode);
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
				if (result == null) result = caseTransition(immediateTransition);
				if (result == null) result = caseEdge(immediateTransition);
				if (result == null) result = caseModelElement(immediateTransition);
				if (result == null) result = caseIdentifiableElement(immediateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.IMMEDIATE_TERMINATION_TRANSITION: {
				ImmediateTerminationTransition immediateTerminationTransition = (ImmediateTerminationTransition)theEObject;
				T result = caseImmediateTerminationTransition(immediateTerminationTransition);
				if (result == null) result = caseTransition(immediateTerminationTransition);
				if (result == null) result = caseEdge(immediateTerminationTransition);
				if (result == null) result = caseModelElement(immediateTerminationTransition);
				if (result == null) result = caseIdentifiableElement(immediateTerminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.WEAK_ABORT_TRANSITION: {
				WeakAbortTransition weakAbortTransition = (WeakAbortTransition)theEObject;
				T result = caseWeakAbortTransition(weakAbortTransition);
				if (result == null) result = caseTransition(weakAbortTransition);
				if (result == null) result = caseEdge(weakAbortTransition);
				if (result == null) result = caseModelElement(weakAbortTransition);
				if (result == null) result = caseIdentifiableElement(weakAbortTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.STRONG_ABORT_TRANSITION: {
				StrongAbortTransition strongAbortTransition = (StrongAbortTransition)theEObject;
				T result = caseStrongAbortTransition(strongAbortTransition);
				if (result == null) result = caseTransition(strongAbortTransition);
				if (result == null) result = caseEdge(strongAbortTransition);
				if (result == null) result = caseModelElement(strongAbortTransition);
				if (result == null) result = caseIdentifiableElement(strongAbortTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION: {
				WeakAbortTerminationTransition weakAbortTerminationTransition = (WeakAbortTerminationTransition)theEObject;
				T result = caseWeakAbortTerminationTransition(weakAbortTerminationTransition);
				if (result == null) result = caseTransition(weakAbortTerminationTransition);
				if (result == null) result = caseEdge(weakAbortTerminationTransition);
				if (result == null) result = caseModelElement(weakAbortTerminationTransition);
				if (result == null) result = caseIdentifiableElement(weakAbortTerminationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.DEFFERED_TRANSITION: {
				DefferedTransition defferedTransition = (DefferedTransition)theEObject;
				T result = caseDefferedTransition(defferedTransition);
				if (result == null) result = caseEdge(defferedTransition);
				if (result == null) result = caseModelElement(defferedTransition);
				if (result == null) result = caseIdentifiableElement(defferedTransition);
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
			case ScchartPackage.SUPER_STATE_DECLARATION: {
				SuperStateDeclaration superStateDeclaration = (SuperStateDeclaration)theEObject;
				T result = caseSuperStateDeclaration(superStateDeclaration);
				if (result == null) result = caseType(superStateDeclaration);
				if (result == null) result = caseIdentifiableElement(superStateDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScchartPackage.SUB_SUPER_STATE_DECLARATION: {
				SubSuperStateDeclaration subSuperStateDeclaration = (SubSuperStateDeclaration)theEObject;
				T result = caseSubSuperStateDeclaration(subSuperStateDeclaration);
				if (result == null) result = caseType(subSuperStateDeclaration);
				if (result == null) result = caseIdentifiableElement(subSuperStateDeclaration);
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
	public T caseSuperStateRegion(SuperStateRegion object) {
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
	public T caseSubSuperState(SubSuperState object) {
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
	public T caseInitilalSubSuperState(InitilalSubSuperState object) {
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
	public T caseSubSuperStateRegion(SubSuperStateRegion object) {
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
	public T caseSubSuperStateDeclarationNode(SubSuperStateDeclarationNode object) {
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
	public T caseImmediateTerminationTransition(ImmediateTerminationTransition object) {
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
	public T caseWeakAbortTransition(WeakAbortTransition object) {
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
	public T caseWeakAbortTerminationTransition(WeakAbortTerminationTransition object) {
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
	public T caseDefferedTransition(DefferedTransition object) {
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
	public T caseSubSuperStateDeclaration(SubSuperStateDeclaration object) {
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

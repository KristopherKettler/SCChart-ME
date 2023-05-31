/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.util;

import info.scce.cinco.product.scchart.mglid.scchart.views.*;

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
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage
 * @generated
 */
public class ViewsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsSwitch() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
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
			case ViewsPackage.ROOT_STATE_VIEW: {
				RootStateView rootStateView = (RootStateView)theEObject;
				T result = caseRootStateView(rootStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUPER_STATE_REGION_VIEW: {
				SuperStateRegionView superStateRegionView = (SuperStateRegionView)theEObject;
				T result = caseSuperStateRegionView(superStateRegionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUB_SUPER_STATE_VIEW: {
				SubSuperStateView subSuperStateView = (SubSuperStateView)theEObject;
				T result = caseSubSuperStateView(subSuperStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INITILAL_SUB_SUPER_STATE_VIEW: {
				InitilalSubSuperStateView initilalSubSuperStateView = (InitilalSubSuperStateView)theEObject;
				T result = caseInitilalSubSuperStateView(initilalSubSuperStateView);
				if (result == null) result = caseSubSuperStateView(initilalSubSuperStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUB_SUPER_STATE_REGION_VIEW: {
				SubSuperStateRegionView subSuperStateRegionView = (SubSuperStateRegionView)theEObject;
				T result = caseSubSuperStateRegionView(subSuperStateRegionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW: {
				SuperStateDeclarationNodeView superStateDeclarationNodeView = (SuperStateDeclarationNodeView)theEObject;
				T result = caseSuperStateDeclarationNodeView(superStateDeclarationNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW: {
				SubSuperStateDeclarationNodeView subSuperStateDeclarationNodeView = (SubSuperStateDeclarationNodeView)theEObject;
				T result = caseSubSuperStateDeclarationNodeView(subSuperStateDeclarationNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SIMPLE_STATE_VIEW: {
				SimpleStateView simpleStateView = (SimpleStateView)theEObject;
				T result = caseSimpleStateView(simpleStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.INITIAL_STATE_VIEW: {
				InitialStateView initialStateView = (InitialStateView)theEObject;
				T result = caseInitialStateView(initialStateView);
				if (result == null) result = caseSimpleStateView(initialStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.FINAL_STATE_VIEW: {
				FinalStateView finalStateView = (FinalStateView)theEObject;
				T result = caseFinalStateView(finalStateView);
				if (result == null) result = caseSimpleStateView(finalStateView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CONNECTOR_VIEW: {
				ConnectorView connectorView = (ConnectorView)theEObject;
				T result = caseConnectorView(connectorView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.TRANSITION_VIEW: {
				TransitionView transitionView = (TransitionView)theEObject;
				T result = caseTransitionView(transitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW: {
				ImmediateTransitionView immediateTransitionView = (ImmediateTransitionView)theEObject;
				T result = caseImmediateTransitionView(immediateTransitionView);
				if (result == null) result = caseTransitionView(immediateTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.IMMEDIATE_TERMINATION_TRANSITION_VIEW: {
				ImmediateTerminationTransitionView immediateTerminationTransitionView = (ImmediateTerminationTransitionView)theEObject;
				T result = caseImmediateTerminationTransitionView(immediateTerminationTransitionView);
				if (result == null) result = caseTransitionView(immediateTerminationTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.WEAK_ABORT_TRANSITION_VIEW: {
				WeakAbortTransitionView weakAbortTransitionView = (WeakAbortTransitionView)theEObject;
				T result = caseWeakAbortTransitionView(weakAbortTransitionView);
				if (result == null) result = caseTransitionView(weakAbortTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW: {
				StrongAbortTransitionView strongAbortTransitionView = (StrongAbortTransitionView)theEObject;
				T result = caseStrongAbortTransitionView(strongAbortTransitionView);
				if (result == null) result = caseTransitionView(strongAbortTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.WEAK_ABORT_TERMINATION_TRANSITION_VIEW: {
				WeakAbortTerminationTransitionView weakAbortTerminationTransitionView = (WeakAbortTerminationTransitionView)theEObject;
				T result = caseWeakAbortTerminationTransitionView(weakAbortTerminationTransitionView);
				if (result == null) result = caseTransitionView(weakAbortTerminationTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DEFFERED_TRANSITION_VIEW: {
				DefferedTransitionView defferedTransitionView = (DefferedTransitionView)theEObject;
				T result = caseDefferedTransitionView(defferedTransitionView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SC_CHART_VIEW: {
				SCChartView scChartView = (SCChartView)theEObject;
				T result = caseSCChartView(scChartView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW: {
				SuperStateDeclarationView superStateDeclarationView = (SuperStateDeclarationView)theEObject;
				T result = caseSuperStateDeclarationView(superStateDeclarationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW: {
				SubSuperStateDeclarationView subSuperStateDeclarationView = (SubSuperStateDeclarationView)theEObject;
				T result = caseSubSuperStateDeclarationView(subSuperStateDeclarationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootStateView(RootStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super State Region View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super State Region View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperStateRegionView(SuperStateRegionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Super State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Super State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSuperStateView(SubSuperStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initilal Sub Super State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initilal Sub Super State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitilalSubSuperStateView(InitilalSubSuperStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Super State Region View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Super State Region View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSuperStateRegionView(SubSuperStateRegionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super State Declaration Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super State Declaration Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperStateDeclarationNodeView(SuperStateDeclarationNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Super State Declaration Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Super State Declaration Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSuperStateDeclarationNodeView(SubSuperStateDeclarationNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleStateView(SimpleStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialStateView(InitialStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalStateView(FinalStateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorView(ConnectorView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionView(TransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateTransitionView(ImmediateTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immediate Termination Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immediate Termination Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmediateTerminationTransitionView(ImmediateTerminationTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weak Abort Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weak Abort Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeakAbortTransitionView(WeakAbortTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Abort Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Abort Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongAbortTransitionView(StrongAbortTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weak Abort Termination Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weak Abort Termination Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeakAbortTerminationTransitionView(WeakAbortTerminationTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deffered Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deffered Transition View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefferedTransitionView(DefferedTransitionView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SC Chart View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SC Chart View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCChartView(SCChartView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super State Declaration View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super State Declaration View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperStateDeclarationView(SuperStateDeclarationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Super State Declaration View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Super State Declaration View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSuperStateDeclarationView(SubSuperStateDeclarationView object) {
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

} //ViewsSwitch

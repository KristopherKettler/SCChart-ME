/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConditionalTerminationTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ConditionalTerminationTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Termination Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConditionalTerminationTransitionViewImpl#getInternalConditionalTerminationTransition <em>Internal Conditional Termination Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalTerminationTransitionViewImpl extends EObjectImpl implements ConditionalTerminationTransitionView {
	/**
	 * The cached value of the '{@link #getInternalConditionalTerminationTransition() <em>Internal Conditional Termination Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConditionalTerminationTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalConditionalTerminationTransition internalConditionalTerminationTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalTerminationTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CONDITIONAL_TERMINATION_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConditionalTerminationTransition getInternalConditionalTerminationTransition() {
		if (internalConditionalTerminationTransition != null && internalConditionalTerminationTransition.eIsProxy()) {
			InternalEObject oldInternalConditionalTerminationTransition = (InternalEObject)internalConditionalTerminationTransition;
			internalConditionalTerminationTransition = (InternalConditionalTerminationTransition)eResolveProxy(oldInternalConditionalTerminationTransition);
			if (internalConditionalTerminationTransition != oldInternalConditionalTerminationTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION, oldInternalConditionalTerminationTransition, internalConditionalTerminationTransition));
			}
		}
		return internalConditionalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConditionalTerminationTransition basicGetInternalConditionalTerminationTransition() {
		return internalConditionalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalConditionalTerminationTransition(InternalConditionalTerminationTransition newInternalConditionalTerminationTransition) {
		InternalConditionalTerminationTransition oldInternalConditionalTerminationTransition = internalConditionalTerminationTransition;
		internalConditionalTerminationTransition = newInternalConditionalTerminationTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION, oldInternalConditionalTerminationTransition, internalConditionalTerminationTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION:
				if (resolve) return getInternalConditionalTerminationTransition();
				return basicGetInternalConditionalTerminationTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION:
				setInternalConditionalTerminationTransition((InternalConditionalTerminationTransition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION:
				setInternalConditionalTerminationTransition((InternalConditionalTerminationTransition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.CONDITIONAL_TERMINATION_TRANSITION_VIEW__INTERNAL_CONDITIONAL_TERMINATION_TRANSITION:
				return internalConditionalTerminationTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalTerminationTransitionViewImpl
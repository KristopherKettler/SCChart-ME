/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTerminationTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;
import info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTerminationTransitionView;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Abort Termination Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTerminationTransitionViewImpl#getInternalWeakAbortTerminationTransition <em>Internal Weak Abort Termination Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeakAbortTerminationTransitionViewImpl extends EObjectImpl implements WeakAbortTerminationTransitionView {
	/**
	 * The cached value of the '{@link #getInternalWeakAbortTerminationTransition() <em>Internal Weak Abort Termination Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalWeakAbortTerminationTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalWeakAbortTerminationTransition internalWeakAbortTerminationTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeakAbortTerminationTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.WEAK_ABORT_TERMINATION_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalWeakAbortTerminationTransition getInternalWeakAbortTerminationTransition() {
		if (internalWeakAbortTerminationTransition != null && internalWeakAbortTerminationTransition.eIsProxy()) {
			InternalEObject oldInternalWeakAbortTerminationTransition = (InternalEObject)internalWeakAbortTerminationTransition;
			internalWeakAbortTerminationTransition = (InternalWeakAbortTerminationTransition)eResolveProxy(oldInternalWeakAbortTerminationTransition);
			if (internalWeakAbortTerminationTransition != oldInternalWeakAbortTerminationTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.WEAK_ABORT_TERMINATION_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION, oldInternalWeakAbortTerminationTransition, internalWeakAbortTerminationTransition));
			}
		}
		return internalWeakAbortTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalWeakAbortTerminationTransition basicGetInternalWeakAbortTerminationTransition() {
		return internalWeakAbortTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalWeakAbortTerminationTransition(InternalWeakAbortTerminationTransition newInternalWeakAbortTerminationTransition) {
		InternalWeakAbortTerminationTransition oldInternalWeakAbortTerminationTransition = internalWeakAbortTerminationTransition;
		internalWeakAbortTerminationTransition = newInternalWeakAbortTerminationTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.WEAK_ABORT_TERMINATION_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION, oldInternalWeakAbortTerminationTransition, internalWeakAbortTerminationTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.WEAK_ABORT_TERMINATION_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION:
				if (resolve) return getInternalWeakAbortTerminationTransition();
				return basicGetInternalWeakAbortTerminationTransition();
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
			case ViewsPackage.WEAK_ABORT_TERMINATION_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION:
				setInternalWeakAbortTerminationTransition((InternalWeakAbortTerminationTransition)newValue);
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
			case ViewsPackage.WEAK_ABORT_TERMINATION_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION:
				setInternalWeakAbortTerminationTransition((InternalWeakAbortTerminationTransition)null);
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
			case ViewsPackage.WEAK_ABORT_TERMINATION_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION:
				return internalWeakAbortTerminationTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //WeakAbortTerminationTransitionViewImpl

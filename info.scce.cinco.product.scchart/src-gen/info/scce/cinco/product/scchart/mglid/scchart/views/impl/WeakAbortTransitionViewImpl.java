/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;
import info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTransitionView;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Abort Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTransitionViewImpl#getInternalWeakAbortTransition <em>Internal Weak Abort Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeakAbortTransitionViewImpl extends EObjectImpl implements WeakAbortTransitionView {
	/**
	 * The cached value of the '{@link #getInternalWeakAbortTransition() <em>Internal Weak Abort Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalWeakAbortTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalWeakAbortTransition internalWeakAbortTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeakAbortTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.WEAK_ABORT_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalWeakAbortTransition getInternalWeakAbortTransition() {
		if (internalWeakAbortTransition != null && internalWeakAbortTransition.eIsProxy()) {
			InternalEObject oldInternalWeakAbortTransition = (InternalEObject)internalWeakAbortTransition;
			internalWeakAbortTransition = (InternalWeakAbortTransition)eResolveProxy(oldInternalWeakAbortTransition);
			if (internalWeakAbortTransition != oldInternalWeakAbortTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.WEAK_ABORT_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TRANSITION, oldInternalWeakAbortTransition, internalWeakAbortTransition));
			}
		}
		return internalWeakAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalWeakAbortTransition basicGetInternalWeakAbortTransition() {
		return internalWeakAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalWeakAbortTransition(InternalWeakAbortTransition newInternalWeakAbortTransition) {
		InternalWeakAbortTransition oldInternalWeakAbortTransition = internalWeakAbortTransition;
		internalWeakAbortTransition = newInternalWeakAbortTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.WEAK_ABORT_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TRANSITION, oldInternalWeakAbortTransition, internalWeakAbortTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.WEAK_ABORT_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TRANSITION:
				if (resolve) return getInternalWeakAbortTransition();
				return basicGetInternalWeakAbortTransition();
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
			case ViewsPackage.WEAK_ABORT_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TRANSITION:
				setInternalWeakAbortTransition((InternalWeakAbortTransition)newValue);
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
			case ViewsPackage.WEAK_ABORT_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TRANSITION:
				setInternalWeakAbortTransition((InternalWeakAbortTransition)null);
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
			case ViewsPackage.WEAK_ABORT_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TRANSITION:
				return internalWeakAbortTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //WeakAbortTransitionViewImpl

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strong Abort Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortTransitionViewImpl#getInternalStrongAbortTransition <em>Internal Strong Abort Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrongAbortTransitionViewImpl extends TransitionViewImpl implements StrongAbortTransitionView {
	/**
	 * The cached value of the '{@link #getInternalStrongAbortTransition() <em>Internal Strong Abort Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalStrongAbortTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalStrongAbortTransition internalStrongAbortTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongAbortTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.STRONG_ABORT_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortTransition getInternalStrongAbortTransition() {
		if (internalStrongAbortTransition != null && internalStrongAbortTransition.eIsProxy()) {
			InternalEObject oldInternalStrongAbortTransition = (InternalEObject)internalStrongAbortTransition;
			internalStrongAbortTransition = (InternalStrongAbortTransition)eResolveProxy(oldInternalStrongAbortTransition);
			if (internalStrongAbortTransition != oldInternalStrongAbortTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION, oldInternalStrongAbortTransition, internalStrongAbortTransition));
			}
		}
		return internalStrongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalStrongAbortTransition basicGetInternalStrongAbortTransition() {
		return internalStrongAbortTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalStrongAbortTransition(InternalStrongAbortTransition newInternalStrongAbortTransition) {
		InternalStrongAbortTransition oldInternalStrongAbortTransition = internalStrongAbortTransition;
		internalStrongAbortTransition = newInternalStrongAbortTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION, oldInternalStrongAbortTransition, internalStrongAbortTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION:
				if (resolve) return getInternalStrongAbortTransition();
				return basicGetInternalStrongAbortTransition();
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
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION:
				setInternalStrongAbortTransition((InternalStrongAbortTransition)newValue);
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
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION:
				setInternalStrongAbortTransition((InternalStrongAbortTransition)null);
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
			case ViewsPackage.STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION:
				return internalStrongAbortTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //StrongAbortTransitionViewImpl

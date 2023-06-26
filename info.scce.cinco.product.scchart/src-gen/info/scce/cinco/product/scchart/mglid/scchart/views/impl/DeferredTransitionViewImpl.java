/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredTransitionViewImpl#getInternalDeferredTransition <em>Internal Deferred Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeferredTransitionViewImpl extends EObjectImpl implements DeferredTransitionView {
	/**
	 * The cached value of the '{@link #getInternalDeferredTransition() <em>Internal Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDeferredTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalDeferredTransition internalDeferredTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeferredTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DEFERRED_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDeferredTransition getInternalDeferredTransition() {
		if (internalDeferredTransition != null && internalDeferredTransition.eIsProxy()) {
			InternalEObject oldInternalDeferredTransition = (InternalEObject)internalDeferredTransition;
			internalDeferredTransition = (InternalDeferredTransition)eResolveProxy(oldInternalDeferredTransition);
			if (internalDeferredTransition != oldInternalDeferredTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION, oldInternalDeferredTransition, internalDeferredTransition));
			}
		}
		return internalDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDeferredTransition basicGetInternalDeferredTransition() {
		return internalDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDeferredTransition(InternalDeferredTransition newInternalDeferredTransition) {
		InternalDeferredTransition oldInternalDeferredTransition = internalDeferredTransition;
		internalDeferredTransition = newInternalDeferredTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION, oldInternalDeferredTransition, internalDeferredTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION:
				if (resolve) return getInternalDeferredTransition();
				return basicGetInternalDeferredTransition();
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
			case ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION:
				setInternalDeferredTransition((InternalDeferredTransition)newValue);
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
			case ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION:
				setInternalDeferredTransition((InternalDeferredTransition)null);
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
			case ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION:
				return internalDeferredTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //DeferredTransitionViewImpl

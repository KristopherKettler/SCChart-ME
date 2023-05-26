/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDefferedTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.DefferedTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deffered Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DefferedTransitionViewImpl#getInternalDefferedTransition <em>Internal Deffered Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefferedTransitionViewImpl extends EObjectImpl implements DefferedTransitionView {
	/**
	 * The cached value of the '{@link #getInternalDefferedTransition() <em>Internal Deffered Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDefferedTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalDefferedTransition internalDefferedTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefferedTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DEFFERED_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDefferedTransition getInternalDefferedTransition() {
		if (internalDefferedTransition != null && internalDefferedTransition.eIsProxy()) {
			InternalEObject oldInternalDefferedTransition = (InternalEObject)internalDefferedTransition;
			internalDefferedTransition = (InternalDefferedTransition)eResolveProxy(oldInternalDefferedTransition);
			if (internalDefferedTransition != oldInternalDefferedTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DEFFERED_TRANSITION_VIEW__INTERNAL_DEFFERED_TRANSITION, oldInternalDefferedTransition, internalDefferedTransition));
			}
		}
		return internalDefferedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDefferedTransition basicGetInternalDefferedTransition() {
		return internalDefferedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDefferedTransition(InternalDefferedTransition newInternalDefferedTransition) {
		InternalDefferedTransition oldInternalDefferedTransition = internalDefferedTransition;
		internalDefferedTransition = newInternalDefferedTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DEFFERED_TRANSITION_VIEW__INTERNAL_DEFFERED_TRANSITION, oldInternalDefferedTransition, internalDefferedTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.DEFFERED_TRANSITION_VIEW__INTERNAL_DEFFERED_TRANSITION:
				if (resolve) return getInternalDefferedTransition();
				return basicGetInternalDefferedTransition();
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
			case ViewsPackage.DEFFERED_TRANSITION_VIEW__INTERNAL_DEFFERED_TRANSITION:
				setInternalDefferedTransition((InternalDefferedTransition)newValue);
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
			case ViewsPackage.DEFFERED_TRANSITION_VIEW__INTERNAL_DEFFERED_TRANSITION:
				setInternalDefferedTransition((InternalDefferedTransition)null);
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
			case ViewsPackage.DEFFERED_TRANSITION_VIEW__INTERNAL_DEFFERED_TRANSITION:
				return internalDefferedTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //DefferedTransitionViewImpl

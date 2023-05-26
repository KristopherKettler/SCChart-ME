/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.InitilalSubSuperStateView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initilal Sub Super State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitilalSubSuperStateViewImpl#getInternalInitilalSubSuperState <em>Internal Initilal Sub Super State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitilalSubSuperStateViewImpl extends SubSuperStateViewImpl implements InitilalSubSuperStateView {
	/**
	 * The cached value of the '{@link #getInternalInitilalSubSuperState() <em>Internal Initilal Sub Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInitilalSubSuperState()
	 * @generated
	 * @ordered
	 */
	protected InternalInitilalSubSuperState internalInitilalSubSuperState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitilalSubSuperStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.INITILAL_SUB_SUPER_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitilalSubSuperState getInternalInitilalSubSuperState() {
		if (internalInitilalSubSuperState != null && internalInitilalSubSuperState.eIsProxy()) {
			InternalEObject oldInternalInitilalSubSuperState = (InternalEObject)internalInitilalSubSuperState;
			internalInitilalSubSuperState = (InternalInitilalSubSuperState)eResolveProxy(oldInternalInitilalSubSuperState);
			if (internalInitilalSubSuperState != oldInternalInitilalSubSuperState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.INITILAL_SUB_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUB_SUPER_STATE, oldInternalInitilalSubSuperState, internalInitilalSubSuperState));
			}
		}
		return internalInitilalSubSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalInitilalSubSuperState basicGetInternalInitilalSubSuperState() {
		return internalInitilalSubSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalInitilalSubSuperState(InternalInitilalSubSuperState newInternalInitilalSubSuperState) {
		InternalInitilalSubSuperState oldInternalInitilalSubSuperState = internalInitilalSubSuperState;
		internalInitilalSubSuperState = newInternalInitilalSubSuperState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.INITILAL_SUB_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUB_SUPER_STATE, oldInternalInitilalSubSuperState, internalInitilalSubSuperState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.INITILAL_SUB_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUB_SUPER_STATE:
				if (resolve) return getInternalInitilalSubSuperState();
				return basicGetInternalInitilalSubSuperState();
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
			case ViewsPackage.INITILAL_SUB_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUB_SUPER_STATE:
				setInternalInitilalSubSuperState((InternalInitilalSubSuperState)newValue);
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
			case ViewsPackage.INITILAL_SUB_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUB_SUPER_STATE:
				setInternalInitilalSubSuperState((InternalInitilalSubSuperState)null);
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
			case ViewsPackage.INITILAL_SUB_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUB_SUPER_STATE:
				return internalInitilalSubSuperState != null;
		}
		return super.eIsSet(featureID);
	}

} //InitilalSubSuperStateViewImpl

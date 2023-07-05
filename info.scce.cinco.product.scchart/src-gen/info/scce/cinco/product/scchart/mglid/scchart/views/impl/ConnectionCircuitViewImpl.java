/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnectionCircuit;

import info.scce.cinco.product.scchart.mglid.scchart.views.ConnectionCircuitView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Circuit View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectionCircuitViewImpl#getInternalConnectionCircuit <em>Internal Connection Circuit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionCircuitViewImpl extends EObjectImpl implements ConnectionCircuitView {
	/**
	 * The cached value of the '{@link #getInternalConnectionCircuit() <em>Internal Connection Circuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConnectionCircuit()
	 * @generated
	 * @ordered
	 */
	protected InternalConnectionCircuit internalConnectionCircuit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionCircuitViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CONNECTION_CIRCUIT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalConnectionCircuit getInternalConnectionCircuit() {
		if (internalConnectionCircuit != null && internalConnectionCircuit.eIsProxy()) {
			InternalEObject oldInternalConnectionCircuit = (InternalEObject)internalConnectionCircuit;
			internalConnectionCircuit = (InternalConnectionCircuit)eResolveProxy(oldInternalConnectionCircuit);
			if (internalConnectionCircuit != oldInternalConnectionCircuit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CONNECTION_CIRCUIT_VIEW__INTERNAL_CONNECTION_CIRCUIT, oldInternalConnectionCircuit, internalConnectionCircuit));
			}
		}
		return internalConnectionCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConnectionCircuit basicGetInternalConnectionCircuit() {
		return internalConnectionCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalConnectionCircuit(InternalConnectionCircuit newInternalConnectionCircuit) {
		InternalConnectionCircuit oldInternalConnectionCircuit = internalConnectionCircuit;
		internalConnectionCircuit = newInternalConnectionCircuit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CONNECTION_CIRCUIT_VIEW__INTERNAL_CONNECTION_CIRCUIT, oldInternalConnectionCircuit, internalConnectionCircuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CONNECTION_CIRCUIT_VIEW__INTERNAL_CONNECTION_CIRCUIT:
				if (resolve) return getInternalConnectionCircuit();
				return basicGetInternalConnectionCircuit();
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
			case ViewsPackage.CONNECTION_CIRCUIT_VIEW__INTERNAL_CONNECTION_CIRCUIT:
				setInternalConnectionCircuit((InternalConnectionCircuit)newValue);
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
			case ViewsPackage.CONNECTION_CIRCUIT_VIEW__INTERNAL_CONNECTION_CIRCUIT:
				setInternalConnectionCircuit((InternalConnectionCircuit)null);
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
			case ViewsPackage.CONNECTION_CIRCUIT_VIEW__INTERNAL_CONNECTION_CIRCUIT:
				return internalConnectionCircuit != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionCircuitViewImpl

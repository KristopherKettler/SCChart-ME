/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateRegionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super State Region View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateRegionViewImpl#getInternalSuperStateRegion <em>Internal Super State Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperStateRegionViewImpl extends EObjectImpl implements SuperStateRegionView {
	/**
	 * The cached value of the '{@link #getInternalSuperStateRegion() <em>Internal Super State Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSuperStateRegion()
	 * @generated
	 * @ordered
	 */
	protected InternalSuperStateRegion internalSuperStateRegion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperStateRegionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUPER_STATE_REGION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperStateRegion getInternalSuperStateRegion() {
		if (internalSuperStateRegion != null && internalSuperStateRegion.eIsProxy()) {
			InternalEObject oldInternalSuperStateRegion = (InternalEObject)internalSuperStateRegion;
			internalSuperStateRegion = (InternalSuperStateRegion)eResolveProxy(oldInternalSuperStateRegion);
			if (internalSuperStateRegion != oldInternalSuperStateRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUPER_STATE_REGION_VIEW__INTERNAL_SUPER_STATE_REGION, oldInternalSuperStateRegion, internalSuperStateRegion));
			}
		}
		return internalSuperStateRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSuperStateRegion basicGetInternalSuperStateRegion() {
		return internalSuperStateRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSuperStateRegion(InternalSuperStateRegion newInternalSuperStateRegion) {
		InternalSuperStateRegion oldInternalSuperStateRegion = internalSuperStateRegion;
		internalSuperStateRegion = newInternalSuperStateRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUPER_STATE_REGION_VIEW__INTERNAL_SUPER_STATE_REGION, oldInternalSuperStateRegion, internalSuperStateRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalSuperStateRegion().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalSuperStateRegion().getElement().transact("Set Label", () -> {
			getInternalSuperStateRegion().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegionID() {
		return getInternalSuperStateRegion().getRegionID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegionID(final String _arg) {
		getInternalSuperStateRegion().getElement().transact("Set RegionID", () -> {
			getInternalSuperStateRegion().setRegionID(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.SUPER_STATE_REGION_VIEW__INTERNAL_SUPER_STATE_REGION:
				if (resolve) return getInternalSuperStateRegion();
				return basicGetInternalSuperStateRegion();
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
			case ViewsPackage.SUPER_STATE_REGION_VIEW__INTERNAL_SUPER_STATE_REGION:
				setInternalSuperStateRegion((InternalSuperStateRegion)newValue);
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
			case ViewsPackage.SUPER_STATE_REGION_VIEW__INTERNAL_SUPER_STATE_REGION:
				setInternalSuperStateRegion((InternalSuperStateRegion)null);
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
			case ViewsPackage.SUPER_STATE_REGION_VIEW__INTERNAL_SUPER_STATE_REGION:
				return internalSuperStateRegion != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.SUPER_STATE_REGION_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.SUPER_STATE_REGION_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_REGION_VIEW___GET_REGION_ID:
				return getRegionID();
			case ViewsPackage.SUPER_STATE_REGION_VIEW___SET_REGION_ID__STRING:
				setRegionID((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuperStateRegionViewImpl

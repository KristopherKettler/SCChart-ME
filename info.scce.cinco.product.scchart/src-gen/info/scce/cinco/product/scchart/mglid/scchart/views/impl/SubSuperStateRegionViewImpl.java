/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion;

import info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateRegionView;
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
 * An implementation of the model object '<em><b>Sub Super State Region View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SubSuperStateRegionViewImpl#getInternalSubSuperStateRegion <em>Internal Sub Super State Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSuperStateRegionViewImpl extends EObjectImpl implements SubSuperStateRegionView {
	/**
	 * The cached value of the '{@link #getInternalSubSuperStateRegion() <em>Internal Sub Super State Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSubSuperStateRegion()
	 * @generated
	 * @ordered
	 */
	protected InternalSubSuperStateRegion internalSubSuperStateRegion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSuperStateRegionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUB_SUPER_STATE_REGION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSubSuperStateRegion getInternalSubSuperStateRegion() {
		if (internalSubSuperStateRegion != null && internalSubSuperStateRegion.eIsProxy()) {
			InternalEObject oldInternalSubSuperStateRegion = (InternalEObject)internalSubSuperStateRegion;
			internalSubSuperStateRegion = (InternalSubSuperStateRegion)eResolveProxy(oldInternalSubSuperStateRegion);
			if (internalSubSuperStateRegion != oldInternalSubSuperStateRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUB_SUPER_STATE_REGION_VIEW__INTERNAL_SUB_SUPER_STATE_REGION, oldInternalSubSuperStateRegion, internalSubSuperStateRegion));
			}
		}
		return internalSubSuperStateRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSubSuperStateRegion basicGetInternalSubSuperStateRegion() {
		return internalSubSuperStateRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSubSuperStateRegion(InternalSubSuperStateRegion newInternalSubSuperStateRegion) {
		InternalSubSuperStateRegion oldInternalSubSuperStateRegion = internalSubSuperStateRegion;
		internalSubSuperStateRegion = newInternalSubSuperStateRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUB_SUPER_STATE_REGION_VIEW__INTERNAL_SUB_SUPER_STATE_REGION, oldInternalSubSuperStateRegion, internalSubSuperStateRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegionID() {
		return getInternalSubSuperStateRegion().getRegionID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegionID(final String _arg) {
		getInternalSubSuperStateRegion().getElement().transact("Set RegionID", () -> {
			getInternalSubSuperStateRegion().setRegionID(_arg);
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
			case ViewsPackage.SUB_SUPER_STATE_REGION_VIEW__INTERNAL_SUB_SUPER_STATE_REGION:
				if (resolve) return getInternalSubSuperStateRegion();
				return basicGetInternalSubSuperStateRegion();
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
			case ViewsPackage.SUB_SUPER_STATE_REGION_VIEW__INTERNAL_SUB_SUPER_STATE_REGION:
				setInternalSubSuperStateRegion((InternalSubSuperStateRegion)newValue);
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
			case ViewsPackage.SUB_SUPER_STATE_REGION_VIEW__INTERNAL_SUB_SUPER_STATE_REGION:
				setInternalSubSuperStateRegion((InternalSubSuperStateRegion)null);
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
			case ViewsPackage.SUB_SUPER_STATE_REGION_VIEW__INTERNAL_SUB_SUPER_STATE_REGION:
				return internalSubSuperStateRegion != null;
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
			case ViewsPackage.SUB_SUPER_STATE_REGION_VIEW___GET_REGION_ID:
				return getRegionID();
			case ViewsPackage.SUB_SUPER_STATE_REGION_VIEW___SET_REGION_ID__STRING:
				setRegionID((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SubSuperStateRegionViewImpl

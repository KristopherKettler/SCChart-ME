/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalModelElementContainer;

import graphmodel.internal.impl.InternalContainerImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Super State Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateRegionImpl#getRegionID <em>Region ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalSubSuperStateRegionImpl extends InternalContainerImpl implements InternalSubSuperStateRegion {
	/**
	 * The default value of the '{@link #getRegionID() <em>Region ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionID()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_ID_EDEFAULT = "<insert name>";

	/**
	 * The cached value of the '{@link #getRegionID() <em>Region ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionID()
	 * @generated
	 * @ordered
	 */
	protected String regionID = REGION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalSubSuperStateRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_SUB_SUPER_STATE_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegionID() {
		return regionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegionID(String newRegionID) {
		String oldRegionID = regionID;
		regionID = newRegionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SUB_SUPER_STATE_REGION__REGION_ID, oldRegionID, regionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainmentConstraint> getContainmentConstraints() {
		 org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>constraints =
			new org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>();
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.mglid.scchart.RootState.class,info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion.class,info.scce.cinco.product.scchart.mglid.scchart.SubSuperState.class,info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState.class,info.scce.cinco.product.scchart.mglid.scchart.SubSuperStateRegion.class,info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode.class,info.scce.cinco.product.scchart.mglid.scchart.SubSuperStateDeclarationNode.class,info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class,info.scce.cinco.product.scchart.mglid.scchart.InitialState.class,info.scce.cinco.product.scchart.mglid.scchart.FinalState.class,info.scce.cinco.product.scchart.mglid.scchart.Connector.class));
		return constraints;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SUB_SUPER_STATE_REGION__REGION_ID:
				return getRegionID();
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
			case InternalPackage.INTERNAL_SUB_SUPER_STATE_REGION__REGION_ID:
				setRegionID((String)newValue);
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
			case InternalPackage.INTERNAL_SUB_SUPER_STATE_REGION__REGION_ID:
				setRegionID(REGION_ID_EDEFAULT);
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
			case InternalPackage.INTERNAL_SUB_SUPER_STATE_REGION__REGION_ID:
				return REGION_ID_EDEFAULT == null ? regionID != null : !REGION_ID_EDEFAULT.equals(regionID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SUB_SUPER_STATE_REGION___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SUB_SUPER_STATE_REGION___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InternalPackage.INTERNAL_SUB_SUPER_STATE_REGION___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (RegionID: ");
		result.append(regionID);
		result.append(')');
		return result.toString();
	}

} //InternalSubSuperStateRegionImpl

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import graphmodel.internal.impl.InternalNodeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalAction;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalActionImpl#getActionType <em>Action Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalActionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalActionImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalActionImpl extends InternalNodeImpl implements InternalAction {
	/**
	 * The default value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_TYPE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected String actionType = ACTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionType() {
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionType(String newActionType) {
		String oldActionType = actionType;
		actionType = newActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_ACTION__ACTION_TYPE, oldActionType, actionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_ACTION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_ACTION__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_ACTION__ACTION_TYPE:
				return getActionType();
			case InternalPackage.INTERNAL_ACTION__CONDITION:
				return getCondition();
			case InternalPackage.INTERNAL_ACTION__EFFECT:
				return getEffect();
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
			case InternalPackage.INTERNAL_ACTION__ACTION_TYPE:
				setActionType((String)newValue);
				return;
			case InternalPackage.INTERNAL_ACTION__CONDITION:
				setCondition((String)newValue);
				return;
			case InternalPackage.INTERNAL_ACTION__EFFECT:
				setEffect((String)newValue);
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
			case InternalPackage.INTERNAL_ACTION__ACTION_TYPE:
				setActionType(ACTION_TYPE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_ACTION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
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
			case InternalPackage.INTERNAL_ACTION__ACTION_TYPE:
				return ACTION_TYPE_EDEFAULT == null ? actionType != null : !ACTION_TYPE_EDEFAULT.equals(actionType);
			case InternalPackage.INTERNAL_ACTION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case InternalPackage.INTERNAL_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
		}
		return super.eIsSet(featureID);
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
		result.append(" (actionType: ");
		result.append(actionType);
		result.append(", condition: ");
		result.append(condition);
		result.append(", effect: ");
		result.append(effect);
		result.append(')');
		return result.toString();
	}

} //InternalActionImpl

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateStrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Strong Abort Deferred Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateStrongAbortDeferredTransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateStrongAbortDeferredTransitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateStrongAbortDeferredTransitionImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalImmediateStrongAbortDeferredTransitionImpl extends InternalAbstractTransitionImpl implements InternalImmediateStrongAbortDeferredTransition {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = "<No condition>";

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
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_EDEFAULT = "<No count delay>";

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected String delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = "<No effect>";

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
	protected InternalImmediateStrongAbortDeferredTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay(String newDelay) {
		String oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__DELAY, oldDelay, delay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__CONDITION:
				return getCondition();
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__DELAY:
				return getDelay();
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT:
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
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__CONDITION:
				setCondition((String)newValue);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__DELAY:
				setDelay((String)newValue);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT:
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
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT:
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
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__DELAY:
				return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
			case InternalPackage.INTERNAL_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__EFFECT:
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", delay: ");
		result.append(delay);
		result.append(", effect: ");
		result.append(effect);
		result.append(')');
		return result.toString();
	}

} //InternalImmediateStrongAbortDeferredTransitionImpl

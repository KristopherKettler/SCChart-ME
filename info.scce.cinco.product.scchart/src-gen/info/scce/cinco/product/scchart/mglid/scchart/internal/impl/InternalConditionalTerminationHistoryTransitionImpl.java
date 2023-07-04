/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConditionalTerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Termination History Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConditionalTerminationHistoryTransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConditionalTerminationHistoryTransitionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConditionalTerminationHistoryTransitionImpl#isDeepHistory <em>Deep History</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConditionalTerminationHistoryTransitionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConditionalTerminationHistoryTransitionImpl#getH <em>H</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalConditionalTerminationHistoryTransitionImpl extends InternalAbstractTransitionImpl implements InternalConditionalTerminationHistoryTransition {
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
	 * The default value of the '{@link #isDeepHistory() <em>Deep History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeepHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEEP_HISTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeepHistory() <em>Deep History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeepHistory()
	 * @generated
	 * @ordered
	 */
	protected boolean deepHistory = DEEP_HISTORY_EDEFAULT;

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
	 * The default value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected static final String H_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected String h = H_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalConditionalTerminationHistoryTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return deepHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(boolean newDeepHistory) {
		boolean oldDeepHistory = deepHistory;
		deepHistory = newDeepHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY, oldDeepHistory, deepHistory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getH() {
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH(String newH) {
		String oldH = h;
		h = newH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__H, oldH, h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__CONDITION:
				return getCondition();
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DELAY:
				return getDelay();
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY:
				return isDeepHistory();
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__EFFECT:
				return getEffect();
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__H:
				return getH();
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
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__CONDITION:
				setCondition((String)newValue);
				return;
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DELAY:
				setDelay((String)newValue);
				return;
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY:
				setDeepHistory((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__EFFECT:
				setEffect((String)newValue);
				return;
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__H:
				setH((String)newValue);
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
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY:
				setDeepHistory(DEEP_HISTORY_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__H:
				setH(H_EDEFAULT);
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
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DELAY:
				return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__DEEP_HISTORY:
				return deepHistory != DEEP_HISTORY_EDEFAULT;
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case InternalPackage.INTERNAL_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__H:
				return H_EDEFAULT == null ? h != null : !H_EDEFAULT.equals(h);
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
		result.append(", deepHistory: ");
		result.append(deepHistory);
		result.append(", effect: ");
		result.append(effect);
		result.append(", H: ");
		result.append(h);
		result.append(')');
		return result.toString();
	}

} //InternalConditionalTerminationHistoryTransitionImpl

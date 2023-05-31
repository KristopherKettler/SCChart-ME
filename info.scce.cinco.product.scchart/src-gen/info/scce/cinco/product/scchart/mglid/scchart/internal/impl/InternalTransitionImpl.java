/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import graphmodel.internal.impl.InternalEdgeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl#isStrong_Abort <em>Strong Abort</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl#isImmediate_transition <em>Immediate transition</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl#isTermination <em>Termination</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl#isHistory <em>History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalTransitionImpl extends InternalEdgeImpl implements InternalTransition {
	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected String trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrong_Abort() <em>Strong Abort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrong_Abort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRONG_ABORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrong_Abort() <em>Strong Abort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrong_Abort()
	 * @generated
	 * @ordered
	 */
	protected boolean strong_Abort = STRONG_ABORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isImmediate_transition() <em>Immediate transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmediate_transition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMMEDIATE_TRANSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImmediate_transition() <em>Immediate transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmediate_transition()
	 * @generated
	 * @ordered
	 */
	protected boolean immediate_transition = IMMEDIATE_TRANSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTermination() <em>Termination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTermination()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TERMINATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTermination() <em>Termination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTermination()
	 * @generated
	 * @ordered
	 */
	protected boolean termination = TERMINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HISTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistory()
	 * @generated
	 * @ordered
	 */
	protected boolean history = HISTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_TRANSITION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(String newTrigger) {
		String oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_TRANSITION__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStrong_Abort() {
		return strong_Abort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrong_Abort(boolean newStrong_Abort) {
		boolean oldStrong_Abort = strong_Abort;
		strong_Abort = newStrong_Abort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_TRANSITION__STRONG_ABORT, oldStrong_Abort, strong_Abort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_TRANSITION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImmediate_transition() {
		return immediate_transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmediate_transition(boolean newImmediate_transition) {
		boolean oldImmediate_transition = immediate_transition;
		immediate_transition = newImmediate_transition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_TRANSITION__IMMEDIATE_TRANSITION, oldImmediate_transition, immediate_transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTermination() {
		return termination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermination(boolean newTermination) {
		boolean oldTermination = termination;
		termination = newTermination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_TRANSITION__TERMINATION, oldTermination, termination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistory(boolean newHistory) {
		boolean oldHistory = history;
		history = newHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_TRANSITION__HISTORY, oldHistory, history));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_TRANSITION__ACTION:
				return getAction();
			case InternalPackage.INTERNAL_TRANSITION__TRIGGER:
				return getTrigger();
			case InternalPackage.INTERNAL_TRANSITION__STRONG_ABORT:
				return isStrong_Abort();
			case InternalPackage.INTERNAL_TRANSITION__PRIORITY:
				return getPriority();
			case InternalPackage.INTERNAL_TRANSITION__IMMEDIATE_TRANSITION:
				return isImmediate_transition();
			case InternalPackage.INTERNAL_TRANSITION__TERMINATION:
				return isTermination();
			case InternalPackage.INTERNAL_TRANSITION__HISTORY:
				return isHistory();
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
			case InternalPackage.INTERNAL_TRANSITION__ACTION:
				setAction((String)newValue);
				return;
			case InternalPackage.INTERNAL_TRANSITION__TRIGGER:
				setTrigger((String)newValue);
				return;
			case InternalPackage.INTERNAL_TRANSITION__STRONG_ABORT:
				setStrong_Abort((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_TRANSITION__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_TRANSITION__IMMEDIATE_TRANSITION:
				setImmediate_transition((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_TRANSITION__TERMINATION:
				setTermination((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_TRANSITION__HISTORY:
				setHistory((Boolean)newValue);
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
			case InternalPackage.INTERNAL_TRANSITION__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_TRANSITION__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_TRANSITION__STRONG_ABORT:
				setStrong_Abort(STRONG_ABORT_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_TRANSITION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_TRANSITION__IMMEDIATE_TRANSITION:
				setImmediate_transition(IMMEDIATE_TRANSITION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_TRANSITION__TERMINATION:
				setTermination(TERMINATION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_TRANSITION__HISTORY:
				setHistory(HISTORY_EDEFAULT);
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
			case InternalPackage.INTERNAL_TRANSITION__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case InternalPackage.INTERNAL_TRANSITION__TRIGGER:
				return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
			case InternalPackage.INTERNAL_TRANSITION__STRONG_ABORT:
				return strong_Abort != STRONG_ABORT_EDEFAULT;
			case InternalPackage.INTERNAL_TRANSITION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case InternalPackage.INTERNAL_TRANSITION__IMMEDIATE_TRANSITION:
				return immediate_transition != IMMEDIATE_TRANSITION_EDEFAULT;
			case InternalPackage.INTERNAL_TRANSITION__TERMINATION:
				return termination != TERMINATION_EDEFAULT;
			case InternalPackage.INTERNAL_TRANSITION__HISTORY:
				return history != HISTORY_EDEFAULT;
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
		result.append(" (Action: ");
		result.append(action);
		result.append(", Trigger: ");
		result.append(trigger);
		result.append(", Strong_Abort: ");
		result.append(strong_Abort);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", Immediate_transition: ");
		result.append(immediate_transition);
		result.append(", Termination: ");
		result.append(termination);
		result.append(", History: ");
		result.append(history);
		result.append(')');
		return result.toString();
	}

} //InternalTransitionImpl

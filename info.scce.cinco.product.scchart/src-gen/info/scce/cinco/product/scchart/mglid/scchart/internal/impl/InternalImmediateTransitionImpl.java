/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import graphmodel.internal.impl.InternalEdgeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTransitionImpl#getDsderminat <em>Dsderminat</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTransitionImpl#isHistory <em>History</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTransitionImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalImmediateTransitionImpl extends InternalEdgeImpl implements InternalImmediateTransition {
	/**
	 * The default value of the '{@link #getDsderminat() <em>Dsderminat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsderminat()
	 * @generated
	 * @ordered
	 */
	protected static final int DSDERMINAT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getDsderminat() <em>Dsderminat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsderminat()
	 * @generated
	 * @ordered
	 */
	protected int dsderminat = DSDERMINAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "wqwq";

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalImmediateTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_IMMEDIATE_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDsderminat() {
		return dsderminat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDsderminat(int newDsderminat) {
		int oldDsderminat = dsderminat;
		dsderminat = newDsderminat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__DSDERMINAT, oldDsderminat, dsderminat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__HISTORY, oldHistory, history));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__DSDERMINAT:
				return getDsderminat();
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__LABEL:
				return getLabel();
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__HISTORY:
				return isHistory();
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__PRIORITY:
				return getPriority();
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
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__DSDERMINAT:
				setDsderminat((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__HISTORY:
				setHistory((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__PRIORITY:
				setPriority((Integer)newValue);
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
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__DSDERMINAT:
				setDsderminat(DSDERMINAT_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__HISTORY:
				setHistory(HISTORY_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__DSDERMINAT:
				return dsderminat != DSDERMINAT_EDEFAULT;
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__HISTORY:
				return history != HISTORY_EDEFAULT;
			case InternalPackage.INTERNAL_IMMEDIATE_TRANSITION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(" (dsderminat: ");
		result.append(dsderminat);
		result.append(", label: ");
		result.append(label);
		result.append(", history: ");
		result.append(history);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //InternalImmediateTransitionImpl

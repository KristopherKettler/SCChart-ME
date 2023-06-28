/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import graphmodel.internal.impl.InternalEdgeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalHistoryTransitionImpl#isDeepHistory <em>Deep History</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalHistoryTransitionImpl#getH <em>H</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalHistoryTransitionImpl extends InternalEdgeImpl implements InternalHistoryTransition {
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
	 * The default value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected static final String H_EDEFAULT = "H";

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
	protected InternalHistoryTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_HISTORY_TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_HISTORY_TRANSITION__DEEP_HISTORY, oldDeepHistory, deepHistory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_HISTORY_TRANSITION__H, oldH, h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_HISTORY_TRANSITION__DEEP_HISTORY:
				return isDeepHistory();
			case InternalPackage.INTERNAL_HISTORY_TRANSITION__H:
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
			case InternalPackage.INTERNAL_HISTORY_TRANSITION__DEEP_HISTORY:
				setDeepHistory((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_HISTORY_TRANSITION__H:
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
			case InternalPackage.INTERNAL_HISTORY_TRANSITION__DEEP_HISTORY:
				setDeepHistory(DEEP_HISTORY_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_HISTORY_TRANSITION__H:
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
			case InternalPackage.INTERNAL_HISTORY_TRANSITION__DEEP_HISTORY:
				return deepHistory != DEEP_HISTORY_EDEFAULT;
			case InternalPackage.INTERNAL_HISTORY_TRANSITION__H:
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
		result.append(" (deepHistory: ");
		result.append(deepHistory);
		result.append(", H: ");
		result.append(h);
		result.append(')');
		return result.toString();
	}

} //InternalHistoryTransitionImpl

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateHistoryTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateHistoryTransitionView;
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
 * An implementation of the model object '<em><b>Immediate History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateHistoryTransitionViewImpl#getInternalImmediateHistoryTransition <em>Internal Immediate History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmediateHistoryTransitionViewImpl extends EObjectImpl implements ImmediateHistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalImmediateHistoryTransition() <em>Internal Immediate History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalImmediateHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalImmediateHistoryTransition internalImmediateHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateHistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.IMMEDIATE_HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateHistoryTransition getInternalImmediateHistoryTransition() {
		if (internalImmediateHistoryTransition != null && internalImmediateHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalImmediateHistoryTransition = (InternalEObject)internalImmediateHistoryTransition;
			internalImmediateHistoryTransition = (InternalImmediateHistoryTransition)eResolveProxy(oldInternalImmediateHistoryTransition);
			if (internalImmediateHistoryTransition != oldInternalImmediateHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_HISTORY_TRANSITION, oldInternalImmediateHistoryTransition, internalImmediateHistoryTransition));
			}
		}
		return internalImmediateHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalImmediateHistoryTransition basicGetInternalImmediateHistoryTransition() {
		return internalImmediateHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalImmediateHistoryTransition(InternalImmediateHistoryTransition newInternalImmediateHistoryTransition) {
		InternalImmediateHistoryTransition oldInternalImmediateHistoryTransition = internalImmediateHistoryTransition;
		internalImmediateHistoryTransition = newInternalImmediateHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_HISTORY_TRANSITION, oldInternalImmediateHistoryTransition, internalImmediateHistoryTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalImmediateHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalImmediateHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalImmediateHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelay() {
		return getInternalImmediateHistoryTransition().getDelay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay(final String _arg) {
		getInternalImmediateHistoryTransition().getElement().transact("Set Delay", () -> {
			getInternalImmediateHistoryTransition().setDelay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalImmediateHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalImmediateHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalImmediateHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalImmediateHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalImmediateHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalImmediateHistoryTransition().setEffect(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getH() {
		return getInternalImmediateHistoryTransition().getH();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH(final String _arg) {
		getInternalImmediateHistoryTransition().getElement().transact("Set H", () -> {
			getInternalImmediateHistoryTransition().setH(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return getInternalImmediateHistoryTransition().getPriority();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(final String _arg) {
		getInternalImmediateHistoryTransition().getElement().transact("Set Priority", () -> {
			getInternalImmediateHistoryTransition().setPriority(_arg);
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
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_HISTORY_TRANSITION:
				if (resolve) return getInternalImmediateHistoryTransition();
				return basicGetInternalImmediateHistoryTransition();
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
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_HISTORY_TRANSITION:
				setInternalImmediateHistoryTransition((InternalImmediateHistoryTransition)newValue);
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
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_HISTORY_TRANSITION:
				setInternalImmediateHistoryTransition((InternalImmediateHistoryTransition)null);
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
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW__INTERNAL_IMMEDIATE_HISTORY_TRANSITION:
				return internalImmediateHistoryTransition != null;
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
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_DELAY:
				return getDelay();
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_DELAY__STRING:
				setDelay((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_H:
				return getH();
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_H__STRING:
				setH((String)arguments.get(0));
				return null;
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___GET_PRIORITY:
				return getPriority();
			case ViewsPackage.IMMEDIATE_HISTORY_TRANSITION_VIEW___SET_PRIORITY__STRING:
				setPriority((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImmediateHistoryTransitionViewImpl

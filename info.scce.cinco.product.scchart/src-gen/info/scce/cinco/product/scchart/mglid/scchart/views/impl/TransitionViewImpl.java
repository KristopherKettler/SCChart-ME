/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView;
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
 * An implementation of the model object '<em><b>Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TransitionViewImpl#getInternalTransition <em>Internal Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionViewImpl extends EObjectImpl implements TransitionView {
	/**
	 * The cached value of the '{@link #getInternalTransition() <em>Internal Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalTransition internalTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTransition getInternalTransition() {
		if (internalTransition != null && internalTransition.eIsProxy()) {
			InternalEObject oldInternalTransition = (InternalEObject)internalTransition;
			internalTransition = (InternalTransition)eResolveProxy(oldInternalTransition);
			if (internalTransition != oldInternalTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION, oldInternalTransition, internalTransition));
			}
		}
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTransition basicGetInternalTransition() {
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTransition(InternalTransition newInternalTransition) {
		InternalTransition oldInternalTransition = internalTransition;
		internalTransition = newInternalTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION, oldInternalTransition, internalTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHistory() {
		return getInternalTransition().isHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistory(final boolean _arg) {
		getInternalTransition().getElement().transact("Set History", () -> {
			getInternalTransition().setHistory(_arg);
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
			case ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION:
				if (resolve) return getInternalTransition();
				return basicGetInternalTransition();
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
			case ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION:
				setInternalTransition((InternalTransition)newValue);
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
			case ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION:
				setInternalTransition((InternalTransition)null);
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
			case ViewsPackage.TRANSITION_VIEW__INTERNAL_TRANSITION:
				return internalTransition != null;
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
			case ViewsPackage.TRANSITION_VIEW___IS_HISTORY:
				return isHistory();
			case ViewsPackage.TRANSITION_VIEW___SET_HISTORY__BOOLEAN:
				setHistory((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionViewImpl

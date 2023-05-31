/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTransitionViewImpl#getInternalImmediateTransition <em>Internal Immediate Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmediateTransitionViewImpl extends TransitionViewImpl implements ImmediateTransitionView {
	/**
	 * The cached value of the '{@link #getInternalImmediateTransition() <em>Internal Immediate Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalImmediateTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalImmediateTransition internalImmediateTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.IMMEDIATE_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateTransition getInternalImmediateTransition() {
		if (internalImmediateTransition != null && internalImmediateTransition.eIsProxy()) {
			InternalEObject oldInternalImmediateTransition = (InternalEObject)internalImmediateTransition;
			internalImmediateTransition = (InternalImmediateTransition)eResolveProxy(oldInternalImmediateTransition);
			if (internalImmediateTransition != oldInternalImmediateTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION, oldInternalImmediateTransition, internalImmediateTransition));
			}
		}
		return internalImmediateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalImmediateTransition basicGetInternalImmediateTransition() {
		return internalImmediateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalImmediateTransition(InternalImmediateTransition newInternalImmediateTransition) {
		InternalImmediateTransition oldInternalImmediateTransition = internalImmediateTransition;
		internalImmediateTransition = newInternalImmediateTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION, oldInternalImmediateTransition, internalImmediateTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalImmediateTransition().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalImmediateTransition().getElement().transact("Set Label", () -> {
			getInternalImmediateTransition().setLabel(_arg);
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
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION:
				if (resolve) return getInternalImmediateTransition();
				return basicGetInternalImmediateTransition();
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
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION:
				setInternalImmediateTransition((InternalImmediateTransition)newValue);
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
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION:
				setInternalImmediateTransition((InternalImmediateTransition)null);
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
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION:
				return internalImmediateTransition != null;
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
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.IMMEDIATE_TRANSITION_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImmediateTransitionViewImpl

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTerminationTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTerminationTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Termination Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTerminationTransitionViewImpl#getInternalImmediateTerminationTransition <em>Internal Immediate Termination Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmediateTerminationTransitionViewImpl extends EObjectImpl implements ImmediateTerminationTransitionView {
	/**
	 * The cached value of the '{@link #getInternalImmediateTerminationTransition() <em>Internal Immediate Termination Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalImmediateTerminationTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalImmediateTerminationTransition internalImmediateTerminationTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateTerminationTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.IMMEDIATE_TERMINATION_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateTerminationTransition getInternalImmediateTerminationTransition() {
		if (internalImmediateTerminationTransition != null && internalImmediateTerminationTransition.eIsProxy()) {
			InternalEObject oldInternalImmediateTerminationTransition = (InternalEObject)internalImmediateTerminationTransition;
			internalImmediateTerminationTransition = (InternalImmediateTerminationTransition)eResolveProxy(oldInternalImmediateTerminationTransition);
			if (internalImmediateTerminationTransition != oldInternalImmediateTerminationTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.IMMEDIATE_TERMINATION_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TERMINATION_TRANSITION, oldInternalImmediateTerminationTransition, internalImmediateTerminationTransition));
			}
		}
		return internalImmediateTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalImmediateTerminationTransition basicGetInternalImmediateTerminationTransition() {
		return internalImmediateTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalImmediateTerminationTransition(InternalImmediateTerminationTransition newInternalImmediateTerminationTransition) {
		InternalImmediateTerminationTransition oldInternalImmediateTerminationTransition = internalImmediateTerminationTransition;
		internalImmediateTerminationTransition = newInternalImmediateTerminationTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.IMMEDIATE_TERMINATION_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TERMINATION_TRANSITION, oldInternalImmediateTerminationTransition, internalImmediateTerminationTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.IMMEDIATE_TERMINATION_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TERMINATION_TRANSITION:
				if (resolve) return getInternalImmediateTerminationTransition();
				return basicGetInternalImmediateTerminationTransition();
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
			case ViewsPackage.IMMEDIATE_TERMINATION_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TERMINATION_TRANSITION:
				setInternalImmediateTerminationTransition((InternalImmediateTerminationTransition)newValue);
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
			case ViewsPackage.IMMEDIATE_TERMINATION_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TERMINATION_TRANSITION:
				setInternalImmediateTerminationTransition((InternalImmediateTerminationTransition)null);
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
			case ViewsPackage.IMMEDIATE_TERMINATION_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TERMINATION_TRANSITION:
				return internalImmediateTerminationTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmediateTerminationTransitionViewImpl

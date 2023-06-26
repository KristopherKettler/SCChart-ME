/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termination Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TerminationTransitionViewImpl#getInternalTerminationTransition <em>Internal Termination Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminationTransitionViewImpl extends EObjectImpl implements TerminationTransitionView {
	/**
	 * The cached value of the '{@link #getInternalTerminationTransition() <em>Internal Termination Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTerminationTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalTerminationTransition internalTerminationTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminationTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.TERMINATION_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTerminationTransition getInternalTerminationTransition() {
		if (internalTerminationTransition != null && internalTerminationTransition.eIsProxy()) {
			InternalEObject oldInternalTerminationTransition = (InternalEObject)internalTerminationTransition;
			internalTerminationTransition = (InternalTerminationTransition)eResolveProxy(oldInternalTerminationTransition);
			if (internalTerminationTransition != oldInternalTerminationTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.TERMINATION_TRANSITION_VIEW__INTERNAL_TERMINATION_TRANSITION, oldInternalTerminationTransition, internalTerminationTransition));
			}
		}
		return internalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTerminationTransition basicGetInternalTerminationTransition() {
		return internalTerminationTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalTerminationTransition(InternalTerminationTransition newInternalTerminationTransition) {
		InternalTerminationTransition oldInternalTerminationTransition = internalTerminationTransition;
		internalTerminationTransition = newInternalTerminationTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.TERMINATION_TRANSITION_VIEW__INTERNAL_TERMINATION_TRANSITION, oldInternalTerminationTransition, internalTerminationTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.TERMINATION_TRANSITION_VIEW__INTERNAL_TERMINATION_TRANSITION:
				if (resolve) return getInternalTerminationTransition();
				return basicGetInternalTerminationTransition();
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
			case ViewsPackage.TERMINATION_TRANSITION_VIEW__INTERNAL_TERMINATION_TRANSITION:
				setInternalTerminationTransition((InternalTerminationTransition)newValue);
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
			case ViewsPackage.TERMINATION_TRANSITION_VIEW__INTERNAL_TERMINATION_TRANSITION:
				setInternalTerminationTransition((InternalTerminationTransition)null);
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
			case ViewsPackage.TERMINATION_TRANSITION_VIEW__INTERNAL_TERMINATION_TRANSITION:
				return internalTerminationTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminationTransitionViewImpl

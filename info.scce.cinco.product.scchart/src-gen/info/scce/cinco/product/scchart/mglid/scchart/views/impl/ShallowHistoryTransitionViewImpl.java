/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalShallowHistoryTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ShallowHistoryTransitionView;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shallow History Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ShallowHistoryTransitionViewImpl#getInternalShallowHistoryTransition <em>Internal Shallow History Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShallowHistoryTransitionViewImpl extends EObjectImpl implements ShallowHistoryTransitionView {
	/**
	 * The cached value of the '{@link #getInternalShallowHistoryTransition() <em>Internal Shallow History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalShallowHistoryTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalShallowHistoryTransition internalShallowHistoryTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShallowHistoryTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SHALLOW_HISTORY_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalShallowHistoryTransition getInternalShallowHistoryTransition() {
		if (internalShallowHistoryTransition != null && internalShallowHistoryTransition.eIsProxy()) {
			InternalEObject oldInternalShallowHistoryTransition = (InternalEObject)internalShallowHistoryTransition;
			internalShallowHistoryTransition = (InternalShallowHistoryTransition)eResolveProxy(oldInternalShallowHistoryTransition);
			if (internalShallowHistoryTransition != oldInternalShallowHistoryTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SHALLOW_HISTORY_TRANSITION_VIEW__INTERNAL_SHALLOW_HISTORY_TRANSITION, oldInternalShallowHistoryTransition, internalShallowHistoryTransition));
			}
		}
		return internalShallowHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalShallowHistoryTransition basicGetInternalShallowHistoryTransition() {
		return internalShallowHistoryTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalShallowHistoryTransition(InternalShallowHistoryTransition newInternalShallowHistoryTransition) {
		InternalShallowHistoryTransition oldInternalShallowHistoryTransition = internalShallowHistoryTransition;
		internalShallowHistoryTransition = newInternalShallowHistoryTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SHALLOW_HISTORY_TRANSITION_VIEW__INTERNAL_SHALLOW_HISTORY_TRANSITION, oldInternalShallowHistoryTransition, internalShallowHistoryTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.SHALLOW_HISTORY_TRANSITION_VIEW__INTERNAL_SHALLOW_HISTORY_TRANSITION:
				if (resolve) return getInternalShallowHistoryTransition();
				return basicGetInternalShallowHistoryTransition();
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
			case ViewsPackage.SHALLOW_HISTORY_TRANSITION_VIEW__INTERNAL_SHALLOW_HISTORY_TRANSITION:
				setInternalShallowHistoryTransition((InternalShallowHistoryTransition)newValue);
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
			case ViewsPackage.SHALLOW_HISTORY_TRANSITION_VIEW__INTERNAL_SHALLOW_HISTORY_TRANSITION:
				setInternalShallowHistoryTransition((InternalShallowHistoryTransition)null);
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
			case ViewsPackage.SHALLOW_HISTORY_TRANSITION_VIEW__INTERNAL_SHALLOW_HISTORY_TRANSITION:
				return internalShallowHistoryTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //ShallowHistoryTransitionViewImpl

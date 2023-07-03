/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView;
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
 * An implementation of the model object '<em><b>Strong Abort Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortDeferredTransitionViewImpl#getInternalStrongAbortDeferredTransition <em>Internal Strong Abort Deferred Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrongAbortDeferredTransitionViewImpl extends EObjectImpl implements StrongAbortDeferredTransitionView {
	/**
	 * The cached value of the '{@link #getInternalStrongAbortDeferredTransition() <em>Internal Strong Abort Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalStrongAbortDeferredTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalStrongAbortDeferredTransition internalStrongAbortDeferredTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongAbortDeferredTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.STRONG_ABORT_DEFERRED_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalStrongAbortDeferredTransition getInternalStrongAbortDeferredTransition() {
		if (internalStrongAbortDeferredTransition != null && internalStrongAbortDeferredTransition.eIsProxy()) {
			InternalEObject oldInternalStrongAbortDeferredTransition = (InternalEObject)internalStrongAbortDeferredTransition;
			internalStrongAbortDeferredTransition = (InternalStrongAbortDeferredTransition)eResolveProxy(oldInternalStrongAbortDeferredTransition);
			if (internalStrongAbortDeferredTransition != oldInternalStrongAbortDeferredTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION, oldInternalStrongAbortDeferredTransition, internalStrongAbortDeferredTransition));
			}
		}
		return internalStrongAbortDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalStrongAbortDeferredTransition basicGetInternalStrongAbortDeferredTransition() {
		return internalStrongAbortDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalStrongAbortDeferredTransition(InternalStrongAbortDeferredTransition newInternalStrongAbortDeferredTransition) {
		InternalStrongAbortDeferredTransition oldInternalStrongAbortDeferredTransition = internalStrongAbortDeferredTransition;
		internalStrongAbortDeferredTransition = newInternalStrongAbortDeferredTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION, oldInternalStrongAbortDeferredTransition, internalStrongAbortDeferredTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalStrongAbortDeferredTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalStrongAbortDeferredTransition().getElement().transact("Set Condition", () -> {
			getInternalStrongAbortDeferredTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelay() {
		return getInternalStrongAbortDeferredTransition().getDelay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay(final String _arg) {
		getInternalStrongAbortDeferredTransition().getElement().transact("Set Delay", () -> {
			getInternalStrongAbortDeferredTransition().setDelay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalStrongAbortDeferredTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalStrongAbortDeferredTransition().getElement().transact("Set Effect", () -> {
			getInternalStrongAbortDeferredTransition().setEffect(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return getInternalStrongAbortDeferredTransition().getPriority();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(final String _arg) {
		getInternalStrongAbortDeferredTransition().getElement().transact("Set Priority", () -> {
			getInternalStrongAbortDeferredTransition().setPriority(_arg);
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
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION:
				if (resolve) return getInternalStrongAbortDeferredTransition();
				return basicGetInternalStrongAbortDeferredTransition();
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
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION:
				setInternalStrongAbortDeferredTransition((InternalStrongAbortDeferredTransition)newValue);
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
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION:
				setInternalStrongAbortDeferredTransition((InternalStrongAbortDeferredTransition)null);
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
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_DEFERRED_TRANSITION:
				return internalStrongAbortDeferredTransition != null;
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
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_DELAY:
				return getDelay();
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_DELAY__STRING:
				setDelay((String)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW___GET_PRIORITY:
				return getPriority();
			case ViewsPackage.STRONG_ABORT_DEFERRED_TRANSITION_VIEW___SET_PRIORITY__STRING:
				setPriority((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StrongAbortDeferredTransitionViewImpl

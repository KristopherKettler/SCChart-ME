/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDeferredTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView;
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
 * An implementation of the model object '<em><b>Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DeferredTransitionViewImpl#getInternalDeferredTransition <em>Internal Deferred Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeferredTransitionViewImpl extends EObjectImpl implements DeferredTransitionView {
	/**
	 * The cached value of the '{@link #getInternalDeferredTransition() <em>Internal Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDeferredTransition()
	 * @generated
	 * @ordered
	 */
	protected InternalDeferredTransition internalDeferredTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeferredTransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DEFERRED_TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDeferredTransition getInternalDeferredTransition() {
		if (internalDeferredTransition != null && internalDeferredTransition.eIsProxy()) {
			InternalEObject oldInternalDeferredTransition = (InternalEObject)internalDeferredTransition;
			internalDeferredTransition = (InternalDeferredTransition)eResolveProxy(oldInternalDeferredTransition);
			if (internalDeferredTransition != oldInternalDeferredTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION, oldInternalDeferredTransition, internalDeferredTransition));
			}
		}
		return internalDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDeferredTransition basicGetInternalDeferredTransition() {
		return internalDeferredTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDeferredTransition(InternalDeferredTransition newInternalDeferredTransition) {
		InternalDeferredTransition oldInternalDeferredTransition = internalDeferredTransition;
		internalDeferredTransition = newInternalDeferredTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION, oldInternalDeferredTransition, internalDeferredTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalDeferredTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalDeferredTransition().getElement().transact("Set Condition", () -> {
			getInternalDeferredTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelay() {
		return getInternalDeferredTransition().getDelay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay(final String _arg) {
		getInternalDeferredTransition().getElement().transact("Set Delay", () -> {
			getInternalDeferredTransition().setDelay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalDeferredTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalDeferredTransition().getElement().transact("Set Effect", () -> {
			getInternalDeferredTransition().setEffect(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return getInternalDeferredTransition().getPriority();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(final String _arg) {
		getInternalDeferredTransition().getElement().transact("Set Priority", () -> {
			getInternalDeferredTransition().setPriority(_arg);
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
			case ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION:
				if (resolve) return getInternalDeferredTransition();
				return basicGetInternalDeferredTransition();
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
			case ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION:
				setInternalDeferredTransition((InternalDeferredTransition)newValue);
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
			case ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION:
				setInternalDeferredTransition((InternalDeferredTransition)null);
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
			case ViewsPackage.DEFERRED_TRANSITION_VIEW__INTERNAL_DEFERRED_TRANSITION:
				return internalDeferredTransition != null;
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
			case ViewsPackage.DEFERRED_TRANSITION_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.DEFERRED_TRANSITION_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.DEFERRED_TRANSITION_VIEW___GET_DELAY:
				return getDelay();
			case ViewsPackage.DEFERRED_TRANSITION_VIEW___SET_DELAY__STRING:
				setDelay((String)arguments.get(0));
				return null;
			case ViewsPackage.DEFERRED_TRANSITION_VIEW___GET_EFFECT:
				return getEffect();
			case ViewsPackage.DEFERRED_TRANSITION_VIEW___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
			case ViewsPackage.DEFERRED_TRANSITION_VIEW___GET_PRIORITY:
				return getPriority();
			case ViewsPackage.DEFERRED_TRANSITION_VIEW___SET_PRIORITY__STRING:
				setPriority((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeferredTransitionViewImpl

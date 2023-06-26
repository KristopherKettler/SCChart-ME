/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView;
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
 * An implementation of the model object '<em><b>Super State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateViewImpl#getInternalSuperState <em>Internal Super State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperStateViewImpl extends EObjectImpl implements SuperStateView {
	/**
	 * The cached value of the '{@link #getInternalSuperState() <em>Internal Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSuperState()
	 * @generated
	 * @ordered
	 */
	protected InternalSuperState internalSuperState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUPER_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperState getInternalSuperState() {
		if (internalSuperState != null && internalSuperState.eIsProxy()) {
			InternalEObject oldInternalSuperState = (InternalEObject)internalSuperState;
			internalSuperState = (InternalSuperState)eResolveProxy(oldInternalSuperState);
			if (internalSuperState != oldInternalSuperState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUPER_STATE_VIEW__INTERNAL_SUPER_STATE, oldInternalSuperState, internalSuperState));
			}
		}
		return internalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSuperState basicGetInternalSuperState() {
		return internalSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSuperState(InternalSuperState newInternalSuperState) {
		InternalSuperState oldInternalSuperState = internalSuperState;
		internalSuperState = newInternalSuperState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUPER_STATE_VIEW__INTERNAL_SUPER_STATE, oldInternalSuperState, internalSuperState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Suspend> getSuspends() {
		return getInternalSuperState().getSuspends();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuspends(final EList<Suspend> _arg) {
		getInternalSuperState().getElement().transact("Set Suspends", () -> {
			getInternalSuperState().getSuspends().clear();
			getInternalSuperState().getSuspends().addAll(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addSuspends(final Suspend _arg) {
		getInternalSuperState().getElement().transact("Set Suspends", () -> {
			getInternalSuperState().getSuspends().add(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeSuspends(final Suspend suspends) {
		getInternalSuperState().getElement().transact("Set Suspends", () -> {
			getInternalSuperState().getSuspends().remove(suspends);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalSuperState().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalSuperState().getElement().transact("Set Label", () -> {
			getInternalSuperState().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperStateDeclaration> getDeclaration() {
		return getInternalSuperState().getDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaration(final EList<SuperStateDeclaration> _arg) {
		getInternalSuperState().getElement().transact("Set Declaration", () -> {
			getInternalSuperState().getDeclaration().clear();
			getInternalSuperState().getDeclaration().addAll(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addDeclaration(final SuperStateDeclaration _arg) {
		getInternalSuperState().getElement().transact("Set Declaration", () -> {
			getInternalSuperState().getDeclaration().add(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeDeclaration(final SuperStateDeclaration declaration) {
		getInternalSuperState().getElement().transact("Set Declaration", () -> {
			getInternalSuperState().getDeclaration().remove(declaration);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		return getInternalSuperState().getActions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActions(final EList<Action> _arg) {
		getInternalSuperState().getElement().transact("Set Actions", () -> {
			getInternalSuperState().getActions().clear();
			getInternalSuperState().getActions().addAll(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addActions(final Action _arg) {
		getInternalSuperState().getElement().transact("Set Actions", () -> {
			getInternalSuperState().getActions().add(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeActions(final Action actions) {
		getInternalSuperState().getElement().transact("Set Actions", () -> {
			getInternalSuperState().getActions().remove(actions);
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
			case ViewsPackage.SUPER_STATE_VIEW__INTERNAL_SUPER_STATE:
				if (resolve) return getInternalSuperState();
				return basicGetInternalSuperState();
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
			case ViewsPackage.SUPER_STATE_VIEW__INTERNAL_SUPER_STATE:
				setInternalSuperState((InternalSuperState)newValue);
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
			case ViewsPackage.SUPER_STATE_VIEW__INTERNAL_SUPER_STATE:
				setInternalSuperState((InternalSuperState)null);
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
			case ViewsPackage.SUPER_STATE_VIEW__INTERNAL_SUPER_STATE:
				return internalSuperState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.SUPER_STATE_VIEW___GET_SUSPENDS:
				return getSuspends();
			case ViewsPackage.SUPER_STATE_VIEW___SET_SUSPENDS__ELIST:
				setSuspends((EList<Suspend>)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_VIEW___ADD_SUSPENDS__SUSPEND:
				addSuspends((Suspend)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_VIEW___REMOVE_SUSPENDS__SUSPEND:
				removeSuspends((Suspend)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.SUPER_STATE_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_VIEW___GET_DECLARATION:
				return getDeclaration();
			case ViewsPackage.SUPER_STATE_VIEW___SET_DECLARATION__ELIST:
				setDeclaration((EList<SuperStateDeclaration>)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_VIEW___ADD_DECLARATION__SUPERSTATEDECLARATION:
				addDeclaration((SuperStateDeclaration)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_VIEW___REMOVE_DECLARATION__SUPERSTATEDECLARATION:
				removeDeclaration((SuperStateDeclaration)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_VIEW___GET_ACTIONS:
				return getActions();
			case ViewsPackage.SUPER_STATE_VIEW___SET_ACTIONS__ELIST:
				setActions((EList<Action>)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_VIEW___ADD_ACTIONS__ACTION:
				addActions((Action)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_VIEW___REMOVE_ACTIONS__ACTION:
				removeActions((Action)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuperStateViewImpl

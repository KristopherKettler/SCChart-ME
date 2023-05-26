/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState;

import info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView;
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
 * An implementation of the model object '<em><b>Root State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateViewImpl#getInternalRootState <em>Internal Root State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootStateViewImpl extends EObjectImpl implements RootStateView {
	/**
	 * The cached value of the '{@link #getInternalRootState() <em>Internal Root State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalRootState()
	 * @generated
	 * @ordered
	 */
	protected InternalRootState internalRootState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ROOT_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRootState getInternalRootState() {
		if (internalRootState != null && internalRootState.eIsProxy()) {
			InternalEObject oldInternalRootState = (InternalEObject)internalRootState;
			internalRootState = (InternalRootState)eResolveProxy(oldInternalRootState);
			if (internalRootState != oldInternalRootState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ROOT_STATE_VIEW__INTERNAL_ROOT_STATE, oldInternalRootState, internalRootState));
			}
		}
		return internalRootState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalRootState basicGetInternalRootState() {
		return internalRootState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalRootState(InternalRootState newInternalRootState) {
		InternalRootState oldInternalRootState = internalRootState;
		internalRootState = newInternalRootState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ROOT_STATE_VIEW__INTERNAL_ROOT_STATE, oldInternalRootState, internalRootState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalRootState().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalRootState().getElement().transact("Set Label", () -> {
			getInternalRootState().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperStateDeclaration> getDeclaration() {
		return getInternalRootState().getDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaration(final EList<SuperStateDeclaration> _arg) {
		getInternalRootState().getElement().transact("Set Declaration", () -> {
			getInternalRootState().getDeclaration().clear();
			getInternalRootState().getDeclaration().addAll(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addDeclaration(final SuperStateDeclaration _arg) {
		getInternalRootState().getElement().transact("Set Declaration", () -> {
			getInternalRootState().getDeclaration().add(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeDeclaration(final SuperStateDeclaration declaration) {
		getInternalRootState().getElement().transact("Set Declaration", () -> {
			getInternalRootState().getDeclaration().remove(declaration);
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
			case ViewsPackage.ROOT_STATE_VIEW__INTERNAL_ROOT_STATE:
				if (resolve) return getInternalRootState();
				return basicGetInternalRootState();
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
			case ViewsPackage.ROOT_STATE_VIEW__INTERNAL_ROOT_STATE:
				setInternalRootState((InternalRootState)newValue);
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
			case ViewsPackage.ROOT_STATE_VIEW__INTERNAL_ROOT_STATE:
				setInternalRootState((InternalRootState)null);
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
			case ViewsPackage.ROOT_STATE_VIEW__INTERNAL_ROOT_STATE:
				return internalRootState != null;
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
			case ViewsPackage.ROOT_STATE_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.ROOT_STATE_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case ViewsPackage.ROOT_STATE_VIEW___GET_DECLARATION:
				return getDeclaration();
			case ViewsPackage.ROOT_STATE_VIEW___SET_DECLARATION__ELIST:
				setDeclaration((EList<SuperStateDeclaration>)arguments.get(0));
				return null;
			case ViewsPackage.ROOT_STATE_VIEW___ADD_DECLARATION__SUPERSTATEDECLARATION:
				addDeclaration((SuperStateDeclaration)arguments.get(0));
				return null;
			case ViewsPackage.ROOT_STATE_VIEW___REMOVE_DECLARATION__SUPERSTATEDECLARATION:
				removeDeclaration((SuperStateDeclaration)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RootStateViewImpl

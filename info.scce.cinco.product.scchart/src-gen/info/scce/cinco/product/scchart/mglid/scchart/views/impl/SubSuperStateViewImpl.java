/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.SubSuperStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateView;
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
 * An implementation of the model object '<em><b>Sub Super State View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SubSuperStateViewImpl#getInternalSubSuperState <em>Internal Sub Super State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSuperStateViewImpl extends EObjectImpl implements SubSuperStateView {
	/**
	 * The cached value of the '{@link #getInternalSubSuperState() <em>Internal Sub Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSubSuperState()
	 * @generated
	 * @ordered
	 */
	protected InternalSubSuperState internalSubSuperState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSuperStateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUB_SUPER_STATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSubSuperState getInternalSubSuperState() {
		if (internalSubSuperState != null && internalSubSuperState.eIsProxy()) {
			InternalEObject oldInternalSubSuperState = (InternalEObject)internalSubSuperState;
			internalSubSuperState = (InternalSubSuperState)eResolveProxy(oldInternalSubSuperState);
			if (internalSubSuperState != oldInternalSubSuperState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUB_SUPER_STATE_VIEW__INTERNAL_SUB_SUPER_STATE, oldInternalSubSuperState, internalSubSuperState));
			}
		}
		return internalSubSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSubSuperState basicGetInternalSubSuperState() {
		return internalSubSuperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSubSuperState(InternalSubSuperState newInternalSubSuperState) {
		InternalSubSuperState oldInternalSubSuperState = internalSubSuperState;
		internalSubSuperState = newInternalSubSuperState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUB_SUPER_STATE_VIEW__INTERNAL_SUB_SUPER_STATE, oldInternalSubSuperState, internalSubSuperState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalSubSuperState().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalSubSuperState().getElement().transact("Set Label", () -> {
			getInternalSubSuperState().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubSuperStateDeclaration> getDeclaration() {
		return getInternalSubSuperState().getDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaration(final EList<SubSuperStateDeclaration> _arg) {
		getInternalSubSuperState().getElement().transact("Set Declaration", () -> {
			getInternalSubSuperState().getDeclaration().clear();
			getInternalSubSuperState().getDeclaration().addAll(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addDeclaration(final SubSuperStateDeclaration _arg) {
		getInternalSubSuperState().getElement().transact("Set Declaration", () -> {
			getInternalSubSuperState().getDeclaration().add(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeDeclaration(final SubSuperStateDeclaration declaration) {
		getInternalSubSuperState().getElement().transact("Set Declaration", () -> {
			getInternalSubSuperState().getDeclaration().remove(declaration);
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
			case ViewsPackage.SUB_SUPER_STATE_VIEW__INTERNAL_SUB_SUPER_STATE:
				if (resolve) return getInternalSubSuperState();
				return basicGetInternalSubSuperState();
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
			case ViewsPackage.SUB_SUPER_STATE_VIEW__INTERNAL_SUB_SUPER_STATE:
				setInternalSubSuperState((InternalSubSuperState)newValue);
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
			case ViewsPackage.SUB_SUPER_STATE_VIEW__INTERNAL_SUB_SUPER_STATE:
				setInternalSubSuperState((InternalSubSuperState)null);
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
			case ViewsPackage.SUB_SUPER_STATE_VIEW__INTERNAL_SUB_SUPER_STATE:
				return internalSubSuperState != null;
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
			case ViewsPackage.SUB_SUPER_STATE_VIEW___GET_LABEL:
				return getLabel();
			case ViewsPackage.SUB_SUPER_STATE_VIEW___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case ViewsPackage.SUB_SUPER_STATE_VIEW___GET_DECLARATION:
				return getDeclaration();
			case ViewsPackage.SUB_SUPER_STATE_VIEW___SET_DECLARATION__ELIST:
				setDeclaration((EList<SubSuperStateDeclaration>)arguments.get(0));
				return null;
			case ViewsPackage.SUB_SUPER_STATE_VIEW___ADD_DECLARATION__SUBSUPERSTATEDECLARATION:
				addDeclaration((SubSuperStateDeclaration)arguments.get(0));
				return null;
			case ViewsPackage.SUB_SUPER_STATE_VIEW___REMOVE_DECLARATION__SUBSUPERSTATEDECLARATION:
				removeDeclaration((SubSuperStateDeclaration)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SubSuperStateViewImpl

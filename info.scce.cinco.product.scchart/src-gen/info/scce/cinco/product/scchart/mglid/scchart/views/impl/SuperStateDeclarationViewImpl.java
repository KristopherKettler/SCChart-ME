/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView;
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
 * An implementation of the model object '<em><b>Super State Declaration View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationViewImpl#getInternalSuperStateDeclaration <em>Internal Super State Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperStateDeclarationViewImpl extends EObjectImpl implements SuperStateDeclarationView {
	/**
	 * The cached value of the '{@link #getInternalSuperStateDeclaration() <em>Internal Super State Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSuperStateDeclaration()
	 * @generated
	 * @ordered
	 */
	protected InternalSuperStateDeclaration internalSuperStateDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperStateDeclarationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUPER_STATE_DECLARATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperStateDeclaration getInternalSuperStateDeclaration() {
		if (internalSuperStateDeclaration != null && internalSuperStateDeclaration.eIsProxy()) {
			InternalEObject oldInternalSuperStateDeclaration = (InternalEObject)internalSuperStateDeclaration;
			internalSuperStateDeclaration = (InternalSuperStateDeclaration)eResolveProxy(oldInternalSuperStateDeclaration);
			if (internalSuperStateDeclaration != oldInternalSuperStateDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUPER_STATE_DECLARATION, oldInternalSuperStateDeclaration, internalSuperStateDeclaration));
			}
		}
		return internalSuperStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSuperStateDeclaration basicGetInternalSuperStateDeclaration() {
		return internalSuperStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSuperStateDeclaration(InternalSuperStateDeclaration newInternalSuperStateDeclaration) {
		InternalSuperStateDeclaration oldInternalSuperStateDeclaration = internalSuperStateDeclaration;
		internalSuperStateDeclaration = newInternalSuperStateDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUPER_STATE_DECLARATION, oldInternalSuperStateDeclaration, internalSuperStateDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalSuperStateDeclaration().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalSuperStateDeclaration().getElement().transact("Set DeclarationType", () -> {
			getInternalSuperStateDeclaration().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return getInternalSuperStateDeclaration().getInputOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(final String _arg) {
		getInternalSuperStateDeclaration().getElement().transact("Set InputOutput", () -> {
			getInternalSuperStateDeclaration().setInputOutput(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSuperStateDeclaration().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSuperStateDeclaration().getElement().transact("Set Name", () -> {
			getInternalSuperStateDeclaration().setName(_arg);
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
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUPER_STATE_DECLARATION:
				if (resolve) return getInternalSuperStateDeclaration();
				return basicGetInternalSuperStateDeclaration();
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
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUPER_STATE_DECLARATION:
				setInternalSuperStateDeclaration((InternalSuperStateDeclaration)newValue);
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
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUPER_STATE_DECLARATION:
				setInternalSuperStateDeclaration((InternalSuperStateDeclaration)null);
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
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUPER_STATE_DECLARATION:
				return internalSuperStateDeclaration != null;
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
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW___GET_INPUT_OUTPUT:
				return getInputOutput();
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW___SET_INPUT_OUTPUT__STRING:
				setInputOutput((String)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.SUPER_STATE_DECLARATION_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuperStateDeclarationViewImpl

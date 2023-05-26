/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateDeclarationView;
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
 * An implementation of the model object '<em><b>Sub Super State Declaration View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SubSuperStateDeclarationViewImpl#getInternalSubSuperStateDeclaration <em>Internal Sub Super State Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSuperStateDeclarationViewImpl extends EObjectImpl implements SubSuperStateDeclarationView {
	/**
	 * The cached value of the '{@link #getInternalSubSuperStateDeclaration() <em>Internal Sub Super State Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSubSuperStateDeclaration()
	 * @generated
	 * @ordered
	 */
	protected InternalSubSuperStateDeclaration internalSubSuperStateDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSuperStateDeclarationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUB_SUPER_STATE_DECLARATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSubSuperStateDeclaration getInternalSubSuperStateDeclaration() {
		if (internalSubSuperStateDeclaration != null && internalSubSuperStateDeclaration.eIsProxy()) {
			InternalEObject oldInternalSubSuperStateDeclaration = (InternalEObject)internalSubSuperStateDeclaration;
			internalSubSuperStateDeclaration = (InternalSubSuperStateDeclaration)eResolveProxy(oldInternalSubSuperStateDeclaration);
			if (internalSubSuperStateDeclaration != oldInternalSubSuperStateDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION, oldInternalSubSuperStateDeclaration, internalSubSuperStateDeclaration));
			}
		}
		return internalSubSuperStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSubSuperStateDeclaration basicGetInternalSubSuperStateDeclaration() {
		return internalSubSuperStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSubSuperStateDeclaration(InternalSubSuperStateDeclaration newInternalSubSuperStateDeclaration) {
		InternalSubSuperStateDeclaration oldInternalSubSuperStateDeclaration = internalSubSuperStateDeclaration;
		internalSubSuperStateDeclaration = newInternalSubSuperStateDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION, oldInternalSubSuperStateDeclaration, internalSubSuperStateDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalSubSuperStateDeclaration().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalSubSuperStateDeclaration().getElement().transact("Set DeclarationType", () -> {
			getInternalSubSuperStateDeclaration().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSubSuperStateDeclaration().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSubSuperStateDeclaration().getElement().transact("Set Name", () -> {
			getInternalSubSuperStateDeclaration().setName(_arg);
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION:
				if (resolve) return getInternalSubSuperStateDeclaration();
				return basicGetInternalSubSuperStateDeclaration();
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION:
				setInternalSubSuperStateDeclaration((InternalSubSuperStateDeclaration)newValue);
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION:
				setInternalSubSuperStateDeclaration((InternalSubSuperStateDeclaration)null);
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION:
				return internalSubSuperStateDeclaration != null;
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SubSuperStateDeclarationViewImpl

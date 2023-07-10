/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView;
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
 * An implementation of the model object '<em><b>Root State Declaration View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationViewImpl#getInternalRootStateDeclaration <em>Internal Root State Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootStateDeclarationViewImpl extends EObjectImpl implements RootStateDeclarationView {
	/**
	 * The cached value of the '{@link #getInternalRootStateDeclaration() <em>Internal Root State Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalRootStateDeclaration()
	 * @generated
	 * @ordered
	 */
	protected InternalRootStateDeclaration internalRootStateDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootStateDeclarationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ROOT_STATE_DECLARATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRootStateDeclaration getInternalRootStateDeclaration() {
		if (internalRootStateDeclaration != null && internalRootStateDeclaration.eIsProxy()) {
			InternalEObject oldInternalRootStateDeclaration = (InternalEObject)internalRootStateDeclaration;
			internalRootStateDeclaration = (InternalRootStateDeclaration)eResolveProxy(oldInternalRootStateDeclaration);
			if (internalRootStateDeclaration != oldInternalRootStateDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ROOT_STATE_DECLARATION_VIEW__INTERNAL_ROOT_STATE_DECLARATION, oldInternalRootStateDeclaration, internalRootStateDeclaration));
			}
		}
		return internalRootStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalRootStateDeclaration basicGetInternalRootStateDeclaration() {
		return internalRootStateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalRootStateDeclaration(InternalRootStateDeclaration newInternalRootStateDeclaration) {
		InternalRootStateDeclaration oldInternalRootStateDeclaration = internalRootStateDeclaration;
		internalRootStateDeclaration = newInternalRootStateDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ROOT_STATE_DECLARATION_VIEW__INTERNAL_ROOT_STATE_DECLARATION, oldInternalRootStateDeclaration, internalRootStateDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalRootStateDeclaration().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalRootStateDeclaration().getElement().transact("Set DeclarationType", () -> {
			getInternalRootStateDeclaration().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConst() {
		return getInternalRootStateDeclaration().isConst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConst(final boolean _arg) {
		getInternalRootStateDeclaration().getElement().transact("Set Const", () -> {
			getInternalRootStateDeclaration().setConst(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return getInternalRootStateDeclaration().getInputOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(final String _arg) {
		getInternalRootStateDeclaration().getElement().transact("Set InputOutput", () -> {
			getInternalRootStateDeclaration().setInputOutput(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalRootStateDeclaration().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalRootStateDeclaration().getElement().transact("Set Name", () -> {
			getInternalRootStateDeclaration().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSignal() {
		return getInternalRootStateDeclaration().isSignal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignal(final boolean _arg) {
		getInternalRootStateDeclaration().getElement().transact("Set Signal", () -> {
			getInternalRootStateDeclaration().setSignal(_arg);
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
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW__INTERNAL_ROOT_STATE_DECLARATION:
				if (resolve) return getInternalRootStateDeclaration();
				return basicGetInternalRootStateDeclaration();
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
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW__INTERNAL_ROOT_STATE_DECLARATION:
				setInternalRootStateDeclaration((InternalRootStateDeclaration)newValue);
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
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW__INTERNAL_ROOT_STATE_DECLARATION:
				setInternalRootStateDeclaration((InternalRootStateDeclaration)null);
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
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW__INTERNAL_ROOT_STATE_DECLARATION:
				return internalRootStateDeclaration != null;
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
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___IS_CONST:
				return isConst();
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___SET_CONST__BOOLEAN:
				setConst((Boolean)arguments.get(0));
				return null;
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___GET_INPUT_OUTPUT:
				return getInputOutput();
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___SET_INPUT_OUTPUT__STRING:
				setInputOutput((String)arguments.get(0));
				return null;
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___IS_SIGNAL:
				return isSignal();
			case ViewsPackage.ROOT_STATE_DECLARATION_VIEW___SET_SIGNAL__BOOLEAN:
				setSignal((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RootStateDeclarationViewImpl

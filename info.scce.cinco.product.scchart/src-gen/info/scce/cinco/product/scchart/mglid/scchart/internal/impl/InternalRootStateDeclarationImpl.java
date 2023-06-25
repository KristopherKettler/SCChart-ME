/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import graphmodel.internal.impl.InternalTypeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root State Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationImpl#getDeclarationType <em>Declaration Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationImpl#getInputOutput <em>Input Output</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalRootStateDeclarationImpl extends InternalTypeImpl implements InternalRootStateDeclaration {
	/**
	 * The default value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATION_TYPE_EDEFAULT = "select type";

	/**
	 * The cached value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected String declarationType = DECLARATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputOutput() <em>Input Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_OUTPUT_EDEFAULT = "select type";

	/**
	 * The cached value of the '{@link #getInputOutput() <em>Input Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOutput()
	 * @generated
	 * @ordered
	 */
	protected String inputOutput = INPUT_OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalRootStateDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_ROOT_STATE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return declarationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(String newDeclarationType) {
		String oldDeclarationType = declarationType;
		declarationType = newDeclarationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__DECLARATION_TYPE, oldDeclarationType, declarationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return inputOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(String newInputOutput) {
		String oldInputOutput = inputOutput;
		inputOutput = newInputOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__INPUT_OUTPUT, oldInputOutput, inputOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__DECLARATION_TYPE:
				return getDeclarationType();
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__INPUT_OUTPUT:
				return getInputOutput();
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__NAME:
				return getName();
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
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__DECLARATION_TYPE:
				setDeclarationType((String)newValue);
				return;
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__INPUT_OUTPUT:
				setInputOutput((String)newValue);
				return;
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__NAME:
				setName((String)newValue);
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
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__DECLARATION_TYPE:
				setDeclarationType(DECLARATION_TYPE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__INPUT_OUTPUT:
				setInputOutput(INPUT_OUTPUT_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
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
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__DECLARATION_TYPE:
				return DECLARATION_TYPE_EDEFAULT == null ? declarationType != null : !DECLARATION_TYPE_EDEFAULT.equals(declarationType);
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__INPUT_OUTPUT:
				return INPUT_OUTPUT_EDEFAULT == null ? inputOutput != null : !INPUT_OUTPUT_EDEFAULT.equals(inputOutput);
			case InternalPackage.INTERNAL_ROOT_STATE_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (declarationType: ");
		result.append(declarationType);
		result.append(", InputOutput: ");
		result.append(inputOutput);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InternalRootStateDeclarationImpl

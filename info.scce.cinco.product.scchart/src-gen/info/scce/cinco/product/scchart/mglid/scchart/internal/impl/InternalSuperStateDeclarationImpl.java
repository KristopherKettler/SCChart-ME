/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import graphmodel.internal.impl.InternalNodeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super State Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationImpl#getDeclarationType <em>Declaration Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationImpl#isConst <em>Const</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationImpl#getConstSig <em>Const Sig</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationImpl#isSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalSuperStateDeclarationImpl extends InternalNodeImpl implements InternalSuperStateDeclaration {
	/**
	 * The default value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATION_TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #isConst() <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConst() <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConst()
	 * @generated
	 * @ordered
	 */
	protected boolean const_ = CONST_EDEFAULT;

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
	 * The default value of the '{@link #getConstSig() <em>Const Sig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstSig()
	 * @generated
	 * @ordered
	 */
	protected static final String CONST_SIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstSig() <em>Const Sig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstSig()
	 * @generated
	 * @ordered
	 */
	protected String constSig = CONST_SIG_EDEFAULT;

	/**
	 * The default value of the '{@link #isSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignal()
	 * @generated
	 * @ordered
	 */
	protected boolean signal = SIGNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalSuperStateDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_SUPER_STATE_DECLARATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__DECLARATION_TYPE, oldDeclarationType, declarationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConst() {
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConst(boolean newConst) {
		boolean oldConst = const_;
		const_ = newConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST, oldConst, const_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstSig() {
		return constSig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstSig(String newConstSig) {
		String oldConstSig = constSig;
		constSig = newConstSig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST_SIG, oldConstSig, constSig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignal(boolean newSignal) {
		boolean oldSignal = signal;
		signal = newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__DECLARATION_TYPE:
				return getDeclarationType();
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST:
				return isConst();
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__NAME:
				return getName();
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST_SIG:
				return getConstSig();
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__SIGNAL:
				return isSignal();
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
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__DECLARATION_TYPE:
				setDeclarationType((String)newValue);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST:
				setConst((Boolean)newValue);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST_SIG:
				setConstSig((String)newValue);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__SIGNAL:
				setSignal((Boolean)newValue);
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
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__DECLARATION_TYPE:
				setDeclarationType(DECLARATION_TYPE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST:
				setConst(CONST_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST_SIG:
				setConstSig(CONST_SIG_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__SIGNAL:
				setSignal(SIGNAL_EDEFAULT);
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
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__DECLARATION_TYPE:
				return DECLARATION_TYPE_EDEFAULT == null ? declarationType != null : !DECLARATION_TYPE_EDEFAULT.equals(declarationType);
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST:
				return const_ != CONST_EDEFAULT;
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__CONST_SIG:
				return CONST_SIG_EDEFAULT == null ? constSig != null : !CONST_SIG_EDEFAULT.equals(constSig);
			case InternalPackage.INTERNAL_SUPER_STATE_DECLARATION__SIGNAL:
				return signal != SIGNAL_EDEFAULT;
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
		result.append(", const: ");
		result.append(const_);
		result.append(", name: ");
		result.append(name);
		result.append(", ConstSig: ");
		result.append(constSig);
		result.append(", signal: ");
		result.append(signal);
		result.append(')');
		return result.toString();
	}

} //InternalSuperStateDeclarationImpl

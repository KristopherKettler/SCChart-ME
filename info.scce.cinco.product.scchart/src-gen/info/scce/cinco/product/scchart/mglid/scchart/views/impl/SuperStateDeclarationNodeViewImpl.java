/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView;
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
 * An implementation of the model object '<em><b>Super State Declaration Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationNodeViewImpl#getInternalSuperStateDeclarationNode <em>Internal Super State Declaration Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperStateDeclarationNodeViewImpl extends EObjectImpl implements SuperStateDeclarationNodeView {
	/**
	 * The cached value of the '{@link #getInternalSuperStateDeclarationNode() <em>Internal Super State Declaration Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSuperStateDeclarationNode()
	 * @generated
	 * @ordered
	 */
	protected InternalSuperStateDeclarationNode internalSuperStateDeclarationNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperStateDeclarationNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUPER_STATE_DECLARATION_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperStateDeclarationNode getInternalSuperStateDeclarationNode() {
		if (internalSuperStateDeclarationNode != null && internalSuperStateDeclarationNode.eIsProxy()) {
			InternalEObject oldInternalSuperStateDeclarationNode = (InternalEObject)internalSuperStateDeclarationNode;
			internalSuperStateDeclarationNode = (InternalSuperStateDeclarationNode)eResolveProxy(oldInternalSuperStateDeclarationNode);
			if (internalSuperStateDeclarationNode != oldInternalSuperStateDeclarationNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUPER_STATE_DECLARATION_NODE, oldInternalSuperStateDeclarationNode, internalSuperStateDeclarationNode));
			}
		}
		return internalSuperStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSuperStateDeclarationNode basicGetInternalSuperStateDeclarationNode() {
		return internalSuperStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSuperStateDeclarationNode(InternalSuperStateDeclarationNode newInternalSuperStateDeclarationNode) {
		InternalSuperStateDeclarationNode oldInternalSuperStateDeclarationNode = internalSuperStateDeclarationNode;
		internalSuperStateDeclarationNode = newInternalSuperStateDeclarationNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUPER_STATE_DECLARATION_NODE, oldInternalSuperStateDeclarationNode, internalSuperStateDeclarationNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalSuperStateDeclarationNode().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalSuperStateDeclarationNode().getElement().transact("Set DeclarationType", () -> {
			getInternalSuperStateDeclarationNode().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return getInternalSuperStateDeclarationNode().getInputOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(final String _arg) {
		getInternalSuperStateDeclarationNode().getElement().transact("Set InputOutput", () -> {
			getInternalSuperStateDeclarationNode().setInputOutput(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSuperStateDeclarationNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSuperStateDeclarationNode().getElement().transact("Set Name", () -> {
			getInternalSuperStateDeclarationNode().setName(_arg);
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
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUPER_STATE_DECLARATION_NODE:
				if (resolve) return getInternalSuperStateDeclarationNode();
				return basicGetInternalSuperStateDeclarationNode();
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
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUPER_STATE_DECLARATION_NODE:
				setInternalSuperStateDeclarationNode((InternalSuperStateDeclarationNode)newValue);
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
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUPER_STATE_DECLARATION_NODE:
				setInternalSuperStateDeclarationNode((InternalSuperStateDeclarationNode)null);
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
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUPER_STATE_DECLARATION_NODE:
				return internalSuperStateDeclarationNode != null;
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
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW___GET_INPUT_OUTPUT:
				return getInputOutput();
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW___SET_INPUT_OUTPUT__STRING:
				setInputOutput((String)arguments.get(0));
				return null;
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.SUPER_STATE_DECLARATION_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuperStateDeclarationNodeViewImpl

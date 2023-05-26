/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode;

import info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateDeclarationNodeView;
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
 * An implementation of the model object '<em><b>Sub Super State Declaration Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SubSuperStateDeclarationNodeViewImpl#getInternalSubSuperStateDeclarationNode <em>Internal Sub Super State Declaration Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSuperStateDeclarationNodeViewImpl extends EObjectImpl implements SubSuperStateDeclarationNodeView {
	/**
	 * The cached value of the '{@link #getInternalSubSuperStateDeclarationNode() <em>Internal Sub Super State Declaration Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSubSuperStateDeclarationNode()
	 * @generated
	 * @ordered
	 */
	protected InternalSubSuperStateDeclarationNode internalSubSuperStateDeclarationNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSuperStateDeclarationNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUB_SUPER_STATE_DECLARATION_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSubSuperStateDeclarationNode getInternalSubSuperStateDeclarationNode() {
		if (internalSubSuperStateDeclarationNode != null && internalSubSuperStateDeclarationNode.eIsProxy()) {
			InternalEObject oldInternalSubSuperStateDeclarationNode = (InternalEObject)internalSubSuperStateDeclarationNode;
			internalSubSuperStateDeclarationNode = (InternalSubSuperStateDeclarationNode)eResolveProxy(oldInternalSubSuperStateDeclarationNode);
			if (internalSubSuperStateDeclarationNode != oldInternalSubSuperStateDeclarationNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE, oldInternalSubSuperStateDeclarationNode, internalSubSuperStateDeclarationNode));
			}
		}
		return internalSubSuperStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSubSuperStateDeclarationNode basicGetInternalSubSuperStateDeclarationNode() {
		return internalSubSuperStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSubSuperStateDeclarationNode(InternalSubSuperStateDeclarationNode newInternalSubSuperStateDeclarationNode) {
		InternalSubSuperStateDeclarationNode oldInternalSubSuperStateDeclarationNode = internalSubSuperStateDeclarationNode;
		internalSubSuperStateDeclarationNode = newInternalSubSuperStateDeclarationNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE, oldInternalSubSuperStateDeclarationNode, internalSubSuperStateDeclarationNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalSubSuperStateDeclarationNode().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalSubSuperStateDeclarationNode().getElement().transact("Set DeclarationType", () -> {
			getInternalSubSuperStateDeclarationNode().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalSubSuperStateDeclarationNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalSubSuperStateDeclarationNode().getElement().transact("Set Name", () -> {
			getInternalSubSuperStateDeclarationNode().setName(_arg);
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE:
				if (resolve) return getInternalSubSuperStateDeclarationNode();
				return basicGetInternalSubSuperStateDeclarationNode();
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE:
				setInternalSubSuperStateDeclarationNode((InternalSubSuperStateDeclarationNode)newValue);
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE:
				setInternalSubSuperStateDeclarationNode((InternalSubSuperStateDeclarationNode)null);
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE:
				return internalSubSuperStateDeclarationNode != null;
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
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.SUB_SUPER_STATE_DECLARATION_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SubSuperStateDeclarationNodeViewImpl

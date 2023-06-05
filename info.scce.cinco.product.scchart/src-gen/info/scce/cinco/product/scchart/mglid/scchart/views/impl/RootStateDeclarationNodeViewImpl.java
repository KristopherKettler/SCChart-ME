/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode;

import info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView;
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
 * An implementation of the model object '<em><b>Root State Declaration Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationNodeViewImpl#getInternalRootStateDeclarationNode <em>Internal Root State Declaration Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootStateDeclarationNodeViewImpl extends EObjectImpl implements RootStateDeclarationNodeView {
	/**
	 * The cached value of the '{@link #getInternalRootStateDeclarationNode() <em>Internal Root State Declaration Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalRootStateDeclarationNode()
	 * @generated
	 * @ordered
	 */
	protected InternalRootStateDeclarationNode internalRootStateDeclarationNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootStateDeclarationNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ROOT_STATE_DECLARATION_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRootStateDeclarationNode getInternalRootStateDeclarationNode() {
		if (internalRootStateDeclarationNode != null && internalRootStateDeclarationNode.eIsProxy()) {
			InternalEObject oldInternalRootStateDeclarationNode = (InternalEObject)internalRootStateDeclarationNode;
			internalRootStateDeclarationNode = (InternalRootStateDeclarationNode)eResolveProxy(oldInternalRootStateDeclarationNode);
			if (internalRootStateDeclarationNode != oldInternalRootStateDeclarationNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW__INTERNAL_ROOT_STATE_DECLARATION_NODE, oldInternalRootStateDeclarationNode, internalRootStateDeclarationNode));
			}
		}
		return internalRootStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalRootStateDeclarationNode basicGetInternalRootStateDeclarationNode() {
		return internalRootStateDeclarationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalRootStateDeclarationNode(InternalRootStateDeclarationNode newInternalRootStateDeclarationNode) {
		InternalRootStateDeclarationNode oldInternalRootStateDeclarationNode = internalRootStateDeclarationNode;
		internalRootStateDeclarationNode = newInternalRootStateDeclarationNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW__INTERNAL_ROOT_STATE_DECLARATION_NODE, oldInternalRootStateDeclarationNode, internalRootStateDeclarationNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalRootStateDeclarationNode().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalRootStateDeclarationNode().getElement().transact("Set DeclarationType", () -> {
			getInternalRootStateDeclarationNode().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return getInternalRootStateDeclarationNode().getInputOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(final String _arg) {
		getInternalRootStateDeclarationNode().getElement().transact("Set InputOutput", () -> {
			getInternalRootStateDeclarationNode().setInputOutput(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalRootStateDeclarationNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalRootStateDeclarationNode().getElement().transact("Set Name", () -> {
			getInternalRootStateDeclarationNode().setName(_arg);
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
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW__INTERNAL_ROOT_STATE_DECLARATION_NODE:
				if (resolve) return getInternalRootStateDeclarationNode();
				return basicGetInternalRootStateDeclarationNode();
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
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW__INTERNAL_ROOT_STATE_DECLARATION_NODE:
				setInternalRootStateDeclarationNode((InternalRootStateDeclarationNode)newValue);
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
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW__INTERNAL_ROOT_STATE_DECLARATION_NODE:
				setInternalRootStateDeclarationNode((InternalRootStateDeclarationNode)null);
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
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW__INTERNAL_ROOT_STATE_DECLARATION_NODE:
				return internalRootStateDeclarationNode != null;
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
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW___GET_INPUT_OUTPUT:
				return getInputOutput();
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW___SET_INPUT_OUTPUT__STRING:
				setInputOutput((String)arguments.get(0));
				return null;
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.ROOT_STATE_DECLARATION_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RootStateDeclarationNodeViewImpl

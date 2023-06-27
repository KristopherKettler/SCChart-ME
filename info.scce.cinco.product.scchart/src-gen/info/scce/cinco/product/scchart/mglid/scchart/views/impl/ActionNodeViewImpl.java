/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalActionNode;

import info.scce.cinco.product.scchart.mglid.scchart.views.ActionNodeView;
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
 * An implementation of the model object '<em><b>Action Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ActionNodeViewImpl#getInternalActionNode <em>Internal Action Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionNodeViewImpl extends EObjectImpl implements ActionNodeView {
	/**
	 * The cached value of the '{@link #getInternalActionNode() <em>Internal Action Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalActionNode()
	 * @generated
	 * @ordered
	 */
	protected InternalActionNode internalActionNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.ACTION_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalActionNode getInternalActionNode() {
		if (internalActionNode != null && internalActionNode.eIsProxy()) {
			InternalEObject oldInternalActionNode = (InternalEObject)internalActionNode;
			internalActionNode = (InternalActionNode)eResolveProxy(oldInternalActionNode);
			if (internalActionNode != oldInternalActionNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.ACTION_NODE_VIEW__INTERNAL_ACTION_NODE, oldInternalActionNode, internalActionNode));
			}
		}
		return internalActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalActionNode basicGetInternalActionNode() {
		return internalActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalActionNode(InternalActionNode newInternalActionNode) {
		InternalActionNode oldInternalActionNode = internalActionNode;
		internalActionNode = newInternalActionNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.ACTION_NODE_VIEW__INTERNAL_ACTION_NODE, oldInternalActionNode, internalActionNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalActionNode().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalActionNode().getElement().transact("Set DeclarationType", () -> {
			getInternalActionNode().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return getInternalActionNode().getInputOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(final String _arg) {
		getInternalActionNode().getElement().transact("Set InputOutput", () -> {
			getInternalActionNode().setInputOutput(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalActionNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalActionNode().getElement().transact("Set Name", () -> {
			getInternalActionNode().setName(_arg);
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
			case ViewsPackage.ACTION_NODE_VIEW__INTERNAL_ACTION_NODE:
				if (resolve) return getInternalActionNode();
				return basicGetInternalActionNode();
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
			case ViewsPackage.ACTION_NODE_VIEW__INTERNAL_ACTION_NODE:
				setInternalActionNode((InternalActionNode)newValue);
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
			case ViewsPackage.ACTION_NODE_VIEW__INTERNAL_ACTION_NODE:
				setInternalActionNode((InternalActionNode)null);
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
			case ViewsPackage.ACTION_NODE_VIEW__INTERNAL_ACTION_NODE:
				return internalActionNode != null;
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
			case ViewsPackage.ACTION_NODE_VIEW___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ViewsPackage.ACTION_NODE_VIEW___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ViewsPackage.ACTION_NODE_VIEW___GET_INPUT_OUTPUT:
				return getInputOutput();
			case ViewsPackage.ACTION_NODE_VIEW___SET_INPUT_OUTPUT__STRING:
				setInputOutput((String)arguments.get(0));
				return null;
			case ViewsPackage.ACTION_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.ACTION_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionNodeViewImpl

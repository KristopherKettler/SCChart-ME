/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspendNode;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuspendNodeView;
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
 * An implementation of the model object '<em><b>Suspend Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuspendNodeViewImpl#getInternalSuspendNode <em>Internal Suspend Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuspendNodeViewImpl extends EObjectImpl implements SuspendNodeView {
	/**
	 * The cached value of the '{@link #getInternalSuspendNode() <em>Internal Suspend Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSuspendNode()
	 * @generated
	 * @ordered
	 */
	protected InternalSuspendNode internalSuspendNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuspendNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.SUSPEND_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuspendNode getInternalSuspendNode() {
		if (internalSuspendNode != null && internalSuspendNode.eIsProxy()) {
			InternalEObject oldInternalSuspendNode = (InternalEObject)internalSuspendNode;
			internalSuspendNode = (InternalSuspendNode)eResolveProxy(oldInternalSuspendNode);
			if (internalSuspendNode != oldInternalSuspendNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.SUSPEND_NODE_VIEW__INTERNAL_SUSPEND_NODE, oldInternalSuspendNode, internalSuspendNode));
			}
		}
		return internalSuspendNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSuspendNode basicGetInternalSuspendNode() {
		return internalSuspendNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalSuspendNode(InternalSuspendNode newInternalSuspendNode) {
		InternalSuspendNode oldInternalSuspendNode = internalSuspendNode;
		internalSuspendNode = newInternalSuspendNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.SUSPEND_NODE_VIEW__INTERNAL_SUSPEND_NODE, oldInternalSuspendNode, internalSuspendNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalSuspendNode().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalSuspendNode().getElement().transact("Set Condition", () -> {
			getInternalSuspendNode().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuspendType() {
		return getInternalSuspendNode().getSuspendType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuspendType(final String _arg) {
		getInternalSuspendNode().getElement().transact("Set SuspendType", () -> {
			getInternalSuspendNode().setSuspendType(_arg);
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
			case ViewsPackage.SUSPEND_NODE_VIEW__INTERNAL_SUSPEND_NODE:
				if (resolve) return getInternalSuspendNode();
				return basicGetInternalSuspendNode();
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
			case ViewsPackage.SUSPEND_NODE_VIEW__INTERNAL_SUSPEND_NODE:
				setInternalSuspendNode((InternalSuspendNode)newValue);
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
			case ViewsPackage.SUSPEND_NODE_VIEW__INTERNAL_SUSPEND_NODE:
				setInternalSuspendNode((InternalSuspendNode)null);
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
			case ViewsPackage.SUSPEND_NODE_VIEW__INTERNAL_SUSPEND_NODE:
				return internalSuspendNode != null;
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
			case ViewsPackage.SUSPEND_NODE_VIEW___GET_CONDITION:
				return getCondition();
			case ViewsPackage.SUSPEND_NODE_VIEW___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ViewsPackage.SUSPEND_NODE_VIEW___GET_SUSPEND_TYPE:
				return getSuspendType();
			case ViewsPackage.SUSPEND_NODE_VIEW___SET_SUSPEND_TYPE__STRING:
				setSuspendType((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuspendNodeViewImpl

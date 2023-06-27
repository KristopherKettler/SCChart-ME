/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspendNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suspend Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspendNodeView#getInternalSuspendNode <em>Internal Suspend Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSuspendNodeView()
 * @model
 * @generated
 */
public interface SuspendNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Suspend Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Suspend Node</em>' reference.
	 * @see #setInternalSuspendNode(InternalSuspendNode)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSuspendNodeView_InternalSuspendNode()
	 * @model
	 * @generated
	 */
	InternalSuspendNode getInternalSuspendNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspendNodeView#getInternalSuspendNode <em>Internal Suspend Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Suspend Node</em>' reference.
	 * @see #getInternalSuspendNode()
	 * @generated
	 */
	void setInternalSuspendNode(InternalSuspendNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCondition(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSuspendType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSuspendType(String _arg);

} // SuspendNodeView

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalActionNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionNodeView#getInternalActionNode <em>Internal Action Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getActionNodeView()
 * @model
 * @generated
 */
public interface ActionNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Action Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Action Node</em>' reference.
	 * @see #setInternalActionNode(InternalActionNode)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getActionNodeView_InternalActionNode()
	 * @model
	 * @generated
	 */
	InternalActionNode getInternalActionNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionNodeView#getInternalActionNode <em>Internal Action Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Action Node</em>' reference.
	 * @see #getInternalActionNode()
	 * @generated
	 */
	void setInternalActionNode(InternalActionNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDeclarationType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDeclarationType(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getInputOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setInputOutput(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String _arg);

} // ActionNodeView

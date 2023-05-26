/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super State Declaration Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#getInternalSuperStateDeclarationNode <em>Internal Super State Declaration Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSuperStateDeclarationNodeView()
 * @model
 * @generated
 */
public interface SuperStateDeclarationNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Super State Declaration Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Super State Declaration Node</em>' reference.
	 * @see #setInternalSuperStateDeclarationNode(InternalSuperStateDeclarationNode)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSuperStateDeclarationNodeView_InternalSuperStateDeclarationNode()
	 * @model
	 * @generated
	 */
	InternalSuperStateDeclarationNode getInternalSuperStateDeclarationNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#getInternalSuperStateDeclarationNode <em>Internal Super State Declaration Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Super State Declaration Node</em>' reference.
	 * @see #getInternalSuperStateDeclarationNode()
	 * @generated
	 */
	void setInternalSuperStateDeclarationNode(InternalSuperStateDeclarationNode value);

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

} // SuperStateDeclarationNodeView

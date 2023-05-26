/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Super State Declaration Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateDeclarationNodeView#getInternalSubSuperStateDeclarationNode <em>Internal Sub Super State Declaration Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSubSuperStateDeclarationNodeView()
 * @model
 * @generated
 */
public interface SubSuperStateDeclarationNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Sub Super State Declaration Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Sub Super State Declaration Node</em>' reference.
	 * @see #setInternalSubSuperStateDeclarationNode(InternalSubSuperStateDeclarationNode)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSubSuperStateDeclarationNodeView_InternalSubSuperStateDeclarationNode()
	 * @model
	 * @generated
	 */
	InternalSubSuperStateDeclarationNode getInternalSubSuperStateDeclarationNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateDeclarationNodeView#getInternalSubSuperStateDeclarationNode <em>Internal Sub Super State Declaration Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Sub Super State Declaration Node</em>' reference.
	 * @see #getInternalSubSuperStateDeclarationNode()
	 * @generated
	 */
	void setInternalSubSuperStateDeclarationNode(InternalSubSuperStateDeclarationNode value);

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
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String _arg);

} // SubSuperStateDeclarationNodeView

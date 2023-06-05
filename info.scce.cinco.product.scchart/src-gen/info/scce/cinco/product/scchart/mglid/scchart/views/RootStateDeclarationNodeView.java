/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root State Declaration Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getInternalRootStateDeclarationNode <em>Internal Root State Declaration Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getRootStateDeclarationNodeView()
 * @model
 * @generated
 */
public interface RootStateDeclarationNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Root State Declaration Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Root State Declaration Node</em>' reference.
	 * @see #setInternalRootStateDeclarationNode(InternalRootStateDeclarationNode)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getRootStateDeclarationNodeView_InternalRootStateDeclarationNode()
	 * @model
	 * @generated
	 */
	InternalRootStateDeclarationNode getInternalRootStateDeclarationNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getInternalRootStateDeclarationNode <em>Internal Root State Declaration Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Root State Declaration Node</em>' reference.
	 * @see #getInternalRootStateDeclarationNode()
	 * @generated
	 */
	void setInternalRootStateDeclarationNode(InternalRootStateDeclarationNode value);

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

} // RootStateDeclarationNodeView

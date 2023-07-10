/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal;

import graphmodel.internal.InternalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root State Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getDeclarationType <em>Declaration Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getInputOutput <em>Input Output</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#isSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalRootStateDeclaration()
 * @model
 * @generated
 */
public interface InternalRootStateDeclaration extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Declaration Type</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration Type</em>' attribute.
	 * @see #setDeclarationType(String)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalRootStateDeclaration_DeclarationType()
	 * @model default=" "
	 * @generated
	 */
	String getDeclarationType();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getDeclarationType <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration Type</em>' attribute.
	 * @see #getDeclarationType()
	 * @generated
	 */
	void setDeclarationType(String value);

	/**
	 * Returns the value of the '<em><b>Input Output</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Output</em>' attribute.
	 * @see #setInputOutput(String)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalRootStateDeclaration_InputOutput()
	 * @model default=" "
	 * @generated
	 */
	String getInputOutput();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getInputOutput <em>Input Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Output</em>' attribute.
	 * @see #getInputOutput()
	 * @generated
	 */
	void setInputOutput(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalRootStateDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' attribute.
	 * @see #setSignal(boolean)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalRootStateDeclaration_Signal()
	 * @model
	 * @generated
	 */
	boolean isSignal();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#isSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' attribute.
	 * @see #isSignal()
	 * @generated
	 */
	void setSignal(boolean value);

} // InternalRootStateDeclaration

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Type;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super State Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getSuperStateDeclaration()
 * @model
 * @generated
 */
public interface SuperStateDeclaration extends Type {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalSuperStateDeclaration getInternalSuperStateDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlySuperStateDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SuperStateDeclarationView getSuperStateDeclarationView();

} // SuperStateDeclaration

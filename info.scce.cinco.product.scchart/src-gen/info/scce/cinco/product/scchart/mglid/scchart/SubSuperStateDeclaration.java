/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Type;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateDeclarationView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Super State Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getSubSuperStateDeclaration()
 * @model
 * @generated
 */
public interface SubSuperStateDeclaration extends Type {
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
	InternalSubSuperStateDeclaration getInternalSubSuperStateDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlySubSuperStateDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SubSuperStateDeclarationView getSubSuperStateDeclarationView();

} // SubSuperStateDeclaration

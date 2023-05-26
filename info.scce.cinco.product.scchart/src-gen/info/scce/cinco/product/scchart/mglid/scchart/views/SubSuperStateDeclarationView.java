/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Super State Declaration View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateDeclarationView#getInternalSubSuperStateDeclaration <em>Internal Sub Super State Declaration</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSubSuperStateDeclarationView()
 * @model
 * @generated
 */
public interface SubSuperStateDeclarationView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Sub Super State Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Sub Super State Declaration</em>' reference.
	 * @see #setInternalSubSuperStateDeclaration(InternalSubSuperStateDeclaration)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSubSuperStateDeclarationView_InternalSubSuperStateDeclaration()
	 * @model
	 * @generated
	 */
	InternalSubSuperStateDeclaration getInternalSubSuperStateDeclaration();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateDeclarationView#getInternalSubSuperStateDeclaration <em>Internal Sub Super State Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Sub Super State Declaration</em>' reference.
	 * @see #getInternalSubSuperStateDeclaration()
	 * @generated
	 */
	void setInternalSubSuperStateDeclaration(InternalSubSuperStateDeclaration value);

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

} // SubSuperStateDeclarationView

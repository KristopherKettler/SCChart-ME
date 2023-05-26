/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.SubSuperStateDeclaration;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Super State View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateView#getInternalSubSuperState <em>Internal Sub Super State</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSubSuperStateView()
 * @model
 * @generated
 */
public interface SubSuperStateView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Sub Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Sub Super State</em>' reference.
	 * @see #setInternalSubSuperState(InternalSubSuperState)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSubSuperStateView_InternalSubSuperState()
	 * @model
	 * @generated
	 */
	InternalSubSuperState getInternalSubSuperState();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateView#getInternalSubSuperState <em>Internal Sub Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Sub Super State</em>' reference.
	 * @see #getInternalSubSuperState()
	 * @generated
	 */
	void setInternalSubSuperState(InternalSubSuperState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLabel(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SubSuperStateDeclaration> getDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _argMany="true"
	 * @generated
	 */
	void setDeclaration(EList<SubSuperStateDeclaration> _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDeclaration(SubSuperStateDeclaration _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDeclaration(SubSuperStateDeclaration declaration);

} // SubSuperStateView

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super State View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getInternalSuperState <em>Internal Super State</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSuperStateView()
 * @model
 * @generated
 */
public interface SuperStateView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Super State</em>' reference.
	 * @see #setInternalSuperState(InternalSuperState)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getSuperStateView_InternalSuperState()
	 * @model
	 * @generated
	 */
	InternalSuperState getInternalSuperState();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getInternalSuperState <em>Internal Super State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Super State</em>' reference.
	 * @see #getInternalSuperState()
	 * @generated
	 */
	void setInternalSuperState(InternalSuperState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Suspend> getSuspends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _argMany="true"
	 * @generated
	 */
	void setSuspends(EList<Suspend> _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addSuspends(Suspend _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeSuspends(Suspend suspends);

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
	EList<SuperStateDeclaration> getDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _argMany="true"
	 * @generated
	 */
	void setDeclaration(EList<SuperStateDeclaration> _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDeclaration(SuperStateDeclaration _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDeclaration(SuperStateDeclaration declaration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _argMany="true"
	 * @generated
	 */
	void setActions(EList<Action> _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addActions(Action _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeActions(Action actions);

} // SuperStateView

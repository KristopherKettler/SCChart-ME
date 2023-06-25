/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView#getInternalImmediateTransition <em>Internal Immediate Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getImmediateTransitionView()
 * @model
 * @generated
 */
public interface ImmediateTransitionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Immediate Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Immediate Transition</em>' reference.
	 * @see #setInternalImmediateTransition(InternalImmediateTransition)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getImmediateTransitionView_InternalImmediateTransition()
	 * @model
	 * @generated
	 */
	InternalImmediateTransition getInternalImmediateTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView#getInternalImmediateTransition <em>Internal Immediate Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Immediate Transition</em>' reference.
	 * @see #getInternalImmediateTransition()
	 * @generated
	 */
	void setInternalImmediateTransition(InternalImmediateTransition value);

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
	String getPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPriority(String _arg);

} // ImmediateTransitionView

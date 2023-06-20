/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal;

import graphmodel.internal.InternalEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getAction <em>Action</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalTransition()
 * @model
 * @generated
 */
public interface InternalTransition extends InternalEdge {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalTransition_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalTransition_Trigger()
	 * @model
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalTransition_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // InternalTransition

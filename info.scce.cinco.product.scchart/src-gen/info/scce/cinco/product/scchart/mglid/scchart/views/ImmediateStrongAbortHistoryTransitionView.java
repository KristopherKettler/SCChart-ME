/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateStrongAbortHistoryTransition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate Strong Abort History Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateStrongAbortHistoryTransitionView#getInternalImmediateStrongAbortHistoryTransition <em>Internal Immediate Strong Abort History Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getImmediateStrongAbortHistoryTransitionView()
 * @model
 * @generated
 */
public interface ImmediateStrongAbortHistoryTransitionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Immediate Strong Abort History Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Immediate Strong Abort History Transition</em>' reference.
	 * @see #setInternalImmediateStrongAbortHistoryTransition(InternalImmediateStrongAbortHistoryTransition)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getImmediateStrongAbortHistoryTransitionView_InternalImmediateStrongAbortHistoryTransition()
	 * @model
	 * @generated
	 */
	InternalImmediateStrongAbortHistoryTransition getInternalImmediateStrongAbortHistoryTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateStrongAbortHistoryTransitionView#getInternalImmediateStrongAbortHistoryTransition <em>Internal Immediate Strong Abort History Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Immediate Strong Abort History Transition</em>' reference.
	 * @see #getInternalImmediateStrongAbortHistoryTransition()
	 * @generated
	 */
	void setInternalImmediateStrongAbortHistoryTransition(InternalImmediateStrongAbortHistoryTransition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCondition(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDelay();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDelay(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDeepHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDeepHistory(boolean _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEffect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setEffect(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getH();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setH(String _arg);

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

} // ImmediateStrongAbortHistoryTransitionView
/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortDeferredTransition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strong Abort Deferred Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getInternalStrongAbortDeferredTransition <em>Internal Strong Abort Deferred Transition</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getStrongAbortDeferredTransitionView()
 * @model
 * @generated
 */
public interface StrongAbortDeferredTransitionView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Strong Abort Deferred Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Strong Abort Deferred Transition</em>' reference.
	 * @see #setInternalStrongAbortDeferredTransition(InternalStrongAbortDeferredTransition)
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#getStrongAbortDeferredTransitionView_InternalStrongAbortDeferredTransition()
	 * @model
	 * @generated
	 */
	InternalStrongAbortDeferredTransition getInternalStrongAbortDeferredTransition();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortDeferredTransitionView#getInternalStrongAbortDeferredTransition <em>Internal Strong Abort Deferred Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Strong Abort Deferred Transition</em>' reference.
	 * @see #getInternalStrongAbortDeferredTransition()
	 * @generated
	 */
	void setInternalStrongAbortDeferredTransition(InternalStrongAbortDeferredTransition value);

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
	String getPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPriority(String _arg);

} // StrongAbortDeferredTransitionView

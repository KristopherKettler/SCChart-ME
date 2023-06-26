/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Type;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuspend;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuspendView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suspend</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getSuspend()
 * @model
 * @generated
 */
public interface Suspend extends Type {
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
	String getActionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setActionType(String _arg);

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
	InternalSuspend getInternalSuspend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlySuspend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SuspendView getSuspendView();

} // Suspend

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import info.scce.cinco.product.scchart.mglid.scchart.ConnectionCircuit;
import info.scce.cinco.product.scchart.mglid.scchart.Input;
import info.scce.cinco.product.scchart.mglid.scchart.Operator;
import info.scce.cinco.product.scchart.mglid.scchart.Output;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#getInternalConnectionCircuit()
 * @model
 * @generated
 */
public interface InternalConnectionCircuit extends InternalNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ConnectionConstraint"
	 * @generated
	 */
	EList<ConnectionConstraint> getIncomingConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ConnectionConstraint"
	 * @generated
	 */
	EList<ConnectionConstraint> getOutgoingConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<RootState> getRootStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Input> getInputPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Operator> getOperatorPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ConnectionCircuit> getConnectionCircuitPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Output> getOutputSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Operator> getOperatorSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ConnectionCircuit> getConnectionCircuitSuccessors();

} // InternalConnectionCircuit

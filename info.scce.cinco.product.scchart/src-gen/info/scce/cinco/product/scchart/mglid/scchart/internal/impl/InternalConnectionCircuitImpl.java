/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import graphmodel.internal.impl.InternalNodeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.ConnectionCircuit;
import info.scce.cinco.product.scchart.mglid.scchart.Input;
import info.scce.cinco.product.scchart.mglid.scchart.Operator;
import info.scce.cinco.product.scchart.mglid.scchart.Output;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnectionCircuit;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InternalConnectionCircuitImpl extends InternalNodeImpl implements InternalConnectionCircuit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalConnectionCircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_CONNECTION_CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.Connection.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0));
		eList.addAll(super.getIncomingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.Connection.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0));
		eList.addAll(super.getOutgoingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootState> getRootStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getOperatorPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.Operator.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionCircuit> getConnectionCircuitPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.ConnectionCircuit.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.Output.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getOperatorSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.Operator.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionCircuit> getConnectionCircuitSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.ConnectionCircuit.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalNode.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_OUTGOING_CONSTRAINTS;
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_INCOMING_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_INPUT_PREDECESSORS:
				return getInputPredecessors();
			case InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_OPERATOR_PREDECESSORS:
				return getOperatorPredecessors();
			case InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_CONNECTION_CIRCUIT_PREDECESSORS:
				return getConnectionCircuitPredecessors();
			case InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_OUTPUT_SUCCESSORS:
				return getOutputSuccessors();
			case InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_OPERATOR_SUCCESSORS:
				return getOperatorSuccessors();
			case InternalPackage.INTERNAL_CONNECTION_CIRCUIT___GET_CONNECTION_CIRCUIT_SUCCESSORS:
				return getConnectionCircuitSuccessors();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalConnectionCircuitImpl

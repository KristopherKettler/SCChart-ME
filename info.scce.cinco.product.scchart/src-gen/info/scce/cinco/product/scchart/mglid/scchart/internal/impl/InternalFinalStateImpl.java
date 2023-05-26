/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.internal.InternalNode;

import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InternalFinalStateImpl extends InternalSimpleStateImpl implements InternalFinalState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalFinalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_FINAL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.Transition.class,info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class,info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class,info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class,info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class,info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class,info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
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
		ConnectionConstraint cons0 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.Transition.class,info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class,info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class,info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class,info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class,info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class,info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
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
	public EList<SubSuperState> getSubSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SubSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSubSuperState> getInitilalSubSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubSuperState> getSubSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SubSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSubSuperState> getInitilalSubSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
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
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS;
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalSimpleState.class) {
			switch (baseOperationID) {
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_ROOT_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_ROOT_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_SUB_SUPER_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_SUB_SUPER_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_CONNECTOR_PREDECESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_SUB_SUPER_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_SUB_SUPER_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS;
				case InternalPackage.INTERNAL_SIMPLE_STATE___GET_CONNECTOR_SUCCESSORS: return InternalPackage.INTERNAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS;
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
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_SUB_SUPER_STATE_PREDECESSORS:
				return getSubSuperStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS:
				return getInitilalSubSuperStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_SUB_SUPER_STATE_SUCCESSORS:
				return getSubSuperStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS:
				return getInitilalSubSuperStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case InternalPackage.INTERNAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalFinalStateImpl

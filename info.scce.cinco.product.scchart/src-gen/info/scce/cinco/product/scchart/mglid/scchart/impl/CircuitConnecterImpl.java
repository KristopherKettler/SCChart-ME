/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.Direction;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.NodeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.CircuitConnecter;
import info.scce.cinco.product.scchart.mglid.scchart.Connection;
import info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion;
import info.scce.cinco.product.scchart.mglid.scchart.Input;
import info.scce.cinco.product.scchart.mglid.scchart.Operator;
import info.scce.cinco.product.scchart.mglid.scchart.Output;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalCircuitConnecter;

import info.scce.cinco.product.scchart.mglid.scchart.views.CircuitConnecterView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit Connecter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CircuitConnecterImpl extends NodeImpl implements CircuitConnecter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitConnecterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getCircuitConnecter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCircuitConnecter getInternalCircuitConnecter() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalCircuitConnecter) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyCircuitConnecter() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteFunction() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteEvent() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChart getRootElement() {
		return (info.scce.cinco.product.scchart.mglid.scchart.SCChart) this.getInternalElement().getRootElement().getElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Connection> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoing();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
			.stream().map(me -> (info.scce.cinco.product.scchart.mglid.scchart.Connection)me.getElement()).
				collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Node> getSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(graphmodel.Node.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Connection> getIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalNode)getInternalElement()).getIncoming();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(in
			.stream().map(me -> (info.scce.cinco.product.scchart.mglid.scchart.Connection)me.getElement()).
				collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Node> getPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(graphmodel.Node.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final ModelElementContainer container, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preMove(final ModelElementContainer newContainer, final int newX, final int newY) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getOutgoingConnections() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.Connection.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getIncomingConnections() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.Connection.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootState> getRootStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.Input.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getOperatorPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.Operator.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitConnecter> getCircuitConnecterPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.CircuitConnecter.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.Output.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getOperatorSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.Operator.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CircuitConnecter> getCircuitConnecterSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.CircuitConnecter.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewConnection(final Output target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Connection.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Connection.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection newConnection(final Output target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Connection edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConnection((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection newConnection(final Output target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Connection edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConnection(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewConnection(final CircuitConnecter target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Connection.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Connection.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection newConnection(final CircuitConnecter target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Connection edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConnection((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection newConnection(final CircuitConnecter target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Connection edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConnection(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewConnection(final Operator target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Connection.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Connection.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection newConnection(final Operator target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Connection edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConnection((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			target.getRootElement().getModelElements().add(edge);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection newConnection(final Operator target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Connection.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Connection.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Connection.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Connection edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConnection(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
			edge.setSourceElement(this);
			edge.setTargetElement(target);
			return edge;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final DataFlowRegion dataFlowRegion, final int x, final int y) {
		return dataFlowRegion.canContain(info.scce.cinco.product.scchart.mglid.scchart.CircuitConnecter.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final DataFlowRegion dataFlowRegion, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(dataFlowRegion, x, y);
			dataFlowRegion.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final DataFlowRegion dataFlowRegion, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion getContainer() {
		return (info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircuitConnecterView getCircuitConnecterView() {
		CircuitConnecterView circuitConnecterView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createCircuitConnecterView();
		circuitConnecterView.setInternalCircuitConnecter((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalCircuitConnecter)getInternalElement());
		return circuitConnecterView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IdentifiableElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.CIRCUIT_CONNECTER___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.CIRCUIT_CONNECTER___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return ScchartPackage.CIRCUIT_CONNECTER___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.CIRCUIT_CONNECTER___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.CIRCUIT_CONNECTER___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.CIRCUIT_CONNECTER___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return ScchartPackage.CIRCUIT_CONNECTER___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return ScchartPackage.CIRCUIT_CONNECTER___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.CIRCUIT_CONNECTER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.CIRCUIT_CONNECTER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.CIRCUIT_CONNECTER___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.CIRCUIT_CONNECTER___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.CIRCUIT_CONNECTER___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.CIRCUIT_CONNECTER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.CIRCUIT_CONNECTER___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.CIRCUIT_CONNECTER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return ScchartPackage.CIRCUIT_CONNECTER___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return ScchartPackage.CIRCUIT_CONNECTER___GET_OUTGOING;
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
			case ScchartPackage.CIRCUIT_CONNECTER___GET_INTERNAL_CIRCUIT_CONNECTER:
				return getInternalCircuitConnecter();
			case ScchartPackage.CIRCUIT_CONNECTER___IS_EXACTLY_CIRCUIT_CONNECTER:
				return isExactlyCircuitConnecter();
			case ScchartPackage.CIRCUIT_CONNECTER___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.CIRCUIT_CONNECTER___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_OUTGOING:
				return getOutgoing();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_SUCCESSORS:
				return getSuccessors();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_INCOMING:
				return getIncoming();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_PREDECESSORS:
				return getPredecessors();
			case ScchartPackage.CIRCUIT_CONNECTER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___GET_OUTGOING_CONNECTIONS:
				return getOutgoingConnections();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_INPUT_PREDECESSORS:
				return getInputPredecessors();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_OPERATOR_PREDECESSORS:
				return getOperatorPredecessors();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_CIRCUIT_CONNECTER_PREDECESSORS:
				return getCircuitConnecterPredecessors();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_OUTPUT_SUCCESSORS:
				return getOutputSuccessors();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_OPERATOR_SUCCESSORS:
				return getOperatorSuccessors();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_CIRCUIT_CONNECTER_SUCCESSORS:
				return getCircuitConnecterSuccessors();
			case ScchartPackage.CIRCUIT_CONNECTER___CAN_NEW_CONNECTION__OUTPUT:
				return canNewConnection((Output)arguments.get(0));
			case ScchartPackage.CIRCUIT_CONNECTER___NEW_CONNECTION__OUTPUT:
				return newConnection((Output)arguments.get(0));
			case ScchartPackage.CIRCUIT_CONNECTER___NEW_CONNECTION__OUTPUT_STRING:
				return newConnection((Output)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CIRCUIT_CONNECTER___CAN_NEW_CONNECTION__CIRCUITCONNECTER:
				return canNewConnection((CircuitConnecter)arguments.get(0));
			case ScchartPackage.CIRCUIT_CONNECTER___NEW_CONNECTION__CIRCUITCONNECTER:
				return newConnection((CircuitConnecter)arguments.get(0));
			case ScchartPackage.CIRCUIT_CONNECTER___NEW_CONNECTION__CIRCUITCONNECTER_STRING:
				return newConnection((CircuitConnecter)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CIRCUIT_CONNECTER___CAN_NEW_CONNECTION__OPERATOR:
				return canNewConnection((Operator)arguments.get(0));
			case ScchartPackage.CIRCUIT_CONNECTER___NEW_CONNECTION__OPERATOR:
				return newConnection((Operator)arguments.get(0));
			case ScchartPackage.CIRCUIT_CONNECTER___NEW_CONNECTION__OPERATOR_STRING:
				return newConnection((Operator)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.CIRCUIT_CONNECTER___CAN_MOVE_TO__DATAFLOWREGION_INT_INT:
				return canMoveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.CIRCUIT_CONNECTER___MOVE_TO__DATAFLOWREGION_INT_INT:
				moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___SMOVE_TO__DATAFLOWREGION_INT_INT:
				s_moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.CIRCUIT_CONNECTER___GET_CONTAINER:
				return getContainer();
			case ScchartPackage.CIRCUIT_CONNECTER___GET_CIRCUIT_CONNECTER_VIEW:
				return getCircuitConnecterView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CircuitConnecterImpl

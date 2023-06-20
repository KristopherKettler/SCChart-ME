/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.Container;
import graphmodel.Direction;
import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;
import info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.InitilalSuperStateView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initilal Super State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InitilalSuperStateImpl extends SuperStateImpl implements InitilalSuperState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitilalSuperStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getInitilalSuperState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalInitilalSuperState getInternalInitilalSuperState() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyInitilalSuperState() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		// event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void>("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
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
		// event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Runnable> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Runnable>("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		java.lang.Runnable eventResult = eventContext.getFirstResult();
		return eventResult;
		
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
	public EList<? extends Node> getNodes() {
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(getInternalContainerElement().getModelElements()
				.stream().filter(me -> me instanceof graphmodel.internal.InternalNode).map(me -> (graphmodel.Node)me.getElement()).
					collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperStateDeclarationNode> getSuperStateDeclarationNodes() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSuperStateDeclarationNode() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclarationNode newSuperStateDeclarationNode(final int x, final int y) {
		return newSuperStateDeclarationNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclarationNode newSuperStateDeclarationNode(final String id, final int x, final int y) {
		return newSuperStateDeclarationNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclarationNode newSuperStateDeclarationNode(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuperStateDeclarationNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclarationNode newSuperStateDeclarationNode(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuperStateDeclarationNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Region> getRegions() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.Region.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewRegion() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Region.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region newRegion(final int x, final int y) {
		return newRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region newRegion(final String id, final int x, final int y) {
		return newRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region newRegion(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Region.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Region node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Region.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region newRegion(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Region.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Region node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Region.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Edge> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalContainer)getInternalElement()).getOutgoing();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
			.stream().map(me -> (graphmodel.Edge)me.getElement()).
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
	public EList<? extends Edge> getIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalContainer)getInternalElement()).getIncoming();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(in
			.stream().map(me -> (graphmodel.Edge)me.getElement()).
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
		// event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>(this, newContainer, newX, newY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void>("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		// event.post.move.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>(this, source, x - deltaX, y - deltaY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void>("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		// event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>(this, newWidth, newHeight, newX, newY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void>("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		// event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>(this, oldWidth, oldHeight, oldX, oldY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void>("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortTransition> getOutgoingStrongAbortTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateTerminationTransition> getOutgoingImmediateTerminationTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateTransition> getOutgoingImmediateTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeakAbortTransition> getOutgoingWeakAbortTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefferedTransition> getOutgoingDefferedTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeakAbortTerminationTransition> getOutgoingWeakAbortTerminationTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortTransition> getIncomingStrongAbortTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateTerminationTransition> getIncomingImmediateTerminationTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateTransition> getIncomingImmediateTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeakAbortTransition> getIncomingWeakAbortTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefferedTransition> getIncomingDefferedTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeakAbortTerminationTransition> getIncomingWeakAbortTerminationTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getIncomingTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
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
	public EList<SuperState> getSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSuperState> getInitilalSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorPredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSuperState> getInitilalSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewStrongAbortTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortTransition newStrongAbortTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortTransition newStrongAbortTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortTransition newStrongAbortTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortTransition newStrongAbortTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortTransition newStrongAbortTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortTransition newStrongAbortTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTerminationTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTerminationTransition newImmediateTerminationTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTerminationTransition newImmediateTerminationTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTerminationTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTerminationTransition newImmediateTerminationTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTerminationTransition newImmediateTerminationTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTerminationTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTerminationTransition newImmediateTerminationTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTerminationTransition newImmediateTerminationTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTerminationTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTerminationTransition newImmediateTerminationTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTerminationTransition newImmediateTerminationTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTerminationTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTerminationTransition newImmediateTerminationTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTerminationTransition newImmediateTerminationTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTerminationTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTerminationTransition newImmediateTerminationTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTerminationTransition newImmediateTerminationTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateTransition newImmediateTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransition newWeakAbortTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTransition newWeakAbortTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransition newWeakAbortTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTransition newWeakAbortTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransition newWeakAbortTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTransition newWeakAbortTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransition newWeakAbortTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTransition newWeakAbortTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransition newWeakAbortTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTransition newWeakAbortTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransition newWeakAbortTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTransition newWeakAbortTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewDefferedTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransition newDefferedTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public DefferedTransition newDefferedTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewDefferedTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransition newDefferedTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public DefferedTransition newDefferedTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewDefferedTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransition newDefferedTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public DefferedTransition newDefferedTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewDefferedTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransition newDefferedTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public DefferedTransition newDefferedTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewDefferedTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransition newDefferedTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public DefferedTransition newDefferedTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewDefferedTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransition newDefferedTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public DefferedTransition newDefferedTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DefferedTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DefferedTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDefferedTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTerminationTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTerminationTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTerminationTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTerminationTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTerminationTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewWeakAbortTerminationTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", WeakAbortTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", WeakAbortTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createWeakAbortTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public Transition newTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", Transition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", Transition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.Transition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canMoveTo(final Region region, final int x, final int y) {
		return region.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final Region region, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(region, x, y);
			s_moveTo(region, x, y);
			region.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, region, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final Region region, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region getContainer() {
		return (info.scce.cinco.product.scchart.mglid.scchart.Region)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperStateView getInitilalSuperStateView() {
		InitilalSuperStateView initilalSuperStateView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createInitilalSuperStateView();
		initilalSuperStateView.setInternalInitilalSuperState((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState)getInternalElement());
		return initilalSuperStateView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.INITILAL_SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.INITILAL_SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return ScchartPackage.INITILAL_SUPER_STATE___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return ScchartPackage.INITILAL_SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return ScchartPackage.INITILAL_SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return ScchartPackage.INITILAL_SUPER_STATE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.INITILAL_SUPER_STATE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.INITILAL_SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.INITILAL_SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.INITILAL_SUPER_STATE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.INITILAL_SUPER_STATE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.INITILAL_SUPER_STATE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.INITILAL_SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.INITILAL_SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Container.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.CONTAINER___GET_SUCCESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_SUCCESSORS;
				case GraphmodelPackage.CONTAINER___GET_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_PREDECESSORS;
				case GraphmodelPackage.CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_FUNCTION: return ScchartPackage.INITILAL_SUPER_STATE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_EVENT: return ScchartPackage.INITILAL_SUPER_STATE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.CONTAINER___PRE_DELETE: return ScchartPackage.INITILAL_SUPER_STATE___PRE_DELETE;
				case GraphmodelPackage.CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.INITILAL_SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.INITILAL_SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_INCOMING: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING;
				case GraphmodelPackage.CONTAINER___GET_OUTGOING: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING;
				case GraphmodelPackage.CONTAINER___GET_CONTAINER: return ScchartPackage.INITILAL_SUPER_STATE___GET_CONTAINER;
				case GraphmodelPackage.CONTAINER___GET_ROOT_ELEMENT: return ScchartPackage.INITILAL_SUPER_STATE___GET_ROOT_ELEMENT;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SuperState.class) {
			switch (baseOperationID) {
				case ScchartPackage.SUPER_STATE___PRE_DELETE: return ScchartPackage.INITILAL_SUPER_STATE___PRE_DELETE;
				case ScchartPackage.SUPER_STATE___GET_POST_DELETE_FUNCTION: return ScchartPackage.INITILAL_SUPER_STATE___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.SUPER_STATE___GET_POST_DELETE_EVENT: return ScchartPackage.INITILAL_SUPER_STATE___GET_POST_DELETE_EVENT;
				case ScchartPackage.SUPER_STATE___PRE_SAVE: return ScchartPackage.INITILAL_SUPER_STATE___PRE_SAVE;
				case ScchartPackage.SUPER_STATE___POST_SAVE: return ScchartPackage.INITILAL_SUPER_STATE___POST_SAVE;
				case ScchartPackage.SUPER_STATE___GET_ROOT_ELEMENT: return ScchartPackage.INITILAL_SUPER_STATE___GET_ROOT_ELEMENT;
				case ScchartPackage.SUPER_STATE___GET_NODES: return ScchartPackage.INITILAL_SUPER_STATE___GET_NODES;
				case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_DECLARATION_NODES: return ScchartPackage.INITILAL_SUPER_STATE___GET_SUPER_STATE_DECLARATION_NODES;
				case ScchartPackage.SUPER_STATE___CAN_NEW_SUPER_STATE_DECLARATION_NODE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_SUPER_STATE_DECLARATION_NODE;
				case ScchartPackage.SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__STRING_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__STRING_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__INT_INT_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__STRING_INT_INT_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___GET_REGIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_REGIONS;
				case ScchartPackage.SUPER_STATE___CAN_NEW_REGION: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_REGION;
				case ScchartPackage.SUPER_STATE___NEW_REGION__INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___NEW_REGION__INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_REGION__STRING_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___NEW_REGION__STRING_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_REGION__INT_INT_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___NEW_REGION__INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___NEW_REGION__STRING_INT_INT_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___NEW_REGION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING;
				case ScchartPackage.SUPER_STATE___GET_SUCCESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING;
				case ScchartPackage.SUPER_STATE___GET_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case ScchartPackage.SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.INITILAL_SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.INITILAL_SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_TERMINATION_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_TERMINATION_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_WEAK_ABORT_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_WEAK_ABORT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_DEFFERED_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_DEFFERED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_WEAK_ABORT_TERMINATION_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_WEAK_ABORT_TERMINATION_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_OUTGOING_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_TERMINATION_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_TERMINATION_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_WEAK_ABORT_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_WEAK_ABORT_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_DEFFERED_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_DEFFERED_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_WEAK_ABORT_TERMINATION_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_WEAK_ABORT_TERMINATION_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_INCOMING_TRANSITIONS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_TRANSITIONS;
				case ScchartPackage.SUPER_STATE___GET_ROOT_STATE_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_FINAL_STATE_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_CONNECTOR_PREDECESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS;
				case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_SUCCESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_FINAL_STATE_SUCCESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___GET_CONNECTOR_SUCCESSORS: return ScchartPackage.INITILAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__CONNECTOR_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__FINALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__CONNECTOR_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__FINALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_DEFFERED_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__INITIALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__CONNECTOR: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__CONNECTOR;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__CONNECTOR_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SUPERSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__SUPERSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__FINALSTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SIMPLESTATE: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__REGION_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___CAN_MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SUPER_STATE___MOVE_TO__REGION_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SUPER_STATE___SMOVE_TO__REGION_INT_INT: return ScchartPackage.INITILAL_SUPER_STATE___SMOVE_TO__REGION_INT_INT;
				case ScchartPackage.SUPER_STATE___GET_CONTAINER: return ScchartPackage.INITILAL_SUPER_STATE___GET_CONTAINER;
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
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INTERNAL_INITILAL_SUPER_STATE:
				return getInternalInitilalSuperState();
			case ScchartPackage.INITILAL_SUPER_STATE___IS_EXACTLY_INITILAL_SUPER_STATE:
				return isExactlyInitilalSuperState();
			case ScchartPackage.INITILAL_SUPER_STATE___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.INITILAL_SUPER_STATE___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_NODES:
				return getNodes();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_SUPER_STATE_DECLARATION_NODES:
				return getSuperStateDeclarationNodes();
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_SUPER_STATE_DECLARATION_NODE:
				return canNewSuperStateDeclarationNode();
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__INT_INT:
				return newSuperStateDeclarationNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__STRING_INT_INT:
				return newSuperStateDeclarationNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__INT_INT_INT_INT:
				return newSuperStateDeclarationNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_SUPER_STATE_DECLARATION_NODE__STRING_INT_INT_INT_INT:
				return newSuperStateDeclarationNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.INITILAL_SUPER_STATE___GET_REGIONS:
				return getRegions();
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_REGION:
				return canNewRegion();
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_REGION__INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_REGION__STRING_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_REGION__INT_INT_INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_REGION__STRING_INT_INT_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING:
				return getOutgoing();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_SUCCESSORS:
				return getSuccessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING:
				return getIncoming();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_PREDECESSORS:
				return getPredecessors();
			case ScchartPackage.INITILAL_SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS:
				return getOutgoingStrongAbortTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_TERMINATION_TRANSITIONS:
				return getOutgoingImmediateTerminationTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_IMMEDIATE_TRANSITIONS:
				return getOutgoingImmediateTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_WEAK_ABORT_TRANSITIONS:
				return getOutgoingWeakAbortTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_DEFFERED_TRANSITIONS:
				return getOutgoingDefferedTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_WEAK_ABORT_TERMINATION_TRANSITIONS:
				return getOutgoingWeakAbortTerminationTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_STRONG_ABORT_TRANSITIONS:
				return getIncomingStrongAbortTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_TERMINATION_TRANSITIONS:
				return getIncomingImmediateTerminationTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_IMMEDIATE_TRANSITIONS:
				return getIncomingImmediateTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_WEAK_ABORT_TRANSITIONS:
				return getIncomingWeakAbortTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_DEFFERED_TRANSITIONS:
				return getIncomingDefferedTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_WEAK_ABORT_TERMINATION_TRANSITIONS:
				return getIncomingWeakAbortTerminationTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS:
				return getInitilalSuperStatePredecessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS:
				return getInitilalSuperStateSuccessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return canNewStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return newStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newStrongAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return canNewStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return newStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING:
				return newStrongAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return canNewStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return newStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return canNewStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return newStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING:
				return newStrongAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return canNewStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return newStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newStrongAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewImmediateTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE:
				return newImmediateTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newImmediateTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR:
				return canNewImmediateTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR:
				return newImmediateTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newImmediateTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return newImmediateTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateTerminationTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__SUPERSTATE:
				return canNewImmediateTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SUPERSTATE:
				return newImmediateTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SUPERSTATE_STRING:
				return newImmediateTerminationTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE:
				return canNewImmediateTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE:
				return newImmediateTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newImmediateTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewImmediateTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE:
				return newImmediateTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return canNewImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return newImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING:
				return newImmediateTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return canNewImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return newImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING:
				return newImmediateTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE:
				return newImmediateTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE:
				return canNewImmediateTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE:
				return newImmediateTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING:
				return newImmediateTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return canNewImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return newImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING:
				return newImmediateTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return canNewImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return newImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__INITIALSTATE:
				return canNewWeakAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITIALSTATE:
				return newWeakAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newWeakAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__CONNECTOR:
				return canNewWeakAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__CONNECTOR:
				return newWeakAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__CONNECTOR_STRING:
				return newWeakAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__INITILALSUPERSTATE:
				return canNewWeakAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITILALSUPERSTATE:
				return newWeakAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__INITILALSUPERSTATE_STRING:
				return newWeakAbortTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__SUPERSTATE:
				return canNewWeakAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SUPERSTATE:
				return newWeakAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SUPERSTATE_STRING:
				return newWeakAbortTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__FINALSTATE:
				return canNewWeakAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__FINALSTATE:
				return newWeakAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__FINALSTATE_STRING:
				return newWeakAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE:
				return canNewWeakAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE:
				return newWeakAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newWeakAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__INITIALSTATE:
				return canNewDefferedTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__INITIALSTATE:
				return newDefferedTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__INITIALSTATE_STRING:
				return newDefferedTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__CONNECTOR:
				return canNewDefferedTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__CONNECTOR:
				return newDefferedTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__CONNECTOR_STRING:
				return newDefferedTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__INITILALSUPERSTATE:
				return canNewDefferedTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__INITILALSUPERSTATE:
				return newDefferedTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newDefferedTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__SUPERSTATE:
				return canNewDefferedTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__SUPERSTATE:
				return newDefferedTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__SUPERSTATE_STRING:
				return newDefferedTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__FINALSTATE:
				return canNewDefferedTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__FINALSTATE:
				return newDefferedTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__FINALSTATE_STRING:
				return newDefferedTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_DEFFERED_TRANSITION__SIMPLESTATE:
				return canNewDefferedTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__SIMPLESTATE:
				return newDefferedTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_DEFFERED_TRANSITION__SIMPLESTATE_STRING:
				return newDefferedTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewWeakAbortTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE:
				return newWeakAbortTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newWeakAbortTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR:
				return canNewWeakAbortTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR:
				return newWeakAbortTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newWeakAbortTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return canNewWeakAbortTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return newWeakAbortTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING:
				return newWeakAbortTerminationTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUPERSTATE:
				return canNewWeakAbortTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUPERSTATE:
				return newWeakAbortTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUPERSTATE_STRING:
				return newWeakAbortTerminationTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE:
				return canNewWeakAbortTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE:
				return newWeakAbortTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newWeakAbortTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewWeakAbortTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE:
				return newWeakAbortTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newWeakAbortTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__INITIALSTATE:
				return canNewTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__INITIALSTATE:
				return newTransition((InitialState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__INITIALSTATE_STRING:
				return newTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__CONNECTOR:
				return canNewTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__CONNECTOR:
				return newTransition((Connector)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__CONNECTOR_STRING:
				return newTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__INITILALSUPERSTATE:
				return canNewTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE:
				return newTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__SUPERSTATE:
				return canNewTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__SUPERSTATE:
				return newTransition((SuperState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__SUPERSTATE_STRING:
				return newTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__FINALSTATE:
				return canNewTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__FINALSTATE:
				return newTransition((FinalState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__FINALSTATE_STRING:
				return newTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_NEW_TRANSITION__SIMPLESTATE:
				return canNewTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__SIMPLESTATE:
				return newTransition((SimpleState)arguments.get(0));
			case ScchartPackage.INITILAL_SUPER_STATE___NEW_TRANSITION__SIMPLESTATE_STRING:
				return newTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.INITILAL_SUPER_STATE___CAN_MOVE_TO__REGION_INT_INT:
				return canMoveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.INITILAL_SUPER_STATE___MOVE_TO__REGION_INT_INT:
				moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___SMOVE_TO__REGION_INT_INT:
				s_moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.INITILAL_SUPER_STATE___GET_CONTAINER:
				return getContainer();
			case ScchartPackage.INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_VIEW:
				return getInitilalSuperStateView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InitilalSuperStateImpl

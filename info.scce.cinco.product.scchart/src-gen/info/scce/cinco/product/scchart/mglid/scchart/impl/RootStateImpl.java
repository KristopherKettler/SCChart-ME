/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.Direction;
import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.ModelElementContainerImpl;

import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalPackage;

import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperStateRegion;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;
import info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState;

import info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.impl.RootStateImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootStateImpl extends ModelElementContainerImpl implements RootState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getRootState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElement getInternalElement() {
		if (eContainerFeatureID() != ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT) return null;
		return (InternalModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(InternalModelElement newInternalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInternalElement, ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalElement(InternalModelElement newInternalElement) {
		if (newInternalElement != eInternalContainer() || (eContainerFeatureID() != ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT && newInternalElement != null)) {
			if (EcoreUtil.isAncestor(this, newInternalElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInternalElement != null)
				msgs = ((InternalEObject)newInternalElement).eInverseAdd(this, InternalPackage.INTERNAL_MODEL_ELEMENT__ELEMENT, InternalModelElement.class, msgs);
			msgs = basicSetInternalElement(newInternalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT, newInternalElement, newInternalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalRootState().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalRootState().getElement().transact("Set Label", () -> {
			getInternalRootState().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperStateDeclaration> getDeclaration() {
		return getInternalRootState().getDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaration(final EList<SuperStateDeclaration> _arg) {
		getInternalRootState().getElement().transact("Set Declaration", () -> {
			getInternalRootState().getDeclaration().clear();
			getInternalRootState().getDeclaration().addAll(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addDeclaration(final SuperStateDeclaration _arg) {
		getInternalRootState().getElement().transact("Set Declaration", () -> {
			getInternalRootState().getDeclaration().add(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeDeclaration(final SuperStateDeclaration declaration) {
		getInternalRootState().getElement().transact("Set Declaration", () -> {
			getInternalRootState().getDeclaration().remove(declaration);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRootState getInternalRootState() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyRootState() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		// event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_RootState
		de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void>("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_RootState", eventPayload);
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
		// event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_RootState
		de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Runnable> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Runnable>("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_RootState", eventPayload);
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
	public EList<SuperStateRegion> getSuperStateRegions() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSuperStateRegion() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateRegion newSuperStateRegion(final int x, final int y) {
		return newSuperStateRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateRegion newSuperStateRegion(final String id, final int x, final int y) {
		return newSuperStateRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateRegion newSuperStateRegion(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuperStateRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateRegion newSuperStateRegion(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuperStateRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion.class, this.getClass()));
		
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
	public void s_moveTo(final ModelElementContainer container, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preMove(final ModelElementContainer newContainer, final int newX, final int newY) {
		// event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_RootState
		de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>(this, newContainer, newX, newY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void>("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_RootState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		// event.post.move.info_scce_cinco_product_scchart_mglid_scchart_RootState
		de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>(this, source, x - deltaX, y - deltaY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void>("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_RootState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		// event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_RootState
		de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>(this, newWidth, newHeight, newX, newY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void>("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_RootState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		// event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_RootState
		de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>(this, oldWidth, oldHeight, oldX, oldY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void>("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_RootState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
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
	public EList<StrongAbortTransition> getOutgoingStrongAbortTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
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
	public EList<ImmediateTransition> getOutgoingImmediateTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
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
	public EList<ImmediateTerminationTransition> getOutgoingImmediateTerminationTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
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
	public EList<SubSuperState> getSubSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SubSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSubSuperState> getInitilalSubSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState.class);
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
	public boolean canNewDefferedTransition(final InitilalSubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransition newDefferedTransition(final InitilalSubSuperState target) {
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
	public DefferedTransition newDefferedTransition(final InitilalSubSuperState target, final String id) {
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
	public boolean canNewDefferedTransition(final SubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DefferedTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefferedTransition newDefferedTransition(final SubSuperState target) {
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
	public DefferedTransition newDefferedTransition(final SubSuperState target, final String id) {
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
	public boolean canNewStrongAbortTransition(final InitilalSubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitilalSubSuperState target) {
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
	public StrongAbortTransition newStrongAbortTransition(final InitilalSubSuperState target, final String id) {
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
	public boolean canNewStrongAbortTransition(final SubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SubSuperState target) {
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
	public StrongAbortTransition newStrongAbortTransition(final SubSuperState target, final String id) {
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
	public boolean canNewTransition(final InitilalSubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitilalSubSuperState target) {
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
	public Transition newTransition(final InitilalSubSuperState target, final String id) {
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
	public boolean canNewTransition(final SubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SubSuperState target) {
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
	public Transition newTransition(final SubSuperState target, final String id) {
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
	public boolean canNewImmediateTransition(final InitilalSubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final InitilalSubSuperState target) {
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
	public ImmediateTransition newImmediateTransition(final InitilalSubSuperState target, final String id) {
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
	public boolean canNewImmediateTransition(final SubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final SubSuperState target) {
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
	public ImmediateTransition newImmediateTransition(final SubSuperState target, final String id) {
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
	public boolean canNewWeakAbortTerminationTransition(final InitilalSubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final InitilalSubSuperState target) {
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
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final InitilalSubSuperState target, final String id) {
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
	public boolean canNewWeakAbortTerminationTransition(final SubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final SubSuperState target) {
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
	public WeakAbortTerminationTransition newWeakAbortTerminationTransition(final SubSuperState target, final String id) {
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
	public boolean canNewImmediateTerminationTransition(final InitilalSubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTerminationTransition newImmediateTerminationTransition(final InitilalSubSuperState target) {
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
	public ImmediateTerminationTransition newImmediateTerminationTransition(final InitilalSubSuperState target, final String id) {
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
	public boolean canNewImmediateTerminationTransition(final SubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTerminationTransition newImmediateTerminationTransition(final SubSuperState target) {
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
	public ImmediateTerminationTransition newImmediateTerminationTransition(final SubSuperState target, final String id) {
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
	public boolean canNewWeakAbortTransition(final InitilalSubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransition newWeakAbortTransition(final InitilalSubSuperState target) {
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
	public WeakAbortTransition newWeakAbortTransition(final InitilalSubSuperState target, final String id) {
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
	public boolean canNewWeakAbortTransition(final SubSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeakAbortTransition newWeakAbortTransition(final SubSuperState target) {
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
	public WeakAbortTransition newWeakAbortTransition(final SubSuperState target, final String id) {
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
	public boolean canMoveTo(final SCChart sCChart, final int x, final int y) {
		return sCChart.canContain(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final SCChart sCChart, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(sCChart, x, y);
			s_moveTo(sCChart, x, y);
			sCChart.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, sCChart, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final SCChart sCChart, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final SubSuperStateRegion subSuperStateRegion, final int x, final int y) {
		return subSuperStateRegion.canContain(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final SubSuperStateRegion subSuperStateRegion, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(subSuperStateRegion, x, y);
			s_moveTo(subSuperStateRegion, x, y);
			subSuperStateRegion.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, subSuperStateRegion, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final SubSuperStateRegion subSuperStateRegion, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootStateView getRootStateView() {
		RootStateView rootStateView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createRootStateView();
		rootStateView.setInternalRootState((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState)getInternalElement());
		return rootStateView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElementContainer getInternalContainerElement() {
		return (InternalModelElementContainer)getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void delete() {
		preDelete();
		Runnable postDeleteFunction = getPostDeleteFunction();
		Runnable postDeleteEvent = getPostDeleteEvent();
		for (graphmodel.Node child : getAllNodes())
			child.delete();
		if (getInternalElement() == null) return; //deleting children might have hook-deleted myself
		java.util.HashSet<graphmodel.Edge> allEdges = new java.util.HashSet<>();
		allEdges.addAll(getIncoming());
		allEdges.addAll(getOutgoing());
		for (graphmodel.Edge edge : allEdges)
			edge.delete();
		if (getInternalElement() == null) return; //deleting edges might have hook-deleted myself
		transact("Delete", () -> {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(this.getInternalElement());
			org.eclipse.emf.ecore.util.EcoreUtil.delete(this);
		});
		postDeleteFunction.run();
		postDeleteEvent.run();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> EList<T> getSuccessors(final Class<T> clazz) {
		@SuppressWarnings("all")
		java.util.List<T> successors =(java.util.List<T>) ((graphmodel.internal.InternalNode)this.getInternalElement()).
				getSuccessors().stream().
					map(me -> me.getElement()).
						filter(me -> clazz.isAssignableFrom(((Node)me).getClass())).
							collect(java.util.stream.Collectors.toList());
				
		EList<T> retval = new org.eclipse.emf.common.util.BasicEList<T>();
		retval.addAll(successors);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <M extends Node> EList<M> getPredecessors() {
		EList<graphmodel.internal.InternalNode> iSucc= ((graphmodel.internal.InternalNode) this.getInternalElement()).getPredecessors();
		@SuppressWarnings("unchecked")
		java.util.List<M> collect = iSucc.stream().map(iNode -> (M) iNode.getElement()).collect(java.util.stream.Collectors.toList());
		EList<M> successors = new org.eclipse.emf.common.util.BasicEList<M>(collect);
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> EList<T> getPredecessors(final Class<T> clazz) {
		@SuppressWarnings("all")
		java.util.List<T> successors =(java.util.List<T>) ((graphmodel.internal.InternalNode)this.getInternalElement()).
				getPredecessors().stream().
					map(me -> me.getElement()).
						filter(me -> clazz.isAssignableFrom(((Node)me).getClass())).
							collect(java.util.stream.Collectors.toList());
				
		EList<T> retval = new org.eclipse.emf.common.util.BasicEList<T>();
		retval.addAll(successors);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getIncoming(final Class<T> clazz) {
		java.util.List<T> it = ((graphmodel.internal.InternalNode) getInternalElement()).getIncoming().stream()
						.filter(iNode -> clazz.isInstance(iNode.getElement())).map(iNode -> clazz.cast(iNode.getElement()))
						.collect(java.util.stream.Collectors.toList());
				org.eclipse.emf.common.util.BasicEList<T> bl = new org.eclipse.emf.common.util.BasicEList<T>();
				bl.addAll(it);
				return bl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getOutgoing(final Class<T> clazz) {
		java.util.List<T> it = ((graphmodel.internal.InternalNode) getInternalElement()).getOutgoing().stream()
						.filter(iNode -> clazz.isInstance(iNode.getElement())).map(iNode -> clazz.cast(iNode.getElement()))
						.collect(java.util.stream.Collectors.toList());
				org.eclipse.emf.common.util.BasicEList<T> bl = new org.eclipse.emf.common.util.BasicEList<T>();
				bl.addAll(it);
				return bl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canConnect(final Edge with, final Node to) {
		return canStart(with.getClass())&& to.canEnd(with.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		return ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoingConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		return ((graphmodel.internal.InternalNode)getInternalElement()).getIncomingConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canStart(final Class<? extends Edge> edgeType) {
		return ((graphmodel.internal.InternalNode)getInternalElement()).canStart(edgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canEnd(final Class<? extends Edge> edgeType) {
		return ((graphmodel.internal.InternalNode)getInternalElement()).canEnd(edgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void move(final int x, final int y) {
		transact("Move", () -> {
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			if (deltaX != 0 || deltaY != 0)
				preMove(getContainer(), x, y);
			if (deltaX != 0)
				ime.setX(x);
			if (deltaY != 0)
				ime.setY(y);
			if (deltaX != 0 || deltaY != 0)
				postMove(getContainer(), getContainer(), x, y, deltaX, deltaY);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void resize(final int width, final int height) {
		resize(width,  height, getX(), getY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void resize(final int width, final int height, final int x, final int y) {
		transact("Resize", () -> {
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) getInternalElement();
			int oldWidth  = ime.getWidth();
			int oldHeight = ime.getHeight();
			int oldX      = ime.getX();
			int oldY      = ime.getY();
			boolean widthChanged  = width  != oldWidth;
			boolean heightChanged = height != oldHeight;
			boolean xChanged      = x != oldX;
			boolean yChanged      = y != oldY;
			graphmodel.Direction direction = graphmodel.Direction.UNSPECIFIED;
			if (widthChanged || heightChanged || xChanged || yChanged) {
				boolean north = heightChanged &&  yChanged;
				boolean south = heightChanged && !yChanged;
				boolean west  = widthChanged  &&  xChanged;
				boolean east  = widthChanged  && !xChanged;
				direction =
					( north && !south && !west && !east) ? graphmodel.Direction.NORTH      :
					( north && !south && !west &&  east) ? graphmodel.Direction.NORTH_EAST :
					(!north && !south && !west &&  east) ? graphmodel.Direction.EAST       :
					(!north &&  south && !west &&  east) ? graphmodel.Direction.SOUTH_EAST :
					(!north &&  south && !west && !east) ? graphmodel.Direction.SOUTH      :
					(!north &&  south &&  west && !east) ? graphmodel.Direction.SOUTH_WEST :
					(!north && !south &&  west && !east) ? graphmodel.Direction.WEST       :
					( north && !south &&  west && !east) ? graphmodel.Direction.NORTH_WEST :
					                                       graphmodel.Direction.UNSPECIFIED;
				this.preResize(width, height, x, y, direction);
			}
			if (widthChanged)  ime.setWidth(width);
			if (heightChanged) ime.setHeight(height);
			if (xChanged)      ime.setX(x);
			if (yChanged)      ime.setY(y);
			if (widthChanged || heightChanged || xChanged || yChanged) {
				this.postResize(oldWidth, oldHeight, oldX, oldY, direction);
				this.update();
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final ModelElementContainer targetContainer) {
		return targetContainer.canContain(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final ModelElementContainer targetContainer, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(targetContainer, x, y);
			s_moveTo(targetContainer, x, y);
			targetContainer.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, targetContainer, x, y, deltaX, deltaY);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canClone(final ModelElementContainer targetContainer) {
		return targetContainer.canContain(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> T clone(final ModelElementContainer targetContainer) {
		graphmodel.internal.InternalNode copy = (graphmodel.internal.InternalNode) org.eclipse.emf.ecore.util.EcoreUtil.copy(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy, getInternalElement().getId());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy.getElement(), getId());
		targetContainer.getInternalContainerElement().getModelElements().add(copy);
		@SuppressWarnings("unchecked")
		T t = (T) copy.getElement();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getX();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getY();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getWidth();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getHeight();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> T copy(final ModelElementContainer targetContainer) {
		graphmodel.internal.InternalNode copy = (graphmodel.internal.InternalNode) org.eclipse.emf.ecore.util.EcoreUtil.copy(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
		targetContainer.getInternalContainerElement().getModelElements().add(copy);
		@SuppressWarnings("unchecked")
		T t = (T) copy.getElement();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(final int x) {
		transact("Set x", () -> {
		((graphmodel.internal.InternalNode) getInternalElement()).setX(x);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(final int y) {
		transact("Set Y", () -> {
		((graphmodel.internal.InternalNode) getInternalElement()).setY(y);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(final int width) {
		transact("Set width", () -> {
			((graphmodel.internal.InternalNode) getInternalElement()).setWidth(width);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(final int height) {
		transact("Set height", () -> {
			((graphmodel.internal.InternalNode) getInternalElement()).setHeight(height);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLayer() {
		return getContainer().getModelElements().indexOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getIncoming() {
		return (EList<T>)getIncoming(graphmodel.Edge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getUntypedIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalNode)getInternalElement()).getIncoming();
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
	public EList<Edge> getUntypedOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoing();
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
	public ModelElementContainer getContainer() {
		return getInternalElement().getContainer().getContainerElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void highlight() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void update() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void updateGraphModel() {
		this.getRootElement().updateModelElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInternalElement((InternalModelElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT:
				return basicSetInternalElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, InternalPackage.INTERNAL_MODEL_ELEMENT__ELEMENT, InternalModelElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT:
				return getInternalElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT:
				setInternalElement((InternalModelElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT:
				setInternalElement((InternalModelElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT:
				return getInternalElement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT: return GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT: return ScchartPackage.ROOT_STATE__INTERNAL_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.ROOT_STATE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.ROOT_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT: return ScchartPackage.ROOT_STATE___GET_INTERNAL_CONTAINER_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return ScchartPackage.ROOT_STATE___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return ScchartPackage.ROOT_STATE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return ScchartPackage.ROOT_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return ScchartPackage.ROOT_STATE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.ROOT_STATE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___HIGHLIGHT: return ScchartPackage.ROOT_STATE___HIGHLIGHT;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE: return ScchartPackage.ROOT_STATE___UPDATE;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE_GRAPH_MODEL: return ScchartPackage.ROOT_STATE___UPDATE_GRAPH_MODEL;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return ScchartPackage.ROOT_STATE___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS: return ScchartPackage.ROOT_STATE___GET_SUCCESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return ScchartPackage.ROOT_STATE___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS: return ScchartPackage.ROOT_STATE___GET_PREDECESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_INCOMING__CLASS: return ScchartPackage.ROOT_STATE___GET_INCOMING__CLASS;
				case GraphmodelPackage.NODE___GET_OUTGOING__CLASS: return ScchartPackage.ROOT_STATE___GET_OUTGOING__CLASS;
				case GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE: return ScchartPackage.ROOT_STATE___CAN_CONNECT__EDGE_NODE;
				case GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS: return ScchartPackage.ROOT_STATE___GET_OUTGOING_CONSTRAINTS;
				case GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS: return ScchartPackage.ROOT_STATE___GET_INCOMING_CONSTRAINTS;
				case GraphmodelPackage.NODE___CAN_START__CLASS: return ScchartPackage.ROOT_STATE___CAN_START__CLASS;
				case GraphmodelPackage.NODE___CAN_END__CLASS: return ScchartPackage.ROOT_STATE___CAN_END__CLASS;
				case GraphmodelPackage.NODE___MOVE__INT_INT: return ScchartPackage.ROOT_STATE___MOVE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT: return ScchartPackage.ROOT_STATE___RESIZE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT: return ScchartPackage.ROOT_STATE___RESIZE__INT_INT_INT_INT;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.ROOT_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.ROOT_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___DELETE: return ScchartPackage.ROOT_STATE___DELETE;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.ROOT_STATE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.ROOT_STATE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.ROOT_STATE___PRE_DELETE;
				case GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER: return ScchartPackage.ROOT_STATE___CAN_MOVE_TO__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.ROOT_STATE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER: return ScchartPackage.ROOT_STATE___CAN_CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER: return ScchartPackage.ROOT_STATE___CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___GET_X: return ScchartPackage.ROOT_STATE___GET_X;
				case GraphmodelPackage.NODE___GET_Y: return ScchartPackage.ROOT_STATE___GET_Y;
				case GraphmodelPackage.NODE___GET_WIDTH: return ScchartPackage.ROOT_STATE___GET_WIDTH;
				case GraphmodelPackage.NODE___GET_HEIGHT: return ScchartPackage.ROOT_STATE___GET_HEIGHT;
				case GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER: return ScchartPackage.ROOT_STATE___COPY__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___SET_X__INT: return ScchartPackage.ROOT_STATE___SET_X__INT;
				case GraphmodelPackage.NODE___SET_Y__INT: return ScchartPackage.ROOT_STATE___SET_Y__INT;
				case GraphmodelPackage.NODE___SET_WIDTH__INT: return ScchartPackage.ROOT_STATE___SET_WIDTH__INT;
				case GraphmodelPackage.NODE___SET_HEIGHT__INT: return ScchartPackage.ROOT_STATE___SET_HEIGHT__INT;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.ROOT_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.ROOT_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___GET_LAYER: return ScchartPackage.ROOT_STATE___GET_LAYER;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.ROOT_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return ScchartPackage.ROOT_STATE___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return ScchartPackage.ROOT_STATE___GET_OUTGOING;
				case GraphmodelPackage.NODE___GET_UNTYPED_INCOMING: return ScchartPackage.ROOT_STATE___GET_UNTYPED_INCOMING;
				case GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING: return ScchartPackage.ROOT_STATE___GET_UNTYPED_OUTGOING;
				default: return -1;
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
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ScchartPackage.ROOT_STATE___GET_LABEL:
				return getLabel();
			case ScchartPackage.ROOT_STATE___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE___GET_DECLARATION:
				return getDeclaration();
			case ScchartPackage.ROOT_STATE___SET_DECLARATION__ELIST:
				setDeclaration((EList<SuperStateDeclaration>)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE___ADD_DECLARATION__SUPERSTATEDECLARATION:
				addDeclaration((SuperStateDeclaration)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE___REMOVE_DECLARATION__SUPERSTATEDECLARATION:
				removeDeclaration((SuperStateDeclaration)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE___GET_INTERNAL_ROOT_STATE:
				return getInternalRootState();
			case ScchartPackage.ROOT_STATE___IS_EXACTLY_ROOT_STATE:
				return isExactlyRootState();
			case ScchartPackage.ROOT_STATE___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.ROOT_STATE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.ROOT_STATE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.ROOT_STATE___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.ROOT_STATE___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.ROOT_STATE___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.ROOT_STATE___GET_NODES:
				return getNodes();
			case ScchartPackage.ROOT_STATE___GET_SUPER_STATE_REGIONS:
				return getSuperStateRegions();
			case ScchartPackage.ROOT_STATE___CAN_NEW_SUPER_STATE_REGION:
				return canNewSuperStateRegion();
			case ScchartPackage.ROOT_STATE___NEW_SUPER_STATE_REGION__INT_INT:
				return newSuperStateRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.ROOT_STATE___NEW_SUPER_STATE_REGION__STRING_INT_INT:
				return newSuperStateRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.ROOT_STATE___NEW_SUPER_STATE_REGION__INT_INT_INT_INT:
				return newSuperStateRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.ROOT_STATE___NEW_SUPER_STATE_REGION__STRING_INT_INT_INT_INT:
				return newSuperStateRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.ROOT_STATE___GET_SUPER_STATE_DECLARATION_NODES:
				return getSuperStateDeclarationNodes();
			case ScchartPackage.ROOT_STATE___CAN_NEW_SUPER_STATE_DECLARATION_NODE:
				return canNewSuperStateDeclarationNode();
			case ScchartPackage.ROOT_STATE___NEW_SUPER_STATE_DECLARATION_NODE__INT_INT:
				return newSuperStateDeclarationNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.ROOT_STATE___NEW_SUPER_STATE_DECLARATION_NODE__STRING_INT_INT:
				return newSuperStateDeclarationNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.ROOT_STATE___NEW_SUPER_STATE_DECLARATION_NODE__INT_INT_INT_INT:
				return newSuperStateDeclarationNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.ROOT_STATE___NEW_SUPER_STATE_DECLARATION_NODE__STRING_INT_INT_INT_INT:
				return newSuperStateDeclarationNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.ROOT_STATE___GET_OUTGOING:
				return getOutgoing();
			case ScchartPackage.ROOT_STATE___GET_SUCCESSORS:
				return getSuccessors();
			case ScchartPackage.ROOT_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.ROOT_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.ROOT_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.ROOT_STATE___GET_OUTGOING_DEFFERED_TRANSITIONS:
				return getOutgoingDefferedTransitions();
			case ScchartPackage.ROOT_STATE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS:
				return getOutgoingStrongAbortTransitions();
			case ScchartPackage.ROOT_STATE___GET_OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case ScchartPackage.ROOT_STATE___GET_OUTGOING_IMMEDIATE_TRANSITIONS:
				return getOutgoingImmediateTransitions();
			case ScchartPackage.ROOT_STATE___GET_OUTGOING_WEAK_ABORT_TERMINATION_TRANSITIONS:
				return getOutgoingWeakAbortTerminationTransitions();
			case ScchartPackage.ROOT_STATE___GET_OUTGOING_IMMEDIATE_TERMINATION_TRANSITIONS:
				return getOutgoingImmediateTerminationTransitions();
			case ScchartPackage.ROOT_STATE___GET_OUTGOING_WEAK_ABORT_TRANSITIONS:
				return getOutgoingWeakAbortTransitions();
			case ScchartPackage.ROOT_STATE___GET_SUB_SUPER_STATE_SUCCESSORS:
				return getSubSuperStateSuccessors();
			case ScchartPackage.ROOT_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS:
				return getInitilalSubSuperStateSuccessors();
			case ScchartPackage.ROOT_STATE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case ScchartPackage.ROOT_STATE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case ScchartPackage.ROOT_STATE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case ScchartPackage.ROOT_STATE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
			case ScchartPackage.ROOT_STATE___CAN_NEW_DEFFERED_TRANSITION__INITILALSUBSUPERSTATE:
				return canNewDefferedTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__INITILALSUBSUPERSTATE:
				return newDefferedTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__INITILALSUBSUPERSTATE_STRING:
				return newDefferedTransition((InitilalSubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_DEFFERED_TRANSITION__SUBSUPERSTATE:
				return canNewDefferedTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__SUBSUPERSTATE:
				return newDefferedTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__SUBSUPERSTATE_STRING:
				return newDefferedTransition((SubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_DEFFERED_TRANSITION__CONNECTOR:
				return canNewDefferedTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__CONNECTOR:
				return newDefferedTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__CONNECTOR_STRING:
				return newDefferedTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_DEFFERED_TRANSITION__INITIALSTATE:
				return canNewDefferedTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__INITIALSTATE:
				return newDefferedTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__INITIALSTATE_STRING:
				return newDefferedTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_DEFFERED_TRANSITION__SIMPLESTATE:
				return canNewDefferedTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__SIMPLESTATE:
				return newDefferedTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__SIMPLESTATE_STRING:
				return newDefferedTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_DEFFERED_TRANSITION__FINALSTATE:
				return canNewDefferedTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__FINALSTATE:
				return newDefferedTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_DEFFERED_TRANSITION__FINALSTATE_STRING:
				return newDefferedTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUBSUPERSTATE:
				return canNewStrongAbortTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUBSUPERSTATE:
				return newStrongAbortTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUBSUPERSTATE_STRING:
				return newStrongAbortTransition((InitilalSubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SUBSUPERSTATE:
				return canNewStrongAbortTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__SUBSUPERSTATE:
				return newStrongAbortTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__SUBSUPERSTATE_STRING:
				return newStrongAbortTransition((SubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return canNewStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return newStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING:
				return newStrongAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return canNewStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return newStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newStrongAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return canNewStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return newStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newStrongAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return canNewStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return newStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING:
				return newStrongAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_TRANSITION__INITILALSUBSUPERSTATE:
				return canNewTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__INITILALSUBSUPERSTATE:
				return newTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__INITILALSUBSUPERSTATE_STRING:
				return newTransition((InitilalSubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_TRANSITION__SUBSUPERSTATE:
				return canNewTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__SUBSUPERSTATE:
				return newTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__SUBSUPERSTATE_STRING:
				return newTransition((SubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_TRANSITION__CONNECTOR:
				return canNewTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__CONNECTOR:
				return newTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__CONNECTOR_STRING:
				return newTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_TRANSITION__INITIALSTATE:
				return canNewTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__INITIALSTATE:
				return newTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__INITIALSTATE_STRING:
				return newTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_TRANSITION__SIMPLESTATE:
				return canNewTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__SIMPLESTATE:
				return newTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__SIMPLESTATE_STRING:
				return newTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_TRANSITION__FINALSTATE:
				return canNewTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__FINALSTATE:
				return newTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_TRANSITION__FINALSTATE_STRING:
				return newTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUBSUPERSTATE:
				return canNewImmediateTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUBSUPERSTATE:
				return newImmediateTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUBSUPERSTATE_STRING:
				return newImmediateTransition((InitilalSubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SUBSUPERSTATE:
				return canNewImmediateTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__SUBSUPERSTATE:
				return newImmediateTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__SUBSUPERSTATE_STRING:
				return newImmediateTransition((SubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return canNewImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return newImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING:
				return newImmediateTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return canNewImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return newImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING:
				return newImmediateTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return canNewImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return newImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return canNewImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return newImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING:
				return newImmediateTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUBSUPERSTATE:
				return canNewWeakAbortTerminationTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUBSUPERSTATE:
				return newWeakAbortTerminationTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITILALSUBSUPERSTATE_STRING:
				return newWeakAbortTerminationTransition((InitilalSubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUBSUPERSTATE:
				return canNewWeakAbortTerminationTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUBSUPERSTATE:
				return newWeakAbortTerminationTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SUBSUPERSTATE_STRING:
				return newWeakAbortTerminationTransition((SubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR:
				return canNewWeakAbortTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR:
				return newWeakAbortTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newWeakAbortTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewWeakAbortTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE:
				return newWeakAbortTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newWeakAbortTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewWeakAbortTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE:
				return newWeakAbortTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newWeakAbortTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE:
				return canNewWeakAbortTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE:
				return newWeakAbortTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newWeakAbortTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUBSUPERSTATE:
				return canNewImmediateTerminationTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUBSUPERSTATE:
				return newImmediateTerminationTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITILALSUBSUPERSTATE_STRING:
				return newImmediateTerminationTransition((InitilalSubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__SUBSUPERSTATE:
				return canNewImmediateTerminationTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SUBSUPERSTATE:
				return newImmediateTerminationTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SUBSUPERSTATE_STRING:
				return newImmediateTerminationTransition((SubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR:
				return canNewImmediateTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR:
				return newImmediateTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newImmediateTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewImmediateTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE:
				return newImmediateTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newImmediateTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewImmediateTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE:
				return newImmediateTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE:
				return canNewImmediateTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE:
				return newImmediateTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_IMMEDIATE_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newImmediateTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__INITILALSUBSUPERSTATE:
				return canNewWeakAbortTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__INITILALSUBSUPERSTATE:
				return newWeakAbortTransition((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__INITILALSUBSUPERSTATE_STRING:
				return newWeakAbortTransition((InitilalSubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__SUBSUPERSTATE:
				return canNewWeakAbortTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__SUBSUPERSTATE:
				return newWeakAbortTransition((SubSuperState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__SUBSUPERSTATE_STRING:
				return newWeakAbortTransition((SubSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__CONNECTOR:
				return canNewWeakAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__CONNECTOR:
				return newWeakAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__CONNECTOR_STRING:
				return newWeakAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__INITIALSTATE:
				return canNewWeakAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__INITIALSTATE:
				return newWeakAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newWeakAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE:
				return canNewWeakAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE:
				return newWeakAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newWeakAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_NEW_WEAK_ABORT_TRANSITION__FINALSTATE:
				return canNewWeakAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__FINALSTATE:
				return newWeakAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.ROOT_STATE___NEW_WEAK_ABORT_TRANSITION__FINALSTATE_STRING:
				return newWeakAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.ROOT_STATE___CAN_MOVE_TO__SCCHART_INT_INT:
				return canMoveTo((SCChart)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.ROOT_STATE___MOVE_TO__SCCHART_INT_INT:
				moveTo((SCChart)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE___SMOVE_TO__SCCHART_INT_INT:
				s_moveTo((SCChart)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE___CAN_MOVE_TO__SUBSUPERSTATEREGION_INT_INT:
				return canMoveTo((SubSuperStateRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.ROOT_STATE___MOVE_TO__SUBSUPERSTATEREGION_INT_INT:
				moveTo((SubSuperStateRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE___SMOVE_TO__SUBSUPERSTATEREGION_INT_INT:
				s_moveTo((SubSuperStateRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE___GET_ROOT_STATE_VIEW:
				return getRootStateView();
			case ScchartPackage.ROOT_STATE___GET_INTERNAL_CONTAINER_ELEMENT:
				return getInternalContainerElement();
			case ScchartPackage.ROOT_STATE___DELETE:
				delete();
				return null;
			case ScchartPackage.ROOT_STATE___GET_SUCCESSORS__CLASS:
				return getSuccessors((Class)arguments.get(0));
			case ScchartPackage.ROOT_STATE___GET_PREDECESSORS:
				return getPredecessors();
			case ScchartPackage.ROOT_STATE___GET_PREDECESSORS__CLASS:
				return getPredecessors((Class)arguments.get(0));
			case ScchartPackage.ROOT_STATE___GET_INCOMING__CLASS:
				return getIncoming((Class)arguments.get(0));
			case ScchartPackage.ROOT_STATE___GET_OUTGOING__CLASS:
				return getOutgoing((Class)arguments.get(0));
			case ScchartPackage.ROOT_STATE___CAN_CONNECT__EDGE_NODE:
				return canConnect((Edge)arguments.get(0), (Node)arguments.get(1));
			case ScchartPackage.ROOT_STATE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case ScchartPackage.ROOT_STATE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case ScchartPackage.ROOT_STATE___CAN_START__CLASS:
				return canStart((Class<? extends Edge>)arguments.get(0));
			case ScchartPackage.ROOT_STATE___CAN_END__CLASS:
				return canEnd((Class<? extends Edge>)arguments.get(0));
			case ScchartPackage.ROOT_STATE___MOVE__INT_INT:
				move((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ScchartPackage.ROOT_STATE___RESIZE__INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ScchartPackage.ROOT_STATE___RESIZE__INT_INT_INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case ScchartPackage.ROOT_STATE___CAN_MOVE_TO__MODELELEMENTCONTAINER:
				return canMoveTo((ModelElementContainer)arguments.get(0));
			case ScchartPackage.ROOT_STATE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE___CAN_CLONE__MODELELEMENTCONTAINER:
				return canClone((ModelElementContainer)arguments.get(0));
			case ScchartPackage.ROOT_STATE___CLONE__MODELELEMENTCONTAINER:
				return clone((ModelElementContainer)arguments.get(0));
			case ScchartPackage.ROOT_STATE___GET_X:
				return getX();
			case ScchartPackage.ROOT_STATE___GET_Y:
				return getY();
			case ScchartPackage.ROOT_STATE___GET_WIDTH:
				return getWidth();
			case ScchartPackage.ROOT_STATE___GET_HEIGHT:
				return getHeight();
			case ScchartPackage.ROOT_STATE___COPY__MODELELEMENTCONTAINER:
				return copy((ModelElementContainer)arguments.get(0));
			case ScchartPackage.ROOT_STATE___SET_X__INT:
				setX((Integer)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE___SET_Y__INT:
				setY((Integer)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE___SET_WIDTH__INT:
				setWidth((Integer)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE___SET_HEIGHT__INT:
				setHeight((Integer)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE___GET_LAYER:
				return getLayer();
			case ScchartPackage.ROOT_STATE___GET_INCOMING:
				return getIncoming();
			case ScchartPackage.ROOT_STATE___GET_UNTYPED_INCOMING:
				return getUntypedIncoming();
			case ScchartPackage.ROOT_STATE___GET_UNTYPED_OUTGOING:
				return getUntypedOutgoing();
			case ScchartPackage.ROOT_STATE___GET_CONTAINER:
				return getContainer();
			case ScchartPackage.ROOT_STATE___HIGHLIGHT:
				highlight();
				return null;
			case ScchartPackage.ROOT_STATE___UPDATE:
				update();
				return null;
			case ScchartPackage.ROOT_STATE___UPDATE_GRAPH_MODEL:
				updateGraphModel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RootStateImpl

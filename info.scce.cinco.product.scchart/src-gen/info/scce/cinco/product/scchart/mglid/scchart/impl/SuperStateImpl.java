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

import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView;

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
 * An implementation of the model object '<em><b>Super State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.impl.SuperStateImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperStateImpl extends ModelElementContainerImpl implements SuperState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getSuperState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElement getInternalElement() {
		if (eContainerFeatureID() != ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT) return null;
		return (InternalModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(InternalModelElement newInternalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInternalElement, ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalElement(InternalModelElement newInternalElement) {
		if (newInternalElement != eInternalContainer() || (eContainerFeatureID() != ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT && newInternalElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT, newInternalElement, newInternalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalSuperState().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalSuperState().getElement().transact("Set Label", () -> {
			getInternalSuperState().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalSuperState getInternalSuperState() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlySuperState() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		// event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
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
		// event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Runnable> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Runnable>("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
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
	public EList<DataFlowRegion> getDataFlowRegions() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDataFlowRegion() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion newDataFlowRegion(final int x, final int y) {
		return newDataFlowRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion newDataFlowRegion(final String id, final int x, final int y) {
		return newDataFlowRegion(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion newDataFlowRegion(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDataFlowRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlowRegion newDataFlowRegion(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDataFlowRegion((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperStateDeclaration> getSuperStateDeclarations() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSuperStateDeclaration() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclaration newSuperStateDeclaration(final int x, final int y) {
		return newSuperStateDeclaration(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclaration newSuperStateDeclaration(final String id, final int x, final int y) {
		return newSuperStateDeclaration(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclaration newSuperStateDeclaration(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuperStateDeclaration((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateDeclaration newSuperStateDeclaration(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuperStateDeclaration((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Suspend> getSuspends() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.Suspend.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSuspend() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Suspend.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspend newSuspend(final int x, final int y) {
		return newSuspend(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspend newSuspend(final String id, final int x, final int y) {
		return newSuspend(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspend newSuspend(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Suspend.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Suspend node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuspend((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Suspend.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suspend newSuspend(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Suspend.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Suspend node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuspend((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Suspend.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.Action.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewAction() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Action.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action newAction(final int x, final int y) {
		return newAction(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action newAction(final String id, final int x, final int y) {
		return newAction(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action newAction(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Action.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Action node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createAction((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Action.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action newAction(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Action.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Action node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createAction((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Action.class, this.getClass()));
		
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
	public EList<? extends AbstractTransition> getOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalContainer)getInternalElement()).getOutgoing();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
			.stream().map(me -> (info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition)me.getElement()).
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
	public EList<? extends AbstractTransition> getIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalContainer)getInternalElement()).getIncoming();
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(in
			.stream().map(me -> (info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition)me.getElement()).
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
		// event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this, newContainer, newX, newY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		// event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this, source, x - deltaX, y - deltaY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		// event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this, newWidth, newHeight, newX, newY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		// event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState
		de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(this, oldWidth, oldHeight, oldX, oldY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_SuperState", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationHistoryTransition> getOutgoingTerminationHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
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
	public EList<ConditionalTerminationHistoryTransition> getOutgoingConditionalTerminationHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortHistoryTransition> getOutgoingImmediateStrongAbortHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortDeferredTransition> getOutgoingStrongAbortDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationDefferdTransition> getOutgoingTerminationDefferdTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTransition> getOutgoingAbstractTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortTransition> getOutgoingImmediateStrongAbortTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortDeferredTransition> getOutgoingImmediateStrongAbortDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateHistoryTransition> getOutgoingImmediateHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortHistoryTransition> getOutgoingStrongAbortHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationTransition> getOutgoingTerminationTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateDeferredTransition> getOutgoingImmediateDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistoryTransition> getOutgoingHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeferredTransition> getOutgoingDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
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
	public EList<ImmediateTransition> getOutgoingImmediateTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationTransition> getOutgoingConditionalTerminationTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationDeferredTransition> getOutgoingConditionalTerminationDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationHistoryTransition> getIncomingTerminationHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
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
	public EList<ConditionalTerminationHistoryTransition> getIncomingConditionalTerminationHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortHistoryTransition> getIncomingImmediateStrongAbortHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortDeferredTransition> getIncomingStrongAbortDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationDefferdTransition> getIncomingTerminationDefferdTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTransition> getIncomingAbstractTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortTransition> getIncomingImmediateStrongAbortTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateStrongAbortDeferredTransition> getIncomingImmediateStrongAbortDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateHistoryTransition> getIncomingImmediateHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StrongAbortHistoryTransition> getIncomingStrongAbortHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminationTransition> getIncomingTerminationTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateDeferredTransition> getIncomingImmediateDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HistoryTransition> getIncomingHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeferredTransition> getIncomingDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
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
	public EList<ImmediateTransition> getIncomingImmediateTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationTransition> getIncomingConditionalTerminationTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalTerminationDeferredTransition> getIncomingConditionalTerminationDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class);
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
	public boolean canNewTerminationHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationHistoryTransition newTerminationHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationDefferdTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition newTerminationDefferdTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationDefferdTransition newTerminationDefferdTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationDefferdTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition newTerminationDefferdTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationDefferdTransition newTerminationDefferdTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationDefferdTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationDefferdTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationDefferdTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateStrongAbortDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateStrongAbortDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateStrongAbortDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition newImmediateHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateHistoryTransition newImmediateHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition newImmediateHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateHistoryTransition newImmediateHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewStrongAbortHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", StrongAbortHistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", StrongAbortHistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createStrongAbortHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationTransition newTerminationTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationTransition newTerminationTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationTransition newTerminationTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationTransition newTerminationTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationTransition newTerminationTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewTerminationTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public TerminationTransition newTerminationTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", TerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", TerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition newImmediateDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateDeferredTransition newImmediateDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewImmediateDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition newImmediateDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ImmediateDeferredTransition newImmediateDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ImmediateDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ImmediateDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createImmediateDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewHistoryTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public HistoryTransition newHistoryTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewHistoryTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public HistoryTransition newHistoryTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", HistoryTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", HistoryTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createHistoryTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public DeferredTransition newDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public DeferredTransition newDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", DeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", DeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final InitialState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitialState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitialState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final Connector target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final Connector target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final Connector target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final SimpleState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SimpleState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SimpleState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationTransition(final FinalState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationDeferredTransition(final SuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final SuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final SuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public boolean canNewConditionalTerminationDeferredTransition(final InitilalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final InitilalSuperState target) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition((graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final InitilalSuperState target, final String id) {
		if (!this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot start edge %s at node %s", ConditionalTerminationDeferredTransition.class, this.getClass()));
		else if (!target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class))
			throw new java.lang.RuntimeException(java.lang.String.format("Cannot end edge %s at node %s", ConditionalTerminationDeferredTransition.class, target.getClass()));
		else {
			info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition edge = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConditionalTerminationDeferredTransition(id, (graphmodel.internal.InternalNode) this.getInternalElement(), (graphmodel.internal.InternalNode) target.getInternalElement());
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
		return region.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
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
	public boolean canMoveTo(final DataFlowRegion dataFlowRegion, final int x, final int y) {
		return dataFlowRegion.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
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
			preMove(dataFlowRegion, x, y);
			s_moveTo(dataFlowRegion, x, y);
			dataFlowRegion.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, dataFlowRegion, x, y, deltaX, deltaY);
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
	public Region getContainer() {
		return (info.scce.cinco.product.scchart.mglid.scchart.Region)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperStateView getSuperStateView() {
		SuperStateView superStateView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createSuperStateView();
		superStateView.setInternalSuperState((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState)getInternalElement());
		return superStateView;
		
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
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
			case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT:
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
				case ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT: return GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT;
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
				case GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT: return ScchartPackage.SUPER_STATE__INTERNAL_ELEMENT;
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT: return ScchartPackage.SUPER_STATE___GET_INTERNAL_CONTAINER_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return ScchartPackage.SUPER_STATE___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return ScchartPackage.SUPER_STATE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return ScchartPackage.SUPER_STATE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return ScchartPackage.SUPER_STATE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.SUPER_STATE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___HIGHLIGHT: return ScchartPackage.SUPER_STATE___HIGHLIGHT;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE: return ScchartPackage.SUPER_STATE___UPDATE;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE_GRAPH_MODEL: return ScchartPackage.SUPER_STATE___UPDATE_GRAPH_MODEL;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return ScchartPackage.SUPER_STATE___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS: return ScchartPackage.SUPER_STATE___GET_SUCCESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return ScchartPackage.SUPER_STATE___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS: return ScchartPackage.SUPER_STATE___GET_PREDECESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_INCOMING__CLASS: return ScchartPackage.SUPER_STATE___GET_INCOMING__CLASS;
				case GraphmodelPackage.NODE___GET_OUTGOING__CLASS: return ScchartPackage.SUPER_STATE___GET_OUTGOING__CLASS;
				case GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE: return ScchartPackage.SUPER_STATE___CAN_CONNECT__EDGE_NODE;
				case GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS: return ScchartPackage.SUPER_STATE___GET_OUTGOING_CONSTRAINTS;
				case GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS: return ScchartPackage.SUPER_STATE___GET_INCOMING_CONSTRAINTS;
				case GraphmodelPackage.NODE___CAN_START__CLASS: return ScchartPackage.SUPER_STATE___CAN_START__CLASS;
				case GraphmodelPackage.NODE___CAN_END__CLASS: return ScchartPackage.SUPER_STATE___CAN_END__CLASS;
				case GraphmodelPackage.NODE___MOVE__INT_INT: return ScchartPackage.SUPER_STATE___MOVE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT: return ScchartPackage.SUPER_STATE___RESIZE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT: return ScchartPackage.SUPER_STATE___RESIZE__INT_INT_INT_INT;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___DELETE: return ScchartPackage.SUPER_STATE___DELETE;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.SUPER_STATE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.SUPER_STATE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.SUPER_STATE___PRE_DELETE;
				case GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER: return ScchartPackage.SUPER_STATE___CAN_MOVE_TO__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.SUPER_STATE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER: return ScchartPackage.SUPER_STATE___CAN_CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER: return ScchartPackage.SUPER_STATE___CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___GET_X: return ScchartPackage.SUPER_STATE___GET_X;
				case GraphmodelPackage.NODE___GET_Y: return ScchartPackage.SUPER_STATE___GET_Y;
				case GraphmodelPackage.NODE___GET_WIDTH: return ScchartPackage.SUPER_STATE___GET_WIDTH;
				case GraphmodelPackage.NODE___GET_HEIGHT: return ScchartPackage.SUPER_STATE___GET_HEIGHT;
				case GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER: return ScchartPackage.SUPER_STATE___COPY__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___SET_X__INT: return ScchartPackage.SUPER_STATE___SET_X__INT;
				case GraphmodelPackage.NODE___SET_Y__INT: return ScchartPackage.SUPER_STATE___SET_Y__INT;
				case GraphmodelPackage.NODE___SET_WIDTH__INT: return ScchartPackage.SUPER_STATE___SET_WIDTH__INT;
				case GraphmodelPackage.NODE___SET_HEIGHT__INT: return ScchartPackage.SUPER_STATE___SET_HEIGHT__INT;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___GET_LAYER: return ScchartPackage.SUPER_STATE___GET_LAYER;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return ScchartPackage.SUPER_STATE___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return ScchartPackage.SUPER_STATE___GET_OUTGOING;
				case GraphmodelPackage.NODE___GET_UNTYPED_INCOMING: return ScchartPackage.SUPER_STATE___GET_UNTYPED_INCOMING;
				case GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING: return ScchartPackage.SUPER_STATE___GET_UNTYPED_OUTGOING;
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
			case ScchartPackage.SUPER_STATE___GET_LABEL:
				return getLabel();
			case ScchartPackage.SUPER_STATE___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___GET_INTERNAL_SUPER_STATE:
				return getInternalSuperState();
			case ScchartPackage.SUPER_STATE___IS_EXACTLY_SUPER_STATE:
				return isExactlySuperState();
			case ScchartPackage.SUPER_STATE___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.SUPER_STATE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.SUPER_STATE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.SUPER_STATE___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.SUPER_STATE___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.SUPER_STATE___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.SUPER_STATE___GET_NODES:
				return getNodes();
			case ScchartPackage.SUPER_STATE___GET_DATA_FLOW_REGIONS:
				return getDataFlowRegions();
			case ScchartPackage.SUPER_STATE___CAN_NEW_DATA_FLOW_REGION:
				return canNewDataFlowRegion();
			case ScchartPackage.SUPER_STATE___NEW_DATA_FLOW_REGION__INT_INT:
				return newDataFlowRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SUPER_STATE___NEW_DATA_FLOW_REGION__STRING_INT_INT:
				return newDataFlowRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___NEW_DATA_FLOW_REGION__INT_INT_INT_INT:
				return newDataFlowRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SUPER_STATE___NEW_DATA_FLOW_REGION__STRING_INT_INT_INT_INT:
				return newDataFlowRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_DECLARATIONS:
				return getSuperStateDeclarations();
			case ScchartPackage.SUPER_STATE___CAN_NEW_SUPER_STATE_DECLARATION:
				return canNewSuperStateDeclaration();
			case ScchartPackage.SUPER_STATE___NEW_SUPER_STATE_DECLARATION__INT_INT:
				return newSuperStateDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SUPER_STATE___NEW_SUPER_STATE_DECLARATION__STRING_INT_INT:
				return newSuperStateDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___NEW_SUPER_STATE_DECLARATION__INT_INT_INT_INT:
				return newSuperStateDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SUPER_STATE___NEW_SUPER_STATE_DECLARATION__STRING_INT_INT_INT_INT:
				return newSuperStateDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SUPER_STATE___GET_SUSPENDS:
				return getSuspends();
			case ScchartPackage.SUPER_STATE___CAN_NEW_SUSPEND:
				return canNewSuspend();
			case ScchartPackage.SUPER_STATE___NEW_SUSPEND__INT_INT:
				return newSuspend((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SUPER_STATE___NEW_SUSPEND__STRING_INT_INT:
				return newSuspend((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___NEW_SUSPEND__INT_INT_INT_INT:
				return newSuspend((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SUPER_STATE___NEW_SUSPEND__STRING_INT_INT_INT_INT:
				return newSuspend((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SUPER_STATE___GET_ACTIONS:
				return getActions();
			case ScchartPackage.SUPER_STATE___CAN_NEW_ACTION:
				return canNewAction();
			case ScchartPackage.SUPER_STATE___NEW_ACTION__INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SUPER_STATE___NEW_ACTION__STRING_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___NEW_ACTION__INT_INT_INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SUPER_STATE___NEW_ACTION__STRING_INT_INT_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SUPER_STATE___GET_REGIONS:
				return getRegions();
			case ScchartPackage.SUPER_STATE___CAN_NEW_REGION:
				return canNewRegion();
			case ScchartPackage.SUPER_STATE___NEW_REGION__INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.SUPER_STATE___NEW_REGION__STRING_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___NEW_REGION__INT_INT_INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.SUPER_STATE___NEW_REGION__STRING_INT_INT_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.SUPER_STATE___GET_OUTGOING:
				return getOutgoing();
			case ScchartPackage.SUPER_STATE___GET_SUCCESSORS:
				return getSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INCOMING:
				return getIncoming();
			case ScchartPackage.SUPER_STATE___GET_PREDECESSORS:
				return getPredecessors();
			case ScchartPackage.SUPER_STATE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.SUPER_STATE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.SUPER_STATE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_HISTORY_TRANSITIONS:
				return getOutgoingTerminationHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS:
				return getOutgoingConditionalTerminationHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getOutgoingImmediateStrongAbortHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getOutgoingStrongAbortDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_DEFFERD_TRANSITIONS:
				return getOutgoingTerminationDefferdTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_ABSTRACT_TRANSITIONS:
				return getOutgoingAbstractTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_TRANSITIONS:
				return getOutgoingImmediateStrongAbortTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getOutgoingImmediateStrongAbortDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_HISTORY_TRANSITIONS:
				return getOutgoingImmediateHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getOutgoingStrongAbortHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_TERMINATION_TRANSITIONS:
				return getOutgoingTerminationTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_DEFERRED_TRANSITIONS:
				return getOutgoingImmediateDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_HISTORY_TRANSITIONS:
				return getOutgoingHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_DEFERRED_TRANSITIONS:
				return getOutgoingDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS:
				return getOutgoingStrongAbortTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_IMMEDIATE_TRANSITIONS:
				return getOutgoingImmediateTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_TRANSITIONS:
				return getOutgoingConditionalTerminationTransitions();
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS:
				return getOutgoingConditionalTerminationDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_HISTORY_TRANSITIONS:
				return getIncomingTerminationHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS:
				return getIncomingConditionalTerminationHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getIncomingImmediateStrongAbortHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getIncomingStrongAbortDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_DEFFERD_TRANSITIONS:
				return getIncomingTerminationDefferdTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_ABSTRACT_TRANSITIONS:
				return getIncomingAbstractTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_TRANSITIONS:
				return getIncomingImmediateStrongAbortTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getIncomingImmediateStrongAbortDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_HISTORY_TRANSITIONS:
				return getIncomingImmediateHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getIncomingStrongAbortHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_TERMINATION_TRANSITIONS:
				return getIncomingTerminationTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_DEFERRED_TRANSITIONS:
				return getIncomingImmediateDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_HISTORY_TRANSITIONS:
				return getIncomingHistoryTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_DEFERRED_TRANSITIONS:
				return getIncomingDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_STRONG_ABORT_TRANSITIONS:
				return getIncomingStrongAbortTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_IMMEDIATE_TRANSITIONS:
				return getIncomingImmediateTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_TRANSITIONS:
				return getIncomingConditionalTerminationTransitions();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS:
				return getIncomingConditionalTerminationDeferredTransitions();
			case ScchartPackage.SUPER_STATE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS:
				return getInitilalSuperStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case ScchartPackage.SUPER_STATE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS:
				return getInitilalSuperStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case ScchartPackage.SUPER_STATE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return canNewTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return newTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newTerminationHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTerminationHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITIALSTATE:
				return canNewTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSTATE:
				return newTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITIALSTATE_STRING:
				return newTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__CONNECTOR:
				return canNewTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__CONNECTOR:
				return newTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__CONNECTOR_STRING:
				return newTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__SUPERSTATE:
				return canNewTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SUPERSTATE:
				return newTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SUPERSTATE_STRING:
				return newTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__INITILALSUPERSTATE:
				return canNewTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE:
				return newTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__SIMPLESTATE:
				return canNewTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SIMPLESTATE:
				return newTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__SIMPLESTATE_STRING:
				return newTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TRANSITION__FINALSTATE:
				return canNewTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSTATE:
				return newTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TRANSITION__FINALSTATE_STRING:
				return newTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return canNewConditionalTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return newConditionalTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newConditionalTerminationHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewConditionalTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newConditionalTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newConditionalTerminationHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return canNewImmediateStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return newImmediateStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newImmediateStrongAbortHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newImmediateStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return newStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE:
				return canNewTerminationDefferdTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE:
				return newTerminationDefferdTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE_STRING:
				return newTerminationDefferdTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE:
				return canNewTerminationDefferdTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE:
				return newTerminationDefferdTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTerminationDefferdTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return canNewImmediateStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return newImmediateStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newImmediateStrongAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR:
				return canNewImmediateStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR:
				return newImmediateStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR_STRING:
				return newImmediateStrongAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return canNewImmediateStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return newImmediateStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING:
				return newImmediateStrongAbortTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return newImmediateStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateStrongAbortTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return canNewImmediateStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return newImmediateStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateStrongAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE:
				return canNewImmediateStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE:
				return newImmediateStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE_STRING:
				return newImmediateStrongAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewImmediateStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return newImmediateStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newImmediateStrongAbortDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newImmediateStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE:
				return canNewImmediateHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE:
				return newImmediateHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newImmediateHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newImmediateHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return canNewStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return newStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE:
				return newTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__CONNECTOR:
				return canNewTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR:
				return newTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SUPERSTATE:
				return canNewTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE:
				return newTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SUPERSTATE_STRING:
				return newTerminationTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return canNewTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return newTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTerminationTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE:
				return newTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_TERMINATION_TRANSITION__FINALSTATE:
				return canNewTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE:
				return newTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewImmediateDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE:
				return newImmediateDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newImmediateDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newImmediateDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE:
				return canNewHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE:
				return newHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return newDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return canNewStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return newStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newStrongAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return canNewStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return newStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING:
				return newStrongAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return canNewStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return newStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return canNewStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return newStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newStrongAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return canNewStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return newStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING:
				return newStrongAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return canNewImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return newImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING:
				return newImmediateTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return canNewImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return newImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING:
				return newImmediateTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE:
				return canNewImmediateTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE:
				return newImmediateTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING:
				return newImmediateTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE:
				return newImmediateTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return canNewImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return newImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return canNewImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return newImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING:
				return newImmediateTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewConditionalTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE:
				return newConditionalTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newConditionalTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR:
				return canNewConditionalTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR:
				return newConditionalTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newConditionalTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE:
				return canNewConditionalTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE:
				return newConditionalTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE_STRING:
				return newConditionalTerminationTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return canNewConditionalTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return newConditionalTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING:
				return newConditionalTerminationTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewConditionalTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE:
				return newConditionalTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newConditionalTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE:
				return canNewConditionalTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE:
				return newConditionalTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newConditionalTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewConditionalTerminationDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE:
				return newConditionalTerminationDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newConditionalTerminationDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewConditionalTerminationDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newConditionalTerminationDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.SUPER_STATE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newConditionalTerminationDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__REGION_INT_INT:
				return canMoveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___MOVE_TO__REGION_INT_INT:
				moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___SMOVE_TO__REGION_INT_INT:
				s_moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__DATAFLOWREGION_INT_INT:
				return canMoveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.SUPER_STATE___MOVE_TO__DATAFLOWREGION_INT_INT:
				moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___SMOVE_TO__DATAFLOWREGION_INT_INT:
				s_moveTo((DataFlowRegion)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___GET_CONTAINER:
				return getContainer();
			case ScchartPackage.SUPER_STATE___GET_SUPER_STATE_VIEW:
				return getSuperStateView();
			case ScchartPackage.SUPER_STATE___GET_INTERNAL_CONTAINER_ELEMENT:
				return getInternalContainerElement();
			case ScchartPackage.SUPER_STATE___DELETE:
				delete();
				return null;
			case ScchartPackage.SUPER_STATE___GET_SUCCESSORS__CLASS:
				return getSuccessors((Class)arguments.get(0));
			case ScchartPackage.SUPER_STATE___GET_PREDECESSORS__CLASS:
				return getPredecessors((Class)arguments.get(0));
			case ScchartPackage.SUPER_STATE___GET_INCOMING__CLASS:
				return getIncoming((Class)arguments.get(0));
			case ScchartPackage.SUPER_STATE___GET_OUTGOING__CLASS:
				return getOutgoing((Class)arguments.get(0));
			case ScchartPackage.SUPER_STATE___CAN_CONNECT__EDGE_NODE:
				return canConnect((Edge)arguments.get(0), (Node)arguments.get(1));
			case ScchartPackage.SUPER_STATE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case ScchartPackage.SUPER_STATE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case ScchartPackage.SUPER_STATE___CAN_START__CLASS:
				return canStart((Class<? extends Edge>)arguments.get(0));
			case ScchartPackage.SUPER_STATE___CAN_END__CLASS:
				return canEnd((Class<? extends Edge>)arguments.get(0));
			case ScchartPackage.SUPER_STATE___MOVE__INT_INT:
				move((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ScchartPackage.SUPER_STATE___RESIZE__INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ScchartPackage.SUPER_STATE___RESIZE__INT_INT_INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case ScchartPackage.SUPER_STATE___CAN_MOVE_TO__MODELELEMENTCONTAINER:
				return canMoveTo((ModelElementContainer)arguments.get(0));
			case ScchartPackage.SUPER_STATE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.SUPER_STATE___CAN_CLONE__MODELELEMENTCONTAINER:
				return canClone((ModelElementContainer)arguments.get(0));
			case ScchartPackage.SUPER_STATE___CLONE__MODELELEMENTCONTAINER:
				return clone((ModelElementContainer)arguments.get(0));
			case ScchartPackage.SUPER_STATE___GET_X:
				return getX();
			case ScchartPackage.SUPER_STATE___GET_Y:
				return getY();
			case ScchartPackage.SUPER_STATE___GET_WIDTH:
				return getWidth();
			case ScchartPackage.SUPER_STATE___GET_HEIGHT:
				return getHeight();
			case ScchartPackage.SUPER_STATE___COPY__MODELELEMENTCONTAINER:
				return copy((ModelElementContainer)arguments.get(0));
			case ScchartPackage.SUPER_STATE___SET_X__INT:
				setX((Integer)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___SET_Y__INT:
				setY((Integer)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___SET_WIDTH__INT:
				setWidth((Integer)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___SET_HEIGHT__INT:
				setHeight((Integer)arguments.get(0));
				return null;
			case ScchartPackage.SUPER_STATE___GET_LAYER:
				return getLayer();
			case ScchartPackage.SUPER_STATE___GET_UNTYPED_INCOMING:
				return getUntypedIncoming();
			case ScchartPackage.SUPER_STATE___GET_UNTYPED_OUTGOING:
				return getUntypedOutgoing();
			case ScchartPackage.SUPER_STATE___HIGHLIGHT:
				highlight();
				return null;
			case ScchartPackage.SUPER_STATE___UPDATE:
				update();
				return null;
			case ScchartPackage.SUPER_STATE___UPDATE_GRAPH_MODEL:
				updateGraphModel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuperStateImpl

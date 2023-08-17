/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.Container;
import graphmodel.Direction;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece;

import info.scce.cinco.product.scchart.mglid.scchart.views.FinalSCChartRefereceView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final SC Chart Referece</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FinalSCChartRefereceImpl extends SCChartRefereceImpl implements FinalSCChartReferece {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalSCChartRefereceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getFinalSCChartReferece();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFinalSCChartReferece getInternalFinalSCChartReferece() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyFinalSCChartReferece() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		// event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void>("event.pre.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", eventPayload);
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
		// event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>(this);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Runnable> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostDeletePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Runnable>("event.post.delete.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", eventPayload);
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
	public EList<InitilalSuperState> getInitilalSuperStates() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewInitilalSuperState() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState newInitilalSuperState(final int x, final int y) {
		return newInitilalSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState newInitilalSuperState(final String id, final int x, final int y) {
		return newInitilalSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState newInitilalSuperState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createInitilalSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitilalSuperState newInitilalSuperState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createInitilalSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStates() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewFinalState() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState newFinalState(final int x, final int y) {
		return newFinalState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState newFinalState(final String id, final int x, final int y) {
		return newFinalState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState newFinalState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.FinalState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createFinalState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.FinalState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalState newFinalState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.FinalState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createFinalState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.FinalState.class, this.getClass()));
		
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
	public EList<FinalSuperState> getFinalSuperStates() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewFinalSuperState() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperState newFinalSuperState(final int x, final int y) {
		return newFinalSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperState newFinalSuperState(final String id, final int x, final int y) {
		return newFinalSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperState newFinalSuperState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createFinalSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSuperState newFinalSuperState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createFinalSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Declaration> getDeclarations() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.Declaration.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDeclaration() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Declaration.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration newDeclaration(final int x, final int y) {
		return newDeclaration(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration newDeclaration(final String id, final int x, final int y) {
		return newDeclaration(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration newDeclaration(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Declaration.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Declaration node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeclaration((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Declaration.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration newDeclaration(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Declaration.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Declaration node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createDeclaration((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Declaration.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStates() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSimpleState() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState newSimpleState(final int x, final int y) {
		return newSimpleState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState newSimpleState(final String id, final int x, final int y) {
		return newSimpleState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState newSimpleState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SimpleState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSimpleState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleState newSimpleState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SimpleState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSimpleState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStates() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewInitialState() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState newInitialState(final int x, final int y) {
		return newInitialState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState newInitialState(final String id, final int x, final int y) {
		return newInitialState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState newInitialState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.InitialState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createInitialState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.InitialState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState newInitialState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.InitialState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createInitialState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.InitialState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStates() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSuperState() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState newSuperState(final int x, final int y) {
		return newSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState newSuperState(final String id, final int x, final int y) {
		return newSuperState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState newSuperState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SuperState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState newSuperState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SuperState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSuperState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.SuperState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SCChartReferece> getSCChartRefereces() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewSCChartReferece() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartReferece newSCChartReferece(final EObject reference, final int x, final int y) {
		return newSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartReferece newSCChartReferece(final EObject reference, final String id, final int x, final int y) {
		return newSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartReferece newSCChartReferece(final EObject reference, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", SCChartReferece.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCChartReferece newSCChartReferece(final EObject reference, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", SCChartReferece.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectors() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewConnector() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector newConnector(final int x, final int y) {
		return newConnector(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector newConnector(final String id, final int x, final int y) {
		return newConnector(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector newConnector(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Connector.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Connector node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConnector((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Connector.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector newConnector(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.Connector.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.Connector node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createConnector((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.Connector.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSCChartReferece> getInitialSCChartRefereces() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewInitialSCChartReferece() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartReferece newInitialSCChartReferece(final EObject reference, final int x, final int y) {
		return newInitialSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartReferece newInitialSCChartReferece(final EObject reference, final String id, final int x, final int y) {
		return newInitialSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartReferece newInitialSCChartReferece(final EObject reference, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createInitialSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", InitialSCChartReferece.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialSCChartReferece newInitialSCChartReferece(final EObject reference, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createInitialSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", InitialSCChartReferece.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootState> getRootStates() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewRootState() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState newRootState(final int x, final int y) {
		return newRootState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState newRootState(final String id, final int x, final int y) {
		return newRootState(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState newRootState(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.RootState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.RootState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createRootState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.RootState.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState newRootState(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.RootState.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.RootState node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createRootState((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.scchart.mglid.scchart.RootState.class, this.getClass()));
		
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
	public EList<FinalSCChartReferece> getFinalSCChartRefereces() {
		return getModelElements(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewFinalSCChartReferece() {
		return this.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartReferece newFinalSCChartReferece(final EObject reference, final int x, final int y) {
		return newFinalSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartReferece newFinalSCChartReferece(final EObject reference, final String id, final int x, final int y) {
		return newFinalSCChartReferece(reference,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartReferece newFinalSCChartReferece(final EObject reference, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createFinalSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", FinalSCChartReferece.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartReferece newFinalSCChartReferece(final EObject reference, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class)) {
			info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece node = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createFinalSCChartReferece();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(reference));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", FinalSCChartReferece.class, this.getClass()));
		
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
		// event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>(this, newContainer, newX, newY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreMovePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void>("event.pre.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		// event.post.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>(this, source, x - deltaX, y - deltaY);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostMovePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void>("event.post.move.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		// event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>(this, newWidth, newHeight, newX, newY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PreResizePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void>("event.pre.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		// event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece
		de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece> eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>(this, oldWidth, oldHeight, oldX, oldY, direction);
		de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void> eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostResizePayload<info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece>, java.lang.Void>("event.post.resize.info_scce_cinco_product_scchart_mglid_scchart_FinalSCChartReferece", eventPayload);
		de.jabc.cinco.meta.core.event.hub.EventHub.getInstance().notifyFirst(eventContext);
		
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
	public EList<StrongAbortDeferredTransition> getOutgoingStrongAbortDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
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
	public EList<StrongAbortHistoryTransition> getOutgoingStrongAbortHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
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
	public EList<TerminationHistoryTransition> getOutgoingTerminationHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
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
	public EList<ImmediateStrongAbortDeferredTransition> getOutgoingImmediateStrongAbortDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
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
	public EList<ImmediateStrongAbortHistoryTransition> getOutgoingImmediateStrongAbortHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
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
	public EList<TerminationTransition> getOutgoingTerminationTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
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
	public EList<HistoryTransition> getOutgoingHistoryTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
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
	public EList<ImmediateTransition> getOutgoingImmediateTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
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
	public EList<ImmediateDeferredTransition> getOutgoingImmediateDeferredTransitions() {
		return this.getOutgoing(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
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
	public EList<StrongAbortDeferredTransition> getIncomingStrongAbortDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
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
	public EList<StrongAbortHistoryTransition> getIncomingStrongAbortHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
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
	public EList<TerminationHistoryTransition> getIncomingTerminationHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
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
	public EList<ImmediateStrongAbortDeferredTransition> getIncomingImmediateStrongAbortDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
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
	public EList<ImmediateStrongAbortHistoryTransition> getIncomingImmediateStrongAbortHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
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
	public EList<TerminationTransition> getIncomingTerminationTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
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
	public EList<HistoryTransition> getIncomingHistoryTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
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
	public EList<ImmediateTransition> getIncomingImmediateTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
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
	public EList<ImmediateDeferredTransition> getIncomingImmediateDeferredTransitions() {
		return this.getIncoming(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
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
	public EList<FinalSuperState> getFinalSuperStatePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class);
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
	public EList<SCChartReferece> getSCChartReferecePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSCChartReferece> getInitialSCChartReferecePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSCChartReferece> getFinalSCChartReferecePredecessors() {
		return ((graphmodel.Node)this).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
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
	public EList<FinalSuperState> getFinalSuperStateSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class);
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
	public EList<SCChartReferece> getSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialSCChartReferece> getInitialSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalSCChartReferece> getFinalSCChartRefereceSuccessors() {
		return ((graphmodel.Node)this).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
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
	public boolean canNewTerminationDefferdTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition newTerminationDefferdTransition(final InitialSCChartReferece target) {
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
	public TerminationDefferdTransition newTerminationDefferdTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewTerminationDefferdTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition newTerminationDefferdTransition(final FinalSuperState target) {
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
	public TerminationDefferdTransition newTerminationDefferdTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewTerminationDefferdTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition newTerminationDefferdTransition(final FinalSCChartReferece target) {
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
	public TerminationDefferdTransition newTerminationDefferdTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewTerminationDefferdTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationDefferdTransition newTerminationDefferdTransition(final SCChartReferece target) {
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
	public TerminationDefferdTransition newTerminationDefferdTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewStrongAbortDeferredTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialSCChartReferece target) {
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
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewStrongAbortDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final FinalSuperState target) {
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
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewStrongAbortDeferredTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final FinalSCChartReferece target) {
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
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewStrongAbortDeferredTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final SCChartReferece target) {
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
	public StrongAbortDeferredTransition newStrongAbortDeferredTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewConditionalTerminationHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final InitialSCChartReferece target) {
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
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewConditionalTerminationHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final FinalSuperState target) {
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
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewConditionalTerminationHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final FinalSCChartReferece target) {
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
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewConditionalTerminationHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final SCChartReferece target) {
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
	public ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewStrongAbortHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialSCChartReferece target) {
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
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewStrongAbortHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final FinalSuperState target) {
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
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewStrongAbortHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final FinalSCChartReferece target) {
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
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewStrongAbortHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final SCChartReferece target) {
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
	public StrongAbortHistoryTransition newStrongAbortHistoryTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewDeferredTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final InitialSCChartReferece target) {
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
	public DeferredTransition newDeferredTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final FinalSuperState target) {
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
	public DeferredTransition newDeferredTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewDeferredTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final FinalSCChartReferece target) {
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
	public DeferredTransition newDeferredTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewDeferredTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferredTransition newDeferredTransition(final SCChartReferece target) {
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
	public DeferredTransition newDeferredTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewTerminationHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialSCChartReferece target) {
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
	public TerminationHistoryTransition newTerminationHistoryTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewTerminationHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final FinalSuperState target) {
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
	public TerminationHistoryTransition newTerminationHistoryTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewTerminationHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final FinalSCChartReferece target) {
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
	public TerminationHistoryTransition newTerminationHistoryTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewTerminationHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationHistoryTransition newTerminationHistoryTransition(final SCChartReferece target) {
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
	public TerminationHistoryTransition newTerminationHistoryTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewStrongAbortTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final InitialSCChartReferece target) {
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
	public StrongAbortTransition newStrongAbortTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewStrongAbortTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalSuperState target) {
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
	public StrongAbortTransition newStrongAbortTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewStrongAbortTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final FinalSCChartReferece target) {
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
	public StrongAbortTransition newStrongAbortTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewStrongAbortTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrongAbortTransition newStrongAbortTransition(final SCChartReferece target) {
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
	public StrongAbortTransition newStrongAbortTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewImmediateStrongAbortDeferredTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final InitialSCChartReferece target) {
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
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewImmediateStrongAbortDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final FinalSuperState target) {
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
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewImmediateStrongAbortDeferredTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final FinalSCChartReferece target) {
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
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewImmediateStrongAbortDeferredTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final SCChartReferece target) {
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
	public ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewConditionalTerminationTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitialSCChartReferece target) {
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewConditionalTerminationTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalSuperState target) {
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewConditionalTerminationTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalSCChartReferece target) {
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewConditionalTerminationTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SCChartReferece target) {
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
	public ConditionalTerminationTransition newConditionalTerminationTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewImmediateStrongAbortHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final InitialSCChartReferece target) {
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
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewImmediateStrongAbortHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final FinalSuperState target) {
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
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewImmediateStrongAbortHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final FinalSCChartReferece target) {
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
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewImmediateStrongAbortHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final SCChartReferece target) {
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
	public ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final InitialSCChartReferece target) {
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
	public Transition newTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalSuperState target) {
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
	public Transition newTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final FinalSCChartReferece target) {
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
	public Transition newTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.Transition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.Transition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition newTransition(final SCChartReferece target) {
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
	public Transition newTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewTerminationTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final InitialSCChartReferece target) {
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
	public TerminationTransition newTerminationTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewTerminationTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalSuperState target) {
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
	public TerminationTransition newTerminationTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewTerminationTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final FinalSCChartReferece target) {
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
	public TerminationTransition newTerminationTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewTerminationTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationTransition newTerminationTransition(final SCChartReferece target) {
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
	public TerminationTransition newTerminationTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewConditionalTerminationDeferredTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final InitialSCChartReferece target) {
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
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewConditionalTerminationDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final FinalSuperState target) {
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
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewConditionalTerminationDeferredTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final FinalSCChartReferece target) {
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
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewConditionalTerminationDeferredTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final SCChartReferece target) {
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
	public ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final InitialSCChartReferece target) {
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
	public HistoryTransition newHistoryTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final FinalSuperState target) {
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
	public HistoryTransition newHistoryTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final FinalSCChartReferece target) {
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
	public HistoryTransition newHistoryTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryTransition newHistoryTransition(final SCChartReferece target) {
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
	public HistoryTransition newHistoryTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewImmediateHistoryTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition newImmediateHistoryTransition(final InitialSCChartReferece target) {
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
	public ImmediateHistoryTransition newImmediateHistoryTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewImmediateHistoryTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition newImmediateHistoryTransition(final FinalSuperState target) {
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
	public ImmediateHistoryTransition newImmediateHistoryTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewImmediateHistoryTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition newImmediateHistoryTransition(final FinalSCChartReferece target) {
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
	public ImmediateHistoryTransition newImmediateHistoryTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewImmediateHistoryTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateHistoryTransition newImmediateHistoryTransition(final SCChartReferece target) {
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
	public ImmediateHistoryTransition newImmediateHistoryTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewImmediateTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final InitialSCChartReferece target) {
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
	public ImmediateTransition newImmediateTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewImmediateTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final FinalSuperState target) {
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
	public ImmediateTransition newImmediateTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewImmediateTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final FinalSCChartReferece target) {
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
	public ImmediateTransition newImmediateTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewImmediateTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransition newImmediateTransition(final SCChartReferece target) {
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
	public ImmediateTransition newImmediateTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewImmediateStrongAbortTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitialSCChartReferece target) {
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewImmediateStrongAbortTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalSuperState target) {
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewImmediateStrongAbortTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalSCChartReferece target) {
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewImmediateStrongAbortTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SCChartReferece target) {
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
	public ImmediateStrongAbortTransition newImmediateStrongAbortTransition(final SCChartReferece target, final String id) {
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
	public boolean canNewImmediateDeferredTransition(final InitialSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition newImmediateDeferredTransition(final InitialSCChartReferece target) {
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
	public ImmediateDeferredTransition newImmediateDeferredTransition(final InitialSCChartReferece target, final String id) {
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
	public boolean canNewImmediateDeferredTransition(final FinalSuperState target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition newImmediateDeferredTransition(final FinalSuperState target) {
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
	public ImmediateDeferredTransition newImmediateDeferredTransition(final FinalSuperState target, final String id) {
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
	public boolean canNewImmediateDeferredTransition(final FinalSCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition newImmediateDeferredTransition(final FinalSCChartReferece target) {
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
	public ImmediateDeferredTransition newImmediateDeferredTransition(final FinalSCChartReferece target, final String id) {
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
	public boolean canNewImmediateDeferredTransition(final SCChartReferece target) {
		return this.canStart(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class) && target.canEnd(info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateDeferredTransition newImmediateDeferredTransition(final SCChartReferece target) {
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
	public ImmediateDeferredTransition newImmediateDeferredTransition(final SCChartReferece target, final String id) {
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
	public boolean canMoveTo(final Region region, final int x, final int y) {
		return region.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
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
	public boolean canMoveTo(final SCChartReferece sCChartReferece, final int x, final int y) {
		return sCChartReferece.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final SCChartReferece sCChartReferece, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(sCChartReferece, x, y);
			s_moveTo(sCChartReferece, x, y);
			sCChartReferece.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, sCChartReferece, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final SCChartReferece sCChartReferece, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final InitialSCChartReferece initialSCChartReferece, final int x, final int y) {
		return initialSCChartReferece.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final InitialSCChartReferece initialSCChartReferece, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(initialSCChartReferece, x, y);
			s_moveTo(initialSCChartReferece, x, y);
			initialSCChartReferece.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, initialSCChartReferece, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final InitialSCChartReferece initialSCChartReferece, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final FinalSCChartReferece finalSCChartReferece, final int x, final int y) {
		return finalSCChartReferece.canContain(info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final FinalSCChartReferece finalSCChartReferece, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(finalSCChartReferece, x, y);
			s_moveTo(finalSCChartReferece, x, y);
			finalSCChartReferece.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, finalSCChartReferece, x, y, deltaX, deltaY);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final FinalSCChartReferece finalSCChartReferece, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState getReference() {
		String uid = ((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece)getInternalElement()).getLibraryComponentUID();
		return (info.scce.cinco.product.scchart.mglid.scchart.RootState) de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalSCChartRefereceView getFinalSCChartRefereceView() {
		FinalSCChartRefereceView finalSCChartRefereceView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createFinalSCChartRefereceView();
		finalSCChartRefereceView.setInternalFinalSCChartReferece((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalSCChartReferece)getInternalElement());
		return finalSCChartRefereceView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Container.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.CONTAINER___GET_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUCCESSORS;
				case GraphmodelPackage.CONTAINER___GET_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_PREDECESSORS;
				case GraphmodelPackage.CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_FUNCTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.CONTAINER___GET_POST_DELETE_EVENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.CONTAINER___PRE_DELETE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_DELETE;
				case GraphmodelPackage.CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.CONTAINER___GET_INCOMING: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING;
				case GraphmodelPackage.CONTAINER___GET_OUTGOING: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING;
				case GraphmodelPackage.CONTAINER___GET_ROOT_ELEMENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SCChartReferece.class) {
			switch (baseOperationID) {
				case ScchartPackage.SC_CHART_REFERECE___PRE_DELETE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_DELETE;
				case ScchartPackage.SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.SC_CHART_REFERECE___GET_POST_DELETE_EVENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_EVENT;
				case ScchartPackage.SC_CHART_REFERECE___PRE_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE;
				case ScchartPackage.SC_CHART_REFERECE___POST_SAVE: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE;
				case ScchartPackage.SC_CHART_REFERECE___GET_ROOT_ELEMENT: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT;
				case ScchartPackage.SC_CHART_REFERECE___GET_NODES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_NODES;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITILAL_SUPER_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITILAL_SUPER_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_INITILAL_SUPER_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITILAL_SUPER_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_FINAL_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_REGIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_REGIONS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_REGION: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_REGION;
				case ScchartPackage.SC_CHART_REFERECE___NEW_REGION__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_REGION__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_SUPER_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_FINAL_SUPER_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_SUPER_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_DECLARATIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_DECLARATIONS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_DECLARATION: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DECLARATION;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DECLARATION__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DECLARATION__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_SIMPLE_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_SIMPLE_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SIMPLE_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITIAL_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_INITIAL_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITIAL_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_SUPER_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUPER_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_SUPER_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SUPER_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_SC_CHART_REFERECES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_SC_CHART_REFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SC_CHART_REFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_CONNECTORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CONNECTORS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_INITIAL_SC_CHART_REFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITIAL_SC_CHART_REFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_ROOT_STATES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_STATES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_ROOT_STATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_ROOT_STATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_ACTIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ACTIONS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_ACTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_ACTION;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ACTION__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ACTION__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_SUSPENDS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUSPENDS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_SUSPEND: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SUSPEND;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUSPEND__INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUSPEND__INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECES: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECES;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_FINAL_SC_CHART_REFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_SC_CHART_REFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING;
				case ScchartPackage.SC_CHART_REFERECE___GET_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING;
				case ScchartPackage.SC_CHART_REFERECE___GET_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.FINAL_SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_TERMINATION_DEFFERD_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_TERMINATION_DEFFERD_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_ABSTRACT_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_ABSTRACT_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_STRONG_ABORT_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_STRONG_ABORT_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_STRONG_ABORT_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_STRONG_ABORT_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_TERMINATION_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_TERMINATION_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_CONDITIONAL_TERMINATION_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_CONDITIONAL_TERMINATION_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_TERMINATION_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_TERMINATION_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_TERMINATION_DEFFERD_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_TERMINATION_DEFFERD_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_ABSTRACT_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_ABSTRACT_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_STRONG_ABORT_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_STRONG_ABORT_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_STRONG_ABORT_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_STRONG_ABORT_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_TERMINATION_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_TERMINATION_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_STRONG_ABORT_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_CONDITIONAL_TERMINATION_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_CONDITIONAL_TERMINATION_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_TERMINATION_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_TERMINATION_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_HISTORY_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_HISTORY_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_DEFERRED_TRANSITIONS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_DEFERRED_TRANSITIONS;
				case ScchartPackage.SC_CHART_REFERECE___GET_ROOT_STATE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_STATE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_SUPER_STATE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITILAL_SUPER_STATE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITILAL_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_SIMPLE_STATE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITIAL_STATE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_STATE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_STATE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_STATE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_CONNECTOR_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CONNECTOR_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_SC_CHART_REFERECE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_SUPER_STATE_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITILAL_SUPER_STATE_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITILAL_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_SIMPLE_STATE_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITIAL_STATE_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_STATE_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_STATE_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_STATE_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_CONNECTOR_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CONNECTOR_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_SC_CHART_REFERECE_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SCCHARTREFERECE: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SCCHARTREFERECE;
				case ScchartPackage.SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING: return ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING;
				case ScchartPackage.SC_CHART_REFERECE___CAN_MOVE_TO__REGION_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___MOVE_TO__REGION_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__REGION_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__REGION_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__REGION_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___MOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__SCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__SCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___MOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT: return ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT;
				case ScchartPackage.SC_CHART_REFERECE___GET_REFERENCE: return ScchartPackage.FINAL_SC_CHART_REFERECE___GET_REFERENCE;
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
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INTERNAL_FINAL_SC_CHART_REFERECE:
				return getInternalFinalSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___IS_EXACTLY_FINAL_SC_CHART_REFERECE:
				return isExactlyFinalSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_NODES:
				return getNodes();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITILAL_SUPER_STATES:
				return getInitilalSuperStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITILAL_SUPER_STATE:
				return canNewInitilalSuperState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT:
				return newInitilalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT:
				return newInitilalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__INT_INT_INT_INT:
				return newInitilalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITILAL_SUPER_STATE__STRING_INT_INT_INT_INT:
				return newInitilalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_STATES:
				return getFinalStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_STATE:
				return canNewFinalState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT:
				return newFinalState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT:
				return newFinalState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__INT_INT_INT_INT:
				return newFinalState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_STATE__STRING_INT_INT_INT_INT:
				return newFinalState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_REGIONS:
				return getRegions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_REGION:
				return canNewRegion();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__INT_INT_INT_INT:
				return newRegion((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_REGION__STRING_INT_INT_INT_INT:
				return newRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATES:
				return getFinalSuperStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_SUPER_STATE:
				return canNewFinalSuperState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT:
				return newFinalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT:
				return newFinalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__INT_INT_INT_INT:
				return newFinalSuperState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SUPER_STATE__STRING_INT_INT_INT_INT:
				return newFinalSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_DECLARATIONS:
				return getDeclarations();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DECLARATION:
				return canNewDeclaration();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__INT_INT:
				return newDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT:
				return newDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__INT_INT_INT_INT:
				return newDeclaration((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DECLARATION__STRING_INT_INT_INT_INT:
				return newDeclaration((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATES:
				return getSimpleStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SIMPLE_STATE:
				return canNewSimpleState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT:
				return newSimpleState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT:
				return newSimpleState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__INT_INT_INT_INT:
				return newSimpleState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SIMPLE_STATE__STRING_INT_INT_INT_INT:
				return newSimpleState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_STATES:
				return getInitialStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITIAL_STATE:
				return canNewInitialState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT:
				return newInitialState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT:
				return newInitialState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__INT_INT_INT_INT:
				return newInitialState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_STATE__STRING_INT_INT_INT_INT:
				return newInitialState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUPER_STATES:
				return getSuperStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SUPER_STATE:
				return canNewSuperState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT:
				return newSuperState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT:
				return newSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__INT_INT_INT_INT:
				return newSuperState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUPER_STATE__STRING_INT_INT_INT_INT:
				return newSuperState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECES:
				return getSCChartRefereces();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SC_CHART_REFERECE:
				return canNewSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT:
				return newSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CONNECTORS:
				return getConnectors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONNECTOR:
				return canNewConnector();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT:
				return newConnector((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT:
				return newConnector((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__INT_INT_INT_INT:
				return newConnector((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONNECTOR__STRING_INT_INT_INT_INT:
				return newConnector((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECES:
				return getInitialSCChartRefereces();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_INITIAL_SC_CHART_REFERECE:
				return canNewInitialSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_INITIAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT:
				return newInitialSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_STATES:
				return getRootStates();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_ROOT_STATE:
				return canNewRootState();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT:
				return newRootState((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT:
				return newRootState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__INT_INT_INT_INT:
				return newRootState((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ROOT_STATE__STRING_INT_INT_INT_INT:
				return newRootState((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ACTIONS:
				return getActions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_ACTION:
				return canNewAction();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__INT_INT_INT_INT:
				return newAction((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_ACTION__STRING_INT_INT_INT_INT:
				return newAction((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUSPENDS:
				return getSuspends();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_SUSPEND:
				return canNewSuspend();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__INT_INT:
				return newSuspend((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT:
				return newSuspend((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__INT_INT_INT_INT:
				return newSuspend((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_SUSPEND__STRING_INT_INT_INT_INT:
				return newSuspend((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECES:
				return getFinalSCChartRefereces();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_FINAL_SC_CHART_REFERECE:
				return canNewFinalSCChartReferece();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_INT_INT_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_FINAL_SC_CHART_REFERECE__EOBJECT_STRING_INT_INT_INT_INT:
				return newFinalSCChartReferece((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING:
				return getOutgoing();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUCCESSORS:
				return getSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING:
				return getIncoming();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_PREDECESSORS:
				return getPredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_TERMINATION_DEFFERD_TRANSITIONS:
				return getOutgoingTerminationDefferdTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_ABSTRACT_TRANSITIONS:
				return getOutgoingAbstractTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getOutgoingStrongAbortDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS:
				return getOutgoingConditionalTerminationHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getOutgoingStrongAbortHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_DEFERRED_TRANSITIONS:
				return getOutgoingDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_TERMINATION_HISTORY_TRANSITIONS:
				return getOutgoingTerminationHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_STRONG_ABORT_TRANSITIONS:
				return getOutgoingStrongAbortTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getOutgoingImmediateStrongAbortDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_CONDITIONAL_TERMINATION_TRANSITIONS:
				return getOutgoingConditionalTerminationTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getOutgoingImmediateStrongAbortHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_TERMINATION_TRANSITIONS:
				return getOutgoingTerminationTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS:
				return getOutgoingConditionalTerminationDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_HISTORY_TRANSITIONS:
				return getOutgoingHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_HISTORY_TRANSITIONS:
				return getOutgoingImmediateHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_TRANSITIONS:
				return getOutgoingImmediateTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_STRONG_ABORT_TRANSITIONS:
				return getOutgoingImmediateStrongAbortTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_OUTGOING_IMMEDIATE_DEFERRED_TRANSITIONS:
				return getOutgoingImmediateDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_TERMINATION_DEFFERD_TRANSITIONS:
				return getIncomingTerminationDefferdTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_ABSTRACT_TRANSITIONS:
				return getIncomingAbstractTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getIncomingStrongAbortDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_CONDITIONAL_TERMINATION_HISTORY_TRANSITIONS:
				return getIncomingConditionalTerminationHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getIncomingStrongAbortHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_DEFERRED_TRANSITIONS:
				return getIncomingDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_TERMINATION_HISTORY_TRANSITIONS:
				return getIncomingTerminationHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_STRONG_ABORT_TRANSITIONS:
				return getIncomingStrongAbortTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITIONS:
				return getIncomingImmediateStrongAbortDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_CONDITIONAL_TERMINATION_TRANSITIONS:
				return getIncomingConditionalTerminationTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITIONS:
				return getIncomingImmediateStrongAbortHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_TERMINATION_TRANSITIONS:
				return getIncomingTerminationTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_CONDITIONAL_TERMINATION_DEFERRED_TRANSITIONS:
				return getIncomingConditionalTerminationDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_HISTORY_TRANSITIONS:
				return getIncomingHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_HISTORY_TRANSITIONS:
				return getIncomingImmediateHistoryTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_TRANSITIONS:
				return getIncomingImmediateTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_STRONG_ABORT_TRANSITIONS:
				return getIncomingImmediateStrongAbortTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INCOMING_IMMEDIATE_DEFERRED_TRANSITIONS:
				return getIncomingImmediateDeferredTransitions();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITILAL_SUPER_STATE_PREDECESSORS:
				return getInitilalSuperStatePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_PREDECESSORS:
				return getFinalSuperStatePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_PREDECESSORS:
				return getSCChartReferecePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_PREDECESSORS:
				return getInitialSCChartReferecePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_PREDECESSORS:
				return getFinalSCChartReferecePredecessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITILAL_SUPER_STATE_SUCCESSORS:
				return getInitilalSuperStateSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SUPER_STATE_SUCCESSORS:
				return getFinalSuperStateSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_SC_CHART_REFERECE_SUCCESSORS:
				return getSCChartRefereceSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_INITIAL_SC_CHART_REFERECE_SUCCESSORS:
				return getInitialSCChartRefereceSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_SUCCESSORS:
				return getFinalSCChartRefereceSuccessors();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE:
				return canNewTerminationDefferdTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE:
				return newTerminationDefferdTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTerminationDefferdTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTerminationDefferdTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITIALSCCHARTREFERECE:
				return newTerminationDefferdTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTerminationDefferdTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationDefferdTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE:
				return newTerminationDefferdTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationDefferdTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE:
				return canNewTerminationDefferdTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE:
				return newTerminationDefferdTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SUPERSTATE_STRING:
				return newTerminationDefferdTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTerminationDefferdTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSCCHARTREFERECE:
				return newTerminationDefferdTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTerminationDefferdTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_DEFFERD_TRANSITION__SCCHARTREFERECE:
				return canNewTerminationDefferdTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SCCHARTREFERECE:
				return newTerminationDefferdTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_DEFFERD_TRANSITION__SCCHARTREFERECE_STRING:
				return newTerminationDefferdTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewStrongAbortDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return newStrongAbortDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newStrongAbortDeferredTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return newStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return canNewStrongAbortDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return newStrongAbortDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newStrongAbortDeferredTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return canNewStrongAbortDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return newStrongAbortDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING:
				return newStrongAbortDeferredTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewConditionalTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newConditionalTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newConditionalTerminationHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewConditionalTerminationHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newConditionalTerminationHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newConditionalTerminationHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewConditionalTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newConditionalTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newConditionalTerminationHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return canNewConditionalTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return newConditionalTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newConditionalTerminationHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewConditionalTerminationHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newConditionalTerminationHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newConditionalTerminationHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewConditionalTerminationHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newConditionalTerminationHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newConditionalTerminationHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewStrongAbortHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newStrongAbortHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newStrongAbortHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return canNewStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return newStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewStrongAbortHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newStrongAbortHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newStrongAbortHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewStrongAbortHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newStrongAbortHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newStrongAbortHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return newDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newDeferredTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SUPERSTATE:
				return newDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return canNewDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return newDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newDeferredTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return canNewDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return newDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING:
				return newDeferredTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newTerminationHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTerminationHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTerminationHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newTerminationHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTerminationHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newTerminationHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return canNewTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE:
				return newTerminationHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newTerminationHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTerminationHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newTerminationHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTerminationHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewTerminationHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newTerminationHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newTerminationHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return canNewStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return newStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING:
				return newStrongAbortTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return canNewStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR:
				return newStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__CONNECTOR_STRING:
				return newStrongAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewStrongAbortTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE:
				return newStrongAbortTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newStrongAbortTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return canNewStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE:
				return newStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSTATE_STRING:
				return newStrongAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return canNewStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return newStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING:
				return newStrongAbortTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return canNewStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return newStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newStrongAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return canNewStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return newStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newStrongAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return canNewStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return newStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING:
				return newStrongAbortTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE:
				return canNewStrongAbortTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE:
				return newStrongAbortTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newStrongAbortTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE:
				return canNewStrongAbortTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE:
				return newStrongAbortTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_STRONG_ABORT_TRANSITION__SCCHARTREFERECE_STRING:
				return newStrongAbortTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newImmediateStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateStrongAbortDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewImmediateStrongAbortDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return newImmediateStrongAbortDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newImmediateStrongAbortDeferredTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newImmediateStrongAbortDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateStrongAbortDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewImmediateStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE:
				return newImmediateStrongAbortDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newImmediateStrongAbortDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return canNewImmediateStrongAbortDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return newImmediateStrongAbortDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newImmediateStrongAbortDeferredTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return canNewImmediateStrongAbortDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return newImmediateStrongAbortDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING:
				return newImmediateStrongAbortDeferredTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return canNewConditionalTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return newConditionalTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING:
				return newConditionalTerminationTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR:
				return canNewConditionalTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR:
				return newConditionalTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newConditionalTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewConditionalTerminationTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE:
				return newConditionalTerminationTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newConditionalTerminationTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE:
				return canNewConditionalTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE:
				return newConditionalTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newConditionalTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return canNewConditionalTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return newConditionalTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING:
				return newConditionalTerminationTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewConditionalTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE:
				return newConditionalTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newConditionalTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewConditionalTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE:
				return newConditionalTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newConditionalTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE:
				return canNewConditionalTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE:
				return newConditionalTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SUPERSTATE_STRING:
				return newConditionalTerminationTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSCCHARTREFERECE:
				return canNewConditionalTerminationTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSCCHARTREFERECE:
				return newConditionalTerminationTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newConditionalTerminationTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_TRANSITION__SCCHARTREFERECE:
				return canNewConditionalTerminationTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SCCHARTREFERECE:
				return newConditionalTerminationTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_TRANSITION__SCCHARTREFERECE_STRING:
				return newConditionalTerminationTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newImmediateStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateStrongAbortHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewImmediateStrongAbortHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newImmediateStrongAbortHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newImmediateStrongAbortHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newImmediateStrongAbortHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateStrongAbortHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return canNewImmediateStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE:
				return newImmediateStrongAbortHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newImmediateStrongAbortHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewImmediateStrongAbortHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newImmediateStrongAbortHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newImmediateStrongAbortHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewImmediateStrongAbortHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newImmediateStrongAbortHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newImmediateStrongAbortHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__INITILALSUPERSTATE:
				return canNewTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITILALSUPERSTATE:
				return newTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__CONNECTOR:
				return canNewTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__CONNECTOR:
				return newTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__CONNECTOR_STRING:
				return newTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITIALSCCHARTREFERECE:
				return newTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__FINALSTATE:
				return canNewTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSTATE:
				return newTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSTATE_STRING:
				return newTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__FINALSUPERSTATE:
				return canNewTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSUPERSTATE:
				return newTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSUPERSTATE_STRING:
				return newTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__SIMPLESTATE:
				return canNewTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SIMPLESTATE:
				return newTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SIMPLESTATE_STRING:
				return newTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__INITIALSTATE:
				return canNewTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITIALSTATE:
				return newTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__INITIALSTATE_STRING:
				return newTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__SUPERSTATE:
				return canNewTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SUPERSTATE:
				return newTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SUPERSTATE_STRING:
				return newTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSCCHARTREFERECE:
				return newTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TRANSITION__SCCHARTREFERECE:
				return canNewTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SCCHARTREFERECE:
				return newTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TRANSITION__SCCHARTREFERECE_STRING:
				return newTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return canNewTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE:
				return newTerminationTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITILALSUPERSTATE_STRING:
				return newTerminationTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__CONNECTOR:
				return canNewTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__CONNECTOR:
				return newTerminationTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__CONNECTOR_STRING:
				return newTerminationTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewTerminationTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE:
				return newTerminationTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newTerminationTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__FINALSTATE:
				return canNewTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSTATE:
				return newTerminationTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSTATE_STRING:
				return newTerminationTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return canNewTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE:
				return newTerminationTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSUPERSTATE_STRING:
				return newTerminationTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__SIMPLESTATE:
				return canNewTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SIMPLESTATE:
				return newTerminationTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SIMPLESTATE_STRING:
				return newTerminationTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__INITIALSTATE:
				return canNewTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSTATE:
				return newTerminationTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__INITIALSTATE_STRING:
				return newTerminationTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__SUPERSTATE:
				return canNewTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SUPERSTATE:
				return newTerminationTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SUPERSTATE_STRING:
				return newTerminationTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE:
				return canNewTerminationTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE:
				return newTerminationTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newTerminationTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_TERMINATION_TRANSITION__SCCHARTREFERECE:
				return canNewTerminationTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SCCHARTREFERECE:
				return newTerminationTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_TERMINATION_TRANSITION__SCCHARTREFERECE_STRING:
				return newTerminationTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewConditionalTerminationDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newConditionalTerminationDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newConditionalTerminationDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewConditionalTerminationDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return newConditionalTerminationDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newConditionalTerminationDeferredTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewConditionalTerminationDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newConditionalTerminationDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newConditionalTerminationDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewConditionalTerminationDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE:
				return newConditionalTerminationDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newConditionalTerminationDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return canNewConditionalTerminationDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return newConditionalTerminationDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newConditionalTerminationDeferredTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return canNewConditionalTerminationDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return newConditionalTerminationDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_CONDITIONAL_TERMINATION_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING:
				return newConditionalTerminationDeferredTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__SUPERSTATE:
				return canNewHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SUPERSTATE:
				return newHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE:
				return newImmediateHistoryTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateHistoryTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewImmediateHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITIALSCCHARTREFERECE:
				return newImmediateHistoryTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newImmediateHistoryTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE:
				return newImmediateHistoryTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateHistoryTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE:
				return canNewImmediateHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE:
				return newImmediateHistoryTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SUPERSTATE_STRING:
				return newImmediateHistoryTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return canNewImmediateHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSCCHARTREFERECE:
				return newImmediateHistoryTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newImmediateHistoryTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_HISTORY_TRANSITION__SCCHARTREFERECE:
				return canNewImmediateHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SCCHARTREFERECE:
				return newImmediateHistoryTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_HISTORY_TRANSITION__SCCHARTREFERECE_STRING:
				return newImmediateHistoryTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE:
				return newImmediateTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return canNewImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__CONNECTOR:
				return newImmediateTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__CONNECTOR_STRING:
				return newImmediateTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewImmediateTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSCCHARTREFERECE:
				return newImmediateTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newImmediateTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return canNewImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSTATE:
				return newImmediateTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSTATE_STRING:
				return newImmediateTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE:
				return newImmediateTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return canNewImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE:
				return newImmediateTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return canNewImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE:
				return newImmediateTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__INITIALSTATE_STRING:
				return newImmediateTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__SUPERSTATE:
				return canNewImmediateTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE:
				return newImmediateTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SUPERSTATE_STRING:
				return newImmediateTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__FINALSCCHARTREFERECE:
				return canNewImmediateTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSCCHARTREFERECE:
				return newImmediateTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newImmediateTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_TRANSITION__SCCHARTREFERECE:
				return canNewImmediateTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SCCHARTREFERECE:
				return newImmediateTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_TRANSITION__SCCHARTREFERECE_STRING:
				return newImmediateTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE:
				return newImmediateStrongAbortTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateStrongAbortTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR:
				return canNewImmediateStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR:
				return newImmediateStrongAbortTransition((Connector)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__CONNECTOR_STRING:
				return newImmediateStrongAbortTransition((Connector)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewImmediateStrongAbortTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE:
				return newImmediateStrongAbortTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newImmediateStrongAbortTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE:
				return canNewImmediateStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE:
				return newImmediateStrongAbortTransition((FinalState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSTATE_STRING:
				return newImmediateStrongAbortTransition((FinalState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE:
				return newImmediateStrongAbortTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateStrongAbortTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return canNewImmediateStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE:
				return newImmediateStrongAbortTransition((SimpleState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SIMPLESTATE_STRING:
				return newImmediateStrongAbortTransition((SimpleState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return canNewImmediateStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE:
				return newImmediateStrongAbortTransition((InitialState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__INITIALSTATE_STRING:
				return newImmediateStrongAbortTransition((InitialState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return canNewImmediateStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE:
				return newImmediateStrongAbortTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SUPERSTATE_STRING:
				return newImmediateStrongAbortTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE:
				return canNewImmediateStrongAbortTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE:
				return newImmediateStrongAbortTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newImmediateStrongAbortTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SCCHARTREFERECE:
				return canNewImmediateStrongAbortTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SCCHARTREFERECE:
				return newImmediateStrongAbortTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_STRONG_ABORT_TRANSITION__SCCHARTREFERECE_STRING:
				return newImmediateStrongAbortTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return canNewImmediateDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE:
				return newImmediateDeferredTransition((InitilalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITILALSUPERSTATE_STRING:
				return newImmediateDeferredTransition((InitilalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return canNewImmediateDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE:
				return newImmediateDeferredTransition((InitialSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__INITIALSCCHARTREFERECE_STRING:
				return newImmediateDeferredTransition((InitialSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return canNewImmediateDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE:
				return newImmediateDeferredTransition((FinalSuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSUPERSTATE_STRING:
				return newImmediateDeferredTransition((FinalSuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE:
				return canNewImmediateDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE:
				return newImmediateDeferredTransition((SuperState)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SUPERSTATE_STRING:
				return newImmediateDeferredTransition((SuperState)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return canNewImmediateDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSCCHARTREFERECE:
				return newImmediateDeferredTransition((FinalSCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__FINALSCCHARTREFERECE_STRING:
				return newImmediateDeferredTransition((FinalSCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_NEW_IMMEDIATE_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return canNewImmediateDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SCCHARTREFERECE:
				return newImmediateDeferredTransition((SCChartReferece)arguments.get(0));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___NEW_IMMEDIATE_DEFERRED_TRANSITION__SCCHARTREFERECE_STRING:
				return newImmediateDeferredTransition((SCChartReferece)arguments.get(0), (String)arguments.get(1));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__REGION_INT_INT:
				return canMoveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__REGION_INT_INT:
				moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__REGION_INT_INT:
				s_moveTo((Region)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__SCCHARTREFERECE_INT_INT:
				return canMoveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__SCCHARTREFERECE_INT_INT:
				moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__SCCHARTREFERECE_INT_INT:
				s_moveTo((SCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				return canMoveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__INITIALSCCHARTREFERECE_INT_INT:
				s_moveTo((InitialSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___CAN_MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				return canMoveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.FINAL_SC_CHART_REFERECE___MOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___SMOVE_TO__FINALSCCHARTREFERECE_INT_INT:
				s_moveTo((FinalSCChartReferece)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_REFERENCE:
				return getReference();
			case ScchartPackage.FINAL_SC_CHART_REFERECE___GET_FINAL_SC_CHART_REFERECE_VIEW:
				return getFinalSCChartRefereceView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FinalSCChartRefereceImpl

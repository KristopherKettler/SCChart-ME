/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Container;
import graphmodel.Direction;
import graphmodel.Edge;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState;

import info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root State</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getRootState()
 * @model
 * @generated
 */
public interface RootState extends Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setLabel(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalRootState getInternalRootState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyRootState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void preDelete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.Runnable" required="true"
	 * @generated
	 */
	Runnable getPostDeleteFunction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.Runnable" required="true"
	 * @generated
	 */
	Runnable getPostDeleteEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void preSave();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void postSave();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SCChart getRootElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Node> getNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewRegion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Region newRegion(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Region newRegion(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Region newRegion(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Region newRegion(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Suspend> getSuspends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewSuspend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Suspend newSuspend(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Suspend newSuspend(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Suspend newSuspend(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Suspend newSuspend(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<RootStateDeclaration> getRootStateDeclarations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewRootStateDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	RootStateDeclaration newRootStateDeclaration(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	RootStateDeclaration newRootStateDeclaration(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	RootStateDeclaration newRootStateDeclaration(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	RootStateDeclaration newRootStateDeclaration(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DataFlowRegion> getDataFlowRegions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewDataFlowRegion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	DataFlowRegion newDataFlowRegion(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	DataFlowRegion newDataFlowRegion(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	DataFlowRegion newDataFlowRegion(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	DataFlowRegion newDataFlowRegion(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Edge> getOutgoing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Node> getSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(ModelElementContainer container, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newContainerRequired="true" newXRequired="true" newYRequired="true"
	 * @generated
	 */
	void preMove(ModelElementContainer newContainer, int newX, int newY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" targetRequired="true" xRequired="true" yRequired="true" deltaXRequired="true" deltaYRequired="true"
	 * @generated
	 */
	void postMove(ModelElementContainer source, ModelElementContainer target, int x, int y, int deltaX, int deltaY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newWidthRequired="true" newHeightRequired="true" newXRequired="true" newYRequired="true" directionRequired="true"
	 * @generated
	 */
	void preResize(int newWidth, int newHeight, int newX, int newY, Direction direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldWidthRequired="true" oldHeightRequired="true" oldXRequired="true" oldYRequired="true" directionRequired="true"
	 * @generated
	 */
	void postResize(int oldWidth, int oldHeight, int oldX, int oldY, Direction direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationTransition> getOutgoingTerminationTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateStrongAbortTransition> getOutgoingImmediateStrongAbortTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortDeferredTransition> getOutgoingStrongAbortDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ConditionalTerminationDeferredTransition> getOutgoingConditionalTerminationDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationHistoryTransition> getOutgoingTerminationHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<HistoryTransition> getOutgoingHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortHistoryTransition> getOutgoingStrongAbortHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateStrongAbortHistoryTransition> getOutgoingImmediateStrongAbortHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ConditionalTerminationHistoryTransition> getOutgoingConditionalTerminationHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortTransition> getOutgoingStrongAbortTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ConditionalTerminationTransition> getOutgoingConditionalTerminationTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateTransition> getOutgoingImmediateTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateHistoryTransition> getOutgoingImmediateHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateStrongAbortDeferredTransition> getOutgoingImmediateStrongAbortDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AbstractTransition> getOutgoingAbstractTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DeferredTransition> getOutgoingDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connection> getOutgoingConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationDefferdTransition> getOutgoingTerminationDefferdTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateDeferredTransition> getOutgoingImmediateDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SuperState> getSuperStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitilalSuperState> getInitilalSuperStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SimpleState> getSimpleStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialState> getInitialStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalState> getFinalStateSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connector> getConnectorSuccessors();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SimpleState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(Connector target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(InitialState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(FinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(SimpleState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(Connector target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(SimpleState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(Connector target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SimpleState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(Connector target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(InitialState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(FinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(SimpleState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(Connector target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(InitialState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(FinalState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(SimpleState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(Connector target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDefferdTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(InitilalSuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDefferdTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(SuperState target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConnection(Output target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Connection newConnection(Output target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Connection newConnection(Output target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConnection(ConnectionCircuit target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Connection newConnection(ConnectionCircuit target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Connection newConnection(ConnectionCircuit target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConnection(Operator target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Connection newConnection(Operator target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Connection newConnection(Operator target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sCChartRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(SCChart sCChart, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sCChartRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(SCChart sCChart, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sCChartRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(SCChart sCChart, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SCChart getContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	RootStateView getRootStateView();

} // RootState

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState;

import info.scce.cinco.product.scchart.mglid.scchart.views.InitilalSuperStateView;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initilal Super State</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getInitilalSuperState()
 * @model
 * @generated
 */
public interface InitilalSuperState extends SuperState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalInitilalSuperState getInternalInitilalSuperState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyInitilalSuperState();

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
	EList<Action> getActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Action newAction(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Action newAction(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Action newAction(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Action newAction(String id, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canNewDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Declaration newDeclaration(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	Declaration newDeclaration(String id, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Declaration newDeclaration(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true" xRequired="true" yRequired="true" widthRequired="true" heightRequired="true"
	 * @generated
	 */
	Declaration newDeclaration(String id, int x, int y, int width, int height);

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
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends AbstractTransition> getOutgoing();

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
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends AbstractTransition> getIncoming();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<? extends Node> getPredecessors();

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
	EList<TerminationDefferdTransition> getOutgoingTerminationDefferdTransitions();

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
	EList<StrongAbortDeferredTransition> getOutgoingStrongAbortDeferredTransitions();

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
	EList<StrongAbortHistoryTransition> getOutgoingStrongAbortHistoryTransitions();

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
	EList<TerminationHistoryTransition> getOutgoingTerminationHistoryTransitions();

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
	EList<ImmediateStrongAbortDeferredTransition> getOutgoingImmediateStrongAbortDeferredTransitions();

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
	EList<ImmediateStrongAbortHistoryTransition> getOutgoingImmediateStrongAbortHistoryTransitions();

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
	EList<TerminationTransition> getOutgoingTerminationTransitions();

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
	EList<HistoryTransition> getOutgoingHistoryTransitions();

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
	EList<ImmediateTransition> getOutgoingImmediateTransitions();

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
	EList<ImmediateDeferredTransition> getOutgoingImmediateDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationDefferdTransition> getIncomingTerminationDefferdTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AbstractTransition> getIncomingAbstractTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortDeferredTransition> getIncomingStrongAbortDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ConditionalTerminationHistoryTransition> getIncomingConditionalTerminationHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortHistoryTransition> getIncomingStrongAbortHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DeferredTransition> getIncomingDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationHistoryTransition> getIncomingTerminationHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<StrongAbortTransition> getIncomingStrongAbortTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateStrongAbortDeferredTransition> getIncomingImmediateStrongAbortDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ConditionalTerminationTransition> getIncomingConditionalTerminationTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateStrongAbortHistoryTransition> getIncomingImmediateStrongAbortHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TerminationTransition> getIncomingTerminationTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ConditionalTerminationDeferredTransition> getIncomingConditionalTerminationDeferredTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<HistoryTransition> getIncomingHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateHistoryTransition> getIncomingImmediateHistoryTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateTransition> getIncomingImmediateTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateStrongAbortTransition> getIncomingImmediateStrongAbortTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ImmediateDeferredTransition> getIncomingImmediateDeferredTransitions();

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
	EList<SuperState> getSuperStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitilalSuperState> getInitilalSuperStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalSuperState> getFinalSuperStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SimpleState> getSimpleStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialState> getInitialStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalState> getFinalStatePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connector> getConnectorPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SCChartReferece> getSCChartReferecePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialSCChartReferece> getInitialSCChartReferecePredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalSCChartReferece> getFinalSCChartReferecePredecessors();

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
	EList<FinalSuperState> getFinalSuperStateSuccessors();

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
	EList<SCChartReferece> getSCChartRefereceSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InitialSCChartReferece> getInitialSCChartRefereceSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<FinalSCChartReferece> getFinalSCChartRefereceSuccessors();

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
	boolean canNewTerminationDefferdTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDefferdTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(FinalSuperState target, String id);

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
	boolean canNewTerminationDefferdTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationDefferdTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationDefferdTransition newTerminationDefferdTransition(SCChartReferece target, String id);

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
	boolean canNewStrongAbortDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(FinalSuperState target, String id);

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
	boolean canNewStrongAbortDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortDeferredTransition newStrongAbortDeferredTransition(SCChartReferece target, String id);

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
	boolean canNewConditionalTerminationHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(FinalSuperState target, String id);

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
	boolean canNewConditionalTerminationHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationHistoryTransition newConditionalTerminationHistoryTransition(SCChartReferece target, String id);

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
	boolean canNewStrongAbortHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(FinalSuperState target, String id);

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
	boolean canNewStrongAbortHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortHistoryTransition newStrongAbortHistoryTransition(SCChartReferece target, String id);

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
	boolean canNewDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(FinalSuperState target, String id);

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
	boolean canNewDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	DeferredTransition newDeferredTransition(SCChartReferece target, String id);

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
	boolean canNewTerminationHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(FinalSuperState target, String id);

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
	boolean canNewTerminationHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationHistoryTransition newTerminationHistoryTransition(SCChartReferece target, String id);

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
	boolean canNewStrongAbortTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(InitialSCChartReferece target, String id);

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
	boolean canNewStrongAbortTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalSuperState target, String id);

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
	boolean canNewStrongAbortTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewStrongAbortTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	StrongAbortTransition newStrongAbortTransition(SCChartReferece target, String id);

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
	boolean canNewImmediateStrongAbortDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(FinalSuperState target, String id);

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
	boolean canNewImmediateStrongAbortDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortDeferredTransition newImmediateStrongAbortDeferredTransition(SCChartReferece target, String id);

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
	boolean canNewConditionalTerminationTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(InitialSCChartReferece target, String id);

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
	boolean canNewConditionalTerminationTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(FinalSuperState target, String id);

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
	boolean canNewConditionalTerminationTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationTransition newConditionalTerminationTransition(SCChartReferece target, String id);

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
	boolean canNewImmediateStrongAbortHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(FinalSuperState target, String id);

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
	boolean canNewImmediateStrongAbortHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortHistoryTransition newImmediateStrongAbortHistoryTransition(SCChartReferece target, String id);

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
	boolean canNewTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(InitialSCChartReferece target, String id);

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
	boolean canNewTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalSuperState target, String id);

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
	boolean canNewTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	Transition newTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	Transition newTransition(SCChartReferece target, String id);

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
	boolean canNewTerminationTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(InitialSCChartReferece target, String id);

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
	boolean canNewTerminationTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalSuperState target, String id);

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
	boolean canNewTerminationTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewTerminationTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	TerminationTransition newTerminationTransition(SCChartReferece target, String id);

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
	boolean canNewConditionalTerminationDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(FinalSuperState target, String id);

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
	boolean canNewConditionalTerminationDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewConditionalTerminationDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ConditionalTerminationDeferredTransition newConditionalTerminationDeferredTransition(SCChartReferece target, String id);

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
	boolean canNewHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(FinalSuperState target, String id);

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
	boolean canNewHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	HistoryTransition newHistoryTransition(SCChartReferece target, String id);

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
	boolean canNewImmediateHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(FinalSuperState target, String id);

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
	boolean canNewImmediateHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateHistoryTransition newImmediateHistoryTransition(SCChartReferece target, String id);

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
	boolean canNewImmediateTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(InitialSCChartReferece target, String id);

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
	boolean canNewImmediateTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(FinalSuperState target, String id);

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
	boolean canNewImmediateTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateTransition newImmediateTransition(SCChartReferece target, String id);

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
	boolean canNewImmediateStrongAbortTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(InitialSCChartReferece target, String id);

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
	boolean canNewImmediateStrongAbortTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(FinalSuperState target, String id);

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
	boolean canNewImmediateStrongAbortTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateStrongAbortTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateStrongAbortTransition newImmediateStrongAbortTransition(SCChartReferece target, String id);

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
	boolean canNewImmediateDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(InitialSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(InitialSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(FinalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(FinalSuperState target, String id);

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
	boolean canNewImmediateDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(FinalSCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(FinalSCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	boolean canNewImmediateDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(SCChartReferece target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" idRequired="true"
	 * @generated
	 */
	ImmediateDeferredTransition newImmediateDeferredTransition(SCChartReferece target, String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" regionRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(Region region, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model regionRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(Region region, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model regionRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(Region region, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(SCChartReferece sCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(SCChartReferece sCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(SCChartReferece sCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" initialSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(InitialSCChartReferece initialSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initialSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(InitialSCChartReferece initialSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initialSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(InitialSCChartReferece initialSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" finalSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(FinalSCChartReferece finalSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model finalSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(FinalSCChartReferece finalSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model finalSCChartRefereceRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(FinalSCChartReferece finalSCChartReferece, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InitilalSuperStateView getInitilalSuperStateView();

} // InitilalSuperState

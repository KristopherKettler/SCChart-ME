/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Edge;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateStrongAbortTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateStrongAbortTransitionView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate Strong Abort Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getImmediateStrongAbortTransition()
 * @model
 * @generated
 */
public interface ImmediateStrongAbortTransition extends Edge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCondition(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDelay();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDelay(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEffect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setEffect(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPriority(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalImmediateStrongAbortTransition getInternalImmediateStrongAbortTransition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyImmediateStrongAbortTransition();

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
	 * @model kind="operation"
	 * @generated
	 */
	Node getSourceElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Node getTargetElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true"
	 * @generated
	 */
	boolean canReconnectSource(RootState source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true"
	 * @generated
	 */
	void reconnectSource(RootState source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true"
	 * @generated
	 */
	boolean canReconnectSource(SuperState source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true"
	 * @generated
	 */
	void reconnectSource(SuperState source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true"
	 * @generated
	 */
	boolean canReconnectSource(InitilalSuperState source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true"
	 * @generated
	 */
	void reconnectSource(InitilalSuperState source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" targetRequired="true"
	 * @generated
	 */
	boolean canReconnectTarget(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void reconnectTarget(InitialState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" targetRequired="true"
	 * @generated
	 */
	boolean canReconnectTarget(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void reconnectTarget(FinalState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" targetRequired="true"
	 * @generated
	 */
	boolean canReconnectTarget(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void reconnectTarget(SuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" targetRequired="true"
	 * @generated
	 */
	boolean canReconnectTarget(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void reconnectTarget(Connector target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" targetRequired="true"
	 * @generated
	 */
	boolean canReconnectTarget(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void reconnectTarget(InitilalSuperState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" targetRequired="true"
	 * @generated
	 */
	boolean canReconnectTarget(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true"
	 * @generated
	 */
	void reconnectTarget(SimpleState target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ImmediateStrongAbortTransitionView getImmediateStrongAbortTransitionView();

} // ImmediateStrongAbortTransition
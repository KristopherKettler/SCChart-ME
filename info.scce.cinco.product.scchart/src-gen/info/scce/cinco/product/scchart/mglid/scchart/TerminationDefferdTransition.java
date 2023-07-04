/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTerminationDefferdTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.TerminationDefferdTransitionView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termination Defferd Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getTerminationDefferdTransition()
 * @model
 * @generated
 */
public interface TerminationDefferdTransition extends AbstractTransition {
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
	InternalTerminationDefferdTransition getInternalTerminationDefferdTransition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlyTerminationDefferdTransition();

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
	SuperState getTargetElement();

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
	 * @model kind="operation"
	 * @generated
	 */
	TerminationDefferdTransitionView getTerminationDefferdTransitionView();

} // TerminationDefferdTransition

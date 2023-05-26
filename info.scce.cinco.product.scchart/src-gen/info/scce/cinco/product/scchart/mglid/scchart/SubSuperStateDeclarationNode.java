/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode;

import info.scce.cinco.product.scchart.mglid.scchart.views.SubSuperStateDeclarationNodeView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Super State Declaration Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#getSubSuperStateDeclarationNode()
 * @model
 * @generated
 */
public interface SubSuperStateDeclarationNode extends Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDeclarationType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDeclarationType(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InternalSubSuperStateDeclarationNode getInternalSubSuperStateDeclarationNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isExactlySubSuperStateDeclarationNode();

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
	 * @model required="true" subSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(SubSuperState subSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model subSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(SubSuperState subSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model subSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(SubSuperState subSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" initilalSubSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(InitilalSubSuperState initilalSubSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initilalSubSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(InitilalSubSuperState initilalSubSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initilalSubSuperStateRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(InitilalSubSuperState initilalSubSuperState, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" subSuperStateRegionRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	boolean canMoveTo(SubSuperStateRegion subSuperStateRegion, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model subSuperStateRegionRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void moveTo(SubSuperStateRegion subSuperStateRegion, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model subSuperStateRegionRequired="true" xRequired="true" yRequired="true"
	 * @generated
	 */
	void s_moveTo(SubSuperStateRegion subSuperStateRegion, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SubSuperStateDeclarationNodeView getSubSuperStateDeclarationNodeView();

} // SubSuperStateDeclarationNode

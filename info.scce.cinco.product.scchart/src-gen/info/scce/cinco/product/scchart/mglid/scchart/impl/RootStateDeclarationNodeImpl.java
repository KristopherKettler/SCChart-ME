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

import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclarationNode;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode;

import info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root State Declaration Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RootStateDeclarationNodeImpl extends NodeImpl implements RootStateDeclarationNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootStateDeclarationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getRootStateDeclarationNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarationType() {
		return getInternalRootStateDeclarationNode().getDeclarationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarationType(final String _arg) {
		getInternalRootStateDeclarationNode().getElement().transact("Set DeclarationType", () -> {
			getInternalRootStateDeclarationNode().setDeclarationType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputOutput() {
		return getInternalRootStateDeclarationNode().getInputOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(final String _arg) {
		getInternalRootStateDeclarationNode().getElement().transact("Set InputOutput", () -> {
			getInternalRootStateDeclarationNode().setInputOutput(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalRootStateDeclarationNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalRootStateDeclarationNode().getElement().transact("Set Name", () -> {
			getInternalRootStateDeclarationNode().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRootStateDeclarationNode getInternalRootStateDeclarationNode() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyRootStateDeclarationNode() {
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
	public boolean canMoveTo(final RootState rootState, final int x, final int y) {
		return rootState.canContain(info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclarationNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final RootState rootState, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(rootState, x, y);
			rootState.getInternalContainerElement().getModelElements().add(ime);
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
	public void s_moveTo(final RootState rootState, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState getContainer() {
		return (info.scce.cinco.product.scchart.mglid.scchart.RootState)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootStateDeclarationNodeView getRootStateDeclarationNodeView() {
		RootStateDeclarationNodeView rootStateDeclarationNodeView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createRootStateDeclarationNodeView();
		rootStateDeclarationNodeView.setInternalRootStateDeclarationNode((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode)getInternalElement());
		return rootStateDeclarationNodeView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return ScchartPackage.ROOT_STATE_DECLARATION_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
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
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_DECLARATION_TYPE:
				return getDeclarationType();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___SET_DECLARATION_TYPE__STRING:
				setDeclarationType((String)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_INPUT_OUTPUT:
				return getInputOutput();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___SET_INPUT_OUTPUT__STRING:
				setInputOutput((String)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_NAME:
				return getName();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_INTERNAL_ROOT_STATE_DECLARATION_NODE:
				return getInternalRootStateDeclarationNode();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___IS_EXACTLY_ROOT_STATE_DECLARATION_NODE:
				return isExactlyRootStateDeclarationNode();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___CAN_MOVE_TO__ROOTSTATE_INT_INT:
				return canMoveTo((RootState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___MOVE_TO__ROOTSTATE_INT_INT:
				moveTo((RootState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___SMOVE_TO__ROOTSTATE_INT_INT:
				s_moveTo((RootState)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_CONTAINER:
				return getContainer();
			case ScchartPackage.ROOT_STATE_DECLARATION_NODE___GET_ROOT_STATE_DECLARATION_NODE_VIEW:
				return getRootStateDeclarationNodeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RootStateDeclarationNodeImpl
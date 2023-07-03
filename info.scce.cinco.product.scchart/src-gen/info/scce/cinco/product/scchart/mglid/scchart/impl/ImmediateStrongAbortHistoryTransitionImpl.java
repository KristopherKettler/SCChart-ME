/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import graphmodel.impl.EdgeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateStrongAbortHistoryTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateStrongAbortHistoryTransitionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Strong Abort History Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImmediateStrongAbortHistoryTransitionImpl extends EdgeImpl implements ImmediateStrongAbortHistoryTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateStrongAbortHistoryTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getImmediateStrongAbortHistoryTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return getInternalImmediateStrongAbortHistoryTransition().getCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(final String _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set Condition", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setCondition(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelay() {
		return getInternalImmediateStrongAbortHistoryTransition().getDelay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay(final String _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set Delay", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setDelay(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepHistory() {
		return getInternalImmediateStrongAbortHistoryTransition().isDeepHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepHistory(final boolean _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set DeepHistory", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setDeepHistory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return getInternalImmediateStrongAbortHistoryTransition().getEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(final String _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set Effect", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setEffect(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getH() {
		return getInternalImmediateStrongAbortHistoryTransition().getH();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setH(final String _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set H", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setH(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return getInternalImmediateStrongAbortHistoryTransition().getPriority();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(final String _arg) {
		getInternalImmediateStrongAbortHistoryTransition().getElement().transact("Set Priority", () -> {
			getInternalImmediateStrongAbortHistoryTransition().setPriority(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateStrongAbortHistoryTransition getInternalImmediateStrongAbortHistoryTransition() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateStrongAbortHistoryTransition) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyImmediateStrongAbortHistoryTransition() {
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
	public Node getSourceElement() {
		return(graphmodel.Node)super.getSourceElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperState getTargetElement() {
		return(info.scce.cinco.product.scchart.mglid.scchart.SuperState)super.getTargetElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final RootState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final RootState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final SuperState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final SuperState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final InitilalSuperState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final InitilalSuperState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SuperState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SuperState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final InitilalSuperState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final InitilalSuperState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateStrongAbortHistoryTransitionView getImmediateStrongAbortHistoryTransitionView() {
		ImmediateStrongAbortHistoryTransitionView immediateStrongAbortHistoryTransitionView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createImmediateStrongAbortHistoryTransitionView();
		immediateStrongAbortHistoryTransitionView.setInternalImmediateStrongAbortHistoryTransition((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateStrongAbortHistoryTransition)getInternalElement());
		return immediateStrongAbortHistoryTransitionView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___PRE_DELETE;
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
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_CONDITION:
				return getCondition();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___SET_CONDITION__STRING:
				setCondition((String)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_DELAY:
				return getDelay();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___SET_DELAY__STRING:
				setDelay((String)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___IS_DEEP_HISTORY:
				return isDeepHistory();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___SET_DEEP_HISTORY__BOOLEAN:
				setDeepHistory((Boolean)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_EFFECT:
				return getEffect();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___SET_EFFECT__STRING:
				setEffect((String)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_H:
				return getH();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___SET_H__STRING:
				setH((String)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_PRIORITY:
				return getPriority();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___SET_PRIORITY__STRING:
				setPriority((String)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_INTERNAL_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION:
				return getInternalImmediateStrongAbortHistoryTransition();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___IS_EXACTLY_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION:
				return isExactlyImmediateStrongAbortHistoryTransition();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_TARGET_ELEMENT:
				return getTargetElement();
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE:
				return canReconnectSource((RootState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___RECONNECT_SOURCE__ROOTSTATE:
				reconnectSource((RootState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__SUPERSTATE:
				return canReconnectSource((SuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___RECONNECT_SOURCE__SUPERSTATE:
				reconnectSource((SuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___CAN_RECONNECT_SOURCE__INITILALSUPERSTATE:
				return canReconnectSource((InitilalSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___RECONNECT_SOURCE__INITILALSUPERSTATE:
				reconnectSource((InitilalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__SUPERSTATE:
				return canReconnectTarget((SuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___RECONNECT_TARGET__SUPERSTATE:
				reconnectTarget((SuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___CAN_RECONNECT_TARGET__INITILALSUPERSTATE:
				return canReconnectTarget((InitilalSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___RECONNECT_TARGET__INITILALSUPERSTATE:
				reconnectTarget((InitilalSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION___GET_IMMEDIATE_STRONG_ABORT_HISTORY_TRANSITION_VIEW:
				return getImmediateStrongAbortHistoryTransitionView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImmediateStrongAbortHistoryTransitionImpl
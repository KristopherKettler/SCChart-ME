/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImmediateTransitionImpl extends TransitionImpl implements ImmediateTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getImmediateTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return getInternalImmediateTransition().getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(final String _arg) {
		getInternalImmediateTransition().getElement().transact("Set Label", () -> {
			getInternalImmediateTransition().setLabel(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalImmediateTransition getInternalImmediateTransition() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyImmediateTransition() {
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
	public Node getTargetElement() {
		return(graphmodel.Node)super.getTargetElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final InitilalSubSuperState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final InitilalSubSuperState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final InitialState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final InitialState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final Connector source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final Connector source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final SubSuperState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final SubSuperState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectSource(final SimpleState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final SimpleState source) {
		this.setSourceElement(source);
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
	public boolean canReconnectSource(final FinalState source) {
		return source.canStart(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectSource(final FinalState source) {
		this.setSourceElement(source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final InitilalSubSuperState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final InitilalSubSuperState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final InitialState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final InitialState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final Connector target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final Connector target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SubSuperState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SubSuperState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final SimpleState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final SimpleState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canReconnectTarget(final FinalState target) {
		return target.canEnd(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void reconnectTarget(final FinalState target) {
		this.setTargetElement(target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmediateTransitionView getImmediateTransitionView() {
		ImmediateTransitionView immediateTransitionView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createImmediateTransitionView();
		immediateTransitionView.setInternalImmediateTransition((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition)getInternalElement());
		return immediateTransitionView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.IMMEDIATE_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.IMMEDIATE_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.IMMEDIATE_TRANSITION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.IMMEDIATE_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.IMMEDIATE_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return ScchartPackage.IMMEDIATE_TRANSITION___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return ScchartPackage.IMMEDIATE_TRANSITION___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return ScchartPackage.IMMEDIATE_TRANSITION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return ScchartPackage.IMMEDIATE_TRANSITION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return ScchartPackage.IMMEDIATE_TRANSITION___PRE_DELETE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Transition.class) {
			switch (baseOperationID) {
				case ScchartPackage.TRANSITION___PRE_DELETE: return ScchartPackage.IMMEDIATE_TRANSITION___PRE_DELETE;
				case ScchartPackage.TRANSITION___GET_POST_DELETE_FUNCTION: return ScchartPackage.IMMEDIATE_TRANSITION___GET_POST_DELETE_FUNCTION;
				case ScchartPackage.TRANSITION___GET_POST_DELETE_EVENT: return ScchartPackage.IMMEDIATE_TRANSITION___GET_POST_DELETE_EVENT;
				case ScchartPackage.TRANSITION___PRE_SAVE: return ScchartPackage.IMMEDIATE_TRANSITION___PRE_SAVE;
				case ScchartPackage.TRANSITION___POST_SAVE: return ScchartPackage.IMMEDIATE_TRANSITION___POST_SAVE;
				case ScchartPackage.TRANSITION___GET_ROOT_ELEMENT: return ScchartPackage.IMMEDIATE_TRANSITION___GET_ROOT_ELEMENT;
				case ScchartPackage.TRANSITION___GET_SOURCE_ELEMENT: return ScchartPackage.IMMEDIATE_TRANSITION___GET_SOURCE_ELEMENT;
				case ScchartPackage.TRANSITION___GET_TARGET_ELEMENT: return ScchartPackage.IMMEDIATE_TRANSITION___GET_TARGET_ELEMENT;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_SOURCE__INITILALSUBSUPERSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__INITILALSUBSUPERSTATE;
				case ScchartPackage.TRANSITION___RECONNECT_SOURCE__INITILALSUBSUPERSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__INITILALSUBSUPERSTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_SOURCE__INITIALSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__INITIALSTATE;
				case ScchartPackage.TRANSITION___RECONNECT_SOURCE__INITIALSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__INITIALSTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_SOURCE__CONNECTOR: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__CONNECTOR;
				case ScchartPackage.TRANSITION___RECONNECT_SOURCE__CONNECTOR: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__CONNECTOR;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_SOURCE__SUBSUPERSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__SUBSUPERSTATE;
				case ScchartPackage.TRANSITION___RECONNECT_SOURCE__SUBSUPERSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__SUBSUPERSTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_SOURCE__SIMPLESTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__SIMPLESTATE;
				case ScchartPackage.TRANSITION___RECONNECT_SOURCE__SIMPLESTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__SIMPLESTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE;
				case ScchartPackage.TRANSITION___RECONNECT_SOURCE__ROOTSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__ROOTSTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_SOURCE__FINALSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__FINALSTATE;
				case ScchartPackage.TRANSITION___RECONNECT_SOURCE__FINALSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__FINALSTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_TARGET__INITILALSUBSUPERSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__INITILALSUBSUPERSTATE;
				case ScchartPackage.TRANSITION___RECONNECT_TARGET__INITILALSUBSUPERSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__INITILALSUBSUPERSTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_TARGET__INITIALSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__INITIALSTATE;
				case ScchartPackage.TRANSITION___RECONNECT_TARGET__INITIALSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__INITIALSTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_TARGET__CONNECTOR: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__CONNECTOR;
				case ScchartPackage.TRANSITION___RECONNECT_TARGET__CONNECTOR: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__CONNECTOR;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_TARGET__SUBSUPERSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__SUBSUPERSTATE;
				case ScchartPackage.TRANSITION___RECONNECT_TARGET__SUBSUPERSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__SUBSUPERSTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_TARGET__SIMPLESTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__SIMPLESTATE;
				case ScchartPackage.TRANSITION___RECONNECT_TARGET__SIMPLESTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__SIMPLESTATE;
				case ScchartPackage.TRANSITION___CAN_RECONNECT_TARGET__FINALSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__FINALSTATE;
				case ScchartPackage.TRANSITION___RECONNECT_TARGET__FINALSTATE: return ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__FINALSTATE;
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
			case ScchartPackage.IMMEDIATE_TRANSITION___GET_LABEL:
				return getLabel();
			case ScchartPackage.IMMEDIATE_TRANSITION___SET_LABEL__STRING:
				setLabel((String)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___GET_INTERNAL_IMMEDIATE_TRANSITION:
				return getInternalImmediateTransition();
			case ScchartPackage.IMMEDIATE_TRANSITION___IS_EXACTLY_IMMEDIATE_TRANSITION:
				return isExactlyImmediateTransition();
			case ScchartPackage.IMMEDIATE_TRANSITION___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.IMMEDIATE_TRANSITION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.IMMEDIATE_TRANSITION___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.IMMEDIATE_TRANSITION___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case ScchartPackage.IMMEDIATE_TRANSITION___GET_TARGET_ELEMENT:
				return getTargetElement();
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__INITILALSUBSUPERSTATE:
				return canReconnectSource((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__INITILALSUBSUPERSTATE:
				reconnectSource((InitilalSubSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__INITIALSTATE:
				return canReconnectSource((InitialState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__INITIALSTATE:
				reconnectSource((InitialState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__CONNECTOR:
				return canReconnectSource((Connector)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__CONNECTOR:
				reconnectSource((Connector)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__SUBSUPERSTATE:
				return canReconnectSource((SubSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__SUBSUPERSTATE:
				reconnectSource((SubSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__SIMPLESTATE:
				return canReconnectSource((SimpleState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__SIMPLESTATE:
				reconnectSource((SimpleState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE:
				return canReconnectSource((RootState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__ROOTSTATE:
				reconnectSource((RootState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_SOURCE__FINALSTATE:
				return canReconnectSource((FinalState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_SOURCE__FINALSTATE:
				reconnectSource((FinalState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__INITILALSUBSUPERSTATE:
				return canReconnectTarget((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__INITILALSUBSUPERSTATE:
				reconnectTarget((InitilalSubSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__INITIALSTATE:
				return canReconnectTarget((InitialState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__INITIALSTATE:
				reconnectTarget((InitialState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__CONNECTOR:
				return canReconnectTarget((Connector)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__CONNECTOR:
				reconnectTarget((Connector)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__SUBSUPERSTATE:
				return canReconnectTarget((SubSuperState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__SUBSUPERSTATE:
				reconnectTarget((SubSuperState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__SIMPLESTATE:
				return canReconnectTarget((SimpleState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__SIMPLESTATE:
				reconnectTarget((SimpleState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___CAN_RECONNECT_TARGET__FINALSTATE:
				return canReconnectTarget((FinalState)arguments.get(0));
			case ScchartPackage.IMMEDIATE_TRANSITION___RECONNECT_TARGET__FINALSTATE:
				reconnectTarget((FinalState)arguments.get(0));
				return null;
			case ScchartPackage.IMMEDIATE_TRANSITION___GET_IMMEDIATE_TRANSITION_VIEW:
				return getImmediateTransitionView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImmediateTransitionImpl

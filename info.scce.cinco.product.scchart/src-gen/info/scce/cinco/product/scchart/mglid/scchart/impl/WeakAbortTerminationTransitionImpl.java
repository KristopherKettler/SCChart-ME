/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Node;

import graphmodel.impl.EdgeImpl;

import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SCChart;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTerminationTransition;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTerminationTransition;

import info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTerminationTransitionView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Abort Termination Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WeakAbortTerminationTransitionImpl extends EdgeImpl implements WeakAbortTerminationTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeakAbortTerminationTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScchartPackage.eINSTANCE.getWeakAbortTerminationTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalWeakAbortTerminationTransition getInternalWeakAbortTerminationTransition() {
		return (info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTerminationTransition) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyWeakAbortTerminationTransition() {
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
	public WeakAbortTerminationTransitionView getWeakAbortTerminationTransitionView() {
		WeakAbortTerminationTransitionView weakAbortTerminationTransitionView = info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory.eINSTANCE.createWeakAbortTerminationTransitionView();
		weakAbortTerminationTransitionView.setInternalWeakAbortTerminationTransition((info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTerminationTransition)getInternalElement());
		return weakAbortTerminationTransitionView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Edge.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.EDGE___GET_SOURCE_ELEMENT: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_SOURCE_ELEMENT;
				case GraphmodelPackage.EDGE___GET_TARGET_ELEMENT: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_TARGET_ELEMENT;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_FUNCTION: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.EDGE___GET_POST_DELETE_EVENT: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.EDGE___PRE_DELETE: return ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___PRE_DELETE;
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
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION:
				return getInternalWeakAbortTerminationTransition();
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___IS_EXACTLY_WEAK_ABORT_TERMINATION_TRANSITION:
				return isExactlyWeakAbortTerminationTransition();
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___PRE_DELETE:
				preDelete();
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___PRE_SAVE:
				preSave();
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___POST_SAVE:
				postSave();
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_ROOT_ELEMENT:
				return getRootElement();
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_SOURCE_ELEMENT:
				return getSourceElement();
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_TARGET_ELEMENT:
				return getTargetElement();
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_SOURCE__INITILALSUBSUPERSTATE:
				return canReconnectSource((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_SOURCE__INITILALSUBSUPERSTATE:
				reconnectSource((InitilalSubSuperState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_SOURCE__SUBSUPERSTATE:
				return canReconnectSource((SubSuperState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_SOURCE__SUBSUPERSTATE:
				reconnectSource((SubSuperState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_SOURCE__ROOTSTATE:
				return canReconnectSource((RootState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_SOURCE__ROOTSTATE:
				reconnectSource((RootState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_SOURCE__CONNECTOR:
				return canReconnectSource((Connector)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_SOURCE__CONNECTOR:
				reconnectSource((Connector)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_SOURCE__INITIALSTATE:
				return canReconnectSource((InitialState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_SOURCE__INITIALSTATE:
				reconnectSource((InitialState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_SOURCE__SIMPLESTATE:
				return canReconnectSource((SimpleState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_SOURCE__SIMPLESTATE:
				reconnectSource((SimpleState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_SOURCE__FINALSTATE:
				return canReconnectSource((FinalState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_SOURCE__FINALSTATE:
				reconnectSource((FinalState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_TARGET__INITILALSUBSUPERSTATE:
				return canReconnectTarget((InitilalSubSuperState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_TARGET__INITILALSUBSUPERSTATE:
				reconnectTarget((InitilalSubSuperState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_TARGET__SUBSUPERSTATE:
				return canReconnectTarget((SubSuperState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_TARGET__SUBSUPERSTATE:
				reconnectTarget((SubSuperState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_TARGET__CONNECTOR:
				return canReconnectTarget((Connector)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_TARGET__CONNECTOR:
				reconnectTarget((Connector)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_TARGET__INITIALSTATE:
				return canReconnectTarget((InitialState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_TARGET__INITIALSTATE:
				reconnectTarget((InitialState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_TARGET__SIMPLESTATE:
				return canReconnectTarget((SimpleState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_TARGET__SIMPLESTATE:
				reconnectTarget((SimpleState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___CAN_RECONNECT_TARGET__FINALSTATE:
				return canReconnectTarget((FinalState)arguments.get(0));
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___RECONNECT_TARGET__FINALSTATE:
				reconnectTarget((FinalState)arguments.get(0));
				return null;
			case ScchartPackage.WEAK_ABORT_TERMINATION_TRANSITION___GET_WEAK_ABORT_TERMINATION_TRANSITION_VIEW:
				return getWeakAbortTerminationTransitionView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //WeakAbortTerminationTransitionImpl

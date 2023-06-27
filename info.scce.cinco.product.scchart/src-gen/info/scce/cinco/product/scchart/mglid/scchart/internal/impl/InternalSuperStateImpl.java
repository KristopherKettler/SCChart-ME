/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;
import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import graphmodel.internal.impl.InternalContainerImpl;

import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Connector;
import info.scce.cinco.product.scchart.mglid.scchart.FinalState;
import info.scce.cinco.product.scchart.mglid.scchart.InitialState;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl#getSuspends <em>Suspends</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalSuperStateImpl extends InternalContainerImpl implements InternalSuperState {
	/**
	 * The cached value of the '{@link #getSuspends() <em>Suspends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspends()
	 * @generated
	 * @ordered
	 */
	protected EList<Suspend> suspends;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "<insert name>";

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperStateDeclaration> declaration;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalSuperStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_SUPER_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Suspend> getSuspends() {
		if (suspends == null) {
			suspends = new EObjectContainmentEList<Suspend>(Suspend.class, this, InternalPackage.INTERNAL_SUPER_STATE__SUSPENDS);
		}
		return suspends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_SUPER_STATE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperStateDeclaration> getDeclaration() {
		if (declaration == null) {
			declaration = new EObjectContainmentEList<SuperStateDeclaration>(SuperStateDeclaration.class, this, InternalPackage.INTERNAL_SUPER_STATE__DECLARATION);
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, InternalPackage.INTERNAL_SUPER_STATE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainmentConstraint> getContainmentConstraints() {
		 org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>constraints =
			new org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>();
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.mglid.scchart.Region.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.mglid.scchart.ActionNode.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.mglid.scchart.SuspendNode.class));
		return constraints;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(false, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.Transition.class,info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class,info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class,info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class,info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class,info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class,info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class,info.scce.cinco.product.scchart.mglid.scchart.ShallowHistoryTransition.class,info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0));
		eList.addAll(super.getIncomingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		ConnectionConstraint cons0 = new ConnectionConstraint(true, 0, -1, info.scce.cinco.product.scchart.mglid.scchart.Transition.class,info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition.class,info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition.class,info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition.class,info.scce.cinco.product.scchart.mglid.scchart.WeakAbortTransition.class,info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition.class,info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition.class,info.scce.cinco.product.scchart.mglid.scchart.ShallowHistoryTransition.class,info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition.class);
		org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>eList = new org.eclipse.emf.common.util.BasicEList<ConnectionConstraint>();
		eList.addAll(com.google.common.collect.Lists.newArrayList(cons0));
		eList.addAll(super.getOutgoingConstraints());
		return eList;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RootState> getRootStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.RootState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSuperState> getInitilalSuperStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStatePredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorPredecessors() {
		return ((graphmodel.Node)this.getElement()).getPredecessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperState> getSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitilalSuperState> getInitilalSuperStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleState> getSimpleStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InitialState> getInitialStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.InitialState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FinalState> getFinalStateSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.FinalState.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectorSuccessors() {
		return ((graphmodel.Node)this.getElement()).getSuccessors(info.scce.cinco.product.scchart.mglid.scchart.Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SUPER_STATE__SUSPENDS:
				return ((InternalEList<?>)getSuspends()).basicRemove(otherEnd, msgs);
			case InternalPackage.INTERNAL_SUPER_STATE__DECLARATION:
				return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
			case InternalPackage.INTERNAL_SUPER_STATE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SUPER_STATE__SUSPENDS:
				return getSuspends();
			case InternalPackage.INTERNAL_SUPER_STATE__LABEL:
				return getLabel();
			case InternalPackage.INTERNAL_SUPER_STATE__DECLARATION:
				return getDeclaration();
			case InternalPackage.INTERNAL_SUPER_STATE__ACTIONS:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SUPER_STATE__SUSPENDS:
				getSuspends().clear();
				getSuspends().addAll((Collection<? extends Suspend>)newValue);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__LABEL:
				setLabel((String)newValue);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__DECLARATION:
				getDeclaration().clear();
				getDeclaration().addAll((Collection<? extends SuperStateDeclaration>)newValue);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SUPER_STATE__SUSPENDS:
				getSuspends().clear();
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__DECLARATION:
				getDeclaration().clear();
				return;
			case InternalPackage.INTERNAL_SUPER_STATE__ACTIONS:
				getActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InternalPackage.INTERNAL_SUPER_STATE__SUSPENDS:
				return suspends != null && !suspends.isEmpty();
			case InternalPackage.INTERNAL_SUPER_STATE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case InternalPackage.INTERNAL_SUPER_STATE__DECLARATION:
				return declaration != null && !declaration.isEmpty();
			case InternalPackage.INTERNAL_SUPER_STATE__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalNode.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS: return InternalPackage.INTERNAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS;
				case graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS: return InternalPackage.INTERNAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS;
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
			case InternalPackage.INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS:
				return getRootStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS:
				return getSuperStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS:
				return getInitilalSuperStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS:
				return getSimpleStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS:
				return getInitialStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS:
				return getFinalStatePredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS:
				return getConnectorPredecessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS:
				return getSuperStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS:
				return getInitilalSuperStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS:
				return getSimpleStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS:
				return getInitialStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS:
				return getFinalStateSuccessors();
			case InternalPackage.INTERNAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS:
				return getConnectorSuccessors();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //InternalSuperStateImpl

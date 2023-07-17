/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalModelElementContainer;

import info.scce.cinco.product.scchart.mglid.scchart.RootState;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialSCChartReferece;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChartReferece;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial SC Chart Referece</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InternalInitialSCChartRefereceImpl extends InternalSCChartRefereceImpl implements InternalInitialSCChartReferece {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalInitialSCChartRefereceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_INITIAL_SC_CHART_REFERECE;
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
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.mglid.scchart.RootState.class,info.scce.cinco.product.scchart.mglid.scchart.Region.class,info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion.class,info.scce.cinco.product.scchart.mglid.scchart.SuperState.class,info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class,info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class,info.scce.cinco.product.scchart.mglid.scchart.Declaration.class,info.scce.cinco.product.scchart.mglid.scchart.Suspend.class,info.scce.cinco.product.scchart.mglid.scchart.Action.class,info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class,info.scce.cinco.product.scchart.mglid.scchart.InitialState.class,info.scce.cinco.product.scchart.mglid.scchart.FinalState.class,info.scce.cinco.product.scchart.mglid.scchart.Connector.class,info.scce.cinco.product.scchart.mglid.scchart.Input.class,info.scce.cinco.product.scchart.mglid.scchart.Output.class,info.scce.cinco.product.scchart.mglid.scchart.Operator.class,info.scce.cinco.product.scchart.mglid.scchart.CircuitConnecter.class,info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class,info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class,info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.scchart.mglid.scchart.RootState.class,info.scce.cinco.product.scchart.mglid.scchart.Region.class,info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion.class,info.scce.cinco.product.scchart.mglid.scchart.SuperState.class,info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState.class,info.scce.cinco.product.scchart.mglid.scchart.FinalSuperState.class,info.scce.cinco.product.scchart.mglid.scchart.Declaration.class,info.scce.cinco.product.scchart.mglid.scchart.Suspend.class,info.scce.cinco.product.scchart.mglid.scchart.Action.class,info.scce.cinco.product.scchart.mglid.scchart.SimpleState.class,info.scce.cinco.product.scchart.mglid.scchart.InitialState.class,info.scce.cinco.product.scchart.mglid.scchart.FinalState.class,info.scce.cinco.product.scchart.mglid.scchart.Connector.class,info.scce.cinco.product.scchart.mglid.scchart.Input.class,info.scce.cinco.product.scchart.mglid.scchart.Output.class,info.scce.cinco.product.scchart.mglid.scchart.Operator.class,info.scce.cinco.product.scchart.mglid.scchart.CircuitConnecter.class,info.scce.cinco.product.scchart.mglid.scchart.SCChartReferece.class,info.scce.cinco.product.scchart.mglid.scchart.InitialSCChartReferece.class,info.scce.cinco.product.scchart.mglid.scchart.FinalSCChartReferece.class));
		return constraints;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootState getReference() {
		String uid = getLibraryComponentUID();
		return (info.scce.cinco.product.scchart.mglid.scchart.RootState) de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_INITIAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_INITIAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalSCChartReferece.class) {
			switch (baseOperationID) {
				case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_INITIAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS;
				case InternalPackage.INTERNAL_SC_CHART_REFERECE___GET_REFERENCE: return InternalPackage.INTERNAL_INITIAL_SC_CHART_REFERECE___GET_REFERENCE;
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
			case InternalPackage.INTERNAL_INITIAL_SC_CHART_REFERECE___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
			case InternalPackage.INTERNAL_INITIAL_SC_CHART_REFERECE___GET_REFERENCE:
				return getReference();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InternalInitialSCChartRefereceImpl

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalEdge;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;
import graphmodel.internal.InternalType;

import info.scce.cinco.product.scchart.mglid.scchart.internal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage
 * @generated
 */
public class InternalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InternalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InternalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalSwitch<Adapter> modelSwitch =
		new InternalSwitch<Adapter>() {
			@Override
			public Adapter caseInternalRootState(InternalRootState object) {
				return createInternalRootStateAdapter();
			}
			@Override
			public Adapter caseInternalSuperStateRegion(InternalSuperStateRegion object) {
				return createInternalSuperStateRegionAdapter();
			}
			@Override
			public Adapter caseInternalSubSuperState(InternalSubSuperState object) {
				return createInternalSubSuperStateAdapter();
			}
			@Override
			public Adapter caseInternalInitilalSubSuperState(InternalInitilalSubSuperState object) {
				return createInternalInitilalSubSuperStateAdapter();
			}
			@Override
			public Adapter caseInternalSubSuperStateRegion(InternalSubSuperStateRegion object) {
				return createInternalSubSuperStateRegionAdapter();
			}
			@Override
			public Adapter caseInternalSuperStateDeclarationNode(InternalSuperStateDeclarationNode object) {
				return createInternalSuperStateDeclarationNodeAdapter();
			}
			@Override
			public Adapter caseInternalSubSuperStateDeclarationNode(InternalSubSuperStateDeclarationNode object) {
				return createInternalSubSuperStateDeclarationNodeAdapter();
			}
			@Override
			public Adapter caseInternalSimpleState(InternalSimpleState object) {
				return createInternalSimpleStateAdapter();
			}
			@Override
			public Adapter caseInternalInitialState(InternalInitialState object) {
				return createInternalInitialStateAdapter();
			}
			@Override
			public Adapter caseInternalFinalState(InternalFinalState object) {
				return createInternalFinalStateAdapter();
			}
			@Override
			public Adapter caseInternalConnector(InternalConnector object) {
				return createInternalConnectorAdapter();
			}
			@Override
			public Adapter caseInternalTransition(InternalTransition object) {
				return createInternalTransitionAdapter();
			}
			@Override
			public Adapter caseInternalImmediateTransition(InternalImmediateTransition object) {
				return createInternalImmediateTransitionAdapter();
			}
			@Override
			public Adapter caseInternalImmediateTerminationTransition(InternalImmediateTerminationTransition object) {
				return createInternalImmediateTerminationTransitionAdapter();
			}
			@Override
			public Adapter caseInternalWeakAbortTransition(InternalWeakAbortTransition object) {
				return createInternalWeakAbortTransitionAdapter();
			}
			@Override
			public Adapter caseInternalStrongAbortTransition(InternalStrongAbortTransition object) {
				return createInternalStrongAbortTransitionAdapter();
			}
			@Override
			public Adapter caseInternalWeakAbortTerminationTransition(InternalWeakAbortTerminationTransition object) {
				return createInternalWeakAbortTerminationTransitionAdapter();
			}
			@Override
			public Adapter caseInternalDefferedTransition(InternalDefferedTransition object) {
				return createInternalDefferedTransitionAdapter();
			}
			@Override
			public Adapter caseInternalSCChart(InternalSCChart object) {
				return createInternalSCChartAdapter();
			}
			@Override
			public Adapter caseInternalSuperStateDeclaration(InternalSuperStateDeclaration object) {
				return createInternalSuperStateDeclarationAdapter();
			}
			@Override
			public Adapter caseInternalSubSuperStateDeclaration(InternalSubSuperStateDeclaration object) {
				return createInternalSubSuperStateDeclarationAdapter();
			}
			@Override
			public Adapter caseInternalIdentifiableElement(InternalIdentifiableElement object) {
				return createInternalIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseInternalModelElement(InternalModelElement object) {
				return createInternalModelElementAdapter();
			}
			@Override
			public Adapter caseInternalNode(InternalNode object) {
				return createInternalNodeAdapter();
			}
			@Override
			public Adapter caseInternalModelElementContainer(InternalModelElementContainer object) {
				return createInternalModelElementContainerAdapter();
			}
			@Override
			public Adapter caseInternalContainer(InternalContainer object) {
				return createInternalContainerAdapter();
			}
			@Override
			public Adapter caseInternalEdge(InternalEdge object) {
				return createInternalEdgeAdapter();
			}
			@Override
			public Adapter caseInternalGraphModel(InternalGraphModel object) {
				return createInternalGraphModelAdapter();
			}
			@Override
			public Adapter caseInternalType(InternalType object) {
				return createInternalTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState <em>Root State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState
	 * @generated
	 */
	public Adapter createInternalRootStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion <em>Super State Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion
	 * @generated
	 */
	public Adapter createInternalSuperStateRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState <em>Sub Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState
	 * @generated
	 */
	public Adapter createInternalSubSuperStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState <em>Initilal Sub Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState
	 * @generated
	 */
	public Adapter createInternalInitilalSubSuperStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion <em>Sub Super State Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion
	 * @generated
	 */
	public Adapter createInternalSubSuperStateRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode <em>Super State Declaration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode
	 * @generated
	 */
	public Adapter createInternalSuperStateDeclarationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode <em>Sub Super State Declaration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode
	 * @generated
	 */
	public Adapter createInternalSubSuperStateDeclarationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState <em>Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState
	 * @generated
	 */
	public Adapter createInternalSimpleStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState
	 * @generated
	 */
	public Adapter createInternalInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState
	 * @generated
	 */
	public Adapter createInternalFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector
	 * @generated
	 */
	public Adapter createInternalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition
	 * @generated
	 */
	public Adapter createInternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition
	 * @generated
	 */
	public Adapter createInternalImmediateTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTerminationTransition <em>Immediate Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTerminationTransition
	 * @generated
	 */
	public Adapter createInternalImmediateTerminationTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTransition <em>Weak Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTransition
	 * @generated
	 */
	public Adapter createInternalWeakAbortTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition <em>Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition
	 * @generated
	 */
	public Adapter createInternalStrongAbortTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTerminationTransition <em>Weak Abort Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTerminationTransition
	 * @generated
	 */
	public Adapter createInternalWeakAbortTerminationTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDefferedTransition <em>Deffered Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDefferedTransition
	 * @generated
	 */
	public Adapter createInternalDefferedTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart <em>SC Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart
	 * @generated
	 */
	public Adapter createInternalSCChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration <em>Super State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration
	 * @generated
	 */
	public Adapter createInternalSuperStateDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration <em>Sub Super State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration
	 * @generated
	 */
	public Adapter createInternalSubSuperStateDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalIdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalIdentifiableElement
	 * @generated
	 */
	public Adapter createInternalIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalModelElement
	 * @generated
	 */
	public Adapter createInternalModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalNode
	 * @generated
	 */
	public Adapter createInternalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalModelElementContainer <em>Model Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalModelElementContainer
	 * @generated
	 */
	public Adapter createInternalModelElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalContainer
	 * @generated
	 */
	public Adapter createInternalContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalEdge
	 * @generated
	 */
	public Adapter createInternalEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalGraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalGraphModel
	 * @generated
	 */
	public Adapter createInternalGraphModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalType
	 * @generated
	 */
	public Adapter createInternalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InternalAdapterFactory

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.util;

import graphmodel.Container;
import graphmodel.Edge;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;
import graphmodel.Type;

import info.scce.cinco.product.scchart.mglid.scchart.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage
 * @generated
 */
public class ScchartAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScchartPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScchartAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScchartPackage.eINSTANCE;
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
	protected ScchartSwitch<Adapter> modelSwitch =
		new ScchartSwitch<Adapter>() {
			@Override
			public Adapter caseRootState(RootState object) {
				return createRootStateAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseDataFlowRegion(DataFlowRegion object) {
				return createDataFlowRegionAdapter();
			}
			@Override
			public Adapter caseSuperState(SuperState object) {
				return createSuperStateAdapter();
			}
			@Override
			public Adapter caseInitilalSuperState(InitilalSuperState object) {
				return createInitilalSuperStateAdapter();
			}
			@Override
			public Adapter caseRootStateDeclarationNode(RootStateDeclarationNode object) {
				return createRootStateDeclarationNodeAdapter();
			}
			@Override
			public Adapter caseSuspendNode(SuspendNode object) {
				return createSuspendNodeAdapter();
			}
			@Override
			public Adapter caseActionNode(ActionNode object) {
				return createActionNodeAdapter();
			}
			@Override
			public Adapter caseSuperStateDeclarationNode(SuperStateDeclarationNode object) {
				return createSuperStateDeclarationNodeAdapter();
			}
			@Override
			public Adapter caseSimpleState(SimpleState object) {
				return createSimpleStateAdapter();
			}
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseAbstractTransition(AbstractTransition object) {
				return createAbstractTransitionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseImmediateTransition(ImmediateTransition object) {
				return createImmediateTransitionAdapter();
			}
			@Override
			public Adapter caseTerminationTransition(TerminationTransition object) {
				return createTerminationTransitionAdapter();
			}
			@Override
			public Adapter caseConditionalTerminationTransition(ConditionalTerminationTransition object) {
				return createConditionalTerminationTransitionAdapter();
			}
			@Override
			public Adapter caseStrongAbortTransition(StrongAbortTransition object) {
				return createStrongAbortTransitionAdapter();
			}
			@Override
			public Adapter caseImmediateStrongAbortTransition(ImmediateStrongAbortTransition object) {
				return createImmediateStrongAbortTransitionAdapter();
			}
			@Override
			public Adapter caseDeferredTransition(DeferredTransition object) {
				return createDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseImmediateDeferredTransition(ImmediateDeferredTransition object) {
				return createImmediateDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseTerminationDefferdTransition(TerminationDefferdTransition object) {
				return createTerminationDefferdTransitionAdapter();
			}
			@Override
			public Adapter caseConditionalTerminationDeferredTransition(ConditionalTerminationDeferredTransition object) {
				return createConditionalTerminationDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseStrongAbortDeferredTransition(StrongAbortDeferredTransition object) {
				return createStrongAbortDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseImmediateStrongAbortDeferredTransition(ImmediateStrongAbortDeferredTransition object) {
				return createImmediateStrongAbortDeferredTransitionAdapter();
			}
			@Override
			public Adapter caseHistoryTransition(HistoryTransition object) {
				return createHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseImmediateHistoryTransition(ImmediateHistoryTransition object) {
				return createImmediateHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseTerminationHistoryTransition(TerminationHistoryTransition object) {
				return createTerminationHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseConditionalTerminationHistoryTransition(ConditionalTerminationHistoryTransition object) {
				return createConditionalTerminationHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseStrongAbortHistoryTransition(StrongAbortHistoryTransition object) {
				return createStrongAbortHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseImmediateStrongAbortHistoryTransition(ImmediateStrongAbortHistoryTransition object) {
				return createImmediateStrongAbortHistoryTransitionAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseSCChart(SCChart object) {
				return createSCChartAdapter();
			}
			@Override
			public Adapter caseRootStateDeclaration(RootStateDeclaration object) {
				return createRootStateDeclarationAdapter();
			}
			@Override
			public Adapter caseSuperStateDeclaration(SuperStateDeclaration object) {
				return createSuperStateDeclarationAdapter();
			}
			@Override
			public Adapter caseSuspend(Suspend object) {
				return createSuspendAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseIdentifiableElement(IdentifiableElement object) {
				return createIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseModelElementContainer(ModelElementContainer object) {
				return createModelElementContainerAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseGraphModel(GraphModel object) {
				return createGraphModelAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.RootState <em>Root State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.RootState
	 * @generated
	 */
	public Adapter createRootStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion <em>Data Flow Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion
	 * @generated
	 */
	public Adapter createDataFlowRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.SuperState <em>Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.SuperState
	 * @generated
	 */
	public Adapter createSuperStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState <em>Initilal Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState
	 * @generated
	 */
	public Adapter createInitilalSuperStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclarationNode <em>Root State Declaration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclarationNode
	 * @generated
	 */
	public Adapter createRootStateDeclarationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.SuspendNode <em>Suspend Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.SuspendNode
	 * @generated
	 */
	public Adapter createSuspendNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ActionNode <em>Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ActionNode
	 * @generated
	 */
	public Adapter createActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode <em>Super State Declaration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclarationNode
	 * @generated
	 */
	public Adapter createSuperStateDeclarationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.SimpleState <em>Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.SimpleState
	 * @generated
	 */
	public Adapter createSimpleStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition
	 * @generated
	 */
	public Adapter createAbstractTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition
	 * @generated
	 */
	public Adapter createImmediateTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition <em>Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition
	 * @generated
	 */
	public Adapter createTerminationTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition <em>Conditional Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition
	 * @generated
	 */
	public Adapter createConditionalTerminationTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition <em>Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition
	 * @generated
	 */
	public Adapter createStrongAbortTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition <em>Immediate Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition
	 * @generated
	 */
	public Adapter createImmediateStrongAbortTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition <em>Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.DeferredTransition
	 * @generated
	 */
	public Adapter createDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition <em>Immediate Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ImmediateDeferredTransition
	 * @generated
	 */
	public Adapter createImmediateDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition <em>Termination Defferd Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.TerminationDefferdTransition
	 * @generated
	 */
	public Adapter createTerminationDefferdTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition <em>Conditional Termination Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationDeferredTransition
	 * @generated
	 */
	public Adapter createConditionalTerminationDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition <em>Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.StrongAbortDeferredTransition
	 * @generated
	 */
	public Adapter createStrongAbortDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition <em>Immediate Strong Abort Deferred Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortDeferredTransition
	 * @generated
	 */
	public Adapter createImmediateStrongAbortDeferredTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition <em>History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.HistoryTransition
	 * @generated
	 */
	public Adapter createHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition <em>Immediate History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ImmediateHistoryTransition
	 * @generated
	 */
	public Adapter createImmediateHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition <em>Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.TerminationHistoryTransition
	 * @generated
	 */
	public Adapter createTerminationHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition <em>Conditional Termination History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationHistoryTransition
	 * @generated
	 */
	public Adapter createConditionalTerminationHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition <em>Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.StrongAbortHistoryTransition
	 * @generated
	 */
	public Adapter createStrongAbortHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition <em>Immediate Strong Abort History Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortHistoryTransition
	 * @generated
	 */
	public Adapter createImmediateStrongAbortHistoryTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.SCChart <em>SC Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.SCChart
	 * @generated
	 */
	public Adapter createSCChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration <em>Root State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration
	 * @generated
	 */
	public Adapter createRootStateDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration <em>Super State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration
	 * @generated
	 */
	public Adapter createSuperStateDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.Suspend <em>Suspend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.Suspend
	 * @generated
	 */
	public Adapter createSuspendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.IdentifiableElement
	 * @generated
	 */
	public Adapter createIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.ModelElementContainer <em>Model Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.ModelElementContainer
	 * @generated
	 */
	public Adapter createModelElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.GraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.GraphModel
	 * @generated
	 */
	public Adapter createGraphModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
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

} //ScchartAdapterFactory

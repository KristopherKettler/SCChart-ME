/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.util;

import info.scce.cinco.product.scchart.mglid.scchart.views.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage
 * @generated
 */
public class ViewsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
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
	protected ViewsSwitch<Adapter> modelSwitch =
		new ViewsSwitch<Adapter>() {
			@Override
			public Adapter caseRootStateView(RootStateView object) {
				return createRootStateViewAdapter();
			}
			@Override
			public Adapter caseRegionView(RegionView object) {
				return createRegionViewAdapter();
			}
			@Override
			public Adapter caseDataFlowRegionView(DataFlowRegionView object) {
				return createDataFlowRegionViewAdapter();
			}
			@Override
			public Adapter caseSuperStateView(SuperStateView object) {
				return createSuperStateViewAdapter();
			}
			@Override
			public Adapter caseInitilalSuperStateView(InitilalSuperStateView object) {
				return createInitilalSuperStateViewAdapter();
			}
			@Override
			public Adapter caseRootStateDeclarationNodeView(RootStateDeclarationNodeView object) {
				return createRootStateDeclarationNodeViewAdapter();
			}
			@Override
			public Adapter caseSuspendNodeView(SuspendNodeView object) {
				return createSuspendNodeViewAdapter();
			}
			@Override
			public Adapter caseActionNodeView(ActionNodeView object) {
				return createActionNodeViewAdapter();
			}
			@Override
			public Adapter caseSuperStateDeclarationNodeView(SuperStateDeclarationNodeView object) {
				return createSuperStateDeclarationNodeViewAdapter();
			}
			@Override
			public Adapter caseSimpleStateView(SimpleStateView object) {
				return createSimpleStateViewAdapter();
			}
			@Override
			public Adapter caseInitialStateView(InitialStateView object) {
				return createInitialStateViewAdapter();
			}
			@Override
			public Adapter caseFinalStateView(FinalStateView object) {
				return createFinalStateViewAdapter();
			}
			@Override
			public Adapter caseConnectorView(ConnectorView object) {
				return createConnectorViewAdapter();
			}
			@Override
			public Adapter caseTransitionView(TransitionView object) {
				return createTransitionViewAdapter();
			}
			@Override
			public Adapter caseImmediateTransitionView(ImmediateTransitionView object) {
				return createImmediateTransitionViewAdapter();
			}
			@Override
			public Adapter caseTerminationTransitionView(TerminationTransitionView object) {
				return createTerminationTransitionViewAdapter();
			}
			@Override
			public Adapter caseConditionalTerminationTransitionView(ConditionalTerminationTransitionView object) {
				return createConditionalTerminationTransitionViewAdapter();
			}
			@Override
			public Adapter caseWeakAbortTransitionView(WeakAbortTransitionView object) {
				return createWeakAbortTransitionViewAdapter();
			}
			@Override
			public Adapter caseStrongAbortTransitionView(StrongAbortTransitionView object) {
				return createStrongAbortTransitionViewAdapter();
			}
			@Override
			public Adapter caseDeferredTransitionView(DeferredTransitionView object) {
				return createDeferredTransitionViewAdapter();
			}
			@Override
			public Adapter caseHistoryTransitionView(HistoryTransitionView object) {
				return createHistoryTransitionViewAdapter();
			}
			@Override
			public Adapter caseSCChartView(SCChartView object) {
				return createSCChartViewAdapter();
			}
			@Override
			public Adapter caseRootStateDeclarationView(RootStateDeclarationView object) {
				return createRootStateDeclarationViewAdapter();
			}
			@Override
			public Adapter caseSuperStateDeclarationView(SuperStateDeclarationView object) {
				return createSuperStateDeclarationViewAdapter();
			}
			@Override
			public Adapter caseSuspendView(SuspendView object) {
				return createSuspendViewAdapter();
			}
			@Override
			public Adapter caseActionView(ActionView object) {
				return createActionViewAdapter();
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
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView <em>Root State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView
	 * @generated
	 */
	public Adapter createRootStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView <em>Region View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView
	 * @generated
	 */
	public Adapter createRegionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DataFlowRegionView <em>Data Flow Region View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DataFlowRegionView
	 * @generated
	 */
	public Adapter createDataFlowRegionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView <em>Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView
	 * @generated
	 */
	public Adapter createSuperStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitilalSuperStateView <em>Initilal Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitilalSuperStateView
	 * @generated
	 */
	public Adapter createInitilalSuperStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView <em>Root State Declaration Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView
	 * @generated
	 */
	public Adapter createRootStateDeclarationNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspendNodeView <em>Suspend Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspendNodeView
	 * @generated
	 */
	public Adapter createSuspendNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionNodeView <em>Action Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionNodeView
	 * @generated
	 */
	public Adapter createActionNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView <em>Super State Declaration Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView
	 * @generated
	 */
	public Adapter createSuperStateDeclarationNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView <em>Simple State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView
	 * @generated
	 */
	public Adapter createSimpleStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView <em>Initial State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView
	 * @generated
	 */
	public Adapter createInitialStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView <em>Final State View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView
	 * @generated
	 */
	public Adapter createFinalStateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView <em>Connector View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView
	 * @generated
	 */
	public Adapter createConnectorViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView <em>Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView
	 * @generated
	 */
	public Adapter createTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView <em>Immediate Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView
	 * @generated
	 */
	public Adapter createImmediateTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView <em>Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TerminationTransitionView
	 * @generated
	 */
	public Adapter createTerminationTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ConditionalTerminationTransitionView <em>Conditional Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ConditionalTerminationTransitionView
	 * @generated
	 */
	public Adapter createConditionalTerminationTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTransitionView <em>Weak Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTransitionView
	 * @generated
	 */
	public Adapter createWeakAbortTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView <em>Strong Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView
	 * @generated
	 */
	public Adapter createStrongAbortTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView <em>Deferred Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DeferredTransitionView
	 * @generated
	 */
	public Adapter createDeferredTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView <em>History Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.HistoryTransitionView
	 * @generated
	 */
	public Adapter createHistoryTransitionViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView <em>SC Chart View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView
	 * @generated
	 */
	public Adapter createSCChartViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView <em>Root State Declaration View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView
	 * @generated
	 */
	public Adapter createRootStateDeclarationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView <em>Super State Declaration View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView
	 * @generated
	 */
	public Adapter createSuperStateDeclarationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuspendView <em>Suspend View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuspendView
	 * @generated
	 */
	public Adapter createSuspendViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ActionView <em>Action View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ActionView
	 * @generated
	 */
	public Adapter createActionViewAdapter() {
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

} //ViewsAdapterFactory

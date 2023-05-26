/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.mglid.scchart.impl.ScchartPackageImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl;

import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory;
import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsPackageImpl extends EPackageImpl implements ViewsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superStateRegionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSuperStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initilalSubSuperStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSuperStateRegionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superStateDeclarationNodeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSuperStateDeclarationNodeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateTerminationTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weakAbortTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongAbortTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weakAbortTerminationTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defferedTransitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scChartViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superStateDeclarationViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSuperStateDeclarationViewEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewsPackageImpl() {
		super(eNS_URI, ViewsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ViewsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ViewsPackage init() {
		if (isInited) return (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViewsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ViewsPackageImpl theViewsPackage = registeredViewsPackage instanceof ViewsPackageImpl ? (ViewsPackageImpl)registeredViewsPackage : new ViewsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI);
		ScchartPackageImpl theScchartPackage = (ScchartPackageImpl)(registeredPackage instanceof ScchartPackageImpl ? registeredPackage : ScchartPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);
		InternalPackageImpl theInternalPackage = (InternalPackageImpl)(registeredPackage instanceof InternalPackageImpl ? registeredPackage : InternalPackage.eINSTANCE);

		// Load packages
		theScchartPackage.loadPackage();

		// Fix loaded packages
		theViewsPackage.fixPackageContents();
		theScchartPackage.fixPackageContents();
		theInternalPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewsPackage.eNS_URI, theViewsPackage);
		return theViewsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootStateView() {
		if (rootStateViewEClass == null) {
			rootStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return rootStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRootStateView_InternalRootState() {
        return (EReference)getRootStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__GetLabel() {
        return getRootStateView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__SetLabel__String() {
        return getRootStateView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__GetDeclaration() {
        return getRootStateView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__SetDeclaration__EList() {
        return getRootStateView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__AddDeclaration__SuperStateDeclaration() {
        return getRootStateView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateView__RemoveDeclaration__SuperStateDeclaration() {
        return getRootStateView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperStateRegionView() {
		if (superStateRegionViewEClass == null) {
			superStateRegionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return superStateRegionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperStateRegionView_InternalSuperStateRegion() {
        return (EReference)getSuperStateRegionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegionView__GetLabel() {
        return getSuperStateRegionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegionView__SetLabel__String() {
        return getSuperStateRegionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegionView__GetRegionID() {
        return getSuperStateRegionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegionView__SetRegionID__String() {
        return getSuperStateRegionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSuperStateView() {
		if (subSuperStateViewEClass == null) {
			subSuperStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return subSuperStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubSuperStateView_InternalSubSuperState() {
        return (EReference)getSubSuperStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateView__GetLabel() {
        return getSubSuperStateView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateView__SetLabel__String() {
        return getSubSuperStateView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateView__GetDeclaration() {
        return getSubSuperStateView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateView__SetDeclaration__EList() {
        return getSubSuperStateView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateView__AddDeclaration__SubSuperStateDeclaration() {
        return getSubSuperStateView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateView__RemoveDeclaration__SubSuperStateDeclaration() {
        return getSubSuperStateView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitilalSubSuperStateView() {
		if (initilalSubSuperStateViewEClass == null) {
			initilalSubSuperStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return initilalSubSuperStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitilalSubSuperStateView_InternalInitilalSubSuperState() {
        return (EReference)getInitilalSubSuperStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSuperStateRegionView() {
		if (subSuperStateRegionViewEClass == null) {
			subSuperStateRegionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return subSuperStateRegionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubSuperStateRegionView_InternalSubSuperStateRegion() {
        return (EReference)getSubSuperStateRegionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegionView__GetRegionID() {
        return getSubSuperStateRegionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegionView__SetRegionID__String() {
        return getSubSuperStateRegionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperStateDeclarationNodeView() {
		if (superStateDeclarationNodeViewEClass == null) {
			superStateDeclarationNodeViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return superStateDeclarationNodeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperStateDeclarationNodeView_InternalSuperStateDeclarationNode() {
        return (EReference)getSuperStateDeclarationNodeView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNodeView__GetDeclarationType() {
        return getSuperStateDeclarationNodeView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNodeView__SetDeclarationType__String() {
        return getSuperStateDeclarationNodeView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNodeView__GetInputOutput() {
        return getSuperStateDeclarationNodeView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNodeView__SetInputOutput__String() {
        return getSuperStateDeclarationNodeView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNodeView__GetName() {
        return getSuperStateDeclarationNodeView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNodeView__SetName__String() {
        return getSuperStateDeclarationNodeView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSuperStateDeclarationNodeView() {
		if (subSuperStateDeclarationNodeViewEClass == null) {
			subSuperStateDeclarationNodeViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return subSuperStateDeclarationNodeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubSuperStateDeclarationNodeView_InternalSubSuperStateDeclarationNode() {
        return (EReference)getSubSuperStateDeclarationNodeView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNodeView__GetDeclarationType() {
        return getSubSuperStateDeclarationNodeView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNodeView__SetDeclarationType__String() {
        return getSubSuperStateDeclarationNodeView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNodeView__GetName() {
        return getSubSuperStateDeclarationNodeView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNodeView__SetName__String() {
        return getSubSuperStateDeclarationNodeView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleStateView() {
		if (simpleStateViewEClass == null) {
			simpleStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return simpleStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleStateView_InternalSimpleState() {
        return (EReference)getSimpleStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleStateView__GetLabel() {
        return getSimpleStateView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleStateView__SetLabel__String() {
        return getSimpleStateView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialStateView() {
		if (initialStateViewEClass == null) {
			initialStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return initialStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitialStateView_InternalInitialState() {
        return (EReference)getInitialStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalStateView() {
		if (finalStateViewEClass == null) {
			finalStateViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return finalStateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFinalStateView_InternalFinalState() {
        return (EReference)getFinalStateView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorView() {
		if (connectorViewEClass == null) {
			connectorViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return connectorViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorView_InternalConnector() {
        return (EReference)getConnectorView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitionView() {
		if (transitionViewEClass == null) {
			transitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return transitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionView_InternalTransition() {
        return (EReference)getTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransitionView__IsHistory() {
        return getTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransitionView__SetHistory__boolean() {
        return getTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateTransitionView() {
		if (immediateTransitionViewEClass == null) {
			immediateTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return immediateTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImmediateTransitionView_InternalImmediateTransition() {
        return (EReference)getImmediateTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__GetDsderminat() {
        return getImmediateTransitionView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__SetDsderminat__int() {
        return getImmediateTransitionView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__GetLabel() {
        return getImmediateTransitionView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__SetLabel__String() {
        return getImmediateTransitionView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__IsHistory() {
        return getImmediateTransitionView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__SetHistory__boolean() {
        return getImmediateTransitionView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__GetPriority() {
        return getImmediateTransitionView().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransitionView__SetPriority__int() {
        return getImmediateTransitionView().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateTerminationTransitionView() {
		if (immediateTerminationTransitionViewEClass == null) {
			immediateTerminationTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return immediateTerminationTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImmediateTerminationTransitionView_InternalImmediateTerminationTransition() {
        return (EReference)getImmediateTerminationTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeakAbortTransitionView() {
		if (weakAbortTransitionViewEClass == null) {
			weakAbortTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return weakAbortTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeakAbortTransitionView_InternalWeakAbortTransition() {
        return (EReference)getWeakAbortTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrongAbortTransitionView() {
		if (strongAbortTransitionViewEClass == null) {
			strongAbortTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return strongAbortTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrongAbortTransitionView_InternalStrongAbortTransition() {
        return (EReference)getStrongAbortTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeakAbortTerminationTransitionView() {
		if (weakAbortTerminationTransitionViewEClass == null) {
			weakAbortTerminationTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return weakAbortTerminationTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeakAbortTerminationTransitionView_InternalWeakAbortTerminationTransition() {
        return (EReference)getWeakAbortTerminationTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefferedTransitionView() {
		if (defferedTransitionViewEClass == null) {
			defferedTransitionViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return defferedTransitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefferedTransitionView_InternalDefferedTransition() {
        return (EReference)getDefferedTransitionView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCChartView() {
		if (scChartViewEClass == null) {
			scChartViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return scChartViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCChartView_InternalSCChart() {
        return (EReference)getSCChartView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperStateDeclarationView() {
		if (superStateDeclarationViewEClass == null) {
			superStateDeclarationViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return superStateDeclarationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperStateDeclarationView_InternalSuperStateDeclaration() {
        return (EReference)getSuperStateDeclarationView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationView__GetDeclarationType() {
        return getSuperStateDeclarationView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationView__SetDeclarationType__String() {
        return getSuperStateDeclarationView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationView__GetInputOutput() {
        return getSuperStateDeclarationView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationView__SetInputOutput__String() {
        return getSuperStateDeclarationView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationView__GetName() {
        return getSuperStateDeclarationView().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationView__SetName__String() {
        return getSuperStateDeclarationView().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSuperStateDeclarationView() {
		if (subSuperStateDeclarationViewEClass == null) {
			subSuperStateDeclarationViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return subSuperStateDeclarationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubSuperStateDeclarationView_InternalSubSuperStateDeclaration() {
        return (EReference)getSubSuperStateDeclarationView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationView__GetDeclarationType() {
        return getSubSuperStateDeclarationView().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationView__SetDeclarationType__String() {
        return getSubSuperStateDeclarationView().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationView__GetName() {
        return getSubSuperStateDeclarationView().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationView__SetName__String() {
        return getSubSuperStateDeclarationView().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewsFactory getViewsFactory() {
		return (ViewsFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("info.scce.cinco.product.scchart.mglid.scchart.views." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ViewsPackageImpl

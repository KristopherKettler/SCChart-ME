/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.mglid.scchart.impl.ScchartPackageImpl;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFactory;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class InternalPackageImpl extends EPackageImpl implements InternalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalRootStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSuperStateRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSubSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalInitilalSubSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSubSuperStateRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSuperStateDeclarationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSubSuperStateDeclarationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSimpleStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalInitialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalFinalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalImmediateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalImmediateTerminationTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalWeakAbortTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalStrongAbortTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalWeakAbortTerminationTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalDefferedTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSCChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSuperStateDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSubSuperStateDeclarationEClass = null;

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
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InternalPackageImpl() {
		super(eNS_URI, InternalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InternalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InternalPackage init() {
		if (isInited) return (InternalPackage)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInternalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InternalPackageImpl theInternalPackage = registeredInternalPackage instanceof InternalPackageImpl ? (InternalPackageImpl)registeredInternalPackage : new InternalPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI);
		ScchartPackageImpl theScchartPackage = (ScchartPackageImpl)(registeredPackage instanceof ScchartPackageImpl ? registeredPackage : ScchartPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);

		// Load packages
		theScchartPackage.loadPackage();

		// Fix loaded packages
		theInternalPackage.fixPackageContents();
		theScchartPackage.fixPackageContents();
		theViewsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theInternalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InternalPackage.eNS_URI, theInternalPackage);
		return theInternalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalRootState() {
		if (internalRootStateEClass == null) {
			internalRootStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(0);
		}
		return internalRootStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRootState_Label() {
        return (EAttribute)getInternalRootState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalRootState_Declaration() {
        return (EReference)getInternalRootState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetContainmentConstraints() {
        return getInternalRootState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetOutgoingConstraints() {
        return getInternalRootState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetSubSuperStateSuccessors() {
        return getInternalRootState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetInitilalSubSuperStateSuccessors() {
        return getInternalRootState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetSimpleStateSuccessors() {
        return getInternalRootState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetInitialStateSuccessors() {
        return getInternalRootState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetFinalStateSuccessors() {
        return getInternalRootState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRootState__GetConnectorSuccessors() {
        return getInternalRootState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSuperStateRegion() {
		if (internalSuperStateRegionEClass == null) {
			internalSuperStateRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(1);
		}
		return internalSuperStateRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperStateRegion_Label() {
        return (EAttribute)getInternalSuperStateRegion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperStateRegion_RegionID() {
        return (EAttribute)getInternalSuperStateRegion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSuperStateRegion__GetContainmentConstraints() {
        return getInternalSuperStateRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSubSuperState() {
		if (internalSubSuperStateEClass == null) {
			internalSubSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(2);
		}
		return internalSubSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSubSuperState_Label() {
        return (EAttribute)getInternalSubSuperState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalSubSuperState_Declaration() {
        return (EReference)getInternalSubSuperState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetContainmentConstraints() {
        return getInternalSubSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetIncomingConstraints() {
        return getInternalSubSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetOutgoingConstraints() {
        return getInternalSubSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetRootStatePredecessors() {
        return getInternalSubSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetSubSuperStatePredecessors() {
        return getInternalSubSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetInitilalSubSuperStatePredecessors() {
        return getInternalSubSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetSimpleStatePredecessors() {
        return getInternalSubSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetInitialStatePredecessors() {
        return getInternalSubSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetFinalStatePredecessors() {
        return getInternalSubSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetConnectorPredecessors() {
        return getInternalSubSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetSubSuperStateSuccessors() {
        return getInternalSubSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetInitilalSubSuperStateSuccessors() {
        return getInternalSubSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetSimpleStateSuccessors() {
        return getInternalSubSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetInitialStateSuccessors() {
        return getInternalSubSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetFinalStateSuccessors() {
        return getInternalSubSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperState__GetConnectorSuccessors() {
        return getInternalSubSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitilalSubSuperState() {
		if (internalInitilalSubSuperStateEClass == null) {
			internalInitilalSubSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(3);
		}
		return internalInitilalSubSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetContainmentConstraints() {
        return getInternalInitilalSubSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetIncomingConstraints() {
        return getInternalInitilalSubSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetOutgoingConstraints() {
        return getInternalInitilalSubSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetRootStatePredecessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetSubSuperStatePredecessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetInitilalSubSuperStatePredecessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetSimpleStatePredecessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetInitialStatePredecessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetFinalStatePredecessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetConnectorPredecessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetSubSuperStateSuccessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetInitilalSubSuperStateSuccessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetSimpleStateSuccessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetInitialStateSuccessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetFinalStateSuccessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitilalSubSuperState__GetConnectorSuccessors() {
        return getInternalInitilalSubSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSubSuperStateRegion() {
		if (internalSubSuperStateRegionEClass == null) {
			internalSubSuperStateRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(4);
		}
		return internalSubSuperStateRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSubSuperStateRegion_RegionID() {
        return (EAttribute)getInternalSubSuperStateRegion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSubSuperStateRegion__GetContainmentConstraints() {
        return getInternalSubSuperStateRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSuperStateDeclarationNode() {
		if (internalSuperStateDeclarationNodeEClass == null) {
			internalSuperStateDeclarationNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(5);
		}
		return internalSuperStateDeclarationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperStateDeclarationNode_DeclarationType() {
        return (EAttribute)getInternalSuperStateDeclarationNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperStateDeclarationNode_InputOutput() {
        return (EAttribute)getInternalSuperStateDeclarationNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperStateDeclarationNode_Name() {
        return (EAttribute)getInternalSuperStateDeclarationNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSubSuperStateDeclarationNode() {
		if (internalSubSuperStateDeclarationNodeEClass == null) {
			internalSubSuperStateDeclarationNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(6);
		}
		return internalSubSuperStateDeclarationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSubSuperStateDeclarationNode_DeclarationType() {
        return (EAttribute)getInternalSubSuperStateDeclarationNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSubSuperStateDeclarationNode_Name() {
        return (EAttribute)getInternalSubSuperStateDeclarationNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSimpleState() {
		if (internalSimpleStateEClass == null) {
			internalSimpleStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(7);
		}
		return internalSimpleStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSimpleState_Label() {
        return (EAttribute)getInternalSimpleState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetIncomingConstraints() {
        return getInternalSimpleState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetOutgoingConstraints() {
        return getInternalSimpleState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetRootStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSubSuperStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitilalSubSuperStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSimpleStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalStatePredecessors() {
        return getInternalSimpleState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetConnectorPredecessors() {
        return getInternalSimpleState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSubSuperStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitilalSubSuperStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetSimpleStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetInitialStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetFinalStateSuccessors() {
        return getInternalSimpleState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSimpleState__GetConnectorSuccessors() {
        return getInternalSimpleState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalInitialState() {
		if (internalInitialStateEClass == null) {
			internalInitialStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(8);
		}
		return internalInitialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetIncomingConstraints() {
        return getInternalInitialState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetOutgoingConstraints() {
        return getInternalInitialState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetRootStatePredecessors() {
        return getInternalInitialState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSubSuperStatePredecessors() {
        return getInternalInitialState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitilalSubSuperStatePredecessors() {
        return getInternalInitialState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSimpleStatePredecessors() {
        return getInternalInitialState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialStatePredecessors() {
        return getInternalInitialState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalStatePredecessors() {
        return getInternalInitialState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetConnectorPredecessors() {
        return getInternalInitialState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSubSuperStateSuccessors() {
        return getInternalInitialState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitilalSubSuperStateSuccessors() {
        return getInternalInitialState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetSimpleStateSuccessors() {
        return getInternalInitialState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetInitialStateSuccessors() {
        return getInternalInitialState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetFinalStateSuccessors() {
        return getInternalInitialState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalInitialState__GetConnectorSuccessors() {
        return getInternalInitialState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFinalState() {
		if (internalFinalStateEClass == null) {
			internalFinalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(9);
		}
		return internalFinalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetIncomingConstraints() {
        return getInternalFinalState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetOutgoingConstraints() {
        return getInternalFinalState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetRootStatePredecessors() {
        return getInternalFinalState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSubSuperStatePredecessors() {
        return getInternalFinalState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitilalSubSuperStatePredecessors() {
        return getInternalFinalState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSimpleStatePredecessors() {
        return getInternalFinalState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialStatePredecessors() {
        return getInternalFinalState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalStatePredecessors() {
        return getInternalFinalState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetConnectorPredecessors() {
        return getInternalFinalState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSubSuperStateSuccessors() {
        return getInternalFinalState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitilalSubSuperStateSuccessors() {
        return getInternalFinalState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetSimpleStateSuccessors() {
        return getInternalFinalState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetInitialStateSuccessors() {
        return getInternalFinalState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetFinalStateSuccessors() {
        return getInternalFinalState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalFinalState__GetConnectorSuccessors() {
        return getInternalFinalState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalConnector() {
		if (internalConnectorEClass == null) {
			internalConnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(10);
		}
		return internalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetIncomingConstraints() {
        return getInternalConnector().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetOutgoingConstraints() {
        return getInternalConnector().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetRootStatePredecessors() {
        return getInternalConnector().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSubSuperStatePredecessors() {
        return getInternalConnector().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitilalSubSuperStatePredecessors() {
        return getInternalConnector().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSimpleStatePredecessors() {
        return getInternalConnector().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialStatePredecessors() {
        return getInternalConnector().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalStatePredecessors() {
        return getInternalConnector().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetConnectorPredecessors() {
        return getInternalConnector().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSubSuperStateSuccessors() {
        return getInternalConnector().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitilalSubSuperStateSuccessors() {
        return getInternalConnector().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetSimpleStateSuccessors() {
        return getInternalConnector().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetInitialStateSuccessors() {
        return getInternalConnector().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetFinalStateSuccessors() {
        return getInternalConnector().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalConnector__GetConnectorSuccessors() {
        return getInternalConnector().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTransition() {
		if (internalTransitionEClass == null) {
			internalTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(11);
		}
		return internalTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTransition_History() {
        return (EAttribute)getInternalTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalImmediateTransition() {
		if (internalImmediateTransitionEClass == null) {
			internalImmediateTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(12);
		}
		return internalImmediateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateTransition_Dsderminat() {
        return (EAttribute)getInternalImmediateTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateTransition_Label() {
        return (EAttribute)getInternalImmediateTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateTransition_History() {
        return (EAttribute)getInternalImmediateTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalImmediateTransition_Priority() {
        return (EAttribute)getInternalImmediateTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalImmediateTerminationTransition() {
		if (internalImmediateTerminationTransitionEClass == null) {
			internalImmediateTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(13);
		}
		return internalImmediateTerminationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalWeakAbortTransition() {
		if (internalWeakAbortTransitionEClass == null) {
			internalWeakAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(14);
		}
		return internalWeakAbortTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalStrongAbortTransition() {
		if (internalStrongAbortTransitionEClass == null) {
			internalStrongAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(15);
		}
		return internalStrongAbortTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalWeakAbortTerminationTransition() {
		if (internalWeakAbortTerminationTransitionEClass == null) {
			internalWeakAbortTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(16);
		}
		return internalWeakAbortTerminationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalDefferedTransition() {
		if (internalDefferedTransitionEClass == null) {
			internalDefferedTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(17);
		}
		return internalDefferedTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSCChart() {
		if (internalSCChartEClass == null) {
			internalSCChartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(18);
		}
		return internalSCChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalSCChart__GetContainmentConstraints() {
        return getInternalSCChart().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSuperStateDeclaration() {
		if (internalSuperStateDeclarationEClass == null) {
			internalSuperStateDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(19);
		}
		return internalSuperStateDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperStateDeclaration_DeclarationType() {
        return (EAttribute)getInternalSuperStateDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperStateDeclaration_InputOutput() {
        return (EAttribute)getInternalSuperStateDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSuperStateDeclaration_Name() {
        return (EAttribute)getInternalSuperStateDeclaration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalSubSuperStateDeclaration() {
		if (internalSubSuperStateDeclarationEClass == null) {
			internalSubSuperStateDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(20);
		}
		return internalSubSuperStateDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSubSuperStateDeclaration_DeclarationType() {
        return (EAttribute)getInternalSubSuperStateDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalSubSuperStateDeclaration_Name() {
        return (EAttribute)getInternalSubSuperStateDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFactory getInternalFactory() {
		return (InternalFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("info.scce.cinco.product.scchart.mglid.scchart.internal." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InternalPackageImpl

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.scchart.mglid.scchart.ScchartFactory;
import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage;

import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;

import info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl;

import info.scce.cinco.product.scchart.mglid.scchart.views.ViewsPackage;

import info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScchartPackageImpl extends EPackageImpl implements ScchartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "scchart.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initilalSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootStateDeclarationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superStateDeclarationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateTerminationTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weakAbortTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongAbortTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weakAbortTerminationTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defferedTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootStateDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superStateDeclarationEClass = null;

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
	 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScchartPackageImpl() {
		super(eNS_URI, ScchartFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScchartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ScchartPackage init() {
		if (isInited) return (ScchartPackage)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredScchartPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ScchartPackageImpl theScchartPackage = registeredScchartPackage instanceof ScchartPackageImpl ? (ScchartPackageImpl)registeredScchartPackage : new ScchartPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);
		InternalPackageImpl theInternalPackage = (InternalPackageImpl)(registeredPackage instanceof InternalPackageImpl ? registeredPackage : InternalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);

		// Load packages
		theScchartPackage.loadPackage();

		// Fix loaded packages
		theScchartPackage.fixPackageContents();
		theInternalPackage.fixPackageContents();
		theViewsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theScchartPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScchartPackage.eNS_URI, theScchartPackage);
		return theScchartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootState() {
		if (rootStateEClass == null) {
			rootStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(0);
		}
		return rootStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetLabel() {
        return getRootState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__SetLabel__String() {
        return getRootState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetDeclaration() {
        return getRootState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__SetDeclaration__EList() {
        return getRootState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__AddDeclaration__RootStateDeclaration() {
        return getRootState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__RemoveDeclaration__RootStateDeclaration() {
        return getRootState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetInternalRootState() {
        return getRootState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__IsExactlyRootState() {
        return getRootState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PreDelete() {
        return getRootState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetPostDeleteFunction() {
        return getRootState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetPostDeleteEvent() {
        return getRootState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PreSave() {
        return getRootState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PostSave() {
        return getRootState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetRootElement() {
        return getRootState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetNodes() {
        return getRootState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetRootStateDeclarationNodes() {
        return getRootState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewRootStateDeclarationNode() {
        return getRootState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRootStateDeclarationNode__int_int() {
        return getRootState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRootStateDeclarationNode__String_int_int() {
        return getRootState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRootStateDeclarationNode__int_int_int_int() {
        return getRootState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRootStateDeclarationNode__String_int_int_int_int() {
        return getRootState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetRegions() {
        return getRootState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewRegion() {
        return getRootState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRegion__int_int() {
        return getRootState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRegion__String_int_int() {
        return getRootState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRegion__int_int_int_int() {
        return getRootState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewRegion__String_int_int_int_int() {
        return getRootState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoing() {
        return getRootState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetSuccessors() {
        return getRootState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__S_moveTo__ModelElementContainer_int_int() {
        return getRootState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PreMove__ModelElementContainer_int_int() {
        return getRootState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getRootState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PreResize__int_int_int_int_Direction() {
        return getRootState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__PostResize__int_int_int_int_Direction() {
        return getRootState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingTransitions() {
        return getRootState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingWeakAbortTerminationTransitions() {
        return getRootState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingStrongAbortTransitions() {
        return getRootState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateTerminationTransitions() {
        return getRootState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingDefferedTransitions() {
        return getRootState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingWeakAbortTransitions() {
        return getRootState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateTransitions() {
        return getRootState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetSuperStateSuccessors() {
        return getRootState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetInitilalSuperStateSuccessors() {
        return getRootState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetSimpleStateSuccessors() {
        return getRootState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetInitialStateSuccessors() {
        return getRootState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetFinalStateSuccessors() {
        return getRootState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetConnectorSuccessors() {
        return getRootState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__SuperState() {
        return getRootState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SuperState() {
        return getRootState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SuperState_String() {
        return getRootState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__SimpleState() {
        return getRootState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SimpleState() {
        return getRootState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SimpleState_String() {
        return getRootState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__FinalState() {
        return getRootState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__FinalState() {
        return getRootState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__FinalState_String() {
        return getRootState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__Connector() {
        return getRootState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__Connector() {
        return getRootState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__Connector_String() {
        return getRootState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__InitialState() {
        return getRootState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitialState() {
        return getRootState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitialState_String() {
        return getRootState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__SuperState() {
        return getRootState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__SuperState() {
        return getRootState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__SuperState_String() {
        return getRootState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__SimpleState_String() {
        return getRootState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__FinalState_String() {
        return getRootState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__Connector() {
        return getRootState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__Connector() {
        return getRootState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__Connector_String() {
        return getRootState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__InitialState_String() {
        return getRootState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__SuperState() {
        return getRootState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__SuperState() {
        return getRootState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__SuperState_String() {
        return getRootState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__SimpleState_String() {
        return getRootState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__FinalState() {
        return getRootState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__FinalState() {
        return getRootState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__FinalState_String() {
        return getRootState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__Connector() {
        return getRootState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__Connector() {
        return getRootState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__Connector_String() {
        return getRootState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__InitialState() {
        return getRootState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__InitialState() {
        return getRootState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__InitialState_String() {
        return getRootState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__SuperState() {
        return getRootState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SuperState() {
        return getRootState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SuperState_String() {
        return getRootState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SimpleState_String() {
        return getRootState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__FinalState() {
        return getRootState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__FinalState() {
        return getRootState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__FinalState_String() {
        return getRootState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__Connector() {
        return getRootState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__Connector() {
        return getRootState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__Connector_String() {
        return getRootState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__InitialState() {
        return getRootState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitialState() {
        return getRootState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitialState_String() {
        return getRootState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__SuperState() {
        return getRootState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__SuperState() {
        return getRootState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__SuperState_String() {
        return getRootState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getRootState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getRootState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__Connector() {
        return getRootState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__Connector() {
        return getRootState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__Connector_String() {
        return getRootState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getRootState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__SuperState() {
        return getRootState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SuperState() {
        return getRootState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SuperState_String() {
        return getRootState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__SimpleState() {
        return getRootState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SimpleState() {
        return getRootState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SimpleState_String() {
        return getRootState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__FinalState() {
        return getRootState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__FinalState() {
        return getRootState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__FinalState_String() {
        return getRootState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__Connector() {
        return getRootState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__Connector() {
        return getRootState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__Connector_String() {
        return getRootState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__InitialState() {
        return getRootState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitialState() {
        return getRootState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitialState_String() {
        return getRootState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__SuperState() {
        return getRootState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__SuperState() {
        return getRootState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__SuperState_String() {
        return getRootState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__SimpleState() {
        return getRootState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__SimpleState() {
        return getRootState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__SimpleState_String() {
        return getRootState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__FinalState() {
        return getRootState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__FinalState() {
        return getRootState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__FinalState_String() {
        return getRootState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__Connector() {
        return getRootState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__Connector() {
        return getRootState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__Connector_String() {
        return getRootState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__InitilalSuperState() {
        return getRootState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__InitilalSuperState_String() {
        return getRootState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__InitialState() {
        return getRootState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__InitialState() {
        return getRootState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__InitialState_String() {
        return getRootState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanMoveTo__SCChart_int_int() {
        return getRootState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__MoveTo__SCChart_int_int() {
        return getRootState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__S_moveTo__SCChart_int_int() {
        return getRootState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetContainer() {
        return getRootState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetRootStateView() {
        return getRootState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegion() {
		if (regionEClass == null) {
			regionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(1);
		}
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetLabel() {
        return getRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__SetLabel__String() {
        return getRegion().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetRegionID() {
        return getRegion().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__SetRegionID__String() {
        return getRegion().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetInternalRegion() {
        return getRegion().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__IsExactlyRegion() {
        return getRegion().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PreDelete() {
        return getRegion().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetPostDeleteFunction() {
        return getRegion().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetPostDeleteEvent() {
        return getRegion().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PreSave() {
        return getRegion().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PostSave() {
        return getRegion().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetRootElement() {
        return getRegion().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetNodes() {
        return getRegion().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetSuperStates() {
        return getRegion().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewSuperState() {
        return getRegion().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSuperState__int_int() {
        return getRegion().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSuperState__String_int_int() {
        return getRegion().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSuperState__int_int_int_int() {
        return getRegion().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSuperState__String_int_int_int_int() {
        return getRegion().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetSimpleStates() {
        return getRegion().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewSimpleState() {
        return getRegion().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSimpleState__int_int() {
        return getRegion().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSimpleState__String_int_int() {
        return getRegion().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSimpleState__int_int_int_int() {
        return getRegion().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewSimpleState__String_int_int_int_int() {
        return getRegion().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetFinalStates() {
        return getRegion().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewFinalState() {
        return getRegion().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalState__int_int() {
        return getRegion().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalState__String_int_int() {
        return getRegion().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalState__int_int_int_int() {
        return getRegion().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewFinalState__String_int_int_int_int() {
        return getRegion().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetConnectors() {
        return getRegion().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewConnector() {
        return getRegion().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewConnector__int_int() {
        return getRegion().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewConnector__String_int_int() {
        return getRegion().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewConnector__int_int_int_int() {
        return getRegion().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewConnector__String_int_int_int_int() {
        return getRegion().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetInitilalSuperStates() {
        return getRegion().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewInitilalSuperState() {
        return getRegion().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitilalSuperState__int_int() {
        return getRegion().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitilalSuperState__String_int_int() {
        return getRegion().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitilalSuperState__int_int_int_int() {
        return getRegion().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitilalSuperState__String_int_int_int_int() {
        return getRegion().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetInitialStates() {
        return getRegion().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanNewInitialState() {
        return getRegion().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialState__int_int() {
        return getRegion().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialState__String_int_int() {
        return getRegion().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialState__int_int_int_int() {
        return getRegion().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__NewInitialState__String_int_int_int_int() {
        return getRegion().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__ModelElementContainer_int_int() {
        return getRegion().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PreMove__ModelElementContainer_int_int() {
        return getRegion().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getRegion().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PreResize__int_int_int_int_Direction() {
        return getRegion().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__PostResize__int_int_int_int_Direction() {
        return getRegion().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__RootState_int_int() {
        return getRegion().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__RootState_int_int() {
        return getRegion().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__RootState_int_int() {
        return getRegion().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__SuperState_int_int() {
        return getRegion().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__SuperState_int_int() {
        return getRegion().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__SuperState_int_int() {
        return getRegion().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__CanMoveTo__InitilalSuperState_int_int() {
        return getRegion().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__MoveTo__InitilalSuperState_int_int() {
        return getRegion().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__S_moveTo__InitilalSuperState_int_int() {
        return getRegion().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegion__GetRegionView() {
        return getRegion().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperState() {
		if (superStateEClass == null) {
			superStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(2);
		}
		return superStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetLabel() {
        return getSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__SetLabel__String() {
        return getSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetDeclaration() {
        return getSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__SetDeclaration__EList() {
        return getSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__AddDeclaration__SuperStateDeclaration() {
        return getSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__RemoveDeclaration__SuperStateDeclaration() {
        return getSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInternalSuperState() {
        return getSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__IsExactlySuperState() {
        return getSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PreDelete() {
        return getSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetPostDeleteFunction() {
        return getSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetPostDeleteEvent() {
        return getSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PreSave() {
        return getSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PostSave() {
        return getSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetRootElement() {
        return getSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetNodes() {
        return getSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetRegions() {
        return getSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewRegion() {
        return getSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewRegion__int_int() {
        return getSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewRegion__String_int_int() {
        return getSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewRegion__int_int_int_int() {
        return getSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewRegion__String_int_int_int_int() {
        return getSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuperStateDeclarationNodes() {
        return getSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewSuperStateDeclarationNode() {
        return getSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewSuperStateDeclarationNode__int_int() {
        return getSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewSuperStateDeclarationNode__String_int_int() {
        return getSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewSuperStateDeclarationNode__int_int_int_int() {
        return getSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewSuperStateDeclarationNode__String_int_int_int_int() {
        return getSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoing() {
        return getSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuccessors() {
        return getSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncoming() {
        return getSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetPredecessors() {
        return getSuperState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__S_moveTo__ModelElementContainer_int_int() {
        return getSuperState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PreMove__ModelElementContainer_int_int() {
        return getSuperState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSuperState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PreResize__int_int_int_int_Direction() {
        return getSuperState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__PostResize__int_int_int_int_Direction() {
        return getSuperState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingTransitions() {
        return getSuperState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingWeakAbortTerminationTransitions() {
        return getSuperState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingStrongAbortTransitions() {
        return getSuperState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingImmediateTerminationTransitions() {
        return getSuperState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingDefferedTransitions() {
        return getSuperState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingWeakAbortTransitions() {
        return getSuperState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetOutgoingImmediateTransitions() {
        return getSuperState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingTransitions() {
        return getSuperState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingWeakAbortTerminationTransitions() {
        return getSuperState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingStrongAbortTransitions() {
        return getSuperState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingImmediateTerminationTransitions() {
        return getSuperState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingDefferedTransitions() {
        return getSuperState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingWeakAbortTransitions() {
        return getSuperState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetIncomingImmediateTransitions() {
        return getSuperState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetRootStatePredecessors() {
        return getSuperState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuperStatePredecessors() {
        return getSuperState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInitilalSuperStatePredecessors() {
        return getSuperState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSimpleStatePredecessors() {
        return getSuperState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInitialStatePredecessors() {
        return getSuperState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetFinalStatePredecessors() {
        return getSuperState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetConnectorPredecessors() {
        return getSuperState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuperStateSuccessors() {
        return getSuperState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInitilalSuperStateSuccessors() {
        return getSuperState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSimpleStateSuccessors() {
        return getSuperState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetInitialStateSuccessors() {
        return getSuperState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetFinalStateSuccessors() {
        return getSuperState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetConnectorSuccessors() {
        return getSuperState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__SuperState() {
        return getSuperState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__SuperState() {
        return getSuperState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__SuperState_String() {
        return getSuperState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__SimpleState() {
        return getSuperState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__SimpleState() {
        return getSuperState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__FinalState() {
        return getSuperState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__FinalState() {
        return getSuperState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__FinalState_String() {
        return getSuperState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__Connector() {
        return getSuperState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__Connector() {
        return getSuperState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__Connector_String() {
        return getSuperState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTransition__InitialState() {
        return getSuperState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__InitialState() {
        return getSuperState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTransition__InitialState_String() {
        return getSuperState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTerminationTransition__SuperState() {
        return getSuperState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__SuperState() {
        return getSuperState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__SuperState_String() {
        return getSuperState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTerminationTransition__SimpleState() {
        return getSuperState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__SimpleState() {
        return getSuperState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTerminationTransition__FinalState() {
        return getSuperState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__FinalState() {
        return getSuperState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__FinalState_String() {
        return getSuperState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTerminationTransition__Connector() {
        return getSuperState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__Connector() {
        return getSuperState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__Connector_String() {
        return getSuperState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTerminationTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewImmediateTerminationTransition__InitialState() {
        return getSuperState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__InitialState() {
        return getSuperState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewImmediateTerminationTransition__InitialState_String() {
        return getSuperState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTransition__SuperState() {
        return getSuperState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__SuperState() {
        return getSuperState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__SuperState_String() {
        return getSuperState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTransition__SimpleState() {
        return getSuperState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__SimpleState() {
        return getSuperState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTransition__FinalState() {
        return getSuperState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__FinalState() {
        return getSuperState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__FinalState_String() {
        return getSuperState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTransition__Connector() {
        return getSuperState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__Connector() {
        return getSuperState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__Connector_String() {
        return getSuperState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTransition__InitialState() {
        return getSuperState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__InitialState() {
        return getSuperState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTransition__InitialState_String() {
        return getSuperState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__SuperState() {
        return getSuperState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__SuperState() {
        return getSuperState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__SuperState_String() {
        return getSuperState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__SimpleState() {
        return getSuperState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__SimpleState() {
        return getSuperState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__FinalState() {
        return getSuperState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__FinalState() {
        return getSuperState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__FinalState_String() {
        return getSuperState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__Connector() {
        return getSuperState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__Connector() {
        return getSuperState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__Connector_String() {
        return getSuperState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewStrongAbortTransition__InitialState() {
        return getSuperState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__InitialState() {
        return getSuperState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewStrongAbortTransition__InitialState_String() {
        return getSuperState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTerminationTransition__SuperState() {
        return getSuperState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__SuperState() {
        return getSuperState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__SuperState_String() {
        return getSuperState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getSuperState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__SimpleState() {
        return getSuperState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getSuperState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__FinalState() {
        return getSuperState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getSuperState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTerminationTransition__Connector() {
        return getSuperState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__Connector() {
        return getSuperState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__Connector_String() {
        return getSuperState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTerminationTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getSuperState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__InitialState() {
        return getSuperState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getSuperState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__SuperState() {
        return getSuperState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__SuperState() {
        return getSuperState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__SuperState_String() {
        return getSuperState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__SimpleState() {
        return getSuperState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__SimpleState() {
        return getSuperState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__FinalState() {
        return getSuperState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__FinalState() {
        return getSuperState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__FinalState_String() {
        return getSuperState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__Connector() {
        return getSuperState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__Connector() {
        return getSuperState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__Connector_String() {
        return getSuperState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewTransition__InitialState() {
        return getSuperState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__InitialState() {
        return getSuperState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewTransition__InitialState_String() {
        return getSuperState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDefferedTransition__SuperState() {
        return getSuperState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__SuperState() {
        return getSuperState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__SuperState_String() {
        return getSuperState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDefferedTransition__SimpleState() {
        return getSuperState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__SimpleState() {
        return getSuperState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__SimpleState_String() {
        return getSuperState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDefferedTransition__FinalState() {
        return getSuperState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__FinalState() {
        return getSuperState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__FinalState_String() {
        return getSuperState().getEOperations().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDefferedTransition__Connector() {
        return getSuperState().getEOperations().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__Connector() {
        return getSuperState().getEOperations().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__Connector_String() {
        return getSuperState().getEOperations().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDefferedTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__InitilalSuperState() {
        return getSuperState().getEOperations().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__InitilalSuperState_String() {
        return getSuperState().getEOperations().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanNewDefferedTransition__InitialState() {
        return getSuperState().getEOperations().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__InitialState() {
        return getSuperState().getEOperations().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__NewDefferedTransition__InitialState_String() {
        return getSuperState().getEOperations().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__CanMoveTo__Region_int_int() {
        return getSuperState().getEOperations().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__MoveTo__Region_int_int() {
        return getSuperState().getEOperations().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__S_moveTo__Region_int_int() {
        return getSuperState().getEOperations().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetContainer() {
        return getSuperState().getEOperations().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperState__GetSuperStateView() {
        return getSuperState().getEOperations().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitilalSuperState() {
		if (initilalSuperStateEClass == null) {
			initilalSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(3);
		}
		return initilalSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInternalInitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__IsExactlyInitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PreDelete() {
        return getInitilalSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetPostDeleteFunction() {
        return getInitilalSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetPostDeleteEvent() {
        return getInitilalSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PreSave() {
        return getInitilalSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PostSave() {
        return getInitilalSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetRootElement() {
        return getInitilalSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetNodes() {
        return getInitilalSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetRegions() {
        return getInitilalSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewRegion() {
        return getInitilalSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewRegion__int_int() {
        return getInitilalSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewRegion__String_int_int() {
        return getInitilalSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewRegion__int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewRegion__String_int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSuperStateDeclarationNodes() {
        return getInitilalSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewSuperStateDeclarationNode() {
        return getInitilalSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewSuperStateDeclarationNode__int_int() {
        return getInitilalSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewSuperStateDeclarationNode__String_int_int() {
        return getInitilalSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewSuperStateDeclarationNode__int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewSuperStateDeclarationNode__String_int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoing() {
        return getInitilalSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSuccessors() {
        return getInitilalSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncoming() {
        return getInitilalSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetPredecessors() {
        return getInitilalSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__S_moveTo__ModelElementContainer_int_int() {
        return getInitilalSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PreMove__ModelElementContainer_int_int() {
        return getInitilalSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getInitilalSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PreResize__int_int_int_int_Direction() {
        return getInitilalSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__PostResize__int_int_int_int_Direction() {
        return getInitilalSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingTransitions() {
        return getInitilalSuperState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingWeakAbortTerminationTransitions() {
        return getInitilalSuperState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingStrongAbortTransitions() {
        return getInitilalSuperState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingImmediateTerminationTransitions() {
        return getInitilalSuperState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingDefferedTransitions() {
        return getInitilalSuperState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingWeakAbortTransitions() {
        return getInitilalSuperState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetOutgoingImmediateTransitions() {
        return getInitilalSuperState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingTransitions() {
        return getInitilalSuperState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingWeakAbortTerminationTransitions() {
        return getInitilalSuperState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingStrongAbortTransitions() {
        return getInitilalSuperState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingImmediateTerminationTransitions() {
        return getInitilalSuperState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingDefferedTransitions() {
        return getInitilalSuperState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingWeakAbortTransitions() {
        return getInitilalSuperState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetIncomingImmediateTransitions() {
        return getInitilalSuperState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetRootStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSuperStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitilalSuperStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSimpleStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitialStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetFinalStatePredecessors() {
        return getInitilalSuperState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetConnectorPredecessors() {
        return getInitilalSuperState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSuperStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitilalSuperStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetSimpleStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitialStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetFinalStateSuccessors() {
        return getInitilalSuperState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetConnectorSuccessors() {
        return getInitilalSuperState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTerminationTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTerminationTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTerminationTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTerminationTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTerminationTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewImmediateTerminationTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewImmediateTerminationTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewStrongAbortTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewStrongAbortTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTerminationTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTerminationTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTerminationTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDefferedTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__SuperState() {
        return getInitilalSuperState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__SuperState_String() {
        return getInitilalSuperState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDefferedTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__SimpleState() {
        return getInitilalSuperState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__SimpleState_String() {
        return getInitilalSuperState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDefferedTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__FinalState() {
        return getInitilalSuperState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__FinalState_String() {
        return getInitilalSuperState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDefferedTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__Connector() {
        return getInitilalSuperState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__Connector_String() {
        return getInitilalSuperState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDefferedTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__InitilalSuperState() {
        return getInitilalSuperState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__InitilalSuperState_String() {
        return getInitilalSuperState().getEOperations().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanNewDefferedTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__InitialState() {
        return getInitilalSuperState().getEOperations().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__NewDefferedTransition__InitialState_String() {
        return getInitilalSuperState().getEOperations().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__CanMoveTo__Region_int_int() {
        return getInitilalSuperState().getEOperations().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__MoveTo__Region_int_int() {
        return getInitilalSuperState().getEOperations().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__S_moveTo__Region_int_int() {
        return getInitilalSuperState().getEOperations().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetContainer() {
        return getInitilalSuperState().getEOperations().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSuperState__GetInitilalSuperStateView() {
        return getInitilalSuperState().getEOperations().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootStateDeclarationNode() {
		if (rootStateDeclarationNodeEClass == null) {
			rootStateDeclarationNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(4);
		}
		return rootStateDeclarationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__GetDeclarationType() {
        return getRootStateDeclarationNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__SetDeclarationType__String() {
        return getRootStateDeclarationNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__GetInputOutput() {
        return getRootStateDeclarationNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__SetInputOutput__String() {
        return getRootStateDeclarationNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__GetName() {
        return getRootStateDeclarationNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__SetName__String() {
        return getRootStateDeclarationNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__GetInternalRootStateDeclarationNode() {
        return getRootStateDeclarationNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__IsExactlyRootStateDeclarationNode() {
        return getRootStateDeclarationNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__PreDelete() {
        return getRootStateDeclarationNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__GetPostDeleteFunction() {
        return getRootStateDeclarationNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__GetPostDeleteEvent() {
        return getRootStateDeclarationNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__PreSave() {
        return getRootStateDeclarationNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__PostSave() {
        return getRootStateDeclarationNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__GetRootElement() {
        return getRootStateDeclarationNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__S_moveTo__ModelElementContainer_int_int() {
        return getRootStateDeclarationNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__PreMove__ModelElementContainer_int_int() {
        return getRootStateDeclarationNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getRootStateDeclarationNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__PreResize__int_int_int_int_Direction() {
        return getRootStateDeclarationNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__PostResize__int_int_int_int_Direction() {
        return getRootStateDeclarationNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__CanMoveTo__RootState_int_int() {
        return getRootStateDeclarationNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__MoveTo__RootState_int_int() {
        return getRootStateDeclarationNode().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__S_moveTo__RootState_int_int() {
        return getRootStateDeclarationNode().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__GetContainer() {
        return getRootStateDeclarationNode().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclarationNode__GetRootStateDeclarationNodeView() {
        return getRootStateDeclarationNode().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperStateDeclarationNode() {
		if (superStateDeclarationNodeEClass == null) {
			superStateDeclarationNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(5);
		}
		return superStateDeclarationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetDeclarationType() {
        return getSuperStateDeclarationNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__SetDeclarationType__String() {
        return getSuperStateDeclarationNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetName() {
        return getSuperStateDeclarationNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__SetName__String() {
        return getSuperStateDeclarationNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetInternalSuperStateDeclarationNode() {
        return getSuperStateDeclarationNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__IsExactlySuperStateDeclarationNode() {
        return getSuperStateDeclarationNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PreDelete() {
        return getSuperStateDeclarationNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetPostDeleteFunction() {
        return getSuperStateDeclarationNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetPostDeleteEvent() {
        return getSuperStateDeclarationNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PreSave() {
        return getSuperStateDeclarationNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PostSave() {
        return getSuperStateDeclarationNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetRootElement() {
        return getSuperStateDeclarationNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__S_moveTo__ModelElementContainer_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PreMove__ModelElementContainer_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PreResize__int_int_int_int_Direction() {
        return getSuperStateDeclarationNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PostResize__int_int_int_int_Direction() {
        return getSuperStateDeclarationNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__CanMoveTo__SuperState_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__MoveTo__SuperState_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__S_moveTo__SuperState_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__CanMoveTo__InitilalSuperState_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__MoveTo__InitilalSuperState_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__S_moveTo__InitilalSuperState_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetContainer() {
        return getSuperStateDeclarationNode().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetSuperStateDeclarationNodeView() {
        return getSuperStateDeclarationNode().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleState() {
		if (simpleStateEClass == null) {
			simpleStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(6);
		}
		return simpleStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetLabel() {
        return getSimpleState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__SetLabel__String() {
        return getSimpleState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInternalSimpleState() {
        return getSimpleState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__IsExactlySimpleState() {
        return getSimpleState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PreDelete() {
        return getSimpleState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetPostDeleteFunction() {
        return getSimpleState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetPostDeleteEvent() {
        return getSimpleState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PreSave() {
        return getSimpleState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PostSave() {
        return getSimpleState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetRootElement() {
        return getSimpleState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoing() {
        return getSimpleState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSuccessors() {
        return getSimpleState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncoming() {
        return getSimpleState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetPredecessors() {
        return getSimpleState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__ModelElementContainer_int_int() {
        return getSimpleState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PreMove__ModelElementContainer_int_int() {
        return getSimpleState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSimpleState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PreResize__int_int_int_int_Direction() {
        return getSimpleState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__PostResize__int_int_int_int_Direction() {
        return getSimpleState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingTransitions() {
        return getSimpleState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingWeakAbortTerminationTransitions() {
        return getSimpleState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingStrongAbortTransitions() {
        return getSimpleState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingImmediateTerminationTransitions() {
        return getSimpleState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingDefferedTransitions() {
        return getSimpleState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingWeakAbortTransitions() {
        return getSimpleState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingImmediateTransitions() {
        return getSimpleState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingTransitions() {
        return getSimpleState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingWeakAbortTerminationTransitions() {
        return getSimpleState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingStrongAbortTransitions() {
        return getSimpleState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingImmediateTerminationTransitions() {
        return getSimpleState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingDefferedTransitions() {
        return getSimpleState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingWeakAbortTransitions() {
        return getSimpleState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingImmediateTransitions() {
        return getSimpleState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetRootStatePredecessors() {
        return getSimpleState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSuperStatePredecessors() {
        return getSimpleState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitilalSuperStatePredecessors() {
        return getSimpleState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSimpleStatePredecessors() {
        return getSimpleState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitialStatePredecessors() {
        return getSimpleState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetFinalStatePredecessors() {
        return getSimpleState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetConnectorPredecessors() {
        return getSimpleState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSuperStateSuccessors() {
        return getSimpleState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitilalSuperStateSuccessors() {
        return getSimpleState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSimpleStateSuccessors() {
        return getSimpleState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitialStateSuccessors() {
        return getSimpleState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetFinalStateSuccessors() {
        return getSimpleState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetConnectorSuccessors() {
        return getSimpleState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__SuperState() {
        return getSimpleState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SuperState() {
        return getSimpleState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SuperState_String() {
        return getSimpleState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__SimpleState() {
        return getSimpleState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SimpleState() {
        return getSimpleState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__FinalState() {
        return getSimpleState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__FinalState() {
        return getSimpleState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__Connector() {
        return getSimpleState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__Connector() {
        return getSimpleState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__Connector_String() {
        return getSimpleState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitilalSuperState_String() {
        return getSimpleState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__InitialState() {
        return getSimpleState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitialState() {
        return getSimpleState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__SuperState() {
        return getSimpleState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__SuperState() {
        return getSimpleState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__SuperState_String() {
        return getSimpleState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__SimpleState() {
        return getSimpleState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__SimpleState() {
        return getSimpleState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__FinalState() {
        return getSimpleState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__FinalState() {
        return getSimpleState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__Connector() {
        return getSimpleState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__Connector() {
        return getSimpleState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__Connector_String() {
        return getSimpleState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__InitilalSuperState_String() {
        return getSimpleState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__InitialState() {
        return getSimpleState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__InitialState() {
        return getSimpleState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__SuperState() {
        return getSimpleState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__SuperState() {
        return getSimpleState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__SuperState_String() {
        return getSimpleState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__SimpleState() {
        return getSimpleState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__SimpleState() {
        return getSimpleState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__FinalState() {
        return getSimpleState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__FinalState() {
        return getSimpleState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__Connector() {
        return getSimpleState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__Connector() {
        return getSimpleState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__Connector_String() {
        return getSimpleState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__InitilalSuperState_String() {
        return getSimpleState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__InitialState() {
        return getSimpleState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__InitialState() {
        return getSimpleState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__SuperState() {
        return getSimpleState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__SuperState() {
        return getSimpleState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__SuperState_String() {
        return getSimpleState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__SimpleState() {
        return getSimpleState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__SimpleState() {
        return getSimpleState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__FinalState() {
        return getSimpleState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__FinalState() {
        return getSimpleState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__Connector() {
        return getSimpleState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__Connector() {
        return getSimpleState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__Connector_String() {
        return getSimpleState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getSimpleState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__InitialState() {
        return getSimpleState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__InitialState() {
        return getSimpleState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__SuperState() {
        return getSimpleState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__SuperState() {
        return getSimpleState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__SuperState_String() {
        return getSimpleState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getSimpleState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__SimpleState() {
        return getSimpleState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getSimpleState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__FinalState() {
        return getSimpleState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__Connector() {
        return getSimpleState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__Connector() {
        return getSimpleState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__Connector_String() {
        return getSimpleState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__InitilalSuperState_String() {
        return getSimpleState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getSimpleState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__InitialState() {
        return getSimpleState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__SuperState() {
        return getSimpleState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SuperState() {
        return getSimpleState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SuperState_String() {
        return getSimpleState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__SimpleState() {
        return getSimpleState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SimpleState() {
        return getSimpleState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__FinalState() {
        return getSimpleState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__FinalState() {
        return getSimpleState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__Connector() {
        return getSimpleState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__Connector() {
        return getSimpleState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__Connector_String() {
        return getSimpleState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitilalSuperState_String() {
        return getSimpleState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__InitialState() {
        return getSimpleState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitialState() {
        return getSimpleState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__SuperState() {
        return getSimpleState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__SuperState() {
        return getSimpleState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__SuperState_String() {
        return getSimpleState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__SimpleState() {
        return getSimpleState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__SimpleState() {
        return getSimpleState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__FinalState() {
        return getSimpleState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__FinalState() {
        return getSimpleState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__Connector() {
        return getSimpleState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__Connector() {
        return getSimpleState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__Connector_String() {
        return getSimpleState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__InitilalSuperState() {
        return getSimpleState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__InitilalSuperState_String() {
        return getSimpleState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__InitialState() {
        return getSimpleState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__InitialState() {
        return getSimpleState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanMoveTo__Region_int_int() {
        return getSimpleState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__MoveTo__Region_int_int() {
        return getSimpleState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__Region_int_int() {
        return getSimpleState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetContainer() {
        return getSimpleState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSimpleStateView() {
        return getSimpleState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialState() {
		if (initialStateEClass == null) {
			initialStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(7);
		}
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInternalInitialState() {
        return getInitialState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__IsExactlyInitialState() {
        return getInitialState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PreDelete() {
        return getInitialState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetPostDeleteFunction() {
        return getInitialState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetPostDeleteEvent() {
        return getInitialState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PreSave() {
        return getInitialState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PostSave() {
        return getInitialState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetRootElement() {
        return getInitialState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoing() {
        return getInitialState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSuccessors() {
        return getInitialState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncoming() {
        return getInitialState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetPredecessors() {
        return getInitialState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__ModelElementContainer_int_int() {
        return getInitialState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PreMove__ModelElementContainer_int_int() {
        return getInitialState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getInitialState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PreResize__int_int_int_int_Direction() {
        return getInitialState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__PostResize__int_int_int_int_Direction() {
        return getInitialState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingTransitions() {
        return getInitialState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingWeakAbortTerminationTransitions() {
        return getInitialState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingStrongAbortTransitions() {
        return getInitialState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingImmediateTerminationTransitions() {
        return getInitialState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingDefferedTransitions() {
        return getInitialState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingWeakAbortTransitions() {
        return getInitialState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingImmediateTransitions() {
        return getInitialState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingTransitions() {
        return getInitialState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingWeakAbortTerminationTransitions() {
        return getInitialState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingStrongAbortTransitions() {
        return getInitialState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingImmediateTerminationTransitions() {
        return getInitialState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingDefferedTransitions() {
        return getInitialState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingWeakAbortTransitions() {
        return getInitialState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingImmediateTransitions() {
        return getInitialState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetRootStatePredecessors() {
        return getInitialState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSuperStatePredecessors() {
        return getInitialState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitilalSuperStatePredecessors() {
        return getInitialState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSimpleStatePredecessors() {
        return getInitialState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitialStatePredecessors() {
        return getInitialState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetFinalStatePredecessors() {
        return getInitialState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetConnectorPredecessors() {
        return getInitialState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSuperStateSuccessors() {
        return getInitialState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitilalSuperStateSuccessors() {
        return getInitialState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetSimpleStateSuccessors() {
        return getInitialState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitialStateSuccessors() {
        return getInitialState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetFinalStateSuccessors() {
        return getInitialState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetConnectorSuccessors() {
        return getInitialState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__SuperState() {
        return getInitialState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SuperState() {
        return getInitialState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SuperState_String() {
        return getInitialState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__SimpleState() {
        return getInitialState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SimpleState() {
        return getInitialState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__FinalState() {
        return getInitialState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__FinalState() {
        return getInitialState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__FinalState_String() {
        return getInitialState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__Connector() {
        return getInitialState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__Connector() {
        return getInitialState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__Connector_String() {
        return getInitialState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitilalSuperState_String() {
        return getInitialState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__InitialState() {
        return getInitialState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitialState() {
        return getInitialState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitialState_String() {
        return getInitialState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__SuperState() {
        return getInitialState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__SuperState() {
        return getInitialState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__SuperState_String() {
        return getInitialState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__SimpleState() {
        return getInitialState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__SimpleState() {
        return getInitialState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__FinalState() {
        return getInitialState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__FinalState() {
        return getInitialState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__FinalState_String() {
        return getInitialState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__Connector() {
        return getInitialState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__Connector() {
        return getInitialState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__Connector_String() {
        return getInitialState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__InitilalSuperState_String() {
        return getInitialState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__InitialState() {
        return getInitialState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__InitialState() {
        return getInitialState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__InitialState_String() {
        return getInitialState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__SuperState() {
        return getInitialState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__SuperState() {
        return getInitialState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__SuperState_String() {
        return getInitialState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__SimpleState() {
        return getInitialState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__SimpleState() {
        return getInitialState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__FinalState() {
        return getInitialState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__FinalState() {
        return getInitialState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__FinalState_String() {
        return getInitialState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__Connector() {
        return getInitialState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__Connector() {
        return getInitialState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__Connector_String() {
        return getInitialState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__InitilalSuperState_String() {
        return getInitialState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__InitialState() {
        return getInitialState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__InitialState() {
        return getInitialState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__InitialState_String() {
        return getInitialState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__SuperState() {
        return getInitialState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__SuperState() {
        return getInitialState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__SuperState_String() {
        return getInitialState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__SimpleState() {
        return getInitialState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__SimpleState() {
        return getInitialState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__FinalState() {
        return getInitialState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__FinalState() {
        return getInitialState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__FinalState_String() {
        return getInitialState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__Connector() {
        return getInitialState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__Connector() {
        return getInitialState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__Connector_String() {
        return getInitialState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getInitialState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__InitialState() {
        return getInitialState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__InitialState() {
        return getInitialState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__InitialState_String() {
        return getInitialState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__SuperState() {
        return getInitialState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__SuperState() {
        return getInitialState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__SuperState_String() {
        return getInitialState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getInitialState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__SimpleState() {
        return getInitialState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getInitialState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__FinalState() {
        return getInitialState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getInitialState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__Connector() {
        return getInitialState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__Connector() {
        return getInitialState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__Connector_String() {
        return getInitialState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__InitilalSuperState_String() {
        return getInitialState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getInitialState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__InitialState() {
        return getInitialState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getInitialState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__SuperState() {
        return getInitialState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SuperState() {
        return getInitialState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SuperState_String() {
        return getInitialState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__SimpleState() {
        return getInitialState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SimpleState() {
        return getInitialState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__FinalState() {
        return getInitialState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__FinalState() {
        return getInitialState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__FinalState_String() {
        return getInitialState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__Connector() {
        return getInitialState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__Connector() {
        return getInitialState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__Connector_String() {
        return getInitialState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitilalSuperState_String() {
        return getInitialState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__InitialState() {
        return getInitialState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitialState() {
        return getInitialState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitialState_String() {
        return getInitialState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__SuperState() {
        return getInitialState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__SuperState() {
        return getInitialState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__SuperState_String() {
        return getInitialState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__SimpleState() {
        return getInitialState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__SimpleState() {
        return getInitialState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__FinalState() {
        return getInitialState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__FinalState() {
        return getInitialState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__FinalState_String() {
        return getInitialState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__Connector() {
        return getInitialState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__Connector() {
        return getInitialState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__Connector_String() {
        return getInitialState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__InitilalSuperState() {
        return getInitialState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__InitilalSuperState_String() {
        return getInitialState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__InitialState() {
        return getInitialState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__InitialState() {
        return getInitialState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__InitialState_String() {
        return getInitialState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanMoveTo__Region_int_int() {
        return getInitialState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__MoveTo__Region_int_int() {
        return getInitialState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__Region_int_int() {
        return getInitialState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetContainer() {
        return getInitialState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitialStateView() {
        return getInitialState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalState() {
		if (finalStateEClass == null) {
			finalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(8);
		}
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInternalFinalState() {
        return getFinalState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__IsExactlyFinalState() {
        return getFinalState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PreDelete() {
        return getFinalState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetPostDeleteFunction() {
        return getFinalState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetPostDeleteEvent() {
        return getFinalState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PreSave() {
        return getFinalState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PostSave() {
        return getFinalState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetRootElement() {
        return getFinalState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoing() {
        return getFinalState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSuccessors() {
        return getFinalState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncoming() {
        return getFinalState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetPredecessors() {
        return getFinalState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__ModelElementContainer_int_int() {
        return getFinalState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PreMove__ModelElementContainer_int_int() {
        return getFinalState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getFinalState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PreResize__int_int_int_int_Direction() {
        return getFinalState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__PostResize__int_int_int_int_Direction() {
        return getFinalState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingTransitions() {
        return getFinalState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingWeakAbortTerminationTransitions() {
        return getFinalState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingStrongAbortTransitions() {
        return getFinalState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingImmediateTerminationTransitions() {
        return getFinalState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingDefferedTransitions() {
        return getFinalState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingWeakAbortTransitions() {
        return getFinalState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingImmediateTransitions() {
        return getFinalState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingTransitions() {
        return getFinalState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingWeakAbortTerminationTransitions() {
        return getFinalState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingStrongAbortTransitions() {
        return getFinalState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingImmediateTerminationTransitions() {
        return getFinalState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingDefferedTransitions() {
        return getFinalState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingWeakAbortTransitions() {
        return getFinalState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingImmediateTransitions() {
        return getFinalState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetRootStatePredecessors() {
        return getFinalState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSuperStatePredecessors() {
        return getFinalState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitilalSuperStatePredecessors() {
        return getFinalState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSimpleStatePredecessors() {
        return getFinalState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitialStatePredecessors() {
        return getFinalState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetFinalStatePredecessors() {
        return getFinalState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetConnectorPredecessors() {
        return getFinalState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSuperStateSuccessors() {
        return getFinalState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitilalSuperStateSuccessors() {
        return getFinalState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetSimpleStateSuccessors() {
        return getFinalState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitialStateSuccessors() {
        return getFinalState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetFinalStateSuccessors() {
        return getFinalState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetConnectorSuccessors() {
        return getFinalState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__SuperState() {
        return getFinalState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SuperState() {
        return getFinalState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SuperState_String() {
        return getFinalState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__SimpleState() {
        return getFinalState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SimpleState() {
        return getFinalState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__FinalState() {
        return getFinalState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__FinalState() {
        return getFinalState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__FinalState_String() {
        return getFinalState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__Connector() {
        return getFinalState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__Connector() {
        return getFinalState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__Connector_String() {
        return getFinalState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitilalSuperState_String() {
        return getFinalState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__InitialState() {
        return getFinalState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitialState() {
        return getFinalState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitialState_String() {
        return getFinalState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__SuperState() {
        return getFinalState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__SuperState() {
        return getFinalState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__SuperState_String() {
        return getFinalState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__SimpleState() {
        return getFinalState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__SimpleState() {
        return getFinalState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__FinalState() {
        return getFinalState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__FinalState() {
        return getFinalState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__FinalState_String() {
        return getFinalState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__Connector() {
        return getFinalState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__Connector() {
        return getFinalState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__Connector_String() {
        return getFinalState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__InitilalSuperState_String() {
        return getFinalState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__InitialState() {
        return getFinalState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__InitialState() {
        return getFinalState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__InitialState_String() {
        return getFinalState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__SuperState() {
        return getFinalState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__SuperState() {
        return getFinalState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__SuperState_String() {
        return getFinalState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__SimpleState() {
        return getFinalState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__SimpleState() {
        return getFinalState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__FinalState() {
        return getFinalState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__FinalState() {
        return getFinalState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__FinalState_String() {
        return getFinalState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__Connector() {
        return getFinalState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__Connector() {
        return getFinalState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__Connector_String() {
        return getFinalState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__InitilalSuperState_String() {
        return getFinalState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__InitialState() {
        return getFinalState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__InitialState() {
        return getFinalState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__InitialState_String() {
        return getFinalState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__SuperState() {
        return getFinalState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__SuperState() {
        return getFinalState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__SuperState_String() {
        return getFinalState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__SimpleState() {
        return getFinalState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__SimpleState() {
        return getFinalState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__FinalState() {
        return getFinalState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__FinalState() {
        return getFinalState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__FinalState_String() {
        return getFinalState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__Connector() {
        return getFinalState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__Connector() {
        return getFinalState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__Connector_String() {
        return getFinalState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__InitilalSuperState_String() {
        return getFinalState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__InitialState() {
        return getFinalState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__InitialState() {
        return getFinalState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__InitialState_String() {
        return getFinalState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__SuperState() {
        return getFinalState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__SuperState() {
        return getFinalState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__SuperState_String() {
        return getFinalState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getFinalState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__SimpleState() {
        return getFinalState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getFinalState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__FinalState() {
        return getFinalState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getFinalState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__Connector() {
        return getFinalState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__Connector() {
        return getFinalState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__Connector_String() {
        return getFinalState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__InitilalSuperState_String() {
        return getFinalState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getFinalState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__InitialState() {
        return getFinalState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getFinalState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__SuperState() {
        return getFinalState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SuperState() {
        return getFinalState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SuperState_String() {
        return getFinalState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__SimpleState() {
        return getFinalState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SimpleState() {
        return getFinalState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__FinalState() {
        return getFinalState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__FinalState() {
        return getFinalState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__FinalState_String() {
        return getFinalState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__Connector() {
        return getFinalState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__Connector() {
        return getFinalState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__Connector_String() {
        return getFinalState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitilalSuperState_String() {
        return getFinalState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__InitialState() {
        return getFinalState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitialState() {
        return getFinalState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitialState_String() {
        return getFinalState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__SuperState() {
        return getFinalState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__SuperState() {
        return getFinalState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__SuperState_String() {
        return getFinalState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__SimpleState() {
        return getFinalState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__SimpleState() {
        return getFinalState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__FinalState() {
        return getFinalState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__FinalState() {
        return getFinalState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__FinalState_String() {
        return getFinalState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__Connector() {
        return getFinalState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__Connector() {
        return getFinalState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__Connector_String() {
        return getFinalState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__InitilalSuperState() {
        return getFinalState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__InitilalSuperState_String() {
        return getFinalState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__InitialState() {
        return getFinalState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__InitialState() {
        return getFinalState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__InitialState_String() {
        return getFinalState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanMoveTo__Region_int_int() {
        return getFinalState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__MoveTo__Region_int_int() {
        return getFinalState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__Region_int_int() {
        return getFinalState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetContainer() {
        return getFinalState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetFinalStateView() {
        return getFinalState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		if (connectorEClass == null) {
			connectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(9);
		}
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInternalConnector() {
        return getConnector().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__IsExactlyConnector() {
        return getConnector().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PreDelete() {
        return getConnector().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetPostDeleteFunction() {
        return getConnector().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetPostDeleteEvent() {
        return getConnector().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PreSave() {
        return getConnector().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PostSave() {
        return getConnector().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetRootElement() {
        return getConnector().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoing() {
        return getConnector().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSuccessors() {
        return getConnector().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncoming() {
        return getConnector().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetPredecessors() {
        return getConnector().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__ModelElementContainer_int_int() {
        return getConnector().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PreMove__ModelElementContainer_int_int() {
        return getConnector().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getConnector().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PreResize__int_int_int_int_Direction() {
        return getConnector().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__PostResize__int_int_int_int_Direction() {
        return getConnector().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingTransitions() {
        return getConnector().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingWeakAbortTerminationTransitions() {
        return getConnector().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingStrongAbortTransitions() {
        return getConnector().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingImmediateTerminationTransitions() {
        return getConnector().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingDefferedTransitions() {
        return getConnector().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingWeakAbortTransitions() {
        return getConnector().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingImmediateTransitions() {
        return getConnector().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingTransitions() {
        return getConnector().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingWeakAbortTerminationTransitions() {
        return getConnector().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingStrongAbortTransitions() {
        return getConnector().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingImmediateTerminationTransitions() {
        return getConnector().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingDefferedTransitions() {
        return getConnector().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingWeakAbortTransitions() {
        return getConnector().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingImmediateTransitions() {
        return getConnector().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetRootStatePredecessors() {
        return getConnector().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSuperStatePredecessors() {
        return getConnector().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitilalSuperStatePredecessors() {
        return getConnector().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSimpleStatePredecessors() {
        return getConnector().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitialStatePredecessors() {
        return getConnector().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetFinalStatePredecessors() {
        return getConnector().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetConnectorPredecessors() {
        return getConnector().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSuperStateSuccessors() {
        return getConnector().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitilalSuperStateSuccessors() {
        return getConnector().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetSimpleStateSuccessors() {
        return getConnector().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitialStateSuccessors() {
        return getConnector().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetFinalStateSuccessors() {
        return getConnector().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetConnectorSuccessors() {
        return getConnector().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__SuperState() {
        return getConnector().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SuperState() {
        return getConnector().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SuperState_String() {
        return getConnector().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__SimpleState() {
        return getConnector().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SimpleState() {
        return getConnector().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SimpleState_String() {
        return getConnector().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__FinalState() {
        return getConnector().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__FinalState() {
        return getConnector().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__FinalState_String() {
        return getConnector().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__Connector() {
        return getConnector().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__Connector() {
        return getConnector().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__Connector_String() {
        return getConnector().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitilalSuperState_String() {
        return getConnector().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__InitialState() {
        return getConnector().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitialState() {
        return getConnector().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitialState_String() {
        return getConnector().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__SuperState() {
        return getConnector().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__SuperState() {
        return getConnector().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__SuperState_String() {
        return getConnector().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__SimpleState() {
        return getConnector().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__SimpleState() {
        return getConnector().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__SimpleState_String() {
        return getConnector().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__FinalState() {
        return getConnector().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__FinalState() {
        return getConnector().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__FinalState_String() {
        return getConnector().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__Connector() {
        return getConnector().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__Connector() {
        return getConnector().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__Connector_String() {
        return getConnector().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__InitilalSuperState_String() {
        return getConnector().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__InitialState() {
        return getConnector().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__InitialState() {
        return getConnector().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__InitialState_String() {
        return getConnector().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__SuperState() {
        return getConnector().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__SuperState() {
        return getConnector().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__SuperState_String() {
        return getConnector().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__SimpleState() {
        return getConnector().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__SimpleState() {
        return getConnector().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__SimpleState_String() {
        return getConnector().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__FinalState() {
        return getConnector().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__FinalState() {
        return getConnector().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__FinalState_String() {
        return getConnector().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__Connector() {
        return getConnector().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__Connector() {
        return getConnector().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__Connector_String() {
        return getConnector().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__InitilalSuperState_String() {
        return getConnector().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__InitialState() {
        return getConnector().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__InitialState() {
        return getConnector().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__InitialState_String() {
        return getConnector().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__SuperState() {
        return getConnector().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__SuperState() {
        return getConnector().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__SuperState_String() {
        return getConnector().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__SimpleState() {
        return getConnector().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__SimpleState() {
        return getConnector().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__SimpleState_String() {
        return getConnector().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__FinalState() {
        return getConnector().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__FinalState() {
        return getConnector().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__FinalState_String() {
        return getConnector().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__Connector() {
        return getConnector().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__Connector() {
        return getConnector().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__Connector_String() {
        return getConnector().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__InitilalSuperState_String() {
        return getConnector().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__InitialState() {
        return getConnector().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__InitialState() {
        return getConnector().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__InitialState_String() {
        return getConnector().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__SuperState() {
        return getConnector().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__SuperState() {
        return getConnector().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__SuperState_String() {
        return getConnector().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getConnector().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__SimpleState() {
        return getConnector().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getConnector().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__FinalState() {
        return getConnector().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__FinalState() {
        return getConnector().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__FinalState_String() {
        return getConnector().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__Connector() {
        return getConnector().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__Connector() {
        return getConnector().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__Connector_String() {
        return getConnector().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__InitilalSuperState_String() {
        return getConnector().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__InitialState() {
        return getConnector().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__InitialState() {
        return getConnector().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__InitialState_String() {
        return getConnector().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__SuperState() {
        return getConnector().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SuperState() {
        return getConnector().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SuperState_String() {
        return getConnector().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__SimpleState() {
        return getConnector().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SimpleState() {
        return getConnector().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SimpleState_String() {
        return getConnector().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__FinalState() {
        return getConnector().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__FinalState() {
        return getConnector().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__FinalState_String() {
        return getConnector().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__Connector() {
        return getConnector().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__Connector() {
        return getConnector().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__Connector_String() {
        return getConnector().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitilalSuperState_String() {
        return getConnector().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__InitialState() {
        return getConnector().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitialState() {
        return getConnector().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitialState_String() {
        return getConnector().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__SuperState() {
        return getConnector().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__SuperState() {
        return getConnector().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__SuperState_String() {
        return getConnector().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__SimpleState() {
        return getConnector().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__SimpleState() {
        return getConnector().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__SimpleState_String() {
        return getConnector().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__FinalState() {
        return getConnector().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__FinalState() {
        return getConnector().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__FinalState_String() {
        return getConnector().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__Connector() {
        return getConnector().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__Connector() {
        return getConnector().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__Connector_String() {
        return getConnector().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__InitilalSuperState() {
        return getConnector().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__InitilalSuperState_String() {
        return getConnector().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__InitialState() {
        return getConnector().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__InitialState() {
        return getConnector().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__InitialState_String() {
        return getConnector().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanMoveTo__Region_int_int() {
        return getConnector().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__MoveTo__Region_int_int() {
        return getConnector().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__Region_int_int() {
        return getConnector().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetContainer() {
        return getConnector().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetConnectorView() {
        return getConnector().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		if (transitionEClass == null) {
			transitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(10);
		}
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetAction() {
        return getTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetAction__String() {
        return getTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetTrigger() {
        return getTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetTrigger__String() {
        return getTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__IsStrong_Abort() {
        return getTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetStrong_Abort__boolean() {
        return getTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetPriority() {
        return getTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetPriority__int() {
        return getTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__IsImmediate_transition() {
        return getTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetImmediate_transition__boolean() {
        return getTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__IsTermination() {
        return getTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetTermination__boolean() {
        return getTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__IsHistory() {
        return getTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetHistory__boolean() {
        return getTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetInternalTransition() {
        return getTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__IsExactlyTransition() {
        return getTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__PreDelete() {
        return getTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetPostDeleteFunction() {
        return getTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetPostDeleteEvent() {
        return getTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__PreSave() {
        return getTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__PostSave() {
        return getTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetRootElement() {
        return getTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetSourceElement() {
        return getTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetTargetElement() {
        return getTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__SuperState() {
        return getTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__SuperState() {
        return getTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__RootState() {
        return getTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__RootState() {
        return getTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__SimpleState() {
        return getTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__SimpleState() {
        return getTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__FinalState() {
        return getTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__FinalState() {
        return getTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__Connector() {
        return getTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__Connector() {
        return getTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__InitilalSuperState() {
        return getTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__InitilalSuperState() {
        return getTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__InitialState() {
        return getTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__InitialState() {
        return getTransition().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__SuperState() {
        return getTransition().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__SuperState() {
        return getTransition().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__SimpleState() {
        return getTransition().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__SimpleState() {
        return getTransition().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__FinalState() {
        return getTransition().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__FinalState() {
        return getTransition().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__Connector() {
        return getTransition().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__Connector() {
        return getTransition().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__InitilalSuperState() {
        return getTransition().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__InitilalSuperState() {
        return getTransition().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__InitialState() {
        return getTransition().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__InitialState() {
        return getTransition().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetTransitionView() {
        return getTransition().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateTransition() {
		if (immediateTransitionEClass == null) {
			immediateTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(11);
		}
		return immediateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetLabel() {
        return getImmediateTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__SetLabel__String() {
        return getImmediateTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetInternalImmediateTransition() {
        return getImmediateTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__IsExactlyImmediateTransition() {
        return getImmediateTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__PreDelete() {
        return getImmediateTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetPostDeleteFunction() {
        return getImmediateTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetPostDeleteEvent() {
        return getImmediateTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__PreSave() {
        return getImmediateTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__PostSave() {
        return getImmediateTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetRootElement() {
        return getImmediateTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetSourceElement() {
        return getImmediateTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetTargetElement() {
        return getImmediateTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__SuperState() {
        return getImmediateTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__SuperState() {
        return getImmediateTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__RootState() {
        return getImmediateTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__RootState() {
        return getImmediateTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__SimpleState() {
        return getImmediateTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__SimpleState() {
        return getImmediateTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__FinalState() {
        return getImmediateTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__FinalState() {
        return getImmediateTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__Connector() {
        return getImmediateTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__Connector() {
        return getImmediateTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__InitilalSuperState() {
        return getImmediateTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__InitilalSuperState() {
        return getImmediateTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__InitialState() {
        return getImmediateTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__InitialState() {
        return getImmediateTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__SuperState() {
        return getImmediateTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__SuperState() {
        return getImmediateTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__SimpleState() {
        return getImmediateTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__SimpleState() {
        return getImmediateTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__FinalState() {
        return getImmediateTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__FinalState() {
        return getImmediateTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__Connector() {
        return getImmediateTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__Connector() {
        return getImmediateTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__InitilalSuperState() {
        return getImmediateTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__InitilalSuperState() {
        return getImmediateTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__InitialState() {
        return getImmediateTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__InitialState() {
        return getImmediateTransition().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetImmediateTransitionView() {
        return getImmediateTransition().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateTerminationTransition() {
		if (immediateTerminationTransitionEClass == null) {
			immediateTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(12);
		}
		return immediateTerminationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__GetInternalImmediateTerminationTransition() {
        return getImmediateTerminationTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__IsExactlyImmediateTerminationTransition() {
        return getImmediateTerminationTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__PreDelete() {
        return getImmediateTerminationTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__GetPostDeleteFunction() {
        return getImmediateTerminationTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__GetPostDeleteEvent() {
        return getImmediateTerminationTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__PreSave() {
        return getImmediateTerminationTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__PostSave() {
        return getImmediateTerminationTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__GetRootElement() {
        return getImmediateTerminationTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__GetSourceElement() {
        return getImmediateTerminationTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__GetTargetElement() {
        return getImmediateTerminationTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__SuperState() {
        return getImmediateTerminationTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__SuperState() {
        return getImmediateTerminationTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__RootState() {
        return getImmediateTerminationTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__RootState() {
        return getImmediateTerminationTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__SimpleState() {
        return getImmediateTerminationTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__SimpleState() {
        return getImmediateTerminationTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__FinalState() {
        return getImmediateTerminationTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__FinalState() {
        return getImmediateTerminationTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__Connector() {
        return getImmediateTerminationTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__Connector() {
        return getImmediateTerminationTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__InitilalSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__InitilalSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__InitialState() {
        return getImmediateTerminationTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__InitialState() {
        return getImmediateTerminationTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__SuperState() {
        return getImmediateTerminationTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__SuperState() {
        return getImmediateTerminationTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__SimpleState() {
        return getImmediateTerminationTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__SimpleState() {
        return getImmediateTerminationTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__FinalState() {
        return getImmediateTerminationTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__FinalState() {
        return getImmediateTerminationTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__Connector() {
        return getImmediateTerminationTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__Connector() {
        return getImmediateTerminationTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__InitilalSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__InitilalSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__InitialState() {
        return getImmediateTerminationTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__InitialState() {
        return getImmediateTerminationTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__GetImmediateTerminationTransitionView() {
        return getImmediateTerminationTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeakAbortTransition() {
		if (weakAbortTransitionEClass == null) {
			weakAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(13);
		}
		return weakAbortTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__GetInternalWeakAbortTransition() {
        return getWeakAbortTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__IsExactlyWeakAbortTransition() {
        return getWeakAbortTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__PreDelete() {
        return getWeakAbortTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__GetPostDeleteFunction() {
        return getWeakAbortTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__GetPostDeleteEvent() {
        return getWeakAbortTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__PreSave() {
        return getWeakAbortTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__PostSave() {
        return getWeakAbortTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__GetRootElement() {
        return getWeakAbortTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__GetSourceElement() {
        return getWeakAbortTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__GetTargetElement() {
        return getWeakAbortTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__SuperState() {
        return getWeakAbortTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__SuperState() {
        return getWeakAbortTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__RootState() {
        return getWeakAbortTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__RootState() {
        return getWeakAbortTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__SimpleState() {
        return getWeakAbortTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__SimpleState() {
        return getWeakAbortTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__FinalState() {
        return getWeakAbortTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__FinalState() {
        return getWeakAbortTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__Connector() {
        return getWeakAbortTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__Connector() {
        return getWeakAbortTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__InitilalSuperState() {
        return getWeakAbortTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__InitilalSuperState() {
        return getWeakAbortTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__InitialState() {
        return getWeakAbortTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__InitialState() {
        return getWeakAbortTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__SuperState() {
        return getWeakAbortTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__SuperState() {
        return getWeakAbortTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__SimpleState() {
        return getWeakAbortTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__SimpleState() {
        return getWeakAbortTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__FinalState() {
        return getWeakAbortTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__FinalState() {
        return getWeakAbortTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__Connector() {
        return getWeakAbortTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__Connector() {
        return getWeakAbortTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__InitilalSuperState() {
        return getWeakAbortTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__InitilalSuperState() {
        return getWeakAbortTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__InitialState() {
        return getWeakAbortTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__InitialState() {
        return getWeakAbortTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__GetWeakAbortTransitionView() {
        return getWeakAbortTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrongAbortTransition() {
		if (strongAbortTransitionEClass == null) {
			strongAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(14);
		}
		return strongAbortTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetInternalStrongAbortTransition() {
        return getStrongAbortTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__IsExactlyStrongAbortTransition() {
        return getStrongAbortTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__PreDelete() {
        return getStrongAbortTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetPostDeleteFunction() {
        return getStrongAbortTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetPostDeleteEvent() {
        return getStrongAbortTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__PreSave() {
        return getStrongAbortTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__PostSave() {
        return getStrongAbortTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetRootElement() {
        return getStrongAbortTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetSourceElement() {
        return getStrongAbortTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetTargetElement() {
        return getStrongAbortTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__SuperState() {
        return getStrongAbortTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__SuperState() {
        return getStrongAbortTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__RootState() {
        return getStrongAbortTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__RootState() {
        return getStrongAbortTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__FinalState() {
        return getStrongAbortTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__FinalState() {
        return getStrongAbortTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__Connector() {
        return getStrongAbortTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__Connector() {
        return getStrongAbortTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__InitilalSuperState() {
        return getStrongAbortTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__InitilalSuperState() {
        return getStrongAbortTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__InitialState() {
        return getStrongAbortTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__InitialState() {
        return getStrongAbortTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__SuperState() {
        return getStrongAbortTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__SuperState() {
        return getStrongAbortTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__FinalState() {
        return getStrongAbortTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__FinalState() {
        return getStrongAbortTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__Connector() {
        return getStrongAbortTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__Connector() {
        return getStrongAbortTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__InitilalSuperState() {
        return getStrongAbortTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__InitilalSuperState() {
        return getStrongAbortTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__InitialState() {
        return getStrongAbortTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__InitialState() {
        return getStrongAbortTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__GetStrongAbortTransitionView() {
        return getStrongAbortTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeakAbortTerminationTransition() {
		if (weakAbortTerminationTransitionEClass == null) {
			weakAbortTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(15);
		}
		return weakAbortTerminationTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__GetInternalWeakAbortTerminationTransition() {
        return getWeakAbortTerminationTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__IsExactlyWeakAbortTerminationTransition() {
        return getWeakAbortTerminationTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__PreDelete() {
        return getWeakAbortTerminationTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__GetPostDeleteFunction() {
        return getWeakAbortTerminationTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__GetPostDeleteEvent() {
        return getWeakAbortTerminationTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__PreSave() {
        return getWeakAbortTerminationTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__PostSave() {
        return getWeakAbortTerminationTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__GetRootElement() {
        return getWeakAbortTerminationTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__GetSourceElement() {
        return getWeakAbortTerminationTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__GetTargetElement() {
        return getWeakAbortTerminationTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__SuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__SuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__RootState() {
        return getWeakAbortTerminationTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__RootState() {
        return getWeakAbortTerminationTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__SimpleState() {
        return getWeakAbortTerminationTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__SimpleState() {
        return getWeakAbortTerminationTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__FinalState() {
        return getWeakAbortTerminationTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__FinalState() {
        return getWeakAbortTerminationTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__Connector() {
        return getWeakAbortTerminationTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__Connector() {
        return getWeakAbortTerminationTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__InitilalSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__InitilalSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__InitialState() {
        return getWeakAbortTerminationTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__InitialState() {
        return getWeakAbortTerminationTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__SuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__SuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__SimpleState() {
        return getWeakAbortTerminationTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__SimpleState() {
        return getWeakAbortTerminationTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__FinalState() {
        return getWeakAbortTerminationTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__FinalState() {
        return getWeakAbortTerminationTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__Connector() {
        return getWeakAbortTerminationTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__Connector() {
        return getWeakAbortTerminationTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__InitilalSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__InitilalSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__InitialState() {
        return getWeakAbortTerminationTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__InitialState() {
        return getWeakAbortTerminationTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__GetWeakAbortTerminationTransitionView() {
        return getWeakAbortTerminationTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefferedTransition() {
		if (defferedTransitionEClass == null) {
			defferedTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(16);
		}
		return defferedTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__GetInternalDefferedTransition() {
        return getDefferedTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__IsExactlyDefferedTransition() {
        return getDefferedTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__PreDelete() {
        return getDefferedTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__GetPostDeleteFunction() {
        return getDefferedTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__GetPostDeleteEvent() {
        return getDefferedTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__PreSave() {
        return getDefferedTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__PostSave() {
        return getDefferedTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__GetRootElement() {
        return getDefferedTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__GetSourceElement() {
        return getDefferedTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__GetTargetElement() {
        return getDefferedTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__SuperState() {
        return getDefferedTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__SuperState() {
        return getDefferedTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__RootState() {
        return getDefferedTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__RootState() {
        return getDefferedTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__SimpleState() {
        return getDefferedTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__SimpleState() {
        return getDefferedTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__FinalState() {
        return getDefferedTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__FinalState() {
        return getDefferedTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__Connector() {
        return getDefferedTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__Connector() {
        return getDefferedTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__InitilalSuperState() {
        return getDefferedTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__InitilalSuperState() {
        return getDefferedTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__InitialState() {
        return getDefferedTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__InitialState() {
        return getDefferedTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__SuperState() {
        return getDefferedTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__SuperState() {
        return getDefferedTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__SimpleState() {
        return getDefferedTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__SimpleState() {
        return getDefferedTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__FinalState() {
        return getDefferedTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__FinalState() {
        return getDefferedTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__Connector() {
        return getDefferedTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__Connector() {
        return getDefferedTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__InitilalSuperState() {
        return getDefferedTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__InitilalSuperState() {
        return getDefferedTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__InitialState() {
        return getDefferedTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__InitialState() {
        return getDefferedTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__GetDefferedTransitionView() {
        return getDefferedTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCChart() {
		if (scChartEClass == null) {
			scChartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(17);
		}
		return scChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetInternalSCChart() {
        return getSCChart().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__IsExactlySCChart() {
        return getSCChart().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__PreDelete() {
        return getSCChart().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetPostDeleteFunction() {
        return getSCChart().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetPostDeleteEvent() {
        return getSCChart().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__PreSave() {
        return getSCChart().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__PostSave() {
        return getSCChart().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetRootElement() {
        return getSCChart().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetNodes() {
        return getSCChart().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetRootStates() {
        return getSCChart().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__CanNewRootState() {
        return getSCChart().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewRootState__int_int() {
        return getSCChart().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewRootState__String_int_int() {
        return getSCChart().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewRootState__int_int_int_int() {
        return getSCChart().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewRootState__String_int_int_int_int() {
        return getSCChart().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__NewSCChart__String_String_boolean() {
        return getSCChart().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSCChart__GetSCChartView() {
        return getSCChart().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootStateDeclaration() {
		if (rootStateDeclarationEClass == null) {
			rootStateDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(18);
		}
		return rootStateDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclaration__GetDeclarationType() {
        return getRootStateDeclaration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclaration__SetDeclarationType__String() {
        return getRootStateDeclaration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclaration__GetInputOutput() {
        return getRootStateDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclaration__SetInputOutput__String() {
        return getRootStateDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclaration__GetName() {
        return getRootStateDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclaration__SetName__String() {
        return getRootStateDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclaration__GetInternalRootStateDeclaration() {
        return getRootStateDeclaration().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclaration__IsExactlyRootStateDeclaration() {
        return getRootStateDeclaration().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootStateDeclaration__GetRootStateDeclarationView() {
        return getRootStateDeclaration().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperStateDeclaration() {
		if (superStateDeclarationEClass == null) {
			superStateDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(19);
		}
		return superStateDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__GetDeclarationType() {
        return getSuperStateDeclaration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__SetDeclarationType__String() {
        return getSuperStateDeclaration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__GetName() {
        return getSuperStateDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__SetName__String() {
        return getSuperStateDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__GetInternalSuperStateDeclaration() {
        return getSuperStateDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__IsExactlySuperStateDeclaration() {
        return getSuperStateDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__GetSuperStateDeclarationView() {
        return getSuperStateDeclaration().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScchartFactory getScchartFactory() {
		return (ScchartFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
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
			eClassifier.setInstanceClassName("info.scce.cinco.product.scchart.mglid.scchart." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ScchartPackageImpl

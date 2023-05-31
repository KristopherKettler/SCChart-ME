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
	private EClass superStateRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initilalSubSuperStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSuperStateRegionEClass = null;

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
	private EClass subSuperStateDeclarationNodeEClass = null;

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
	private EClass superStateDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSuperStateDeclarationEClass = null;

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
	public EOperation getRootState__AddDeclaration__SuperStateDeclaration() {
        return getRootState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__RemoveDeclaration__SuperStateDeclaration() {
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
	public EOperation getRootState__GetSuperStateRegions() {
        return getRootState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewSuperStateRegion() {
        return getRootState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuperStateRegion__int_int() {
        return getRootState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuperStateRegion__String_int_int() {
        return getRootState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuperStateRegion__int_int_int_int() {
        return getRootState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuperStateRegion__String_int_int_int_int() {
        return getRootState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetSuperStateDeclarationNodes() {
        return getRootState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewSuperStateDeclarationNode() {
        return getRootState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuperStateDeclarationNode__int_int() {
        return getRootState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuperStateDeclarationNode__String_int_int() {
        return getRootState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuperStateDeclarationNode__int_int_int_int() {
        return getRootState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewSuperStateDeclarationNode__String_int_int_int_int() {
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
	public EOperation getRootState__GetOutgoingDefferedTransitions() {
        return getRootState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingStrongAbortTransitions() {
        return getRootState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingTransitions() {
        return getRootState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateTransitions() {
        return getRootState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingWeakAbortTerminationTransitions() {
        return getRootState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingImmediateTerminationTransitions() {
        return getRootState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetOutgoingWeakAbortTransitions() {
        return getRootState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetSubSuperStateSuccessors() {
        return getRootState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetInitilalSubSuperStateSuccessors() {
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
	public EOperation getRootState__CanNewDefferedTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__InitilalSubSuperState_String() {
        return getRootState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__SubSuperState() {
        return getRootState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__SubSuperState() {
        return getRootState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__SubSuperState_String() {
        return getRootState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__Connector() {
        return getRootState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__Connector() {
        return getRootState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__Connector_String() {
        return getRootState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__InitialState() {
        return getRootState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__InitialState() {
        return getRootState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__InitialState_String() {
        return getRootState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__SimpleState() {
        return getRootState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__SimpleState() {
        return getRootState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__SimpleState_String() {
        return getRootState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewDefferedTransition__FinalState() {
        return getRootState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__FinalState() {
        return getRootState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewDefferedTransition__FinalState_String() {
        return getRootState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitilalSubSuperState_String() {
        return getRootState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__SubSuperState() {
        return getRootState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SubSuperState() {
        return getRootState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SubSuperState_String() {
        return getRootState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__Connector() {
        return getRootState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__Connector() {
        return getRootState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__Connector_String() {
        return getRootState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__InitialState() {
        return getRootState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitialState() {
        return getRootState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__InitialState_String() {
        return getRootState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__SimpleState_String() {
        return getRootState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewStrongAbortTransition__FinalState() {
        return getRootState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__FinalState() {
        return getRootState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewStrongAbortTransition__FinalState_String() {
        return getRootState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitilalSubSuperState_String() {
        return getRootState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__SubSuperState() {
        return getRootState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SubSuperState() {
        return getRootState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SubSuperState_String() {
        return getRootState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__Connector() {
        return getRootState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__Connector() {
        return getRootState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__Connector_String() {
        return getRootState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__InitialState() {
        return getRootState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitialState() {
        return getRootState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__InitialState_String() {
        return getRootState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__SimpleState() {
        return getRootState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SimpleState() {
        return getRootState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__SimpleState_String() {
        return getRootState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewTransition__FinalState() {
        return getRootState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__FinalState() {
        return getRootState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewTransition__FinalState_String() {
        return getRootState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitilalSubSuperState_String() {
        return getRootState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__SubSuperState() {
        return getRootState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SubSuperState() {
        return getRootState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SubSuperState_String() {
        return getRootState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__Connector() {
        return getRootState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__Connector() {
        return getRootState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__Connector_String() {
        return getRootState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__InitialState() {
        return getRootState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitialState() {
        return getRootState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__InitialState_String() {
        return getRootState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__SimpleState() {
        return getRootState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SimpleState() {
        return getRootState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__SimpleState_String() {
        return getRootState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTransition__FinalState() {
        return getRootState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__FinalState() {
        return getRootState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTransition__FinalState_String() {
        return getRootState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__InitilalSubSuperState_String() {
        return getRootState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__SubSuperState() {
        return getRootState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__SubSuperState() {
        return getRootState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__SubSuperState_String() {
        return getRootState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__Connector() {
        return getRootState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__Connector() {
        return getRootState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__Connector_String() {
        return getRootState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getRootState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getRootState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getRootState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__InitilalSubSuperState_String() {
        return getRootState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__SubSuperState() {
        return getRootState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__SubSuperState() {
        return getRootState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__SubSuperState_String() {
        return getRootState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__Connector() {
        return getRootState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__Connector() {
        return getRootState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__Connector_String() {
        return getRootState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__InitialState() {
        return getRootState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__InitialState_String() {
        return getRootState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__SimpleState() {
        return getRootState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__SimpleState_String() {
        return getRootState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewImmediateTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__FinalState() {
        return getRootState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewImmediateTerminationTransition__FinalState_String() {
        return getRootState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__InitilalSubSuperState() {
        return getRootState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__InitilalSubSuperState_String() {
        return getRootState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__SubSuperState() {
        return getRootState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__SubSuperState() {
        return getRootState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__SubSuperState_String() {
        return getRootState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__Connector() {
        return getRootState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__Connector() {
        return getRootState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__Connector_String() {
        return getRootState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__InitialState() {
        return getRootState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__InitialState() {
        return getRootState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__InitialState_String() {
        return getRootState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__SimpleState() {
        return getRootState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__SimpleState_String() {
        return getRootState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__CanNewWeakAbortTransition__FinalState() {
        return getRootState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__FinalState() {
        return getRootState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__NewWeakAbortTransition__FinalState_String() {
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
	public EOperation getRootState__CanMoveTo__SubSuperStateRegion_int_int() {
        return getRootState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__MoveTo__SubSuperStateRegion_int_int() {
        return getRootState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__S_moveTo__SubSuperStateRegion_int_int() {
        return getRootState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRootState__GetRootStateView() {
        return getRootState().getEOperations().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperStateRegion() {
		if (superStateRegionEClass == null) {
			superStateRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(1);
		}
		return superStateRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetLabel() {
        return getSuperStateRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__SetLabel__String() {
        return getSuperStateRegion().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetRegionID() {
        return getSuperStateRegion().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__SetRegionID__String() {
        return getSuperStateRegion().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetInternalSuperStateRegion() {
        return getSuperStateRegion().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__IsExactlySuperStateRegion() {
        return getSuperStateRegion().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__PreDelete() {
        return getSuperStateRegion().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetPostDeleteFunction() {
        return getSuperStateRegion().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetPostDeleteEvent() {
        return getSuperStateRegion().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__PreSave() {
        return getSuperStateRegion().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__PostSave() {
        return getSuperStateRegion().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetRootElement() {
        return getSuperStateRegion().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetNodes() {
        return getSuperStateRegion().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetInitilalSubSuperStates() {
        return getSuperStateRegion().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__CanNewInitilalSubSuperState() {
        return getSuperStateRegion().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewInitilalSubSuperState__int_int() {
        return getSuperStateRegion().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewInitilalSubSuperState__String_int_int() {
        return getSuperStateRegion().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewInitilalSubSuperState__int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewInitilalSubSuperState__String_int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetSubSuperStates() {
        return getSuperStateRegion().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__CanNewSubSuperState() {
        return getSuperStateRegion().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewSubSuperState__int_int() {
        return getSuperStateRegion().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewSubSuperState__String_int_int() {
        return getSuperStateRegion().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewSubSuperState__int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewSubSuperState__String_int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetConnectors() {
        return getSuperStateRegion().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__CanNewConnector() {
        return getSuperStateRegion().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewConnector__int_int() {
        return getSuperStateRegion().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewConnector__String_int_int() {
        return getSuperStateRegion().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewConnector__int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewConnector__String_int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetInitialStates() {
        return getSuperStateRegion().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__CanNewInitialState() {
        return getSuperStateRegion().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewInitialState__int_int() {
        return getSuperStateRegion().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewInitialState__String_int_int() {
        return getSuperStateRegion().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewInitialState__int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewInitialState__String_int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetSimpleStates() {
        return getSuperStateRegion().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__CanNewSimpleState() {
        return getSuperStateRegion().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewSimpleState__int_int() {
        return getSuperStateRegion().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewSimpleState__String_int_int() {
        return getSuperStateRegion().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewSimpleState__int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewSimpleState__String_int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetFinalStates() {
        return getSuperStateRegion().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__CanNewFinalState() {
        return getSuperStateRegion().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewFinalState__int_int() {
        return getSuperStateRegion().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewFinalState__String_int_int() {
        return getSuperStateRegion().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewFinalState__int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__NewFinalState__String_int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__S_moveTo__ModelElementContainer_int_int() {
        return getSuperStateRegion().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__PreMove__ModelElementContainer_int_int() {
        return getSuperStateRegion().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSuperStateRegion().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__PreResize__int_int_int_int_Direction() {
        return getSuperStateRegion().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__PostResize__int_int_int_int_Direction() {
        return getSuperStateRegion().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__CanMoveTo__RootState_int_int() {
        return getSuperStateRegion().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__MoveTo__RootState_int_int() {
        return getSuperStateRegion().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__S_moveTo__RootState_int_int() {
        return getSuperStateRegion().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__CanMoveTo__SubSuperStateRegion_int_int() {
        return getSuperStateRegion().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__MoveTo__SubSuperStateRegion_int_int() {
        return getSuperStateRegion().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__S_moveTo__SubSuperStateRegion_int_int() {
        return getSuperStateRegion().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateRegion__GetSuperStateRegionView() {
        return getSuperStateRegion().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSuperState() {
		if (subSuperStateEClass == null) {
			subSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(2);
		}
		return subSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetLabel() {
        return getSubSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__SetLabel__String() {
        return getSubSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetDeclaration() {
        return getSubSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__SetDeclaration__EList() {
        return getSubSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__AddDeclaration__SubSuperStateDeclaration() {
        return getSubSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__RemoveDeclaration__SubSuperStateDeclaration() {
        return getSubSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetInternalSubSuperState() {
        return getSubSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__IsExactlySubSuperState() {
        return getSubSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__PreDelete() {
        return getSubSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetPostDeleteFunction() {
        return getSubSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetPostDeleteEvent() {
        return getSubSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__PreSave() {
        return getSubSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__PostSave() {
        return getSubSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetRootElement() {
        return getSubSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetNodes() {
        return getSubSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetSubSuperStateRegions() {
        return getSubSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewSubSuperStateRegion() {
        return getSubSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewSubSuperStateRegion__int_int() {
        return getSubSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewSubSuperStateRegion__String_int_int() {
        return getSubSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewSubSuperStateRegion__int_int_int_int() {
        return getSubSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewSubSuperStateRegion__String_int_int_int_int() {
        return getSubSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetSubSuperStateDeclarationNodes() {
        return getSubSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewSubSuperStateDeclarationNode() {
        return getSubSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewSubSuperStateDeclarationNode__int_int() {
        return getSubSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewSubSuperStateDeclarationNode__String_int_int() {
        return getSubSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewSubSuperStateDeclarationNode__int_int_int_int() {
        return getSubSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewSubSuperStateDeclarationNode__String_int_int_int_int() {
        return getSubSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetOutgoing() {
        return getSubSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetSuccessors() {
        return getSubSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetIncoming() {
        return getSubSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetPredecessors() {
        return getSubSuperState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__S_moveTo__ModelElementContainer_int_int() {
        return getSubSuperState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__PreMove__ModelElementContainer_int_int() {
        return getSubSuperState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSubSuperState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__PreResize__int_int_int_int_Direction() {
        return getSubSuperState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__PostResize__int_int_int_int_Direction() {
        return getSubSuperState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetOutgoingDefferedTransitions() {
        return getSubSuperState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetOutgoingStrongAbortTransitions() {
        return getSubSuperState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetOutgoingTransitions() {
        return getSubSuperState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetOutgoingImmediateTransitions() {
        return getSubSuperState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetOutgoingWeakAbortTerminationTransitions() {
        return getSubSuperState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetOutgoingImmediateTerminationTransitions() {
        return getSubSuperState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetOutgoingWeakAbortTransitions() {
        return getSubSuperState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetIncomingDefferedTransitions() {
        return getSubSuperState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetIncomingStrongAbortTransitions() {
        return getSubSuperState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetIncomingTransitions() {
        return getSubSuperState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetIncomingImmediateTransitions() {
        return getSubSuperState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetIncomingWeakAbortTerminationTransitions() {
        return getSubSuperState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetIncomingImmediateTerminationTransitions() {
        return getSubSuperState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetIncomingWeakAbortTransitions() {
        return getSubSuperState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetRootStatePredecessors() {
        return getSubSuperState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetSubSuperStatePredecessors() {
        return getSubSuperState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetInitilalSubSuperStatePredecessors() {
        return getSubSuperState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetSimpleStatePredecessors() {
        return getSubSuperState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetInitialStatePredecessors() {
        return getSubSuperState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetFinalStatePredecessors() {
        return getSubSuperState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetConnectorPredecessors() {
        return getSubSuperState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetSubSuperStateSuccessors() {
        return getSubSuperState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetInitilalSubSuperStateSuccessors() {
        return getSubSuperState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetSimpleStateSuccessors() {
        return getSubSuperState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetInitialStateSuccessors() {
        return getSubSuperState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetFinalStateSuccessors() {
        return getSubSuperState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetConnectorSuccessors() {
        return getSubSuperState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewDefferedTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__InitilalSubSuperState_String() {
        return getSubSuperState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewDefferedTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__SubSuperState_String() {
        return getSubSuperState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewDefferedTransition__Connector() {
        return getSubSuperState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__Connector() {
        return getSubSuperState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__Connector_String() {
        return getSubSuperState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewDefferedTransition__InitialState() {
        return getSubSuperState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__InitialState() {
        return getSubSuperState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__InitialState_String() {
        return getSubSuperState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewDefferedTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__SimpleState_String() {
        return getSubSuperState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewDefferedTransition__FinalState() {
        return getSubSuperState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__FinalState() {
        return getSubSuperState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewDefferedTransition__FinalState_String() {
        return getSubSuperState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewStrongAbortTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__InitilalSubSuperState_String() {
        return getSubSuperState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewStrongAbortTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__SubSuperState_String() {
        return getSubSuperState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewStrongAbortTransition__Connector() {
        return getSubSuperState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__Connector() {
        return getSubSuperState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__Connector_String() {
        return getSubSuperState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewStrongAbortTransition__InitialState() {
        return getSubSuperState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__InitialState() {
        return getSubSuperState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__InitialState_String() {
        return getSubSuperState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewStrongAbortTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__SimpleState_String() {
        return getSubSuperState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewStrongAbortTransition__FinalState() {
        return getSubSuperState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__FinalState() {
        return getSubSuperState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewStrongAbortTransition__FinalState_String() {
        return getSubSuperState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__InitilalSubSuperState_String() {
        return getSubSuperState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__SubSuperState_String() {
        return getSubSuperState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewTransition__Connector() {
        return getSubSuperState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__Connector() {
        return getSubSuperState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__Connector_String() {
        return getSubSuperState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewTransition__InitialState() {
        return getSubSuperState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__InitialState() {
        return getSubSuperState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__InitialState_String() {
        return getSubSuperState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__SimpleState_String() {
        return getSubSuperState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewTransition__FinalState() {
        return getSubSuperState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__FinalState() {
        return getSubSuperState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewTransition__FinalState_String() {
        return getSubSuperState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__InitilalSubSuperState_String() {
        return getSubSuperState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__SubSuperState_String() {
        return getSubSuperState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTransition__Connector() {
        return getSubSuperState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__Connector() {
        return getSubSuperState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__Connector_String() {
        return getSubSuperState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTransition__InitialState() {
        return getSubSuperState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__InitialState() {
        return getSubSuperState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__InitialState_String() {
        return getSubSuperState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__SimpleState_String() {
        return getSubSuperState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTransition__FinalState() {
        return getSubSuperState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__FinalState() {
        return getSubSuperState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTransition__FinalState_String() {
        return getSubSuperState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__InitilalSubSuperState_String() {
        return getSubSuperState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTerminationTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__SubSuperState_String() {
        return getSubSuperState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTerminationTransition__Connector() {
        return getSubSuperState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__Connector() {
        return getSubSuperState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__Connector_String() {
        return getSubSuperState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getSubSuperState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__InitialState() {
        return getSubSuperState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getSubSuperState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getSubSuperState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getSubSuperState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__FinalState() {
        return getSubSuperState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getSubSuperState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTerminationTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__InitilalSubSuperState_String() {
        return getSubSuperState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTerminationTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__SubSuperState_String() {
        return getSubSuperState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTerminationTransition__Connector() {
        return getSubSuperState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__Connector() {
        return getSubSuperState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__Connector_String() {
        return getSubSuperState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTerminationTransition__InitialState() {
        return getSubSuperState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__InitialState() {
        return getSubSuperState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__InitialState_String() {
        return getSubSuperState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTerminationTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__SimpleState_String() {
        return getSubSuperState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewImmediateTerminationTransition__FinalState() {
        return getSubSuperState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__FinalState() {
        return getSubSuperState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewImmediateTerminationTransition__FinalState_String() {
        return getSubSuperState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__InitilalSubSuperState() {
        return getSubSuperState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__InitilalSubSuperState_String() {
        return getSubSuperState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__SubSuperState() {
        return getSubSuperState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__SubSuperState_String() {
        return getSubSuperState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTransition__Connector() {
        return getSubSuperState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__Connector() {
        return getSubSuperState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__Connector_String() {
        return getSubSuperState().getEOperations().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTransition__InitialState() {
        return getSubSuperState().getEOperations().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__InitialState() {
        return getSubSuperState().getEOperations().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__InitialState_String() {
        return getSubSuperState().getEOperations().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__SimpleState() {
        return getSubSuperState().getEOperations().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__SimpleState_String() {
        return getSubSuperState().getEOperations().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanNewWeakAbortTransition__FinalState() {
        return getSubSuperState().getEOperations().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__FinalState() {
        return getSubSuperState().getEOperations().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__NewWeakAbortTransition__FinalState_String() {
        return getSubSuperState().getEOperations().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanMoveTo__SuperStateRegion_int_int() {
        return getSubSuperState().getEOperations().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__MoveTo__SuperStateRegion_int_int() {
        return getSubSuperState().getEOperations().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__S_moveTo__SuperStateRegion_int_int() {
        return getSubSuperState().getEOperations().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__CanMoveTo__SubSuperStateRegion_int_int() {
        return getSubSuperState().getEOperations().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__MoveTo__SubSuperStateRegion_int_int() {
        return getSubSuperState().getEOperations().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__S_moveTo__SubSuperStateRegion_int_int() {
        return getSubSuperState().getEOperations().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperState__GetSubSuperStateView() {
        return getSubSuperState().getEOperations().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitilalSubSuperState() {
		if (initilalSubSuperStateEClass == null) {
			initilalSubSuperStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(3);
		}
		return initilalSubSuperStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetInternalInitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__IsExactlyInitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__PreDelete() {
        return getInitilalSubSuperState().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetPostDeleteFunction() {
        return getInitilalSubSuperState().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetPostDeleteEvent() {
        return getInitilalSubSuperState().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__PreSave() {
        return getInitilalSubSuperState().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__PostSave() {
        return getInitilalSubSuperState().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetRootElement() {
        return getInitilalSubSuperState().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetNodes() {
        return getInitilalSubSuperState().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetSubSuperStateRegions() {
        return getInitilalSubSuperState().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewSubSuperStateRegion() {
        return getInitilalSubSuperState().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewSubSuperStateRegion__int_int() {
        return getInitilalSubSuperState().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewSubSuperStateRegion__String_int_int() {
        return getInitilalSubSuperState().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewSubSuperStateRegion__int_int_int_int() {
        return getInitilalSubSuperState().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewSubSuperStateRegion__String_int_int_int_int() {
        return getInitilalSubSuperState().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetSubSuperStateDeclarationNodes() {
        return getInitilalSubSuperState().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewSubSuperStateDeclarationNode() {
        return getInitilalSubSuperState().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewSubSuperStateDeclarationNode__int_int() {
        return getInitilalSubSuperState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewSubSuperStateDeclarationNode__String_int_int() {
        return getInitilalSubSuperState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewSubSuperStateDeclarationNode__int_int_int_int() {
        return getInitilalSubSuperState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewSubSuperStateDeclarationNode__String_int_int_int_int() {
        return getInitilalSubSuperState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetOutgoing() {
        return getInitilalSubSuperState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetSuccessors() {
        return getInitilalSubSuperState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetIncoming() {
        return getInitilalSubSuperState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetPredecessors() {
        return getInitilalSubSuperState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__S_moveTo__ModelElementContainer_int_int() {
        return getInitilalSubSuperState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__PreMove__ModelElementContainer_int_int() {
        return getInitilalSubSuperState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getInitilalSubSuperState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__PreResize__int_int_int_int_Direction() {
        return getInitilalSubSuperState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__PostResize__int_int_int_int_Direction() {
        return getInitilalSubSuperState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetOutgoingDefferedTransitions() {
        return getInitilalSubSuperState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetOutgoingStrongAbortTransitions() {
        return getInitilalSubSuperState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetOutgoingTransitions() {
        return getInitilalSubSuperState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetOutgoingImmediateTransitions() {
        return getInitilalSubSuperState().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetOutgoingWeakAbortTerminationTransitions() {
        return getInitilalSubSuperState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetOutgoingImmediateTerminationTransitions() {
        return getInitilalSubSuperState().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetOutgoingWeakAbortTransitions() {
        return getInitilalSubSuperState().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetIncomingDefferedTransitions() {
        return getInitilalSubSuperState().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetIncomingStrongAbortTransitions() {
        return getInitilalSubSuperState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetIncomingTransitions() {
        return getInitilalSubSuperState().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetIncomingImmediateTransitions() {
        return getInitilalSubSuperState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetIncomingWeakAbortTerminationTransitions() {
        return getInitilalSubSuperState().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetIncomingImmediateTerminationTransitions() {
        return getInitilalSubSuperState().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetIncomingWeakAbortTransitions() {
        return getInitilalSubSuperState().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetRootStatePredecessors() {
        return getInitilalSubSuperState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetSubSuperStatePredecessors() {
        return getInitilalSubSuperState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetInitilalSubSuperStatePredecessors() {
        return getInitilalSubSuperState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetSimpleStatePredecessors() {
        return getInitilalSubSuperState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetInitialStatePredecessors() {
        return getInitilalSubSuperState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetFinalStatePredecessors() {
        return getInitilalSubSuperState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetConnectorPredecessors() {
        return getInitilalSubSuperState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetSubSuperStateSuccessors() {
        return getInitilalSubSuperState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetInitilalSubSuperStateSuccessors() {
        return getInitilalSubSuperState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetSimpleStateSuccessors() {
        return getInitilalSubSuperState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetInitialStateSuccessors() {
        return getInitilalSubSuperState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetFinalStateSuccessors() {
        return getInitilalSubSuperState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetConnectorSuccessors() {
        return getInitilalSubSuperState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewDefferedTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__InitilalSubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewDefferedTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__SubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewDefferedTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__Connector_String() {
        return getInitilalSubSuperState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewDefferedTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__InitialState_String() {
        return getInitilalSubSuperState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewDefferedTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__SimpleState_String() {
        return getInitilalSubSuperState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewDefferedTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewDefferedTransition__FinalState_String() {
        return getInitilalSubSuperState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewStrongAbortTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__InitilalSubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewStrongAbortTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__SubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewStrongAbortTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__Connector_String() {
        return getInitilalSubSuperState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewStrongAbortTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__InitialState_String() {
        return getInitilalSubSuperState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewStrongAbortTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__SimpleState_String() {
        return getInitilalSubSuperState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewStrongAbortTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewStrongAbortTransition__FinalState_String() {
        return getInitilalSubSuperState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__InitilalSubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__SubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__Connector_String() {
        return getInitilalSubSuperState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__InitialState_String() {
        return getInitilalSubSuperState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__SimpleState_String() {
        return getInitilalSubSuperState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewTransition__FinalState_String() {
        return getInitilalSubSuperState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__InitilalSubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__SubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__Connector_String() {
        return getInitilalSubSuperState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__InitialState_String() {
        return getInitilalSubSuperState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__SimpleState_String() {
        return getInitilalSubSuperState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTransition__FinalState_String() {
        return getInitilalSubSuperState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__InitilalSubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTerminationTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__SubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTerminationTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__Connector_String() {
        return getInitilalSubSuperState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getInitilalSubSuperState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getInitilalSubSuperState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getInitilalSubSuperState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTerminationTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__InitilalSubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTerminationTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__SubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTerminationTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__Connector_String() {
        return getInitilalSubSuperState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTerminationTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__InitialState_String() {
        return getInitilalSubSuperState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTerminationTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__SimpleState_String() {
        return getInitilalSubSuperState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewImmediateTerminationTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewImmediateTerminationTransition__FinalState_String() {
        return getInitilalSubSuperState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__InitilalSubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__InitilalSubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__SubSuperState() {
        return getInitilalSubSuperState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__SubSuperState_String() {
        return getInitilalSubSuperState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__Connector() {
        return getInitilalSubSuperState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__Connector_String() {
        return getInitilalSubSuperState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__InitialState() {
        return getInitilalSubSuperState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__InitialState_String() {
        return getInitilalSubSuperState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__SimpleState() {
        return getInitilalSubSuperState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__SimpleState_String() {
        return getInitilalSubSuperState().getEOperations().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanNewWeakAbortTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__FinalState() {
        return getInitilalSubSuperState().getEOperations().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__NewWeakAbortTransition__FinalState_String() {
        return getInitilalSubSuperState().getEOperations().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanMoveTo__SuperStateRegion_int_int() {
        return getInitilalSubSuperState().getEOperations().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__MoveTo__SuperStateRegion_int_int() {
        return getInitilalSubSuperState().getEOperations().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__S_moveTo__SuperStateRegion_int_int() {
        return getInitilalSubSuperState().getEOperations().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__CanMoveTo__SubSuperStateRegion_int_int() {
        return getInitilalSubSuperState().getEOperations().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__MoveTo__SubSuperStateRegion_int_int() {
        return getInitilalSubSuperState().getEOperations().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__S_moveTo__SubSuperStateRegion_int_int() {
        return getInitilalSubSuperState().getEOperations().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitilalSubSuperState__GetInitilalSubSuperStateView() {
        return getInitilalSubSuperState().getEOperations().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSuperStateRegion() {
		if (subSuperStateRegionEClass == null) {
			subSuperStateRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(4);
		}
		return subSuperStateRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetRegionID() {
        return getSubSuperStateRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__SetRegionID__String() {
        return getSubSuperStateRegion().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetInternalSubSuperStateRegion() {
        return getSubSuperStateRegion().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__IsExactlySubSuperStateRegion() {
        return getSubSuperStateRegion().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__PreDelete() {
        return getSubSuperStateRegion().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetPostDeleteFunction() {
        return getSubSuperStateRegion().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetPostDeleteEvent() {
        return getSubSuperStateRegion().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__PreSave() {
        return getSubSuperStateRegion().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__PostSave() {
        return getSubSuperStateRegion().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetRootElement() {
        return getSubSuperStateRegion().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetNodes() {
        return getSubSuperStateRegion().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetInitilalSubSuperStates() {
        return getSubSuperStateRegion().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewInitilalSubSuperState() {
        return getSubSuperStateRegion().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewInitilalSubSuperState__int_int() {
        return getSubSuperStateRegion().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewInitilalSubSuperState__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewInitilalSubSuperState__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewInitilalSubSuperState__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetSubSuperStates() {
        return getSubSuperStateRegion().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewSubSuperState() {
        return getSubSuperStateRegion().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperState__int_int() {
        return getSubSuperStateRegion().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperState__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperState__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperState__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetSuperStateRegions() {
        return getSubSuperStateRegion().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewSuperStateRegion() {
        return getSubSuperStateRegion().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSuperStateRegion__int_int() {
        return getSubSuperStateRegion().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSuperStateRegion__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSuperStateRegion__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSuperStateRegion__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetRootStates() {
        return getSubSuperStateRegion().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewRootState() {
        return getSubSuperStateRegion().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewRootState__int_int() {
        return getSubSuperStateRegion().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewRootState__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewRootState__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewRootState__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetConnectors() {
        return getSubSuperStateRegion().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewConnector() {
        return getSubSuperStateRegion().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewConnector__int_int() {
        return getSubSuperStateRegion().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewConnector__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewConnector__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewConnector__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetSubSuperStateRegions() {
        return getSubSuperStateRegion().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewSubSuperStateRegion() {
        return getSubSuperStateRegion().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperStateRegion__int_int() {
        return getSubSuperStateRegion().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperStateRegion__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperStateRegion__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperStateRegion__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetSuperStateDeclarationNodes() {
        return getSubSuperStateRegion().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewSuperStateDeclarationNode() {
        return getSubSuperStateRegion().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSuperStateDeclarationNode__int_int() {
        return getSubSuperStateRegion().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSuperStateDeclarationNode__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSuperStateDeclarationNode__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSuperStateDeclarationNode__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetInitialStates() {
        return getSubSuperStateRegion().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewInitialState() {
        return getSubSuperStateRegion().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewInitialState__int_int() {
        return getSubSuperStateRegion().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewInitialState__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewInitialState__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewInitialState__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetSubSuperStateDeclarationNodes() {
        return getSubSuperStateRegion().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewSubSuperStateDeclarationNode() {
        return getSubSuperStateRegion().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperStateDeclarationNode__int_int() {
        return getSubSuperStateRegion().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperStateDeclarationNode__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperStateDeclarationNode__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSubSuperStateDeclarationNode__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetSimpleStates() {
        return getSubSuperStateRegion().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewSimpleState() {
        return getSubSuperStateRegion().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSimpleState__int_int() {
        return getSubSuperStateRegion().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSimpleState__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSimpleState__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewSimpleState__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetFinalStates() {
        return getSubSuperStateRegion().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanNewFinalState() {
        return getSubSuperStateRegion().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewFinalState__int_int() {
        return getSubSuperStateRegion().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewFinalState__String_int_int() {
        return getSubSuperStateRegion().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewFinalState__int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__NewFinalState__String_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__S_moveTo__ModelElementContainer_int_int() {
        return getSubSuperStateRegion().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__PreMove__ModelElementContainer_int_int() {
        return getSubSuperStateRegion().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSubSuperStateRegion().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__PreResize__int_int_int_int_Direction() {
        return getSubSuperStateRegion().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__PostResize__int_int_int_int_Direction() {
        return getSubSuperStateRegion().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanMoveTo__SubSuperState_int_int() {
        return getSubSuperStateRegion().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__MoveTo__SubSuperState_int_int() {
        return getSubSuperStateRegion().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__S_moveTo__SubSuperState_int_int() {
        return getSubSuperStateRegion().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanMoveTo__InitilalSubSuperState_int_int() {
        return getSubSuperStateRegion().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__MoveTo__InitilalSubSuperState_int_int() {
        return getSubSuperStateRegion().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__S_moveTo__InitilalSubSuperState_int_int() {
        return getSubSuperStateRegion().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__CanMoveTo__SubSuperStateRegion_int_int() {
        return getSubSuperStateRegion().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__MoveTo__SubSuperStateRegion_int_int() {
        return getSubSuperStateRegion().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__S_moveTo__SubSuperStateRegion_int_int() {
        return getSubSuperStateRegion().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateRegion__GetSubSuperStateRegionView() {
        return getSubSuperStateRegion().getEOperations().get(91);
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
	public EOperation getSuperStateDeclarationNode__GetInputOutput() {
        return getSuperStateDeclarationNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__SetInputOutput__String() {
        return getSuperStateDeclarationNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetName() {
        return getSuperStateDeclarationNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__SetName__String() {
        return getSuperStateDeclarationNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetInternalSuperStateDeclarationNode() {
        return getSuperStateDeclarationNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__IsExactlySuperStateDeclarationNode() {
        return getSuperStateDeclarationNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PreDelete() {
        return getSuperStateDeclarationNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetPostDeleteFunction() {
        return getSuperStateDeclarationNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetPostDeleteEvent() {
        return getSuperStateDeclarationNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PreSave() {
        return getSuperStateDeclarationNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PostSave() {
        return getSuperStateDeclarationNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetRootElement() {
        return getSuperStateDeclarationNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__S_moveTo__ModelElementContainer_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PreMove__ModelElementContainer_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PreResize__int_int_int_int_Direction() {
        return getSuperStateDeclarationNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__PostResize__int_int_int_int_Direction() {
        return getSuperStateDeclarationNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__CanMoveTo__RootState_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__MoveTo__RootState_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__S_moveTo__RootState_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__CanMoveTo__SubSuperStateRegion_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__MoveTo__SubSuperStateRegion_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__S_moveTo__SubSuperStateRegion_int_int() {
        return getSuperStateDeclarationNode().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclarationNode__GetSuperStateDeclarationNodeView() {
        return getSuperStateDeclarationNode().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSuperStateDeclarationNode() {
		if (subSuperStateDeclarationNodeEClass == null) {
			subSuperStateDeclarationNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(6);
		}
		return subSuperStateDeclarationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__GetDeclarationType() {
        return getSubSuperStateDeclarationNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__SetDeclarationType__String() {
        return getSubSuperStateDeclarationNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__GetName() {
        return getSubSuperStateDeclarationNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__SetName__String() {
        return getSubSuperStateDeclarationNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__GetInternalSubSuperStateDeclarationNode() {
        return getSubSuperStateDeclarationNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__IsExactlySubSuperStateDeclarationNode() {
        return getSubSuperStateDeclarationNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__PreDelete() {
        return getSubSuperStateDeclarationNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__GetPostDeleteFunction() {
        return getSubSuperStateDeclarationNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__GetPostDeleteEvent() {
        return getSubSuperStateDeclarationNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__PreSave() {
        return getSubSuperStateDeclarationNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__PostSave() {
        return getSubSuperStateDeclarationNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__GetRootElement() {
        return getSubSuperStateDeclarationNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__S_moveTo__ModelElementContainer_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__PreMove__ModelElementContainer_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__PreResize__int_int_int_int_Direction() {
        return getSubSuperStateDeclarationNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__PostResize__int_int_int_int_Direction() {
        return getSubSuperStateDeclarationNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__CanMoveTo__SubSuperState_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__MoveTo__SubSuperState_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__S_moveTo__SubSuperState_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__CanMoveTo__InitilalSubSuperState_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__MoveTo__InitilalSubSuperState_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__S_moveTo__InitilalSubSuperState_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__CanMoveTo__SubSuperStateRegion_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__MoveTo__SubSuperStateRegion_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__S_moveTo__SubSuperStateRegion_int_int() {
        return getSubSuperStateDeclarationNode().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclarationNode__GetSubSuperStateDeclarationNodeView() {
        return getSubSuperStateDeclarationNode().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleState() {
		if (simpleStateEClass == null) {
			simpleStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(7);
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
	public EOperation getSimpleState__GetOutgoingDefferedTransitions() {
        return getSimpleState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingStrongAbortTransitions() {
        return getSimpleState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingTransitions() {
        return getSimpleState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingImmediateTransitions() {
        return getSimpleState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingWeakAbortTerminationTransitions() {
        return getSimpleState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingImmediateTerminationTransitions() {
        return getSimpleState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetOutgoingWeakAbortTransitions() {
        return getSimpleState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingDefferedTransitions() {
        return getSimpleState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingStrongAbortTransitions() {
        return getSimpleState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingTransitions() {
        return getSimpleState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingImmediateTransitions() {
        return getSimpleState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingWeakAbortTerminationTransitions() {
        return getSimpleState().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingImmediateTerminationTransitions() {
        return getSimpleState().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetIncomingWeakAbortTransitions() {
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
	public EOperation getSimpleState__GetSubSuperStatePredecessors() {
        return getSimpleState().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitilalSubSuperStatePredecessors() {
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
	public EOperation getSimpleState__GetSubSuperStateSuccessors() {
        return getSimpleState().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetInitilalSubSuperStateSuccessors() {
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
	public EOperation getSimpleState__CanNewDefferedTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__InitilalSubSuperState_String() {
        return getSimpleState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__SubSuperState_String() {
        return getSimpleState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__Connector() {
        return getSimpleState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__Connector() {
        return getSimpleState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__Connector_String() {
        return getSimpleState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__InitialState() {
        return getSimpleState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__InitialState() {
        return getSimpleState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__SimpleState() {
        return getSimpleState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__SimpleState() {
        return getSimpleState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewDefferedTransition__FinalState() {
        return getSimpleState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__FinalState() {
        return getSimpleState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewDefferedTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__InitilalSubSuperState_String() {
        return getSimpleState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__SubSuperState_String() {
        return getSimpleState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__Connector() {
        return getSimpleState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__Connector() {
        return getSimpleState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__Connector_String() {
        return getSimpleState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__InitialState() {
        return getSimpleState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__InitialState() {
        return getSimpleState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__SimpleState() {
        return getSimpleState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__SimpleState() {
        return getSimpleState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewStrongAbortTransition__FinalState() {
        return getSimpleState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__FinalState() {
        return getSimpleState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewStrongAbortTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitilalSubSuperState_String() {
        return getSimpleState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SubSuperState_String() {
        return getSimpleState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__Connector() {
        return getSimpleState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__Connector() {
        return getSimpleState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__Connector_String() {
        return getSimpleState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__InitialState() {
        return getSimpleState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitialState() {
        return getSimpleState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__SimpleState() {
        return getSimpleState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SimpleState() {
        return getSimpleState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewTransition__FinalState() {
        return getSimpleState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__FinalState() {
        return getSimpleState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitilalSubSuperState_String() {
        return getSimpleState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SubSuperState_String() {
        return getSimpleState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__Connector() {
        return getSimpleState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__Connector() {
        return getSimpleState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__Connector_String() {
        return getSimpleState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__InitialState() {
        return getSimpleState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitialState() {
        return getSimpleState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__SimpleState() {
        return getSimpleState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SimpleState() {
        return getSimpleState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTransition__FinalState() {
        return getSimpleState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__FinalState() {
        return getSimpleState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__InitilalSubSuperState_String() {
        return getSimpleState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__SubSuperState_String() {
        return getSimpleState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__Connector() {
        return getSimpleState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__Connector() {
        return getSimpleState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__Connector_String() {
        return getSimpleState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getSimpleState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__InitialState() {
        return getSimpleState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getSimpleState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__SimpleState() {
        return getSimpleState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getSimpleState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__FinalState() {
        return getSimpleState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__InitilalSubSuperState_String() {
        return getSimpleState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__SubSuperState_String() {
        return getSimpleState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__Connector() {
        return getSimpleState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__Connector() {
        return getSimpleState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__Connector_String() {
        return getSimpleState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__InitialState() {
        return getSimpleState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__InitialState() {
        return getSimpleState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__SimpleState() {
        return getSimpleState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__SimpleState() {
        return getSimpleState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewImmediateTerminationTransition__FinalState() {
        return getSimpleState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__FinalState() {
        return getSimpleState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewImmediateTerminationTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__InitilalSubSuperState() {
        return getSimpleState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__InitilalSubSuperState_String() {
        return getSimpleState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__SubSuperState() {
        return getSimpleState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__SubSuperState_String() {
        return getSimpleState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__Connector() {
        return getSimpleState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__Connector() {
        return getSimpleState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__Connector_String() {
        return getSimpleState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__InitialState() {
        return getSimpleState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__InitialState() {
        return getSimpleState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__InitialState_String() {
        return getSimpleState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__SimpleState() {
        return getSimpleState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__SimpleState() {
        return getSimpleState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__SimpleState_String() {
        return getSimpleState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanNewWeakAbortTransition__FinalState() {
        return getSimpleState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__FinalState() {
        return getSimpleState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__NewWeakAbortTransition__FinalState_String() {
        return getSimpleState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanMoveTo__SuperStateRegion_int_int() {
        return getSimpleState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__MoveTo__SuperStateRegion_int_int() {
        return getSimpleState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__SuperStateRegion_int_int() {
        return getSimpleState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__CanMoveTo__SubSuperStateRegion_int_int() {
        return getSimpleState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__MoveTo__SubSuperStateRegion_int_int() {
        return getSimpleState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__S_moveTo__SubSuperStateRegion_int_int() {
        return getSimpleState().getEOperations().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSimpleState__GetSimpleStateView() {
        return getSimpleState().getEOperations().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialState() {
		if (initialStateEClass == null) {
			initialStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(8);
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
	public EOperation getInitialState__GetOutgoingDefferedTransitions() {
        return getInitialState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingStrongAbortTransitions() {
        return getInitialState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingTransitions() {
        return getInitialState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingImmediateTransitions() {
        return getInitialState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingWeakAbortTerminationTransitions() {
        return getInitialState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingImmediateTerminationTransitions() {
        return getInitialState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetOutgoingWeakAbortTransitions() {
        return getInitialState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingDefferedTransitions() {
        return getInitialState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingStrongAbortTransitions() {
        return getInitialState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingTransitions() {
        return getInitialState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingImmediateTransitions() {
        return getInitialState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingWeakAbortTerminationTransitions() {
        return getInitialState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingImmediateTerminationTransitions() {
        return getInitialState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetIncomingWeakAbortTransitions() {
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
	public EOperation getInitialState__GetSubSuperStatePredecessors() {
        return getInitialState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitilalSubSuperStatePredecessors() {
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
	public EOperation getInitialState__GetSubSuperStateSuccessors() {
        return getInitialState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitilalSubSuperStateSuccessors() {
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
	public EOperation getInitialState__CanNewDefferedTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__InitilalSubSuperState_String() {
        return getInitialState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__SubSuperState() {
        return getInitialState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__SubSuperState() {
        return getInitialState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__SubSuperState_String() {
        return getInitialState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__Connector() {
        return getInitialState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__Connector() {
        return getInitialState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__Connector_String() {
        return getInitialState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__InitialState() {
        return getInitialState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__InitialState() {
        return getInitialState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__InitialState_String() {
        return getInitialState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__SimpleState() {
        return getInitialState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__SimpleState() {
        return getInitialState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewDefferedTransition__FinalState() {
        return getInitialState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__FinalState() {
        return getInitialState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewDefferedTransition__FinalState_String() {
        return getInitialState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__InitilalSubSuperState_String() {
        return getInitialState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__SubSuperState() {
        return getInitialState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__SubSuperState() {
        return getInitialState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__SubSuperState_String() {
        return getInitialState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__Connector() {
        return getInitialState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__Connector() {
        return getInitialState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__Connector_String() {
        return getInitialState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__InitialState() {
        return getInitialState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__InitialState() {
        return getInitialState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__InitialState_String() {
        return getInitialState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__SimpleState() {
        return getInitialState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__SimpleState() {
        return getInitialState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewStrongAbortTransition__FinalState() {
        return getInitialState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__FinalState() {
        return getInitialState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewStrongAbortTransition__FinalState_String() {
        return getInitialState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitilalSubSuperState_String() {
        return getInitialState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__SubSuperState() {
        return getInitialState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SubSuperState() {
        return getInitialState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SubSuperState_String() {
        return getInitialState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__Connector() {
        return getInitialState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__Connector() {
        return getInitialState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__Connector_String() {
        return getInitialState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__InitialState() {
        return getInitialState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitialState() {
        return getInitialState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__InitialState_String() {
        return getInitialState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__SimpleState() {
        return getInitialState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SimpleState() {
        return getInitialState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewTransition__FinalState() {
        return getInitialState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__FinalState() {
        return getInitialState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewTransition__FinalState_String() {
        return getInitialState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitilalSubSuperState_String() {
        return getInitialState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__SubSuperState() {
        return getInitialState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SubSuperState() {
        return getInitialState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SubSuperState_String() {
        return getInitialState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__Connector() {
        return getInitialState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__Connector() {
        return getInitialState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__Connector_String() {
        return getInitialState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__InitialState() {
        return getInitialState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitialState() {
        return getInitialState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__InitialState_String() {
        return getInitialState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__SimpleState() {
        return getInitialState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SimpleState() {
        return getInitialState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTransition__FinalState() {
        return getInitialState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__FinalState() {
        return getInitialState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTransition__FinalState_String() {
        return getInitialState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__InitilalSubSuperState_String() {
        return getInitialState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__SubSuperState() {
        return getInitialState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__SubSuperState() {
        return getInitialState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__SubSuperState_String() {
        return getInitialState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__Connector() {
        return getInitialState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__Connector() {
        return getInitialState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__Connector_String() {
        return getInitialState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getInitialState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__InitialState() {
        return getInitialState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getInitialState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getInitialState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__SimpleState() {
        return getInitialState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getInitialState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__FinalState() {
        return getInitialState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getInitialState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__InitilalSubSuperState_String() {
        return getInitialState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__SubSuperState() {
        return getInitialState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__SubSuperState() {
        return getInitialState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__SubSuperState_String() {
        return getInitialState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__Connector() {
        return getInitialState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__Connector() {
        return getInitialState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__Connector_String() {
        return getInitialState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__InitialState() {
        return getInitialState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__InitialState() {
        return getInitialState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__InitialState_String() {
        return getInitialState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__SimpleState() {
        return getInitialState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__SimpleState() {
        return getInitialState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewImmediateTerminationTransition__FinalState() {
        return getInitialState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__FinalState() {
        return getInitialState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewImmediateTerminationTransition__FinalState_String() {
        return getInitialState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__InitilalSubSuperState() {
        return getInitialState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__InitilalSubSuperState_String() {
        return getInitialState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__SubSuperState() {
        return getInitialState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__SubSuperState() {
        return getInitialState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__SubSuperState_String() {
        return getInitialState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__Connector() {
        return getInitialState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__Connector() {
        return getInitialState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__Connector_String() {
        return getInitialState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__InitialState() {
        return getInitialState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__InitialState() {
        return getInitialState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__InitialState_String() {
        return getInitialState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__SimpleState() {
        return getInitialState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__SimpleState() {
        return getInitialState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__SimpleState_String() {
        return getInitialState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanNewWeakAbortTransition__FinalState() {
        return getInitialState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__FinalState() {
        return getInitialState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__NewWeakAbortTransition__FinalState_String() {
        return getInitialState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanMoveTo__SuperStateRegion_int_int() {
        return getInitialState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__MoveTo__SuperStateRegion_int_int() {
        return getInitialState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__SuperStateRegion_int_int() {
        return getInitialState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__CanMoveTo__SubSuperStateRegion_int_int() {
        return getInitialState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__MoveTo__SubSuperStateRegion_int_int() {
        return getInitialState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__S_moveTo__SubSuperStateRegion_int_int() {
        return getInitialState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitialState__GetInitialStateView() {
        return getInitialState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalState() {
		if (finalStateEClass == null) {
			finalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(9);
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
	public EOperation getFinalState__GetOutgoingDefferedTransitions() {
        return getFinalState().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingStrongAbortTransitions() {
        return getFinalState().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingTransitions() {
        return getFinalState().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingImmediateTransitions() {
        return getFinalState().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingWeakAbortTerminationTransitions() {
        return getFinalState().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingImmediateTerminationTransitions() {
        return getFinalState().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetOutgoingWeakAbortTransitions() {
        return getFinalState().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingDefferedTransitions() {
        return getFinalState().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingStrongAbortTransitions() {
        return getFinalState().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingTransitions() {
        return getFinalState().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingImmediateTransitions() {
        return getFinalState().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingWeakAbortTerminationTransitions() {
        return getFinalState().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingImmediateTerminationTransitions() {
        return getFinalState().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetIncomingWeakAbortTransitions() {
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
	public EOperation getFinalState__GetSubSuperStatePredecessors() {
        return getFinalState().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitilalSubSuperStatePredecessors() {
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
	public EOperation getFinalState__GetSubSuperStateSuccessors() {
        return getFinalState().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetInitilalSubSuperStateSuccessors() {
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
	public EOperation getFinalState__CanNewDefferedTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__InitilalSubSuperState_String() {
        return getFinalState().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__SubSuperState() {
        return getFinalState().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__SubSuperState() {
        return getFinalState().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__SubSuperState_String() {
        return getFinalState().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__Connector() {
        return getFinalState().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__Connector() {
        return getFinalState().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__Connector_String() {
        return getFinalState().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__InitialState() {
        return getFinalState().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__InitialState() {
        return getFinalState().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__InitialState_String() {
        return getFinalState().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__SimpleState() {
        return getFinalState().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__SimpleState() {
        return getFinalState().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewDefferedTransition__FinalState() {
        return getFinalState().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__FinalState() {
        return getFinalState().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewDefferedTransition__FinalState_String() {
        return getFinalState().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__InitilalSubSuperState_String() {
        return getFinalState().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__SubSuperState() {
        return getFinalState().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__SubSuperState() {
        return getFinalState().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__SubSuperState_String() {
        return getFinalState().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__Connector() {
        return getFinalState().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__Connector() {
        return getFinalState().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__Connector_String() {
        return getFinalState().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__InitialState() {
        return getFinalState().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__InitialState() {
        return getFinalState().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__InitialState_String() {
        return getFinalState().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__SimpleState() {
        return getFinalState().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__SimpleState() {
        return getFinalState().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewStrongAbortTransition__FinalState() {
        return getFinalState().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__FinalState() {
        return getFinalState().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewStrongAbortTransition__FinalState_String() {
        return getFinalState().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitilalSubSuperState_String() {
        return getFinalState().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__SubSuperState() {
        return getFinalState().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SubSuperState() {
        return getFinalState().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SubSuperState_String() {
        return getFinalState().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__Connector() {
        return getFinalState().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__Connector() {
        return getFinalState().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__Connector_String() {
        return getFinalState().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__InitialState() {
        return getFinalState().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitialState() {
        return getFinalState().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__InitialState_String() {
        return getFinalState().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__SimpleState() {
        return getFinalState().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SimpleState() {
        return getFinalState().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewTransition__FinalState() {
        return getFinalState().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__FinalState() {
        return getFinalState().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewTransition__FinalState_String() {
        return getFinalState().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitilalSubSuperState_String() {
        return getFinalState().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__SubSuperState() {
        return getFinalState().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SubSuperState() {
        return getFinalState().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SubSuperState_String() {
        return getFinalState().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__Connector() {
        return getFinalState().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__Connector() {
        return getFinalState().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__Connector_String() {
        return getFinalState().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__InitialState() {
        return getFinalState().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitialState() {
        return getFinalState().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__InitialState_String() {
        return getFinalState().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__SimpleState() {
        return getFinalState().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SimpleState() {
        return getFinalState().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTransition__FinalState() {
        return getFinalState().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__FinalState() {
        return getFinalState().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTransition__FinalState_String() {
        return getFinalState().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__InitilalSubSuperState_String() {
        return getFinalState().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__SubSuperState() {
        return getFinalState().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__SubSuperState() {
        return getFinalState().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__SubSuperState_String() {
        return getFinalState().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__Connector() {
        return getFinalState().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__Connector() {
        return getFinalState().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__Connector_String() {
        return getFinalState().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__InitialState() {
        return getFinalState().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__InitialState() {
        return getFinalState().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__InitialState_String() {
        return getFinalState().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getFinalState().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__SimpleState() {
        return getFinalState().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTerminationTransition__FinalState() {
        return getFinalState().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__FinalState() {
        return getFinalState().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTerminationTransition__FinalState_String() {
        return getFinalState().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__InitilalSubSuperState_String() {
        return getFinalState().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__SubSuperState() {
        return getFinalState().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__SubSuperState() {
        return getFinalState().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__SubSuperState_String() {
        return getFinalState().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__Connector() {
        return getFinalState().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__Connector() {
        return getFinalState().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__Connector_String() {
        return getFinalState().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__InitialState() {
        return getFinalState().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__InitialState() {
        return getFinalState().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__InitialState_String() {
        return getFinalState().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__SimpleState() {
        return getFinalState().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__SimpleState() {
        return getFinalState().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewImmediateTerminationTransition__FinalState() {
        return getFinalState().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__FinalState() {
        return getFinalState().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewImmediateTerminationTransition__FinalState_String() {
        return getFinalState().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__InitilalSubSuperState() {
        return getFinalState().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__InitilalSubSuperState_String() {
        return getFinalState().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__SubSuperState() {
        return getFinalState().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__SubSuperState() {
        return getFinalState().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__SubSuperState_String() {
        return getFinalState().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__Connector() {
        return getFinalState().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__Connector() {
        return getFinalState().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__Connector_String() {
        return getFinalState().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__InitialState() {
        return getFinalState().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__InitialState() {
        return getFinalState().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__InitialState_String() {
        return getFinalState().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__SimpleState() {
        return getFinalState().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__SimpleState() {
        return getFinalState().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__SimpleState_String() {
        return getFinalState().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanNewWeakAbortTransition__FinalState() {
        return getFinalState().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__FinalState() {
        return getFinalState().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__NewWeakAbortTransition__FinalState_String() {
        return getFinalState().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanMoveTo__SuperStateRegion_int_int() {
        return getFinalState().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__MoveTo__SuperStateRegion_int_int() {
        return getFinalState().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__SuperStateRegion_int_int() {
        return getFinalState().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__CanMoveTo__SubSuperStateRegion_int_int() {
        return getFinalState().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__MoveTo__SubSuperStateRegion_int_int() {
        return getFinalState().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__S_moveTo__SubSuperStateRegion_int_int() {
        return getFinalState().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFinalState__GetFinalStateView() {
        return getFinalState().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		if (connectorEClass == null) {
			connectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(10);
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
	public EOperation getConnector__GetOutgoingDefferedTransitions() {
        return getConnector().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingStrongAbortTransitions() {
        return getConnector().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingTransitions() {
        return getConnector().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingImmediateTransitions() {
        return getConnector().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingWeakAbortTerminationTransitions() {
        return getConnector().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingImmediateTerminationTransitions() {
        return getConnector().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetOutgoingWeakAbortTransitions() {
        return getConnector().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingDefferedTransitions() {
        return getConnector().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingStrongAbortTransitions() {
        return getConnector().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingTransitions() {
        return getConnector().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingImmediateTransitions() {
        return getConnector().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingWeakAbortTerminationTransitions() {
        return getConnector().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingImmediateTerminationTransitions() {
        return getConnector().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetIncomingWeakAbortTransitions() {
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
	public EOperation getConnector__GetSubSuperStatePredecessors() {
        return getConnector().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitilalSubSuperStatePredecessors() {
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
	public EOperation getConnector__GetSubSuperStateSuccessors() {
        return getConnector().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetInitilalSubSuperStateSuccessors() {
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
	public EOperation getConnector__CanNewDefferedTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__InitilalSubSuperState_String() {
        return getConnector().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__SubSuperState() {
        return getConnector().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__SubSuperState() {
        return getConnector().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__SubSuperState_String() {
        return getConnector().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__Connector() {
        return getConnector().getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__Connector() {
        return getConnector().getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__Connector_String() {
        return getConnector().getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__InitialState() {
        return getConnector().getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__InitialState() {
        return getConnector().getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__InitialState_String() {
        return getConnector().getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__SimpleState() {
        return getConnector().getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__SimpleState() {
        return getConnector().getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__SimpleState_String() {
        return getConnector().getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewDefferedTransition__FinalState() {
        return getConnector().getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__FinalState() {
        return getConnector().getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewDefferedTransition__FinalState_String() {
        return getConnector().getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__InitilalSubSuperState_String() {
        return getConnector().getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__SubSuperState() {
        return getConnector().getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__SubSuperState() {
        return getConnector().getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__SubSuperState_String() {
        return getConnector().getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__Connector() {
        return getConnector().getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__Connector() {
        return getConnector().getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__Connector_String() {
        return getConnector().getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__InitialState() {
        return getConnector().getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__InitialState() {
        return getConnector().getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__InitialState_String() {
        return getConnector().getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__SimpleState() {
        return getConnector().getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__SimpleState() {
        return getConnector().getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__SimpleState_String() {
        return getConnector().getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewStrongAbortTransition__FinalState() {
        return getConnector().getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__FinalState() {
        return getConnector().getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewStrongAbortTransition__FinalState_String() {
        return getConnector().getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitilalSubSuperState_String() {
        return getConnector().getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__SubSuperState() {
        return getConnector().getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SubSuperState() {
        return getConnector().getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SubSuperState_String() {
        return getConnector().getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__Connector() {
        return getConnector().getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__Connector() {
        return getConnector().getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__Connector_String() {
        return getConnector().getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__InitialState() {
        return getConnector().getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitialState() {
        return getConnector().getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__InitialState_String() {
        return getConnector().getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__SimpleState() {
        return getConnector().getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SimpleState() {
        return getConnector().getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__SimpleState_String() {
        return getConnector().getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewTransition__FinalState() {
        return getConnector().getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__FinalState() {
        return getConnector().getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewTransition__FinalState_String() {
        return getConnector().getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitilalSubSuperState_String() {
        return getConnector().getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__SubSuperState() {
        return getConnector().getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SubSuperState() {
        return getConnector().getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SubSuperState_String() {
        return getConnector().getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__Connector() {
        return getConnector().getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__Connector() {
        return getConnector().getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__Connector_String() {
        return getConnector().getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__InitialState() {
        return getConnector().getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitialState() {
        return getConnector().getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__InitialState_String() {
        return getConnector().getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__SimpleState() {
        return getConnector().getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SimpleState() {
        return getConnector().getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__SimpleState_String() {
        return getConnector().getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTransition__FinalState() {
        return getConnector().getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__FinalState() {
        return getConnector().getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTransition__FinalState_String() {
        return getConnector().getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__InitilalSubSuperState_String() {
        return getConnector().getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__SubSuperState() {
        return getConnector().getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__SubSuperState() {
        return getConnector().getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__SubSuperState_String() {
        return getConnector().getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__Connector() {
        return getConnector().getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__Connector() {
        return getConnector().getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__Connector_String() {
        return getConnector().getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__InitialState() {
        return getConnector().getEOperations().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__InitialState() {
        return getConnector().getEOperations().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__InitialState_String() {
        return getConnector().getEOperations().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__SimpleState() {
        return getConnector().getEOperations().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__SimpleState() {
        return getConnector().getEOperations().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__SimpleState_String() {
        return getConnector().getEOperations().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTerminationTransition__FinalState() {
        return getConnector().getEOperations().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__FinalState() {
        return getConnector().getEOperations().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTerminationTransition__FinalState_String() {
        return getConnector().getEOperations().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__InitilalSubSuperState_String() {
        return getConnector().getEOperations().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__SubSuperState() {
        return getConnector().getEOperations().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__SubSuperState() {
        return getConnector().getEOperations().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__SubSuperState_String() {
        return getConnector().getEOperations().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__Connector() {
        return getConnector().getEOperations().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__Connector() {
        return getConnector().getEOperations().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__Connector_String() {
        return getConnector().getEOperations().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__InitialState() {
        return getConnector().getEOperations().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__InitialState() {
        return getConnector().getEOperations().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__InitialState_String() {
        return getConnector().getEOperations().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__SimpleState() {
        return getConnector().getEOperations().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__SimpleState() {
        return getConnector().getEOperations().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__SimpleState_String() {
        return getConnector().getEOperations().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewImmediateTerminationTransition__FinalState() {
        return getConnector().getEOperations().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__FinalState() {
        return getConnector().getEOperations().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewImmediateTerminationTransition__FinalState_String() {
        return getConnector().getEOperations().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__InitilalSubSuperState() {
        return getConnector().getEOperations().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__InitilalSubSuperState_String() {
        return getConnector().getEOperations().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__SubSuperState() {
        return getConnector().getEOperations().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__SubSuperState() {
        return getConnector().getEOperations().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__SubSuperState_String() {
        return getConnector().getEOperations().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__Connector() {
        return getConnector().getEOperations().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__Connector() {
        return getConnector().getEOperations().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__Connector_String() {
        return getConnector().getEOperations().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__InitialState() {
        return getConnector().getEOperations().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__InitialState() {
        return getConnector().getEOperations().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__InitialState_String() {
        return getConnector().getEOperations().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__SimpleState() {
        return getConnector().getEOperations().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__SimpleState() {
        return getConnector().getEOperations().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__SimpleState_String() {
        return getConnector().getEOperations().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanNewWeakAbortTransition__FinalState() {
        return getConnector().getEOperations().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__FinalState() {
        return getConnector().getEOperations().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__NewWeakAbortTransition__FinalState_String() {
        return getConnector().getEOperations().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanMoveTo__SuperStateRegion_int_int() {
        return getConnector().getEOperations().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__MoveTo__SuperStateRegion_int_int() {
        return getConnector().getEOperations().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__SuperStateRegion_int_int() {
        return getConnector().getEOperations().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__CanMoveTo__SubSuperStateRegion_int_int() {
        return getConnector().getEOperations().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__MoveTo__SubSuperStateRegion_int_int() {
        return getConnector().getEOperations().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__S_moveTo__SubSuperStateRegion_int_int() {
        return getConnector().getEOperations().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__GetConnectorView() {
        return getConnector().getEOperations().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		if (transitionEClass == null) {
			transitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(11);
		}
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__IsHistory() {
        return getTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__SetHistory__boolean() {
        return getTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetInternalTransition() {
        return getTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__IsExactlyTransition() {
        return getTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__PreDelete() {
        return getTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetPostDeleteFunction() {
        return getTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetPostDeleteEvent() {
        return getTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__PreSave() {
        return getTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__PostSave() {
        return getTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetRootElement() {
        return getTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetSourceElement() {
        return getTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetTargetElement() {
        return getTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__InitilalSubSuperState() {
        return getTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__InitilalSubSuperState() {
        return getTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__SubSuperState() {
        return getTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__SubSuperState() {
        return getTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__RootState() {
        return getTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__RootState() {
        return getTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__Connector() {
        return getTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__Connector() {
        return getTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__InitialState() {
        return getTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__InitialState() {
        return getTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__SimpleState() {
        return getTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__SimpleState() {
        return getTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectSource__FinalState() {
        return getTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectSource__FinalState() {
        return getTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__InitilalSubSuperState() {
        return getTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__InitilalSubSuperState() {
        return getTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__SubSuperState() {
        return getTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__SubSuperState() {
        return getTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__Connector() {
        return getTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__Connector() {
        return getTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__InitialState() {
        return getTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__InitialState() {
        return getTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__SimpleState() {
        return getTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__SimpleState() {
        return getTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__CanReconnectTarget__FinalState() {
        return getTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__ReconnectTarget__FinalState() {
        return getTransition().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransition__GetTransitionView() {
        return getTransition().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateTransition() {
		if (immediateTransitionEClass == null) {
			immediateTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(12);
		}
		return immediateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetDsderminat() {
        return getImmediateTransition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__SetDsderminat__int() {
        return getImmediateTransition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetLabel() {
        return getImmediateTransition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__SetLabel__String() {
        return getImmediateTransition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__IsHistory() {
        return getImmediateTransition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__SetHistory__boolean() {
        return getImmediateTransition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetPriority() {
        return getImmediateTransition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__SetPriority__int() {
        return getImmediateTransition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetInternalImmediateTransition() {
        return getImmediateTransition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__IsExactlyImmediateTransition() {
        return getImmediateTransition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__PreDelete() {
        return getImmediateTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetPostDeleteFunction() {
        return getImmediateTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetPostDeleteEvent() {
        return getImmediateTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__PreSave() {
        return getImmediateTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__PostSave() {
        return getImmediateTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetRootElement() {
        return getImmediateTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetSourceElement() {
        return getImmediateTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetTargetElement() {
        return getImmediateTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__InitilalSubSuperState() {
        return getImmediateTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__InitilalSubSuperState() {
        return getImmediateTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__SubSuperState() {
        return getImmediateTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__SubSuperState() {
        return getImmediateTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__RootState() {
        return getImmediateTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__RootState() {
        return getImmediateTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__Connector() {
        return getImmediateTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__Connector() {
        return getImmediateTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__InitialState() {
        return getImmediateTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__InitialState() {
        return getImmediateTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__SimpleState() {
        return getImmediateTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__SimpleState() {
        return getImmediateTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectSource__FinalState() {
        return getImmediateTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectSource__FinalState() {
        return getImmediateTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__InitilalSubSuperState() {
        return getImmediateTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__InitilalSubSuperState() {
        return getImmediateTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__SubSuperState() {
        return getImmediateTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__SubSuperState() {
        return getImmediateTransition().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__Connector() {
        return getImmediateTransition().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__Connector() {
        return getImmediateTransition().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__InitialState() {
        return getImmediateTransition().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__InitialState() {
        return getImmediateTransition().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__SimpleState() {
        return getImmediateTransition().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__SimpleState() {
        return getImmediateTransition().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__CanReconnectTarget__FinalState() {
        return getImmediateTransition().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__ReconnectTarget__FinalState() {
        return getImmediateTransition().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTransition__GetImmediateTransitionView() {
        return getImmediateTransition().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateTerminationTransition() {
		if (immediateTerminationTransitionEClass == null) {
			immediateTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(13);
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
	public EOperation getImmediateTerminationTransition__CanReconnectSource__InitilalSubSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__InitilalSubSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__SubSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__SubSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__RootState() {
        return getImmediateTerminationTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__RootState() {
        return getImmediateTerminationTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__Connector() {
        return getImmediateTerminationTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__Connector() {
        return getImmediateTerminationTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__InitialState() {
        return getImmediateTerminationTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__InitialState() {
        return getImmediateTerminationTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__SimpleState() {
        return getImmediateTerminationTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__SimpleState() {
        return getImmediateTerminationTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectSource__FinalState() {
        return getImmediateTerminationTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectSource__FinalState() {
        return getImmediateTerminationTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__InitilalSubSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__InitilalSubSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__SubSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__SubSuperState() {
        return getImmediateTerminationTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__Connector() {
        return getImmediateTerminationTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__Connector() {
        return getImmediateTerminationTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__InitialState() {
        return getImmediateTerminationTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__InitialState() {
        return getImmediateTerminationTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__SimpleState() {
        return getImmediateTerminationTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__SimpleState() {
        return getImmediateTerminationTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__CanReconnectTarget__FinalState() {
        return getImmediateTerminationTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImmediateTerminationTransition__ReconnectTarget__FinalState() {
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
			weakAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(14);
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
	public EOperation getWeakAbortTransition__CanReconnectSource__InitilalSubSuperState() {
        return getWeakAbortTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__InitilalSubSuperState() {
        return getWeakAbortTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__SubSuperState() {
        return getWeakAbortTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__SubSuperState() {
        return getWeakAbortTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__RootState() {
        return getWeakAbortTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__RootState() {
        return getWeakAbortTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__Connector() {
        return getWeakAbortTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__Connector() {
        return getWeakAbortTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__InitialState() {
        return getWeakAbortTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__InitialState() {
        return getWeakAbortTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__SimpleState() {
        return getWeakAbortTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__SimpleState() {
        return getWeakAbortTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectSource__FinalState() {
        return getWeakAbortTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectSource__FinalState() {
        return getWeakAbortTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__InitilalSubSuperState() {
        return getWeakAbortTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__InitilalSubSuperState() {
        return getWeakAbortTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__SubSuperState() {
        return getWeakAbortTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__SubSuperState() {
        return getWeakAbortTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__Connector() {
        return getWeakAbortTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__Connector() {
        return getWeakAbortTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__InitialState() {
        return getWeakAbortTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__InitialState() {
        return getWeakAbortTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__SimpleState() {
        return getWeakAbortTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__SimpleState() {
        return getWeakAbortTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__CanReconnectTarget__FinalState() {
        return getWeakAbortTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTransition__ReconnectTarget__FinalState() {
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
			strongAbortTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(15);
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
	public EOperation getStrongAbortTransition__CanReconnectSource__InitilalSubSuperState() {
        return getStrongAbortTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__InitilalSubSuperState() {
        return getStrongAbortTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__SubSuperState() {
        return getStrongAbortTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__SubSuperState() {
        return getStrongAbortTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__RootState() {
        return getStrongAbortTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__RootState() {
        return getStrongAbortTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__Connector() {
        return getStrongAbortTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__Connector() {
        return getStrongAbortTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__InitialState() {
        return getStrongAbortTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__InitialState() {
        return getStrongAbortTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectSource__FinalState() {
        return getStrongAbortTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectSource__FinalState() {
        return getStrongAbortTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__InitilalSubSuperState() {
        return getStrongAbortTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__InitilalSubSuperState() {
        return getStrongAbortTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__SubSuperState() {
        return getStrongAbortTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__SubSuperState() {
        return getStrongAbortTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__Connector() {
        return getStrongAbortTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__Connector() {
        return getStrongAbortTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__InitialState() {
        return getStrongAbortTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__InitialState() {
        return getStrongAbortTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__SimpleState() {
        return getStrongAbortTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__CanReconnectTarget__FinalState() {
        return getStrongAbortTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStrongAbortTransition__ReconnectTarget__FinalState() {
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
			weakAbortTerminationTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(16);
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
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__InitilalSubSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__InitilalSubSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__SubSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__SubSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__RootState() {
        return getWeakAbortTerminationTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__RootState() {
        return getWeakAbortTerminationTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__Connector() {
        return getWeakAbortTerminationTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__Connector() {
        return getWeakAbortTerminationTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__InitialState() {
        return getWeakAbortTerminationTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__InitialState() {
        return getWeakAbortTerminationTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__SimpleState() {
        return getWeakAbortTerminationTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__SimpleState() {
        return getWeakAbortTerminationTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectSource__FinalState() {
        return getWeakAbortTerminationTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectSource__FinalState() {
        return getWeakAbortTerminationTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__InitilalSubSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__InitilalSubSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__SubSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__SubSuperState() {
        return getWeakAbortTerminationTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__Connector() {
        return getWeakAbortTerminationTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__Connector() {
        return getWeakAbortTerminationTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__InitialState() {
        return getWeakAbortTerminationTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__InitialState() {
        return getWeakAbortTerminationTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__SimpleState() {
        return getWeakAbortTerminationTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__SimpleState() {
        return getWeakAbortTerminationTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__CanReconnectTarget__FinalState() {
        return getWeakAbortTerminationTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWeakAbortTerminationTransition__ReconnectTarget__FinalState() {
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
			defferedTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(17);
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
	public EOperation getDefferedTransition__CanReconnectSource__InitilalSubSuperState() {
        return getDefferedTransition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__InitilalSubSuperState() {
        return getDefferedTransition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__SubSuperState() {
        return getDefferedTransition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__SubSuperState() {
        return getDefferedTransition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__RootState() {
        return getDefferedTransition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__RootState() {
        return getDefferedTransition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__Connector() {
        return getDefferedTransition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__Connector() {
        return getDefferedTransition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__InitialState() {
        return getDefferedTransition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__InitialState() {
        return getDefferedTransition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__SimpleState() {
        return getDefferedTransition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__SimpleState() {
        return getDefferedTransition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectSource__FinalState() {
        return getDefferedTransition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectSource__FinalState() {
        return getDefferedTransition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__InitilalSubSuperState() {
        return getDefferedTransition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__InitilalSubSuperState() {
        return getDefferedTransition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__SubSuperState() {
        return getDefferedTransition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__SubSuperState() {
        return getDefferedTransition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__Connector() {
        return getDefferedTransition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__Connector() {
        return getDefferedTransition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__InitialState() {
        return getDefferedTransition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__InitialState() {
        return getDefferedTransition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__SimpleState() {
        return getDefferedTransition().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__SimpleState() {
        return getDefferedTransition().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__CanReconnectTarget__FinalState() {
        return getDefferedTransition().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefferedTransition__ReconnectTarget__FinalState() {
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
			scChartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(18);
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
	public EOperation getSuperStateDeclaration__GetInputOutput() {
        return getSuperStateDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__SetInputOutput__String() {
        return getSuperStateDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__GetName() {
        return getSuperStateDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__SetName__String() {
        return getSuperStateDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__GetInternalSuperStateDeclaration() {
        return getSuperStateDeclaration().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__IsExactlySuperStateDeclaration() {
        return getSuperStateDeclaration().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperStateDeclaration__GetSuperStateDeclarationView() {
        return getSuperStateDeclaration().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSuperStateDeclaration() {
		if (subSuperStateDeclarationEClass == null) {
			subSuperStateDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScchartPackage.eNS_URI).getEClassifiers().get(20);
		}
		return subSuperStateDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclaration__GetDeclarationType() {
        return getSubSuperStateDeclaration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclaration__SetDeclarationType__String() {
        return getSubSuperStateDeclaration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclaration__GetName() {
        return getSubSuperStateDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclaration__SetName__String() {
        return getSubSuperStateDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclaration__GetInternalSubSuperStateDeclaration() {
        return getSubSuperStateDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclaration__IsExactlySubSuperStateDeclaration() {
        return getSubSuperStateDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubSuperStateDeclaration__GetSubSuperStateDeclarationView() {
        return getSubSuperStateDeclaration().getEOperations().get(6);
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

/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.views;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/scchart/mglid/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scchart-views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateViewImpl <em>Root State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRootStateView()
	 * @generated
	 */
	int ROOT_STATE_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Internal Root State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW__INTERNAL_ROOT_STATE = 0;

	/**
	 * The number of structural features of the '<em>Root State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___GET_LABEL = 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___SET_LABEL__STRING = 1;

	/**
	 * The operation id for the '<em>Get Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___GET_DECLARATION = 2;

	/**
	 * The operation id for the '<em>Set Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___SET_DECLARATION__ELIST = 3;

	/**
	 * The operation id for the '<em>Add Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___ADD_DECLARATION__ROOTSTATEDECLARATION = 4;

	/**
	 * The operation id for the '<em>Remove Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW___REMOVE_DECLARATION__ROOTSTATEDECLARATION = 5;

	/**
	 * The number of operations of the '<em>Root State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionViewImpl <em>Region View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRegionView()
	 * @generated
	 */
	int REGION_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Internal Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW__INTERNAL_REGION = 0;

	/**
	 * The number of structural features of the '<em>Region View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___GET_LABEL = 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___SET_LABEL__STRING = 1;

	/**
	 * The operation id for the '<em>Get Region ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___GET_REGION_ID = 2;

	/**
	 * The operation id for the '<em>Set Region ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___SET_REGION_ID__STRING = 3;

	/**
	 * The operation id for the '<em>Get Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___GET_UUID = 4;

	/**
	 * The operation id for the '<em>Set Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW___SET_UUID__STRING = 5;

	/**
	 * The number of operations of the '<em>Region View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateViewImpl <em>Super State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuperStateView()
	 * @generated
	 */
	int SUPER_STATE_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Internal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW__INTERNAL_SUPER_STATE = 0;

	/**
	 * The number of structural features of the '<em>Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___GET_LABEL = 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___SET_LABEL__STRING = 1;

	/**
	 * The operation id for the '<em>Get Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___GET_DECLARATION = 2;

	/**
	 * The operation id for the '<em>Set Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___SET_DECLARATION__ELIST = 3;

	/**
	 * The operation id for the '<em>Add Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___ADD_DECLARATION__SUPERSTATEDECLARATION = 4;

	/**
	 * The operation id for the '<em>Remove Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW___REMOVE_DECLARATION__SUPERSTATEDECLARATION = 5;

	/**
	 * The number of operations of the '<em>Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitilalSuperStateViewImpl <em>Initilal Super State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitilalSuperStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitilalSuperStateView()
	 * @generated
	 */
	int INITILAL_SUPER_STATE_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Internal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW__INTERNAL_SUPER_STATE = SUPER_STATE_VIEW__INTERNAL_SUPER_STATE;

	/**
	 * The feature id for the '<em><b>Internal Initilal Super State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE = SUPER_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initilal Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW_FEATURE_COUNT = SUPER_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___GET_LABEL = SUPER_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___SET_LABEL__STRING = SUPER_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The operation id for the '<em>Get Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___GET_DECLARATION = SUPER_STATE_VIEW___GET_DECLARATION;

	/**
	 * The operation id for the '<em>Set Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___SET_DECLARATION__ELIST = SUPER_STATE_VIEW___SET_DECLARATION__ELIST;

	/**
	 * The operation id for the '<em>Add Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___ADD_DECLARATION__SUPERSTATEDECLARATION = SUPER_STATE_VIEW___ADD_DECLARATION__SUPERSTATEDECLARATION;

	/**
	 * The operation id for the '<em>Remove Declaration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW___REMOVE_DECLARATION__SUPERSTATEDECLARATION = SUPER_STATE_VIEW___REMOVE_DECLARATION__SUPERSTATEDECLARATION;

	/**
	 * The number of operations of the '<em>Initilal Super State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITILAL_SUPER_STATE_VIEW_OPERATION_COUNT = SUPER_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationNodeViewImpl <em>Root State Declaration Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationNodeViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRootStateDeclarationNodeView()
	 * @generated
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Internal Root State Declaration Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW__INTERNAL_ROOT_STATE_DECLARATION_NODE = 0;

	/**
	 * The number of structural features of the '<em>Root State Declaration Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW___GET_DECLARATION_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW___SET_DECLARATION_TYPE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Input Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW___GET_INPUT_OUTPUT = 2;

	/**
	 * The operation id for the '<em>Set Input Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW___SET_INPUT_OUTPUT__STRING = 3;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW___GET_NAME = 4;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW___SET_NAME__STRING = 5;

	/**
	 * The number of operations of the '<em>Root State Declaration Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_NODE_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationNodeViewImpl <em>Super State Declaration Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationNodeViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuperStateDeclarationNodeView()
	 * @generated
	 */
	int SUPER_STATE_DECLARATION_NODE_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Internal Super State Declaration Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUPER_STATE_DECLARATION_NODE = 0;

	/**
	 * The number of structural features of the '<em>Super State Declaration Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_NODE_VIEW___GET_DECLARATION_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_NODE_VIEW___SET_DECLARATION_TYPE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_NODE_VIEW___GET_NAME = 2;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_NODE_VIEW___SET_NAME__STRING = 3;

	/**
	 * The number of operations of the '<em>Super State Declaration Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_NODE_VIEW_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SimpleStateViewImpl <em>Simple State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SimpleStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSimpleStateView()
	 * @generated
	 */
	int SIMPLE_STATE_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Internal Simple State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE = 0;

	/**
	 * The number of structural features of the '<em>Simple State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW___GET_LABEL = 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW___SET_LABEL__STRING = 1;

	/**
	 * The number of operations of the '<em>Simple State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATE_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialStateViewImpl <em>Initial State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialStateView()
	 * @generated
	 */
	int INITIAL_STATE_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Internal Simple State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW__INTERNAL_SIMPLE_STATE = SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE;

	/**
	 * The feature id for the '<em><b>Internal Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE = SIMPLE_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW_FEATURE_COUNT = SIMPLE_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW___GET_LABEL = SIMPLE_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW___SET_LABEL__STRING = SIMPLE_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Initial State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_VIEW_OPERATION_COUNT = SIMPLE_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalStateViewImpl <em>Final State View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalStateViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getFinalStateView()
	 * @generated
	 */
	int FINAL_STATE_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Internal Simple State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW__INTERNAL_SIMPLE_STATE = SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE;

	/**
	 * The feature id for the '<em><b>Internal Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW__INTERNAL_FINAL_STATE = SIMPLE_STATE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW_FEATURE_COUNT = SIMPLE_STATE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW___GET_LABEL = SIMPLE_STATE_VIEW___GET_LABEL;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW___SET_LABEL__STRING = SIMPLE_STATE_VIEW___SET_LABEL__STRING;

	/**
	 * The number of operations of the '<em>Final State View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_VIEW_OPERATION_COUNT = SIMPLE_STATE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectorViewImpl <em>Connector View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectorViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getConnectorView()
	 * @generated
	 */
	int CONNECTOR_VIEW = 9;

	/**
	 * The feature id for the '<em><b>Internal Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW__INTERNAL_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Connector View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connector View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TransitionViewImpl <em>Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTransitionView()
	 * @generated
	 */
	int TRANSITION_VIEW = 10;

	/**
	 * The feature id for the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__INTERNAL_TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___GET_ACTION = 0;

	/**
	 * The operation id for the '<em>Set Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___SET_ACTION__STRING = 1;

	/**
	 * The operation id for the '<em>Get Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___GET_TRIGGER = 2;

	/**
	 * The operation id for the '<em>Set Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___SET_TRIGGER__STRING = 3;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___GET_PRIORITY = 4;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW___SET_PRIORITY__INT = 5;

	/**
	 * The number of operations of the '<em>Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTransitionViewImpl <em>Immediate Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getImmediateTransitionView()
	 * @generated
	 */
	int IMMEDIATE_TRANSITION_VIEW = 11;

	/**
	 * The feature id for the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW__INTERNAL_TRANSITION = TRANSITION_VIEW__INTERNAL_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Immediate Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION = TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW_FEATURE_COUNT = TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___GET_ACTION = TRANSITION_VIEW___GET_ACTION;

	/**
	 * The operation id for the '<em>Set Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___SET_ACTION__STRING = TRANSITION_VIEW___SET_ACTION__STRING;

	/**
	 * The operation id for the '<em>Get Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___GET_TRIGGER = TRANSITION_VIEW___GET_TRIGGER;

	/**
	 * The operation id for the '<em>Set Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___SET_TRIGGER__STRING = TRANSITION_VIEW___SET_TRIGGER__STRING;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___GET_PRIORITY = TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___SET_PRIORITY__INT = TRANSITION_VIEW___SET_PRIORITY__INT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___GET_LABEL = TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW___SET_LABEL__STRING = TRANSITION_VIEW_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Immediate Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_VIEW_OPERATION_COUNT = TRANSITION_VIEW_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTerminationTransitionViewImpl <em>Immediate Termination Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTerminationTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getImmediateTerminationTransitionView()
	 * @generated
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW = 12;

	/**
	 * The feature id for the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW__INTERNAL_TRANSITION = TRANSITION_VIEW__INTERNAL_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Immediate Termination Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TERMINATION_TRANSITION = TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Termination Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW_FEATURE_COUNT = TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW___GET_ACTION = TRANSITION_VIEW___GET_ACTION;

	/**
	 * The operation id for the '<em>Set Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW___SET_ACTION__STRING = TRANSITION_VIEW___SET_ACTION__STRING;

	/**
	 * The operation id for the '<em>Get Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW___GET_TRIGGER = TRANSITION_VIEW___GET_TRIGGER;

	/**
	 * The operation id for the '<em>Set Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW___SET_TRIGGER__STRING = TRANSITION_VIEW___SET_TRIGGER__STRING;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW___GET_PRIORITY = TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW___SET_PRIORITY__INT = TRANSITION_VIEW___SET_PRIORITY__INT;

	/**
	 * The number of operations of the '<em>Immediate Termination Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TERMINATION_TRANSITION_VIEW_OPERATION_COUNT = TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTransitionViewImpl <em>Weak Abort Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getWeakAbortTransitionView()
	 * @generated
	 */
	int WEAK_ABORT_TRANSITION_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW__INTERNAL_TRANSITION = TRANSITION_VIEW__INTERNAL_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Weak Abort Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TRANSITION = TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weak Abort Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW_FEATURE_COUNT = TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW___GET_ACTION = TRANSITION_VIEW___GET_ACTION;

	/**
	 * The operation id for the '<em>Set Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW___SET_ACTION__STRING = TRANSITION_VIEW___SET_ACTION__STRING;

	/**
	 * The operation id for the '<em>Get Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW___GET_TRIGGER = TRANSITION_VIEW___GET_TRIGGER;

	/**
	 * The operation id for the '<em>Set Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW___SET_TRIGGER__STRING = TRANSITION_VIEW___SET_TRIGGER__STRING;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW___GET_PRIORITY = TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW___SET_PRIORITY__INT = TRANSITION_VIEW___SET_PRIORITY__INT;

	/**
	 * The number of operations of the '<em>Weak Abort Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TRANSITION_VIEW_OPERATION_COUNT = TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortTransitionViewImpl <em>Strong Abort Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortTransitionView()
	 * @generated
	 */
	int STRONG_ABORT_TRANSITION_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW__INTERNAL_TRANSITION = TRANSITION_VIEW__INTERNAL_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Strong Abort Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION = TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strong Abort Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW_FEATURE_COUNT = TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___GET_ACTION = TRANSITION_VIEW___GET_ACTION;

	/**
	 * The operation id for the '<em>Set Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___SET_ACTION__STRING = TRANSITION_VIEW___SET_ACTION__STRING;

	/**
	 * The operation id for the '<em>Get Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___GET_TRIGGER = TRANSITION_VIEW___GET_TRIGGER;

	/**
	 * The operation id for the '<em>Set Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___SET_TRIGGER__STRING = TRANSITION_VIEW___SET_TRIGGER__STRING;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___GET_PRIORITY = TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW___SET_PRIORITY__INT = TRANSITION_VIEW___SET_PRIORITY__INT;

	/**
	 * The number of operations of the '<em>Strong Abort Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_ABORT_TRANSITION_VIEW_OPERATION_COUNT = TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTerminationTransitionViewImpl <em>Weak Abort Termination Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTerminationTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getWeakAbortTerminationTransitionView()
	 * @generated
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW = 15;

	/**
	 * The feature id for the '<em><b>Internal Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW__INTERNAL_TRANSITION = TRANSITION_VIEW__INTERNAL_TRANSITION;

	/**
	 * The feature id for the '<em><b>Internal Weak Abort Termination Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION = TRANSITION_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weak Abort Termination Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW_FEATURE_COUNT = TRANSITION_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW___GET_ACTION = TRANSITION_VIEW___GET_ACTION;

	/**
	 * The operation id for the '<em>Set Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW___SET_ACTION__STRING = TRANSITION_VIEW___SET_ACTION__STRING;

	/**
	 * The operation id for the '<em>Get Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW___GET_TRIGGER = TRANSITION_VIEW___GET_TRIGGER;

	/**
	 * The operation id for the '<em>Set Trigger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW___SET_TRIGGER__STRING = TRANSITION_VIEW___SET_TRIGGER__STRING;

	/**
	 * The operation id for the '<em>Get Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW___GET_PRIORITY = TRANSITION_VIEW___GET_PRIORITY;

	/**
	 * The operation id for the '<em>Set Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW___SET_PRIORITY__INT = TRANSITION_VIEW___SET_PRIORITY__INT;

	/**
	 * The number of operations of the '<em>Weak Abort Termination Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAK_ABORT_TERMINATION_TRANSITION_VIEW_OPERATION_COUNT = TRANSITION_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DefferedTransitionViewImpl <em>Deffered Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.DefferedTransitionViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getDefferedTransitionView()
	 * @generated
	 */
	int DEFFERED_TRANSITION_VIEW = 16;

	/**
	 * The feature id for the '<em><b>Internal Deffered Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFFERED_TRANSITION_VIEW__INTERNAL_DEFFERED_TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Deffered Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFFERED_TRANSITION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deffered Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFFERED_TRANSITION_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartViewImpl <em>SC Chart View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSCChartView()
	 * @generated
	 */
	int SC_CHART_VIEW = 17;

	/**
	 * The feature id for the '<em><b>Internal SC Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_VIEW__INTERNAL_SC_CHART = 0;

	/**
	 * The number of structural features of the '<em>SC Chart View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SC Chart View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_CHART_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationViewImpl <em>Root State Declaration View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRootStateDeclarationView()
	 * @generated
	 */
	int ROOT_STATE_DECLARATION_VIEW = 18;

	/**
	 * The feature id for the '<em><b>Internal Root State Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_VIEW__INTERNAL_ROOT_STATE_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Root State Declaration View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_VIEW___GET_DECLARATION_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Input Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_VIEW___GET_INPUT_OUTPUT = 2;

	/**
	 * The operation id for the '<em>Set Input Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_VIEW___SET_INPUT_OUTPUT__STRING = 3;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_VIEW___GET_NAME = 4;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_VIEW___SET_NAME__STRING = 5;

	/**
	 * The number of operations of the '<em>Root State Declaration View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_STATE_DECLARATION_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationViewImpl <em>Super State Declaration View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationViewImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuperStateDeclarationView()
	 * @generated
	 */
	int SUPER_STATE_DECLARATION_VIEW = 19;

	/**
	 * The feature id for the '<em><b>Internal Super State Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUPER_STATE_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Super State Declaration View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_VIEW___GET_DECLARATION_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Declaration Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_VIEW___GET_NAME = 2;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_VIEW___SET_NAME__STRING = 3;

	/**
	 * The number of operations of the '<em>Super State Declaration View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STATE_DECLARATION_VIEW_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView <em>Root State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView
	 * @generated
	 */
	EClass getRootStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getInternalRootState <em>Internal Root State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Root State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getInternalRootState()
	 * @see #getRootStateView()
	 * @generated
	 */
	EReference getRootStateView_InternalRootState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getLabel()
	 * @generated
	 */
	EOperation getRootStateView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateView__SetLabel__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getDeclaration() <em>Get Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declaration</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#getDeclaration()
	 * @generated
	 */
	EOperation getRootStateView__GetDeclaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setDeclaration(org.eclipse.emf.common.util.EList) <em>Set Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Declaration</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#setDeclaration(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getRootStateView__SetDeclaration__EList();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#addDeclaration(info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration) <em>Add Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Declaration</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#addDeclaration(info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration)
	 * @generated
	 */
	EOperation getRootStateView__AddDeclaration__RootStateDeclaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#removeDeclaration(info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration) <em>Remove Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Declaration</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateView#removeDeclaration(info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration)
	 * @generated
	 */
	EOperation getRootStateView__RemoveDeclaration__RootStateDeclaration();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView <em>Region View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView
	 * @generated
	 */
	EClass getRegionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getInternalRegion <em>Internal Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Region</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getInternalRegion()
	 * @see #getRegionView()
	 * @generated
	 */
	EReference getRegionView_InternalRegion();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getLabel()
	 * @generated
	 */
	EOperation getRegionView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getRegionView__SetLabel__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getRegionID() <em>Get Region ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Region ID</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getRegionID()
	 * @generated
	 */
	EOperation getRegionView__GetRegionID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setRegionID(java.lang.String) <em>Set Region ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Region ID</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setRegionID(java.lang.String)
	 * @generated
	 */
	EOperation getRegionView__SetRegionID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getUuid() <em>Get Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#getUuid()
	 * @generated
	 */
	EOperation getRegionView__GetUuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setUuid(java.lang.String) <em>Set Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Uuid</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RegionView#setUuid(java.lang.String)
	 * @generated
	 */
	EOperation getRegionView__SetUuid__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView <em>Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView
	 * @generated
	 */
	EClass getSuperStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getInternalSuperState <em>Internal Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getInternalSuperState()
	 * @see #getSuperStateView()
	 * @generated
	 */
	EReference getSuperStateView_InternalSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getLabel()
	 * @generated
	 */
	EOperation getSuperStateView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateView__SetLabel__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getDeclaration() <em>Get Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declaration</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#getDeclaration()
	 * @generated
	 */
	EOperation getSuperStateView__GetDeclaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#setDeclaration(org.eclipse.emf.common.util.EList) <em>Set Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Declaration</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#setDeclaration(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSuperStateView__SetDeclaration__EList();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#addDeclaration(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration) <em>Add Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Declaration</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#addDeclaration(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration)
	 * @generated
	 */
	EOperation getSuperStateView__AddDeclaration__SuperStateDeclaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#removeDeclaration(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration) <em>Remove Declaration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Declaration</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateView#removeDeclaration(info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration)
	 * @generated
	 */
	EOperation getSuperStateView__RemoveDeclaration__SuperStateDeclaration();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitilalSuperStateView <em>Initilal Super State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initilal Super State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitilalSuperStateView
	 * @generated
	 */
	EClass getInitilalSuperStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitilalSuperStateView#getInternalInitilalSuperState <em>Internal Initilal Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initilal Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitilalSuperStateView#getInternalInitilalSuperState()
	 * @see #getInitilalSuperStateView()
	 * @generated
	 */
	EReference getInitilalSuperStateView_InternalInitilalSuperState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView <em>Root State Declaration Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State Declaration Node View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView
	 * @generated
	 */
	EClass getRootStateDeclarationNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getInternalRootStateDeclarationNode <em>Internal Root State Declaration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Root State Declaration Node</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getInternalRootStateDeclarationNode()
	 * @see #getRootStateDeclarationNodeView()
	 * @generated
	 */
	EReference getRootStateDeclarationNodeView_InternalRootStateDeclarationNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getDeclarationType() <em>Get Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getDeclarationType()
	 * @generated
	 */
	EOperation getRootStateDeclarationNodeView__GetDeclarationType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#setDeclarationType(java.lang.String) <em>Set Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#setDeclarationType(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateDeclarationNodeView__SetDeclarationType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getInputOutput() <em>Get Input Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getInputOutput()
	 * @generated
	 */
	EOperation getRootStateDeclarationNodeView__GetInputOutput();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#setInputOutput(java.lang.String) <em>Set Input Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Input Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#setInputOutput(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateDeclarationNodeView__SetInputOutput__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#getName()
	 * @generated
	 */
	EOperation getRootStateDeclarationNodeView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationNodeView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateDeclarationNodeView__SetName__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView <em>Super State Declaration Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State Declaration Node View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView
	 * @generated
	 */
	EClass getSuperStateDeclarationNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#getInternalSuperStateDeclarationNode <em>Internal Super State Declaration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Super State Declaration Node</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#getInternalSuperStateDeclarationNode()
	 * @see #getSuperStateDeclarationNodeView()
	 * @generated
	 */
	EReference getSuperStateDeclarationNodeView_InternalSuperStateDeclarationNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#getDeclarationType() <em>Get Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#getDeclarationType()
	 * @generated
	 */
	EOperation getSuperStateDeclarationNodeView__GetDeclarationType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#setDeclarationType(java.lang.String) <em>Set Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#setDeclarationType(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateDeclarationNodeView__SetDeclarationType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#getName()
	 * @generated
	 */
	EOperation getSuperStateDeclarationNodeView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationNodeView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateDeclarationNodeView__SetName__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView <em>Simple State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView
	 * @generated
	 */
	EClass getSimpleStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getInternalSimpleState <em>Internal Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Simple State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getInternalSimpleState()
	 * @see #getSimpleStateView()
	 * @generated
	 */
	EReference getSimpleStateView_InternalSimpleState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#getLabel()
	 * @generated
	 */
	EOperation getSimpleStateView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SimpleStateView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getSimpleStateView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView <em>Initial State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView
	 * @generated
	 */
	EClass getInitialStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView#getInternalInitialState <em>Internal Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Initial State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.InitialStateView#getInternalInitialState()
	 * @see #getInitialStateView()
	 * @generated
	 */
	EReference getInitialStateView_InternalInitialState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView <em>Final State View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView
	 * @generated
	 */
	EClass getFinalStateView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView#getInternalFinalState <em>Internal Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Final State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.FinalStateView#getInternalFinalState()
	 * @see #getFinalStateView()
	 * @generated
	 */
	EReference getFinalStateView_InternalFinalState();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView <em>Connector View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView
	 * @generated
	 */
	EClass getConnectorView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView#getInternalConnector <em>Internal Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Connector</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ConnectorView#getInternalConnector()
	 * @see #getConnectorView()
	 * @generated
	 */
	EReference getConnectorView_InternalConnector();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView <em>Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView
	 * @generated
	 */
	EClass getTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getInternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getInternalTransition()
	 * @see #getTransitionView()
	 * @generated
	 */
	EReference getTransitionView_InternalTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getAction() <em>Get Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Action</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getAction()
	 * @generated
	 */
	EOperation getTransitionView__GetAction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setAction(java.lang.String) <em>Set Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Action</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setAction(java.lang.String)
	 * @generated
	 */
	EOperation getTransitionView__SetAction__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getTrigger() <em>Get Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Trigger</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getTrigger()
	 * @generated
	 */
	EOperation getTransitionView__GetTrigger();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setTrigger(java.lang.String) <em>Set Trigger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Trigger</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setTrigger(java.lang.String)
	 * @generated
	 */
	EOperation getTransitionView__SetTrigger__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getPriority() <em>Get Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Priority</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#getPriority()
	 * @generated
	 */
	EOperation getTransitionView__GetPriority();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setPriority(int) <em>Set Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Priority</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.TransitionView#setPriority(int)
	 * @generated
	 */
	EOperation getTransitionView__SetPriority__int();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView <em>Immediate Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView
	 * @generated
	 */
	EClass getImmediateTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView#getInternalImmediateTransition <em>Internal Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Immediate Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView#getInternalImmediateTransition()
	 * @see #getImmediateTransitionView()
	 * @generated
	 */
	EReference getImmediateTransitionView_InternalImmediateTransition();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView#getLabel() <em>Get Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView#getLabel()
	 * @generated
	 */
	EOperation getImmediateTransitionView__GetLabel();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView#setLabel(java.lang.String) <em>Set Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Label</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTransitionView#setLabel(java.lang.String)
	 * @generated
	 */
	EOperation getImmediateTransitionView__SetLabel__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTerminationTransitionView <em>Immediate Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Termination Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTerminationTransitionView
	 * @generated
	 */
	EClass getImmediateTerminationTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTerminationTransitionView#getInternalImmediateTerminationTransition <em>Internal Immediate Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Immediate Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.ImmediateTerminationTransitionView#getInternalImmediateTerminationTransition()
	 * @see #getImmediateTerminationTransitionView()
	 * @generated
	 */
	EReference getImmediateTerminationTransitionView_InternalImmediateTerminationTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTransitionView <em>Weak Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weak Abort Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTransitionView
	 * @generated
	 */
	EClass getWeakAbortTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTransitionView#getInternalWeakAbortTransition <em>Internal Weak Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Weak Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTransitionView#getInternalWeakAbortTransition()
	 * @see #getWeakAbortTransitionView()
	 * @generated
	 */
	EReference getWeakAbortTransitionView_InternalWeakAbortTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView <em>Strong Abort Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView
	 * @generated
	 */
	EClass getStrongAbortTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getInternalStrongAbortTransition <em>Internal Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Strong Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.StrongAbortTransitionView#getInternalStrongAbortTransition()
	 * @see #getStrongAbortTransitionView()
	 * @generated
	 */
	EReference getStrongAbortTransitionView_InternalStrongAbortTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTerminationTransitionView <em>Weak Abort Termination Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weak Abort Termination Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTerminationTransitionView
	 * @generated
	 */
	EClass getWeakAbortTerminationTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTerminationTransitionView#getInternalWeakAbortTerminationTransition <em>Internal Weak Abort Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Weak Abort Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.WeakAbortTerminationTransitionView#getInternalWeakAbortTerminationTransition()
	 * @see #getWeakAbortTerminationTransitionView()
	 * @generated
	 */
	EReference getWeakAbortTerminationTransitionView_InternalWeakAbortTerminationTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DefferedTransitionView <em>Deffered Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deffered Transition View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DefferedTransitionView
	 * @generated
	 */
	EClass getDefferedTransitionView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.DefferedTransitionView#getInternalDefferedTransition <em>Internal Deffered Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Deffered Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.DefferedTransitionView#getInternalDefferedTransition()
	 * @see #getDefferedTransitionView()
	 * @generated
	 */
	EReference getDefferedTransitionView_InternalDefferedTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView <em>SC Chart View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView
	 * @generated
	 */
	EClass getSCChartView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView#getInternalSCChart <em>Internal SC Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal SC Chart</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SCChartView#getInternalSCChart()
	 * @see #getSCChartView()
	 * @generated
	 */
	EReference getSCChartView_InternalSCChart();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView <em>Root State Declaration View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State Declaration View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView
	 * @generated
	 */
	EClass getRootStateDeclarationView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#getInternalRootStateDeclaration <em>Internal Root State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Root State Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#getInternalRootStateDeclaration()
	 * @see #getRootStateDeclarationView()
	 * @generated
	 */
	EReference getRootStateDeclarationView_InternalRootStateDeclaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#getDeclarationType() <em>Get Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#getDeclarationType()
	 * @generated
	 */
	EOperation getRootStateDeclarationView__GetDeclarationType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#setDeclarationType(java.lang.String) <em>Set Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#setDeclarationType(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateDeclarationView__SetDeclarationType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#getInputOutput() <em>Get Input Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#getInputOutput()
	 * @generated
	 */
	EOperation getRootStateDeclarationView__GetInputOutput();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#setInputOutput(java.lang.String) <em>Set Input Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Input Output</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#setInputOutput(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateDeclarationView__SetInputOutput__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#getName()
	 * @generated
	 */
	EOperation getRootStateDeclarationView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.RootStateDeclarationView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getRootStateDeclarationView__SetName__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView <em>Super State Declaration View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State Declaration View</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView
	 * @generated
	 */
	EClass getSuperStateDeclarationView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#getInternalSuperStateDeclaration <em>Internal Super State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Super State Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#getInternalSuperStateDeclaration()
	 * @see #getSuperStateDeclarationView()
	 * @generated
	 */
	EReference getSuperStateDeclarationView_InternalSuperStateDeclaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#getDeclarationType() <em>Get Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#getDeclarationType()
	 * @generated
	 */
	EOperation getSuperStateDeclarationView__GetDeclarationType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#setDeclarationType(java.lang.String) <em>Set Declaration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Declaration Type</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#setDeclarationType(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateDeclarationView__SetDeclarationType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#getName()
	 * @generated
	 */
	EOperation getSuperStateDeclarationView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.views.SuperStateDeclarationView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getSuperStateDeclarationView__SetName__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateViewImpl <em>Root State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRootStateView()
		 * @generated
		 */
		EClass ROOT_STATE_VIEW = eINSTANCE.getRootStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Root State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_STATE_VIEW__INTERNAL_ROOT_STATE = eINSTANCE.getRootStateView_InternalRootState();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___GET_LABEL = eINSTANCE.getRootStateView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___SET_LABEL__STRING = eINSTANCE.getRootStateView__SetLabel__String();

		/**
		 * The meta object literal for the '<em><b>Get Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___GET_DECLARATION = eINSTANCE.getRootStateView__GetDeclaration();

		/**
		 * The meta object literal for the '<em><b>Set Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___SET_DECLARATION__ELIST = eINSTANCE.getRootStateView__SetDeclaration__EList();

		/**
		 * The meta object literal for the '<em><b>Add Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___ADD_DECLARATION__ROOTSTATEDECLARATION = eINSTANCE.getRootStateView__AddDeclaration__RootStateDeclaration();

		/**
		 * The meta object literal for the '<em><b>Remove Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_VIEW___REMOVE_DECLARATION__ROOTSTATEDECLARATION = eINSTANCE.getRootStateView__RemoveDeclaration__RootStateDeclaration();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionViewImpl <em>Region View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RegionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRegionView()
		 * @generated
		 */
		EClass REGION_VIEW = eINSTANCE.getRegionView();

		/**
		 * The meta object literal for the '<em><b>Internal Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_VIEW__INTERNAL_REGION = eINSTANCE.getRegionView_InternalRegion();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___GET_LABEL = eINSTANCE.getRegionView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___SET_LABEL__STRING = eINSTANCE.getRegionView__SetLabel__String();

		/**
		 * The meta object literal for the '<em><b>Get Region ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___GET_REGION_ID = eINSTANCE.getRegionView__GetRegionID();

		/**
		 * The meta object literal for the '<em><b>Set Region ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___SET_REGION_ID__STRING = eINSTANCE.getRegionView__SetRegionID__String();

		/**
		 * The meta object literal for the '<em><b>Get Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___GET_UUID = eINSTANCE.getRegionView__GetUuid();

		/**
		 * The meta object literal for the '<em><b>Set Uuid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION_VIEW___SET_UUID__STRING = eINSTANCE.getRegionView__SetUuid__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateViewImpl <em>Super State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuperStateView()
		 * @generated
		 */
		EClass SUPER_STATE_VIEW = eINSTANCE.getSuperStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Super State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_VIEW__INTERNAL_SUPER_STATE = eINSTANCE.getSuperStateView_InternalSuperState();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___GET_LABEL = eINSTANCE.getSuperStateView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___SET_LABEL__STRING = eINSTANCE.getSuperStateView__SetLabel__String();

		/**
		 * The meta object literal for the '<em><b>Get Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___GET_DECLARATION = eINSTANCE.getSuperStateView__GetDeclaration();

		/**
		 * The meta object literal for the '<em><b>Set Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___SET_DECLARATION__ELIST = eINSTANCE.getSuperStateView__SetDeclaration__EList();

		/**
		 * The meta object literal for the '<em><b>Add Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___ADD_DECLARATION__SUPERSTATEDECLARATION = eINSTANCE.getSuperStateView__AddDeclaration__SuperStateDeclaration();

		/**
		 * The meta object literal for the '<em><b>Remove Declaration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_VIEW___REMOVE_DECLARATION__SUPERSTATEDECLARATION = eINSTANCE.getSuperStateView__RemoveDeclaration__SuperStateDeclaration();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitilalSuperStateViewImpl <em>Initilal Super State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitilalSuperStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitilalSuperStateView()
		 * @generated
		 */
		EClass INITILAL_SUPER_STATE_VIEW = eINSTANCE.getInitilalSuperStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Initilal Super State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITILAL_SUPER_STATE_VIEW__INTERNAL_INITILAL_SUPER_STATE = eINSTANCE.getInitilalSuperStateView_InternalInitilalSuperState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationNodeViewImpl <em>Root State Declaration Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationNodeViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRootStateDeclarationNodeView()
		 * @generated
		 */
		EClass ROOT_STATE_DECLARATION_NODE_VIEW = eINSTANCE.getRootStateDeclarationNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal Root State Declaration Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_STATE_DECLARATION_NODE_VIEW__INTERNAL_ROOT_STATE_DECLARATION_NODE = eINSTANCE.getRootStateDeclarationNodeView_InternalRootStateDeclarationNode();

		/**
		 * The meta object literal for the '<em><b>Get Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_NODE_VIEW___GET_DECLARATION_TYPE = eINSTANCE.getRootStateDeclarationNodeView__GetDeclarationType();

		/**
		 * The meta object literal for the '<em><b>Set Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_NODE_VIEW___SET_DECLARATION_TYPE__STRING = eINSTANCE.getRootStateDeclarationNodeView__SetDeclarationType__String();

		/**
		 * The meta object literal for the '<em><b>Get Input Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_NODE_VIEW___GET_INPUT_OUTPUT = eINSTANCE.getRootStateDeclarationNodeView__GetInputOutput();

		/**
		 * The meta object literal for the '<em><b>Set Input Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_NODE_VIEW___SET_INPUT_OUTPUT__STRING = eINSTANCE.getRootStateDeclarationNodeView__SetInputOutput__String();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_NODE_VIEW___GET_NAME = eINSTANCE.getRootStateDeclarationNodeView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_NODE_VIEW___SET_NAME__STRING = eINSTANCE.getRootStateDeclarationNodeView__SetName__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationNodeViewImpl <em>Super State Declaration Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationNodeViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuperStateDeclarationNodeView()
		 * @generated
		 */
		EClass SUPER_STATE_DECLARATION_NODE_VIEW = eINSTANCE.getSuperStateDeclarationNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal Super State Declaration Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_DECLARATION_NODE_VIEW__INTERNAL_SUPER_STATE_DECLARATION_NODE = eINSTANCE.getSuperStateDeclarationNodeView_InternalSuperStateDeclarationNode();

		/**
		 * The meta object literal for the '<em><b>Get Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_DECLARATION_NODE_VIEW___GET_DECLARATION_TYPE = eINSTANCE.getSuperStateDeclarationNodeView__GetDeclarationType();

		/**
		 * The meta object literal for the '<em><b>Set Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_DECLARATION_NODE_VIEW___SET_DECLARATION_TYPE__STRING = eINSTANCE.getSuperStateDeclarationNodeView__SetDeclarationType__String();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_DECLARATION_NODE_VIEW___GET_NAME = eINSTANCE.getSuperStateDeclarationNodeView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_DECLARATION_NODE_VIEW___SET_NAME__STRING = eINSTANCE.getSuperStateDeclarationNodeView__SetName__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SimpleStateViewImpl <em>Simple State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SimpleStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSimpleStateView()
		 * @generated
		 */
		EClass SIMPLE_STATE_VIEW = eINSTANCE.getSimpleStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Simple State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_STATE_VIEW__INTERNAL_SIMPLE_STATE = eINSTANCE.getSimpleStateView_InternalSimpleState();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_STATE_VIEW___GET_LABEL = eINSTANCE.getSimpleStateView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_STATE_VIEW___SET_LABEL__STRING = eINSTANCE.getSimpleStateView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialStateViewImpl <em>Initial State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.InitialStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getInitialStateView()
		 * @generated
		 */
		EClass INITIAL_STATE_VIEW = eINSTANCE.getInitialStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_STATE_VIEW__INTERNAL_INITIAL_STATE = eINSTANCE.getInitialStateView_InternalInitialState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalStateViewImpl <em>Final State View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.FinalStateViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getFinalStateView()
		 * @generated
		 */
		EClass FINAL_STATE_VIEW = eINSTANCE.getFinalStateView();

		/**
		 * The meta object literal for the '<em><b>Internal Final State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_STATE_VIEW__INTERNAL_FINAL_STATE = eINSTANCE.getFinalStateView_InternalFinalState();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectorViewImpl <em>Connector View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ConnectorViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getConnectorView()
		 * @generated
		 */
		EClass CONNECTOR_VIEW = eINSTANCE.getConnectorView();

		/**
		 * The meta object literal for the '<em><b>Internal Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_VIEW__INTERNAL_CONNECTOR = eINSTANCE.getConnectorView_InternalConnector();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.TransitionViewImpl <em>Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.TransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getTransitionView()
		 * @generated
		 */
		EClass TRANSITION_VIEW = eINSTANCE.getTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_VIEW__INTERNAL_TRANSITION = eINSTANCE.getTransitionView_InternalTransition();

		/**
		 * The meta object literal for the '<em><b>Get Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___GET_ACTION = eINSTANCE.getTransitionView__GetAction();

		/**
		 * The meta object literal for the '<em><b>Set Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___SET_ACTION__STRING = eINSTANCE.getTransitionView__SetAction__String();

		/**
		 * The meta object literal for the '<em><b>Get Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___GET_TRIGGER = eINSTANCE.getTransitionView__GetTrigger();

		/**
		 * The meta object literal for the '<em><b>Set Trigger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___SET_TRIGGER__STRING = eINSTANCE.getTransitionView__SetTrigger__String();

		/**
		 * The meta object literal for the '<em><b>Get Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___GET_PRIORITY = eINSTANCE.getTransitionView__GetPriority();

		/**
		 * The meta object literal for the '<em><b>Set Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION_VIEW___SET_PRIORITY__INT = eINSTANCE.getTransitionView__SetPriority__int();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTransitionViewImpl <em>Immediate Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getImmediateTransitionView()
		 * @generated
		 */
		EClass IMMEDIATE_TRANSITION_VIEW = eINSTANCE.getImmediateTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Immediate Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TRANSITION = eINSTANCE.getImmediateTransitionView_InternalImmediateTransition();

		/**
		 * The meta object literal for the '<em><b>Get Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_TRANSITION_VIEW___GET_LABEL = eINSTANCE.getImmediateTransitionView__GetLabel();

		/**
		 * The meta object literal for the '<em><b>Set Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMMEDIATE_TRANSITION_VIEW___SET_LABEL__STRING = eINSTANCE.getImmediateTransitionView__SetLabel__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTerminationTransitionViewImpl <em>Immediate Termination Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ImmediateTerminationTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getImmediateTerminationTransitionView()
		 * @generated
		 */
		EClass IMMEDIATE_TERMINATION_TRANSITION_VIEW = eINSTANCE.getImmediateTerminationTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Immediate Termination Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMEDIATE_TERMINATION_TRANSITION_VIEW__INTERNAL_IMMEDIATE_TERMINATION_TRANSITION = eINSTANCE.getImmediateTerminationTransitionView_InternalImmediateTerminationTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTransitionViewImpl <em>Weak Abort Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getWeakAbortTransitionView()
		 * @generated
		 */
		EClass WEAK_ABORT_TRANSITION_VIEW = eINSTANCE.getWeakAbortTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Weak Abort Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAK_ABORT_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TRANSITION = eINSTANCE.getWeakAbortTransitionView_InternalWeakAbortTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortTransitionViewImpl <em>Strong Abort Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.StrongAbortTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getStrongAbortTransitionView()
		 * @generated
		 */
		EClass STRONG_ABORT_TRANSITION_VIEW = eINSTANCE.getStrongAbortTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Strong Abort Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRONG_ABORT_TRANSITION_VIEW__INTERNAL_STRONG_ABORT_TRANSITION = eINSTANCE.getStrongAbortTransitionView_InternalStrongAbortTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTerminationTransitionViewImpl <em>Weak Abort Termination Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.WeakAbortTerminationTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getWeakAbortTerminationTransitionView()
		 * @generated
		 */
		EClass WEAK_ABORT_TERMINATION_TRANSITION_VIEW = eINSTANCE.getWeakAbortTerminationTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Weak Abort Termination Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAK_ABORT_TERMINATION_TRANSITION_VIEW__INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION = eINSTANCE.getWeakAbortTerminationTransitionView_InternalWeakAbortTerminationTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.DefferedTransitionViewImpl <em>Deffered Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.DefferedTransitionViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getDefferedTransitionView()
		 * @generated
		 */
		EClass DEFFERED_TRANSITION_VIEW = eINSTANCE.getDefferedTransitionView();

		/**
		 * The meta object literal for the '<em><b>Internal Deffered Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFFERED_TRANSITION_VIEW__INTERNAL_DEFFERED_TRANSITION = eINSTANCE.getDefferedTransitionView_InternalDefferedTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartViewImpl <em>SC Chart View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SCChartViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSCChartView()
		 * @generated
		 */
		EClass SC_CHART_VIEW = eINSTANCE.getSCChartView();

		/**
		 * The meta object literal for the '<em><b>Internal SC Chart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SC_CHART_VIEW__INTERNAL_SC_CHART = eINSTANCE.getSCChartView_InternalSCChart();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationViewImpl <em>Root State Declaration View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.RootStateDeclarationViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getRootStateDeclarationView()
		 * @generated
		 */
		EClass ROOT_STATE_DECLARATION_VIEW = eINSTANCE.getRootStateDeclarationView();

		/**
		 * The meta object literal for the '<em><b>Internal Root State Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_STATE_DECLARATION_VIEW__INTERNAL_ROOT_STATE_DECLARATION = eINSTANCE.getRootStateDeclarationView_InternalRootStateDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_VIEW___GET_DECLARATION_TYPE = eINSTANCE.getRootStateDeclarationView__GetDeclarationType();

		/**
		 * The meta object literal for the '<em><b>Set Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING = eINSTANCE.getRootStateDeclarationView__SetDeclarationType__String();

		/**
		 * The meta object literal for the '<em><b>Get Input Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_VIEW___GET_INPUT_OUTPUT = eINSTANCE.getRootStateDeclarationView__GetInputOutput();

		/**
		 * The meta object literal for the '<em><b>Set Input Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_VIEW___SET_INPUT_OUTPUT__STRING = eINSTANCE.getRootStateDeclarationView__SetInputOutput__String();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_VIEW___GET_NAME = eINSTANCE.getRootStateDeclarationView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT_STATE_DECLARATION_VIEW___SET_NAME__STRING = eINSTANCE.getRootStateDeclarationView__SetName__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationViewImpl <em>Super State Declaration View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.SuperStateDeclarationViewImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.views.impl.ViewsPackageImpl#getSuperStateDeclarationView()
		 * @generated
		 */
		EClass SUPER_STATE_DECLARATION_VIEW = eINSTANCE.getSuperStateDeclarationView();

		/**
		 * The meta object literal for the '<em><b>Internal Super State Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STATE_DECLARATION_VIEW__INTERNAL_SUPER_STATE_DECLARATION = eINSTANCE.getSuperStateDeclarationView_InternalSuperStateDeclaration();

		/**
		 * The meta object literal for the '<em><b>Get Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_DECLARATION_VIEW___GET_DECLARATION_TYPE = eINSTANCE.getSuperStateDeclarationView__GetDeclarationType();

		/**
		 * The meta object literal for the '<em><b>Set Declaration Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_DECLARATION_VIEW___SET_DECLARATION_TYPE__STRING = eINSTANCE.getSuperStateDeclarationView__SetDeclarationType__String();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_DECLARATION_VIEW___GET_NAME = eINSTANCE.getSuperStateDeclarationView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPER_STATE_DECLARATION_VIEW___SET_NAME__STRING = eINSTANCE.getSuperStateDeclarationView__SetName__String();

	}

} //ViewsPackage

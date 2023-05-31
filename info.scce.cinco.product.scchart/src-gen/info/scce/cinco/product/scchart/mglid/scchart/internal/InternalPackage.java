/**
 */
package info.scce.cinco.product.scchart.mglid.scchart.internal;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFactory
 * @model kind="package"
 * @generated
 */
public interface InternalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "internal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/scchart/mglid/internal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scchart-internal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalPackage eINSTANCE = info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateImpl <em>Root State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRootState()
	 * @generated
	 */
	int INTERNAL_ROOT_STATE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE__DECLARATION = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Root State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Root State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateRegionImpl <em>Super State Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateRegionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuperStateRegion()
	 * @generated
	 */
	int INTERNAL_SUPER_STATE_REGION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION__REGION_ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Super State Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super State Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_REGION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateImpl <em>Sub Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSubSuperState()
	 * @generated
	 */
	int INTERNAL_SUB_SUPER_STATE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE__DECLARATION = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Sub Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitilalSubSuperStateImpl <em>Initilal Sub Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitilalSubSuperStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitilalSubSuperState()
	 * @generated
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__ID = INTERNAL_SUB_SUPER_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__CONTAINER = INTERNAL_SUB_SUPER_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__ELEMENT = INTERNAL_SUB_SUPER_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__X = INTERNAL_SUB_SUPER_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__Y = INTERNAL_SUB_SUPER_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__HEIGHT = INTERNAL_SUB_SUPER_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__WIDTH = INTERNAL_SUB_SUPER_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__INCOMING = INTERNAL_SUB_SUPER_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__OUTGOING = INTERNAL_SUB_SUPER_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__MODEL_ELEMENTS = INTERNAL_SUB_SUPER_STATE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__LABEL = INTERNAL_SUB_SUPER_STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE__DECLARATION = INTERNAL_SUB_SUPER_STATE__DECLARATION;

	/**
	 * The number of structural features of the '<em>Initilal Sub Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE_FEATURE_COUNT = INTERNAL_SUB_SUPER_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___EQUALS__OBJECT = INTERNAL_SUB_SUPER_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___HASH_CODE = INTERNAL_SUB_SUPER_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___SAVE = INTERNAL_SUB_SUPER_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_ELEMENT = INTERNAL_SUB_SUPER_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_ROOT_ELEMENT = INTERNAL_SUB_SUPER_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SUCCESSORS = INTERNAL_SUB_SUPER_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SUB_SUPER_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_PREDECESSORS = INTERNAL_SUB_SUPER_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SUB_SUPER_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INCOMING__CLASS = INTERNAL_SUB_SUPER_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_OUTGOING__CLASS = INTERNAL_SUB_SUPER_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SUB_SUPER_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___CAN_START__CLASS = INTERNAL_SUB_SUPER_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___CAN_END__CLASS = INTERNAL_SUB_SUPER_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___CAN_CONTAIN__CLASS = INTERNAL_SUB_SUPER_STATE___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___CAN_CONTAIN_NODES__ELIST = INTERNAL_SUB_SUPER_STATE___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_CONTAINER_ELEMENT = INTERNAL_SUB_SUPER_STATE___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___CAN_CONTAIN__ELIST = INTERNAL_SUB_SUPER_STATE___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Initilal Sub Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUB_SUPER_STATE_OPERATION_COUNT = INTERNAL_SUB_SUPER_STATE_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateRegionImpl <em>Sub Super State Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateRegionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSubSuperStateRegion()
	 * @generated
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Region ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION__REGION_ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Super State Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub Super State Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_REGION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationNodeImpl <em>Super State Declaration Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationNodeImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuperStateDeclarationNode()
	 * @generated
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__DECLARATION_TYPE = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__INPUT_OUTPUT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__NAME = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Super State Declaration Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The number of operations of the '<em>Super State Declaration Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateDeclarationNodeImpl <em>Sub Super State Declaration Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateDeclarationNodeImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSubSuperStateDeclarationNode()
	 * @generated
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__DECLARATION_TYPE = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__NAME = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Super State Declaration Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The number of operations of the '<em>Sub Super State Declaration Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSimpleStateImpl <em>Simple State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSimpleStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSimpleState()
	 * @generated
	 */
	int INTERNAL_SIMPLE_STATE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Simple State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitialState()
	 * @generated
	 */
	int INTERNAL_INITIAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__ID = INTERNAL_SIMPLE_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__CONTAINER = INTERNAL_SIMPLE_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__ELEMENT = INTERNAL_SIMPLE_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__X = INTERNAL_SIMPLE_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__Y = INTERNAL_SIMPLE_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__HEIGHT = INTERNAL_SIMPLE_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__WIDTH = INTERNAL_SIMPLE_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__INCOMING = INTERNAL_SIMPLE_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__OUTGOING = INTERNAL_SIMPLE_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE__LABEL = INTERNAL_SIMPLE_STATE__LABEL;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE_FEATURE_COUNT = INTERNAL_SIMPLE_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___EQUALS__OBJECT = INTERNAL_SIMPLE_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___HASH_CODE = INTERNAL_SIMPLE_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___SAVE = INTERNAL_SIMPLE_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_ROOT_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUCCESSORS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_PREDECESSORS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INCOMING__CLASS = INTERNAL_SIMPLE_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_OUTGOING__CLASS = INTERNAL_SIMPLE_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SIMPLE_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___CAN_START__CLASS = INTERNAL_SIMPLE_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___CAN_END__CLASS = INTERNAL_SIMPLE_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE_OPERATION_COUNT = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalFinalState()
	 * @generated
	 */
	int INTERNAL_FINAL_STATE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__ID = INTERNAL_SIMPLE_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__CONTAINER = INTERNAL_SIMPLE_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__ELEMENT = INTERNAL_SIMPLE_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__X = INTERNAL_SIMPLE_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__Y = INTERNAL_SIMPLE_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__HEIGHT = INTERNAL_SIMPLE_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__WIDTH = INTERNAL_SIMPLE_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__INCOMING = INTERNAL_SIMPLE_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__OUTGOING = INTERNAL_SIMPLE_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE__LABEL = INTERNAL_SIMPLE_STATE__LABEL;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE_FEATURE_COUNT = INTERNAL_SIMPLE_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___EQUALS__OBJECT = INTERNAL_SIMPLE_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___HASH_CODE = INTERNAL_SIMPLE_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___SAVE = INTERNAL_SIMPLE_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_ROOT_ELEMENT = INTERNAL_SIMPLE_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUCCESSORS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_PREDECESSORS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SIMPLE_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INCOMING__CLASS = INTERNAL_SIMPLE_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_OUTGOING__CLASS = INTERNAL_SIMPLE_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SIMPLE_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___CAN_START__CLASS = INTERNAL_SIMPLE_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___CAN_END__CLASS = INTERNAL_SIMPLE_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE_OPERATION_COUNT = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConnectorImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalConnector()
	 * @generated
	 */
	int INTERNAL_CONNECTOR = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUB_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUB_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalTransition()
	 * @generated
	 */
	int INTERNAL_TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__ID = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_EDGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__BENDPOINTS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__DECORATORS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__DECORATORS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__ACTION = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__TRIGGER = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strong Abort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__STRONG_ABORT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__PRIORITY = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Immediate transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__IMMEDIATE_TRANSITION = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__TERMINATION = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__HISTORY = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___GET_SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___GET_TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___SET_SOURCE_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___SET_TARGET_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION___ADD_BENDPOINT__INT_INT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTransitionImpl <em>Immediate Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalImmediateTransition()
	 * @generated
	 */
	int INTERNAL_IMMEDIATE_TRANSITION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__ID = INTERNAL_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__CONTAINER = INTERNAL_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__ELEMENT = INTERNAL_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__SOURCE_ELEMENT = INTERNAL_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__TARGET_ELEMENT = INTERNAL_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__BENDPOINTS = INTERNAL_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__DECORATORS = INTERNAL_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__ACTION = INTERNAL_TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__TRIGGER = INTERNAL_TRANSITION__TRIGGER;

	/**
	 * The feature id for the '<em><b>Strong Abort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__STRONG_ABORT = INTERNAL_TRANSITION__STRONG_ABORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__PRIORITY = INTERNAL_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Immediate transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__IMMEDIATE_TRANSITION = INTERNAL_TRANSITION__IMMEDIATE_TRANSITION;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__TERMINATION = INTERNAL_TRANSITION__TERMINATION;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__HISTORY = INTERNAL_TRANSITION__HISTORY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION__LABEL = INTERNAL_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Immediate Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION_FEATURE_COUNT = INTERNAL_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___EQUALS__OBJECT = INTERNAL_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___HASH_CODE = INTERNAL_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___SAVE = INTERNAL_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___GET_ELEMENT = INTERNAL_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Immediate Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TRANSITION_OPERATION_COUNT = INTERNAL_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTerminationTransitionImpl <em>Immediate Termination Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTerminationTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalImmediateTerminationTransition()
	 * @generated
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__ID = INTERNAL_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__CONTAINER = INTERNAL_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__ELEMENT = INTERNAL_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__SOURCE_ELEMENT = INTERNAL_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__TARGET_ELEMENT = INTERNAL_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__BENDPOINTS = INTERNAL_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__DECORATORS = INTERNAL_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__ACTION = INTERNAL_TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__TRIGGER = INTERNAL_TRANSITION__TRIGGER;

	/**
	 * The feature id for the '<em><b>Strong Abort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__STRONG_ABORT = INTERNAL_TRANSITION__STRONG_ABORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__PRIORITY = INTERNAL_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Immediate transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__IMMEDIATE_TRANSITION = INTERNAL_TRANSITION__IMMEDIATE_TRANSITION;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__TERMINATION = INTERNAL_TRANSITION__TERMINATION;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION__HISTORY = INTERNAL_TRANSITION__HISTORY;

	/**
	 * The number of structural features of the '<em>Immediate Termination Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION_FEATURE_COUNT = INTERNAL_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___EQUALS__OBJECT = INTERNAL_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___HASH_CODE = INTERNAL_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___SAVE = INTERNAL_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___GET_ELEMENT = INTERNAL_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Immediate Termination Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION_OPERATION_COUNT = INTERNAL_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalWeakAbortTransitionImpl <em>Weak Abort Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalWeakAbortTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalWeakAbortTransition()
	 * @generated
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__ID = INTERNAL_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__CONTAINER = INTERNAL_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__ELEMENT = INTERNAL_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__SOURCE_ELEMENT = INTERNAL_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__TARGET_ELEMENT = INTERNAL_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__BENDPOINTS = INTERNAL_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__DECORATORS = INTERNAL_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__ACTION = INTERNAL_TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__TRIGGER = INTERNAL_TRANSITION__TRIGGER;

	/**
	 * The feature id for the '<em><b>Strong Abort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__STRONG_ABORT = INTERNAL_TRANSITION__STRONG_ABORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__PRIORITY = INTERNAL_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Immediate transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__IMMEDIATE_TRANSITION = INTERNAL_TRANSITION__IMMEDIATE_TRANSITION;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__TERMINATION = INTERNAL_TRANSITION__TERMINATION;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION__HISTORY = INTERNAL_TRANSITION__HISTORY;

	/**
	 * The number of structural features of the '<em>Weak Abort Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION_FEATURE_COUNT = INTERNAL_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___EQUALS__OBJECT = INTERNAL_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___HASH_CODE = INTERNAL_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___SAVE = INTERNAL_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___GET_ELEMENT = INTERNAL_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Weak Abort Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TRANSITION_OPERATION_COUNT = INTERNAL_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortTransitionImpl <em>Strong Abort Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortTransition()
	 * @generated
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__ID = INTERNAL_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__CONTAINER = INTERNAL_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__ELEMENT = INTERNAL_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__SOURCE_ELEMENT = INTERNAL_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__TARGET_ELEMENT = INTERNAL_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__BENDPOINTS = INTERNAL_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__DECORATORS = INTERNAL_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__ACTION = INTERNAL_TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__TRIGGER = INTERNAL_TRANSITION__TRIGGER;

	/**
	 * The feature id for the '<em><b>Strong Abort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__STRONG_ABORT = INTERNAL_TRANSITION__STRONG_ABORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__PRIORITY = INTERNAL_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Immediate transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__IMMEDIATE_TRANSITION = INTERNAL_TRANSITION__IMMEDIATE_TRANSITION;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__TERMINATION = INTERNAL_TRANSITION__TERMINATION;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION__HISTORY = INTERNAL_TRANSITION__HISTORY;

	/**
	 * The number of structural features of the '<em>Strong Abort Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION_FEATURE_COUNT = INTERNAL_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___EQUALS__OBJECT = INTERNAL_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___HASH_CODE = INTERNAL_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___SAVE = INTERNAL_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___GET_ELEMENT = INTERNAL_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Strong Abort Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STRONG_ABORT_TRANSITION_OPERATION_COUNT = INTERNAL_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalWeakAbortTerminationTransitionImpl <em>Weak Abort Termination Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalWeakAbortTerminationTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalWeakAbortTerminationTransition()
	 * @generated
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__ID = INTERNAL_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__CONTAINER = INTERNAL_TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__ELEMENT = INTERNAL_TRANSITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__SOURCE_ELEMENT = INTERNAL_TRANSITION__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__TARGET_ELEMENT = INTERNAL_TRANSITION__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__BENDPOINTS = INTERNAL_TRANSITION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__DECORATORS = INTERNAL_TRANSITION__DECORATORS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__ACTION = INTERNAL_TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__TRIGGER = INTERNAL_TRANSITION__TRIGGER;

	/**
	 * The feature id for the '<em><b>Strong Abort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__STRONG_ABORT = INTERNAL_TRANSITION__STRONG_ABORT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__PRIORITY = INTERNAL_TRANSITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Immediate transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__IMMEDIATE_TRANSITION = INTERNAL_TRANSITION__IMMEDIATE_TRANSITION;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__TERMINATION = INTERNAL_TRANSITION__TERMINATION;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION__HISTORY = INTERNAL_TRANSITION__HISTORY;

	/**
	 * The number of structural features of the '<em>Weak Abort Termination Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION_FEATURE_COUNT = INTERNAL_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___EQUALS__OBJECT = INTERNAL_TRANSITION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___HASH_CODE = INTERNAL_TRANSITION___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___SAVE = INTERNAL_TRANSITION___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___GET_ELEMENT = INTERNAL_TRANSITION___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___GET_ROOT_ELEMENT = INTERNAL_TRANSITION___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___GET_SOURCE_ELEMENT = INTERNAL_TRANSITION___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___GET_TARGET_ELEMENT = INTERNAL_TRANSITION___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___SET_SOURCE_ELEMENT__NODE = INTERNAL_TRANSITION___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___SET_TARGET_ELEMENT__NODE = INTERNAL_TRANSITION___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION___ADD_BENDPOINT__INT_INT = INTERNAL_TRANSITION___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Weak Abort Termination Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION_OPERATION_COUNT = INTERNAL_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDefferedTransitionImpl <em>Deffered Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDefferedTransitionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalDefferedTransition()
	 * @generated
	 */
	int INTERNAL_DEFFERED_TRANSITION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION__ID = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_EDGE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__ELEMENT;

	/**
	 * The feature id for the '<em><b>source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION__SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION__TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION__BENDPOINTS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION__DECORATORS = graphmodel.internal.InternalPackage.INTERNAL_EDGE__DECORATORS;

	/**
	 * The number of structural features of the '<em>Deffered Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___GET_SOURCE_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_SOURCE_ELEMENT;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___GET_TARGET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___GET_TARGET_ELEMENT;

	/**
	 * The operation id for the '<em>Set Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___SET_SOURCE_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_SOURCE_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Set Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___SET_TARGET_ELEMENT__NODE = graphmodel.internal.InternalPackage.INTERNAL_EDGE___SET_TARGET_ELEMENT__NODE;

	/**
	 * The operation id for the '<em>Add Bendpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION___ADD_BENDPOINT__INT_INT = graphmodel.internal.InternalPackage.INTERNAL_EDGE___ADD_BENDPOINT__INT_INT;

	/**
	 * The number of operations of the '<em>Deffered Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DEFFERED_TRANSITION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartImpl <em>SC Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSCChart()
	 * @generated
	 */
	int INTERNAL_SC_CHART = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART__ID = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL__ELEMENT;

	/**
	 * The number of structural features of the '<em>SC Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___SAVE = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SC Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SC_CHART_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_GRAPH_MODEL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationImpl <em>Super State Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuperStateDeclaration()
	 * @generated
	 */
	int INTERNAL_SUPER_STATE_DECLARATION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION__ID = graphmodel.internal.InternalPackage.INTERNAL_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION__DECLARATION_TYPE = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION__INPUT_OUTPUT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION__NAME = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Super State Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_TYPE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_TYPE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_TYPE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_TYPE___GET_ELEMENT;

	/**
	 * The number of operations of the '<em>Super State Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateDeclarationImpl <em>Sub Super State Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateDeclarationImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSubSuperStateDeclaration()
	 * @generated
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION__ID = graphmodel.internal.InternalPackage.INTERNAL_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION__DECLARATION_TYPE = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION__NAME = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Super State Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_TYPE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_TYPE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_TYPE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_TYPE___GET_ELEMENT;

	/**
	 * The number of operations of the '<em>Sub Super State Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUB_SUPER_STATE_DECLARATION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState <em>Root State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState
	 * @generated
	 */
	EClass getInternalRootState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getLabel()
	 * @see #getInternalRootState()
	 * @generated
	 */
	EAttribute getInternalRootState_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getDeclaration()
	 * @see #getInternalRootState()
	 * @generated
	 */
	EReference getInternalRootState_Declaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalRootState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalRootState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSubSuperStateSuccessors() <em>Get Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitilalSubSuperStateSuccessors() <em>Get Initilal Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitilalSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitilalSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion <em>Super State Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State Region</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion
	 * @generated
	 */
	EClass getInternalSuperStateRegion();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getLabel()
	 * @see #getInternalSuperStateRegion()
	 * @generated
	 */
	EAttribute getInternalSuperStateRegion_Label();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getRegionID <em>Region ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region ID</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getRegionID()
	 * @see #getInternalSuperStateRegion()
	 * @generated
	 */
	EAttribute getInternalSuperStateRegion_RegionID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateRegion#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSuperStateRegion__GetContainmentConstraints();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState <em>Sub Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState
	 * @generated
	 */
	EClass getInternalSubSuperState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getLabel()
	 * @see #getInternalSubSuperState()
	 * @generated
	 */
	EAttribute getInternalSubSuperState_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getDeclaration()
	 * @see #getInternalSubSuperState()
	 * @generated
	 */
	EReference getInternalSubSuperState_Declaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getSubSuperStatePredecessors() <em>Get Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getInitilalSubSuperStatePredecessors() <em>Get Initilal Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getInitilalSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetInitilalSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getSubSuperStateSuccessors() <em>Get Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getInitilalSubSuperStateSuccessors() <em>Get Initilal Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getInitilalSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetInitilalSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalSubSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState <em>Initilal Sub Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initilal Sub Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState
	 * @generated
	 */
	EClass getInternalInitilalSubSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getSubSuperStatePredecessors() <em>Get Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getInitilalSubSuperStatePredecessors() <em>Get Initilal Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getInitilalSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetInitilalSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getSubSuperStateSuccessors() <em>Get Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getInitilalSubSuperStateSuccessors() <em>Get Initilal Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getInitilalSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetInitilalSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSubSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSubSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion <em>Sub Super State Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Super State Region</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion
	 * @generated
	 */
	EClass getInternalSubSuperStateRegion();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion#getRegionID <em>Region ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region ID</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion#getRegionID()
	 * @see #getInternalSubSuperStateRegion()
	 * @generated
	 */
	EAttribute getInternalSubSuperStateRegion_RegionID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateRegion#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSubSuperStateRegion__GetContainmentConstraints();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode <em>Super State Declaration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State Declaration Node</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode
	 * @generated
	 */
	EClass getInternalSuperStateDeclarationNode();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode#getDeclarationType()
	 * @see #getInternalSuperStateDeclarationNode()
	 * @generated
	 */
	EAttribute getInternalSuperStateDeclarationNode_DeclarationType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode#getInputOutput <em>Input Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Output</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode#getInputOutput()
	 * @see #getInternalSuperStateDeclarationNode()
	 * @generated
	 */
	EAttribute getInternalSuperStateDeclarationNode_InputOutput();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode#getName()
	 * @see #getInternalSuperStateDeclarationNode()
	 * @generated
	 */
	EAttribute getInternalSuperStateDeclarationNode_Name();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode <em>Sub Super State Declaration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Super State Declaration Node</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode
	 * @generated
	 */
	EClass getInternalSubSuperStateDeclarationNode();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode#getDeclarationType()
	 * @see #getInternalSubSuperStateDeclarationNode()
	 * @generated
	 */
	EAttribute getInternalSubSuperStateDeclarationNode_DeclarationType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclarationNode#getName()
	 * @see #getInternalSubSuperStateDeclarationNode()
	 * @generated
	 */
	EAttribute getInternalSubSuperStateDeclarationNode_Name();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState <em>Simple State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState
	 * @generated
	 */
	EClass getInternalSimpleState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getLabel()
	 * @see #getInternalSimpleState()
	 * @generated
	 */
	EAttribute getInternalSimpleState_Label();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSubSuperStatePredecessors() <em>Get Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitilalSubSuperStatePredecessors() <em>Get Initilal Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitilalSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitilalSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSubSuperStateSuccessors() <em>Get Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitilalSubSuperStateSuccessors() <em>Get Initilal Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitilalSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitilalSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState
	 * @generated
	 */
	EClass getInternalInitialState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitialState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSubSuperStatePredecessors() <em>Get Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitilalSubSuperStatePredecessors() <em>Get Initilal Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitilalSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitilalSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSubSuperStateSuccessors() <em>Get Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitilalSubSuperStateSuccessors() <em>Get Initilal Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitilalSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitilalSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState
	 * @generated
	 */
	EClass getInternalFinalState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalFinalState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSubSuperStatePredecessors() <em>Get Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitilalSubSuperStatePredecessors() <em>Get Initilal Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitilalSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitilalSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSubSuperStateSuccessors() <em>Get Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitilalSubSuperStateSuccessors() <em>Get Initilal Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitilalSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitilalSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector
	 * @generated
	 */
	EClass getInternalConnector();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalConnector__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalConnector__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSubSuperStatePredecessors() <em>Get Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitilalSubSuperStatePredecessors() <em>Get Initilal Sub Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitilalSubSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitilalSubSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSubSuperStateSuccessors() <em>Get Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitilalSubSuperStateSuccessors() <em>Get Initilal Sub Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Sub Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitilalSubSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitilalSubSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition
	 * @generated
	 */
	EClass getInternalTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getAction()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Action();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getTrigger()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isStrong_Abort <em>Strong Abort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strong Abort</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isStrong_Abort()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Strong_Abort();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#getPriority()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Priority();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isImmediate_transition <em>Immediate transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isImmediate_transition()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Immediate_transition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isTermination <em>Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isTermination()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Termination();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition#isHistory()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_History();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition
	 * @generated
	 */
	EClass getInternalImmediateTransition();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition#getLabel()
	 * @see #getInternalImmediateTransition()
	 * @generated
	 */
	EAttribute getInternalImmediateTransition_Label();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTerminationTransition <em>Immediate Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTerminationTransition
	 * @generated
	 */
	EClass getInternalImmediateTerminationTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTransition <em>Weak Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weak Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTransition
	 * @generated
	 */
	EClass getInternalWeakAbortTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition <em>Strong Abort Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Abort Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition
	 * @generated
	 */
	EClass getInternalStrongAbortTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTerminationTransition <em>Weak Abort Termination Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weak Abort Termination Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTerminationTransition
	 * @generated
	 */
	EClass getInternalWeakAbortTerminationTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDefferedTransition <em>Deffered Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deffered Transition</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDefferedTransition
	 * @generated
	 */
	EClass getInternalDefferedTransition();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart <em>SC Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Chart</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart
	 * @generated
	 */
	EClass getInternalSCChart();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSCChart__GetContainmentConstraints();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration <em>Super State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration
	 * @generated
	 */
	EClass getInternalSuperStateDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration#getDeclarationType()
	 * @see #getInternalSuperStateDeclaration()
	 * @generated
	 */
	EAttribute getInternalSuperStateDeclaration_DeclarationType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration#getInputOutput <em>Input Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Output</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration#getInputOutput()
	 * @see #getInternalSuperStateDeclaration()
	 * @generated
	 */
	EAttribute getInternalSuperStateDeclaration_InputOutput();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclaration#getName()
	 * @see #getInternalSuperStateDeclaration()
	 * @generated
	 */
	EAttribute getInternalSuperStateDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration <em>Sub Super State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Super State Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration
	 * @generated
	 */
	EClass getInternalSubSuperStateDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration#getDeclarationType()
	 * @see #getInternalSubSuperStateDeclaration()
	 * @generated
	 */
	EAttribute getInternalSubSuperStateDeclaration_DeclarationType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSubSuperStateDeclaration#getName()
	 * @see #getInternalSubSuperStateDeclaration()
	 * @generated
	 */
	EAttribute getInternalSubSuperStateDeclaration_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InternalFactory getInternalFactory();

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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateImpl <em>Root State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRootState()
		 * @generated
		 */
		EClass INTERNAL_ROOT_STATE = eINSTANCE.getInternalRootState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ROOT_STATE__LABEL = eINSTANCE.getInternalRootState_Label();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ROOT_STATE__DECLARATION = eINSTANCE.getInternalRootState_Declaration();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalRootState__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalRootState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetInitilalSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalRootState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateRegionImpl <em>Super State Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateRegionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuperStateRegion()
		 * @generated
		 */
		EClass INTERNAL_SUPER_STATE_REGION = eINSTANCE.getInternalSuperStateRegion();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_REGION__LABEL = eINSTANCE.getInternalSuperStateRegion_Label();

		/**
		 * The meta object literal for the '<em><b>Region ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_REGION__REGION_ID = eINSTANCE.getInternalSuperStateRegion_RegionID();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE_REGION___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalSuperStateRegion__GetContainmentConstraints();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateImpl <em>Sub Super State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSubSuperState()
		 * @generated
		 */
		EClass INTERNAL_SUB_SUPER_STATE = eINSTANCE.getInternalSubSuperState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUB_SUPER_STATE__LABEL = eINSTANCE.getInternalSubSuperState_Label();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_SUB_SUPER_STATE__DECLARATION = eINSTANCE.getInternalSubSuperState_Declaration();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalSubSuperState__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalSubSuperState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalSubSuperState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalSubSuperState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSubSuperState__GetSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSubSuperState__GetInitilalSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalSubSuperState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalSubSuperState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalSubSuperState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalSubSuperState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSubSuperState__GetSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSubSuperState__GetInitilalSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalSubSuperState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalSubSuperState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalSubSuperState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalSubSuperState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitilalSubSuperStateImpl <em>Initilal Sub Super State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitilalSubSuperStateImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitilalSubSuperState()
		 * @generated
		 */
		EClass INTERNAL_INITILAL_SUB_SUPER_STATE = eINSTANCE.getInternalInitilalSubSuperState();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalInitilalSubSuperState__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalInitilalSubSuperState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalInitilalSubSuperState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetInitilalSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetInitilalSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUB_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalInitilalSubSuperState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateRegionImpl <em>Sub Super State Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateRegionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSubSuperStateRegion()
		 * @generated
		 */
		EClass INTERNAL_SUB_SUPER_STATE_REGION = eINSTANCE.getInternalSubSuperStateRegion();

		/**
		 * The meta object literal for the '<em><b>Region ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUB_SUPER_STATE_REGION__REGION_ID = eINSTANCE.getInternalSubSuperStateRegion_RegionID();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUB_SUPER_STATE_REGION___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalSubSuperStateRegion__GetContainmentConstraints();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationNodeImpl <em>Super State Declaration Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationNodeImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuperStateDeclarationNode()
		 * @generated
		 */
		EClass INTERNAL_SUPER_STATE_DECLARATION_NODE = eINSTANCE.getInternalSuperStateDeclarationNode();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_DECLARATION_NODE__DECLARATION_TYPE = eINSTANCE.getInternalSuperStateDeclarationNode_DeclarationType();

		/**
		 * The meta object literal for the '<em><b>Input Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_DECLARATION_NODE__INPUT_OUTPUT = eINSTANCE.getInternalSuperStateDeclarationNode_InputOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_DECLARATION_NODE__NAME = eINSTANCE.getInternalSuperStateDeclarationNode_Name();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateDeclarationNodeImpl <em>Sub Super State Declaration Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateDeclarationNodeImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSubSuperStateDeclarationNode()
		 * @generated
		 */
		EClass INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE = eINSTANCE.getInternalSubSuperStateDeclarationNode();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__DECLARATION_TYPE = eINSTANCE.getInternalSubSuperStateDeclarationNode_DeclarationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUB_SUPER_STATE_DECLARATION_NODE__NAME = eINSTANCE.getInternalSubSuperStateDeclarationNode_Name();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSimpleStateImpl <em>Simple State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSimpleStateImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSimpleState()
		 * @generated
		 */
		EClass INTERNAL_SIMPLE_STATE = eINSTANCE.getInternalSimpleState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SIMPLE_STATE__LABEL = eINSTANCE.getInternalSimpleState_Label();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalSimpleState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalSimpleState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetInitilalSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetInitilalSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitialStateImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitialState()
		 * @generated
		 */
		EClass INTERNAL_INITIAL_STATE = eINSTANCE.getInternalInitialState();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalInitialState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalInitialState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetInitilalSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalInitialState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetInitilalSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalInitialState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalFinalStateImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalFinalState()
		 * @generated
		 */
		EClass INTERNAL_FINAL_STATE = eINSTANCE.getInternalFinalState();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalFinalState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalFinalState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetInitilalSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalFinalState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetInitilalSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalFinalState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalConnectorImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalConnector()
		 * @generated
		 */
		EClass INTERNAL_CONNECTOR = eINSTANCE.getInternalConnector();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalConnector__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalConnector__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITILAL_SUB_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetInitilalSubSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalConnector__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Sub Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITILAL_SUB_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetInitilalSubSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalConnector__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalTransitionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalTransition()
		 * @generated
		 */
		EClass INTERNAL_TRANSITION = eINSTANCE.getInternalTransition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__ACTION = eINSTANCE.getInternalTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__TRIGGER = eINSTANCE.getInternalTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Strong Abort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__STRONG_ABORT = eINSTANCE.getInternalTransition_Strong_Abort();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__PRIORITY = eINSTANCE.getInternalTransition_Priority();

		/**
		 * The meta object literal for the '<em><b>Immediate transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__IMMEDIATE_TRANSITION = eINSTANCE.getInternalTransition_Immediate_transition();

		/**
		 * The meta object literal for the '<em><b>Termination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__TERMINATION = eINSTANCE.getInternalTransition_Termination();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__HISTORY = eINSTANCE.getInternalTransition_History();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTransitionImpl <em>Immediate Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTransitionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalImmediateTransition()
		 * @generated
		 */
		EClass INTERNAL_IMMEDIATE_TRANSITION = eINSTANCE.getInternalImmediateTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IMMEDIATE_TRANSITION__LABEL = eINSTANCE.getInternalImmediateTransition_Label();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTerminationTransitionImpl <em>Immediate Termination Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalImmediateTerminationTransitionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalImmediateTerminationTransition()
		 * @generated
		 */
		EClass INTERNAL_IMMEDIATE_TERMINATION_TRANSITION = eINSTANCE.getInternalImmediateTerminationTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalWeakAbortTransitionImpl <em>Weak Abort Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalWeakAbortTransitionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalWeakAbortTransition()
		 * @generated
		 */
		EClass INTERNAL_WEAK_ABORT_TRANSITION = eINSTANCE.getInternalWeakAbortTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortTransitionImpl <em>Strong Abort Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalStrongAbortTransitionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalStrongAbortTransition()
		 * @generated
		 */
		EClass INTERNAL_STRONG_ABORT_TRANSITION = eINSTANCE.getInternalStrongAbortTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalWeakAbortTerminationTransitionImpl <em>Weak Abort Termination Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalWeakAbortTerminationTransitionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalWeakAbortTerminationTransition()
		 * @generated
		 */
		EClass INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION = eINSTANCE.getInternalWeakAbortTerminationTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDefferedTransitionImpl <em>Deffered Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalDefferedTransitionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalDefferedTransition()
		 * @generated
		 */
		EClass INTERNAL_DEFFERED_TRANSITION = eINSTANCE.getInternalDefferedTransition();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartImpl <em>SC Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSCChartImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSCChart()
		 * @generated
		 */
		EClass INTERNAL_SC_CHART = eINSTANCE.getInternalSCChart();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SC_CHART___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalSCChart__GetContainmentConstraints();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationImpl <em>Super State Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateDeclarationImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuperStateDeclaration()
		 * @generated
		 */
		EClass INTERNAL_SUPER_STATE_DECLARATION = eINSTANCE.getInternalSuperStateDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_DECLARATION__DECLARATION_TYPE = eINSTANCE.getInternalSuperStateDeclaration_DeclarationType();

		/**
		 * The meta object literal for the '<em><b>Input Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_DECLARATION__INPUT_OUTPUT = eINSTANCE.getInternalSuperStateDeclaration_InputOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_DECLARATION__NAME = eINSTANCE.getInternalSuperStateDeclaration_Name();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateDeclarationImpl <em>Sub Super State Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSubSuperStateDeclarationImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSubSuperStateDeclaration()
		 * @generated
		 */
		EClass INTERNAL_SUB_SUPER_STATE_DECLARATION = eINSTANCE.getInternalSubSuperStateDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUB_SUPER_STATE_DECLARATION__DECLARATION_TYPE = eINSTANCE.getInternalSubSuperStateDeclaration_DeclarationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUB_SUPER_STATE_DECLARATION__NAME = eINSTANCE.getInternalSubSuperStateDeclaration_Name();

	}

} //InternalPackage

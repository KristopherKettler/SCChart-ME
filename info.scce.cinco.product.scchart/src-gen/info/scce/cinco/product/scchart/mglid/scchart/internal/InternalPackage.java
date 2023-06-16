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
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 3;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRegionImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRegion()
	 * @generated
	 */
	int INTERNAL_REGION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__REGION_ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION__UUID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REGION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl <em>Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuperState()
	 * @generated
	 */
	int INTERNAL_SUPER_STATE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__ID = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__X = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__Y = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__MODEL_ELEMENTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__LABEL = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE__DECLARATION = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_CONTAIN__CLASS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONTAINER_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___CAN_CONTAIN__ELIST = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitilalSuperStateImpl <em>Initilal Super State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitilalSuperStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitilalSuperState()
	 * @generated
	 */
	int INTERNAL_INITILAL_SUPER_STATE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__ID = INTERNAL_SUPER_STATE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__CONTAINER = INTERNAL_SUPER_STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__ELEMENT = INTERNAL_SUPER_STATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__X = INTERNAL_SUPER_STATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__Y = INTERNAL_SUPER_STATE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__HEIGHT = INTERNAL_SUPER_STATE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__WIDTH = INTERNAL_SUPER_STATE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__INCOMING = INTERNAL_SUPER_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__OUTGOING = INTERNAL_SUPER_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__MODEL_ELEMENTS = INTERNAL_SUPER_STATE__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__LABEL = INTERNAL_SUPER_STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE__DECLARATION = INTERNAL_SUPER_STATE__DECLARATION;

	/**
	 * The number of structural features of the '<em>Initilal Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE_FEATURE_COUNT = INTERNAL_SUPER_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___EQUALS__OBJECT = INTERNAL_SUPER_STATE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___HASH_CODE = INTERNAL_SUPER_STATE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___SAVE = INTERNAL_SUPER_STATE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_ELEMENT = INTERNAL_SUPER_STATE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_ROOT_ELEMENT = INTERNAL_SUPER_STATE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SUCCESSORS = INTERNAL_SUPER_STATE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SUCCESSORS__CLASS = INTERNAL_SUPER_STATE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_PREDECESSORS = INTERNAL_SUPER_STATE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_PREDECESSORS__CLASS = INTERNAL_SUPER_STATE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INCOMING__CLASS = INTERNAL_SUPER_STATE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_OUTGOING__CLASS = INTERNAL_SUPER_STATE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE = INTERNAL_SUPER_STATE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_START__CLASS = INTERNAL_SUPER_STATE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_END__CLASS = INTERNAL_SUPER_STATE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_CONTAIN__CLASS = INTERNAL_SUPER_STATE___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Can Contain Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN_NODES__ELIST;

	/**
	 * The operation id for the '<em>Get Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_CONTAINER_ELEMENT = INTERNAL_SUPER_STATE___GET_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___CAN_CONTAIN__ELIST = INTERNAL_SUPER_STATE___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Get Containment Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Simple State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Initial State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Final State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Connector Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Simple State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Initial State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Final State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Connector Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = INTERNAL_SUPER_STATE_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Initilal Super State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITILAL_SUPER_STATE_OPERATION_COUNT = INTERNAL_SUPER_STATE_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationNodeImpl <em>Root State Declaration Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationNodeImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRootStateDeclarationNode()
	 * @generated
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__ID = graphmodel.internal.InternalPackage.INTERNAL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__CONTAINER = graphmodel.internal.InternalPackage.INTERNAL_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE__ELEMENT;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__X = graphmodel.internal.InternalPackage.INTERNAL_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__Y = graphmodel.internal.InternalPackage.INTERNAL_NODE__Y;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__HEIGHT = graphmodel.internal.InternalPackage.INTERNAL_NODE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__WIDTH = graphmodel.internal.InternalPackage.INTERNAL_NODE__WIDTH;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__INCOMING = graphmodel.internal.InternalPackage.INTERNAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__OUTGOING = graphmodel.internal.InternalPackage.INTERNAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__DECLARATION_TYPE = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__INPUT_OUTPUT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE__NAME = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Root State Declaration Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___SAVE = graphmodel.internal.InternalPackage.INTERNAL_NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_ROOT_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_ROOT_ELEMENT;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_SUCCESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_PREDECESSORS__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_INCOMING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_OUTGOING__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___CAN_CONNECT__EDGE_NODE = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_OUTGOING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___GET_INCOMING_CONSTRAINTS = graphmodel.internal.InternalPackage.INTERNAL_NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___CAN_START__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE___CAN_END__CLASS = graphmodel.internal.InternalPackage.INTERNAL_NODE___CAN_END__CLASS;

	/**
	 * The number of operations of the '<em>Root State Declaration Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_NODE_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE__NAME = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Super State Declaration Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_NODE_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_NODE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSimpleStateImpl <em>Simple State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSimpleStateImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSimpleState()
	 * @generated
	 */
	int INTERNAL_SIMPLE_STATE = 6;

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
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

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
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 10;

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
	int INTERNAL_INITIAL_STATE = 7;

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
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

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
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INITIAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

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
	int INTERNAL_FINAL_STATE = 8;

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
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 4;

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
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = INTERNAL_SIMPLE_STATE_OPERATION_COUNT + 10;

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
	int INTERNAL_CONNECTOR = 9;

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
	 * The operation id for the '<em>Get Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITILAL_SUPER_STATE_PREDECESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 4;

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
	 * The operation id for the '<em>Get Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Initilal Super State Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CONNECTOR___GET_INITILAL_SUPER_STATE_SUCCESSORS = graphmodel.internal.InternalPackage.INTERNAL_NODE_OPERATION_COUNT + 10;

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
	int INTERNAL_TRANSITION = 10;

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
	int INTERNAL_IMMEDIATE_TRANSITION = 11;

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
	int INTERNAL_IMMEDIATE_TERMINATION_TRANSITION = 12;

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
	int INTERNAL_WEAK_ABORT_TRANSITION = 13;

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
	int INTERNAL_STRONG_ABORT_TRANSITION = 14;

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
	int INTERNAL_WEAK_ABORT_TERMINATION_TRANSITION = 15;

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
	int INTERNAL_DEFFERED_TRANSITION = 16;

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
	int INTERNAL_SC_CHART = 17;

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
	 * The meta object id for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationImpl <em>Root State Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationImpl
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRootStateDeclaration()
	 * @generated
	 */
	int INTERNAL_ROOT_STATE_DECLARATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION__ID = graphmodel.internal.InternalPackage.INTERNAL_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION__ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION__DECLARATION_TYPE = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION__INPUT_OUTPUT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION__NAME = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Root State Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION___EQUALS__OBJECT = graphmodel.internal.InternalPackage.INTERNAL_TYPE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION___HASH_CODE = graphmodel.internal.InternalPackage.INTERNAL_TYPE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION___SAVE = graphmodel.internal.InternalPackage.INTERNAL_TYPE___SAVE;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION___GET_ELEMENT = graphmodel.internal.InternalPackage.INTERNAL_TYPE___GET_ELEMENT;

	/**
	 * The number of operations of the '<em>Root State Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ROOT_STATE_DECLARATION_OPERATION_COUNT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION__NAME = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Super State Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUPER_STATE_DECLARATION_FEATURE_COUNT = graphmodel.internal.InternalPackage.INTERNAL_TYPE_FEATURE_COUNT + 2;

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
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalRootState__GetInitilalSuperStateSuccessors();

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
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion
	 * @generated
	 */
	EClass getInternalRegion();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getLabel()
	 * @see #getInternalRegion()
	 * @generated
	 */
	EAttribute getInternalRegion_Label();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getRegionID <em>Region ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region ID</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getRegionID()
	 * @see #getInternalRegion()
	 * @generated
	 */
	EAttribute getInternalRegion_RegionID();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getUuid()
	 * @see #getInternalRegion()
	 * @generated
	 */
	EAttribute getInternalRegion_Uuid();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalRegion__GetContainmentConstraints();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState <em>Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState
	 * @generated
	 */
	EClass getInternalSuperState();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getLabel()
	 * @see #getInternalSuperState()
	 * @generated
	 */
	EAttribute getInternalSuperState_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getDeclaration()
	 * @see #getInternalSuperState()
	 * @generated
	 */
	EReference getInternalSuperState_Declaration();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitilalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState <em>Initilal Super State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initilal Super State</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState
	 * @generated
	 */
	EClass getInternalInitilalSuperState();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getContainmentConstraints() <em>Get Containment Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containment Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getContainmentConstraints()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetContainmentConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getIncomingConstraints() <em>Get Incoming Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Incoming Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getIncomingConstraints()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetIncomingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getOutgoingConstraints() <em>Get Outgoing Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Outgoing Constraints</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getOutgoingConstraints()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetOutgoingConstraints();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getRootStatePredecessors() <em>Get Root State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getRootStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetRootStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetInitilalSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getSimpleStatePredecessors() <em>Get Simple State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getSimpleStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetSimpleStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getInitialStatePredecessors() <em>Get Initial State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getInitialStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetInitialStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getFinalStatePredecessors() <em>Get Final State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getFinalStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetFinalStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getConnectorPredecessors() <em>Get Connector Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getConnectorPredecessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetConnectorPredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetInitilalSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getSimpleStateSuccessors() <em>Get Simple State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getSimpleStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetSimpleStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getInitialStateSuccessors() <em>Get Initial State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initial State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getInitialStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetInitialStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getFinalStateSuccessors() <em>Get Final State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Final State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getFinalStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetFinalStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getConnectorSuccessors() <em>Get Connector Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connector Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState#getConnectorSuccessors()
	 * @generated
	 */
	EOperation getInternalInitilalSuperState__GetConnectorSuccessors();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode <em>Root State Declaration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State Declaration Node</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode
	 * @generated
	 */
	EClass getInternalRootStateDeclarationNode();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode#getDeclarationType()
	 * @see #getInternalRootStateDeclarationNode()
	 * @generated
	 */
	EAttribute getInternalRootStateDeclarationNode_DeclarationType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode#getInputOutput <em>Input Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Output</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode#getInputOutput()
	 * @see #getInternalRootStateDeclarationNode()
	 * @generated
	 */
	EAttribute getInternalRootStateDeclarationNode_InputOutput();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode#getName()
	 * @see #getInternalRootStateDeclarationNode()
	 * @generated
	 */
	EAttribute getInternalRootStateDeclarationNode_Name();

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
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitilalSuperStatePredecessors();

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
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalSimpleState__GetInitilalSuperStateSuccessors();

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
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitilalSuperStatePredecessors();

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
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalInitialState__GetInitilalSuperStateSuccessors();

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
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitilalSuperStatePredecessors();

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
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalFinalState__GetInitilalSuperStateSuccessors();

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
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSuperStatePredecessors() <em>Get Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSuperStatePredecessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitilalSuperStatePredecessors() <em>Get Initilal Super State Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Predecessors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitilalSuperStatePredecessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitilalSuperStatePredecessors();

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
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSuperStateSuccessors() <em>Get Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetSuperStateSuccessors();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitilalSuperStateSuccessors() <em>Get Initilal Super State Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Initilal Super State Successors</em>' operation.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector#getInitilalSuperStateSuccessors()
	 * @generated
	 */
	EOperation getInternalConnector__GetInitilalSuperStateSuccessors();

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
	 * Returns the meta object for class '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration <em>Root State Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root State Declaration</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration
	 * @generated
	 */
	EClass getInternalRootStateDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getDeclarationType()
	 * @see #getInternalRootStateDeclaration()
	 * @generated
	 */
	EAttribute getInternalRootStateDeclaration_DeclarationType();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getInputOutput <em>Input Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Output</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getInputOutput()
	 * @see #getInternalRootStateDeclaration()
	 * @generated
	 */
	EAttribute getInternalRootStateDeclaration_InputOutput();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration#getName()
	 * @see #getInternalRootStateDeclaration()
	 * @generated
	 */
	EAttribute getInternalRootStateDeclaration_Name();

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
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_ROOT_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalRootState__GetInitilalSuperStateSuccessors();

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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRegionImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRegion()
		 * @generated
		 */
		EClass INTERNAL_REGION = eINSTANCE.getInternalRegion();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REGION__LABEL = eINSTANCE.getInternalRegion_Label();

		/**
		 * The meta object literal for the '<em><b>Region ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REGION__REGION_ID = eINSTANCE.getInternalRegion_RegionID();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REGION__UUID = eINSTANCE.getInternalRegion_Uuid();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_REGION___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalRegion__GetContainmentConstraints();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl <em>Super State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalSuperStateImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalSuperState()
		 * @generated
		 */
		EClass INTERNAL_SUPER_STATE = eINSTANCE.getInternalSuperState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE__LABEL = eINSTANCE.getInternalSuperState_Label();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_SUPER_STATE__DECLARATION = eINSTANCE.getInternalSuperState_Declaration();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalSuperState__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalSuperState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalSuperState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetInitilalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalSuperState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalSuperState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalSuperState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalSuperState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitilalSuperStateImpl <em>Initilal Super State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalInitilalSuperStateImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalInitilalSuperState()
		 * @generated
		 */
		EClass INTERNAL_INITILAL_SUPER_STATE = eINSTANCE.getInternalInitilalSuperState();

		/**
		 * The meta object literal for the '<em><b>Get Containment Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_CONTAINMENT_CONSTRAINTS = eINSTANCE.getInternalInitilalSuperState__GetContainmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Incoming Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INCOMING_CONSTRAINTS = eINSTANCE.getInternalInitilalSuperState__GetIncomingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Outgoing Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_OUTGOING_CONSTRAINTS = eINSTANCE.getInternalInitilalSuperState__GetOutgoingConstraints();

		/**
		 * The meta object literal for the '<em><b>Get Root State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_ROOT_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetRootStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetInitilalSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_SIMPLE_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetSimpleStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INITIAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetInitialStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_STATE_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetFinalStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_CONNECTOR_PREDECESSORS = eINSTANCE.getInternalInitilalSuperState__GetConnectorPredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetInitilalSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Simple State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_SIMPLE_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetSimpleStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initial State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_INITIAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetInitialStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Final State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_FINAL_STATE_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetFinalStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Connector Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITILAL_SUPER_STATE___GET_CONNECTOR_SUCCESSORS = eINSTANCE.getInternalInitilalSuperState__GetConnectorSuccessors();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationNodeImpl <em>Root State Declaration Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationNodeImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRootStateDeclarationNode()
		 * @generated
		 */
		EClass INTERNAL_ROOT_STATE_DECLARATION_NODE = eINSTANCE.getInternalRootStateDeclarationNode();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ROOT_STATE_DECLARATION_NODE__DECLARATION_TYPE = eINSTANCE.getInternalRootStateDeclarationNode_DeclarationType();

		/**
		 * The meta object literal for the '<em><b>Input Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ROOT_STATE_DECLARATION_NODE__INPUT_OUTPUT = eINSTANCE.getInternalRootStateDeclarationNode_InputOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ROOT_STATE_DECLARATION_NODE__NAME = eINSTANCE.getInternalRootStateDeclarationNode_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_DECLARATION_NODE__NAME = eINSTANCE.getInternalSuperStateDeclarationNode_Name();

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
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalSimpleState__GetInitilalSuperStatePredecessors();

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
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_SIMPLE_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalSimpleState__GetInitilalSuperStateSuccessors();

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
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalInitialState__GetInitilalSuperStatePredecessors();

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
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_INITIAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalInitialState__GetInitilalSuperStateSuccessors();

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
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalFinalState__GetInitilalSuperStatePredecessors();

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
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_FINAL_STATE___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalFinalState__GetInitilalSuperStateSuccessors();

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
		 * The meta object literal for the '<em><b>Get Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetSuperStatePredecessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITILAL_SUPER_STATE_PREDECESSORS = eINSTANCE.getInternalConnector__GetInitilalSuperStatePredecessors();

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
		 * The meta object literal for the '<em><b>Get Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetSuperStateSuccessors();

		/**
		 * The meta object literal for the '<em><b>Get Initilal Super State Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_CONNECTOR___GET_INITILAL_SUPER_STATE_SUCCESSORS = eINSTANCE.getInternalConnector__GetInitilalSuperStateSuccessors();

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
		 * The meta object literal for the '{@link info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationImpl <em>Root State Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalRootStateDeclarationImpl
		 * @see info.scce.cinco.product.scchart.mglid.scchart.internal.impl.InternalPackageImpl#getInternalRootStateDeclaration()
		 * @generated
		 */
		EClass INTERNAL_ROOT_STATE_DECLARATION = eINSTANCE.getInternalRootStateDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ROOT_STATE_DECLARATION__DECLARATION_TYPE = eINSTANCE.getInternalRootStateDeclaration_DeclarationType();

		/**
		 * The meta object literal for the '<em><b>Input Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ROOT_STATE_DECLARATION__INPUT_OUTPUT = eINSTANCE.getInternalRootStateDeclaration_InputOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ROOT_STATE_DECLARATION__NAME = eINSTANCE.getInternalRootStateDeclaration_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_SUPER_STATE_DECLARATION__NAME = eINSTANCE.getInternalSuperStateDeclaration_Name();

	}

} //InternalPackage

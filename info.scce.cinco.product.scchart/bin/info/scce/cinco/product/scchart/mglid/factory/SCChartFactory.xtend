package info.scce.cinco.product.scchart.mglid.factory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

import info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage
import info.scce.cinco.product.scchart.mglid.scchart.impl.ScchartFactoryImpl
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFactory
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage

import info.scce.cinco.product.scchart.mglid.scchart.adapter.*

import graphmodel.internal.InternalModelElement
import graphmodel.internal.InternalModelElementContainer
import graphmodel.internal.InternalGraphModel
import graphmodel.internal.InternalContainer
import graphmodel.internal.InternalNode
import graphmodel.internal.InternalEdge
import graphmodel.internal.InternalType
import graphmodel.internal.InternalIdentifiableElement
import graphmodel.ModelElement
import graphmodel.IdentifiableElement
import graphmodel.GraphModel
import graphmodel.Type

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.plugin.EcorePlugin

class SCChartFactory extends ScchartFactoryImpl {
	
	final extension InternalFactory = InternalFactory.eINSTANCE
	public static SCChartFactory eINSTANCE = SCChartFactory.init
	
	extension de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension = new de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension
	
	static def SCChartFactory init() {
		try {
			val fct = EPackage::Registry.INSTANCE.getEFactory(ScchartPackage.eNS_URI) as SCChartFactory
			if (fct != null)
				return fct as SCChartFactory
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		new SCChartFactory
	}
	
	/**
	 * This method creates an SCChart with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSCChart(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSCChart => [ 
			setID(ID)
			internal = ime ?: createInternalSCChart => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SCChartEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an SCChart with the given id. Post create hook won't be triggered.
	 */
	def createSCChart(String ID){
		createSCChart(ID,null,null,false)
	}
	
	/**
	 * This method creates an SCChart with the given id. Post create hook will be triggered.
	 */
	def createSCChart(InternalModelElementContainer parent){
		createSCChart(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SCChart with the given id. Post create hook will be triggered.
	 */
	def createSCChart(String ID, InternalModelElementContainer parent){
		createSCChart(ID,null,parent,true)
	}
	
	def createSCChart(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSCChart(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SCChart with the given id. Post create hook won't be triggered.
	 */
	def createSCChart(InternalModelElement ime) {
		createSCChart(generateUUID,ime,null,false)
	}
	
	override createSCChart() {
		createSCChart(generateUUID)
	}
	/**
	 * This method creates an SuperState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSuperState => [
			setID(ID)
			internal = ime ?: createInternalSuperState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SuperStateEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an SuperState with the given id. Post create hook won't be triggered.
	 */
	def createSuperState(String ID){
		createSuperState(ID,null,null,false)
	}
	
	/**
	 * This method creates an SuperState with the given id. Post create hook will be triggered.
	 */
	def createSuperState(InternalModelElementContainer parent){
		createSuperState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SuperState with the given id. Post create hook will be triggered.
	 */
	def createSuperState(String ID, InternalModelElementContainer parent){
		createSuperState(ID,null,parent,true)
	}
	
	def createSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSuperState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SuperState with the given id. Post create hook won't be triggered.
	 */
	def createSuperState(InternalModelElement ime) {
		createSuperState(generateUUID,ime,null,false)
	}
	
	override createSuperState() {
		createSuperState(generateUUID)
	}
	/**
	 * This method creates an InitilalSuperState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createInitilalSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createInitilalSuperState => [
			setID(ID)
			internal = ime ?: createInternalInitilalSuperState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.InitilalSuperStateEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an InitilalSuperState with the given id. Post create hook won't be triggered.
	 */
	def createInitilalSuperState(String ID){
		createInitilalSuperState(ID,null,null,false)
	}
	
	/**
	 * This method creates an InitilalSuperState with the given id. Post create hook will be triggered.
	 */
	def createInitilalSuperState(InternalModelElementContainer parent){
		createInitilalSuperState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an InitilalSuperState with the given id. Post create hook will be triggered.
	 */
	def createInitilalSuperState(String ID, InternalModelElementContainer parent){
		createInitilalSuperState(ID,null,parent,true)
	}
	
	def createInitilalSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createInitilalSuperState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an InitilalSuperState with the given id. Post create hook won't be triggered.
	 */
	def createInitilalSuperState(InternalModelElement ime) {
		createInitilalSuperState(generateUUID,ime,null,false)
	}
	
	override createInitilalSuperState() {
		createInitilalSuperState(generateUUID)
	}
	/**
	 * This method creates an SimpleState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSimpleState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSimpleState => [
			setID(ID)
			internal = ime ?: createInternalSimpleState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SimpleStateEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SimpleState with the given id. Post create hook won't be triggered.
	 */
	def createSimpleState(String ID){
		createSimpleState(ID,null,null,false)
	}
	
	/**
	 * This method creates an SimpleState with the given id. Post create hook will be triggered.
	 */
	def createSimpleState(InternalModelElementContainer parent){
		createSimpleState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SimpleState with the given id. Post create hook will be triggered.
	 */
	def createSimpleState(String ID, InternalModelElementContainer parent){
		createSimpleState(ID,null,parent,true)
	}
	
	def createSimpleState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSimpleState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SimpleState with the given id. Post create hook won't be triggered.
	 */
	def createSimpleState(InternalModelElement ime) {
		createSimpleState(generateUUID,ime,null,false)
	}
	
	override createSimpleState() {
		createSimpleState(generateUUID)
	}
	/**
	 * This method creates an InitialState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createInitialState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createInitialState => [
			setID(ID)
			internal = ime ?: createInternalInitialState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.InitialStateEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an InitialState with the given id. Post create hook won't be triggered.
	 */
	def createInitialState(String ID){
		createInitialState(ID,null,null,false)
	}
	
	/**
	 * This method creates an InitialState with the given id. Post create hook will be triggered.
	 */
	def createInitialState(InternalModelElementContainer parent){
		createInitialState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an InitialState with the given id. Post create hook will be triggered.
	 */
	def createInitialState(String ID, InternalModelElementContainer parent){
		createInitialState(ID,null,parent,true)
	}
	
	def createInitialState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createInitialState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an InitialState with the given id. Post create hook won't be triggered.
	 */
	def createInitialState(InternalModelElement ime) {
		createInitialState(generateUUID,ime,null,false)
	}
	
	override createInitialState() {
		createInitialState(generateUUID)
	}
	/**
	 * This method creates an FinalState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createFinalState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createFinalState => [
			setID(ID)
			internal = ime ?: createInternalFinalState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.FinalStateEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an FinalState with the given id. Post create hook won't be triggered.
	 */
	def createFinalState(String ID){
		createFinalState(ID,null,null,false)
	}
	
	/**
	 * This method creates an FinalState with the given id. Post create hook will be triggered.
	 */
	def createFinalState(InternalModelElementContainer parent){
		createFinalState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an FinalState with the given id. Post create hook will be triggered.
	 */
	def createFinalState(String ID, InternalModelElementContainer parent){
		createFinalState(ID,null,parent,true)
	}
	
	def createFinalState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createFinalState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an FinalState with the given id. Post create hook won't be triggered.
	 */
	def createFinalState(InternalModelElement ime) {
		createFinalState(generateUUID,ime,null,false)
	}
	
	override createFinalState() {
		createFinalState(generateUUID)
	}
	/**
	 * This method creates an RootState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createRootState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createRootState => [
			setID(ID)
			internal = ime ?: createInternalRootState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.RootStateEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an RootState with the given id. Post create hook won't be triggered.
	 */
	def createRootState(String ID){
		createRootState(ID,null,null,false)
	}
	
	/**
	 * This method creates an RootState with the given id. Post create hook will be triggered.
	 */
	def createRootState(InternalModelElementContainer parent){
		createRootState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an RootState with the given id. Post create hook will be triggered.
	 */
	def createRootState(String ID, InternalModelElementContainer parent){
		createRootState(ID,null,parent,true)
	}
	
	def createRootState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createRootState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an RootState with the given id. Post create hook won't be triggered.
	 */
	def createRootState(InternalModelElement ime) {
		createRootState(generateUUID,ime,null,false)
	}
	
	override createRootState() {
		createRootState(generateUUID)
	}
	/**
	 * This method creates an Region with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createRegion => [
			setID(ID)
			internal = ime ?: createInternalRegion => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.RegionEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an Region with the given id. Post create hook won't be triggered.
	 */
	def createRegion(String ID){
		createRegion(ID,null,null,false)
	}
	
	/**
	 * This method creates an Region with the given id. Post create hook will be triggered.
	 */
	def createRegion(InternalModelElementContainer parent){
		createRegion(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Region with the given id. Post create hook will be triggered.
	 */
	def createRegion(String ID, InternalModelElementContainer parent){
		createRegion(ID,null,parent,true)
	}
	
	def createRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createRegion(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Region with the given id. Post create hook won't be triggered.
	 */
	def createRegion(InternalModelElement ime) {
		createRegion(generateUUID,ime,null,false)
	}
	
	override createRegion() {
		createRegion(generateUUID)
	}
	/**
	 * This method creates an RootStateDeclarationNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createRootStateDeclarationNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createRootStateDeclarationNode => [
			setID(ID)
			internal = ime ?: createInternalRootStateDeclarationNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.RootStateDeclarationNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an RootStateDeclarationNode with the given id. Post create hook won't be triggered.
	 */
	def createRootStateDeclarationNode(String ID){
		createRootStateDeclarationNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an RootStateDeclarationNode with the given id. Post create hook will be triggered.
	 */
	def createRootStateDeclarationNode(InternalModelElementContainer parent){
		createRootStateDeclarationNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an RootStateDeclarationNode with the given id. Post create hook will be triggered.
	 */
	def createRootStateDeclarationNode(String ID, InternalModelElementContainer parent){
		createRootStateDeclarationNode(ID,null,parent,true)
	}
	
	def createRootStateDeclarationNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createRootStateDeclarationNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an RootStateDeclarationNode with the given id. Post create hook won't be triggered.
	 */
	def createRootStateDeclarationNode(InternalModelElement ime) {
		createRootStateDeclarationNode(generateUUID,ime,null,false)
	}
	
	override createRootStateDeclarationNode() {
		createRootStateDeclarationNode(generateUUID)
	}
	/**
	 * This method creates an DataFlowRegion with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createDataFlowRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createDataFlowRegion => [
			setID(ID)
			internal = ime ?: createInternalDataFlowRegion => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.DataFlowRegionEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an DataFlowRegion with the given id. Post create hook won't be triggered.
	 */
	def createDataFlowRegion(String ID){
		createDataFlowRegion(ID,null,null,false)
	}
	
	/**
	 * This method creates an DataFlowRegion with the given id. Post create hook will be triggered.
	 */
	def createDataFlowRegion(InternalModelElementContainer parent){
		createDataFlowRegion(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an DataFlowRegion with the given id. Post create hook will be triggered.
	 */
	def createDataFlowRegion(String ID, InternalModelElementContainer parent){
		createDataFlowRegion(ID,null,parent,true)
	}
	
	def createDataFlowRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createDataFlowRegion(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an DataFlowRegion with the given id. Post create hook won't be triggered.
	 */
	def createDataFlowRegion(InternalModelElement ime) {
		createDataFlowRegion(generateUUID,ime,null,false)
	}
	
	override createDataFlowRegion() {
		createDataFlowRegion(generateUUID)
	}
	/**
	 * This method creates an Connector with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createConnector(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createConnector => [
			setID(ID)
			internal = ime ?: createInternalConnector => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.ConnectorEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Connector with the given id. Post create hook won't be triggered.
	 */
	def createConnector(String ID){
		createConnector(ID,null,null,false)
	}
	
	/**
	 * This method creates an Connector with the given id. Post create hook will be triggered.
	 */
	def createConnector(InternalModelElementContainer parent){
		createConnector(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Connector with the given id. Post create hook will be triggered.
	 */
	def createConnector(String ID, InternalModelElementContainer parent){
		createConnector(ID,null,parent,true)
	}
	
	def createConnector(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createConnector(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Connector with the given id. Post create hook won't be triggered.
	 */
	def createConnector(InternalModelElement ime) {
		createConnector(generateUUID,ime,null,false)
	}
	
	override createConnector() {
		createConnector(generateUUID)
	}
	/**
	 * This method creates an SuperStateDeclarationNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSuperStateDeclarationNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSuperStateDeclarationNode => [
			setID(ID)
			internal = ime ?: createInternalSuperStateDeclarationNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SuperStateDeclarationNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SuperStateDeclarationNode with the given id. Post create hook won't be triggered.
	 */
	def createSuperStateDeclarationNode(String ID){
		createSuperStateDeclarationNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an SuperStateDeclarationNode with the given id. Post create hook will be triggered.
	 */
	def createSuperStateDeclarationNode(InternalModelElementContainer parent){
		createSuperStateDeclarationNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SuperStateDeclarationNode with the given id. Post create hook will be triggered.
	 */
	def createSuperStateDeclarationNode(String ID, InternalModelElementContainer parent){
		createSuperStateDeclarationNode(ID,null,parent,true)
	}
	
	def createSuperStateDeclarationNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSuperStateDeclarationNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SuperStateDeclarationNode with the given id. Post create hook won't be triggered.
	 */
	def createSuperStateDeclarationNode(InternalModelElement ime) {
		createSuperStateDeclarationNode(generateUUID,ime,null,false)
	}
	
	override createSuperStateDeclarationNode() {
		createSuperStateDeclarationNode(generateUUID)
	}
	def createWeakAbortTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createWeakAbortTransition => [
			setID(ID)
			internal = ime ?: createInternalWeakAbortTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.WeakAbortTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an WeakAbortTransition with the given id. Post create hook will be triggered.
	 */
	def createWeakAbortTransition(String ID, InternalNode source, InternalNode target){
		createWeakAbortTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an WeakAbortTransition with generated id. Post create hook will be triggered.
	 */
	def createWeakAbortTransition(InternalNode source, InternalNode target){
		createWeakAbortTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an WeakAbortTransition with the given id. Post create hook won't be triggered.
	 */
	def createWeakAbortTransition(String ID){
		createWeakAbortTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an WeakAbortTransition with a generated id. Post create hook won't be triggered.
	 */
	override createWeakAbortTransition() {
		createWeakAbortTransition(generateUUID)
	}
	def createImmediateTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createImmediateTransition => [
			setID(ID)
			internal = ime ?: createInternalImmediateTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.ImmediateTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ImmediateTransition with the given id. Post create hook will be triggered.
	 */
	def createImmediateTransition(String ID, InternalNode source, InternalNode target){
		createImmediateTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateTransition with generated id. Post create hook will be triggered.
	 */
	def createImmediateTransition(InternalNode source, InternalNode target){
		createImmediateTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateTransition with the given id. Post create hook won't be triggered.
	 */
	def createImmediateTransition(String ID){
		createImmediateTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ImmediateTransition with a generated id. Post create hook won't be triggered.
	 */
	override createImmediateTransition() {
		createImmediateTransition(generateUUID)
	}
	def createHistoryTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createHistoryTransition => [
			setID(ID)
			internal = ime ?: createInternalHistoryTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.HistoryTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an HistoryTransition with the given id. Post create hook will be triggered.
	 */
	def createHistoryTransition(String ID, InternalNode source, InternalNode target){
		createHistoryTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an HistoryTransition with generated id. Post create hook will be triggered.
	 */
	def createHistoryTransition(InternalNode source, InternalNode target){
		createHistoryTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an HistoryTransition with the given id. Post create hook won't be triggered.
	 */
	def createHistoryTransition(String ID){
		createHistoryTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an HistoryTransition with a generated id. Post create hook won't be triggered.
	 */
	override createHistoryTransition() {
		createHistoryTransition(generateUUID)
	}
	def createShallowHistoryTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createShallowHistoryTransition => [
			setID(ID)
			internal = ime ?: createInternalShallowHistoryTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.ShallowHistoryTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ShallowHistoryTransition with the given id. Post create hook will be triggered.
	 */
	def createShallowHistoryTransition(String ID, InternalNode source, InternalNode target){
		createShallowHistoryTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ShallowHistoryTransition with generated id. Post create hook will be triggered.
	 */
	def createShallowHistoryTransition(InternalNode source, InternalNode target){
		createShallowHistoryTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ShallowHistoryTransition with the given id. Post create hook won't be triggered.
	 */
	def createShallowHistoryTransition(String ID){
		createShallowHistoryTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ShallowHistoryTransition with a generated id. Post create hook won't be triggered.
	 */
	override createShallowHistoryTransition() {
		createShallowHistoryTransition(generateUUID)
	}
	def createTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createTransition => [
			setID(ID)
			internal = ime ?: createInternalTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.TransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an Transition with the given id. Post create hook will be triggered.
	 */
	def createTransition(String ID, InternalNode source, InternalNode target){
		createTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an Transition with generated id. Post create hook will be triggered.
	 */
	def createTransition(InternalNode source, InternalNode target){
		createTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an Transition with the given id. Post create hook won't be triggered.
	 */
	def createTransition(String ID){
		createTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an Transition with a generated id. Post create hook won't be triggered.
	 */
	override createTransition() {
		createTransition(generateUUID)
	}
	def createTerminationTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createTerminationTransition => [
			setID(ID)
			internal = ime ?: createInternalTerminationTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.TerminationTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an TerminationTransition with the given id. Post create hook will be triggered.
	 */
	def createTerminationTransition(String ID, InternalNode source, InternalNode target){
		createTerminationTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an TerminationTransition with generated id. Post create hook will be triggered.
	 */
	def createTerminationTransition(InternalNode source, InternalNode target){
		createTerminationTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an TerminationTransition with the given id. Post create hook won't be triggered.
	 */
	def createTerminationTransition(String ID){
		createTerminationTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an TerminationTransition with a generated id. Post create hook won't be triggered.
	 */
	override createTerminationTransition() {
		createTerminationTransition(generateUUID)
	}
	def createStrongAbortTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createStrongAbortTransition => [
			setID(ID)
			internal = ime ?: createInternalStrongAbortTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.StrongAbortTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an StrongAbortTransition with the given id. Post create hook will be triggered.
	 */
	def createStrongAbortTransition(String ID, InternalNode source, InternalNode target){
		createStrongAbortTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an StrongAbortTransition with generated id. Post create hook will be triggered.
	 */
	def createStrongAbortTransition(InternalNode source, InternalNode target){
		createStrongAbortTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an StrongAbortTransition with the given id. Post create hook won't be triggered.
	 */
	def createStrongAbortTransition(String ID){
		createStrongAbortTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an StrongAbortTransition with a generated id. Post create hook won't be triggered.
	 */
	override createStrongAbortTransition() {
		createStrongAbortTransition(generateUUID)
	}
	def createConditionalTerminationTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createConditionalTerminationTransition => [
			setID(ID)
			internal = ime ?: createInternalConditionalTerminationTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.ConditionalTerminationTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ConditionalTerminationTransition with the given id. Post create hook will be triggered.
	 */
	def createConditionalTerminationTransition(String ID, InternalNode source, InternalNode target){
		createConditionalTerminationTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ConditionalTerminationTransition with generated id. Post create hook will be triggered.
	 */
	def createConditionalTerminationTransition(InternalNode source, InternalNode target){
		createConditionalTerminationTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ConditionalTerminationTransition with the given id. Post create hook won't be triggered.
	 */
	def createConditionalTerminationTransition(String ID){
		createConditionalTerminationTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ConditionalTerminationTransition with a generated id. Post create hook won't be triggered.
	 */
	override createConditionalTerminationTransition() {
		createConditionalTerminationTransition(generateUUID)
	}
	def createDeferredTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createDeferredTransition => [
			setID(ID)
			internal = ime ?: createInternalDeferredTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.DeferredTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an DeferredTransition with the given id. Post create hook will be triggered.
	 */
	def createDeferredTransition(String ID, InternalNode source, InternalNode target){
		createDeferredTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an DeferredTransition with generated id. Post create hook will be triggered.
	 */
	def createDeferredTransition(InternalNode source, InternalNode target){
		createDeferredTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an DeferredTransition with the given id. Post create hook won't be triggered.
	 */
	def createDeferredTransition(String ID){
		createDeferredTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an DeferredTransition with a generated id. Post create hook won't be triggered.
	 */
	override createDeferredTransition() {
		createDeferredTransition(generateUUID)
	}
	/**
	 * This method creates an RootStateDeclaration with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createRootStateDeclaration(String ID, InternalModelElement ime, boolean hook){
		super.createRootStateDeclaration => [ 
			setID(ID)
			internal = ime ?: createInternalRootStateDeclaration => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.RootStateDeclarationEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an RootStateDeclaration with the given id. Post create hook won't be triggered.
	 */
	def createRootStateDeclaration(String ID){
		createRootStateDeclaration(ID,null,false)
	}
	
	/**
	 * This method creates an RootStateDeclaration with the given id. Post create hook won't be triggered.
	 */
	def createRootStateDeclaration(InternalModelElement ime) {
		createRootStateDeclaration(generateUUID,ime,false)
	}
	
	override createRootStateDeclaration() {
		createRootStateDeclaration(generateUUID)
	}
	/**
	 * This method creates an Suspend with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSuspend(String ID, InternalModelElement ime, boolean hook){
		super.createSuspend => [ 
			setID(ID)
			internal = ime ?: createInternalSuspend => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SuspendEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Suspend with the given id. Post create hook won't be triggered.
	 */
	def createSuspend(String ID){
		createSuspend(ID,null,false)
	}
	
	/**
	 * This method creates an Suspend with the given id. Post create hook won't be triggered.
	 */
	def createSuspend(InternalModelElement ime) {
		createSuspend(generateUUID,ime,false)
	}
	
	override createSuspend() {
		createSuspend(generateUUID)
	}
	/**
	 * This method creates an Action with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createAction(String ID, InternalModelElement ime, boolean hook){
		super.createAction => [ 
			setID(ID)
			internal = ime ?: createInternalAction => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.ActionEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Action with the given id. Post create hook won't be triggered.
	 */
	def createAction(String ID){
		createAction(ID,null,false)
	}
	
	/**
	 * This method creates an Action with the given id. Post create hook won't be triggered.
	 */
	def createAction(InternalModelElement ime) {
		createAction(generateUUID,ime,false)
	}
	
	override createAction() {
		createAction(generateUUID)
	}
	/**
	 * This method creates an SuperStateDeclaration with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSuperStateDeclaration(String ID, InternalModelElement ime, boolean hook){
		super.createSuperStateDeclaration => [ 
			setID(ID)
			internal = ime ?: createInternalSuperStateDeclaration => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SuperStateDeclarationEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SuperStateDeclaration with the given id. Post create hook won't be triggered.
	 */
	def createSuperStateDeclaration(String ID){
		createSuperStateDeclaration(ID,null,false)
	}
	
	/**
	 * This method creates an SuperStateDeclaration with the given id. Post create hook won't be triggered.
	 */
	def createSuperStateDeclaration(InternalModelElement ime) {
		createSuperStateDeclaration(generateUUID,ime,false)
	}
	
	override createSuperStateDeclaration() {
		createSuperStateDeclaration(generateUUID)
	}
	
	private def <T extends IdentifiableElement> setInternal(T elm, InternalIdentifiableElement internal) {
		elm => [
			if (id.isNullOrEmpty)
				ID = generateUUID
			switch elm {
				GraphModel: elm.internalElement = internal as InternalGraphModel
				ModelElement: elm.internalElement = internal as InternalModelElement
				Type: elm.internalElement = internal as InternalType
			}
		]
	}
	
	/**
	* This method creates a new SCChart object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can 
	* simply call the SCChart's save method to save your changes.
	*/
	def info.scce.cinco.product.scchart.mglid.scchart.SCChart createSCChart(java.lang.String path, java.lang.String fileName) {
		var filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("scchart");
		var uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		var res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		var graph = info.scce.cinco.product.scchart.mglid.factory.SCChartFactory.eINSTANCE.createSCChart();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());

		res.getContents().add(graph.internalElement);
		
		postCreates(graph);
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

		return graph;
	}
	
	
	def postCreates(info.scce.cinco.product.scchart.mglid.scchart.RootState me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_mglid_scchart_RootState
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.RootState>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_RootState', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.mglid.scchart.Region me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Region
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.Region>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.Region>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_Region', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_DataFlowRegion', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.mglid.scchart.SuperState me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperState
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperState>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperState', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitilalSuperState', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.mglid.scchart.SCChart me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SCChart
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.SCChart>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SCChart', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
}

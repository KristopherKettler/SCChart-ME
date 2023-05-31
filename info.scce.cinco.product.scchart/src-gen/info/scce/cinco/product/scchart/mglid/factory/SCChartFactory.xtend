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
	 * This method creates an SubSuperStateDeclarationNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSubSuperStateDeclarationNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSubSuperStateDeclarationNode => [
			setID(ID)
			internal = ime ?: createInternalSubSuperStateDeclarationNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SubSuperStateDeclarationNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SubSuperStateDeclarationNode with the given id. Post create hook won't be triggered.
	 */
	def createSubSuperStateDeclarationNode(String ID){
		createSubSuperStateDeclarationNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an SubSuperStateDeclarationNode with the given id. Post create hook will be triggered.
	 */
	def createSubSuperStateDeclarationNode(InternalModelElementContainer parent){
		createSubSuperStateDeclarationNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SubSuperStateDeclarationNode with the given id. Post create hook will be triggered.
	 */
	def createSubSuperStateDeclarationNode(String ID, InternalModelElementContainer parent){
		createSubSuperStateDeclarationNode(ID,null,parent,true)
	}
	
	def createSubSuperStateDeclarationNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSubSuperStateDeclarationNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SubSuperStateDeclarationNode with the given id. Post create hook won't be triggered.
	 */
	def createSubSuperStateDeclarationNode(InternalModelElement ime) {
		createSubSuperStateDeclarationNode(generateUUID,ime,null,false)
	}
	
	override createSubSuperStateDeclarationNode() {
		createSubSuperStateDeclarationNode(generateUUID)
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
	 * This method creates an SubSuperStateRegion with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSubSuperStateRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSubSuperStateRegion => [
			setID(ID)
			internal = ime ?: createInternalSubSuperStateRegion => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SubSuperStateRegionEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SubSuperStateRegion with the given id. Post create hook won't be triggered.
	 */
	def createSubSuperStateRegion(String ID){
		createSubSuperStateRegion(ID,null,null,false)
	}
	
	/**
	 * This method creates an SubSuperStateRegion with the given id. Post create hook will be triggered.
	 */
	def createSubSuperStateRegion(InternalModelElementContainer parent){
		createSubSuperStateRegion(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SubSuperStateRegion with the given id. Post create hook will be triggered.
	 */
	def createSubSuperStateRegion(String ID, InternalModelElementContainer parent){
		createSubSuperStateRegion(ID,null,parent,true)
	}
	
	def createSubSuperStateRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSubSuperStateRegion(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SubSuperStateRegion with the given id. Post create hook won't be triggered.
	 */
	def createSubSuperStateRegion(InternalModelElement ime) {
		createSubSuperStateRegion(generateUUID,ime,null,false)
	}
	
	override createSubSuperStateRegion() {
		createSubSuperStateRegion(generateUUID)
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
	 * This method creates an InitilalSubSuperState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createInitilalSubSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createInitilalSubSuperState => [
			setID(ID)
			internal = ime ?: createInternalInitilalSubSuperState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.InitilalSubSuperStateEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an InitilalSubSuperState with the given id. Post create hook won't be triggered.
	 */
	def createInitilalSubSuperState(String ID){
		createInitilalSubSuperState(ID,null,null,false)
	}
	
	/**
	 * This method creates an InitilalSubSuperState with the given id. Post create hook will be triggered.
	 */
	def createInitilalSubSuperState(InternalModelElementContainer parent){
		createInitilalSubSuperState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an InitilalSubSuperState with the given id. Post create hook will be triggered.
	 */
	def createInitilalSubSuperState(String ID, InternalModelElementContainer parent){
		createInitilalSubSuperState(ID,null,parent,true)
	}
	
	def createInitilalSubSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createInitilalSubSuperState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an InitilalSubSuperState with the given id. Post create hook won't be triggered.
	 */
	def createInitilalSubSuperState(InternalModelElement ime) {
		createInitilalSubSuperState(generateUUID,ime,null,false)
	}
	
	override createInitilalSubSuperState() {
		createInitilalSubSuperState(generateUUID)
	}
	/**
	 * This method creates an SuperStateRegion with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSuperStateRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSuperStateRegion => [
			setID(ID)
			internal = ime ?: createInternalSuperStateRegion => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SuperStateRegionEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an SuperStateRegion with the given id. Post create hook won't be triggered.
	 */
	def createSuperStateRegion(String ID){
		createSuperStateRegion(ID,null,null,false)
	}
	
	/**
	 * This method creates an SuperStateRegion with the given id. Post create hook will be triggered.
	 */
	def createSuperStateRegion(InternalModelElementContainer parent){
		createSuperStateRegion(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SuperStateRegion with the given id. Post create hook will be triggered.
	 */
	def createSuperStateRegion(String ID, InternalModelElementContainer parent){
		createSuperStateRegion(ID,null,parent,true)
	}
	
	def createSuperStateRegion(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSuperStateRegion(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SuperStateRegion with the given id. Post create hook won't be triggered.
	 */
	def createSuperStateRegion(InternalModelElement ime) {
		createSuperStateRegion(generateUUID,ime,null,false)
	}
	
	override createSuperStateRegion() {
		createSuperStateRegion(generateUUID)
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
	 * This method creates an SubSuperState with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSubSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSubSuperState => [
			setID(ID)
			internal = ime ?: createInternalSubSuperState => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SubSuperStateEContentAdapter)
			]
			if (hook) postCreates
		]
		
	}
	
	/**
	 * This method creates an SubSuperState with the given id. Post create hook won't be triggered.
	 */
	def createSubSuperState(String ID){
		createSubSuperState(ID,null,null,false)
	}
	
	/**
	 * This method creates an SubSuperState with the given id. Post create hook will be triggered.
	 */
	def createSubSuperState(InternalModelElementContainer parent){
		createSubSuperState(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SubSuperState with the given id. Post create hook will be triggered.
	 */
	def createSubSuperState(String ID, InternalModelElementContainer parent){
		createSubSuperState(ID,null,parent,true)
	}
	
	def createSubSuperState(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSubSuperState(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SubSuperState with the given id. Post create hook won't be triggered.
	 */
	def createSubSuperState(InternalModelElement ime) {
		createSubSuperState(generateUUID,ime,null,false)
	}
	
	override createSubSuperState() {
		createSubSuperState(generateUUID)
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
	def createDefferedTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createDefferedTransition => [
			setID(ID)
			internal = ime ?: createInternalDefferedTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.DefferedTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an DefferedTransition with the given id. Post create hook will be triggered.
	 */
	def createDefferedTransition(String ID, InternalNode source, InternalNode target){
		createDefferedTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an DefferedTransition with generated id. Post create hook will be triggered.
	 */
	def createDefferedTransition(InternalNode source, InternalNode target){
		createDefferedTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an DefferedTransition with the given id. Post create hook won't be triggered.
	 */
	def createDefferedTransition(String ID){
		createDefferedTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an DefferedTransition with a generated id. Post create hook won't be triggered.
	 */
	override createDefferedTransition() {
		createDefferedTransition(generateUUID)
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
	def createImmediateTerminationTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createImmediateTerminationTransition => [
			setID(ID)
			internal = ime ?: createInternalImmediateTerminationTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.ImmediateTerminationTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an ImmediateTerminationTransition with the given id. Post create hook will be triggered.
	 */
	def createImmediateTerminationTransition(String ID, InternalNode source, InternalNode target){
		createImmediateTerminationTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateTerminationTransition with generated id. Post create hook will be triggered.
	 */
	def createImmediateTerminationTransition(InternalNode source, InternalNode target){
		createImmediateTerminationTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an ImmediateTerminationTransition with the given id. Post create hook won't be triggered.
	 */
	def createImmediateTerminationTransition(String ID){
		createImmediateTerminationTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an ImmediateTerminationTransition with a generated id. Post create hook won't be triggered.
	 */
	override createImmediateTerminationTransition() {
		createImmediateTerminationTransition(generateUUID)
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
	def createWeakAbortTerminationTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createWeakAbortTerminationTransition => [
			setID(ID)
			internal = ime ?: createInternalWeakAbortTerminationTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.WeakAbortTerminationTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an WeakAbortTerminationTransition with the given id. Post create hook will be triggered.
	 */
	def createWeakAbortTerminationTransition(String ID, InternalNode source, InternalNode target){
		createWeakAbortTerminationTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an WeakAbortTerminationTransition with generated id. Post create hook will be triggered.
	 */
	def createWeakAbortTerminationTransition(InternalNode source, InternalNode target){
		createWeakAbortTerminationTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an WeakAbortTerminationTransition with the given id. Post create hook won't be triggered.
	 */
	def createWeakAbortTerminationTransition(String ID){
		createWeakAbortTerminationTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an WeakAbortTerminationTransition with a generated id. Post create hook won't be triggered.
	 */
	override createWeakAbortTerminationTransition() {
		createWeakAbortTerminationTransition(generateUUID)
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
	/**
	 * This method creates an SubSuperStateDeclaration with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSubSuperStateDeclaration(String ID, InternalModelElement ime, boolean hook){
		super.createSubSuperStateDeclaration => [ 
			setID(ID)
			internal = ime ?: createInternalSubSuperStateDeclaration => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.scchart.mglid.adapter.SubSuperStateDeclarationEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SubSuperStateDeclaration with the given id. Post create hook won't be triggered.
	 */
	def createSubSuperStateDeclaration(String ID){
		createSubSuperStateDeclaration(ID,null,false)
	}
	
	/**
	 * This method creates an SubSuperStateDeclaration with the given id. Post create hook won't be triggered.
	 */
	def createSubSuperStateDeclaration(InternalModelElement ime) {
		createSubSuperStateDeclaration(generateUUID,ime,false)
	}
	
	override createSubSuperStateDeclaration() {
		createSubSuperStateDeclaration(generateUUID)
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
	
	def postCreates(info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.SuperStateRegion>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SuperStateRegion', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.mglid.scchart.SubSuperState me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.SubSuperState>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.SubSuperState>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_SubSuperState', eventPayload)
			de.jabc.cinco.meta.core.event.hub.EventHub.instance.notifyFirst(eventContext)
		]
	}
	
	def postCreates(info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState me) {
		me.transact [
			// event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState
			val eventPayload = new de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState>(me)
			val eventContext = new de.jabc.cinco.meta.core.event.hub.impl.PayloadContext<de.jabc.cinco.meta.plugin.event.api.payload.PostCreatePayload<info.scce.cinco.product.scchart.mglid.scchart.InitilalSubSuperState>, java.lang.Void>('event.post.create.info_scce_cinco_product_scchart_mglid_scchart_InitilalSubSuperState', eventPayload)
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

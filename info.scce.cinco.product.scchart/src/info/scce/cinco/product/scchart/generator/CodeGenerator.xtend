package info.scce.cinco.product.scchart.generator

import info.scce.cinco.product.scchart.mglid.scchart.SCChart
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import de.jabc.cinco.meta.runtime.CincoRuntimeBaseClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import info.scce.cinco.product.scchart.mglid.scchart.Declaration
import info.scce.cinco.product.scchart.mglid.scchart.RootState
import info.scce.cinco.product.scchart.mglid.scchart.Suspend
import info.scce.cinco.product.scchart.mglid.scchart.Action
import info.scce.cinco.product.scchart.mglid.scchart.Region
import info.scce.cinco.product.scchart.mglid.scchart.InitialState
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState
import graphmodel.Edge
import org.eclipse.emf.common.util.EList
import info.scce.cinco.product.scchart.mglid.scchart.AbstractTransition
import java.util.Comparator
import info.scce.cinco.product.scchart.mglid.scchart.Transition
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition
import info.scce.cinco.product.scchart.mglid.scchart.SuperState
import info.scce.cinco.product.scchart.mglid.scchart.TerminationTransition
import info.scce.cinco.product.scchart.mglid.scchart.ConditionalTerminationTransition
import info.scce.cinco.product.scchart.mglid.scchart.StrongAbortTransition
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateStrongAbortTransition

class CodeGenerator extends CincoRuntimeBaseClass implements IGenerator<SCChart>{
	
	String fileName
	var sum = 0.0
	
	override generate(SCChart scchart, IPath path, IProgressMonitor monitor) {
		val fullFileName = scchart.file.name
		fileName = fullFileName.substring(0, fullFileName.lastIndexOf('.'))
		val targetFile = workspaceRoot.getFileForLocation(path.append(fileName + ".sctx"))
		EclipseFileUtils.writeToFile(targetFile, template(scchart))

	}
	
	def template(SCChart scchart) '''
	scchart «scchart.findThe(RootState).name» {
		«FOR declaration : scchart.find(Declaration)»
		«declaration.genDeclaration»
		«ENDFOR»
		«FOR suspend : scchart.find(Suspend)»
		«suspend.genSuspend»
		«ENDFOR»
		«FOR action : scchart.find(Action)»
		«action.genAction»
		«ENDFOR»
		«FOR region : scchart.find(Region)»
		«region.genRegion»
		«ENDFOR»
	}
	'''
	
	
	
	def genDeclaration(Declaration declaration){
		var string = ''
		if(!declaration.inputOutput.trim.isEmpty){
			string = declaration.inputOutput + " "
		}
		if(declaration.constant){
			string = string + "const "
		}
		if(declaration.signal){
			string = string + "signal "
		}
		if(!declaration.declarationType.trim.isEmpty){
			string = string + declaration.declarationType + " "
		}
		if(declaration.name !== null ){
			string = string + declaration.name
		}
		if(declaration.assignment!==null){
			if(!declaration.assignment.trim.isEmpty){
				string = string + " = " + declaration.assignment
			}
		}
		return string
	}
	
	def genSuspend(Suspend suspend){
		var string = ''
		if(!suspend.suspendType.trim.isEmpty){
			string = suspend.suspendType + " "
		}
		if(suspend.condition!==null ){
			if(!suspend.condition.trim.isEmpty){
				string = string + "if " + suspend.condition
			}
		}
		return string
	}
	
	def genAction(Action action){
		var string = ''
		if(!action.actionType.trim.isEmpty){
			string = action.actionType + " "
		}
		if(action.condition!==null ){
			if(!action.condition.trim.isEmpty){
				string = string + "if " + action.effect
			}
		}
		if(action.effect!==null){
			if(!action.effect.trim.isEmpty){
				string = string + "do " + action.condition + " "
			}
		}
		return string
	}
	
	def genRegion(Region region)'''
		region «IF(region.name!==null)»«region.name»«ENDIF»«IF(region.label!==null)»"«region.label»"«ENDIF» {
			«FOR initState : region.find(InitialState)»
			«initState.genInitState»
			«initState.getOutgoingAbstractTransitions().genEdgesOrder»
			«ENDFOR»
		}
	'''
	
	def genInitState(InitialState initState){
		var string = "initial state "
		string = string + initState.name
		if(initState.label!==null){
			string = string + " " + initState.label
		}
		return string
	}
	
	def genState(SimpleState simpleState){
		var string = "state "
		string = string + simpleState.name
		if(simpleState.label!==null){
			string = string + " " + simpleState.label
		}
		return string
	}
	
	def genEdgesOrder(EList<AbstractTransition> transitions){
		for(var i = 0; i <transitions.size;i++){
			var continue = false
			var j = 0
			while(!continue&&j<transitions.size){
				if(transitions.get(j).priority==i){
					transitions.get(j).genEdge
					continue = true
				}
			}
		}
	}
//
//	'''
//		«FOR transition : transitions»
//		«transition.genEdge»
//		«ENDFOR»
//	'''
	
	def genEdge(AbstractTransition transition){
			switch transition {
				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof ImmediateTransition : return genImmediateTransition(transition as ImmediateTransition)
//				case transition instanceof TerminationTransition : return genTerminationTransition(transition as TerminationTransition)
//				case transition instanceof ConditionalTerminationTransition : return genConditionalTerminationTransition(transition as ConditionalTerminationTransition)
//				case transition instanceof StrongAbortTransition : return genStrongAbortTransition(transition as StrongAbortTransition)
//				case transition instanceof ImmediateStrongAbortTransition : return genImmediateStrongAbortTransition(transition as ImmediateStrongAbortTransition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
//				case transition instanceof Transition : return genTransition(transition as Transition)
				default : return ""
			}
	}
	
	def genTransition(Transition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!transition.condition.trim.isEmpty){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.effect!==null){
			if(!transition.effect.trim.isEmpty){
				string = string + " do " transition.effect + " "
			}
		}
		switch transition.getTargetElement {
			case transition.getTargetElement instanceof SuperState : string + "go to " + (transition.getTargetElement as SuperState).name
			case transition.getTargetElement instanceof SimpleState : string + "go to " + (transition.getTargetElement as SimpleState).name
		}
		return string
	}
	
	def genImmediateTransition(ImmediateTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!transition.condition.trim.isEmpty){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.effect!==null){
			if(!transition.effect.trim.isEmpty){
				string = string + " do " transition.effect + " "
			}
		}
		switch transition.getTargetElement {
			case transition.getTargetElement instanceof SuperState : string + "go to " + (transition.getTargetElement as SuperState).name
			case transition.getTargetElement instanceof SimpleState : string + "go to " + (transition.getTargetElement as SimpleState).name
		}
		return string
	}
	
	def genTerminationTransition(TerminationTransition transition){
		var string =  ""
		if(transition.effect!==null){
			if(!transition.effect.trim.isEmpty){
				string = string + " do " transition.effect + " "
			}
		}
		switch transition.getTargetElement {
			case transition.getTargetElement instanceof SuperState : string + "join to " + (transition.getTargetElement as SuperState).name
			case transition.getTargetElement instanceof SimpleState : string + "join to " + (transition.getTargetElement as SimpleState).name
		}
		return string
	}
	
	def genConditionalTerminationTransition(ConditionalTerminationTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!transition.condition.trim.isEmpty){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.effect!==null){
			if(!transition.effect.trim.isEmpty){
				string = string + " do " transition.effect + " "
			}
		}
		switch transition.getTargetElement {
			case transition.getTargetElement instanceof SuperState : string + "join to " + (transition.getTargetElement as SuperState).name
			case transition.getTargetElement instanceof SimpleState : string + "join to " + (transition.getTargetElement as SimpleState).name
		}
		return string
	}
	
	def genStrongAbortTransition(StrongAbortTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!transition.condition.trim.isEmpty){
				string = "if " + string + transition.condition + " "
			}
		}
		if(transition.effect!==null){
			if(!transition.effect.trim.isEmpty){
				string = string + " do " transition.effect + " "
			}
		}
		switch transition.getTargetElement {
			case transition.getTargetElement instanceof SuperState : string + "abort to " + (transition.getTargetElement as SuperState).name
			case transition.getTargetElement instanceof SimpleState : string + "abort to " + (transition.getTargetElement as SimpleState).name
		}
		return string
	}
	
	def genImmediateStrongAbortTransition(ImmediateStrongAbortTransition transition){
		var string =  ""
		if(transition.count_delay!==null){
			if(!transition.count_delay.trim.isEmpty){
				string = string + transition.count_delay + " "
			}
		}
		if(transition.condition!==null){
			if(!transition.condition.trim.isEmpty){
				string = "immediate if " + string + transition.condition + " "
			}
		}
		if(transition.effect!==null){
			if(!transition.effect.trim.isEmpty){
				string = string + " do " transition.effect + " "
			}
		}
		switch transition.getTargetElement {
			case transition.getTargetElement instanceof SuperState : string + "abort to " + (transition.getTargetElement as SuperState).name
			case transition.getTargetElement instanceof SimpleState : string + "abort to " + (transition.getTargetElement as SimpleState).name
		}
		return string
	}
}
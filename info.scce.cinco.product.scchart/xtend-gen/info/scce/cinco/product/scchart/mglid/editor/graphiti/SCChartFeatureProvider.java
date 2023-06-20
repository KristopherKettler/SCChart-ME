package info.scce.cinco.product.scchart.mglid.editor.graphiti;

import de.jabc.cinco.meta.core.ge.style.generator.runtime.provider.CincoFeatureProvider;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalModelElement;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalConnector;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDefferedTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalFinalState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalImmediateTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitialState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalInitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclarationNode;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSCChart;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSimpleState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalStrongAbortTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalSuperStateDeclarationNode;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTerminationTransition;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalWeakAbortTransition;
import java.util.Arrays;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddBendpointFeature;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveBendpointFeature;
import org.eclipse.graphiti.features.IMoveConnectionDecoratorFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IRemoveBendpointFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddBendpointContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveBendpointContext;
import org.eclipse.graphiti.features.context.IMoveConnectionDecoratorContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IRemoveBendpointContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

@SuppressWarnings("all")
public class SCChartFeatureProvider implements /* org.eclipse.graphiti.ui.features.DefaultFeatureProvider */CincoFeatureProvider {
  public SCChartFeatureProvider(final IDiagramTypeProvider dtp) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(IDiagramTypeProvider) is undefined");
  }
  
  @Override
  public IAddFeature[] getAllLibComponentAddFeatures() {
    return new IAddFeature[] {};
  }
  
  @Override
  public IAddFeature getAddFeature(final IAddContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getDiagramTypeProvider() is undefined"
      + "\nThe method or field super is undefined"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider"
      + "\ngetDiagram cannot be resolved"
      + "\neResource cannot be resolved"
      + "\ngetAddFeature cannot be resolved");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalInitilalSuperState e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureInitilalSuperState cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalFinalState e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureFinalState cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalRootStateDeclarationNode e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureRootStateDeclarationNode cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalConnector e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureConnector cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalSimpleState e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureSimpleState cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalRegion e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureRegion cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalSuperState e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureSuperState cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalInitialState e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureInitialState cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalSuperStateDeclarationNode e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureSuperStateDeclarationNode cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalRootState e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureRootState cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalDefferedTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureDefferedTransition cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalWeakAbortTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureWeakAbortTransition cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureTransition cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalWeakAbortTerminationTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureWeakAbortTerminationTransition cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalImmediateTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureImmediateTransition cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalStrongAbortTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureStrongAbortTransition cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final InternalImmediateTerminationTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.add.AddFeatureImmediateTerminationTransition cannot be resolved.");
  }
  
  protected IAddFeature _dispatchedGetAddFeature(final Object e) {
    return null;
  }
  
  private Object getGraphModel(final IFile file) {
    final URI fileUri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
    Resource res = new ResourceSetImpl().getResource(fileUri, true);
    if ((res != null)) {
      EList<EObject> _contents = res.getContents();
      for (final EObject o : _contents) {
        if ((o instanceof InternalGraphModel)) {
          return o;
        }
      }
    }
    return null;
  }
  
  @Override
  public ICreateFeature[] getCreateFeatures() {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureInitilalSuperState cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureFinalState cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureRootStateDeclarationNode cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureConnector cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureSimpleState cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureRegion cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureSuperState cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureInitialState cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureSuperStateDeclarationNode cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureRootState cannot be resolved.");
  }
  
  @Override
  public ICreateConnectionFeature[] getCreateConnectionFeatures() {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureDefferedTransition cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureWeakAbortTransition cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureTransition cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureWeakAbortTerminationTransition cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureImmediateTransition cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureStrongAbortTransition cannot be resolved."
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.create.CreateFeatureImmediateTerminationTransition cannot be resolved.");
  }
  
  @Override
  public IDeleteFeature getDeleteFeature(final IDeleteContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ngetDeleteFeature cannot be resolved");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalFinalState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureFinalState cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalSimpleState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureSimpleState cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalSuperStateDeclarationNode me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureSuperStateDeclarationNode cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalStrongAbortTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureStrongAbortTransition cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalImmediateTerminationTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureImmediateTerminationTransition cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalRootState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureRootState cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalInitilalSuperState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureInitilalSuperState cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalDefferedTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureDefferedTransition cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalWeakAbortTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureWeakAbortTransition cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureTransition cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalRootStateDeclarationNode me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureRootStateDeclarationNode cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalWeakAbortTerminationTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureWeakAbortTerminationTransition cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalConnector me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureConnector cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalRegion me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureRegion cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalSuperState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureSuperState cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalInitialState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureInitialState cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final InternalImmediateTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.delete.DeleteFeatureImmediateTransition cannot be resolved.");
  }
  
  protected IDeleteFeature _dispatchedGetDeleteFeature(final Object me) {
    return null;
  }
  
  @Override
  public ILayoutFeature getLayoutFeature(final ILayoutContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider"
      + "\ngetLayoutFeature cannot be resolved");
  }
  
  protected ILayoutFeature _dispatchedGetLayoutFeature(final InternalDefferedTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.layout.LayoutFeatureDefferedTransition cannot be resolved.");
  }
  
  protected ILayoutFeature _dispatchedGetLayoutFeature(final InternalWeakAbortTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.layout.LayoutFeatureWeakAbortTransition cannot be resolved.");
  }
  
  protected ILayoutFeature _dispatchedGetLayoutFeature(final InternalTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.layout.LayoutFeatureTransition cannot be resolved.");
  }
  
  protected ILayoutFeature _dispatchedGetLayoutFeature(final InternalWeakAbortTerminationTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.layout.LayoutFeatureWeakAbortTerminationTransition cannot be resolved.");
  }
  
  protected ILayoutFeature _dispatchedGetLayoutFeature(final InternalImmediateTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.layout.LayoutFeatureImmediateTransition cannot be resolved.");
  }
  
  protected ILayoutFeature _dispatchedGetLayoutFeature(final InternalStrongAbortTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.layout.LayoutFeatureStrongAbortTransition cannot be resolved.");
  }
  
  protected ILayoutFeature _dispatchedGetLayoutFeature(final InternalImmediateTerminationTransition e) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.layout.LayoutFeatureImmediateTerminationTransition cannot be resolved.");
  }
  
  protected ILayoutFeature _dispatchedGetLayoutFeature(final Object e) {
    return null;
  }
  
  @Override
  public IResizeShapeFeature getResizeShapeFeature(final IResizeShapeContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ngetResizeShapeFeature cannot be resolved");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalInitilalSuperState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureInitilalSuperState cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalFinalState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureFinalState cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalRootStateDeclarationNode me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureRootStateDeclarationNode cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalConnector me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureConnector cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalSimpleState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureSimpleState cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalRegion me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureRegion cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalSuperState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureSuperState cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalInitialState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureInitialState cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalSuperStateDeclarationNode me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureSuperStateDeclarationNode cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final InternalRootState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.resize.ResizeFeatureRootState cannot be resolved.");
  }
  
  protected IResizeShapeFeature _dispatchedGetResizeShapeFeature(final Object me) {
    return null;
  }
  
  @Override
  public IMoveShapeFeature getMoveShapeFeature(final IMoveShapeContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ngetMoveShapeFeature cannot be resolved");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalInitilalSuperState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.move.MoveFeatureInitilalSuperState cannot be resolved.");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalFinalState me) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalRootStateDeclarationNode me) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalConnector me) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalSimpleState me) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalRegion me) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalSuperState me) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalInitialState me) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalSuperStateDeclarationNode me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.move.MoveFeatureSuperStateDeclarationNode cannot be resolved.");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final InternalRootState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.move.MoveFeatureRootState cannot be resolved.");
  }
  
  protected IMoveShapeFeature _dispatchedGetMoveShapeFeature(final Object me) {
    return null;
  }
  
  @Override
  public IUpdateFeature getUpdateFeature(final IUpdateContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ngetUpdateFeature cannot be resolved");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalFinalState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureFinalState cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalSimpleState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureSimpleState cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalSuperStateDeclarationNode me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureSuperStateDeclarationNode cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalStrongAbortTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureStrongAbortTransition cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalImmediateTerminationTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureImmediateTerminationTransition cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalRootState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureRootState cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalInitilalSuperState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureInitilalSuperState cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalDefferedTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureDefferedTransition cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalWeakAbortTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureWeakAbortTransition cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureTransition cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalRootStateDeclarationNode me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureRootStateDeclarationNode cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalWeakAbortTerminationTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureWeakAbortTerminationTransition cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalConnector me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureConnector cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalRegion me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureRegion cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalSuperState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureSuperState cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalInitialState me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureInitialState cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final InternalImmediateTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.update.UpdateFeatureImmediateTransition cannot be resolved.");
  }
  
  protected IUpdateFeature _dispatchedGetUpdateFeature(final Object me) {
    return null;
  }
  
  @Override
  public IReconnectionFeature getReconnectionFeature(final IReconnectionContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ngetReconnectionFeature cannot be resolved");
  }
  
  protected IReconnectionFeature _dispatchedGetReconnectionFeature(final InternalDefferedTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.reconnect.ReconnectFeatureDefferedTransition cannot be resolved.");
  }
  
  protected IReconnectionFeature _dispatchedGetReconnectionFeature(final InternalWeakAbortTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.reconnect.ReconnectFeatureWeakAbortTransition cannot be resolved.");
  }
  
  protected IReconnectionFeature _dispatchedGetReconnectionFeature(final InternalTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.reconnect.ReconnectFeatureTransition cannot be resolved.");
  }
  
  protected IReconnectionFeature _dispatchedGetReconnectionFeature(final InternalWeakAbortTerminationTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.reconnect.ReconnectFeatureWeakAbortTerminationTransition cannot be resolved.");
  }
  
  protected IReconnectionFeature _dispatchedGetReconnectionFeature(final InternalImmediateTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.reconnect.ReconnectFeatureImmediateTransition cannot be resolved.");
  }
  
  protected IReconnectionFeature _dispatchedGetReconnectionFeature(final InternalStrongAbortTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.reconnect.ReconnectFeatureStrongAbortTransition cannot be resolved.");
  }
  
  protected IReconnectionFeature _dispatchedGetReconnectionFeature(final InternalImmediateTerminationTransition me) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.features.reconnect.ReconnectFeatureImmediateTerminationTransition cannot be resolved.");
  }
  
  protected IReconnectionFeature _dispatchedGetReconnectionFeature(final Object me) {
    return null;
  }
  
  @Override
  public ICustomFeature[] getCustomFeatures(final ICustomContext context) {
    Object bo = this.getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
    if ((bo instanceof InternalGraphModel)) {
      InternalGraphModel ime = ((InternalGraphModel) bo);
      if ((ime instanceof InternalSCChart)) {
        return new ICustomFeature[] {};
      }
    }
    if ((bo instanceof InternalModelElement)) {
      InternalModelElement ime_1 = ((InternalModelElement) bo);
      return this.dispatchedGetCustomFeatures(bo);
    }
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalFinalState me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalSimpleState me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalSuperStateDeclarationNode me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalStrongAbortTransition me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalImmediateTerminationTransition me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalRootState me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalInitilalSuperState me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalDefferedTransition me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalWeakAbortTransition me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalTransition me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalRootStateDeclarationNode me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalWeakAbortTerminationTransition me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalConnector me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalRegion me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalSuperState me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalInitialState me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final InternalImmediateTransition me) {
    return new ICustomFeature[] {};
  }
  
  protected ICustomFeature[] _dispatchedGetCustomFeatures(final Object me) {
    return new ICustomFeature[] {};
  }
  
  @Override
  public IMoveBendpointFeature getMoveBendpointFeature(final IMoveBendpointContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  @Override
  public IAddBendpointFeature getAddBendpointFeature(final IAddBendpointContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  @Override
  public IRemoveBendpointFeature getRemoveBendpointFeature(final IRemoveBendpointContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  @Override
  public IRemoveFeature getRemoveFeature(final IRemoveContext context) {
    return null;
  }
  
  @Override
  public IMoveConnectionDecoratorFeature getMoveConnectionDecoratorFeature(final IMoveConnectionDecoratorContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider");
  }
  
  @Override
  public ICopyFeature getCopyFeature(final ICopyContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider"
      + "\nType mismatch: cannot convert from CincoCopyFeature to ICopyFeature");
  }
  
  @Override
  public IPasteFeature getPasteFeature(final IPasteContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from SCChartFeatureProvider to IFeatureProvider"
      + "\nType mismatch: cannot convert from CincoPasteFeature to IPasteFeature");
  }
  
  @Override
  public Object getBusinessObjectForPictogramElement(final PictogramElement pictogramElement) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ngetBusinessObjectForPictogramElement cannot be resolved");
  }
  
  public IAddFeature dispatchedGetAddFeature(final Object e) {
    if (e instanceof InternalInitilalSuperState) {
      return _dispatchedGetAddFeature((InternalInitilalSuperState)e);
    } else if (e instanceof InternalFinalState) {
      return _dispatchedGetAddFeature((InternalFinalState)e);
    } else if (e instanceof InternalImmediateTerminationTransition) {
      return _dispatchedGetAddFeature((InternalImmediateTerminationTransition)e);
    } else if (e instanceof InternalImmediateTransition) {
      return _dispatchedGetAddFeature((InternalImmediateTransition)e);
    } else if (e instanceof InternalInitialState) {
      return _dispatchedGetAddFeature((InternalInitialState)e);
    } else if (e instanceof InternalRegion) {
      return _dispatchedGetAddFeature((InternalRegion)e);
    } else if (e instanceof InternalRootState) {
      return _dispatchedGetAddFeature((InternalRootState)e);
    } else if (e instanceof InternalStrongAbortTransition) {
      return _dispatchedGetAddFeature((InternalStrongAbortTransition)e);
    } else if (e instanceof InternalSuperState) {
      return _dispatchedGetAddFeature((InternalSuperState)e);
    } else if (e instanceof InternalWeakAbortTerminationTransition) {
      return _dispatchedGetAddFeature((InternalWeakAbortTerminationTransition)e);
    } else if (e instanceof InternalWeakAbortTransition) {
      return _dispatchedGetAddFeature((InternalWeakAbortTransition)e);
    } else if (e instanceof InternalConnector) {
      return _dispatchedGetAddFeature((InternalConnector)e);
    } else if (e instanceof InternalDefferedTransition) {
      return _dispatchedGetAddFeature((InternalDefferedTransition)e);
    } else if (e instanceof InternalRootStateDeclarationNode) {
      return _dispatchedGetAddFeature((InternalRootStateDeclarationNode)e);
    } else if (e instanceof InternalSimpleState) {
      return _dispatchedGetAddFeature((InternalSimpleState)e);
    } else if (e instanceof InternalSuperStateDeclarationNode) {
      return _dispatchedGetAddFeature((InternalSuperStateDeclarationNode)e);
    } else if (e instanceof InternalTransition) {
      return _dispatchedGetAddFeature((InternalTransition)e);
    } else if (e != null) {
      return _dispatchedGetAddFeature(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public IDeleteFeature dispatchedGetDeleteFeature(final Object me) {
    if (me instanceof InternalInitilalSuperState) {
      return _dispatchedGetDeleteFeature((InternalInitilalSuperState)me);
    } else if (me instanceof InternalFinalState) {
      return _dispatchedGetDeleteFeature((InternalFinalState)me);
    } else if (me instanceof InternalImmediateTerminationTransition) {
      return _dispatchedGetDeleteFeature((InternalImmediateTerminationTransition)me);
    } else if (me instanceof InternalImmediateTransition) {
      return _dispatchedGetDeleteFeature((InternalImmediateTransition)me);
    } else if (me instanceof InternalInitialState) {
      return _dispatchedGetDeleteFeature((InternalInitialState)me);
    } else if (me instanceof InternalRegion) {
      return _dispatchedGetDeleteFeature((InternalRegion)me);
    } else if (me instanceof InternalRootState) {
      return _dispatchedGetDeleteFeature((InternalRootState)me);
    } else if (me instanceof InternalStrongAbortTransition) {
      return _dispatchedGetDeleteFeature((InternalStrongAbortTransition)me);
    } else if (me instanceof InternalSuperState) {
      return _dispatchedGetDeleteFeature((InternalSuperState)me);
    } else if (me instanceof InternalWeakAbortTerminationTransition) {
      return _dispatchedGetDeleteFeature((InternalWeakAbortTerminationTransition)me);
    } else if (me instanceof InternalWeakAbortTransition) {
      return _dispatchedGetDeleteFeature((InternalWeakAbortTransition)me);
    } else if (me instanceof InternalConnector) {
      return _dispatchedGetDeleteFeature((InternalConnector)me);
    } else if (me instanceof InternalDefferedTransition) {
      return _dispatchedGetDeleteFeature((InternalDefferedTransition)me);
    } else if (me instanceof InternalRootStateDeclarationNode) {
      return _dispatchedGetDeleteFeature((InternalRootStateDeclarationNode)me);
    } else if (me instanceof InternalSimpleState) {
      return _dispatchedGetDeleteFeature((InternalSimpleState)me);
    } else if (me instanceof InternalSuperStateDeclarationNode) {
      return _dispatchedGetDeleteFeature((InternalSuperStateDeclarationNode)me);
    } else if (me instanceof InternalTransition) {
      return _dispatchedGetDeleteFeature((InternalTransition)me);
    } else if (me != null) {
      return _dispatchedGetDeleteFeature(me);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(me).toString());
    }
  }
  
  public ILayoutFeature dispatchedGetLayoutFeature(final Object e) {
    if (e instanceof InternalImmediateTerminationTransition) {
      return _dispatchedGetLayoutFeature((InternalImmediateTerminationTransition)e);
    } else if (e instanceof InternalImmediateTransition) {
      return _dispatchedGetLayoutFeature((InternalImmediateTransition)e);
    } else if (e instanceof InternalStrongAbortTransition) {
      return _dispatchedGetLayoutFeature((InternalStrongAbortTransition)e);
    } else if (e instanceof InternalWeakAbortTerminationTransition) {
      return _dispatchedGetLayoutFeature((InternalWeakAbortTerminationTransition)e);
    } else if (e instanceof InternalWeakAbortTransition) {
      return _dispatchedGetLayoutFeature((InternalWeakAbortTransition)e);
    } else if (e instanceof InternalDefferedTransition) {
      return _dispatchedGetLayoutFeature((InternalDefferedTransition)e);
    } else if (e instanceof InternalTransition) {
      return _dispatchedGetLayoutFeature((InternalTransition)e);
    } else if (e != null) {
      return _dispatchedGetLayoutFeature(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public IResizeShapeFeature dispatchedGetResizeShapeFeature(final Object me) {
    if (me instanceof InternalInitilalSuperState) {
      return _dispatchedGetResizeShapeFeature((InternalInitilalSuperState)me);
    } else if (me instanceof InternalFinalState) {
      return _dispatchedGetResizeShapeFeature((InternalFinalState)me);
    } else if (me instanceof InternalInitialState) {
      return _dispatchedGetResizeShapeFeature((InternalInitialState)me);
    } else if (me instanceof InternalRegion) {
      return _dispatchedGetResizeShapeFeature((InternalRegion)me);
    } else if (me instanceof InternalRootState) {
      return _dispatchedGetResizeShapeFeature((InternalRootState)me);
    } else if (me instanceof InternalSuperState) {
      return _dispatchedGetResizeShapeFeature((InternalSuperState)me);
    } else if (me instanceof InternalConnector) {
      return _dispatchedGetResizeShapeFeature((InternalConnector)me);
    } else if (me instanceof InternalRootStateDeclarationNode) {
      return _dispatchedGetResizeShapeFeature((InternalRootStateDeclarationNode)me);
    } else if (me instanceof InternalSimpleState) {
      return _dispatchedGetResizeShapeFeature((InternalSimpleState)me);
    } else if (me instanceof InternalSuperStateDeclarationNode) {
      return _dispatchedGetResizeShapeFeature((InternalSuperStateDeclarationNode)me);
    } else if (me != null) {
      return _dispatchedGetResizeShapeFeature(me);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(me).toString());
    }
  }
  
  public IMoveShapeFeature dispatchedGetMoveShapeFeature(final Object me) {
    if (me instanceof InternalInitilalSuperState) {
      return _dispatchedGetMoveShapeFeature((InternalInitilalSuperState)me);
    } else if (me instanceof InternalFinalState) {
      return _dispatchedGetMoveShapeFeature((InternalFinalState)me);
    } else if (me instanceof InternalInitialState) {
      return _dispatchedGetMoveShapeFeature((InternalInitialState)me);
    } else if (me instanceof InternalRegion) {
      return _dispatchedGetMoveShapeFeature((InternalRegion)me);
    } else if (me instanceof InternalRootState) {
      return _dispatchedGetMoveShapeFeature((InternalRootState)me);
    } else if (me instanceof InternalSuperState) {
      return _dispatchedGetMoveShapeFeature((InternalSuperState)me);
    } else if (me instanceof InternalConnector) {
      return _dispatchedGetMoveShapeFeature((InternalConnector)me);
    } else if (me instanceof InternalRootStateDeclarationNode) {
      return _dispatchedGetMoveShapeFeature((InternalRootStateDeclarationNode)me);
    } else if (me instanceof InternalSimpleState) {
      return _dispatchedGetMoveShapeFeature((InternalSimpleState)me);
    } else if (me instanceof InternalSuperStateDeclarationNode) {
      return _dispatchedGetMoveShapeFeature((InternalSuperStateDeclarationNode)me);
    } else if (me != null) {
      return _dispatchedGetMoveShapeFeature(me);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(me).toString());
    }
  }
  
  public IUpdateFeature dispatchedGetUpdateFeature(final Object me) {
    if (me instanceof InternalInitilalSuperState) {
      return _dispatchedGetUpdateFeature((InternalInitilalSuperState)me);
    } else if (me instanceof InternalFinalState) {
      return _dispatchedGetUpdateFeature((InternalFinalState)me);
    } else if (me instanceof InternalImmediateTerminationTransition) {
      return _dispatchedGetUpdateFeature((InternalImmediateTerminationTransition)me);
    } else if (me instanceof InternalImmediateTransition) {
      return _dispatchedGetUpdateFeature((InternalImmediateTransition)me);
    } else if (me instanceof InternalInitialState) {
      return _dispatchedGetUpdateFeature((InternalInitialState)me);
    } else if (me instanceof InternalRegion) {
      return _dispatchedGetUpdateFeature((InternalRegion)me);
    } else if (me instanceof InternalRootState) {
      return _dispatchedGetUpdateFeature((InternalRootState)me);
    } else if (me instanceof InternalStrongAbortTransition) {
      return _dispatchedGetUpdateFeature((InternalStrongAbortTransition)me);
    } else if (me instanceof InternalSuperState) {
      return _dispatchedGetUpdateFeature((InternalSuperState)me);
    } else if (me instanceof InternalWeakAbortTerminationTransition) {
      return _dispatchedGetUpdateFeature((InternalWeakAbortTerminationTransition)me);
    } else if (me instanceof InternalWeakAbortTransition) {
      return _dispatchedGetUpdateFeature((InternalWeakAbortTransition)me);
    } else if (me instanceof InternalConnector) {
      return _dispatchedGetUpdateFeature((InternalConnector)me);
    } else if (me instanceof InternalDefferedTransition) {
      return _dispatchedGetUpdateFeature((InternalDefferedTransition)me);
    } else if (me instanceof InternalRootStateDeclarationNode) {
      return _dispatchedGetUpdateFeature((InternalRootStateDeclarationNode)me);
    } else if (me instanceof InternalSimpleState) {
      return _dispatchedGetUpdateFeature((InternalSimpleState)me);
    } else if (me instanceof InternalSuperStateDeclarationNode) {
      return _dispatchedGetUpdateFeature((InternalSuperStateDeclarationNode)me);
    } else if (me instanceof InternalTransition) {
      return _dispatchedGetUpdateFeature((InternalTransition)me);
    } else if (me != null) {
      return _dispatchedGetUpdateFeature(me);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(me).toString());
    }
  }
  
  public IReconnectionFeature dispatchedGetReconnectionFeature(final Object me) {
    if (me instanceof InternalImmediateTerminationTransition) {
      return _dispatchedGetReconnectionFeature((InternalImmediateTerminationTransition)me);
    } else if (me instanceof InternalImmediateTransition) {
      return _dispatchedGetReconnectionFeature((InternalImmediateTransition)me);
    } else if (me instanceof InternalStrongAbortTransition) {
      return _dispatchedGetReconnectionFeature((InternalStrongAbortTransition)me);
    } else if (me instanceof InternalWeakAbortTerminationTransition) {
      return _dispatchedGetReconnectionFeature((InternalWeakAbortTerminationTransition)me);
    } else if (me instanceof InternalWeakAbortTransition) {
      return _dispatchedGetReconnectionFeature((InternalWeakAbortTransition)me);
    } else if (me instanceof InternalDefferedTransition) {
      return _dispatchedGetReconnectionFeature((InternalDefferedTransition)me);
    } else if (me instanceof InternalTransition) {
      return _dispatchedGetReconnectionFeature((InternalTransition)me);
    } else if (me != null) {
      return _dispatchedGetReconnectionFeature(me);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(me).toString());
    }
  }
  
  public ICustomFeature[] dispatchedGetCustomFeatures(final Object me) {
    if (me instanceof InternalInitilalSuperState) {
      return _dispatchedGetCustomFeatures((InternalInitilalSuperState)me);
    } else if (me instanceof InternalFinalState) {
      return _dispatchedGetCustomFeatures((InternalFinalState)me);
    } else if (me instanceof InternalImmediateTerminationTransition) {
      return _dispatchedGetCustomFeatures((InternalImmediateTerminationTransition)me);
    } else if (me instanceof InternalImmediateTransition) {
      return _dispatchedGetCustomFeatures((InternalImmediateTransition)me);
    } else if (me instanceof InternalInitialState) {
      return _dispatchedGetCustomFeatures((InternalInitialState)me);
    } else if (me instanceof InternalRegion) {
      return _dispatchedGetCustomFeatures((InternalRegion)me);
    } else if (me instanceof InternalRootState) {
      return _dispatchedGetCustomFeatures((InternalRootState)me);
    } else if (me instanceof InternalStrongAbortTransition) {
      return _dispatchedGetCustomFeatures((InternalStrongAbortTransition)me);
    } else if (me instanceof InternalSuperState) {
      return _dispatchedGetCustomFeatures((InternalSuperState)me);
    } else if (me instanceof InternalWeakAbortTerminationTransition) {
      return _dispatchedGetCustomFeatures((InternalWeakAbortTerminationTransition)me);
    } else if (me instanceof InternalWeakAbortTransition) {
      return _dispatchedGetCustomFeatures((InternalWeakAbortTransition)me);
    } else if (me instanceof InternalConnector) {
      return _dispatchedGetCustomFeatures((InternalConnector)me);
    } else if (me instanceof InternalDefferedTransition) {
      return _dispatchedGetCustomFeatures((InternalDefferedTransition)me);
    } else if (me instanceof InternalRootStateDeclarationNode) {
      return _dispatchedGetCustomFeatures((InternalRootStateDeclarationNode)me);
    } else if (me instanceof InternalSimpleState) {
      return _dispatchedGetCustomFeatures((InternalSimpleState)me);
    } else if (me instanceof InternalSuperStateDeclarationNode) {
      return _dispatchedGetCustomFeatures((InternalSuperStateDeclarationNode)me);
    } else if (me instanceof InternalTransition) {
      return _dispatchedGetCustomFeatures((InternalTransition)me);
    } else if (me != null) {
      return _dispatchedGetCustomFeatures(me);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(me).toString());
    }
  }
}

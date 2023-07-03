package info.scce.cinco.product.scchart.mglid.editor.graphiti.features.move;

import de.jabc.cinco.meta.core.ge.style.generator.runtime.errorhandling.ECincoError;
import de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoMoveShapeFeature;
import graphmodel.ModelElementContainer;
import graphmodel.internal.InternalModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.DataFlowRegion;
import info.scce.cinco.product.scchart.mglid.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalDataFlowRegion;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRegion;
import java.util.Arrays;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;

@SuppressWarnings("all")
public class MoveFeatureInitilalSuperState extends CincoMoveShapeFeature {
  private ECincoError error = ECincoError.OK;
  
  /**
   * Call of the Superclass
   * @param fp: Fp is the parameter of the Superclass-Call
   */
  public MoveFeatureInitilalSuperState(final IFeatureProvider fp) {
    super(fp);
  }
  
  /**
   * Checks if a shape is moveable
   * @param context : Contains the information, needed to let a feature move a shape
   * @param apiCall : Apicall shows if the Cinco Api is used
   * @return Returns true if a shape can be moved and false if not
   */
  @Override
  public boolean canMoveShape(final IMoveShapeContext context, final boolean apiCall) {
    if (apiCall) {
      final Object o = this.getBusinessObjectForPictogramElement(context.getShape());
      final Object source = this.getBusinessObjectForPictogramElement(context.getSourceContainer());
      final Object target = this.getBusinessObjectForPictogramElement(context.getTargetContainer());
      if (((source != null) && source.equals(target))) {
        return true;
      }
      if ((target instanceof InternalModelElementContainer)) {
        return ((InternalModelElementContainer) target).canContain(InitilalSuperState.class);
      }
      boolean _equals = this.getError().equals(ECincoError.OK);
      if (_equals) {
        this.setError(ECincoError.INVALID_CONTAINER);
      }
      return false;
    }
    return false;
  }
  
  /**
   * Checks if a shape is moveable by using the method 'canMoveShape(context,apiCall)'
   * @param context : Contains the information, needed to let a feature move a shape
   * @return Returns true if a shape can be moved and false if not
   */
  @Override
  public boolean canMoveShape(final IMoveShapeContext context) {
    return this.canMoveShape(context, true);
  }
  
  /**
   * Moves a Shape by removing the shape at the source and adding it at the target
   * @param context : Contains the information, needed to let a feature move a shape
   */
  @Override
  public void moveShape(final IMoveShapeContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\ninfo.scce.cinco.product.scchart.mglid.editor.graphiti.api.CInitilalSuperState cannot be resolved to a type.");
  }
  
  protected boolean _moveContainer(final InternalModelElementContainer target, final InitilalSuperState oe, final IMoveShapeContext context) {
    return false;
  }
  
  protected boolean _moveContainer(final InternalRegion target, final InitilalSuperState oe, final IMoveShapeContext context) {
    ModelElementContainer _containerElement = target.getContainerElement();
    oe.moveTo(((Region) _containerElement), context.getX(), context.getY());
    return true;
  }
  
  protected boolean _moveContainer(final InternalDataFlowRegion target, final InitilalSuperState oe, final IMoveShapeContext context) {
    ModelElementContainer _containerElement = target.getContainerElement();
    oe.moveTo(((DataFlowRegion) _containerElement), context.getX(), context.getY());
    return true;
  }
  
  /**
   * Get-method for an error
   * @return Returns an 'error' in which 'error' is  'ECincoError.OK'
   */
  @Override
  public ECincoError getError() {
    return this.error;
  }
  
  /**
   * Set-method for an error
   * @param error : Error is a value of the enum: MAX_CARDINALITY, MAX_IN, MAX_OUT, INVALID_SOURCE, INVALID_TARGET, INVALID_CONTAINER, INVALID_CLONE_TARGET, OK
   */
  public void setError(final ECincoError error) {
    this.error = error;
  }
  
  public boolean moveContainer(final InternalModelElementContainer target, final InitilalSuperState oe, final IMoveShapeContext context) {
    if (target instanceof InternalDataFlowRegion) {
      return _moveContainer((InternalDataFlowRegion)target, oe, context);
    } else if (target instanceof InternalRegion) {
      return _moveContainer((InternalRegion)target, oe, context);
    } else if (target != null) {
      return _moveContainer(target, oe, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(target, oe, context).toString());
    }
  }
}

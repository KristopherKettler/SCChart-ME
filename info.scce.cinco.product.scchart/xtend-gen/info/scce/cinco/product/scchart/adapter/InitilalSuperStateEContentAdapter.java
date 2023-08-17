package info.scce.cinco.product.scchart.adapter;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.core.event.hub.EventHub;
import de.jabc.cinco.meta.core.event.hub.impl.PayloadContext;
import de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload;
import de.jabc.cinco.meta.runtime.contentadapter.CincoEContentAdapter;
import graphmodel.GraphModel;
import graphmodel.ModelElement;
import graphmodel.internal.InternalGraphModel;
import info.scce.cinco.product.scchart.scchart.InitilalSuperState;
import info.scce.cinco.product.scchart.scchart.internal.InternalInitilalSuperState;
import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

@SuppressWarnings("all")
public class InitilalSuperStateEContentAdapter extends EContentAdapter implements CincoEContentAdapter {
  @Override
  public void notifyChanged(final Notification notification) {
    super.notifyChanged(notification);
    final Object o = notification.getNotifier();
    final Object feature = notification.getFeature();
    if ((o instanceof InternalInitilalSuperState)) {
      if ((Objects.equal(((InternalInitilalSuperState)o).eContainer(), null) && (!(o instanceof InternalGraphModel)))) {
        return;
      }
      boolean _matched = false;
      if (feature instanceof EStructuralFeature) {
        boolean _isRelevant = this.isRelevant(((EStructuralFeature)feature));
        if (_isRelevant) {
          _matched=true;
          ModelElement _element = ((InternalInitilalSuperState)o).getElement();
          String _name = ((EStructuralFeature)feature).getName();
          Object _oldValue = notification.getOldValue();
          final PostAttributeChangePayload<InitilalSuperState> eventPayload = new PostAttributeChangePayload<InitilalSuperState>(((InitilalSuperState) _element), _name, _oldValue);
          final PayloadContext<PostAttributeChangePayload<InitilalSuperState>, Void> eventContext = new PayloadContext<PostAttributeChangePayload<InitilalSuperState>, Void>("event.post.attributeChange.info_scce_cinco_product_scchart_scchart_InitilalSuperState", eventPayload);
          EventHub.getInstance().notifyFirst(eventContext);
          ModelElement _element_1 = ((InternalInitilalSuperState)o).getElement();
          GraphModel _rootElement = null;
          if (_element_1!=null) {
            _rootElement=_element_1.getRootElement();
          }
          if (_rootElement!=null) {
            _rootElement.updateModelElements();
          }
        }
      }
    }
  }
  
  private boolean isRelevant(final EStructuralFeature ftr) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _eDeliver = ftr.eDeliver();
    if (!_eDeliver) {
      _and_1 = false;
    } else {
      EList<EClassifier> _eClassifiers = InternalPackage.eINSTANCE.getEClassifiers();
      EObject _eContainer = null;
      if (ftr!=null) {
        _eContainer=ftr.eContainer();
      }
      boolean _contains = _eClassifiers.contains(_eContainer);
      _and_1 = _contains;
    }
    if (!_and_1) {
      _and = false;
    } else {
      String _name = ftr.getName();
      boolean _notEquals = (!Objects.equal(_name, "libraryComponentUID"));
      _and = _notEquals;
    }
    return _and;
  }
}

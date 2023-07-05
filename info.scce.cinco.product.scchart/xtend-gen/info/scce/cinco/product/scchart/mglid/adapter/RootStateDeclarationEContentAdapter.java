package info.scce.cinco.product.scchart.mglid.adapter;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.core.event.hub.EventHub;
import de.jabc.cinco.meta.core.event.hub.impl.PayloadContext;
import de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload;
import de.jabc.cinco.meta.runtime.contentadapter.CincoEContentAdapter;
import graphmodel.GraphModel;
import graphmodel.ModelElement;
import graphmodel.internal.InternalGraphModel;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.mglid.scchart.internal.InternalRootStateDeclaration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

@SuppressWarnings("all")
public class RootStateDeclarationEContentAdapter extends EContentAdapter implements CincoEContentAdapter {
  @Override
  public void notifyChanged(final Notification notification) {
    super.notifyChanged(notification);
    final Object o = notification.getNotifier();
    final Object feature = notification.getFeature();
    if ((o instanceof InternalRootStateDeclaration)) {
      if ((Objects.equal(((InternalRootStateDeclaration)o).eContainer(), null) && (!(o instanceof InternalGraphModel)))) {
        return;
      }
      boolean _matched = false;
      if (feature instanceof EStructuralFeature) {
        boolean _isRelevant = this.isRelevant(((EStructuralFeature)feature));
        if (_isRelevant) {
          _matched=true;
          ModelElement _element = ((InternalRootStateDeclaration)o).getElement();
          String _name = ((EStructuralFeature)feature).getName();
          Object _oldValue = notification.getOldValue();
          final PostAttributeChangePayload<RootStateDeclaration> eventPayload = new PostAttributeChangePayload<RootStateDeclaration>(((RootStateDeclaration) _element), _name, _oldValue);
          final PayloadContext<PostAttributeChangePayload<RootStateDeclaration>, Void> eventContext = new PayloadContext<PostAttributeChangePayload<RootStateDeclaration>, Void>("event.post.attributeChange.info_scce_cinco_product_scchart_mglid_scchart_RootStateDeclaration", eventPayload);
          EventHub.getInstance().notifyFirst(eventContext);
          ModelElement _element_1 = ((InternalRootStateDeclaration)o).getElement();
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

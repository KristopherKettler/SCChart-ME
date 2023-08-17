package info.scce.cinco.product.scchart.adapter;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.core.event.hub.EventHub;
import de.jabc.cinco.meta.core.event.hub.impl.PayloadContext;
import de.jabc.cinco.meta.plugin.event.api.payload.PostAttributeChangePayload;
import de.jabc.cinco.meta.runtime.contentadapter.CincoEContentAdapter;
import graphmodel.GraphModel;
import graphmodel.internal.InternalGraphModel;
import info.scce.cinco.product.scchart.scchart.SCChart;
import info.scce.cinco.product.scchart.scchart.internal.InternalPackage;
import info.scce.cinco.product.scchart.scchart.internal.InternalSCChart;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

@SuppressWarnings("all")
public class SCChartEContentAdapter extends EContentAdapter implements CincoEContentAdapter {
  @Override
  public void notifyChanged(final Notification notification) {
    super.notifyChanged(notification);
    final Object o = notification.getNotifier();
    final Object feature = notification.getFeature();
    if ((o instanceof InternalSCChart)) {
      if ((Objects.equal(((InternalSCChart)o).eContainer(), null) && (!(o instanceof InternalGraphModel)))) {
        return;
      }
      boolean _matched = false;
      if (feature instanceof EStructuralFeature) {
        boolean _isRelevant = this.isRelevant(((EStructuralFeature)feature));
        if (_isRelevant) {
          _matched=true;
          GraphModel _element = ((InternalSCChart)o).getElement();
          String _name = ((EStructuralFeature)feature).getName();
          Object _oldValue = notification.getOldValue();
          final PostAttributeChangePayload<SCChart> eventPayload = new PostAttributeChangePayload<SCChart>(((SCChart) _element), _name, _oldValue);
          final PayloadContext<PostAttributeChangePayload<SCChart>, Void> eventContext = new PayloadContext<PostAttributeChangePayload<SCChart>, Void>("event.post.attributeChange.info_scce_cinco_product_scchart_scchart_SCChart", eventPayload);
          EventHub.getInstance().notifyFirst(eventContext);
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

package info.scce.cinco.product.scchart.mglid.editor.graphiti;

import info.scce.cinco.product.scchart.mglid.editor.graphiti.SCChartApiResouce;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class SCChartAPIParser implements Resource.Factory {
  public SCChartAPIParser() {
  }
  
  @Override
  public Resource createResource(final URI uri) {
    return new SCChartApiResouce(uri);
  }
}

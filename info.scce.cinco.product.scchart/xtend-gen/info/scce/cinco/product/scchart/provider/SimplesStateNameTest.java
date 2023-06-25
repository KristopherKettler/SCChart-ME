package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import info.scce.cinco.product.scchart.mglid.scchart.SimpleState;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class SimplesStateNameTest extends CincoValuesProvider<SimpleState, String> {
  @Override
  public Map<String, String> getPossibleValues(final SimpleState arg0) {
    LinkedHashMap<String, String> map = CollectionLiterals.<String, String>newLinkedHashMap();
    for (int i = 1; (i <= arg0.getOutgoing().size()); i++) {
      map.put(Integer.valueOf(i).toString(), Integer.valueOf(i).toString());
    }
    return map;
  }
}

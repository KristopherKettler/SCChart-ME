package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class GeneratorOutputProvider extends CincoValuesProvider<RootState, String> {
  @Override
  public Map<String, String> getPossibleValues(final RootState type) {
    final String[] arr = { "Identity Diagram", "Netlist-based Compilation (C)", "Netlist-based Compilation (Java)", "Netlist-based Deployment (NXJ)", "Priority-based Compilation (C)", "Priority-based Compilation (Java)", "State-based Compilation (C) lean-mode (Template)" };
    LinkedHashMap<String, String> map = CollectionLiterals.<String, String>newLinkedHashMap();
    for (final String string : arr) {
      map.put(string, string);
    }
    return map;
  }
}

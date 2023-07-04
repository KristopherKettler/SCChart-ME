package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class SuspendTypeProvider extends CincoValuesProvider<Suspend, String> {
  @Override
  public Map<String, String> getPossibleValues(final Suspend type) {
    final String[] arr = { " ", "suspend", "immediate suspend", "weak suspend", "immediate weak suspend" };
    LinkedHashMap<String, String> map = CollectionLiterals.<String, String>newLinkedHashMap();
    for (final String string : arr) {
      map.put(string, string);
    }
    return map;
  }
}

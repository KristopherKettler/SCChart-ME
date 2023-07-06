package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class ActionTypeProvider extends CincoValuesProvider<Action, String> {
  @Override
  public Map<String, String> getPossibleValues(final Action type) {
    final String[] arr = { "<set action>", "entry", "during", "immediate during", "exit" };
    LinkedHashMap<String, String> map = CollectionLiterals.<String, String>newLinkedHashMap();
    for (final String string : arr) {
      map.put(string, string);
    }
    return map;
  }
}

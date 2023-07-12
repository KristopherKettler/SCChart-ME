package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class DeclarationTypeProvider extends CincoValuesProvider<Declaration, String> {
  @Override
  public Map<String, String> getPossibleValues(final Declaration type) {
    final String[] arr = { " ", "bool", "int", "float", "string" };
    LinkedHashMap<String, String> map = CollectionLiterals.<String, String>newLinkedHashMap();
    for (final String string : arr) {
      map.put(string, string);
    }
    return map;
  }
}

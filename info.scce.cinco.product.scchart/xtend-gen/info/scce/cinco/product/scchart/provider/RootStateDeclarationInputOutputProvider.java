package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class RootStateDeclarationInputOutputProvider extends CincoValuesProvider<RootStateDeclaration, String> {
  @Override
  public Map<String, String> getPossibleValues(final RootStateDeclaration inputOutput) {
    final String[] arr = { " ", "signal", "constant", "input", "output", "input output" };
    LinkedHashMap<String, String> map = CollectionLiterals.<String, String>newLinkedHashMap();
    for (final String string : arr) {
      map.put(string, string);
    }
    return map;
  }
}

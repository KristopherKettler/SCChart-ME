package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import java.util.Collections;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class RootStateDeclarationInputOutputProvider extends CincoValuesProvider<RootStateDeclaration, String> {
  @Override
  public Map<String, String> getPossibleValues(final RootStateDeclaration inputOutput) {
    Pair<String, String> _mappedTo = Pair.<String, String>of("", "");
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("Input", "Input");
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("Output", "Output");
    Pair<String, String> _mappedTo_3 = Pair.<String, String>of("InputOutput", "InputOutput");
    return Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3));
  }
}

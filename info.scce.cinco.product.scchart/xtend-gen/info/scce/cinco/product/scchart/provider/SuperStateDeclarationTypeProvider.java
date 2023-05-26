package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;
import java.util.Collections;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class SuperStateDeclarationTypeProvider extends CincoValuesProvider<SuperStateDeclaration, String> {
  @Override
  public Map<String, String> getPossibleValues(final SuperStateDeclaration type) {
    Pair<String, String> _mappedTo = Pair.<String, String>of("String", "String");
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("bool", "bool");
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("int", "int");
    Pair<String, String> _mappedTo_3 = Pair.<String, String>of("float", "float");
    return Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3));
  }
}

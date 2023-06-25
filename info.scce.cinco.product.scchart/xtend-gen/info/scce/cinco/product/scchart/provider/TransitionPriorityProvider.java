package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import graphmodel.Edge;
import info.scce.cinco.product.scchart.mglid.scchart.Transition;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class TransitionPriorityProvider extends CincoValuesProvider<Transition, String> {
  @Override
  public Map<String, String> getPossibleValues(final Transition transition) {
    LinkedHashMap<String, String> map = CollectionLiterals.<String, String>newLinkedHashMap();
    for (int i = 0; (i <= transition.getSourceElement().<Edge>getOutgoing().size()); i++) {
      map.put(Integer.valueOf(i).toString(), Integer.valueOf(i).toString());
    }
    return map;
  }
}

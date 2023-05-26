package info.scce.cinco.product.scchart.provider;

import de.jabc.cinco.meta.runtime.provider.CincoValuesProvider;
import info.scce.cinco.product.scchart.mglid.scchart.ImmediateTransition;
import java.util.Collections;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class IntProvider extends CincoValuesProvider<ImmediateTransition, Integer> {
  @Override
  public Map<Integer, String> getPossibleValues(final ImmediateTransition modelElement) {
    Pair<Integer, String> _mappedTo = Pair.<Integer, String>of(Integer.valueOf((-1)), "Unknown");
    Pair<Integer, String> _mappedTo_1 = Pair.<Integer, String>of(Integer.valueOf(18), "18");
    Pair<Integer, String> _mappedTo_2 = Pair.<Integer, String>of(Integer.valueOf(19), "19");
    Pair<Integer, String> _mappedTo_3 = Pair.<Integer, String>of(Integer.valueOf(20), "20");
    Pair<Integer, String> _mappedTo_4 = Pair.<Integer, String>of(Integer.valueOf(21), "21");
    Pair<Integer, String> _mappedTo_5 = Pair.<Integer, String>of(Integer.valueOf(22), "22");
    Pair<Integer, String> _mappedTo_6 = Pair.<Integer, String>of(Integer.valueOf(23), "23");
    Pair<Integer, String> _mappedTo_7 = Pair.<Integer, String>of(Integer.valueOf(24), "24");
    Pair<Integer, String> _mappedTo_8 = Pair.<Integer, String>of(Integer.valueOf(25), "25");
    return Collections.<Integer, String>unmodifiableMap(CollectionLiterals.<Integer, String>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3, _mappedTo_4, _mappedTo_5, _mappedTo_6, _mappedTo_7, _mappedTo_8));
  }
}

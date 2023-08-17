package info.scce.cinco.product.scchart.extensions;

import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class HelperMethods {
  /**
   * returns distance between top of superState and first region
   */
  public static Integer getDeclarationsDistance(final SuperState superState) {
    int declarationCount = 0;
    EList<Declaration> _declarations = superState.getDeclarations();
    boolean _tripleNotEquals = (_declarations != null);
    if (_tripleNotEquals) {
      int _declarationCount = declarationCount;
      int _size = superState.getDeclarations().size();
      declarationCount = (_declarationCount + _size);
    }
    EList<Suspend> _suspends = superState.getSuspends();
    boolean _tripleNotEquals_1 = (_suspends != null);
    if (_tripleNotEquals_1) {
      int _declarationCount_1 = declarationCount;
      int _size_1 = superState.getSuspends().size();
      declarationCount = (_declarationCount_1 + _size_1);
    }
    EList<Action> _actions = superState.getActions();
    boolean _tripleNotEquals_2 = (_actions != null);
    if (_tripleNotEquals_2) {
      int _declarationCount_2 = declarationCount;
      int _size_2 = superState.getActions().size();
      declarationCount = (_declarationCount_2 + _size_2);
    }
    return Integer.valueOf((33 + (13 * declarationCount)));
  }
}

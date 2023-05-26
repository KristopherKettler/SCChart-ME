package info.scce.cinco.product.scchart.hooks;

import de.jabc.cinco.meta.runtime.hook.CincoPostSelectHook;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperState;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperStateDeclarationNode;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperStateRegion;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class PostSelectSCChart /* extends /* CincoPostSelectHook<InitSCChart> */  */{
  @Override
  public void postSelect(final /* InitSCChart */Object initSCChart) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field delete is undefined for the type Object"
      + "\nThe method or field inputOutput is undefined for the type Object"
      + "\nThe method or field declarationType is undefined for the type Object"
      + "\nThe method or field name is undefined for the type Object"
      + "\nThe method or field getSubSuperStates is undefined for the type Object"
      + "\nType mismatch: cannot convert from int to Iterable<?>"
      + "\nType mismatch: cannot convert from Iterable<Object> to byte"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nsuperStateDeclarationNodes cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ngetDeclaration cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nnewSuperStateDeclarationNode cannot be resolved"
      + "\nwidth cannot be resolved"
      + "\n- cannot be resolved"
      + "\nsuperStateDeclarationNodes cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nsetInputOutput cannot be resolved"
      + "\nsuperStateDeclarationNodes cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nsetDeclarationType cannot be resolved"
      + "\nsuperStateDeclarationNodes cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nsetName cannot be resolved"
      + "\ngetSuperStates cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  public void setDeclaration(final SubSuperState subsuperstate) {
    final Consumer<SubSuperStateDeclarationNode> _function = (SubSuperStateDeclarationNode it) -> {
      it.delete();
    };
    subsuperstate.getSubSuperStateDeclarationNodes().forEach(_function);
    final Procedure2<SubSuperStateDeclaration, Integer> _function_1 = (SubSuperStateDeclaration declaration, Integer i) -> {
      int _width = subsuperstate.getWidth();
      int _minus = (_width - 20);
      subsuperstate.newSubSuperStateDeclarationNode(10, (10 + (10 * ((i).intValue() + 1))), _minus, 10);
      IterableExtensions.<SubSuperStateDeclarationNode>last(subsuperstate.getSubSuperStateDeclarationNodes()).setDeclarationType(declaration.getDeclarationType());
      IterableExtensions.<SubSuperStateDeclarationNode>last(subsuperstate.getSubSuperStateDeclarationNodes()).setName(declaration.getName());
    };
    IterableExtensions.<SubSuperStateDeclaration>forEach(subsuperstate.getDeclaration(), _function_1);
    final Consumer<SubSuperStateRegion> _function_2 = (SubSuperStateRegion it) -> {
      EList<SubSuperState> _subSuperStates = it.getSubSuperStates();
      boolean _tripleNotEquals = (_subSuperStates != null);
      if (_tripleNotEquals) {
        final Consumer<SubSuperState> _function_3 = (SubSuperState superState) -> {
          this.setDeclaration(superState);
        };
        it.getSubSuperStates().forEach(_function_3);
      }
    };
    subsuperstate.getSubSuperStateRegions().forEach(_function_2);
  }
}

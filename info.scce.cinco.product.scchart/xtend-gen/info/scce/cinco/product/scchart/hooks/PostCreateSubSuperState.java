package info.scce.cinco.product.scchart.hooks;

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook;
import info.scce.cinco.product.scchart.mglid.scchart.SubSuperState;

@SuppressWarnings("all")
public class PostCreateSubSuperState extends CincoPostCreateHook<SubSuperState> {
  @Override
  public void postCreate(final SubSuperState subSuperState) {
    subSuperState.newSubSuperStateRegion(10, 30, 120, 60);
  }
}

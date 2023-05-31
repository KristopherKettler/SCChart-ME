package info.scce.cinco.product.scchart.mglid.scchart.event;

import de.jabc.cinco.meta.runtime.IStartup;
import info.scce.cinco.product.scchart.mglid.scchart.event.InitilalSubSuperStateEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.RootStateEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.SCChartEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.SubSuperStateEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateRegionEvent;

@SuppressWarnings("all")
public class EventStartup implements IStartup {
  @Override
  public void startup() {
    EventStartup.subscribe();
  }
  
  public static void subscribe() {
    RootStateEvent.getInstance().subscribe();
    SuperStateRegionEvent.getInstance().subscribe();
    SubSuperStateEvent.getInstance().subscribe();
    InitilalSubSuperStateEvent.getInstance().subscribe();
    SCChartEvent.getInstance().subscribe();
  }
  
  public static void unsubscribe() {
    RootStateEvent.getInstance().unsubscribe();
    SuperStateRegionEvent.getInstance().unsubscribe();
    SubSuperStateEvent.getInstance().unsubscribe();
    InitilalSubSuperStateEvent.getInstance().unsubscribe();
    SCChartEvent.getInstance().unsubscribe();
  }
}

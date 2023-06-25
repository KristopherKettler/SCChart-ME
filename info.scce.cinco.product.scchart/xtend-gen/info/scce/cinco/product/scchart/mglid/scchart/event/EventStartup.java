package info.scce.cinco.product.scchart.mglid.scchart.event;

import de.jabc.cinco.meta.runtime.IStartup;
import info.scce.cinco.product.scchart.mglid.scchart.event.DataFlowRegionEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.InitilalSuperStateEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.RegionEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.RootStateEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.SCChartEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateEvent;

@SuppressWarnings("all")
public class EventStartup implements IStartup {
  @Override
  public void startup() {
    EventStartup.subscribe();
  }
  
  public static void subscribe() {
    RootStateEvent.getInstance().subscribe();
    RegionEvent.getInstance().subscribe();
    DataFlowRegionEvent.getInstance().subscribe();
    SuperStateEvent.getInstance().subscribe();
    InitilalSuperStateEvent.getInstance().subscribe();
    SCChartEvent.getInstance().subscribe();
  }
  
  public static void unsubscribe() {
    RootStateEvent.getInstance().unsubscribe();
    RegionEvent.getInstance().unsubscribe();
    DataFlowRegionEvent.getInstance().unsubscribe();
    SuperStateEvent.getInstance().unsubscribe();
    InitilalSuperStateEvent.getInstance().unsubscribe();
    SCChartEvent.getInstance().unsubscribe();
  }
}

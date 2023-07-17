package info.scce.cinco.product.scchart.mglid.scchart.event;

import de.jabc.cinco.meta.runtime.IStartup;
import info.scce.cinco.product.scchart.mglid.scchart.event.ActionEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.DataFlowRegionEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.DeclarationEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.FinalSCChartRefereceEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.FinalSuperStateEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.InitialSCChartRefereceEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.InitilalSuperStateEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.RegionEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.RootStateEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.SCChartEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.SCChartRefereceEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.SuperStateEvent;
import info.scce.cinco.product.scchart.mglid.scchart.event.SuspendEvent;

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
    FinalSuperStateEvent.getInstance().subscribe();
    DeclarationEvent.getInstance().subscribe();
    SuspendEvent.getInstance().subscribe();
    ActionEvent.getInstance().subscribe();
    SCChartRefereceEvent.getInstance().subscribe();
    InitialSCChartRefereceEvent.getInstance().subscribe();
    FinalSCChartRefereceEvent.getInstance().subscribe();
    SCChartEvent.getInstance().subscribe();
  }
  
  public static void unsubscribe() {
    RootStateEvent.getInstance().unsubscribe();
    RegionEvent.getInstance().unsubscribe();
    DataFlowRegionEvent.getInstance().unsubscribe();
    SuperStateEvent.getInstance().unsubscribe();
    InitilalSuperStateEvent.getInstance().unsubscribe();
    FinalSuperStateEvent.getInstance().unsubscribe();
    DeclarationEvent.getInstance().unsubscribe();
    SuspendEvent.getInstance().unsubscribe();
    ActionEvent.getInstance().unsubscribe();
    SCChartRefereceEvent.getInstance().unsubscribe();
    InitialSCChartRefereceEvent.getInstance().unsubscribe();
    FinalSCChartRefereceEvent.getInstance().unsubscribe();
    SCChartEvent.getInstance().unsubscribe();
  }
}

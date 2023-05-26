package info.scce.cinco.product.scchart.mglid.scchart.event;

import de.jabc.cinco.meta.runtime.IStartup;
import info.scce.cinco.product.scchart.mglid.scchart.event.SCChartEvent;

@SuppressWarnings("all")
public class EventStartup implements IStartup {
  @Override
  public void startup() {
    EventStartup.subscribe();
  }
  
  public static void subscribe() {
    SCChartEvent.getInstance().subscribe();
  }
  
  public static void unsubscribe() {
    SCChartEvent.getInstance().unsubscribe();
  }
}

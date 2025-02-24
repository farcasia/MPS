package jetbrains.mps.ide.httpsupport.tests.plugin;

/*Generated by MPS */

import java.util.concurrent.atomic.AtomicInteger;

public class PingStorage {

  private static final AtomicInteger PINGS = new AtomicInteger(0);

  public static void reset() {
    PINGS.set(0);
  }

  public static void ping() {
    PINGS.incrementAndGet();
  }

  public static int pingCount() {
    return PINGS.get();
  }
}

public class Counter {

  long count = 0;

  // We make this method synchronized so it runs on only 1 allocated instance
  public synchronized void inc() {
      count++;
  }

  public long getCount() {
      return count;
  }
}
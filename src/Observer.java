/**
 * Observer.java
 * @author Katherine Beegle, Stephen Schroeder
 * @date Dec. 1, 2009
 * Observable is an interface for observer objects. Observer examines Observable
 * objects and makes appropriate changes when it is notified.
 */
public interface Observer {
    /**
     * Updates the observer.
     * @param s status
     * @param d die
     */
    public void update(String s, boolean d);
}

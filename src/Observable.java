/**
 * Observable.java
 * @author Katherine Beegle, Stephen Schroeder
 * @date Dec. 1, 2009
 * Observable is an interface for observable objects. Observable manages an
 * ArrayList of Observer objects, which it can notify when changes occur.
 */
public interface Observable {
    /**
     * Notifies the observers.
     */
    public void notifyObservers();
    /**
     * Registers an observer.
     * @param o observer
     */
    public void registerObserver(Observer o);
    /**
     * Removes an observer.
     * @param o observer
     */
    public void removeObserver(Observer o);
}

/**
 * Person.java
 * @author Katherine Beegle, Stephen Schroeder
 * @date Dec. 1, 2009
 * Person has a name, status, and variable to determine if it is to be deleted.
 */
public abstract class Person implements Component{
    /** Name of object */
    String name = "";
    /** Status of object */
    String status = "";
    /** Determines if object is to be deleted. */
    boolean die = false;

    /**
     * Creates a Person object with a name.
     * @param s name
     */
    public void Person(String s){
        name = s;
    }

    /**
     * Returns the name of the object.
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the status of the object.
     * @return status
     */
    public String getStatus(){
        return status;
    }

    /**
     * Returns whether the object is to be deleted.
     * @return die
     */
    public boolean getDie(){
        return die;
    }

    /**
     * Sets the status of the object.
     * @param s new status
     */
    public void setStatus(String s){
        status = s;
    }

    /**
     * Sets whether the object is to be deleted.
     * @param b new die
     */
    public void setDie(boolean b){
        die = b;
    }

    /**
     * Adds a Component to the friends list.
     * @param in Component to add.
     * @return returns if Component added.
     */
    public boolean add(Component in) {
        return false;
    }

    /**
     * Removes a Component from the friends list.
     * @param in Component to remove.
     * @return returns if Component removed.
     */
    public boolean remove(Component in) {
        return false;
    }

    /**
     * Finds and returns a Component from the friends list at index.
     * @param index index of friend
     * @return Component friend, null if not found
     */
    public Component getChild(int index) {
        return null;
    }

    /**
     * Finds and returns Component from the friends list with name.
     * @param name name of friend
     * @return Component friend, null if not found
     */
    public Component getChild(String name) {
        return null;
    }

}

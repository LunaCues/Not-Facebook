/**
 * Friend.java
 * @author Katherine Beegle, Stephen Schroeder
 * @date Dec. 1, 2009
 * Friends has a name, status, and a variable to determine if it is to be
 * deleted.  Friend observers the profile with the same name.
 */
public class Friend extends Person implements Observer{

    /**
     * Creates a Friend object.
     * @param s name
     */
    public Friend(String s){
        Person(s);
    }
    
    /**
     *
     * @param s
     * @param d
     */
    public void update(String s, boolean d) {
        status = s;
        die = d;
    }

}

import java.util.ArrayList;
import java.io.*;

/**
 * Profile.java
 * @author Katherine Beegle, Stephen Schroeder
 * @date Dec. 1, 2009
 * Profile has a name, status, picture, lists of friends and observers, and a
 * variable to determine if it is to be deleted.
 */
public class Profile extends Person implements Observable{
    /** File of picture */
    String picture;
    /** List of friends */
    ArrayList<Component> friends;
    /** List of observers */
    ArrayList<Observer> observers;

    /**
     * Creates a Profile object with name.
     * @param s name
     */
    public Profile(String s){
        Person(s);
        picture = "noPic.jpg";
        friends = new ArrayList<Component>();
        observers = new ArrayList<Observer>();
    }

    /**
     * Sets the status of the object and notifies observers of change.
     * @param s new status
     */
    public void setStatus(String s){
        status = s;
        this.notifyObservers();
    }

    /**
     * Sets the file of picture.
     * @param fileName file of picture
     * @return if file was changed
     */
    public boolean setPicture(String fileName){
        File file = new File(fileName);
        if(file.isFile()){
            picture = fileName;
            return true;
        }
        return false;
    }

    /**
     * Returns the file of picture.
     * @return file of picture
     */
    public String getPicture(){
        return picture;
    }

    /**
     * Adds Component to the friends list.
     * @param in friend
     * @return returns if Component added
     */
    public boolean add(Component in) {
        Person p = (Person) in;
        boolean needToAdd = true;
        for(int i=0; i < friends.size(); i++){
            Person f = (Person) friends.get(i);
            if(p.getName().equals(f.getName()))
                needToAdd = false;
        }
        if(needToAdd)
            friends.add(in);

        return needToAdd;
    }

    /**
     * Removes Component from the friends list.
     * @param in friend
     * @return returns if Component deleted
     */
    public boolean remove(Component in) {
        return friends.remove(in);
    }

    /**
     * Finds and returns a Component from the friends list at index.
     * @param index index of friend
     * @return Component friend, null if not found
     */
    public Component getChild(int index) {
        if(friends.size()-1 < index)
            return null;
        return friends.get(index);
    }

    /**
     * Finds and returns a Component from the friends list with name.
     * @param name name of friend
     * @return Component friend, null if not found
     */
    public Component getChild(String name) {

        for(int i=0; i<friends.size(); i++){
            Person f = (Person) friends.get(i);
            String n = f.getName();
            if(n.equals(name)){
                return f;
            }
        }
        return null;

    }

    /**
     * Returns a string of all friends with a status.
     * @return String of friends
     */
    public String getFriendString(){
        String s = "";
        for(int i = 0; i < friends.size(); i++){
            Person friend = (Person) friends.get(i);
            s += friend.getName() + ": " + friend.getStatus();
            s += "\n";
        }
        return s;
    }

    /**
     * Notifies the observers of a change.
     */
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            observers.get(i).update(status, die);
        }
    }

    /**
     * Adds Observer to the observers list.
     * @param o observer
     */
    public void registerObserver(Observer o) {
        observers.add(o);
        this.notifyObservers();
    }

    /**
     * Removes Observer from the observers list.
     * @param o observer
     */
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
   
    /**
     * Deletes all children that are set to be deleted.
     */
    public void killDeadChildren(){
        for(int i=0; i<friends.size(); i++){
            Person p = (Person) friends.get(i);
            if(p.getDie()){
                friends.remove(i);
            }
        }
    }

    /**
     * Removes all Components from friends lists.
     */
    public void killAllChildren(){
        for(int i=0; i<friends.size(); i++){
            friends.remove(0);
        }
    }

}

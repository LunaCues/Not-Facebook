/**
 * Component.java
 * @author Katherine Beegle, Stephen Schroeder
 * @date Dec. 1, 2009
 * Component manages and allows navigation of trees of Components.
 */
public interface Component {
    public boolean add(Component in);
    public boolean remove(Component in);
    public Component getChild(int index);
    public Component getChild(String name);
}

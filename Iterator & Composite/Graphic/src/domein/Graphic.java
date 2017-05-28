
package domein;

/**
 *
 * @author sebastiaan
 */
public abstract class Graphic {
    public abstract void draw();
    
    public void add(Graphic graphic) {
        throw new UnsupportedOperationException();
    }
    
    public void remove(Graphic graphic) {
        throw new UnsupportedOperationException();
    }
}

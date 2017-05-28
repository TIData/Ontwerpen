package domein;

import java.util.ArrayList;
import java.util.List;

public class Diagram extends Graphic {
    
    private List<Graphic> graphics = new ArrayList<>();

    @Override
    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }
    
    
    
    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//TODO
}

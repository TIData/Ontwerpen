package shapebuilder;

import domein.Rectangle;
import java.awt.Color;

public class ShapeBuilder {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle.Builder().height(250).width(300).opacity(0.5).color(Color.PINK).build();
        System.out.println(rectangle);
    }
}

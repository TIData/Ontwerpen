package domein;

public class DrawingDocument implements Document {

    @Override
    public void open() {
        System.out.println("Drawing document is open");
    }

    @Override
    public void close() {
        System.out.println("Drawing document is closed");
    }
}

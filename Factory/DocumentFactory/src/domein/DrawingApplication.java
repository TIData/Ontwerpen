package domein;

public class DrawingApplication extends Application {

    @Override
    protected Document createDocument() {
        return new DrawingDocument();
    }
}

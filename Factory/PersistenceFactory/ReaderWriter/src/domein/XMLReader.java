package domein;

public class XMLReader implements Reader {

    @Override
    public void readDrawing(String filePath) {
        System.out.println("Read XML drawing from "+ filePath);
    }
}

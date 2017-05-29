package domein;

public class XMLWriter implements Writer {

    @Override
    public void writeDrawing(String filePath, Drawing drawing) {
        System.out.println("Write XML drawing to path " + filePath);
    }
}

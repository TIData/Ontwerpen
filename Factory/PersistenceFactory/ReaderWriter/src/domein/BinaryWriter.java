package domein;

public class BinaryWriter implements Writer {

    @Override
    public void writeDrawing(String filePath, Drawing drawing) {
        System.out.println("Write Binary drawing to path " + filePath);
    }
}

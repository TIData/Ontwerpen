package domein;

public class BinaryReader implements Reader {

    @Override
    public void readDrawing(String filePath) {
        System.out.println("Read drawing from " + filePath);
    }
}

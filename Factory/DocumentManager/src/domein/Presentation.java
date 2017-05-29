package domein;

public class Presentation extends Document {

    public Presentation(String filePath) {
        super(filePath);
    }

    @Override
    public void loadFromFile(String filePath) {
        System.out.println("Load presentation from " + filePath);
    }

    @Override
    public void preview() {
        System.out.println("Preview presentation");
    }

    @Override
    public void print() {
        System.out.println("Print presentation");
    }

}

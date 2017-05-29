package domein;

public class Spreadsheet extends Document {

    public Spreadsheet(String filePath) {
        super(filePath);
    }

    @Override
    public void loadFromFile(String filePath) {
        System.out.println("Load spreadsheet from " + filePath);
    }

    @Override
    public void preview() {
        System.out.println("Preview spreadsheet");
    }

    @Override
    public void print() {
        System.out.println("Print spreadsheet");
    }

}

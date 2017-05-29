package domein;

public class SpreadsheetDocumentManager extends DocumentManager {

    @Override
    public void print(String filePath) {
        Spreadsheet spreadsheet = new Spreadsheet(filePath);
        spreadsheet.print();
    }

    @Override
    public void preview(String filePath) {
        Spreadsheet spreadsheet = new Spreadsheet(filePath);
        spreadsheet.preview();
    }
}

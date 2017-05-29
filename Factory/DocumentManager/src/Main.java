
import domein.DocumentManager;
import domein.PresentationDocumentManager;

public class Main {

    public static void main(String[] args) {
        DocumentManager presentation = new PresentationDocumentManager();
        presentation.preview("presentation.ppt");
        presentation.print("presentation.ppt");

        DocumentManager spreadsheet = new PresentationDocumentManager();
        presentation.preview("document.xls");
        presentation.print("document.xls");
    }
}

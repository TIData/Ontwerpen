package domein;

public class PresentationDocumentManager extends DocumentManager {

    @Override
    public void print(String filePath) {
        Presentation presentation = new Presentation(filePath);
        presentation.print();
    }

    @Override
    public void preview(String filePath) {
        Presentation presentation = new Presentation(filePath);
        presentation.preview();
    }
}

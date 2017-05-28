package domein;

public class ConcatCommand implements Command {

    private Document document;
    private String tekst;

    public ConcatCommand(Document document, String tekst) {
        this.document = document;
        this.tekst = tekst;
    }

    @Override
    public void execute() {
        document.concat(tekst);
    }

    @Override
    public void undo() {
        document.removeAtEnd(tekst);
    }
}

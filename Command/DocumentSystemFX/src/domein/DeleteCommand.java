package domein;

public class DeleteCommand implements Command {

    private Document document;
    private String tekst;
    private int eersteVoorkomen;

    public DeleteCommand(Document document, String tekst) {
        this.document = document;
        this.tekst = tekst;
    }

    @Override
    public void execute() {
        eersteVoorkomen = document.getFirstIndexOf(tekst);
        document.erase(tekst);
    }

    @Override
    public void undo() {
        document.insert(tekst, eersteVoorkomen);
    }
}

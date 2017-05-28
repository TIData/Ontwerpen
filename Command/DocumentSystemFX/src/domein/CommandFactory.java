package domein;

public class CommandFactory {

    public static Command createCommand(String command, Document document, String tekst) {
        switch (command.toLowerCase()) {
            case "delete":
                return new DeleteCommand(document, tekst);
            case "concat":
                return new ConcatCommand(document, tekst);
            default:
                return new NoCommand();
        }
    }
}

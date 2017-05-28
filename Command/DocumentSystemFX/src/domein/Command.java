package domein;

public interface Command {

    public void execute();

    public void undo();
}

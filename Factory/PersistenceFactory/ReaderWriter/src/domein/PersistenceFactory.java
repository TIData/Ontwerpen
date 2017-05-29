package domein;

public abstract class PersistenceFactory {

    public abstract Writer createWriter();

    public abstract Reader createReader();
}

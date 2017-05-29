package domein;

public class BinaryPersistenceFactory extends PersistenceFactory {

    @Override
    public Writer createWriter() {
        return new BinaryWriter();
    }

    @Override
    public Reader createReader() {
        return new BinaryReader();
    }
}

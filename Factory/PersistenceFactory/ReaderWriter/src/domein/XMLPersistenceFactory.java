package domein;

public class XMLPersistenceFactory extends PersistenceFactory {

    @Override
    public Writer createWriter() {
        return new XMLWriter();
    }

    @Override
    public Reader createReader() {
        return new XMLReader();
    }
}

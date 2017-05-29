package domein;

public class Persistence {
    
    private final PersistenceFactory persistenceFactory;

    public Persistence(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }

    public Writer newWriter() {
        return persistenceFactory.createWriter();
    }

    public Reader newReader() {
        return persistenceFactory.createReader();
    }
}

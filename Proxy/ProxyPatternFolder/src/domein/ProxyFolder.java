package domein;

public class ProxyFolder implements IFolder {

    private IFolder folder;

    public ProxyFolder() {
        folder = new Folder();
    }

    @Override
    public String performOperations() {
        return folder.performOperations();
    }
}

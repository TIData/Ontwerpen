package domein;

public class DomeinController {

    private UserManager userManager;
    private IFolder folder;

    public DomeinController() {
        initUserManager();
        folder = new ProxyFolder();
    }

    public String performFolderOperation(String name, String passwd) {
        String mes = null;
        User user = userManager.getUser(name, passwd);
        if (user != null) {
            mes = folder.performOperations();
        } else {
            mes = "Invalid user/passwd";
        }
        return mes;
    }

    private void initUserManager() {
        userManager = new UserManager();
        userManager.addUser(new User("Jan", "JanPass"), true);
        userManager.addUser(new User("Piet", "PietPass"), true);
        userManager.addUser(new User("Joris", "JorisPass"), false);
        userManager.addUser(new User("Corneel", "CorneelPass"), false);
    }
}

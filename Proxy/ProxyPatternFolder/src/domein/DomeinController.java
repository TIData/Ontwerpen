package domein;

public class DomeinController {

    private UserManager userManager;
    private IFolder folder;

    public DomeinController() {
        initUserManager();
        folder = new ProxyFolder();
    }

    public String performFolderOperation(String name, String passwd) {
        User user = userManager.getUser(name, passwd);

        if (user != null && userManager.hasFolderAccess(user)) {
            return folder.performOperations();
        } else if (user != null) {
            return "No access to folder";
        }
        
        return "Invalid user/password";
    }

    private void initUserManager() {
        userManager = new UserManager();
        userManager.addUser(new User("Jan", "JanPass"), true);
        userManager.addUser(new User("Piet", "PietPass"), true);
        userManager.addUser(new User("Joris", "JorisPass"), false);
        userManager.addUser(new User("Corneel", "CorneelPass"), false);
    }
}

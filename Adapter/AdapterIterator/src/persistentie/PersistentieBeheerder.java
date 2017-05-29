package persistentie;

import domein.ApplicatieFout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.tree.DefaultMutableTreeNode;
import domein.EnumerationIteratorAdapter;
import domein.MenuActie;

public class PersistentieBeheerder {

    private static PersistentieBeheerder instance;

    private PersistentieBeheerder() {
    }

    public static PersistentieBeheerder getInstance() {
        if (instance == null) {
            instance = new PersistentieBeheerder();
        }
        return instance;
    }

    public DefaultMutableTreeNode geefMenus() {

        final String INNAAM = "menu.txt";
        Scanner input;

        MenuActie menuRootActie = new MenuActie("root", "root", 0, 0);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(menuRootActie);

        try {
            input = new Scanner(new FileInputStream(INNAAM));
            while (input.hasNext()) {
                int nummerOuder = input.nextInt();
                int nummerKind = input.nextInt();
                String methodeNaam = input.next();
                String menuItemNaam = input.nextLine();
                MenuActie menuActie = new MenuActie(methodeNaam, menuItemNaam, nummerOuder, nummerKind);
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(menuActie);
                voegToeAanOuder(root, node);
            }
            input.close();
        } catch (FileNotFoundException fe) {
            System.err.printf("Fout: kan <%s> niet openen.\n", INNAAM);
            System.exit(1);
        }

        return root;
    }

    @SuppressWarnings("unchecked")
    private void voegToeAanOuder(DefaultMutableTreeNode root,
            DefaultMutableTreeNode kind) {
        boolean gevonden = false;
        Enumeration<DefaultMutableTreeNode> enumeration = root.depthFirstEnumeration();
        Iterator<DefaultMutableTreeNode> iterator = new EnumerationIteratorAdapter<>(enumeration);

        int ouder = ((MenuActie) kind.getUserObject()).getOuder();
        while (iterator.hasNext() && !gevonden) {
            DefaultMutableTreeNode node = iterator.next();
            MenuActie menuActie = (MenuActie) node.getUserObject();

            if (menuActie.getMenuActieId() == ouder) {
                node.add(kind);
                gevonden = true;
            }
        }
        if (!gevonden) {
            new ApplicatieFout(String.format("node %d vindt ouder %d niet", ((MenuActie) kind.getUserObject()).getMenuActieId(), ouder));
        }
    }
}

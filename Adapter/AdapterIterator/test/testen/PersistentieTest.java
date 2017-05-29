package testen;

import domein.EnumerationIteratorAdapter;
import domein.MenuActie;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.Assert;
import org.junit.Test;

import persistentie.PersistentieBeheerder;

public class PersistentieTest {

    @Test
    public void lezenBestand() {
        DefaultMutableTreeNode root
                = PersistentieBeheerder.getInstance().geefMenus();
        Assert.assertNotNull(root);

        Enumeration<DefaultMutableTreeNode> enumeration
                = root.children();

        Iterator<DefaultMutableTreeNode> it
                = new EnumerationIteratorAdapter<DefaultMutableTreeNode>(enumeration);

        Assert.assertEquals(3, root.getChildCount());

        DefaultMutableTreeNode node = it.next();

        Assert.assertEquals("Bestand", ((MenuActie) node.getUserObject()).getOmschrijving().trim());
        Enumeration<DefaultMutableTreeNode> kinderen = node.children();

        Iterator<DefaultMutableTreeNode> itKinderen
                = new EnumerationIteratorAdapter<DefaultMutableTreeNode>(kinderen);

        Assert.assertEquals(3, node.getChildCount());
        DefaultMutableTreeNode nodeKind = itKinderen.next();
        Assert.assertEquals("Opslaan", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = itKinderen.next();
        Assert.assertEquals("Opslaan als", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = itKinderen.next();
        Assert.assertEquals("Afsluiten", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());

        node = it.next();
        Assert.assertEquals("Bewerken", ((MenuActie) node.getUserObject()).getOmschrijving().trim());

        kinderen = node.children();

        itKinderen
                = new EnumerationIteratorAdapter<DefaultMutableTreeNode>(kinderen);

        Assert.assertEquals(2, node.getChildCount());
        nodeKind = itKinderen.next();
        Assert.assertEquals("Ongedaan maken", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = itKinderen.next();
        Assert.assertEquals("Plakken", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        kinderen = nodeKind.children();

        itKinderen
                = new EnumerationIteratorAdapter<DefaultMutableTreeNode>(kinderen);

        Assert.assertEquals(2, nodeKind.getChildCount());
        nodeKind = itKinderen.next();
        Assert.assertEquals("Plakken normaal", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = itKinderen.next();
        Assert.assertEquals("Plakken speciaal", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());

        node = it.next();
        Assert.assertEquals("Help", ((MenuActie) node.getUserObject()).getOmschrijving().trim());
        kinderen = node.children();

        itKinderen = new EnumerationIteratorAdapter<DefaultMutableTreeNode>(kinderen);
        Assert.assertEquals(1, node.getChildCount());
        nodeKind = itKinderen.next();
        Assert.assertEquals("Info", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
    }
}

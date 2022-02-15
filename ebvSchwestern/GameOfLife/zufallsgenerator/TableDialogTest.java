package zufallsgenerator;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * 
 * In diesen Testf�llen wird gepr�ft ob die GUI korrekt initialisiert wurde und die entsprechenden Elemente korrekt
 * "angezeigt" werden. In Wirklichkeit wird gepr�ft, ob die entsprechenden Elemente dem contentPane der Applikation hinzugef�gt
 * worden sind. Ansonsten geben alle Methoden null zur�ck und die Tests schlagen fehl.
 * 
 */
public class TableDialogTest {

    private TableDialog tableDialog;

    
    @Test
    public void getTabXTest() {
        tableDialog = new TableDialog();
        final JTable actualVal = tableDialog.getTabX();
        assertNotNull(actualVal);
    }

    @Test
    public void getButXTest() {
        tableDialog = new TableDialog();
        JButton actualVal = tableDialog.getButX();
        assertNotNull(actualVal);
    }

    @Test
    public void getButEntfernenTest() {
        tableDialog = new TableDialog();
        JButton actualVal = tableDialog.getButEntfernen();
        assertNotNull(actualVal);
    }

    @Test
    public void getButBearbeitenTest() {
        tableDialog = new TableDialog();
        JButton actualVal = tableDialog.getButBearbeiten();
        assertNotNull(actualVal);
    }

    @Test
    public void getButbernehmenTest() {
        tableDialog = new TableDialog();
        JButton actualVal = tableDialog.getButbernehmen();
        assertNotNull(actualVal);
    }

    @Test
    public void getButAbbrechenTest() {
        tableDialog = new TableDialog();
        JButton actualVal = tableDialog.getButAbbrechen();
        assertNotNull(actualVal);
    }

    @Test
    public void zeigZeilenDialogTest() {
        tableDialog = new TableDialog();
        int[] actualVal = tableDialog.zeigZeilenDialog();
        assertEquals(3, actualVal.length);
    }
}
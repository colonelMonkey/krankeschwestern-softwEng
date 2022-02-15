package zufallsgenerator;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertNotNull;

public class LineDialogTest {

    private LineDialog lineDialog;

    @Test
    public void getLbVonTest() {
        lineDialog = new LineDialog();
        final JLabel actualValue = lineDialog.getLbVon();
        assertNotNull(actualValue);
    }

    @Test
    public void getLbBisTest() {
        lineDialog = new LineDialog();
        final JLabel actualValue = lineDialog.getLbBis();
        assertNotNull(actualValue);
    }

    @Test
    public void getLbGewichtTest() {
        lineDialog = new LineDialog();
        final JLabel actualValue = lineDialog.getLbGewicht();
        assertNotNull(actualValue);
    }

    @Test
    public void getTfVonTest() {
        lineDialog = new LineDialog();
        JTextField actualValue = lineDialog.getTfVon();
        assertNotNull(actualValue);
    }

    @Test
    public void getTfBisTest() {
        lineDialog = new LineDialog();
        JTextField actualValue = lineDialog.getTfBis();
        assertNotNull(actualValue);
    }

    @Test
    public void getTfGewichtTest() {
        lineDialog = new LineDialog();
        JTextField actualValue = lineDialog.getTfGewicht();
        assertNotNull(actualValue);
    }
}
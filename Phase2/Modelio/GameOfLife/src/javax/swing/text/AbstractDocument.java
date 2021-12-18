package javax.swing.text;

import java.io.Serializable;
import java.util.Enumeration;
import javax.swing.event.DocumentEvent.ElementChange;
import javax.swing.event.DocumentEvent;
import javax.swing.tree.TreeNode;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CompoundEdit;
import javax.swing.undo.UndoableEdit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2014-0000-000000000000")
public abstract class AbstractDocument implements Document, Serializable {
    @objid ("00d00398-0000-2015-0000-000000000000")
    public abstract class AbstractElement implements Element, MutableAttributeSet, Serializable, TreeNode {
    }

    @objid ("00d00398-0000-2016-0000-000000000000")
    public interface AttributeContext {
        @objid ("cf5e5dc4-ee45-4024-893e-f5855d55371c")
        AttributeSet addAttribute(AttributeSet p0, Object p1, Object p2);

        @objid ("2bfd0e07-f944-439f-a059-f1291a44ee0a")
        AttributeSet addAttributes(AttributeSet p0, AttributeSet p1);

        @objid ("f14a094c-21ab-4808-8e3b-a6a1d858e3f9")
        AttributeSet getEmptySet();

        @objid ("fad1add1-ebac-499f-ad41-0f15e9dddd42")
        void reclaim(AttributeSet p0);

        @objid ("69ba9c72-db26-491f-be1a-fbafa2b6b6e6")
        AttributeSet removeAttribute(AttributeSet p0, Object p1);

        @objid ("5a0cfa3d-5b8e-4038-81a7-14fc776ad95d")
        AttributeSet removeAttributes(AttributeSet p0, AttributeSet p1);

        @objid ("560e9fb1-1913-49d9-bbdb-05d9cecca7fe")
        AttributeSet removeAttributes(AttributeSet p0, Enumeration p1);

    }

    @objid ("00d00398-0000-2019-0000-000000000000")
    public class BranchElement extends AbstractElement {
    }

    @objid ("00d00398-0000-201a-0000-000000000000")
    public interface Content {
        @objid ("ca82341e-d230-45c4-a0f8-888ad6d9ff63")
        Position createPosition(int p0) throws BadLocationException;

        @objid ("1fb5ddca-bf7c-45df-87cd-b880d57108e7")
        void getChars(int p0, int p1, Segment p2) throws BadLocationException;

        @objid ("18d33b3c-c12c-407c-89d1-479d6c39df67")
        String getString(int p0, int p1) throws BadLocationException;

        @objid ("2435d5b4-767f-4e73-a923-d3bf34514de0")
        UndoableEdit insertString(int p0, String p1) throws BadLocationException;

        @objid ("2c6493f3-e213-4976-811f-079d1895ab22")
        int length();

        @objid ("5afd9d18-1dac-4e41-abbf-966ed0f1fc77")
        UndoableEdit remove(int p0, int p1) throws BadLocationException;

    }

    @objid ("00d00398-0000-201b-0000-000000000000")
    public class DefaultDocumentEvent extends CompoundEdit implements DocumentEvent {
    }

    @objid ("00d00398-0000-201d-0000-000000000000")
    public static class ElementEdit extends AbstractUndoableEdit implements ElementChange {
    }

    @objid ("00d00398-0000-201e-0000-000000000000")
    public class LeafElement extends AbstractElement {
    }

}

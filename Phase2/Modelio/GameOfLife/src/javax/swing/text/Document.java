package javax.swing.text;

import java.util.List;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2055-0000-000000000000")
public interface Document {
    @objid ("01becdf2-55d8-412e-8b4c-17d8f0d2f446")
    void addDocumentListener(DocumentListener p0);

    @objid ("60422709-6215-47b2-b3ad-db6b152a0cda")
    void addUndoableEditListener(UndoableEditListener p0);

    @objid ("3eda65a0-e2ef-40b8-92f5-804b57402e86")
    Position createPosition(int p0) throws BadLocationException;

    @objid ("2dbc3379-25d8-499d-84f5-8e1b113d36bc")
    Element getDefaultRootElement();

    @objid ("16bcdec1-fb71-4967-a26e-d34160e6cc92")
    Position getEndPosition();

    @objid ("ccfb5de5-7fd2-416f-b811-a509a282edbb")
    int getLength();

    @objid ("8a55bc0e-9741-4a20-b3e4-18bf698aa810")
    Object getProperty(Object p0);

    @objid ("496678da-1ffc-452f-ab9e-964d63059d79")
    List<Element> getRootElements();

    @objid ("077b8f9e-7fe3-46fd-bcad-a3d590e25493")
    Position getStartPosition();

    @objid ("3adfa5fb-3eea-419e-8125-9c95d2cf216e")
    String getText(int p0, int p1) throws BadLocationException;

    @objid ("b79943f3-814b-4c4c-95cc-784d5fa6cd4c")
    void getText(int p0, int p1, Segment p2) throws BadLocationException;

    @objid ("cf55c0db-043d-461b-930c-b27ba502bfcb")
    void insertString(int p0, String p1, AttributeSet p2) throws BadLocationException;

    @objid ("22760ee5-9d77-48b6-834f-8e683a11b468")
    void putProperty(Object p0, Object p1);

    @objid ("22916061-4dc3-4903-98d9-bbee44977a34")
    void remove(int p0, int p1) throws BadLocationException;

    @objid ("d0a9fb9d-3787-4f82-bbdb-016e1f6b8f4b")
    void removeDocumentListener(DocumentListener p0);

    @objid ("25addb38-88b7-4865-90db-5ae972a2ec26")
    void removeUndoableEditListener(UndoableEditListener p0);

    @objid ("48bc24eb-32cb-4a17-8dac-869243f40afe")
    void render(Runnable p0);

}

package javax.swing.undo;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-234d-0000-000000000000")
public interface UndoableEdit {
    @objid ("089a4818-f93b-4879-bbef-a6fc622184c3")
    boolean addEdit(UndoableEdit p0);

    @objid ("eda029d6-bf9f-4441-a18b-7911cf19dd0f")
    boolean canRedo();

    @objid ("3530a000-d264-4bf3-8a35-14c1025b9644")
    boolean canUndo();

    @objid ("1d16c482-1320-4228-a018-dbf83ea6201a")
    void die();

    @objid ("ff0d6df0-3d5c-407e-9646-bdf4eb4d9656")
    String getPresentationName();

    @objid ("c41ab292-3d5f-4e60-a356-7ddebecb2ab5")
    String getRedoPresentationName();

    @objid ("a6a55620-7f50-462f-923e-bf1590c763ab")
    String getUndoPresentationName();

    @objid ("f1a67651-b98f-40d5-9985-983b1f504685")
    boolean isSignificant();

    @objid ("a7a471f5-c3aa-4600-8c00-313e51ccc714")
    void redo() throws CannotRedoException;

    @objid ("ca05b85a-3f68-4eaa-9939-64c85c5f4531")
    boolean replaceEdit(UndoableEdit p0);

    @objid ("824b90f1-131d-47da-a73f-0868e01a7a36")
    void undo() throws CannotUndoException;

}

package javax.swing.tree;

import java.beans.PropertyChangeListener;
import java.util.List;
import javax.swing.event.TreeSelectionListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2326-0000-000000000000")
public interface TreeSelectionModel {
    @objid ("b761acc2-741d-47e9-90f3-a4969d07e0ab")
    void addPropertyChangeListener(PropertyChangeListener p0);

    @objid ("97efeb0f-5a19-428a-b52b-077676ad60c3")
    void addSelectionPath(TreePath p0);

    @objid ("5eb67281-7267-4f37-bacf-c0f6885377d4")
    void addSelectionPaths(List<TreePath> p0);

    @objid ("4044063d-5ae0-4edb-8dbd-0342825c1189")
    void addTreeSelectionListener(TreeSelectionListener p0);

    @objid ("e27c32ba-e119-4067-bc5a-0c94b68ec961")
    void clearSelection();

    @objid ("1a568537-3356-4b18-88d5-d33323045b5f")
    TreePath getLeadSelectionPath();

    @objid ("3ffec2da-7d04-4703-b849-887ef98c365f")
    int getLeadSelectionRow();

    @objid ("712981eb-3593-450f-902a-e8077f561c96")
    int getMaxSelectionRow();

    @objid ("441a423f-a0e0-4c1a-ad80-c3e65585896c")
    int getMinSelectionRow();

    @objid ("de3f948f-70da-4243-a709-2173947e3b5b")
    RowMapper getRowMapper();

    @objid ("c9d558fd-77b1-464c-9ab7-2e449675fb7d")
    int getSelectionCount();

    @objid ("b96dfe3b-e49c-434f-86be-79f080a9d6e2")
    int getSelectionMode();

    @objid ("b9a8cac2-cb26-4e9f-af81-4411000cdb74")
    TreePath getSelectionPath();

    @objid ("e22b3116-d8bb-4f05-a75d-f83fa94925ad")
    List<TreePath> getSelectionPaths();

    @objid ("895b6dc5-be59-417e-951d-dc8db81c5804")
    List<Integer> getSelectionRows();

    @objid ("5bf7bb53-1aa5-417e-ae8a-3d86d63962c3")
    boolean isPathSelected(TreePath p0);

    @objid ("41bc46a2-fd38-466b-a6e2-9809c638d5a3")
    boolean isRowSelected(int p0);

    @objid ("c5491c74-2532-499b-aee5-0cc58996018b")
    boolean isSelectionEmpty();

    @objid ("1b81388a-435b-4eb1-ac1b-f77782f4c304")
    void removePropertyChangeListener(PropertyChangeListener p0);

    @objid ("34db8393-37ca-4674-8d50-89d6e9eeb8a3")
    void removeSelectionPath(TreePath p0);

    @objid ("f6a1f95c-ca1f-4e42-9413-3cfbf639987e")
    void removeSelectionPaths(List<TreePath> p0);

    @objid ("82ebf347-505a-42a3-81ad-977de75db0f9")
    void removeTreeSelectionListener(TreeSelectionListener p0);

    @objid ("1331c11d-8f52-4b8a-bf65-89975ede0c08")
    void resetRowSelection();

    @objid ("25cd1c09-34ec-45ac-9c28-2d9ce15c5a1b")
    void setRowMapper(RowMapper p0);

    @objid ("5c253311-baee-419d-9f62-f0a8dbd16acf")
    void setSelectionMode(int p0);

    @objid ("844e4b09-4693-4677-a7ff-2fc7d9f2d7c8")
    void setSelectionPath(TreePath p0);

    @objid ("42a2a87c-1e7c-4825-a040-898d80da1f8b")
    void setSelectionPaths(List<TreePath> p0);

}

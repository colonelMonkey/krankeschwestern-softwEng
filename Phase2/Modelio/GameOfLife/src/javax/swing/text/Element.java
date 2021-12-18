package javax.swing.text;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-1fd6-0000-000000000000")
public interface Element {
    @objid ("65637a79-8141-4f2b-92db-06725938dcd4")
    AttributeSet getAttributes();

    @objid ("e4335f64-819c-4b5a-a4a5-0c67af26ee03")
    Document getDocument();

    @objid ("1c59d98f-c32a-42b7-8276-8bf7652a2f30")
    Element getElement(int p0);

    @objid ("0af39dec-271a-4520-a89a-0dd0e03b5899")
    int getElementCount();

    @objid ("7610c75f-5ad5-4ac8-9ef3-a5da049737e8")
    int getElementIndex(int p0);

    @objid ("67a870c7-3d0e-4033-a0e9-c68df796f9e6")
    int getEndOffset();

    @objid ("c2a66f54-f709-442f-9c38-554738d2f35b")
    String getName();

    @objid ("981e695b-64ea-490c-a54d-5ae2b009f09e")
    Element getParentElement();

    @objid ("5e83bfd9-b945-491f-8f40-f70c7cecf9a6")
    int getStartOffset();

    @objid ("6b2d5973-40bd-4a8f-a5c0-a95b2e796a5e")
    boolean isLeaf();

}

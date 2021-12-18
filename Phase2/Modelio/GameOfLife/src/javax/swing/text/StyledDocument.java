package javax.swing.text;

import java.awt.Color;
import java.awt.Font;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2062-0000-000000000000")
public interface StyledDocument extends Document {
    @objid ("962e5867-aefd-430f-aba2-2b5cba9d0a90")
    Style addStyle(String p0, Style p1);

    @objid ("11edfb06-5d45-44c5-b7f2-42ca3dd2aa51")
    Color getBackground(AttributeSet p0);

    @objid ("62fd7fe7-a6bb-47c4-b2c9-34dba9438a90")
    Element getCharacterElement(int p0);

    @objid ("43cbbd0e-5a03-4342-8fb6-1ca23075f70e")
    Font getFont(AttributeSet p0);

    @objid ("a505a0cb-a367-42de-bf2b-dbcc7740728c")
    Color getForeground(AttributeSet p0);

    @objid ("92deefc4-e0dd-48f7-b506-61d91fdefca9")
    Style getLogicalStyle(int p0);

    @objid ("0ce07964-1935-456d-a9e7-45c3e6324b28")
    Element getParagraphElement(int p0);

    @objid ("777a8c99-a20a-4af0-9901-0b134794df9f")
    Style getStyle(String p0);

    @objid ("e3440049-f990-4804-914d-77c1a175a874")
    void removeStyle(String p0);

    @objid ("c3827b1d-cdd5-49d5-bfa2-9bcc713a809a")
    void setCharacterAttributes(int p0, int p1, AttributeSet p2, boolean p3);

    @objid ("61a9b1e2-a6a5-410c-a058-ca2b492444d2")
    void setLogicalStyle(int p0, Style p1);

    @objid ("afecc1e8-2bd0-44c4-b0e7-c8cf3ca20b61")
    void setParagraphAttributes(int p0, int p1, AttributeSet p2, boolean p3);

}

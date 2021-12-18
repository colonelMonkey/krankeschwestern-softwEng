package javax.swing.text;

import java.util.Enumeration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-1fd7-0000-000000000000")
public interface AttributeSet {
    @objid ("819167f9-74f5-418d-b844-82bc5e7ebfba")
    boolean containsAttribute(Object p0, Object p1);

    @objid ("5521fb8a-0087-456b-934b-ee58e4e0c39f")
    boolean containsAttributes(AttributeSet p0);

    @objid ("27acefef-348a-4ebd-b4da-1fe1a1c08ce7")
    AttributeSet copyAttributes();

    @objid ("5da88e36-54e8-4d51-9d22-6fe9f149c5c1")
    Object getAttribute(Object p0);

    @objid ("62ae99e5-6c39-4b85-9176-d465febb3ef9")
    int getAttributeCount();

    @objid ("ac07c46f-595c-4425-963a-81cf3cde87bd")
    Enumeration getAttributeNames();

    @objid ("f3f61f4d-1258-430c-8f22-0b1a2210574d")
    AttributeSet getResolveParent();

    @objid ("f119bb63-1b6c-446b-abc0-63c46a1d12cd")
    boolean isDefined(Object p0);

    @objid ("1e78c4c3-e280-4b4d-a516-93a6b101ed5b")
    boolean isEqual(AttributeSet p0);

    @objid ("00d00398-0000-1fd8-0000-000000000000")
    interface CharacterAttribute {
    }

    @objid ("00d00398-0000-1fd9-0000-000000000000")
    interface ColorAttribute {
    }

    @objid ("00d00398-0000-1fda-0000-000000000000")
    interface FontAttribute {
    }

    @objid ("00d00398-0000-1fdb-0000-000000000000")
    interface ParagraphAttribute {
    }

}

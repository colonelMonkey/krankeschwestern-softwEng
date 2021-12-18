package javax.swing.text;

import java.util.Enumeration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-205b-0000-000000000000")
public interface MutableAttributeSet extends AttributeSet {
    @objid ("002291a7-09c4-48eb-8605-561ed9ec5a04")
    void addAttribute(Object p0, Object p1);

    @objid ("18521d38-5536-4c5c-95c3-84ee54c56061")
    void addAttributes(AttributeSet p0);

    @objid ("e60cd22e-99aa-4e45-9e5a-2fad319de533")
    void removeAttribute(Object p0);

    @objid ("9b4af891-ca8a-4d43-8800-23481b9de463")
    void removeAttributes(AttributeSet p0);

    @objid ("c9451d4e-cba6-4585-9475-23800a8596e6")
    void removeAttributes(Enumeration p0);

    @objid ("8921273f-a913-4928-b7e4-7da3cbf77d23")
    void setResolveParent(AttributeSet p0);

}

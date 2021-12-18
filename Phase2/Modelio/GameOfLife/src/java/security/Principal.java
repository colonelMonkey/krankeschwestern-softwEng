package java.security;

import javax.security.auth.Subject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-27e3-0000-000000000000")
public interface Principal {
    @objid ("36c98508-b058-4109-8649-351f0594576e")
    boolean equals(Object p0);

    @objid ("1ef6b1d4-5442-4657-9d84-daa22b754d03")
    String getName();

    @objid ("b7a70298-55f2-435e-9166-007849a9fe3e")
    int hashCode();

    @objid ("fec9b23e-2454-4584-9dec-7981fb513f13")
    boolean implies(Subject p0);

    @objid ("5b43aaf2-3cc3-4fa4-99d1-7fbd26148b40")
    String toString();

}

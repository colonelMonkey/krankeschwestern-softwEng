package java.beans;

import java.applet.Applet;
import java.beans.beancontext.BeanContext;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ab4-0000-000000000000")
public interface AppletInitializer {
    @objid ("32aa47d6-5026-4898-92c9-08e4e1dc3ffe")
    void activate(Applet p0);

    @objid ("f76cf4f5-cca3-49ab-9872-8ac657ce0543")
    void initialize(Applet p0, BeanContext p1);

}

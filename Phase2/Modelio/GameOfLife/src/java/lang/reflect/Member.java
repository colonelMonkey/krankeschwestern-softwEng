package java.lang.reflect;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2acc-0000-000000000000")
public interface Member {
    @objid ("b98344b5-b21d-4173-ba2e-11e3ef0fbc5f")
    Class getDeclaringClass();

    @objid ("fdc83bcf-6f10-4b50-9a80-1b4c9ed7cbfb")
    int getModifiers();

    @objid ("35cc6171-b87d-4ed2-bd43-d71658051aaa")
    String getName();

    @objid ("887264ae-5602-4706-a101-3fc10a2a6511")
    boolean isSynthetic();

}

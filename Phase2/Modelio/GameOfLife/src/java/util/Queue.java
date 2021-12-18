package java.util;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d15-0000-000000000000")
public interface Queue extends Collection {
    @objid ("1d415366-efb5-49c7-b52d-3c5cf056f3a7")
    boolean add(Object p0);

    @objid ("c746d2a7-f6ba-4807-b226-b8b6dc99c508")
    Object element();

    @objid ("adb6c6cd-fc91-46ea-ac70-04e0c6f9ecee")
    boolean offer(Object p0);

    @objid ("66d00ee8-b401-4d87-9be6-3963d378f597")
    Object peek();

    @objid ("243ca510-d066-4cc7-a836-6228e8fa5de8")
    Object poll();

    @objid ("d93bc06a-7ad7-43f3-860a-213a8e19e1c5")
    Object remove();

}

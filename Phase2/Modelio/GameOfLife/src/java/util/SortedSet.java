package java.util;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d06-0000-000000000000")
public interface SortedSet extends Set {
    @objid ("58ba1bcb-34c7-4376-a860-94918efd5518")
    Comparator comparator();

    @objid ("5fb8061f-28cc-42a2-a45b-a10e90de9642")
    Object first();

    @objid ("69895c08-458a-4d0a-b46d-dbae960addd3")
    SortedSet headSet(Object p0);

    @objid ("ffdca0f1-82f4-43d3-b3a8-b93c3e914f82")
    Object last();

    @objid ("436257a6-9d28-4577-aee2-8c38a0600134")
    Spliterator spliterator();

    @objid ("6de2dbc0-754b-413f-8082-eaaf977e735e")
    SortedSet subSet(Object p0, Object p1);

    @objid ("be0e4deb-d2f5-42d8-8b5d-2ca2e2801db9")
    SortedSet tailSet(Object p0);

}

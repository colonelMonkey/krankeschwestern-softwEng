package java.util;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1c18-0000-000000000000")
public interface NavigableSet extends SortedSet {
    @objid ("43ff89e3-b8d8-445f-a0e8-225786fb47b5")
    Object ceiling(Object p0);

    @objid ("31920dd7-f52b-4170-89eb-9a4e98cf29d1")
    Iterator descendingIterator();

    @objid ("2c9e16f5-83dc-4315-92ab-efffdb128ab9")
    NavigableSet descendingSet();

    @objid ("6cf045ee-8671-4915-9075-f652c41bb956")
    Object floor(Object p0);

    @objid ("ccb8cd0a-cf68-47cd-a455-d2e44a817f47")
    NavigableSet headSet(Object p0, boolean p1);

    @objid ("7fc07586-b985-4acb-aefa-669c28f8365c")
    SortedSet headSet(Object p0);

    @objid ("46641cb6-6978-4cff-b18f-880e639240ef")
    Object higher(Object p0);

    @objid ("9b4f551e-45f9-474e-a231-8bbdc85c82da")
    Iterator iterator();

    @objid ("db47430d-9499-4b0a-85f4-c52377a9eb50")
    Object lower(Object p0);

    @objid ("8aa78baf-f047-4fe2-a0f9-1fd8902973f4")
    Object pollFirst();

    @objid ("0ea0844f-b779-4ce1-9359-45312d179af9")
    Object pollLast();

    @objid ("0d58a895-6580-4be8-b5f5-9b1747f5db9e")
    SortedSet subSet(Object p0, Object p1);

    @objid ("88e8c7a0-7752-4beb-83b9-705167e5fedb")
    NavigableSet subSet(Object p0, boolean p1, Object p2, boolean p3);

    @objid ("c84c2f4b-1ee6-4d69-a2c8-e2b20bb05a8f")
    NavigableSet tailSet(Object p0, boolean p1);

    @objid ("54ca15f0-4153-45ca-9d1e-a92ce426fb33")
    SortedSet tailSet(Object p0);

}

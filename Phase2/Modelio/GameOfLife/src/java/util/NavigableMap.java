package java.util;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1be8-0000-000000000000")
public interface NavigableMap extends SortedMap {
    @objid ("d72785f7-2f47-4134-9f85-03deaf6dd178")
    Entry ceilingEntry(Object p0);

    @objid ("f158f1fd-5933-48f3-8821-b00bebe67a2e")
    Object ceilingKey(Object p0);

    @objid ("e50da3c3-af0c-4a08-a717-4271f302d3c9")
    NavigableSet descendingKeySet();

    @objid ("91792d62-031f-42de-8005-00c5b3c315a7")
    NavigableMap descendingMap();

    @objid ("8e64329d-5460-4cd2-9e2a-69ceb09f5b87")
    Entry firstEntry();

    @objid ("2c9431b2-a73f-4a78-9f1d-b9db8699abff")
    Entry floorEntry(Object p0);

    @objid ("cb05139b-6c50-4b31-91ff-4c521f62d20b")
    Object floorKey(Object p0);

    @objid ("53f2c81f-687d-451e-9546-720b81f1bd82")
    NavigableMap headMap(Object p0, boolean p1);

    @objid ("4c9e74cb-1a04-4c47-9795-e4a80c6676c1")
    SortedMap headMap(Object p0);

    @objid ("73ea25ae-00c5-4f6d-940d-410e30bb6396")
    Entry higherEntry(Object p0);

    @objid ("c39f8518-31c1-4a38-9695-d76a150c6607")
    Object higherKey(Object p0);

    @objid ("66dd946e-301f-4953-8acb-6c975379675f")
    Entry lastEntry();

    @objid ("8e254bc0-a392-49b4-be15-6f081bede7b8")
    Entry lowerEntry(Object p0);

    @objid ("1685dc86-3a84-49b6-ba72-e772c6ce0a5c")
    Object lowerKey(Object p0);

    @objid ("5c193732-95a0-4339-85d3-c8a03dacb59b")
    NavigableSet navigableKeySet();

    @objid ("921b0a83-00de-468d-aa70-d2317ee815eb")
    Entry pollFirstEntry();

    @objid ("e77ee971-1808-4d82-9543-64af17b782a5")
    Entry pollLastEntry();

    @objid ("146b4083-27f6-4a64-ac3a-f30d3022aa66")
    SortedMap subMap(Object p0, Object p1);

    @objid ("805c1a91-9904-4ddd-9fdd-8972522caa59")
    NavigableMap subMap(Object p0, boolean p1, Object p2, boolean p3);

    @objid ("cc4e4641-e380-4387-9178-bcfba6941410")
    NavigableMap tailMap(Object p0, boolean p1);

    @objid ("2096b5b3-5e6e-4eac-94ff-fe420721cd0a")
    SortedMap tailMap(Object p0);

}

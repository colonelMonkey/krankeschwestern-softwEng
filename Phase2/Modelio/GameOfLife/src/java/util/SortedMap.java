package java.util;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d3b-0000-000000000000")
public interface SortedMap extends Map {
    @objid ("04e74734-d93f-4ff9-a72b-fd51ea2c561b")
    Comparator comparator();

    @objid ("2165f143-c967-43ca-8aff-99822ba3f48e")
    Set entrySet();

    @objid ("8cfa5d8e-637f-47b4-8fef-46df53fe4807")
    Object firstKey();

    @objid ("d4ae863f-14c7-4d8c-8bcf-86df08581e14")
    SortedMap headMap(Object p0);

    @objid ("d2a7977a-13bf-4953-8638-6c4aa93533a4")
    Set keySet();

    @objid ("c5b3f7cd-8f3b-42df-a4b7-d149a6761880")
    Object lastKey();

    @objid ("1cf46839-40fd-47d4-b1e4-9cd9970fc591")
    SortedMap subMap(Object p0, Object p1);

    @objid ("112b2619-c7d9-4e1c-906b-783014d8141c")
    SortedMap tailMap(Object p0);

    @objid ("82b3a0b2-c7b2-435a-bf04-85b566574c66")
    Collection values();

}

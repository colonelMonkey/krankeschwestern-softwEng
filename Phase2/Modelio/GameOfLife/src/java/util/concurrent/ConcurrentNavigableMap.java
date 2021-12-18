package java.util.concurrent;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1b2b-0000-000000000000")
public interface ConcurrentNavigableMap extends ConcurrentMap, NavigableMap {
    @objid ("8fbf9c7c-4ea6-4592-9afc-009dfbe4f513")
    NavigableSet descendingKeySet();

    @objid ("50ee3fdd-0220-4f04-b367-c1cd06d7018d")
    ConcurrentNavigableMap descendingMap();

    @objid ("c824e449-c610-4fcf-a922-c88ef68b79ce")
    NavigableMap descendingMap();

    @objid ("074df93d-31fe-457a-9d71-a746d27028f4")
    SortedMap headMap(Object p0);

    @objid ("f4b79510-0bef-4735-8472-1452e1e09a92")
    NavigableMap headMap(Object p0, boolean p1);

    @objid ("28e1d8b7-6254-41c1-be91-3231f14e5826")
    ConcurrentNavigableMap headMap(Object p0, boolean p1);

    @objid ("0d0e9d6c-3d91-47b6-9205-29991d2dc059")
    ConcurrentNavigableMap headMap(Object p0);

    @objid ("be6db95c-3ac9-43c0-a1f6-099d99484185")
    NavigableSet keySet();

    @objid ("9de619d2-d1a1-4d79-bc15-0894c16ef4ee")
    Set keySet();

    @objid ("272d204d-3a89-453a-926f-b183d2e99453")
    NavigableSet navigableKeySet();

    @objid ("0fc88351-fc26-43a3-91cf-a3c2a1ce7e42")
    ConcurrentNavigableMap subMap(Object p0, boolean p1, Object p2, boolean p3);

    @objid ("2842cf1e-2476-4681-8170-2193c9e082d2")
    SortedMap subMap(Object p0, Object p1);

    @objid ("59b745ac-f788-44f9-be42-fc149253c450")
    NavigableMap subMap(Object p0, boolean p1, Object p2, boolean p3);

    @objid ("8566076a-05c4-44fb-8d49-df517bc37a49")
    ConcurrentNavigableMap subMap(Object p0, Object p1);

    @objid ("cd29aa27-b5ee-4698-b3d5-8c0917b2355a")
    ConcurrentNavigableMap tailMap(Object p0);

    @objid ("26a19465-87c5-4abc-acbf-9f2297e6a539")
    NavigableMap tailMap(Object p0, boolean p1);

    @objid ("0c842e85-702e-42db-927e-384a748015cd")
    SortedMap tailMap(Object p0);

    @objid ("6a13f607-0782-4075-ba08-1a0e9431590e")
    ConcurrentNavigableMap tailMap(Object p0, boolean p1);

}

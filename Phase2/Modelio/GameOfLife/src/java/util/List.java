package java.util;

import java.util.List;
import java.util.function.UnaryOperator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2cf2-0000-000000000000")
public interface List extends Collection {
    @objid ("1d6151bd-589f-4323-bef4-1b7fe84050b0")
    boolean add(Object p0);

    @objid ("56e866cc-24ae-4baa-9e64-4efc69eeb72d")
    void add(int p0, Object p1);

    @objid ("4392f73e-8444-4ecb-b552-f3f96be22c7a")
    boolean addAll(Collection p0);

    @objid ("0ebd9d3d-f079-4487-beab-cd69b9777937")
    boolean addAll(int p0, Collection p1);

    @objid ("5f79cddf-57f5-4f6d-985c-0a4676bbb0d3")
    void clear();

    @objid ("dfc5e73c-9cd1-4c7d-888c-aa1c4002fa57")
    boolean contains(Object p0);

    @objid ("99ec5839-09c1-4071-91cb-5864244ea6fc")
    boolean containsAll(Collection p0);

    @objid ("6bf4e0b8-909c-4b81-ad39-3740aab0b9dc")
    boolean equals(Object p0);

    @objid ("e22383e2-4e64-41a5-81ca-1492ae74da51")
    Object get(int p0);

    @objid ("57ba5934-6dff-493b-bf35-486300a0d352")
    int hashCode();

    @objid ("acf592d4-841e-4923-b3d8-318b3acfb343")
    int indexOf(Object p0);

    @objid ("1340a559-e03e-4c0f-a49e-479766359b4b")
    boolean isEmpty();

    @objid ("04032122-128a-4bab-8df7-4203c089b49d")
    Iterator iterator();

    @objid ("4ac9c610-00ce-4fb8-9c10-4df2514ee254")
    int lastIndexOf(Object p0);

    @objid ("72d7628f-1a1b-43b6-95cc-a3945005c074")
    ListIterator listIterator(int p0);

    @objid ("038ce1ed-15a1-4cbb-a2bc-ff518e2a1cd4")
    ListIterator listIterator();

    @objid ("09061b62-8794-40d2-84d3-3f6daed18580")
    Object remove(int p0);

    @objid ("08781bf8-0206-455c-b521-aa6971619253")
    boolean remove(Object p0);

    @objid ("1581880b-9a9d-446d-981b-28f74ba9b518")
    boolean removeAll(Collection p0);

    @objid ("f0a77247-2045-45e8-88ef-b2468d128463")
    void replaceAll(UnaryOperator p0);

    @objid ("f7487434-636b-4cd6-948e-d42fa03047a8")
    boolean retainAll(Collection p0);

    @objid ("064072b8-cac2-4fc8-bf16-293596f63e4a")
    Object set(int p0, Object p1);

    @objid ("c68d1e4e-c95d-4421-a1b3-fbddf07bd308")
    int size();

    @objid ("4066d4ea-95d7-4350-8750-9d9194540878")
    void sort(Comparator p0);

    @objid ("57d06914-b747-4e1f-b25b-087d454597e0")
    Spliterator spliterator();

    @objid ("f069842d-ef13-47fe-a59e-442e147a9bec")
    List subList(int p0, int p1);

    @objid ("0bf7a3f3-b879-479a-8155-d9ec0d91f76b")
    List<Object> toArray();

    @objid ("3144554a-2778-4b8c-a20b-f9592a66ad46")
    List<Object> toArray(List<Object> p0);

}

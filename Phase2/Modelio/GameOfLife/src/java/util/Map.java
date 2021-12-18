package java.util;

import java.lang.invoke.SerializedLambda;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2d02-0000-000000000000")
public interface Map {
    @objid ("7acdd01f-0472-4cc2-a747-289b7cd39fa4")
    void clear();

    @objid ("e64637f7-a890-4580-bc3c-fc7cbc83893f")
    Object compute(Object p0, BiFunction p1);

    @objid ("e8c97aa8-4e47-4f41-9ced-8b9fa01a806f")
    Object computeIfAbsent(Object p0, Function p1);

    @objid ("135a0725-4ae4-4fda-95ed-1584ff9cf347")
    Object computeIfPresent(Object p0, BiFunction p1);

    @objid ("1805a514-7a09-4926-b63a-2da82c027f71")
    boolean containsKey(Object p0);

    @objid ("d415bb73-4b84-4868-b9aa-796d1a8cffdd")
    boolean containsValue(Object p0);

    @objid ("7c29ee4b-e40c-4b08-be39-2a3a975404ef")
    Set entrySet();

    @objid ("94451e5a-6132-40e3-b570-313e04a58402")
    boolean equals(Object p0);

    @objid ("f9ce3683-2193-4ff5-a547-91b7bdac4598")
    void forEach(BiConsumer p0);

    @objid ("77cb4f4f-e269-40cb-9950-c401a1d989a7")
    Object get(Object p0);

    @objid ("361dd517-89e6-4aaf-8702-b736816c8d39")
    Object getOrDefault(Object p0, Object p1);

    @objid ("9c7e0f00-ce58-43f9-a111-80a261e9daad")
    int hashCode();

    @objid ("80ac7dc2-f1ad-4807-9f8b-c442b8abeefc")
    boolean isEmpty();

    @objid ("603080a4-3c91-449a-9b05-585d71cd9227")
    Set keySet();

    @objid ("0cd09014-51c0-47a0-9822-5dd3b3612827")
    Object merge(Object p0, Object p1, BiFunction p2);

    @objid ("dff6b2ed-8fac-4b8f-aef1-4e977bf6a8bb")
    Object put(Object p0, Object p1);

    @objid ("bbde1056-526b-4d6d-867e-314ab4af7f6e")
    void putAll(Map p0);

    @objid ("bdbfe143-be99-44e8-91df-78d0a85b6b75")
    Object putIfAbsent(Object p0, Object p1);

    @objid ("0fec6b32-1a58-4507-958b-8d5576c9911d")
    Object remove(Object p0);

    @objid ("677971ac-b360-44e6-8712-41b0cf15bbee")
    boolean remove(Object p0, Object p1);

    @objid ("fe1e5fa1-8418-4a17-b0b3-3202bb6a99ef")
    Object replace(Object p0, Object p1);

    @objid ("eb99ba35-c1fa-452d-ac6e-211ac370b3dc")
    boolean replace(Object p0, Object p1, Object p2);

    @objid ("177e003f-6e73-4035-ae09-ae7a94c9a15b")
    void replaceAll(BiFunction p0);

    @objid ("d0d3f51e-0f5d-44a0-8cac-e2682f7ab659")
    int size();

    @objid ("7ab6238e-6d48-4c29-aab3-5940c9f7912c")
    Collection values();

    @objid ("00d00398-0000-2d03-0000-000000000000")
    interface Entry {
        @objid ("b7888b82-92eb-4446-b5c8-a0b9fbfadb6c")
        Object $deserializeLambda$(SerializedLambda p0);

        @objid ("1bbfbec9-31e5-4a45-b90c-917465e6fa28")
        Comparator comparingByKey(Comparator p0);

        @objid ("67aafe8e-47e2-4631-93c3-8eccae0b6081")
        Comparator comparingByKey();

        @objid ("3d569545-77a9-4250-a5d0-34d3b8c42b79")
        Comparator comparingByValue();

        @objid ("c6becb0c-eeb0-4586-bd97-af52826e251c")
        Comparator comparingByValue(Comparator p0);

        @objid ("fe6d6261-1d5b-42e2-8f51-d02d60030efc")
        boolean equals(Object p0);

        @objid ("44bc31b3-d482-4781-8a85-e0691e17d525")
        Object getKey();

        @objid ("c61f0281-d3ec-4624-ad62-58a68ea8a0f4")
        Object getValue();

        @objid ("93e905c4-e2e8-4ea8-b953-1fe034517f67")
        int hashCode();

        @objid ("eca55279-cb23-4934-9c5d-071af2f0f395")
        int lambda$comparingByKey$6d558cbf$1(Comparator p0, Entry p1, Entry p2);

        @objid ("740040cc-54ad-4ea7-8609-e7092ff9cdd1")
        int lambda$comparingByKey$bbdbfea9$1(Entry p0, Entry p1);

        @objid ("4305282e-5c45-4bd1-9002-71beff6444e7")
        int lambda$comparingByValue$1065357e$1(Entry p0, Entry p1);

        @objid ("d04d41ce-39af-4c00-afc3-33ee10c3f77b")
        int lambda$comparingByValue$827a17d5$1(Comparator p0, Entry p1, Entry p2);

        @objid ("3a54e30e-c4b0-462b-b507-b22d9573c523")
        Object setValue(Object p0);

    }

}

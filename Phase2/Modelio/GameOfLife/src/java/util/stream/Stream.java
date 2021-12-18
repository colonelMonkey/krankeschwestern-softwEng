package java.util.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0a48278d-59a2-4d62-ad7f-d5bc8afcaa91")
public interface Stream extends BaseStream {
    @objid ("8aa4d6de-104c-4e73-9497-7c8dde08b245")
    boolean allMatch(Predicate p0);

    @objid ("b66e2002-db93-4bcf-9161-a6b5d15f7773")
    boolean anyMatch(Predicate p0);

    @objid ("639f89bf-ea4f-4e56-80ee-b842d4a700c2")
    Builder builder();

    @objid ("d77d383e-f6c9-4bb9-93a4-62d414ca40e7")
    Object collect(Supplier p0, BiConsumer p1, BiConsumer p2);

    @objid ("6758b7d8-e5d2-4792-b39b-2a2eed61b3bb")
    Object collect(Collector p0);

    @objid ("c789decb-552f-40fe-8e47-94f5d506a06e")
    Stream concat(Stream p0, Stream p1);

    @objid ("75bab435-a3d9-49a9-9bea-7043980d55f9")
    long count();

    @objid ("daa13033-a609-429b-bd8f-91f8e5cd4642")
    Stream distinct();

    @objid ("a0327cb0-c988-475b-9260-4e7ef5fd285a")
    Stream empty();

    @objid ("d59273e2-9af8-4879-82f8-69671c95e372")
    Stream filter(Predicate p0);

    @objid ("020a168f-e57a-46c7-8655-236a04b5629e")
    Optional findAny();

    @objid ("0533a3c3-ab32-4b87-9101-090a9b32a3ae")
    Optional findFirst();

    @objid ("5177270b-5db0-4468-9e05-c9e0e0246402")
    Stream flatMap(Function p0);

    @objid ("ff3486a4-0577-429e-a202-481b959d0ca5")
    DoubleStream flatMapToDouble(Function p0);

    @objid ("2f2180dd-69d3-4934-8357-ea6619211ed2")
    IntStream flatMapToInt(Function p0);

    @objid ("b81fd04b-f70d-45bf-89c8-aa8213ba725c")
    LongStream flatMapToLong(Function p0);

    @objid ("cc2327d5-9984-44d3-b9a3-51ad05d87b3e")
    void forEach(Consumer p0);

    @objid ("a12682b3-52ae-48ce-a6c9-8e5fd2de0abc")
    void forEachOrdered(Consumer p0);

    @objid ("21aa4351-3d62-4cdc-8ff4-47ee6f24f3a5")
    Stream generate(Supplier p0);

    @objid ("55bcba92-aa92-4624-9e6c-5f439a9cac70")
    Stream iterate(Object p0, UnaryOperator p1);

    @objid ("21edcdfc-3ad8-4bd1-bda4-23400187f174")
    Stream limit(long p0);

    @objid ("0788820e-c2e8-4f8c-b639-8dc1042b6bd3")
    Stream map(Function p0);

    @objid ("059c6ed4-266f-4518-8248-f532decf814a")
    DoubleStream mapToDouble(ToDoubleFunction p0);

    @objid ("ddb2bf3e-7e78-4a06-9eb7-46e7e6ecb63e")
    IntStream mapToInt(ToIntFunction p0);

    @objid ("3f1fc1d7-e41a-4279-a684-ca38181d6a4e")
    LongStream mapToLong(ToLongFunction p0);

    @objid ("fd061165-90ff-4be6-9bc9-b00a7e19a2f3")
    Optional max(Comparator p0);

    @objid ("dcdcebe8-5a33-4c71-8273-98d7095d40bb")
    Optional min(Comparator p0);

    @objid ("11f6ebaf-5c5b-4b75-92ca-05c30f60dccb")
    boolean noneMatch(Predicate p0);

    @objid ("962e2240-e60d-46b2-98bf-7b25b2a8a40a")
    Stream of(List<Object> p0);

    @objid ("1e0917e2-e935-4163-bf37-15e0b1f9b049")
    Stream of(Object p0);

    @objid ("7e0f7493-11d9-4cde-9882-67ff6c01f8b9")
    Stream peek(Consumer p0);

    @objid ("64398021-2ca9-4723-b6f9-6441b788d5f6")
    Object reduce(Object p0, BiFunction p1, BinaryOperator p2);

    @objid ("463a8431-7fb5-48f1-bef9-8204e8279c7a")
    Optional reduce(BinaryOperator p0);

    @objid ("58fe26b1-c5ac-44ba-a5bb-cdcf80fd1364")
    Object reduce(Object p0, BinaryOperator p1);

    @objid ("7f47169a-c049-4e20-b065-db23d45b08d6")
    Stream skip(long p0);

    @objid ("70e34a22-b165-44bf-9e86-0f427a90f956")
    Stream sorted(Comparator p0);

    @objid ("f545992b-07a1-4ba0-b437-940c7f99a977")
    Stream sorted();

    @objid ("c0663422-b4ba-40fd-9adb-4a9fcce3e08f")
    List<Object> toArray(IntFunction p0);

    @objid ("d559319c-e202-4c2c-bf4e-7c2bae356e4f")
    List<Object> toArray();

    @objid ("a189f1e9-6ce5-4c26-82cd-404f3ee2d506")
    interface Builder extends Consumer {
        @objid ("47829803-65fe-4dc0-aa94-297ae103a5aa")
        void accept(Object p0);

        @objid ("b8e498d8-509a-48e3-9b16-d4b682f4f2ed")
        Builder add(Object p0);

        @objid ("bff963d5-1f9e-4179-9f9f-c364c1420cdb")
        Stream build();

    }

}

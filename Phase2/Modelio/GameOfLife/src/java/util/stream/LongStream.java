package java.util.stream;

import java.util.Iterator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.PrimitiveIterator.OfLong;
import java.util.Spliterator.OfLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b599dd63-25ab-4153-94af-060932f1ae07")
public interface LongStream extends BaseStream {
    @objid ("255e8e06-1c01-41a6-b185-e75e55ca950f")
    boolean allMatch(LongPredicate p0);

    @objid ("5b5961dd-4b9d-4505-926e-25740d261162")
    boolean anyMatch(LongPredicate p0);

    @objid ("6f1e6994-58b1-4863-9772-270b0840a4ce")
    DoubleStream asDoubleStream();

    @objid ("71b01425-50bd-4f03-859f-9a14a29cbb51")
    OptionalDouble average();

    @objid ("9c36eff3-fae5-47e1-ac71-f8b8850f7b2a")
    Stream boxed();

    @objid ("f687049e-4619-4133-b2cf-a3f29ffd228d")
    Builder builder();

    @objid ("e581c2b0-5321-4625-ad39-deca4baf9e12")
    Object collect(Supplier p0, ObjLongConsumer p1, BiConsumer p2);

    @objid ("82070e08-6438-4a21-82cc-811ee105a1c6")
    LongStream concat(LongStream p0, LongStream p1);

    @objid ("43439e73-f26c-4711-92c8-3e22c872e619")
    long count();

    @objid ("385fc290-e14d-4687-bf3a-657d0812b00b")
    LongStream distinct();

    @objid ("68a67c95-4a8f-4e34-b1fa-b1a407e55afa")
    LongStream empty();

    @objid ("b0decb08-8a5a-425d-a199-2fbf3db5e0a0")
    LongStream filter(LongPredicate p0);

    @objid ("3802fc70-94fb-4fe4-87fb-06b1882eab3d")
    OptionalLong findAny();

    @objid ("5b05ec3a-778b-4380-b0a1-4d4f9cf05344")
    OptionalLong findFirst();

    @objid ("a6aa22de-80bf-422c-8c16-3f514e5c40fc")
    LongStream flatMap(LongFunction p0);

    @objid ("2741cbde-be9a-4446-a1a0-b002bc8b81cf")
    void forEach(LongConsumer p0);

    @objid ("d295dbed-c178-4ef8-aa03-35cf160b67ec")
    void forEachOrdered(LongConsumer p0);

    @objid ("4d14703a-68ee-4d6a-9af9-c5e34ef94867")
    LongStream generate(LongSupplier p0);

    @objid ("bb1a588c-f069-4fe5-a3ba-f1cd6151b839")
    LongStream iterate(long p0, LongUnaryOperator p1);

    @objid ("e7b0c421-4af8-4a5b-bdaf-465782724c22")
    OfLong iterator();

    @objid ("1527562a-cf24-4c18-9d95-6940d439a711")
    Iterator iterator();

    @objid ("7d46ba38-1879-4527-95ce-9982a73f0474")
    LongStream limit(long p0);

    @objid ("e71a9f7f-83ce-49a3-80cf-29427a6ee1fb")
    LongStream map(LongUnaryOperator p0);

    @objid ("a811bb11-c5e0-4125-9ea0-a206f93ccf5c")
    DoubleStream mapToDouble(LongToDoubleFunction p0);

    @objid ("63f51f58-d5af-4a04-b36e-2d6cf7d12a8d")
    IntStream mapToInt(LongToIntFunction p0);

    @objid ("97e499a1-e8bd-42d1-9f60-8fde9c3a2aba")
    Stream mapToObj(LongFunction p0);

    @objid ("28c474e6-8c10-433c-b9b0-f849cbe79fe0")
    OptionalLong max();

    @objid ("958a96ff-bea7-4495-a7fd-f71195124f32")
    OptionalLong min();

    @objid ("d2c9fce6-48bf-44f3-a1c5-8456eabe8c6f")
    boolean noneMatch(LongPredicate p0);

    @objid ("fdcd2fa9-937a-4462-81cc-954b5772b14f")
    LongStream of(long p0);

    @objid ("0900001d-934b-4cab-9cc9-6c98fddc64c0")
    LongStream of(List<Long> p0);

    @objid ("57135083-8bfe-44c5-9d65-d97dbd720fda")
    LongStream parallel();

    @objid ("329b3dd9-fd71-41ba-96ec-d97a3ed0ef59")
    BaseStream parallel();

    @objid ("af3ada32-5b3d-4d0d-90d3-ece9c11a322b")
    LongStream peek(LongConsumer p0);

    @objid ("3e5ac855-5bc9-45e4-be53-1edb139fc6c1")
    LongStream range(long p0, long p1);

    @objid ("62305704-c4d3-42e4-aecb-6f164b182df1")
    LongStream rangeClosed(long p0, long p1);

    @objid ("358e67fa-7a2f-4bd7-8d71-f91712084837")
    OptionalLong reduce(LongBinaryOperator p0);

    @objid ("08ccc98f-c7af-4507-87be-c938eeceb7fe")
    long reduce(long p0, LongBinaryOperator p1);

    @objid ("6deca105-945d-45fc-9926-1e9e3ccaa026")
    BaseStream sequential();

    @objid ("877a17b0-8bb5-47e7-9744-93b264759e9a")
    LongStream sequential();

    @objid ("b3534294-ea21-4ac8-aca0-72dea9c03a1a")
    LongStream skip(long p0);

    @objid ("8229c594-1847-489f-9a15-d7ffde6cab2e")
    LongStream sorted();

    @objid ("72bb7125-1cfe-4f36-88fb-a191646b82eb")
    OfLong spliterator();

    @objid ("9a51c894-1a18-4ce1-ba28-76badc010087")
    Spliterator spliterator();

    @objid ("ba088777-3c16-40f7-b12a-2835a0cb4eda")
    long sum();

    @objid ("d3f6f663-e4ac-4d9e-93a8-587928436ffe")
    LongSummaryStatistics summaryStatistics();

    @objid ("1bdeed09-855f-4872-b774-5af2b729a3e1")
    List<Long> toArray();

    @objid ("5e4cab4c-e131-4385-903a-ff82525863ed")
    interface Builder extends LongConsumer {
        @objid ("c7a5a129-3c11-4c12-ac17-966d041c52b4")
        void accept(long p0);

        @objid ("ef1199ec-1677-40de-83f6-e0730c02f86a")
        Builder add(long p0);

        @objid ("b25154a5-8153-4741-ab27-41404755bb63")
        LongStream build();

    }

}

package java.util.stream;

import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator.OfInt;
import java.util.Spliterator.OfInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ccb8193b-a336-41f7-a8d6-ff69dca393b9")
public interface IntStream extends BaseStream {
    @objid ("98075183-af2c-4439-a81b-dd3b8e8d4da6")
    boolean allMatch(IntPredicate p0);

    @objid ("b56d2119-27e2-465a-b569-daf9f60e4453")
    boolean anyMatch(IntPredicate p0);

    @objid ("965aca87-82f4-4f49-a078-988e1120c348")
    DoubleStream asDoubleStream();

    @objid ("14fbb177-330e-4bb8-bdc0-fa2dc76181c2")
    LongStream asLongStream();

    @objid ("e88b3394-2134-48dc-8544-dc56baadeb5c")
    OptionalDouble average();

    @objid ("65752833-32c2-4450-9221-bc68b1526221")
    Stream boxed();

    @objid ("c62b5fcb-4c27-40e8-bad8-5b7e109e9c50")
    Builder builder();

    @objid ("d355d2cf-fb6c-46c2-9e58-9e55c38309aa")
    Object collect(Supplier p0, ObjIntConsumer p1, BiConsumer p2);

    @objid ("11ec4c70-2b32-4a78-a981-8124ea59f66e")
    IntStream concat(IntStream p0, IntStream p1);

    @objid ("e2c800cf-4efc-4e89-b686-c8dd62e977bb")
    long count();

    @objid ("5ab83d58-0d37-45dd-90a0-7c5428fd6c48")
    IntStream distinct();

    @objid ("a7424c00-b020-4409-aa6d-88ab54cae6cf")
    IntStream empty();

    @objid ("8659fe03-1dd6-49fd-b3b2-4906305ada18")
    IntStream filter(IntPredicate p0);

    @objid ("80ab2ff7-9989-4549-928a-25c3fe8486d5")
    OptionalInt findAny();

    @objid ("1f74660b-f49c-4cab-83bf-2ac03fa42d00")
    OptionalInt findFirst();

    @objid ("34c57639-c486-44ff-81b3-4ba418c47ad4")
    IntStream flatMap(IntFunction p0);

    @objid ("549ecd2e-ee76-4ff3-89ca-8b677aa3221b")
    void forEach(IntConsumer p0);

    @objid ("2aa2c22c-5361-47b9-9383-ff74dd8ad909")
    void forEachOrdered(IntConsumer p0);

    @objid ("beb70429-92e5-46b9-adde-2f77efc0dcd7")
    IntStream generate(IntSupplier p0);

    @objid ("3752db27-4a3a-4c2b-961a-07d09ca634e4")
    IntStream iterate(int p0, IntUnaryOperator p1);

    @objid ("df0bdecb-2815-46ec-b47c-edc6af64f71d")
    OfInt iterator();

    @objid ("13f20a7a-8a75-45b1-92e0-2f30cd5c4e94")
    Iterator iterator();

    @objid ("e64b2d65-2174-4e52-85ef-5feebd3a3aa9")
    IntStream limit(long p0);

    @objid ("18463e45-115d-45f2-8739-212316747e16")
    IntStream map(IntUnaryOperator p0);

    @objid ("2bcd17a8-8b26-48db-b7fb-4be0afdcd770")
    DoubleStream mapToDouble(IntToDoubleFunction p0);

    @objid ("34685bb7-5ae9-42ed-9dbd-502c26e01a9b")
    LongStream mapToLong(IntToLongFunction p0);

    @objid ("f6570205-6403-4707-8182-7756c2fb96d0")
    Stream mapToObj(IntFunction p0);

    @objid ("6822776f-9b26-4a23-b5f2-821ffbadff4a")
    OptionalInt max();

    @objid ("c9db7dda-9994-48eb-bc63-c35e479a2e0c")
    OptionalInt min();

    @objid ("fa9adde4-39e7-4dba-9105-be7bb2a3b8ff")
    boolean noneMatch(IntPredicate p0);

    @objid ("f20705e6-e53e-4109-aa60-f52e5f3864e9")
    IntStream of(int p0);

    @objid ("121fcbee-b7bb-4c43-9b0d-979a6a411345")
    IntStream of(List<Integer> p0);

    @objid ("4807cd86-0cfc-4ae5-a3e0-262d32526516")
    IntStream parallel();

    @objid ("5b96295e-1977-4aff-a4d4-8d2a979f21ba")
    BaseStream parallel();

    @objid ("efc43e6a-ab9c-4b8e-b116-73cdfe98aa77")
    IntStream peek(IntConsumer p0);

    @objid ("ed715ce0-d8ec-45d8-ac3c-087aa91f26fb")
    IntStream range(int p0, int p1);

    @objid ("bfd10932-cf00-4f16-b978-c7b5d46809bc")
    IntStream rangeClosed(int p0, int p1);

    @objid ("f48560d2-1780-4a39-ad62-ead034866fa3")
    OptionalInt reduce(IntBinaryOperator p0);

    @objid ("c540f12f-ca33-463c-9f24-6682fc05bf2e")
    int reduce(int p0, IntBinaryOperator p1);

    @objid ("759f5c34-d77f-4ec8-9cc2-801d67d8e630")
    BaseStream sequential();

    @objid ("7e021bf5-654b-40ab-bf79-47f0dbdef244")
    IntStream sequential();

    @objid ("e02a5cd9-3794-4291-8229-4b05c9fe04d7")
    IntStream skip(long p0);

    @objid ("9e002c4f-255b-44f0-a02b-6c189e9af0a3")
    IntStream sorted();

    @objid ("26a5e489-5121-40cb-894e-c9aa89f8fb57")
    OfInt spliterator();

    @objid ("bb2805c6-ce00-4ce5-b856-469a2ce05f26")
    Spliterator spliterator();

    @objid ("5f57b4cd-784e-4f32-8204-4b8ddb1847ad")
    int sum();

    @objid ("d10931d8-43fc-430d-984e-55df85682bca")
    IntSummaryStatistics summaryStatistics();

    @objid ("39481ebf-8ac0-414e-ae64-4e8ac405323b")
    List<Integer> toArray();

    @objid ("7c25d1c6-e772-42bf-ab8d-24d5ad25bcab")
    interface Builder extends IntConsumer {
        @objid ("502f6475-d1db-4e85-a338-921fa6cd4b2c")
        void accept(int p0);

        @objid ("ec00a795-8b28-45db-804c-33bfd49a778a")
        Builder add(int p0);

        @objid ("99ac1e4d-4d77-4c82-aa2a-9066ccece647")
        IntStream build();

    }

}

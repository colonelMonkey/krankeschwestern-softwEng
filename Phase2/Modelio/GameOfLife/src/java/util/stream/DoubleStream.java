package java.util.stream;

import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator.OfDouble;
import java.util.Spliterator.OfDouble;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7dc2e0a3-c9fd-49e9-9170-4a2c3034bc72")
public interface DoubleStream extends BaseStream {
    @objid ("6b3e17eb-3c05-4aed-a75a-605ebb835772")
    boolean allMatch(DoublePredicate p0);

    @objid ("d7fb5848-d7c1-46c8-a9e2-ec0b1e46d212")
    boolean anyMatch(DoublePredicate p0);

    @objid ("c7eb1e4d-caf3-40bd-8372-a4821c845167")
    OptionalDouble average();

    @objid ("05f94f92-b30c-4dd8-bc0e-70884b1b8a0b")
    Stream boxed();

    @objid ("97b92bc1-7c3c-4cc4-8d25-fe69b1cb9bc7")
    Builder builder();

    @objid ("9aa0b2f7-f95d-4146-a4c0-bdb729eb8051")
    Object collect(Supplier p0, ObjDoubleConsumer p1, BiConsumer p2);

    @objid ("022d66ee-a061-4cad-b42b-cb42364ddfbb")
    DoubleStream concat(DoubleStream p0, DoubleStream p1);

    @objid ("0e4d917d-e33e-48aa-a12c-9fc53116b92c")
    long count();

    @objid ("f6d82a03-e4d1-42bb-857a-476d8191b542")
    DoubleStream distinct();

    @objid ("55121730-e92d-4cd8-b213-588c5b32506e")
    DoubleStream empty();

    @objid ("2f2a1798-c666-4644-8e67-441619bad832")
    DoubleStream filter(DoublePredicate p0);

    @objid ("23fb531b-5eb7-4bdc-b065-ab881eb2ce64")
    OptionalDouble findAny();

    @objid ("47ed943e-9f32-44d1-b75d-1050e6442a80")
    OptionalDouble findFirst();

    @objid ("48096bb6-83e0-433b-acbf-96b6dcf63ef6")
    DoubleStream flatMap(DoubleFunction p0);

    @objid ("88891986-339d-4413-841e-f50df87164f7")
    void forEach(DoubleConsumer p0);

    @objid ("bffd68c8-f0b1-4302-bce2-a39e9001cadd")
    void forEachOrdered(DoubleConsumer p0);

    @objid ("4f0f0761-2ecb-4ad5-94ae-dd4cf7a1d0ae")
    DoubleStream generate(DoubleSupplier p0);

    @objid ("e5a4b504-4ae4-49f9-bfe1-646af7fd7fed")
    DoubleStream iterate(double p0, DoubleUnaryOperator p1);

    @objid ("45039e06-7835-4cb5-a824-99a5b1facfcc")
    OfDouble iterator();

    @objid ("cdcf17b4-422e-44be-b888-eeeeee007aa1")
    Iterator iterator();

    @objid ("ccd973fa-a670-42e6-af86-9292a0709308")
    DoubleStream limit(long p0);

    @objid ("9cb6f318-20ab-43a7-83bb-ebb4ceb6144c")
    DoubleStream map(DoubleUnaryOperator p0);

    @objid ("0d1bb7d4-ef97-48b2-8f3d-a154568a70c0")
    IntStream mapToInt(DoubleToIntFunction p0);

    @objid ("b8b4022c-5336-41cd-a24b-e015cbd3182f")
    LongStream mapToLong(DoubleToLongFunction p0);

    @objid ("bd9cf0f3-018d-4feb-b263-d28da563fcf0")
    Stream mapToObj(DoubleFunction p0);

    @objid ("42112384-1b5a-47d9-8954-998cca6d7b45")
    OptionalDouble max();

    @objid ("0b8eba97-6075-4184-8cb6-d945fc1cdf4f")
    OptionalDouble min();

    @objid ("6b457b05-c499-46b1-82de-66174cc5f1f1")
    boolean noneMatch(DoublePredicate p0);

    @objid ("3318af0f-c283-4273-a5c6-635f86e990ed")
    DoubleStream of(double p0);

    @objid ("e11c4086-9c88-47ff-b96a-cab14cce563d")
    DoubleStream of(List<Double> p0);

    @objid ("39194307-ecf7-4813-9a9b-5ef5c0c63aea")
    BaseStream parallel();

    @objid ("13abf0f6-565f-4d89-b56f-139db2f61d56")
    DoubleStream parallel();

    @objid ("02bc34af-b4c6-4df7-9975-7546cd643e57")
    DoubleStream peek(DoubleConsumer p0);

    @objid ("534f8bf6-e451-4dd8-ac08-664009df2450")
    OptionalDouble reduce(DoubleBinaryOperator p0);

    @objid ("912fd5e4-f270-4ce7-a128-ee25e3821f23")
    double reduce(double p0, DoubleBinaryOperator p1);

    @objid ("640d90f9-6911-4ae7-8751-7ef46b107085")
    DoubleStream sequential();

    @objid ("db7fb776-385a-405c-a6e8-8868e0a252de")
    BaseStream sequential();

    @objid ("908b82a4-282e-4931-8110-5b2e8976a4d8")
    DoubleStream skip(long p0);

    @objid ("eaf9dccb-e639-4391-99f8-7a465a3c4fef")
    DoubleStream sorted();

    @objid ("56227d49-4887-47a8-90d5-9175a6534812")
    OfDouble spliterator();

    @objid ("bb2dee48-d3c7-4a80-b8ef-f551ef1d7915")
    Spliterator spliterator();

    @objid ("656e63e3-8f3a-4e40-a45c-3f753924c17b")
    double sum();

    @objid ("ee131a6d-e955-45fa-a781-041493ec9b24")
    DoubleSummaryStatistics summaryStatistics();

    @objid ("6104fcec-3685-4546-9ad3-eb61a3289762")
    List<Double> toArray();

    @objid ("65df1b3e-c94d-430b-a182-2da35ebd4cc2")
    interface Builder extends DoubleConsumer {
        @objid ("a7dd821d-9e9e-42f8-a36d-e34285bbc42f")
        void accept(double p0);

        @objid ("f0811400-b10f-49e4-9d0a-68615e60d68e")
        Builder add(double p0);

        @objid ("9ffbd0d2-74d4-44b7-bfa4-ff83cf507a72")
        DoubleStream build();

    }

}

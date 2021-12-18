package java.util.stream;

import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ae1bb777-b587-401e-b461-51bb274ce548")
public interface Collector {
    @objid ("d6cd0ef4-4c84-4312-83b0-8deb131b2639")
    BiConsumer accumulator();

    @objid ("75b2aacf-c4aa-4976-8f79-76d51112833f")
    Set characteristics();

    @objid ("997b7cbb-ca65-4179-92e7-4b38a2525ead")
    BinaryOperator combiner();

    @objid ("eb742901-fbeb-4ea9-92eb-86c346387eec")
    Function finisher();

    @objid ("dc882936-c4f2-4d74-8a9b-08dab0dbfad8")
    Collector of(Supplier p0, BiConsumer p1, BinaryOperator p2, List<Characteristics> p3);

    @objid ("4d641388-af89-4ac8-9e3c-7377a30d02ca")
    Collector of(Supplier p0, BiConsumer p1, BinaryOperator p2, Function p3, List<Characteristics> p4);

    @objid ("8886fda9-f098-4a6f-9442-28b2c83baa23")
    Supplier supplier();

    @objid ("9e53ead5-92cf-4a17-8ccb-13a1f03ac553")
    enum Characteristics {
        ;
    }

}

package java.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("52d175df-71e9-43df-96ef-758f17afc465")
public interface PrimitiveIterator extends Iterator {
    @objid ("aa9d40d2-036a-4acf-95e3-7676e5c5e51d")
    void forEachRemaining(Object p0);

    @objid ("ee4696d1-adb7-406c-ae80-f4157fd98fbf")
    interface OfDouble extends PrimitiveIterator {
        @objid ("5a1ae3a3-a894-47ad-8feb-47d999cac3b5")
        void forEachRemaining(DoubleConsumer p0);

        @objid ("3e6e7fd6-a48f-427a-96fe-3996350186b3")
        void forEachRemaining(Object p0);

        @objid ("39607c6a-36c7-4f29-abc4-b461349b301e")
        void forEachRemaining(Consumer p0);

        @objid ("cce89ce3-da9a-43a0-9222-5da85a149a5f")
        Object next();

        @objid ("99a76426-bcce-42fa-80a8-fcd56704a3e1")
        Double next();

        @objid ("3133a89f-bbef-4f28-9cb3-17f0fd28d91a")
        double nextDouble();

    }

    @objid ("993ae2ab-c05b-40e1-9c37-a1a5eccb8063")
    interface OfInt extends PrimitiveIterator {
        @objid ("1a1e12b4-f138-4207-b451-20b400c9c5bb")
        void forEachRemaining(IntConsumer p0);

        @objid ("42e03310-a950-49a9-8f82-456b0d344836")
        void forEachRemaining(Object p0);

        @objid ("a2c13e00-f844-4e4b-a437-524134eeaafb")
        void forEachRemaining(Consumer p0);

        @objid ("3e338819-da95-4516-a76b-03c392fa9f5c")
        Object next();

        @objid ("0c61864f-a07e-4aae-9895-bbe2a6bd281a")
        Integer next();

        @objid ("aceffdb4-13d0-4499-8e06-497782ea19d3")
        int nextInt();

    }

    @objid ("777bc61e-cca1-42ab-9081-9b92d3951e62")
    interface OfLong extends PrimitiveIterator {
        @objid ("b819dbb3-e0f7-4ed3-89da-947292154541")
        void forEachRemaining(Object p0);

        @objid ("577603b6-084a-43d8-840d-a3b5ce7762c6")
        void forEachRemaining(Consumer p0);

        @objid ("039a73b1-5ad6-4b24-a8e2-9e9e4caa3f4b")
        void forEachRemaining(LongConsumer p0);

        @objid ("c532e629-01c8-4673-b48b-c71b644618da")
        Long next();

        @objid ("f0d6e34b-256b-47ef-9955-9ef5b0e3163e")
        Object next();

        @objid ("e813c091-ca77-492b-881a-feb49c1360b2")
        long nextLong();

    }

}

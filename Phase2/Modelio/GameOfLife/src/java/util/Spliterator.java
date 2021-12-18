package java.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c66334c7-06fc-402f-a1a4-fa7f7f44eb87")
public interface Spliterator {
    @objid ("3abe5514-ccfa-4390-b2f4-49ed98f7d998")
    int characteristics();

    @objid ("0077a7b0-4c7d-46f8-a534-bd2108b05dc2")
    long estimateSize();

    @objid ("edd57798-52d1-4977-8304-ee0d592720b8")
    void forEachRemaining(Consumer p0);

    @objid ("6c70d44d-62ff-4103-905e-d979ede15d7d")
    Comparator getComparator();

    @objid ("9bb3fb22-a8cc-4ca4-bfa7-09e0bbf12420")
    long getExactSizeIfKnown();

    @objid ("e3af3fac-f574-47eb-91f8-80229eb395d8")
    boolean hasCharacteristics(int p0);

    @objid ("beeda92a-17f8-4abf-99f8-98878d63c161")
    boolean tryAdvance(Consumer p0);

    @objid ("3c291ed9-7f58-4f9b-a27f-3669d1f60d9d")
    Spliterator trySplit();

    @objid ("514908d5-ba1f-4e08-89a5-5c52f3b1e1ee")
    interface OfDouble extends OfPrimitive {
        @objid ("36c0c5b5-4bc3-4b3a-9eb6-384e9aff8eb4")
        void forEachRemaining(Object p0);

        @objid ("a6f46844-2e49-4ae4-a319-08a83fb1098e")
        void forEachRemaining(DoubleConsumer p0);

        @objid ("901c5e09-56f0-46e0-8ab9-4629e1024e6b")
        void forEachRemaining(Consumer p0);

        @objid ("70e199cb-78e5-4c52-8295-47ec80c9f84e")
        boolean tryAdvance(Object p0);

        @objid ("09db558a-2fc6-492b-87a8-0dcc8e8c3ef1")
        boolean tryAdvance(Consumer p0);

        @objid ("deba629d-0287-4690-bd3b-f4f5508b11c2")
        boolean tryAdvance(DoubleConsumer p0);

        @objid ("f861265c-b39f-43af-a9eb-6153b9eb7b3e")
        OfPrimitive trySplit();

        @objid ("116a4ba5-7813-455f-8cfb-75eb3c6b574e")
        Spliterator trySplit();

        @objid ("cd16d6a0-0566-4a12-9397-d582f4a083f2")
        OfDouble trySplit();

    }

    @objid ("5de01ab4-7b36-47e4-8573-65d0cd50c63d")
    interface OfInt extends OfPrimitive {
        @objid ("312f50f6-02de-4bc9-9f51-f0dcebc35e2e")
        void forEachRemaining(Object p0);

        @objid ("72f5351d-883b-4256-bc98-b9277e455ca0")
        void forEachRemaining(IntConsumer p0);

        @objid ("970ac98c-9ef7-4d83-a327-575c66973627")
        void forEachRemaining(Consumer p0);

        @objid ("100d971c-2557-4cee-97fc-00e6942e655e")
        boolean tryAdvance(Object p0);

        @objid ("73697f29-b802-455a-9982-3435e62ef379")
        boolean tryAdvance(Consumer p0);

        @objid ("cc684083-72d9-477f-a601-8cc77d9968ef")
        boolean tryAdvance(IntConsumer p0);

        @objid ("fee778e1-d67f-461d-aa4f-1c86c71d7710")
        OfPrimitive trySplit();

        @objid ("7ee627a0-2a4a-44ef-ae14-e8a1280544c1")
        Spliterator trySplit();

        @objid ("852cf886-775e-4ebf-91c3-b18889844858")
        OfInt trySplit();

    }

    @objid ("29892e54-a6f7-4ff7-8dca-20be2eda34d5")
    interface OfLong extends OfPrimitive {
        @objid ("7d71fc62-9f4f-4c86-a85b-679d13de2d2f")
        void forEachRemaining(Object p0);

        @objid ("b1eb4b5a-f151-480f-a99d-e385b9d161f5")
        void forEachRemaining(LongConsumer p0);

        @objid ("de55ae9e-ef95-41c8-a3be-0d26ad2db69b")
        void forEachRemaining(Consumer p0);

        @objid ("7a9c0f3d-fc51-44d9-a9df-a6942392c838")
        boolean tryAdvance(Object p0);

        @objid ("b9507bce-4519-427e-b984-7ecce27f6200")
        boolean tryAdvance(Consumer p0);

        @objid ("2949c972-4a6d-4bba-b444-d37f832417c9")
        boolean tryAdvance(LongConsumer p0);

        @objid ("32014426-9ad1-4fb4-afa4-75324d88351f")
        OfPrimitive trySplit();

        @objid ("dbb888fa-2a12-4de2-a703-9da13616f5ee")
        Spliterator trySplit();

        @objid ("c2d61056-85b3-4683-9f5d-440ec87a11ef")
        OfLong trySplit();

    }

    @objid ("7b7744d2-c7c9-4610-a774-fa5f602738a4")
    interface OfPrimitive extends Spliterator {
        @objid ("d06bf505-b37b-4d32-a425-6ac08170710f")
        void forEachRemaining(Object p0);

        @objid ("0ece0778-70ab-495d-8e7b-3cc47829a582")
        boolean tryAdvance(Object p0);

        @objid ("11afda35-257b-4fb4-874b-75e257b6aee4")
        Spliterator trySplit();

        @objid ("981e24b0-b764-4ec1-bfbe-250555612816")
        OfPrimitive trySplit();

    }

}

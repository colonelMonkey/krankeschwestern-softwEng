package java.lang;

import java.util.Spliterator.OfInt;
import java.util.stream.IntStream;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2b85-0000-000000000000")
public interface CharSequence {
    @objid ("b449128f-8a2d-43e7-9849-9d63baf1815f")
    char charAt(int p0);

    @objid ("503c11c3-4180-4d0d-80af-9df38e0b5d67")
    IntStream chars();

    @objid ("7f3d5b9b-f104-45c2-81b7-c208e3b041e0")
    IntStream codePoints();

    @objid ("8325ae41-ae3e-484d-9b1f-809bacdff998")
    int length();

    @objid ("9b7aae93-9f4e-46a8-8777-1eaf0eb89e3b")
    CharSequence subSequence(int p0, int p1);

    @objid ("a40ff08e-7134-4713-a3b8-ee76d95e64bc")
    String toString();

    @objid ("1de19a98-c523-4e23-aa4e-d28028b0dd91")
    OfInt lambda$chars$0();

    @objid ("8e305497-e4d2-4e2a-bf20-f4c8c3577b3d")
    OfInt lambda$codePoints$1();

}

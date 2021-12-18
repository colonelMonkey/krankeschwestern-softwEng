package java.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b526218e-4113-4002-bc79-ec161e50ee4e")
public interface BaseStream extends AutoCloseable {
    @objid ("cb5d77ff-003b-4abc-a4a4-fcd390b3af63")
    void close();

    @objid ("b38dbd4b-9e15-42ad-ac59-bccf27305cb1")
    boolean isParallel();

    @objid ("c7b2e5a5-df88-4c6a-9605-6a5db6b14e40")
    Iterator iterator();

    @objid ("5f0454d8-3a1a-4561-a04b-99764e7e798a")
    BaseStream onClose(Runnable p0);

    @objid ("2476fca8-5c15-4e8d-9797-bb3ae6100d20")
    BaseStream parallel();

    @objid ("212ffaac-8204-40f2-bd04-5e14adb81d38")
    BaseStream sequential();

    @objid ("56d35386-f0d3-44b1-824e-a6a991c75559")
    Spliterator spliterator();

    @objid ("db25d068-26ee-47cc-9bce-603f244551d0")
    BaseStream unordered();

}

package java.lang;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ac2-0000-000000000000")
public interface Iterable {
    @objid ("600c82af-4a4a-4533-8d68-145aeea9090a")
    void forEach(Consumer p0);

    @objid ("2e831f76-3be2-4b24-9274-9676f9077d85")
    Iterator iterator();

    @objid ("f3fcf718-adaa-499a-8278-395befe36fbe")
    Spliterator spliterator();

}

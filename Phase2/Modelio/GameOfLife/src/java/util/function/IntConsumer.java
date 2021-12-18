package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00744848-d20e-48e5-87dc-e31121adc414")
public interface IntConsumer {
    @objid ("39f2bded-99a2-4775-99dd-65e54342e782")
    void accept(int p0);

    @objid ("a3b117b3-fce6-43ea-a1cb-508e1a7c3aec")
    IntConsumer andThen(IntConsumer p0);

    @objid ("8e45c098-ae80-4ab3-90b0-510287d35120")
    void lambda$andThen$0(IntConsumer p0, int p1);

}

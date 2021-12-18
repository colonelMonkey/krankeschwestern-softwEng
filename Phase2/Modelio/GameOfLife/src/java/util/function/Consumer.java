package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9821e0db-ae51-49db-aec5-51d94f3b25a7")
public interface Consumer {
    @objid ("b4a60fe5-f9b3-4744-92d0-04252afa8630")
    void accept(Object p0);

    @objid ("ae6feea2-6d39-4e16-9177-2247a57346b5")
    Consumer andThen(Consumer p0);

    @objid ("86aa397f-c05c-40fa-a190-1e1ec38b37cf")
    void lambda$andThen$0(Consumer p0, Object p1);

}

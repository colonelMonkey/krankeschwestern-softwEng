package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f1a77c6b-0564-4bc7-8711-2df1620b184d")
public interface LongConsumer {
    @objid ("4979c02a-5c10-4552-a3db-97bbdac42b8b")
    void accept(long p0);

    @objid ("4ac1f82c-10f1-4c77-aff3-9e35dcbcf788")
    LongConsumer andThen(LongConsumer p0);

    @objid ("a7f2da46-9800-4867-9cd2-94a098b24c12")
    void lambda$andThen$0(LongConsumer p0, long p1);

}

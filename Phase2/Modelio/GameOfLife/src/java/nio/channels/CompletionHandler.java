package java.nio.channels;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-1aad-0000-000000000000")
public interface CompletionHandler {
    @objid ("d7b40987-2545-415f-a846-648bcd7b3730")
    void completed(Object p0, Object p1);

    @objid ("4e07a2ed-ce58-441f-a366-9f77a3688ae3")
    void failed(Throwable p0, Object p1);

}

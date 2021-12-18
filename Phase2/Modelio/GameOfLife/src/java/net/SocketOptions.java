package java.net;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e8f-0000-000000000000")
public interface SocketOptions {
    @objid ("11dbaf4e-1c41-4dce-8d0c-13f25e74ad83")
    Object getOption(int p0) throws SocketException;

    @objid ("df9ffaf2-646e-4fa7-87a2-0f7304380280")
    void setOption(int p0, Object p1) throws SocketException;

}

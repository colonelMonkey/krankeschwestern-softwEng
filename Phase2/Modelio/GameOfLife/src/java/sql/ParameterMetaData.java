package java.sql;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e80-0000-000000000000")
public interface ParameterMetaData extends Wrapper {
    @objid ("cff86a94-a380-4324-a5c9-2696af98aedf")
    String getParameterClassName(int p0) throws SQLException;

    @objid ("b3101864-e166-4aaf-a8f4-4d18dc25b5c9")
    int getParameterCount() throws SQLException;

    @objid ("0cb38305-c457-47a6-98ee-2d8552b74d10")
    int getParameterMode(int p0) throws SQLException;

    @objid ("ad83f041-16c0-421c-9c83-0c6be09e6f22")
    int getParameterType(int p0) throws SQLException;

    @objid ("75aedc36-d91a-4b74-93a7-306b138de871")
    String getParameterTypeName(int p0) throws SQLException;

    @objid ("70d6d1d6-0ac0-4b57-9b8d-45c12e9da7c0")
    int getPrecision(int p0) throws SQLException;

    @objid ("cccd5f61-02b8-4ad2-b655-1ab38ce09979")
    int getScale(int p0) throws SQLException;

    @objid ("6817852c-2628-4ab0-b9dc-2be53f933150")
    int isNullable(int p0) throws SQLException;

    @objid ("04d0a10e-46c5-44f1-9a8e-0f20c6ec9e6b")
    boolean isSigned(int p0) throws SQLException;

}

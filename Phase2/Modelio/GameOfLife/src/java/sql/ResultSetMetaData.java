package java.sql;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e77-0000-000000000000")
public interface ResultSetMetaData extends Wrapper {
    @objid ("6dea762d-5028-45bf-b701-c6a932ba4b07")
    String getCatalogName(int p0) throws SQLException;

    @objid ("03609efd-51fd-4762-a858-8e5f7e7734bb")
    String getColumnClassName(int p0) throws SQLException;

    @objid ("5d71b61a-ff15-4667-94db-385329350f20")
    int getColumnCount() throws SQLException;

    @objid ("471b68e6-154c-47e1-b553-361da49c9dab")
    int getColumnDisplaySize(int p0) throws SQLException;

    @objid ("0d973066-5f13-4922-8ad2-e38b7de7832d")
    String getColumnLabel(int p0) throws SQLException;

    @objid ("166a4398-4c69-4348-a5e2-22e45ed6a706")
    String getColumnName(int p0) throws SQLException;

    @objid ("d3bdde79-3dec-4694-817b-81721dd3a004")
    int getColumnType(int p0) throws SQLException;

    @objid ("dda5c2ae-44b4-4fe5-a15c-c099fc6022b1")
    String getColumnTypeName(int p0) throws SQLException;

    @objid ("8e399897-f8bb-43c2-9c81-9d1c44653d26")
    int getPrecision(int p0) throws SQLException;

    @objid ("f7aeada2-ce20-4e49-8db4-455d619e9781")
    int getScale(int p0) throws SQLException;

    @objid ("8ba99af1-60f1-4a53-a941-50ffcbcfb3c9")
    String getSchemaName(int p0) throws SQLException;

    @objid ("e7b3732d-ccf7-4bfe-a610-c332759316d3")
    String getTableName(int p0) throws SQLException;

    @objid ("8b0e096d-f18e-44d7-adc7-4cf53912c5bf")
    boolean isAutoIncrement(int p0) throws SQLException;

    @objid ("fd0d0c15-a233-491a-8b95-90bba34f7b35")
    boolean isCaseSensitive(int p0) throws SQLException;

    @objid ("c5eafc91-b8dc-404d-944e-3befe065e239")
    boolean isCurrency(int p0) throws SQLException;

    @objid ("37187f74-0de2-46fd-8a77-5ac04f2b3608")
    boolean isDefinitelyWritable(int p0) throws SQLException;

    @objid ("8191adf0-60ee-4aa1-bf0d-431b219c4846")
    int isNullable(int p0) throws SQLException;

    @objid ("629eea8a-4e47-485c-bff2-b47852e9549a")
    boolean isReadOnly(int p0) throws SQLException;

    @objid ("f69e124b-330b-4ea4-9817-50bed13cb0b3")
    boolean isSearchable(int p0) throws SQLException;

    @objid ("65c37306-57ee-4dd2-8fd0-883951614f61")
    boolean isSigned(int p0) throws SQLException;

    @objid ("c6419f17-0e9f-4475-b5b8-848059e9adb6")
    boolean isWritable(int p0) throws SQLException;

}

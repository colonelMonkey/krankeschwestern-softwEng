package java.sql;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2e76-0000-000000000000")
public interface DatabaseMetaData extends Wrapper {
    @objid ("60274900-7602-4453-96d9-f0596b8d4a7f")
    boolean allProceduresAreCallable() throws SQLException;

    @objid ("1925a1c9-a598-4384-8e46-d859c80fb649")
    boolean allTablesAreSelectable() throws SQLException;

    @objid ("f815cf92-b5da-4b52-8bae-7cc32a5c7c2a")
    boolean autoCommitFailureClosesAllResultSets() throws SQLException;

    @objid ("21347e43-b72a-42af-9717-a398b3e25299")
    boolean dataDefinitionCausesTransactionCommit() throws SQLException;

    @objid ("8191efd5-3fc1-41b4-b076-c9ad9c4a9ad8")
    boolean dataDefinitionIgnoredInTransactions() throws SQLException;

    @objid ("e43f338e-a265-4f2f-9719-bb141b6053b0")
    boolean deletesAreDetected(int p0) throws SQLException;

    @objid ("367aa165-d2c0-4510-a1ee-cb374a9b2878")
    boolean doesMaxRowSizeIncludeBlobs() throws SQLException;

    @objid ("7ab56ecc-740a-4697-9c5a-4494d5e9aae4")
    boolean generatedKeyAlwaysReturned() throws SQLException;

    @objid ("e0339f36-4a85-4b09-9fd9-d2c3eb64a5f1")
    ResultSet getAttributes(String p0, String p1, String p2, String p3) throws SQLException;

    @objid ("2fe94958-c936-4d2d-bbb5-147a1626c6e7")
    ResultSet getBestRowIdentifier(String p0, String p1, String p2, int p3, boolean p4) throws SQLException;

    @objid ("595d8ae3-3da2-4f1f-b3bb-31897cb2aee9")
    String getCatalogSeparator() throws SQLException;

    @objid ("0900460a-8e65-4623-abba-b7262ba82b99")
    String getCatalogTerm() throws SQLException;

    @objid ("1afd073e-13b9-44db-8dd2-f1c8270d6ef9")
    ResultSet getCatalogs() throws SQLException;

    @objid ("05d5f9f4-266d-4205-9688-cb1014f88cab")
    ResultSet getClientInfoProperties() throws SQLException;

    @objid ("5b5f1b90-1c63-4a04-8341-bb86a250dcc9")
    ResultSet getColumnPrivileges(String p0, String p1, String p2, String p3) throws SQLException;

    @objid ("ff153054-0663-4563-b03c-3e06586b431b")
    ResultSet getColumns(String p0, String p1, String p2, String p3) throws SQLException;

    @objid ("5035dbbc-5868-4c74-b915-b35d7ee3e0a2")
    Connection getConnection() throws SQLException;

    @objid ("71f79ac1-c5bd-4d83-959c-628962d1c42e")
    ResultSet getCrossReference(String p0, String p1, String p2, String p3, String p4, String p5) throws SQLException;

    @objid ("0b30386d-4648-48c0-b51f-534857e03e81")
    int getDatabaseMajorVersion() throws SQLException;

    @objid ("c09c6105-9dc9-449d-9848-9524bfc7beee")
    int getDatabaseMinorVersion() throws SQLException;

    @objid ("3ac44884-59c2-451f-989a-610f722ffff6")
    String getDatabaseProductName() throws SQLException;

    @objid ("ec07d908-4745-4a45-9b43-23b31c5bfe39")
    String getDatabaseProductVersion() throws SQLException;

    @objid ("7031cd40-f6e8-4954-9f01-b46227b348b6")
    int getDefaultTransactionIsolation() throws SQLException;

    @objid ("48ed2b2c-2393-4437-8440-d829160c3813")
    int getDriverMajorVersion();

    @objid ("3dd785fe-ab55-4c6f-93f8-f1687d31136a")
    int getDriverMinorVersion();

    @objid ("a4a5f16b-ad86-4255-91a9-496e0d035a8f")
    String getDriverName() throws SQLException;

    @objid ("d8d438a0-f5c5-4457-8f6c-be344a7b47f5")
    String getDriverVersion() throws SQLException;

    @objid ("59431dd3-562a-49f1-8123-f045216ce108")
    ResultSet getExportedKeys(String p0, String p1, String p2) throws SQLException;

    @objid ("6a14c4b2-5b9f-4288-898d-db93e6a51cf1")
    String getExtraNameCharacters() throws SQLException;

    @objid ("d973dc91-1811-4201-a947-04602150a275")
    ResultSet getFunctionColumns(String p0, String p1, String p2, String p3) throws SQLException;

    @objid ("e5b858d7-c2da-4c1c-9ab8-7bbc0db1e62d")
    ResultSet getFunctions(String p0, String p1, String p2) throws SQLException;

    @objid ("dc456a36-79d2-472f-90ad-d4da09136f56")
    String getIdentifierQuoteString() throws SQLException;

    @objid ("0d09d273-eabb-44a8-81e6-083a8abccd05")
    ResultSet getImportedKeys(String p0, String p1, String p2) throws SQLException;

    @objid ("a308ef9b-524e-4fc4-afa0-7781676cc6f5")
    ResultSet getIndexInfo(String p0, String p1, String p2, boolean p3, boolean p4) throws SQLException;

    @objid ("352df0ee-4e5b-4124-861a-3288e8ebfe61")
    int getJDBCMajorVersion() throws SQLException;

    @objid ("2e325fd3-e8ed-43fe-8531-1fc11d6ff8fe")
    int getJDBCMinorVersion() throws SQLException;

    @objid ("ce8af057-3c6e-4b3f-9e39-bb13e59715df")
    int getMaxBinaryLiteralLength() throws SQLException;

    @objid ("975c953d-2c4a-4bd7-a9a1-dad15e4a37b4")
    int getMaxCatalogNameLength() throws SQLException;

    @objid ("227e18e2-cabb-4409-ac6d-d3abe1d9f7d7")
    int getMaxCharLiteralLength() throws SQLException;

    @objid ("858e75d1-3767-438a-8fbe-ffc27fdeafb2")
    int getMaxColumnNameLength() throws SQLException;

    @objid ("f8e54949-74e3-43f9-b779-4614ad95194a")
    int getMaxColumnsInGroupBy() throws SQLException;

    @objid ("507e6c01-cd73-4d39-a071-30b6c0218c03")
    int getMaxColumnsInIndex() throws SQLException;

    @objid ("d218dd9e-7340-4c8f-a9e6-2a8b6635752c")
    int getMaxColumnsInOrderBy() throws SQLException;

    @objid ("d459d4b5-5fd0-432d-9977-e6d19e7971c7")
    int getMaxColumnsInSelect() throws SQLException;

    @objid ("9c62fed5-d807-49cf-abe0-8845c89144be")
    int getMaxColumnsInTable() throws SQLException;

    @objid ("d95be661-1c48-492b-a301-3e670bbd43c7")
    int getMaxConnections() throws SQLException;

    @objid ("ee45ac76-b220-4d23-987e-059d0ce7a184")
    int getMaxCursorNameLength() throws SQLException;

    @objid ("a26d8bd1-2c30-4b6c-9237-6dbd17794b93")
    int getMaxIndexLength() throws SQLException;

    @objid ("894fc847-d01d-4cb0-88f3-91ea543d0507")
    long getMaxLogicalLobSize() throws SQLException;

    @objid ("ff0d064e-6dc4-4171-bb09-62a7943bada6")
    int getMaxProcedureNameLength() throws SQLException;

    @objid ("f3f6b71b-3885-4ac1-8050-9150e506ee38")
    int getMaxRowSize() throws SQLException;

    @objid ("ee970838-f813-4b7b-adb3-d6094f454586")
    int getMaxSchemaNameLength() throws SQLException;

    @objid ("c5394b21-12c7-4292-b1c0-e54cb192a2d2")
    int getMaxStatementLength() throws SQLException;

    @objid ("9f13a9b0-2ca5-4aa5-a89e-1fe84219b3d3")
    int getMaxStatements() throws SQLException;

    @objid ("c09b44b0-7453-4037-86da-7eb4857ab942")
    int getMaxTableNameLength() throws SQLException;

    @objid ("b8ea3529-88fb-4bed-9571-d0bd06fdf1f0")
    int getMaxTablesInSelect() throws SQLException;

    @objid ("ea10d5ca-04c4-463f-b1bc-340316fdeef1")
    int getMaxUserNameLength() throws SQLException;

    @objid ("b2b1f46f-0409-4ba4-8184-8d2a8e7b6d79")
    String getNumericFunctions() throws SQLException;

    @objid ("f9b1e9a1-8f27-4e30-beeb-95b2e48b5476")
    ResultSet getPrimaryKeys(String p0, String p1, String p2) throws SQLException;

    @objid ("d98a0186-e243-44c7-bceb-241a77fdbe2e")
    ResultSet getProcedureColumns(String p0, String p1, String p2, String p3) throws SQLException;

    @objid ("aa0b4ba5-1d90-4c8a-b29d-eeee0b69b31c")
    String getProcedureTerm() throws SQLException;

    @objid ("98c6d4d5-fe00-4a7a-9f86-7b55c9c77147")
    ResultSet getProcedures(String p0, String p1, String p2) throws SQLException;

    @objid ("a4d984d8-a1e9-4e90-8385-f794eaf33c2c")
    ResultSet getPseudoColumns(String p0, String p1, String p2, String p3) throws SQLException;

    @objid ("a045738b-dc68-4063-8ef0-c2112f8c57a8")
    int getResultSetHoldability() throws SQLException;

    @objid ("f4e1a272-9831-4584-b82a-b1dcf4b324cb")
    RowIdLifetime getRowIdLifetime() throws SQLException;

    @objid ("c9df0ae5-97fc-4d2f-9edf-3f04b41ca51a")
    String getSQLKeywords() throws SQLException;

    @objid ("fe4f4106-714e-419e-8717-d5b6bf4e2f28")
    int getSQLStateType() throws SQLException;

    @objid ("3d423270-0197-4f83-afbf-3dfd32c4a278")
    String getSchemaTerm() throws SQLException;

    @objid ("4164727b-3fae-4f7c-a422-6b55654788c2")
    ResultSet getSchemas(String p0, String p1) throws SQLException;

    @objid ("250ebf2c-922c-4939-a5ee-914f0e88438e")
    ResultSet getSchemas() throws SQLException;

    @objid ("658c434a-daf1-47b5-ab5c-423aba1ccd9a")
    String getSearchStringEscape() throws SQLException;

    @objid ("75090499-a502-4740-9717-3994137cd1a5")
    String getStringFunctions() throws SQLException;

    @objid ("cfcaa2db-6951-4b55-a7c8-c1e10314ada7")
    ResultSet getSuperTables(String p0, String p1, String p2) throws SQLException;

    @objid ("e26d5475-3643-4c50-bdc2-87a044bc7e7a")
    ResultSet getSuperTypes(String p0, String p1, String p2) throws SQLException;

    @objid ("12075592-50c1-4a6d-8852-96f6d45100fe")
    String getSystemFunctions() throws SQLException;

    @objid ("941ac45c-2dcc-45ec-a302-cb0fce31b735")
    ResultSet getTablePrivileges(String p0, String p1, String p2) throws SQLException;

    @objid ("34e6df10-0661-4a9b-9583-8583a2db08eb")
    ResultSet getTableTypes() throws SQLException;

    @objid ("c9eed196-433e-4e90-baf2-dc86e4edd810")
    ResultSet getTables(String p0, String p1, String p2, List<String> p3) throws SQLException;

    @objid ("fa9a5699-bce1-4003-a9da-cc0a9d6e4ddf")
    String getTimeDateFunctions() throws SQLException;

    @objid ("e2dcf46b-7a45-457d-8fe9-81f6bfca1935")
    ResultSet getTypeInfo() throws SQLException;

    @objid ("1d09d5f6-4e27-4e8f-b723-ba43011ddb2a")
    ResultSet getUDTs(String p0, String p1, String p2, List<Integer> p3) throws SQLException;

    @objid ("46a06637-3def-402d-a5bb-ba0a23f0caa7")
    String getURL() throws SQLException;

    @objid ("e1b028dc-9a91-4672-9fec-dd499ec996b1")
    String getUserName() throws SQLException;

    @objid ("95fdc58f-8bf1-45b1-bc2c-069f53e99ea6")
    ResultSet getVersionColumns(String p0, String p1, String p2) throws SQLException;

    @objid ("6ae2ef5d-5cc8-4ab6-a400-5d8c3579dc45")
    boolean insertsAreDetected(int p0) throws SQLException;

    @objid ("6a5dbc3a-7f4d-495a-8f63-643001f8ece5")
    boolean isCatalogAtStart() throws SQLException;

    @objid ("09c0b9e0-7d6c-4196-aa28-b7d18a5e053a")
    boolean isReadOnly() throws SQLException;

    @objid ("6a6603ec-f17b-4b0b-a854-0d99c9fef0ee")
    boolean locatorsUpdateCopy() throws SQLException;

    @objid ("cf026867-c6a6-4bdc-a40c-e0cbd557f0ec")
    boolean nullPlusNonNullIsNull() throws SQLException;

    @objid ("920d75f7-8ca3-43a4-af5b-f0177f45feca")
    boolean nullsAreSortedAtEnd() throws SQLException;

    @objid ("9c49fa8e-7897-471e-b41f-13dfeb631462")
    boolean nullsAreSortedAtStart() throws SQLException;

    @objid ("af9e0014-fe25-49f3-9fb1-6fdac89f954f")
    boolean nullsAreSortedHigh() throws SQLException;

    @objid ("c702c9a5-1faa-4e24-bcf6-01334e0187db")
    boolean nullsAreSortedLow() throws SQLException;

    @objid ("a4210ced-4798-401f-a26d-b8ab1b92b159")
    boolean othersDeletesAreVisible(int p0) throws SQLException;

    @objid ("0ed7aabb-8adc-459f-9de6-4300452e6935")
    boolean othersInsertsAreVisible(int p0) throws SQLException;

    @objid ("5212abad-3b55-4783-97a2-b8652d03c854")
    boolean othersUpdatesAreVisible(int p0) throws SQLException;

    @objid ("619aab4f-5066-4691-9514-a6d4a3880365")
    boolean ownDeletesAreVisible(int p0) throws SQLException;

    @objid ("191ac5f7-ffab-430a-a89b-e68930e49317")
    boolean ownInsertsAreVisible(int p0) throws SQLException;

    @objid ("05741bd8-96c3-476b-90cb-e22c879186c4")
    boolean ownUpdatesAreVisible(int p0) throws SQLException;

    @objid ("64f03d39-3fcc-4fd5-bc9e-18fc3aa4c4a5")
    boolean storesLowerCaseIdentifiers() throws SQLException;

    @objid ("b5a96717-f468-4e34-9fd5-f777a5570906")
    boolean storesLowerCaseQuotedIdentifiers() throws SQLException;

    @objid ("f4eb6d80-ff42-4527-b1bf-5aebd3dcff6b")
    boolean storesMixedCaseIdentifiers() throws SQLException;

    @objid ("39033dad-5231-4ccc-aab2-405723689ef1")
    boolean storesMixedCaseQuotedIdentifiers() throws SQLException;

    @objid ("5b0fb15f-df4d-419a-8f10-6853409e0c2c")
    boolean storesUpperCaseIdentifiers() throws SQLException;

    @objid ("8d971d4f-1c4c-40c5-aa1b-73896619775b")
    boolean storesUpperCaseQuotedIdentifiers() throws SQLException;

    @objid ("4a12033e-fc21-4a2e-a8d8-c57e0089cd94")
    boolean supportsANSI92EntryLevelSQL() throws SQLException;

    @objid ("effdecc3-a755-41bb-a1e9-88692dcdb644")
    boolean supportsANSI92FullSQL() throws SQLException;

    @objid ("39f06510-90e7-4f78-91d1-b94e509d77c4")
    boolean supportsANSI92IntermediateSQL() throws SQLException;

    @objid ("ac604a50-b78a-4f5b-9728-943c72b98ab3")
    boolean supportsAlterTableWithAddColumn() throws SQLException;

    @objid ("595ec2e5-5347-4df0-9a77-d4e5b0236ae5")
    boolean supportsAlterTableWithDropColumn() throws SQLException;

    @objid ("42c4cc8f-8e8c-49d5-bf7b-7fad437dab9c")
    boolean supportsBatchUpdates() throws SQLException;

    @objid ("12aa494f-4939-43b3-9c49-731a623ab580")
    boolean supportsCatalogsInDataManipulation() throws SQLException;

    @objid ("6da7550d-ce59-4b4e-b524-30d39c73916a")
    boolean supportsCatalogsInIndexDefinitions() throws SQLException;

    @objid ("933c3b03-6798-435c-80b5-d78a4eea0b39")
    boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException;

    @objid ("d41c55a3-6ebe-4632-b580-93723bbcc500")
    boolean supportsCatalogsInProcedureCalls() throws SQLException;

    @objid ("c790e890-ac7a-4acd-bff9-0ab88ed4776e")
    boolean supportsCatalogsInTableDefinitions() throws SQLException;

    @objid ("3287ae81-d004-4377-80cf-e93ec129b0c4")
    boolean supportsColumnAliasing() throws SQLException;

    @objid ("3662bb62-b474-4174-99d2-9526187eb21e")
    boolean supportsConvert(int p0, int p1) throws SQLException;

    @objid ("a0bbe677-56c1-418e-8fe9-ae5108d0b8e2")
    boolean supportsConvert() throws SQLException;

    @objid ("8c06a23a-e860-43df-823a-c751523d3ab7")
    boolean supportsCoreSQLGrammar() throws SQLException;

    @objid ("eb0f9571-4c99-4122-888e-eea933d89f96")
    boolean supportsCorrelatedSubqueries() throws SQLException;

    @objid ("4af27c11-f4ed-4c6d-99cf-dbf1f14c3d61")
    boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException;

    @objid ("15de5c51-8b93-4f65-b1d7-e10fb3c77d45")
    boolean supportsDataManipulationTransactionsOnly() throws SQLException;

    @objid ("3fdd7edb-b348-4a9e-abfa-0648fa7bc776")
    boolean supportsDifferentTableCorrelationNames() throws SQLException;

    @objid ("5b52e02f-9fda-47aa-957a-e3c2d987028a")
    boolean supportsExpressionsInOrderBy() throws SQLException;

    @objid ("49bc07dd-a37f-4b8e-b9ff-d633c5a24bd9")
    boolean supportsExtendedSQLGrammar() throws SQLException;

    @objid ("f7517205-a7a2-41aa-a1c5-8030a6c858fd")
    boolean supportsFullOuterJoins() throws SQLException;

    @objid ("327ea1b9-6383-482d-be1f-78bc6b78fb30")
    boolean supportsGetGeneratedKeys() throws SQLException;

    @objid ("5e0c3173-17b2-46cb-bbf9-784bc4739f25")
    boolean supportsGroupBy() throws SQLException;

    @objid ("647fcd21-04ab-4690-9002-aa9eb332cc75")
    boolean supportsGroupByBeyondSelect() throws SQLException;

    @objid ("dabb2d53-697b-4999-948d-313af130bef2")
    boolean supportsGroupByUnrelated() throws SQLException;

    @objid ("5ab9c8d2-9bd5-408a-b389-3694fd63100b")
    boolean supportsIntegrityEnhancementFacility() throws SQLException;

    @objid ("5a3e152f-2819-4f3e-a3f5-d3878fbaeb9b")
    boolean supportsLikeEscapeClause() throws SQLException;

    @objid ("6e686767-0741-4809-9acb-3b41a6b5e7f4")
    boolean supportsLimitedOuterJoins() throws SQLException;

    @objid ("dc2c40d7-405e-431c-a34a-321c92e1d60c")
    boolean supportsMinimumSQLGrammar() throws SQLException;

    @objid ("ad0be553-ed94-4354-a69e-294e175f0e09")
    boolean supportsMixedCaseIdentifiers() throws SQLException;

    @objid ("f7b6f166-2ec3-42db-9aea-4a58209ef496")
    boolean supportsMixedCaseQuotedIdentifiers() throws SQLException;

    @objid ("b5c224eb-062f-4c99-968e-a39f8c83963c")
    boolean supportsMultipleOpenResults() throws SQLException;

    @objid ("55a1b57d-1e2f-4dc5-97b9-6ac3807597cc")
    boolean supportsMultipleResultSets() throws SQLException;

    @objid ("7aefb8ee-4360-4cb5-8783-eaeca6197e62")
    boolean supportsMultipleTransactions() throws SQLException;

    @objid ("4625f793-db67-4a92-9046-f8fadab0cf6a")
    boolean supportsNamedParameters() throws SQLException;

    @objid ("9b25d0bf-0742-46f6-9f4a-35f298d56922")
    boolean supportsNonNullableColumns() throws SQLException;

    @objid ("2d63a361-8bb8-4c3e-86e8-403f260375c7")
    boolean supportsOpenCursorsAcrossCommit() throws SQLException;

    @objid ("2d51a96d-c659-46b1-90e0-b2f6586b777b")
    boolean supportsOpenCursorsAcrossRollback() throws SQLException;

    @objid ("342c063f-cd7d-43de-993c-816ebd4de99d")
    boolean supportsOpenStatementsAcrossCommit() throws SQLException;

    @objid ("93aefd93-1081-46ea-91bf-3791221538f6")
    boolean supportsOpenStatementsAcrossRollback() throws SQLException;

    @objid ("0d519dd7-f7c7-44ba-81f4-0b3bed7556df")
    boolean supportsOrderByUnrelated() throws SQLException;

    @objid ("1e535506-ebf6-4a55-aad0-e1f2516e7f72")
    boolean supportsOuterJoins() throws SQLException;

    @objid ("5626355d-2496-48fb-9113-a4865e060022")
    boolean supportsPositionedDelete() throws SQLException;

    @objid ("fb33b010-3edd-4ce6-be64-e2981eaf7b5a")
    boolean supportsPositionedUpdate() throws SQLException;

    @objid ("ca690aeb-f8f4-44b1-9d7d-ed7631e338a5")
    boolean supportsRefCursors() throws SQLException;

    @objid ("ba2b1de1-7f4c-4ec1-a478-9b0b18dc95a7")
    boolean supportsResultSetConcurrency(int p0, int p1) throws SQLException;

    @objid ("6661ad11-d9e1-4416-bacb-7b766ff1a930")
    boolean supportsResultSetHoldability(int p0) throws SQLException;

    @objid ("a77801d8-3099-49b1-8aee-deaf2e8d0946")
    boolean supportsResultSetType(int p0) throws SQLException;

    @objid ("2b4fc16f-27ff-4da6-8aac-7db54714d3c7")
    boolean supportsSavepoints() throws SQLException;

    @objid ("170beb95-c1d4-49dd-8671-9d0d51c07ee9")
    boolean supportsSchemasInDataManipulation() throws SQLException;

    @objid ("bba5e703-c3b6-4744-96a4-8dbfd7822135")
    boolean supportsSchemasInIndexDefinitions() throws SQLException;

    @objid ("0d37f2a7-c641-4c17-a9a0-8f00f759da1e")
    boolean supportsSchemasInPrivilegeDefinitions() throws SQLException;

    @objid ("37893d9a-4eb7-4689-840f-6c2a5401f5c2")
    boolean supportsSchemasInProcedureCalls() throws SQLException;

    @objid ("c15f486e-5765-4c69-bc29-ab5354bacd2d")
    boolean supportsSchemasInTableDefinitions() throws SQLException;

    @objid ("070f76a1-9b1a-45b7-83f2-60223634ecd5")
    boolean supportsSelectForUpdate() throws SQLException;

    @objid ("d0069b7a-c657-4398-99ba-6945e2a544a0")
    boolean supportsStatementPooling() throws SQLException;

    @objid ("d503b92d-860d-4048-ae21-209364db2b04")
    boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException;

    @objid ("2ae91e95-1c51-4fbf-a8f7-08d10cc39790")
    boolean supportsStoredProcedures() throws SQLException;

    @objid ("6e720e18-b634-4a72-9888-c2844cc8348d")
    boolean supportsSubqueriesInComparisons() throws SQLException;

    @objid ("493afbba-61bf-4b4c-be5b-282eb0fea67c")
    boolean supportsSubqueriesInExists() throws SQLException;

    @objid ("6dce72d3-30fa-42ce-a9f6-1c8b53a6f75b")
    boolean supportsSubqueriesInIns() throws SQLException;

    @objid ("7157667e-b8a4-4e4c-8cd1-a7f06da7fbbb")
    boolean supportsSubqueriesInQuantifieds() throws SQLException;

    @objid ("ba2bf069-e943-4337-a3b3-c1f4bd7bac7d")
    boolean supportsTableCorrelationNames() throws SQLException;

    @objid ("46437ffa-5b76-43e8-b782-c11c71fde033")
    boolean supportsTransactionIsolationLevel(int p0) throws SQLException;

    @objid ("289062cb-ec2f-44ac-910e-94bd9122bfeb")
    boolean supportsTransactions() throws SQLException;

    @objid ("342e3f86-947f-4e83-a9dd-d909ea4c02bc")
    boolean supportsUnion() throws SQLException;

    @objid ("57f27f26-9a1a-42a8-8c2b-c6a8ba318394")
    boolean supportsUnionAll() throws SQLException;

    @objid ("40f6ee2a-990f-4cf4-ae1d-a85ef9367377")
    boolean updatesAreDetected(int p0) throws SQLException;

    @objid ("86e6650a-914f-4da2-b855-842293d9ca8a")
    boolean usesLocalFilePerTable() throws SQLException;

    @objid ("e28b35f7-b231-4d04-80bb-6ed8e54579c2")
    boolean usesLocalFiles() throws SQLException;

}

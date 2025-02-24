/*
 * Carbon
 * Connect external data to LLMs, no matter the source.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.carbonai.client.api;

import com.konfigthis.carbonai.client.ApiException;
import com.konfigthis.carbonai.client.ApiClient;
import com.konfigthis.carbonai.client.ApiException;
import com.konfigthis.carbonai.client.Configuration;
import com.konfigthis.carbonai.client.model.ConnectDataSourceInput;
import com.konfigthis.carbonai.client.model.ConnectDataSourceResponse;
import com.konfigthis.carbonai.client.model.DataSourceType;
import com.konfigthis.carbonai.client.model.EmbeddingGenerators;
import com.konfigthis.carbonai.client.model.EmbeddingGeneratorsNullable;
import com.konfigthis.carbonai.client.model.ExternalSourceItemsOrderBy;
import com.konfigthis.carbonai.client.model.FileSyncConfigNullable;
import com.konfigthis.carbonai.client.model.FreshDeskConnectRequest;
import com.konfigthis.carbonai.client.model.GenericSuccessResponse;
import com.konfigthis.carbonai.client.model.GitbookConnectRequest;
import com.konfigthis.carbonai.client.model.GitbookSyncRequest;
import com.konfigthis.carbonai.client.model.GithubConnectRequest;
import com.konfigthis.carbonai.client.model.GithubFetchReposRequest;
import com.konfigthis.carbonai.client.model.GmailSyncInput;
import com.konfigthis.carbonai.client.model.ListDataSourceItemsRequest;
import com.konfigthis.carbonai.client.model.ListDataSourceItemsResponse;
import com.konfigthis.carbonai.client.model.ListItemsFiltersNullable;
import com.konfigthis.carbonai.client.model.ListRequest;
import com.konfigthis.carbonai.client.model.ListResponse;
import com.konfigthis.carbonai.client.model.OANSCZGF;
import com.konfigthis.carbonai.client.model.OAuthURLRequest;
import com.konfigthis.carbonai.client.model.OrderDirV2;
import com.konfigthis.carbonai.client.model.OrganizationUserDataSourceAPI;
import com.konfigthis.carbonai.client.model.OuthURLResponse;
import com.konfigthis.carbonai.client.model.OutlookSyncInput;
import com.konfigthis.carbonai.client.model.Pagination;
import com.konfigthis.carbonai.client.model.RSSFeedInput;
import com.konfigthis.carbonai.client.model.S3AuthRequest;
import com.konfigthis.carbonai.client.model.S3FileSyncInput;
import com.konfigthis.carbonai.client.model.S3GetFileInput;
import com.konfigthis.carbonai.client.model.SyncDirectoryRequest;
import com.konfigthis.carbonai.client.model.SyncFilesRequest;
import com.konfigthis.carbonai.client.model.SyncOptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationsApi
 */
@Disabled
public class IntegrationsApiTest {

    private static IntegrationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IntegrationsApi(apiClient);
    }

    /**
     * Connect Data Source
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void connectDataSourceTest() throws ApiException {
        OANSCZGF authentication = null;
        SyncOptions syncOptions = null;
        ConnectDataSourceResponse response = api.connectDataSource(authentication)
                .syncOptions(syncOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Freshdesk Connect
     *
     * Refer this article to obtain an API key https://support.freshdesk.com/en/support/solutions/articles/215517. Make sure that your API key has the permission to read solutions from your account and you are on a &lt;b&gt;paid&lt;/b&gt; plan. Once you have an API key, you can make a request to this endpoint along with your freshdesk domain. This will  trigger an automatic sync of the articles in your \&quot;solutions\&quot; tab. Additional parameters below can be used to associate  data with the synced articles or modify the sync behavior.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void connectFreshdeskTest() throws ApiException {
        String domain = null;
        String apiKey = null;
        Object tags = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGeneratorsNullable embeddingModel = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        Boolean syncFilesOnConnection = null;
        String requestId = null;
        Boolean syncSourceItems = null;
        FileSyncConfigNullable fileSyncConfig = null;
        GenericSuccessResponse response = api.connectFreshdesk(domain, apiKey)
                .tags(tags)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .syncFilesOnConnection(syncFilesOnConnection)
                .requestId(requestId)
                .syncSourceItems(syncSourceItems)
                .fileSyncConfig(fileSyncConfig)
                .execute();
        // TODO: test validations
    }

    /**
     * Gitbook Connect
     *
     * You will need an access token to connect your Gitbook account. Note that the permissions will be defined by the user  generating access token so make sure you have the permission to access spaces you will be syncing.  Refer this article for more details https://developer.gitbook.com/gitbook-api/authentication. Additionally, you need to specify the name of organization you will be syncing data from.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void connectGitbookTest() throws ApiException {
        String organization = null;
        String accessToken = null;
        Object tags = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGenerators embeddingModel = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        Boolean syncFilesOnConnection = null;
        String requestId = null;
        Boolean syncSourceItems = null;
        GenericSuccessResponse response = api.connectGitbook(organization, accessToken)
                .tags(tags)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .syncFilesOnConnection(syncFilesOnConnection)
                .requestId(requestId)
                .syncSourceItems(syncSourceItems)
                .execute();
        // TODO: test validations
    }

    /**
     * S3 Auth
     *
     * Create a new IAM user with permissions to: &lt;ol&gt; &lt;li&gt;List all buckets.&lt;/li&gt; &lt;li&gt;Read from the specific buckets and objects to sync with Carbon. Ensure any future buckets or objects carry  the same permissions.&lt;/li&gt; &lt;/ol&gt; Once created, generate an access key for this user and share the credentials with us. We recommend testing this key beforehand.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAwsIamUserTest() throws ApiException {
        String accessKey = null;
        String accessKeySecret = null;
        Boolean syncSourceItems = null;
        OrganizationUserDataSourceAPI response = api.createAwsIamUser(accessKey, accessKeySecret)
                .syncSourceItems(syncSourceItems)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Oauth Url
     *
     * This endpoint can be used to generate the following URLs - An OAuth URL for OAuth based connectors - A file syncing URL which skips the OAuth flow if the user already has a valid access token and takes them to the success state.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOauthUrlTest() throws ApiException {
        DataSourceType service = null;
        Object tags = null;
        String scope = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGeneratorsNullable embeddingModel = null;
        String zendeskSubdomain = null;
        String microsoftTenant = null;
        String sharepointSiteName = null;
        String confluenceSubdomain = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        Integer maxItemsPerChunk = null;
        String salesforceDomain = null;
        Boolean syncFilesOnConnection = null;
        Boolean setPageAsBoundary = null;
        Integer dataSourceId = null;
        Boolean connectingNewAccount = null;
        String requestId = null;
        Boolean useOcr = null;
        Boolean parsePdfTablesWithOcr = null;
        Boolean enableFilePicker = null;
        Boolean syncSourceItems = null;
        Boolean incrementalSync = null;
        FileSyncConfigNullable fileSyncConfig = null;
        OuthURLResponse response = api.getOauthUrl(service)
                .tags(tags)
                .scope(scope)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .zendeskSubdomain(zendeskSubdomain)
                .microsoftTenant(microsoftTenant)
                .sharepointSiteName(sharepointSiteName)
                .confluenceSubdomain(confluenceSubdomain)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .maxItemsPerChunk(maxItemsPerChunk)
                .salesforceDomain(salesforceDomain)
                .syncFilesOnConnection(syncFilesOnConnection)
                .setPageAsBoundary(setPageAsBoundary)
                .dataSourceId(dataSourceId)
                .connectingNewAccount(connectingNewAccount)
                .requestId(requestId)
                .useOcr(useOcr)
                .parsePdfTablesWithOcr(parsePdfTablesWithOcr)
                .enableFilePicker(enableFilePicker)
                .syncSourceItems(syncSourceItems)
                .incrementalSync(incrementalSync)
                .fileSyncConfig(fileSyncConfig)
                .execute();
        // TODO: test validations
    }

    /**
     * Confluence List
     *
     * To begin listing a user&#39;s Confluence pages, at least a &#x60;data_source_id&#x60; of a connected Confluence account must be specified. This base request returns a list of root pages for every space the user has access to in a Confluence instance. To traverse further down the user&#39;s page directory, additional requests to this endpoint can be made with the same &#x60;data_source_id&#x60; and with &#x60;parent_id&#x60; set to the id of page from a previous request. For convenience, the &#x60;has_children&#x60; property in each directory item in the response list will flag which pages will return non-empty lists of pages when set as the &#x60;parent_id&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listConfluencePagesTest() throws ApiException {
        Integer dataSourceId = null;
        String parentId = null;
        ListResponse response = api.listConfluencePages(dataSourceId)
                .parentId(parentId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Data Source Items
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDataSourceItemsTest() throws ApiException {
        Integer dataSourceId = null;
        String parentId = null;
        ListItemsFiltersNullable filters = null;
        Pagination pagination = null;
        ExternalSourceItemsOrderBy orderBy = null;
        OrderDirV2 orderDir = null;
        ListDataSourceItemsResponse response = api.listDataSourceItems(dataSourceId)
                .parentId(parentId)
                .filters(filters)
                .pagination(pagination)
                .orderBy(orderBy)
                .orderDir(orderDir)
                .execute();
        // TODO: test validations
    }

    /**
     * Outlook Folders
     *
     * After connecting your Outlook account, you can use this endpoint to list all of your folders on outlook. This includes  both system folders like \&quot;inbox\&quot; and user created folders.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFoldersTest() throws ApiException {
        Integer dataSourceId = null;
        Object response = api.listFolders()
                .dataSourceId(dataSourceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Gitbook Spaces
     *
     * After connecting your Gitbook account, you can use this endpoint to list all of your spaces under current organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listGitbookSpacesTest() throws ApiException {
        Integer dataSourceId = null;
        Object response = api.listGitbookSpaces(dataSourceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Gmail Labels
     *
     * After connecting your Gmail account, you can use this endpoint to list all of your labels. User created labels will have the type \&quot;user\&quot; and Gmail&#39;s default labels will have the type \&quot;system\&quot;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLabelsTest() throws ApiException {
        Integer dataSourceId = null;
        Object response = api.listLabels()
                .dataSourceId(dataSourceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Outlook Categories
     *
     * After connecting your Outlook account, you can use this endpoint to list all of your categories on outlook. We currently support listing up to 250 categories.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listOutlookCategoriesTest() throws ApiException {
        Integer dataSourceId = null;
        Object response = api.listOutlookCategories()
                .dataSourceId(dataSourceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Github List Repos
     *
     * Once you have connected your GitHub account, you can use this endpoint to list the      repositories your account has access to. You can use a data source ID or username to fetch from a specific account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listReposTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        Integer dataSourceId = null;
        Object response = api.listRepos()
                .perPage(perPage)
                .page(page)
                .dataSourceId(dataSourceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Confluence Sync
     *
     * After listing pages in a user&#39;s Confluence account, the set of selected page &#x60;ids&#x60; and the connected account&#39;s &#x60;data_source_id&#x60; can be passed into this endpoint to sync them into Carbon. Additional parameters listed below can be used to associate data to the selected pages or alter the behavior of the sync.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncConfluenceTest() throws ApiException {
        Integer dataSourceId = null;
        List<Object> ids = null;
        Object tags = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGeneratorsNullable embeddingModel = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        Integer maxItemsPerChunk = null;
        Boolean setPageAsBoundary = null;
        String requestId = null;
        Boolean useOcr = null;
        Boolean parsePdfTablesWithOcr = null;
        Boolean incrementalSync = null;
        FileSyncConfigNullable fileSyncConfig = null;
        GenericSuccessResponse response = api.syncConfluence(dataSourceId, ids)
                .tags(tags)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .maxItemsPerChunk(maxItemsPerChunk)
                .setPageAsBoundary(setPageAsBoundary)
                .requestId(requestId)
                .useOcr(useOcr)
                .parsePdfTablesWithOcr(parsePdfTablesWithOcr)
                .incrementalSync(incrementalSync)
                .fileSyncConfig(fileSyncConfig)
                .execute();
        // TODO: test validations
    }

    /**
     * Sync Data Source Items
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncDataSourceItemsTest() throws ApiException {
        Integer dataSourceId = null;
        OrganizationUserDataSourceAPI response = api.syncDataSourceItems(dataSourceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Sync Files
     *
     * After listing files and folders via /integrations/items/sync and integrations/items/list, use the selected items&#39; external ids  as the ids in this endpoint to sync them into Carbon. Sharepoint items take an additional parameter root_id, which identifies the drive the file or folder is in and is stored in root_external_id. That additional paramter is optional and excluding it will tell the sync to assume the item is stored in the default Documents drive.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncFilesTest() throws ApiException {
        Integer dataSourceId = null;
        List<Object> ids = null;
        Object tags = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGeneratorsNullable embeddingModel = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        Integer maxItemsPerChunk = null;
        Boolean setPageAsBoundary = null;
        String requestId = null;
        Boolean useOcr = null;
        Boolean parsePdfTablesWithOcr = null;
        Boolean incrementalSync = null;
        FileSyncConfigNullable fileSyncConfig = null;
        GenericSuccessResponse response = api.syncFiles(dataSourceId, ids)
                .tags(tags)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .maxItemsPerChunk(maxItemsPerChunk)
                .setPageAsBoundary(setPageAsBoundary)
                .requestId(requestId)
                .useOcr(useOcr)
                .parsePdfTablesWithOcr(parsePdfTablesWithOcr)
                .incrementalSync(incrementalSync)
                .fileSyncConfig(fileSyncConfig)
                .execute();
        // TODO: test validations
    }

    /**
     * Github Connect
     *
     * Refer this article to obtain an access token https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens. Make sure that your access token has the permission to read content from your desired repos. Note that if your access token expires you will need to manually update it through this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncGitHubTest() throws ApiException {
        String username = null;
        String accessToken = null;
        Boolean syncSourceItems = null;
        GenericSuccessResponse response = api.syncGitHub(username, accessToken)
                .syncSourceItems(syncSourceItems)
                .execute();
        // TODO: test validations
    }

    /**
     * Gitbook Sync
     *
     * You can sync upto 20 Gitbook spaces at a time using this endpoint. Additional parameters below can be used to associate  data with the synced pages or modify the sync behavior.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncGitbookTest() throws ApiException {
        List<String> spaceIds = null;
        Integer dataSourceId = null;
        Object tags = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGenerators embeddingModel = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        String requestId = null;
        Object response = api.syncGitbook(spaceIds, dataSourceId)
                .tags(tags)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .requestId(requestId)
                .execute();
        // TODO: test validations
    }

    /**
     * Gmail Sync
     *
     * Once you have successfully connected your gmail account, you can choose which emails to sync with us using the filters parameter. Filters is a JSON object with key value pairs. It also supports AND and OR operations. For now, we support a limited set of keys listed below.  &lt;b&gt;label&lt;/b&gt;: Inbuilt Gmail labels, for example \&quot;Important\&quot; or a custom label you created.   &lt;b&gt;after&lt;/b&gt; or &lt;b&gt;before&lt;/b&gt;: A date in YYYY/mm/dd format (example 2023/12/31). Gets emails after/before a certain date. You can also use them in combination to get emails from a certain period.   &lt;b&gt;is&lt;/b&gt;: Can have the following values - starred, important, snoozed, and unread    Using keys or values outside of the specified values can lead to unexpected behaviour.  An example of a basic query with filters can be &#x60;&#x60;&#x60;json {     \&quot;filters\&quot;: {             \&quot;key\&quot;: \&quot;label\&quot;,             \&quot;value\&quot;: \&quot;Test\&quot;         } } &#x60;&#x60;&#x60; Which will list all emails that have the label \&quot;Test\&quot;.  You can use AND and OR operation in the following way: &#x60;&#x60;&#x60;json {     \&quot;filters\&quot;: {         \&quot;AND\&quot;: [             {                 \&quot;key\&quot;: \&quot;after\&quot;,                 \&quot;value\&quot;: \&quot;2024/01/07\&quot;             },             {                 \&quot;OR\&quot;: [                     {                         \&quot;key\&quot;: \&quot;label\&quot;,                         \&quot;value\&quot;: \&quot;Personal\&quot;                     },                     {                         \&quot;key\&quot;: \&quot;is\&quot;,                         \&quot;value\&quot;: \&quot;starred\&quot;                     }                 ]             }         ]     } } &#x60;&#x60;&#x60; This will return emails after 7th of Jan that are either starred or have the label \&quot;Personal\&quot;.  Note that this is the highest level of nesting we support, i.e. you can&#39;t add more AND/OR filters within the OR filter in the above example.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncGmailTest() throws ApiException {
        Object filters = null;
        Object tags = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGenerators embeddingModel = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        Integer dataSourceId = null;
        String requestId = null;
        Boolean syncAttachments = null;
        FileSyncConfigNullable fileSyncConfig = null;
        Boolean incrementalSync = null;
        GenericSuccessResponse response = api.syncGmail(filters)
                .tags(tags)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .dataSourceId(dataSourceId)
                .requestId(requestId)
                .syncAttachments(syncAttachments)
                .fileSyncConfig(fileSyncConfig)
                .incrementalSync(incrementalSync)
                .execute();
        // TODO: test validations
    }

    /**
     * Outlook Sync
     *
     * Once you have successfully connected your Outlook account, you can choose which emails to sync with us using the filters and folder parameter. \&quot;folder\&quot; should be the folder you want to sync from Outlook. By default we get messages from your inbox folder.   Filters is a JSON object with key value pairs. It also supports AND and OR operations. For now, we support a limited set of keys listed below.  &lt;b&gt;category&lt;/b&gt;: Custom categories that you created in Outlook.   &lt;b&gt;after&lt;/b&gt; or &lt;b&gt;before&lt;/b&gt;: A date in YYYY/mm/dd format (example 2023/12/31). Gets emails after/before a certain date. You can also use them in combination to get emails from a certain period.     &lt;b&gt;is&lt;/b&gt;: Can have the following values: flagged     An example of a basic query with filters can be &#x60;&#x60;&#x60;json {     \&quot;filters\&quot;: {             \&quot;key\&quot;: \&quot;category\&quot;,             \&quot;value\&quot;: \&quot;Test\&quot;         } } &#x60;&#x60;&#x60; Which will list all emails that have the category \&quot;Test\&quot;.    Specifying a custom folder in the same query &#x60;&#x60;&#x60;json {     \&quot;folder\&quot;: \&quot;Folder Name\&quot;,     \&quot;filters\&quot;: {             \&quot;key\&quot;: \&quot;category\&quot;,             \&quot;value\&quot;: \&quot;Test\&quot;         } } &#x60;&#x60;&#x60;  You can use AND and OR operation in the following way: &#x60;&#x60;&#x60;json {     \&quot;filters\&quot;: {         \&quot;AND\&quot;: [             {                 \&quot;key\&quot;: \&quot;after\&quot;,                 \&quot;value\&quot;: \&quot;2024/01/07\&quot;             },             {                 \&quot;OR\&quot;: [                     {                         \&quot;key\&quot;: \&quot;category\&quot;,                         \&quot;value\&quot;: \&quot;Personal\&quot;                     },                     {                         \&quot;key\&quot;: \&quot;category\&quot;,                         \&quot;value\&quot;: \&quot;Test\&quot;                     },                 ]             }         ]     } } &#x60;&#x60;&#x60; This will return emails after 7th of Jan that have either Personal or Test as category.  Note that this is the highest level of nesting we support, i.e. you can&#39;t add more AND/OR filters within the OR filter in the above example.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncOutlookTest() throws ApiException {
        Object filters = null;
        Object tags = null;
        String folder = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGenerators embeddingModel = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        Integer dataSourceId = null;
        String requestId = null;
        Boolean syncAttachments = null;
        FileSyncConfigNullable fileSyncConfig = null;
        Boolean incrementalSync = null;
        GenericSuccessResponse response = api.syncOutlook(filters)
                .tags(tags)
                .folder(folder)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .dataSourceId(dataSourceId)
                .requestId(requestId)
                .syncAttachments(syncAttachments)
                .fileSyncConfig(fileSyncConfig)
                .incrementalSync(incrementalSync)
                .execute();
        // TODO: test validations
    }

    /**
     * Github Sync Repos
     *
     * You can retreive repos your token has access to using /integrations/github/repos and sync their content.  You can also pass full name of any public repository (username/repo-name). This will store the repo content with  carbon which can be accessed through /integrations/items/list endpoint. Maximum of 25 repositories are accepted per request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncReposTest() throws ApiException {
        List<String> repos = null;
        Integer dataSourceId = null;
        Object response = api.syncRepos(repos)
                .dataSourceId(dataSourceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Rss Feed
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncRssFeedTest() throws ApiException {
        String url = null;
        Object tags = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGenerators embeddingModel = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        String requestId = null;
        GenericSuccessResponse response = api.syncRssFeed(url)
                .tags(tags)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .requestId(requestId)
                .execute();
        // TODO: test validations
    }

    /**
     * S3 Files
     *
     * After optionally loading the items via /integrations/items/sync and integrations/items/list, use the bucket name  and object key as the ID in this endpoint to sync them into Carbon. Additional parameters below can associate  data with the selected items or modify the sync behavior
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncS3FilesTest() throws ApiException {
        List<S3GetFileInput> ids = null;
        Object tags = null;
        Integer chunkSize = null;
        Integer chunkOverlap = null;
        Boolean skipEmbeddingGeneration = null;
        EmbeddingGenerators embeddingModel = null;
        Boolean generateSparseVectors = null;
        Boolean prependFilenameToChunks = null;
        Integer maxItemsPerChunk = null;
        Boolean setPageAsBoundary = null;
        Integer dataSourceId = null;
        String requestId = null;
        Boolean useOcr = null;
        Boolean parsePdfTablesWithOcr = null;
        FileSyncConfigNullable fileSyncConfig = null;
        GenericSuccessResponse response = api.syncS3Files(ids)
                .tags(tags)
                .chunkSize(chunkSize)
                .chunkOverlap(chunkOverlap)
                .skipEmbeddingGeneration(skipEmbeddingGeneration)
                .embeddingModel(embeddingModel)
                .generateSparseVectors(generateSparseVectors)
                .prependFilenameToChunks(prependFilenameToChunks)
                .maxItemsPerChunk(maxItemsPerChunk)
                .setPageAsBoundary(setPageAsBoundary)
                .dataSourceId(dataSourceId)
                .requestId(requestId)
                .useOcr(useOcr)
                .parsePdfTablesWithOcr(parsePdfTablesWithOcr)
                .fileSyncConfig(fileSyncConfig)
                .execute();
        // TODO: test validations
    }

}

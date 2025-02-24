<div align="center">

[![Visit SnapTrade](https://raw.githubusercontent.com/konfig-dev/konfig/HEAD/sdks/java/header.png)](https://snaptrade.com)

# [SnapTrade](https://snaptrade.com)<a id="snaptrade"></a>

Connect brokerage accounts to your app for live positions and trading

[![Maven Central](https://img.shields.io/badge/Maven%20Central-v4.13.3-blue)](https://central.sonatype.com/artifact/com.konfigthis/snaptrade-java-sdk/4.13.3)
[![More Info](https://img.shields.io/badge/More%20Info-Click%20Here-orange)](https://snaptrade.com/)

</div>

## Table of Contents<a id="table-of-contents"></a>

<!-- toc -->

- [Requirements](#requirements)
- [Installation](#installation)
  * [Maven users](#maven-users)
  * [Gradle users](#gradle-users)
  * [Android users](#android-users)
  * [Others](#others)
- [Getting Started](#getting-started)
- [Reference](#reference)
  * [`snaptrade.accountInformation.getAllUserHoldings`](#snaptradeaccountinformationgetalluserholdings)
  * [`snaptrade.accountInformation.getUserAccountBalance`](#snaptradeaccountinformationgetuseraccountbalance)
  * [`snaptrade.accountInformation.getUserAccountDetails`](#snaptradeaccountinformationgetuseraccountdetails)
  * [`snaptrade.accountInformation.getUserAccountOrders`](#snaptradeaccountinformationgetuseraccountorders)
  * [`snaptrade.accountInformation.getUserAccountPositions`](#snaptradeaccountinformationgetuseraccountpositions)
  * [`snaptrade.accountInformation.getUserHoldings`](#snaptradeaccountinformationgetuserholdings)
  * [`snaptrade.accountInformation.listUserAccounts`](#snaptradeaccountinformationlistuseraccounts)
  * [`snaptrade.accountInformation.updateUserAccount`](#snaptradeaccountinformationupdateuseraccount)
  * [`snaptrade.apiStatus.check`](#snaptradeapistatuscheck)
  * [`snaptrade.authentication.deleteSnapTradeUser`](#snaptradeauthenticationdeletesnaptradeuser)
  * [`snaptrade.authentication.getUserJWT`](#snaptradeauthenticationgetuserjwt)
  * [`snaptrade.authentication.listSnapTradeUsers`](#snaptradeauthenticationlistsnaptradeusers)
  * [`snaptrade.authentication.loginSnapTradeUser`](#snaptradeauthenticationloginsnaptradeuser)
  * [`snaptrade.authentication.registerSnapTradeUser`](#snaptradeauthenticationregistersnaptradeuser)
  * [`snaptrade.authentication.resetSnapTradeUserSecret`](#snaptradeauthenticationresetsnaptradeusersecret)
  * [`snaptrade.connections.detailBrokerageAuthorization`](#snaptradeconnectionsdetailbrokerageauthorization)
  * [`snaptrade.connections.listBrokerageAuthorizations`](#snaptradeconnectionslistbrokerageauthorizations)
  * [`snaptrade.connections.removeBrokerageAuthorization`](#snaptradeconnectionsremovebrokerageauthorization)
  * [`snaptrade.connections.sessionEvents`](#snaptradeconnectionssessionevents)
  * [`snaptrade.errorLogs.listUserErrors`](#snaptradeerrorlogslistusererrors)
  * [`snaptrade.options.getOptionStrategy`](#snaptradeoptionsgetoptionstrategy)
  * [`snaptrade.options.getOptionsChain`](#snaptradeoptionsgetoptionschain)
  * [`snaptrade.options.getOptionsStrategyQuote`](#snaptradeoptionsgetoptionsstrategyquote)
  * [`snaptrade.options.listOptionHoldings`](#snaptradeoptionslistoptionholdings)
  * [`snaptrade.options.placeOptionStrategy`](#snaptradeoptionsplaceoptionstrategy)
  * [`snaptrade.referenceData.getCurrencyExchangeRatePair`](#snaptradereferencedatagetcurrencyexchangeratepair)
  * [`snaptrade.referenceData.getPartnerInfo`](#snaptradereferencedatagetpartnerinfo)
  * [`snaptrade.referenceData.getSecurityTypes`](#snaptradereferencedatagetsecuritytypes)
  * [`snaptrade.referenceData.getStockExchanges`](#snaptradereferencedatagetstockexchanges)
  * [`snaptrade.referenceData.getSymbols`](#snaptradereferencedatagetsymbols)
  * [`snaptrade.referenceData.getSymbolsByTicker`](#snaptradereferencedatagetsymbolsbyticker)
  * [`snaptrade.referenceData.listAllBrokerageAuthorizationType`](#snaptradereferencedatalistallbrokerageauthorizationtype)
  * [`snaptrade.referenceData.listAllBrokerages`](#snaptradereferencedatalistallbrokerages)
  * [`snaptrade.referenceData.listAllCurrencies`](#snaptradereferencedatalistallcurrencies)
  * [`snaptrade.referenceData.listAllCurrenciesRates`](#snaptradereferencedatalistallcurrenciesrates)
  * [`snaptrade.referenceData.symbolSearchUserAccount`](#snaptradereferencedatasymbolsearchuseraccount)
  * [`snaptrade.trading.cancelUserAccountOrder`](#snaptradetradingcanceluseraccountorder)
  * [`snaptrade.trading.getOrderImpact`](#snaptradetradinggetorderimpact)
  * [`snaptrade.trading.getUserAccountQuotes`](#snaptradetradinggetuseraccountquotes)
  * [`snaptrade.trading.placeForceOrder`](#snaptradetradingplaceforceorder)
  * [`snaptrade.trading.placeOCOOrder`](#snaptradetradingplaceocoorder)
  * [`snaptrade.trading.placeOrder`](#snaptradetradingplaceorder)
  * [`snaptrade.transactionsAndReporting.getActivities`](#snaptradetransactionsandreportinggetactivities)
  * [`snaptrade.transactionsAndReporting.getReportingCustomRange`](#snaptradetransactionsandreportinggetreportingcustomrange)

<!-- tocstop -->

## Requirements<a id="requirements"></a>

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users<a id="maven-users"></a>

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>snaptrade-java-sdk</artifactId>
  <version>4.13.3</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users<a id="gradle-users"></a>

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:snaptrade-java-sdk:4.13.3"
}
```

### Android users<a id="android-users"></a>

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others<a id="others"></a>

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/snaptrade-java-sdk-4.13.3.jar`
* `target/lib/*.jar`

## Getting Started<a id="getting-started"></a>

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Snaptrade;
import com.konfigthis.client.model.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {

        public static void main(String[] args) {
                // 1) Initialize default client with clientID and consumerKey
                Configuration configuration = new Configuration();
                configuration.clientId = System.getenv("SNAPTRADE_CLIENT_ID");
                configuration.consumerKey = System.getenv("SNAPTRADE_CONSUMER_KEY");
                Snaptrade snaptrade = new Snaptrade(configuration);

                // 2) Check that the client is able to make a request to the API server
                Status status = snaptrade.apiStatus.check().execute();
                System.out.printf("SnapTrade is online: %s\n", status.getOnline());

                // 3) Create a new user on SnapTrade
                // The userId should be provided by you and refer to permanent value such as a
                // database row ID
                UUID userId = UUID.randomUUID();
                UserIDandSecret userIDandSecret = snaptrade.authentication.registerSnapTradeUser()
                                .userId(userId.toString()).execute();

                new SnapTradeRegisterUserRequestBody().userId(userId.toString());
                // Note: A user secret is only generated once. It's required to access resources
                // for certain endpoints
                System.out.printf("userID: %s, userSecret: %s\n", userIDandSecret.getUserId(),
                                userIDandSecret.getUserSecret());

                // 4) Get a redirect URI. Users will need this to connect their brokerage to the
                // SnapTrade server
                Map response = (Map) snaptrade.authentication
                                .loginSnapTradeUser(userIDandSecret.getUserId(),
                                                userIDandSecret.getUserSecret())
                                .execute();
                System.out.println(response.get("redirectURI"));

                // 5) Make a portfolio group and query
                List<PortfolioGroup> portfolioGroupsFromPost = snaptrade.portfolioManagement.create(
                                userIDandSecret.getUserId(), userIDandSecret.getUserSecret()).id(UUID.randomUUID())
                                .name("MyPortfolio").execute();
                System.out.println(portfolioGroupsFromPost);
                List<PortfolioGroup> portfolioGroups = snaptrade.portfolioManagement.list(userIDandSecret.getUserId(),
                                userIDandSecret.getUserSecret()).execute();
                System.out.println(portfolioGroups);

                // 7) Query holdings and available brokerages
                List<AccountHoldings> holdings = snaptrade.accountInformation
                                .getAllUserHoldings(userIDandSecret.getUserId(),
                                                userIDandSecret.getUserSecret())
                                .execute();
                System.out.println(holdings);
                List<Account> accounts = snaptrade.accountInformation.listUserAccounts(userIDandSecret.getUserId(),
                                userIDandSecret.getUserSecret()).execute();
                System.out.println(accounts);
                List<Brokerage> brokerages = snaptrade.referenceData.listAllBrokerages().execute();
                System.out.println(brokerages);

                // 8) Deleting a user
                DeleteUserResponse deleteUserResponse = snaptrade.authentication
                                .deleteSnapTradeUser(userIDandSecret.getUserId()).execute();
                System.out.println(deleteUserResponse);
        }
}

```
## Reference<a id="reference"></a>


### `snaptrade.accountInformation.getAllUserHoldings`<a id="snaptradeaccountinformationgetalluserholdings"></a>
![Deprecated](https://img.shields.io/badge/deprecated-yellow)

List all accounts for the user, plus balances, positions, and orders for each account.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<AccountHoldings> result = client
        .accountInformation
        .getAllUserHoldings(userId, userSecret)
        .brokerageAuthorizations(brokerageAuthorizations)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### brokerageAuthorizations: `UUID`<a id="brokerageauthorizations-uuid"></a>

Optional. Comma seperated list of authorization IDs (only use if filtering is needed on one or more authorizations).

#### 🔄 Return<a id="🔄-return"></a>

[AccountHoldings](./src/main/java/com/konfigthis/client/model/AccountHoldings.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/holdings` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.accountInformation.getUserAccountBalance`<a id="snaptradeaccountinformationgetuseraccountbalance"></a>

A list of account balances for the specified account (one per currency that the account holds).

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<Balance> result = client
        .accountInformation
        .getUserAccountBalance(userId, userSecret, accountId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to get balances.

#### 🔄 Return<a id="🔄-return"></a>

[Balance](./src/main/java/com/konfigthis/client/model/Balance.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/balances` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.accountInformation.getUserAccountDetails`<a id="snaptradeaccountinformationgetuseraccountdetails"></a>

Return details of a specific investment account

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
Account result = client
        .accountInformation
        .getUserAccountDetails(userId, userSecret, accountId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to get detail of.

#### 🔄 Return<a id="🔄-return"></a>

[Account](./src/main/java/com/konfigthis/client/model/Account.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.accountInformation.getUserAccountOrders`<a id="snaptradeaccountinformationgetuseraccountorders"></a>

Fetch all recent orders from a user's account.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<AccountOrderRecord> result = client
        .accountInformation
        .getUserAccountOrders(userId, userSecret, accountId)
        .state(state)
        .days(days)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to get orders.

##### state: `String`<a id="state-string"></a>

defaults value is set to \"all\"

##### days: `Integer`<a id="days-integer"></a>

Number of days in the past to fetch the most recent orders. Defaults to the last 90 days if no value is passed in.

#### 🔄 Return<a id="🔄-return"></a>

[AccountOrderRecord](./src/main/java/com/konfigthis/client/model/AccountOrderRecord.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/orders` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.accountInformation.getUserAccountPositions`<a id="snaptradeaccountinformationgetuseraccountpositions"></a>

List account positions

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<Position> result = client
        .accountInformation
        .getUserAccountPositions(userId, userSecret, accountId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to get positions.

#### 🔄 Return<a id="🔄-return"></a>

[Position](./src/main/java/com/konfigthis/client/model/Position.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/positions` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.accountInformation.getUserHoldings`<a id="snaptradeaccountinformationgetuserholdings"></a>

List balances, positions and orders for the specified account

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
AccountHoldingsAccount result = client
        .accountInformation
        .getUserHoldings(accountId, userId, userSecret)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to fetch holdings for.

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

#### 🔄 Return<a id="🔄-return"></a>

[AccountHoldingsAccount](./src/main/java/com/konfigthis/client/model/AccountHoldingsAccount.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/holdings` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.accountInformation.listUserAccounts`<a id="snaptradeaccountinformationlistuseraccounts"></a>

List accounts

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<Account> result = client
        .accountInformation
        .listUserAccounts(userId, userSecret)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

#### 🔄 Return<a id="🔄-return"></a>

[Account](./src/main/java/com/konfigthis/client/model/Account.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.accountInformation.updateUserAccount`<a id="snaptradeaccountinformationupdateuseraccount"></a>

Update details of an investment account

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<Account> result = client
        .accountInformation
        .updateUserAccount(userId, userSecret, accountId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to update.

#### 🔄 Return<a id="🔄-return"></a>

[Account](./src/main/java/com/konfigthis/client/model/Account.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}` `PUT`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.apiStatus.check`<a id="snaptradeapistatuscheck"></a>

Check whether the API is operational and verify timestamps.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
Status result = client
        .apiStatus
        .check()
        .execute();
```

#### 🔄 Return<a id="🔄-return"></a>

[Status](./src/main/java/com/konfigthis/client/model/Status.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.authentication.deleteSnapTradeUser`<a id="snaptradeauthenticationdeletesnaptradeuser"></a>

Deletes a user you've registered over the SnapTrade API, and any data associated with them or their investment accounts.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
DeleteUserResponse result = client
        .authentication
        .deleteSnapTradeUser(userId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

#### 🔄 Return<a id="🔄-return"></a>

[DeleteUserResponse](./src/main/java/com/konfigthis/client/model/DeleteUserResponse.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/snapTrade/deleteUser` `DELETE`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.authentication.getUserJWT`<a id="snaptradeauthenticationgetuserjwt"></a>

Generate encrypted JWT token

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
EncryptedResponse result = client
        .authentication
        .getUserJWT(userId, userSecret)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

#### 🔄 Return<a id="🔄-return"></a>

[EncryptedResponse](./src/main/java/com/konfigthis/client/model/EncryptedResponse.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/snapTrade/encryptedJWT` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.authentication.listSnapTradeUsers`<a id="snaptradeauthenticationlistsnaptradeusers"></a>

Returns a list of users you've registered over the SnapTrade API.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<String> result = client
        .authentication
        .listSnapTradeUsers()
        .execute();
```

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/snapTrade/listUsers` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.authentication.loginSnapTradeUser`<a id="snaptradeauthenticationloginsnaptradeuser"></a>

Logs in a SnapTrade user and returns an authenticated connection portal URL for them to use to connect a brokerage account.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
Object result = client
        .authentication
        .loginSnapTradeUser(userId, userSecret)
        .broker(broker)
        .immediateRedirect(immediateRedirect)
        .customRedirect(customRedirect)
        .reconnect(reconnect)
        .connectionType(connectionType)
        .connectionPortalVersion(connectionPortalVersion)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### broker: `String`<a id="broker-string"></a>

Slug of the brokerage to connect the user to

##### immediateRedirect: `Boolean`<a id="immediateredirect-boolean"></a>

When set to True, user will be redirected back to the partner's site instead of the connection portal

##### customRedirect: `String`<a id="customredirect-string"></a>

URL to redirect the user to after the user connects their brokerage account

##### reconnect: `String`<a id="reconnect-string"></a>

The UUID of the brokerage connection to be reconnected. This parameter should be left empty unless you are reconnecting a disabled connection. See ‘Reconnecting Accounts’ for more information.

##### connectionType: `String`<a id="connectiontype-string"></a>

Sets whether the connection should be read or trade

##### connectionPortalVersion: `String`<a id="connectionportalversion-string"></a>

Sets the version of the connection portal to render, with a default to 'v2'

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/snapTrade/login` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.authentication.registerSnapTradeUser`<a id="snaptradeauthenticationregistersnaptradeuser"></a>

Create SnapTrade user

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
UserIDandSecret result = client
        .authentication
        .registerSnapTradeUser()
        .userId(userId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

SnapTrade User ID. Provided by SnapTrade Partner. Can be any string, as long as it's unique to a user

#### 🔄 Return<a id="🔄-return"></a>

[UserIDandSecret](./src/main/java/com/konfigthis/client/model/UserIDandSecret.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/snapTrade/registerUser` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.authentication.resetSnapTradeUserSecret`<a id="snaptradeauthenticationresetsnaptradeusersecret"></a>

Obtain a new user secret for a user

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
UserIDandSecret result = client
        .authentication
        .resetSnapTradeUserSecret()
        .userId(userId)
        .userSecret(userSecret)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

SnapTrade User ID. Provided by SnapTrade Partner. Can be any string, as long as it's unique to a user

##### userSecret: `String`<a id="usersecret-string"></a>

SnapTrade User Secret randomly generated by SnapTrade. This should be considered priviledged information and if compromised, you should delete and re-create this SnapTrade user.

#### 🔄 Return<a id="🔄-return"></a>

[UserIDandSecret](./src/main/java/com/konfigthis/client/model/UserIDandSecret.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/snapTrade/resetUserSecret` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.connections.detailBrokerageAuthorization`<a id="snaptradeconnectionsdetailbrokerageauthorization"></a>

Get brokerage authorization details

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
BrokerageAuthorization result = client
        .connections
        .detailBrokerageAuthorization(authorizationId, userId, userSecret)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### authorizationId: `UUID`<a id="authorizationid-uuid"></a>

The ID of a brokerage authorization object.

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

#### 🔄 Return<a id="🔄-return"></a>

[BrokerageAuthorization](./src/main/java/com/konfigthis/client/model/BrokerageAuthorization.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/authorizations/{authorizationId}` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.connections.listBrokerageAuthorizations`<a id="snaptradeconnectionslistbrokerageauthorizations"></a>

List all brokerage authorizations for the user

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<BrokerageAuthorization> result = client
        .connections
        .listBrokerageAuthorizations(userId, userSecret)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

#### 🔄 Return<a id="🔄-return"></a>

[BrokerageAuthorization](./src/main/java/com/konfigthis/client/model/BrokerageAuthorization.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/authorizations` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.connections.removeBrokerageAuthorization`<a id="snaptradeconnectionsremovebrokerageauthorization"></a>

Delete brokerage authorization

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
client
        .connections
        .removeBrokerageAuthorization(authorizationId, userId, userSecret)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### authorizationId: `UUID`<a id="authorizationid-uuid"></a>

The ID of the Authorization to delete.

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/authorizations/{authorizationId}` `DELETE`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.connections.sessionEvents`<a id="snaptradeconnectionssessionevents"></a>

List all session events for the partner

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<SessionEvent> result = client
        .connections
        .sessionEvents(partnerClientId)
        .userId(userId)
        .sessionId(sessionId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### partnerClientId: `String`<a id="partnerclientid-string"></a>

##### userId: `String`<a id="userid-string"></a>

Optional comma seperated list of user IDs used to filter the request on specific users

##### sessionId: `String`<a id="sessionid-string"></a>

Optional comma seperated list of session IDs used to filter the request on specific users

#### 🔄 Return<a id="🔄-return"></a>

[SessionEvent](./src/main/java/com/konfigthis/client/model/SessionEvent.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/sessionEvents` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.errorLogs.listUserErrors`<a id="snaptradeerrorlogslistusererrors"></a>

Retrieve error logs on behalf of your SnapTrade users

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<UserErrorLog> result = client
        .errorLogs
        .listUserErrors(userId, userSecret)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

#### 🔄 Return<a id="🔄-return"></a>

[UserErrorLog](./src/main/java/com/konfigthis/client/model/UserErrorLog.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/snapTrade/listUserErrors` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.options.getOptionStrategy`<a id="snaptradeoptionsgetoptionstrategy"></a>

Creates an option strategy object that will be used to place an option strategy order

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
StrategyQuotes result = client
        .options
        .getOptionStrategy(underlyingSymbolId, legs, strategyType, userId, userSecret, accountId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### underlying_symbol_id: `UUID`<a id="underlying_symbol_id-uuid"></a>

##### legs: List<[`OptionLeg`](./src/main/java/com/konfigthis/client/model/OptionLeg.java)><a id="legs-list"></a>

##### strategy_type: `String`<a id="strategy_type-string"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to create the option strategy object in.

#### 🔄 Return<a id="🔄-return"></a>

[StrategyQuotes](./src/main/java/com/konfigthis/client/model/StrategyQuotes.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/optionStrategy` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.options.getOptionsChain`<a id="snaptradeoptionsgetoptionschain"></a>

Get the options chain

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<OptionChainInner> result = client
        .options
        .getOptionsChain(userId, userSecret, accountId, symbol)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to get the options chain from.

##### symbol: `UUID`<a id="symbol-uuid"></a>

Universal symbol ID if symbol

#### 🔄 Return<a id="🔄-return"></a>

[OptionChainInner](./src/main/java/com/konfigthis/client/model/OptionChainInner.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/optionsChain` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.options.getOptionsStrategyQuote`<a id="snaptradeoptionsgetoptionsstrategyquote"></a>

Get latest market data of option strategy

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
StrategyQuotes result = client
        .options
        .getOptionsStrategyQuote(userId, userSecret, accountId, optionStrategyId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account the strategy will be placed in.

##### optionStrategyId: `UUID`<a id="optionstrategyid-uuid"></a>

Option strategy id obtained from response when creating option strategy object

#### 🔄 Return<a id="🔄-return"></a>

[StrategyQuotes](./src/main/java/com/konfigthis/client/model/StrategyQuotes.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/optionStrategy/{optionStrategyId}` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.options.listOptionHoldings`<a id="snaptradeoptionslistoptionholdings"></a>

Get the options holdings in the account

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<OptionsPosition> result = client
        .options
        .listOptionHoldings(userId, userSecret, accountId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to fetch options holdings for.

#### 🔄 Return<a id="🔄-return"></a>

[OptionsPosition](./src/main/java/com/konfigthis/client/model/OptionsPosition.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/options` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.options.placeOptionStrategy`<a id="snaptradeoptionsplaceoptionstrategy"></a>

Place an option strategy order on the brokerage

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
StrategyOrderRecord result = client
        .options
        .placeOptionStrategy(orderType, timeInForce, userId, userSecret, accountId, optionStrategyId)
        .price(price)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### order_type:<a id="order_type"></a>

##### time_in_force:<a id="time_in_force"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to execute the strategy in.

##### optionStrategyId: `UUID`<a id="optionstrategyid-uuid"></a>

Option strategy id obtained from response when creating option strategy object

##### price: `Double`<a id="price-double"></a>

Trade Price if limit or stop limit order

#### 🔄 Return<a id="🔄-return"></a>

[StrategyOrderRecord](./src/main/java/com/konfigthis/client/model/StrategyOrderRecord.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/optionStrategy/{optionStrategyId}/execute` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.getCurrencyExchangeRatePair`<a id="snaptradereferencedatagetcurrencyexchangeratepair"></a>

Return the exchange rate of a currency pair

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
ExchangeRatePairs result = client
        .referenceData
        .getCurrencyExchangeRatePair(currencyPair)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### currencyPair: `String`<a id="currencypair-string"></a>

A currency pair based on currency code for example, {CAD-USD}

#### 🔄 Return<a id="🔄-return"></a>

[ExchangeRatePairs](./src/main/java/com/konfigthis/client/model/ExchangeRatePairs.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/currencies/rates/{currencyPair}` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.getPartnerInfo`<a id="snaptradereferencedatagetpartnerinfo"></a>

Get metadata related to Snaptrade partner

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
PartnerData result = client
        .referenceData
        .getPartnerInfo()
        .execute();
```

#### 🔄 Return<a id="🔄-return"></a>

[PartnerData](./src/main/java/com/konfigthis/client/model/PartnerData.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/snapTrade/partners` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.getSecurityTypes`<a id="snaptradereferencedatagetsecuritytypes"></a>

List security types available on SnapTrade.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<SecurityType> result = client
        .referenceData
        .getSecurityTypes()
        .execute();
```

#### 🔄 Return<a id="🔄-return"></a>

[SecurityType](./src/main/java/com/konfigthis/client/model/SecurityType.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/securityTypes` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.getStockExchanges`<a id="snaptradereferencedatagetstockexchanges"></a>

List exchanges

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<Exchange> result = client
        .referenceData
        .getStockExchanges()
        .execute();
```

#### 🔄 Return<a id="🔄-return"></a>

[Exchange](./src/main/java/com/konfigthis/client/model/Exchange.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/exchanges` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.getSymbols`<a id="snaptradereferencedatagetsymbols"></a>

Search for symbols

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<UniversalSymbol> result = client
        .referenceData
        .getSymbols()
        .substring(substring)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### substring: `String`<a id="substring-string"></a>

#### 🔄 Return<a id="🔄-return"></a>

[UniversalSymbol](./src/main/java/com/konfigthis/client/model/UniversalSymbol.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/symbols` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.getSymbolsByTicker`<a id="snaptradereferencedatagetsymbolsbyticker"></a>

Get details of a symbol by the ticker or the universal_symbol_id

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
UniversalSymbol result = client
        .referenceData
        .getSymbolsByTicker(query)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### query: `String`<a id="query-string"></a>

The ticker or universal_symbol_id of the UniversalSymbol to get.

#### 🔄 Return<a id="🔄-return"></a>

[UniversalSymbol](./src/main/java/com/konfigthis/client/model/UniversalSymbol.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/symbols/{query}` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.listAllBrokerageAuthorizationType`<a id="snaptradereferencedatalistallbrokerageauthorizationtype"></a>

List of all brokerage authorization types

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<BrokerageAuthorizationTypeReadOnly> result = client
        .referenceData
        .listAllBrokerageAuthorizationType()
        .brokerage(brokerage)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### brokerage: `String`<a id="brokerage-string"></a>

Comma separated value of brokerage slugs

#### 🔄 Return<a id="🔄-return"></a>

[BrokerageAuthorizationTypeReadOnly](./src/main/java/com/konfigthis/client/model/BrokerageAuthorizationTypeReadOnly.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/brokerageAuthorizationTypes` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.listAllBrokerages`<a id="snaptradereferencedatalistallbrokerages"></a>

List brokerages

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<Brokerage> result = client
        .referenceData
        .listAllBrokerages()
        .execute();
```

#### 🔄 Return<a id="🔄-return"></a>

[Brokerage](./src/main/java/com/konfigthis/client/model/Brokerage.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/brokerages` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.listAllCurrencies`<a id="snaptradereferencedatalistallcurrencies"></a>

List currencies

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<Currency> result = client
        .referenceData
        .listAllCurrencies()
        .execute();
```

#### 🔄 Return<a id="🔄-return"></a>

[Currency](./src/main/java/com/konfigthis/client/model/Currency.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/currencies` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.listAllCurrenciesRates`<a id="snaptradereferencedatalistallcurrenciesrates"></a>

List currency exchange rates

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<ExchangeRatePairs> result = client
        .referenceData
        .listAllCurrenciesRates()
        .execute();
```

#### 🔄 Return<a id="🔄-return"></a>

[ExchangeRatePairs](./src/main/java/com/konfigthis/client/model/ExchangeRatePairs.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/currencies/rates` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.referenceData.symbolSearchUserAccount`<a id="snaptradereferencedatasymbolsearchuseraccount"></a>

Search for symbols available in an account

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<UniversalSymbol> result = client
        .referenceData
        .symbolSearchUserAccount(userId, userSecret, accountId)
        .substring(substring)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to search for symbols within.

##### substring: `String`<a id="substring-string"></a>

#### 🔄 Return<a id="🔄-return"></a>

[UniversalSymbol](./src/main/java/com/konfigthis/client/model/UniversalSymbol.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/symbols` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.trading.cancelUserAccountOrder`<a id="snaptradetradingcanceluseraccountorder"></a>

Cancel open order in account

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
AccountOrderRecord result = client
        .trading
        .cancelUserAccountOrder(userId, userSecret, accountId)
        .brokerageOrderId(brokerageOrderId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to cancel the order in.

##### brokerage_order_id: `UUID`<a id="brokerage_order_id-uuid"></a>

#### 🔄 Return<a id="🔄-return"></a>

[AccountOrderRecord](./src/main/java/com/konfigthis/client/model/AccountOrderRecord.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/orders/cancel` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.trading.getOrderImpact`<a id="snaptradetradinggetorderimpact"></a>

Check impact of trades on account.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
ManualTradeAndImpact result = client
        .trading
        .getOrderImpact(userId, userSecret)
        .accountId(accountId)
        .action(action)
        .orderType(orderType)
        .price(price)
        .stop(stop)
        .timeInForce(timeInForce)
        .units(units)
        .universalSymbolId(universalSymbolId)
        .notionalValue(notionalValue)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### account_id: `UUID`<a id="account_id-uuid"></a>

##### action:<a id="action"></a>

##### order_type:<a id="order_type"></a>

##### price: `Double`<a id="price-double"></a>

Trade Price if limit or stop limit order

##### stop: `Double`<a id="stop-double"></a>

Stop Price. If stop loss or stop limit order, the price to trigger the stop

##### time_in_force:<a id="time_in_force"></a>

##### units: `Double`<a id="units-double"></a>

Trade Units. Cannot work with notional value.

##### universal_symbol_id: `UUID`<a id="universal_symbol_id-uuid"></a>

##### notional_value: `Double`<a id="notional_value-double"></a>

Dollar amount to trade. Cannot work with units. Can only work for market order types and day for time in force. **Only available for Alpaca, Alpaca Paper, and Robinhood. Please contact support to get access to place notional trades**

#### 🔄 Return<a id="🔄-return"></a>

[ManualTradeAndImpact](./src/main/java/com/konfigthis/client/model/ManualTradeAndImpact.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/trade/impact` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.trading.getUserAccountQuotes`<a id="snaptradetradinggetuseraccountquotes"></a>

Get symbol quotes

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<SymbolsQuotesInner> result = client
        .trading
        .getUserAccountQuotes(userId, userSecret, symbols, accountId)
        .useTicker(useTicker)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### symbols: `String`<a id="symbols-string"></a>

List of universal_symbol_id or tickers to get quotes for.

##### accountId: `UUID`<a id="accountid-uuid"></a>

The ID of the account to get quotes.

##### useTicker: `Boolean`<a id="useticker-boolean"></a>

Should be set to True if providing tickers.

#### 🔄 Return<a id="🔄-return"></a>

[SymbolsQuotesInner](./src/main/java/com/konfigthis/client/model/SymbolsQuotesInner.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/accounts/{accountId}/quotes` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.trading.placeForceOrder`<a id="snaptradetradingplaceforceorder"></a>

Place a trade with NO validation.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
AccountOrderRecord result = client
        .trading
        .placeForceOrder(userId, userSecret)
        .accountId(accountId)
        .action(action)
        .orderType(orderType)
        .price(price)
        .stop(stop)
        .timeInForce(timeInForce)
        .units(units)
        .universalSymbolId(universalSymbolId)
        .notionalValue(notionalValue)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### account_id: `UUID`<a id="account_id-uuid"></a>

##### action:<a id="action"></a>

##### order_type:<a id="order_type"></a>

##### price: `Double`<a id="price-double"></a>

Trade Price if limit or stop limit order

##### stop: `Double`<a id="stop-double"></a>

Stop Price. If stop loss or stop limit order, the price to trigger the stop

##### time_in_force:<a id="time_in_force"></a>

##### units: `Double`<a id="units-double"></a>

Trade Units. Cannot work with notional value.

##### universal_symbol_id: `UUID`<a id="universal_symbol_id-uuid"></a>

##### notional_value: `Double`<a id="notional_value-double"></a>

Dollar amount to trade. Cannot work with units. Can only work for market order types and day for time in force. **Only available for Alpaca, Alpaca Paper, and Robinhood. Please contact support to get access to place notional trades**

#### 🔄 Return<a id="🔄-return"></a>

[AccountOrderRecord](./src/main/java/com/konfigthis/client/model/AccountOrderRecord.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/trade/place` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.trading.placeOCOOrder`<a id="snaptradetradingplaceocoorder"></a>
![Deprecated](https://img.shields.io/badge/deprecated-yellow)

Place a OCO (One Cancels Other) order

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
AccountOrderRecord result = client
        .trading
        .placeOCOOrder(userId, userSecret)
        .firstTradeId(firstTradeId)
        .secondTradeId(secondTradeId)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### first_trade_id: `Object`<a id="first_trade_id-object"></a>

The ID of first trade object obtained from trade/impact endpoint

##### second_trade_id: `Object`<a id="second_trade_id-object"></a>

The ID of second trade object obtained from trade/impact endpoint

#### 🔄 Return<a id="🔄-return"></a>

[AccountOrderRecord](./src/main/java/com/konfigthis/client/model/AccountOrderRecord.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/trade/oco` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.trading.placeOrder`<a id="snaptradetradingplaceorder"></a>

Place order

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
AccountOrderRecord result = client
        .trading
        .placeOrder(tradeId, userId, userSecret)
        .waitToConfirm(waitToConfirm)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### tradeId: `UUID`<a id="tradeid-uuid"></a>

The ID of trade object obtained from trade/impact endpoint

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### wait_to_confirm: `Boolean`<a id="wait_to_confirm-boolean"></a>

Optional, defaults to true. Determines if a wait is performed to check on order status. If false, latency will be reduced but orders returned will be more likely to be of status PENDING as we will not wait to check on the status before responding to the request

#### 🔄 Return<a id="🔄-return"></a>

[AccountOrderRecord](./src/main/java/com/konfigthis/client/model/AccountOrderRecord.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/trade/{tradeId}` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.transactionsAndReporting.getActivities`<a id="snaptradetransactionsandreportinggetactivities"></a>

Returns activities (transactions) for a user. Specifying start and end date is highly recommended for better performance

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
List<UniversalActivity> result = client
        .transactionsAndReporting
        .getActivities(userId, userSecret)
        .startDate(startDate)
        .endDate(endDate)
        .accounts(accounts)
        .brokerageAuthorizations(brokerageAuthorizations)
        .type(type)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### startDate: `LocalDate`<a id="startdate-localdate"></a>

##### endDate: `LocalDate`<a id="enddate-localdate"></a>

##### accounts: `String`<a id="accounts-string"></a>

Optional comma seperated list of account IDs used to filter the request on specific accounts

##### brokerageAuthorizations: `String`<a id="brokerageauthorizations-string"></a>

Optional comma seperated list of brokerage authorization IDs used to filter the request on only accounts that belong to those authorizations

##### type: `String`<a id="type-string"></a>

Optional comma seperated list of types to filter activities by. This is not an exhaustive list, if we fail to match to these types, we will return the raw description from the brokerage. Potential values include - DIVIDEND - BUY - SELL - CONTRIBUTION - WITHDRAWAL - EXTERNAL_ASSET_TRANSFER_IN - EXTERNAL_ASSET_TRANSFER_OUT - INTERNAL_CASH_TRANSFER_IN - INTERNAL_CASH_TRANSFER_OUT - INTERNAL_ASSET_TRANSFER_IN - INTERNAL_ASSET_TRANSFER_OUT - INTEREST - REBATE - GOV_GRANT - TAX - FEE - REI - FXT

#### 🔄 Return<a id="🔄-return"></a>

[UniversalActivity](./src/main/java/com/konfigthis/client/model/UniversalActivity.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/activities` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `snaptrade.transactionsAndReporting.getReportingCustomRange`<a id="snaptradetransactionsandreportinggetreportingcustomrange"></a>
![Deprecated](https://img.shields.io/badge/deprecated-yellow)

Returns performance information (contributions, dividends, rate of return, etc) for a specific timeframe. Please note that Total Equity Timeframe and Rate of Returns are experimental features. Please contact support@snaptrade.com if you notice any inconsistencies.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```java
PerformanceCustom result = client
        .transactionsAndReporting
        .getReportingCustomRange(startDate, endDate, userId, userSecret)
        .accounts(accounts)
        .detailed(detailed)
        .frequency(frequency)
        .execute();
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### startDate: `LocalDate`<a id="startdate-localdate"></a>

##### endDate: `LocalDate`<a id="enddate-localdate"></a>

##### userId: `String`<a id="userid-string"></a>

##### userSecret: `String`<a id="usersecret-string"></a>

##### accounts: `String`<a id="accounts-string"></a>

Optional comma seperated list of account IDs used to filter the request on specific accounts

##### detailed: `Boolean`<a id="detailed-boolean"></a>

Optional, increases frequency of data points for the total value and contribution charts if set to true

##### frequency: `String`<a id="frequency-string"></a>

Optional frequency for the rate of return chart (defaults to monthly). Possible values are daily, weekly, monthly, quarterly, yearly.

#### 🔄 Return<a id="🔄-return"></a>

[PerformanceCustom](./src/main/java/com/konfigthis/client/model/PerformanceCustom.java)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/performance/custom` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


## Author<a id="author"></a>
This Java package is automatically generated by [Konfig](https://konfigthis.com)

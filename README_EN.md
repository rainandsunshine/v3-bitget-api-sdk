# bitget-java-sdk-api

A Java sdk for bitget exchange API

<p align="center">
<a href="https://github.com/BitgetLimited/v3-bitget-api-sdk/blob/master/bitget-java-sdk-api/README.md">中文</a>
</p>

## api sdk Instructions

1. Download the java project, then run below command with JDK8

```shell
#jdk8
cd v3-bitget-api-sdk/bitget-java-sdk-api
mvn clean install
```

Import the output jar into your project



2. Create BitgetRestClient

```java
    /**
     * User apiKey, which needs to be filled in by the user, 
     * create apikey in https://www.bitget.com
     */
    String apiKey = "";

    /**
     * User secretKey, which needs to be filled in by the user, 
     * and can be obtained from https://www.bitget.com/user api part
     */
    String secretKey = "";

    /**
     * Passwphrase, which needs to be filled in by the user, obtained from
     * https://www.bitget.com/user api part(set by the user when created)
     */
    String passphrase = "";

    /**
     * open api Root path
     */
    String baseUrl = "http://127.0.0.1:8081/api/swap/v3/";

    ClientParameter parameter = ClientParameter.builder()
            .apiKey(apiKey)
            .secretKey(secretKey)
            .passphrase(passphrase)
            .baseUrl(baseUrl)
            .build();

    bitgetRestClient bitgetClient = bitgetRestClient.builder()
                .configuration(parameter)
                .build();
```



3. Interface call

-  After creating bitgetClient, you can call the service interface to obtain trading pair information as an example

```java
ServerTime serverTime = this.bitgetClient.contract().market().getTime()
```

- Refer to the test case for other interface calls. In addition, because bitget-java-sdk-api uses lombok, please install the lombok plug-in in the compiler

 

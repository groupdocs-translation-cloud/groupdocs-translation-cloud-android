package com.groupdocs.translation.cloud.android;

import static java.lang.System.out;

public class BaseTest {

    BaseTest() throws Exception {
        //Todo: Setup App_SID & App_Key; You can get them in your Aspose Dashboard https://dashboard.aspose.cloud
        Configuration.setAPP_SID("");
        Configuration.setAPI_KEY("");
        Configuration.setDebug(true);
        Configuration.setTestSrcDir("sourceTest");
        Configuration.setTestDstDir("destTest");

        if (Configuration.getAPI_KEY().isEmpty() || Configuration.getAPP_SID().isEmpty()) {
            out.println("! Error: Setup AppSID & AppKey in BaseTest Configuration");
            throw new Exception("Setup AppSID & AppKey in BaseTest Configuration");
        }
    }
}

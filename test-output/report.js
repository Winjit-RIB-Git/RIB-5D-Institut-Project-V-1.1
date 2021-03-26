$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/_5DInstitut.Features/BoQ_Line_Item.feature");
formatter.feature({
  "name": "Test for BoQ Line Item",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing Submodule - BoQ Line Item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch The Application",
  "keyword": "Given "
});
formatter.match({
  "location": "_5DInstitut.Steps.Test_BoQ_Line_Item.launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Application is Launched",
  "keyword": "When "
});
formatter.match({
  "location": "_5DInstitut.Steps.Test_BoQ_Line_Item.application_is_launched()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton id\u003d\"loginbutton\" class\u003d\"btn btn-default ng-binding\" data-ng-click\u003d\"login()\" ng-bind\u003d\"text.platform.loginButton\" data-ng-disabled\u003d\"!canLogon()\"\u003e...\u003c/button\u003e is not clickable at point (692, 244). Other element would receive the click: \u003cdiv data-ng-if\u003d\"loading\" class\u003d\"wait-overlay ng-scope ng-animate ng-leave\" data-ng-class\u003d\"[cssClass, { backdrop : config.backdrop }]\" data-ng-animate\u003d\"2\" style\u003d\"transition-delay: -0.6s;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d88.0.4324.190)\nBuild info: version: \u00274.0.0-alpha-7\u0027, revision: \u0027de8579b6d5\u0027\nSystem info: host: \u0027WJLP-1587\u0027, ip: \u0027192.168.1.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\ABHIJE~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57218}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 6b2633e15f83bf8869a98119bca38ddb\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:123)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:501)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:238)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:79)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy37.click(Unknown Source)\r\n\tat _5DInstitut.Utilities.Interact.clickOnElement(Interact.java:26)\r\n\tat _5DInstitut.Pages.ProjectModule.clicklogin(ProjectModule.java:35)\r\n\tat _5DInstitut.Steps.Test_BoQ_Line_Item.application_is_launched(Test_BoQ_Line_Item.java:34)\r\n\tat ✽.Application is Launched(file:///C:/Users/abhijeetk/OneDrive%20-%20Winjit%20Technologies%20Pvt%20Ltd/Documents/RIB_Winjit_Workspace_AutoTest/RIB.5D_Institut.Project_V-01/src/test/resources/_5DInstitut.Features/BoQ_Line_Item.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Browser Close",
  "keyword": "Then "
});
formatter.match({
  "location": "_5DInstitut.Steps.Test_BoQ_Line_Item.browser_close()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.embedding("image/png", "embedded0.png", "Testing_Submodule_-_BoQ_Line_Item");
formatter.after({
  "status": "passed"
});
});
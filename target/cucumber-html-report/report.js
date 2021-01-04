$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Patient_injection_Enrollment.feature");
formatter.feature({
  "line": 1,
  "name": "Test patient injection enrollment feature",
  "description": "",
  "id": "test-patient-injection-enrollment-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test Patient Injection enrollment scenario",
  "description": "",
  "id": "test-patient-injection-enrollment-feature;test-patient-injection-enrollment-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open xolair sites",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click enrollment button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "select patients",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "select patients not enrolled before",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I apply for injection",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Select eligibilities question",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter patients info",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter insurances info",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I fill in the prescriber info",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I fill in the site of cares information",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I confirm the information",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click confirm button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.i_open_xolair_sites()"
});
formatter.result({
  "duration": 43229568700,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d81.0.4044.138)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-C3UG4MO\u0027, ip: \u0027192.168.1.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\ubox0\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 81.0.4044.138, webStorageEnabled: true}\nSession ID: 9cd9f91f3e73346cd641afdd2672a79b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions.deleteAllCookies(RemoteWebDriver.java:687)\r\n\tat stEPdeFinatiOn.Patient_Injection_EnrollmentTest.i_open_xolair_sites(Patient_Injection_EnrollmentTest.java:27)\r\n\tat ✽.Given I open xolair sites(Patient_injection_Enrollment.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.click_enrollment_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.select_patients()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.select_patients_not_enrolled_before()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.i_apply_for_injection()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.select_eligibilities_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.enter_patients_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.enter_insurances_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.i_fill_in_the_prescriber_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.i_fill_in_the_site_of_cares_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.i_confirm_the_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.click_confirm_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Patient_Injection_EnrollmentTest.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});
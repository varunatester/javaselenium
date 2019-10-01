JavaSelenium Sample Application
====================================

**Introduction:**

This project is to demonstrate creating a test framework for amazon.com
  * IDE Used: **Intellij** Community Edition
  * Programming language: **JAVA**
  * Browser Driver Tool: **Selenium**
  * Build/Dependency Management Tool: **Gradle**

**Prerequisties:**

 * Java 1.8 or above
 * Chrome Driver : brew install chromedriver
 * Gradle : brew install gradle
 * Install lombok plugin to run tests from Intellij and enable annotation processor
 "Settings > Build > Compiler > Annotation Processors"


**Testing Notes:**

* Tested on platform Mac 10.11.6 and browser Chrome 56.0.

**Assumption made**

* 

**Notes**

* Please make sure you have decent internet speed during test run.

**How to run test:**

* Run tests through IDE :
       1. Right click the SearchItemTests file and run. This will run all the tests in the file.
       2. Run specific annotated scenario : Navigate to SanityTests task in build.gradle right pane and double click the task.

* Run tests through command line :
     1.Go to folder location where code is checkout, Run the test using command :gradle SanityTests.
* Check Reports :
     1.Reports can be seen under javaselenium/build/reports/tests/SanityTests/packages/tests.html
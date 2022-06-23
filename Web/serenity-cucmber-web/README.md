# Selenium with Serenity and Cucumber example

This project demonstrates usage of Serenity and Cucumber for Web Automation with Java.

This example will cover:

Basic Test for Web Automation using Serenity and Cucumber and Selenium with Java as programming language and IntelliJ as IDE

## Steps to run demo test
1-make sure java ,Intellij and Gradle are installed , for more information visit our documentation page:
[link to docs]

2-Clone this git repository
```
git clone
```
3-provide your cloud url and accessKey in serenity.properties file:
```
webdriver.remote.url=<CLOUD_URL/wd/hub>
webdriver.accessKey=<ACCESSKEY>
```
4-add webdriver capabilities and continuous testing capabilities in serenity.properties file, for example:
```
webdriver.browserType=chrome
webdriver.agentName=tokyo
webdriver.generateVideo=true
```
5-run the following command from your terminal:
```
gradle test
```
### Project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
      +Experitest
        +Pages                    Page Objets
          +GooglePage
        +Steps                    Scenario Steps implementations
          +GoogleSearchSteps
        ExperitestTestSuite       
    + resources
      + features                  Feature files
        + search                  Feature file subdirectories
             search_in_google.feature
```


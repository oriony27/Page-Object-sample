# Formy Project Sample

https://formy-project.herokuapp.com

This project is sample of Page Object pattern and work with such components as:
  - Autocomplete
  - Buttons and Links
  - Checkboxes
  - Datepicker 
  - Drag and Drop
  - Dropdowns
  - Enabled and Disabled elements
  - File Upload
  - Radio buttons
  - Modal windows
  - Page scrolling
  - Switching on alert and new browser tab

### Tech

Technologies that used in project:
* [Java 8](https://www.java.com/ru/)
* [Selenium Web Driver](https://www.selenium.dev)
* [JUnit 5](https://junit.org/junit5/)
* [Allure Framework](https://docs.qameta.io/allure/)

### How to run

If you want to run project:

```sh
$ cd Page-Object-sample.
$ chmod +x gradlew
$ chmod +x ./scripts/runTests.sh (if you want to run tests without report generation)
$ chmod +x ./scripts/runTestsWithReport.sh (if you want to run tests with report generation)
$ sh ./scripts/runTests.sh or sh ./scripts/runTestsWithReport.sh
```
### How to check report

Navigate to .build folder, open reports/allure-report. Then open index.html file in any browser
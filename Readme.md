# Weather Reporting Comparator

This is a multi module weather comparator project to compare weather attributes extracted from UI with API. The project has separate layers to independently run Automated test on UI as well as API. Executing the complete project does following,

1.  Creates Weather Object
2.  Run the UI automation suite
3.  Run the API automation suite
4.  Compares weather object attributes extracted from step 2 & 3.
	
Project Modules:
----------------------
**UI Automation**
- An automated UI testing suite written in cucumber BDD

**API automation**
- An automated API testing suite built using REST assured library

**Object comparator**
- A comparator module for Weather object which is extended to perform comparison based on magnitude of variance.
- This module can be extended to perform custom object comparison. 

**Object Model/Creator**
- A Weather information data model created using simple Pojo's which produce object of type Weather.
- The attributes of this object can be ``Temperature``, ``Humidity``, ``Wind``, etc.	
	
API Information:
----------------------
- The public weather API by https://openweathermap.org/

UI Information:
----------------------
- Website - https://www.ndtv.com/
- Section - Weather

Setup Instructions (Macbook)
----------------------

1. Download and install intelliJ (https://www.jetbrains.com/idea/download/#section=mac)
2. Clone this repo (Make sure you are on Master branch):
```
https://github.com/ShoaibShaikh-SSH/GUI-API-ComparatorAutomation.git
```
3. Import cloned repo in step 2 as Maven project in IntelliJ:
	- File->Import->Project from existing sources 
	- Choose `GUI-API-ComparatorAutomation->pom.xml` and open as a project
4. Install Maven. Run following command in terminal -> ```brew install maven``` (Pre requisite: brew should be present in the system)
5. Install Allure. Run following command in terminal -> ```brew install allure```

Tests can be executed through Terminal / IntelliJ 
----------------------

Run Automated Tests of whole project - Separate UI & API automated tests along with Weather object comparator 
----------------------
1. Navigate to 'GUI-API-ComparatorAutomation' folder from terminal window
2. Run following command -> ``` mvn clean test```

Reporting - Allure reports
----------------------
1. From 'GUI-API-ComparatorAutomation' folder ->go to 'APImodule' / 'WeatherObjectComparator'-> navigate to 'target' folder from terminal
2. Run following command -> ```allure serve allure-results```
3. An Allure report will open in browser with the last run report.

Reporting - Cucumber
----------------------
Navigate to 'GUI-API-ComparatorAutomation' -> 'UImodule' -> 'target' -> 'cucumber' & open index.html (Open in one of the browsers)

Tools/Tech stack
----------------------
- Cucumber
- REST-assured
- Maven
- Junit5
- Allure Reports
- Java
- IntelliJ
- Git
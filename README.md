# UI and API tests for Robo.finance

## Technology Stack
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Java.png "Java")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Selenide.png "Selenide")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Rest-Assured.png "REST-Assured")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Gradle.png "Gradle")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/JUnit5.png "JUnit 5")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Allure_Report.png "Allure Report")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/AllureTestOps.png "Allure TestOps")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Jira.png "JIRA")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Telegram.png "Telegram Bot")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Jenkins.png "Jenkins")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Selenoid.png "Selenoid")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Intelij_IDEA.png "IntelliJ IDEA")
![](https://github.com/dubograev/robofinance_tests/blob/master/src/test/resources/files/icons/Github.png "GitHub")

This project has written in [Java](https://go.java/) using [Selenide](https://selenide.org/) framework for UI-tests 
and [REST-Assured](https://rest-assured.io/) for API-test. [Gradle](https://gradle.org/) is used to build the project.
[JUnit 5](https://junit.org/junit5/) is used as a unit-testing framework. [Allure Report](http://allure.qatools.ru/), 
[Allure TestOps](https://docs.qameta.io/allure-testops/), [Jira](https://www.atlassian.com/software/jira) and 
[Telegram Bot](https://github.com/qa-guru/allure-notifications) are used to visualize test results. Tests are launched 
from [Jenkins](https://github.com/EIOmelyashchik/qa_guru_final_project/blob/master). [Selenoid](https://aerokube.com/selenoid/) 
is used to run browsers in [Docker containers](https://www.docker.com/resources/what-container).


## Description
You can run tests by configuring the following parameters:
- browser (chrome is by default)
- browserVersion (89.0 is by default)
- browserSize (1920x1080 is by default)
- browserMobileView (mobile device name, for example iPhone X)
- remoteDriverUrl (url address from selenoid or grid)
- videoStorage (url address where you should get video)
- threads (number of threads)

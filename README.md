# Spring maven multi modules (Maven, Junit, Surefire, Thymeleaf)
Maven, Spring MVC, thymeleaf, a simple MVC web app to hash a string with either MD5 or the SHA-256 algorithm.

## 1. Technologies and tools used:
* Java 17
* Spring 5.3.25
* Thymeleaf 3.1.1.RELEASE
* Embedded Jetty Server 11.0.13
* Spring Tool Suite 4
* Maven 3.9
* Spring Test 5.3.25
* JUnit 5.9.2
* Surefire 3.0.0-M9

## 2. How to run this project?
```
$ git clone https://github.com/ted19/spring-maven-multi-modules.git
$ cd spring-maven-multi-modules
$ mvn install
$ mvn -pl web jetty:run
$ visit http://localhost:8080
```
Output
```
Input 123456
Algorithm md5
e10adc3949ba59abbe56e057f20f883e
```

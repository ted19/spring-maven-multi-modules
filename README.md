# Spring maven multi modules (Maven, HSQLDB, JSP)
Maven, Spring MVC, thymeleaf, a simple MVC web app to hash a string with either MD5 or the SHA-256 algorithm.

## How to run this project?
```
$ git clone https://github.com/ted19/spring-maven-multi-modules.git
$ cd spring-maven-multi-modules
$ mvn install
$ mvn -pl web jetty:run
```
Output
```
Input 123456
Algorithm md5
e10adc3949ba59abbe56e057f20f883e
```

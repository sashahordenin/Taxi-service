# Taxi service

## Table of contents

* [General info](#general-info)
* [Features](#features)
* [Technologies](#technologies)
* [Installation](#installation)

<a id="general-info"></a>
## General info

Taxi service App is a web-app, built based on SOLID
principles, with connection to database powered by JDBC.

<a id="features"></a>
## Features:

- Support registration, authentication, authorization and logout processes
- Display all drivers as table (with opportunity to delete certain driver)
- Display all cars (with opportunity to delete certain car)
- Display all manufacturers (with opportunity to delete certain manufacturer)
- Display all cars by logged in driver (our user) (with opportunity to delete driver from list of the car's drivers)
- Create new driver
- Create new car
- Create new manufacturer
- Add driver to car

<a id="technologies"></a>
## Technologies:

- Java (JDK version 11)
- MySQL database
- Tomcat - web-server (version 9.0.54)
- Javax Servlet API (version 4.0)
- JSP (Java Server Page)
- JSTL (JSP Standard Tag Library) (version 1.2)
- Maven (version 3.6.3)

<a id="installation"></a>
## Installation:

1. Install MySQL
2. Install Tomcat (version 9.0.54)
3. Fork this project to your repository and clone to your IDE
4. Open init_db.sql file by path src/main/resources. Copy all SQL code and run it in your MySQL WorkBench. You will creat your own taxi service scheme with all needed tables and columns
5.  By default, in pom.xml file is already exist dependencies for mySQL connector. Open ConnectionUtil.java by path src/main/java/mate/util. Here you can configure your JDBC connection by editing next fields:
```sh
private static final String URL = "YOUR DATABASE URL";
private static final String USERNAME = "YOUR USERNAME";
private static final String PASSWORD = "YOUR PASSWORD";
private static final String JDBC_DRIVER = "YOUR DRIVER";
```
6. Add configuration of your installed TomCat's local server to the IDE
7. Run you project. You must be redirected to login page. Here you can go to register page or create driver particularly from your database.
8. After driver was created you can log in. If authentication was successful you will be redirected to index page, where you have access to all described features of taxi service App.

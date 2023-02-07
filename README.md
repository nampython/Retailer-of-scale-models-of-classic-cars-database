# Retailer of scale models of classic cars database
I created a project to query data based on data simple (). It mainly uses JDBC to query data and is divided to 3 modules (App, Logic, DAO). This project helps to learn how to write some important functions to query, process, and mapping data and how to organize your code. Apply  knowledge based on the tutorial at  https://www.mysqltutorial.org/mysql-basics/ including query data, join table, prepared statement, Stored Procedures

## Table of Contents
* [General Information](#general-information)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Getting Started](#getting-started)
* [More info](#more-info)

## General Information
My goal for this project is just simply leaning the components of a real project when you could work as a Java developer. This project is divided into 3 modules:

### **Dao:**  https://github.com/nampython/dao.git

This module Interacts directly with JDBC to query data. **Create functions to cover all possible cases in the case of getting data and saving data**

### **Logic**: https://github.com/nampython/logic.git

Contain the logic business of the app. This module uses the created functions in Dao to query data and write logic business based on the requirements

### **App**: https://github.com/nampython/Retailer-of-scale-models-of-classic-cars-database.git

This module contains all of the configs for project like Datasource, Swagger configs and contains a ComponentScan class to scan all of the components in the project. Besides, it contains some API endpoint to expose to the client.

## Prerequisites
**TODO:**
- Learned tutorials at h[ttps://www.mysqltutorial.org/mysql-stored-procedure-tutorial.aspx](https://www.mysqltutorial.org/mysql-stored-procedure-tutorial.aspx)
- Having aware of JDBC [https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html](https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html)
- Basic Spring Core
- Basic API


## Installation
Because this project is divided into 3 modules Dao, Logic, and App. You need to build Dao and Logic before running App.

**Build Dao**
```xml
mvn clean build
```
After building dao successuffly, we received a dependencey in m2 folder. We will coppy this dependecy into file pom of logic.
```xml
<dependency>
   <groupId>com.example</groupId>
   <artifactId>dao</artifactId>
    <version>13.05.20</version>
</dependency>
```
**Build Logic**
We still use this command to build the logic source code.

```xml
mvn clean build
```
Coppy dependecy’s logic into file pom of app.
```xml
<dependency>
    <groupId>org.example</groupId>
    <artifactId>logic</artifactId>
    <version>13.05.20</version>
</dependency>
```
Finally, we build the app by using this command
```xml
mvn clean package
```

## Getting Started

Run spring boot with this command
```xml
mvn spring-boot:run
```
After running successfully, you can test the API endpoints by using the Swagger UI in the link below
```xml
http://localhost:8080/swagger-ui/index.html#/
```

## More info
This project is unfinished and still has a lot of features to develop. I really appreciate it if someone contributes, gives suggestions to improve. For me,  this project is only for beginners and those who want to learn how to structure code in a real project, and how to use JDBC to query data. Learn some **weaknesses** if developing this project in the direct monolithic.

If you are having trouble running the app, contact me at [quangnam130520@gmail.com](mailto:quangnam130520@gmail.com)

# Limit Order Book

##Design an implement a REST API in Java that provides the functionality of a Limit Order Book.
##Use the existing Spring dependencies (like Web, JPA , Spring Boot) provided in the Maven pom.xml file included in the quickstart
##The following are the REST endpoints (Choose more appropriate endpoints if needed):

###/getOrders    - lists all the orders that have not been executed yet.
###/addOrder     - adds a new order to the Order Book 
###/cancelOrder  - deletes the order from the Order Book.
###/execute      - picks the top priority order from the order book and executes it 

Please use an in-memory RDBMS like H2 or HSQL .

To run the API, you'll use the following command. More information about testing and running Spring Boot applications can be found in the Spring documentation online.

    mvn spring-boot:run   
    
You will have 48 hours to submit your solution.	

-------------------
#### Expectations

The basic expectation of this assignment is that you will use Spring Boot and Spring Web to build a RESTful API -- you may want to take a look at this guide if you haven't used the Spring Java Config annotations to build web services in the past: https://spring.io/guides/gs/rest-service/

1. The API should use an in memory relational database, such as H2 or HSQL 
2. It should take advantage of Spring Boot's embedded servlet container to run and test the resources.
3. It does NOT need to provide any security or authentication
4. It should use Maven for dependency and build management
5. It should follow common Java best practices in terms of documentation, style, and use of collections and design patterns
6. It should use JDK version 1.7 or 1.8.
7. Some basic exception handling should be provided, including use of standard HTTP status codes to indicate when a query parameter is unacceptable, for example
8. To test out the API you can use Postman App (www.getpostman.com).

--------------------
#### General Advice

If you feel that any information is missing or unclear, then please make a choice that makes sense for you and provide the reason of your choice, either in the code or in an attached document. 

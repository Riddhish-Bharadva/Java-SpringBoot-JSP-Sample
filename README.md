# Java-SpringBoot-JSP-Sample
This project demonstrates how to consume JSON data using an endpoint developed using Spring boot and display on a web page developed using JSP.

Please follow below steps to run this project:
1) Download the project and save it locally in your system.
2) Open project appropriately in eclipse.
3) Now click on Project and run as "Spring Boot App" or type: "spring-boot:run".
4) Once the project iss started successfully, use PostMan to send JSON data to endpoint : "http://localhost:8085/DataController". Please note: I have changed port to 8085 so run the project using http://localhost:8085.
5) You can view the sent data at any point of time while execution of this project using url: "http://localhost:8085/ViewController".

Project details:

1) I have created a POJO class(named Data.class) to convert and consume JSON data into Java object.
2) I have created a REST Controller to be called to consume data passed in the form of JSON data. Spring Boot is used to handle POST request on this API and it also handles conversion of JSON data into java object.
3) This JSON data after conversion into java object, will be stored in a List<Objects>. I am using List<Objects> to imitate the database we can use JDBC or JPA or hibernate to store data in MySQL, Oracle, PostGRE, etc.
4) Once stored, I have created ViewController.class to handle requests while viewing data from URL: "http://localhost:8085/ViewController". User will be redirected to "http://localhost:8085/ViewData.jsp" along with list of objects we created while handling data consumption in above steps.
5) In ViewData.jsp a code handles if list of objects is empty, a message will be displayed else all the data in list will be displayed on the JSP page.


Thank you.

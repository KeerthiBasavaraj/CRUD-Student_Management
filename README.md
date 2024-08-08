This project is built using SpringBoot, Data JPA, MySQL to create a API endpoints and tested the application by using Postman. According to the requirements given, I have performed CRUD operations on Student Management.

SYSTEM REQUIREMENTS

1.Spring Tool Suite4

2.Mysql Server

STEPS TO IMPORT PROJECT INTO STS

1.Import the CRUD-Student_Management directory into the STS workspace.

2.Traverse from /CRUD-Student_Management/src/main/resources/application.properties

3.Here in line number 2, 4 and 5, provide your mysql schema name, username and password.

STEPS TO RUN THE PROJECT

1.Right click on the project.

2.Select Run As..

3.Select Spring Boot App.

4.Open Postman Application.

API ENDPOINTS FOR STUDENT CRUD OPERATION

1.CREATE : localhost:8080/register

2.VIEW : localhost:8080/display

3.EDIT : localhost:8080/edit/{id}

4.DELETE : localhost:8080/delete/{id}

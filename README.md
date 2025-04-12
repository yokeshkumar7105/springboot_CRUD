# 🍃Springboot CRUD Operations


### C &#8594; CREATE &#8594; POST

### R &#8594; READ &#8594; GET

### U &#8594; UPDATE &#8594; PUT

### D &#8594; DELETE &#8594; DELETE

This repository contains the hands-on files of basic CRUD operations* done using springboot. The code gives the detailed view on how <b>GET</b>, <b>POST</b>, <b>PUT</b> and <b>DELETE</b> operations work. This repo contains the code with logic bound by static data. All the business logics given in service class is bound by static data.

## 📍CRUD and its Operations
<table>
  <tr>
    <th>Operation🛠️</th>
    <th>Description📝</th>
    <th>Terms🌱</th>
  </tr>

  <tr>
    <td>GET(READ)</td>
    <td>Used to retrieve data from server without modifying it</td>
    <td>@GetMapping()</td>
  </tr>

  <tr>
    <td>POST(Create)</td>
    <td>Used to create new data on the server</td>
    <td>@PostMapping()</td>
  </tr>

  <tr>
    <td>PUT(UPDATE)</td>
    <td>Used to modify the data on the server</td>
    <td>@PutMapping()</td>
  </tr>

  <tr>
    <td>DELETE</td>
    <td>Used to delete the selected data from the server</td>
    <td>@DeleteMapping()</td>
  </tr>
</table>

## 📍Example used in this repo

✅StudentController get the request from client(eg: Postman) and sends the request to StudentService to process. 

✅StudentService uses business logic to process and returns to controller. 

✅Here, the request and response is done through JSON format.

✅Controller maintains the path and gets request while service satisfies the request.

## 📍File Structure
```├── .gitattributes
├── .gitignore
├── .mvn
    └── wrapper
    │   └── maven-wrapper.properties
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
    ├── main
        ├── java
        │   └── com
        │   │   └── example
        │   │       └── httpmethods
        │   │           ├── HttpmethodsApplication.java
        │   │           ├── controller
        │   │               └── StudentController.java
        │   │           ├── model
        │   │               └── Student.java
        │   │           └── service
        │   │               └── StudentService.java
        └── resources
        │   └── application.properties
    └── test
        └── java
            └── com
                └── example
                    └── httpmethods
                        └── HttpmethodsApplicationTests.java
```

<i>*This project is solely intended for learning and understanding CRUD concepts in Spring Boot and is not meant for real-world usage.</i>


















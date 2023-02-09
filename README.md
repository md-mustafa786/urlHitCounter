## URL_Hit_Counter 
### Requirments
 * IntelliJIDEA
 * Serverport: 8080 (use: localhost:8080)
 * Java version: 17
 * Everything is present in the pom.xml (no need to download any library)
### Steps to run User Management System 
 * Download the source code and import in intellijIDEA.
 * Go to localhost:8080/
 * Type endpoints in 
 URL
 
### In this counter feature there is 
when the user will hit the url he will get the number of counts hit - 
##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint -api/v1/visitors-count
  * The value of the count will keep incrementing as long as the user keeps hitting the URL.


### In addition, we also have the username and counts hit when the particular user hits the URL he will get a number of counts with the username.

In this we have -
 * A HashMap of username and count
##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - api/v1/visitors-count/username/{username}/count
 

### Note
* You can change server port by setting properties in application.properties file i.e.

        server.port=8081

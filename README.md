# ENSAT_WS
ENSAT webservice to connect mobile application
-- ENSAT RestFul Webservice Module --

System Requirements:
===============================================
Netbeans 8.0.2 or later

Glassfish application server

JAVA JDK 1.7 or later

MySQL database and JDBC connection


Instructions to compile and Run the web service:
===============================================

Start MySQL Server and create ENSAT database if it not exist before

Open ENSAT_WS project in Netbeans 8.02 or later

Change the configuration detail in glassfish-resources.xml file inside the Server Resources

- serverName

- portNumber

- User

- Password

- MySqlConnectionString


Start glassfish server

Deploy the webservice and get URL with localhost or server IP address

Change Webservice URL variable value in Android application AppConstant class 
(Example: http://192.168.1.105:8080/ENSAT_WS/api/accbiomaterialaliquotstransfer)  
192.168.1.105 is your machine IP address or server IP address

Keep webservcie running and run the android web application

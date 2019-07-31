# WeatherApp
DBS test Project

Please set up the Mongo DB with default host, port, db-name as shown below or you can change the below deatils by editing the application.properties file based on your Mongo DB properties <br>
spring.data.mongodb.host=localhost  <br>
spring.data.mongodb.port=27017  <br>
spring.data.mongodb.database=weather-db  <br>
-> Please run the application on default port 8080  <br>
use the below url to access this application <br>
http://localhost:8080/weather <br>
You can search the city weather by entering city names (The City names are hardcoded and I tried to make it dynamic using google GeoCode API butI did not worked due to Billing). <br>
City Names :<br>
Campbell <br>
Omaha <br>
Austin <br>
Niseko <br>
Nara <br>
Jakarta  <br>
<br>
1)The application will display the temperature if entered City is exist in the above list else blank page. <br>
2)To fetch weather information for entered city, the DarkSky api is used <br>
3)The entire response of DarkSky API is persisted in Mongo DB table/collection <br>
4)For entered City, the application will verify the data in Mongo DB table first and it will return data if it is found in the table else it will invoke the DarkSky API and persist data in table then it will return the data to UI.<br>
5)All DarkSky api request parameters and timestamp are logged/persisted in Mongo DB table/collection. <br>
6)Logger is implemented <br>
7)UI validation is implemented through Spring validator framework. <br>



# Spring Boot Caching With Redis

Project that illustrates caching mechanism with Redis in-memory database. It uses dummy data about insurances
that are loaded through CSV file. Those data are only for demo purpose.


## Running the project

1. Install Redis on your local machine. You can find the installation steps on this link: 
https://redis.io/topics/quickstart
2. Create database with name ``redis``
3. Open terminal and navigate to project directory
4. Run command: ```mvn clean install -DskipTests```


## Configuring Redis properties into Spring Boot project

1. Open **application.yml** file  
2. Find *redis* prefix and set **host** and **port** properties  

**NOTE:** By default application will use host=localhost and port=6379.


## Start and check running state of Redis

1. Open your terminal
2. Run command ```redis-server```
3. Open new tab in terminal
4. Run command ```redis-cli ping```. If response to this command is **PONG**, your redis server is running ok.


## Basic Redis commands

You can find basic Redis commands on this link: https://redis.io/commands


## Packaging application

1. Open your terminal and navigate to project directory
2. Run command: ```mvn clean package -DskipTests``` 

## Author

Heril Muratović  
Software Engineer  
<br>
**Mobile**: +38269657962  
**E-mail**: hedzaprog@gmail.com  
**Skype**: hedza06  
**Twitter**: hedzakirk  
**LinkedIn**: https://www.linkedin.com/in/heril-muratovi%C4%87-021097132/  
**StackOverflow**: https://stackoverflow.com/users/4078505/heril-muratovic
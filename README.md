# Author
## DennisKingsman
# Resource 
## https://www.youtube.com/playlist?list=PL4TnYdea-xTI-vUWgIoaDQOpC4PlK31md
# Process
Step 1  
Download zookeeper docker image  
[docker-hub](https://hub.docker.com/r/lensesio/fast-data-dev)  
[git-hub-instructions](https://github.com/lensesio/fast-data-dev)  
Start project and use postman to send `post` request to  
```
http://localhost:8086/publish?message=Hello
```
Step 2 described in related repository   

Step 3  
Create docker-compose file  
you will need the next docker images  
[zookeeper](https://hub.docker.com/r/wurstmeister/zookeeper/)  
[kafka](https://hub.docker.com/r/wurstmeister/kafka)  
Start it with `docker-compose up -d`  
And test it the same way which in Step 1  
# Related repository
[KafkaCloudStreamRabbitMq](https://github.com/DennisKingsman/KafkaCloudStreamRabbitMq)
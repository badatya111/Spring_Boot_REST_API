# Spring_Boot_REST_API
How to set the MongoDB for the first time
1) Step :1
docker pull mongo
docker images
docker image ls
docker container ls
docker ps
docker container ps
2) Step :2
Create folder below structure
c:\user\name\mongodb
Create .env file and past this in that file MONGO_HOST_DATA=/mongodb
c:\user\name\mongodb\db

3) Step :3
Unser mongodb folder
create docker-compose.yaml file
And add below data :

version: '3'
services:
Mongo:
container_name: mongo
image: mongo:latest
environment:
- AUTH=yes
- MONGO_INITDB_ROOT_USERNAME=admin
- MONGO_INITDB_ROOT_PASSWORD=p@ssw0rd
volumes:
- ${MONGO_HOST_DATA}/db:/data/db
ports:
- "27017:27017"

4) Step : 4
Open up PowerShell and execute
docker-compose up
5) Step : 5
Open studio 3t and pass the below url :
mongodb://admin:p%40ssw0rd@localhost:27017/?authSource=admin

Enter Connection name
Test the connection once connection is successful then Save it
For reference : https://www.linkedin.com/pulse/setup-mongodb-docker-linux-container-windows-10-volume-kumaran

Below are the basic docker cmd :

Print message in docker : docker run hello
Check list of image in docker : docker image ls
Check list of container : docker ps
Check list of container details : docker container ps
Stop container : docker container stop containerID
Delete container : docker container rm containerID
Add container : docker run --name local-mongo -p 27017 -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=kumar -d mongo

Check Swagger in local machine
localhost:8080/swagger-ui/

# keep-docker-running
This is Simple java API service which can be used to keep docker container running instead of writing shell script to wait.

Write this 
```
  java -jar keep-docker-running.jar
```
instead of 
```
  while true; do
    sleep 60
  done
```

##Benefits
* Need not write shell sleep command to keep docker running
* With this api service dependent docker service can identify that this container is running

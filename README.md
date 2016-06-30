# wildfly-swarm-multi-module-demo

## Usage

``` sh
$ ./mvnw clean package && and java -jar api/target/api-swarm.jar
```

``` sh
$ curl localhost:8080 
{"id":1,"name":"user1"}
```

## Related

https://groups.google.com/forum/#!msg/wildfly-swarm/mvvOYTDwQoE/fFnUN1OwBgAJ
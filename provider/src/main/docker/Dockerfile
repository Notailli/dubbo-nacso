FROM 172.22.50.227/system_containers/oraclejdk:8u301
MAINTAINER nnkwrik nnkwrik@gmail.com

VOLUME /tmp

ADD spring-boot-demo-dubbo-provider.jar dubbo-provider.jar

ENTRYPOINT ["java","-jar","/dubbo-provider.jar"]
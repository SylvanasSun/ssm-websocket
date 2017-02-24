### SSM WebSocket Example.

[![Build Status](https://travis-ci.org/SylvanasSun/ssm-websocket.svg?branch=master)](https://travis-ci.org/SylvanasSun/ssm-websocket)

使用JSR-356标准实现的WebSocket Chat Demo.

该Project搭建于jdk1.7&tomcat8,后端使用了SSM框架,前端使用了vue.js&bootstrap.

### Primary Dependency

```
        <dependency>
           <groupId>javax.websocket</groupId>
           <artifactId>javax.websocket-api</artifactId>
           <version>1.1</version>
       </dependency>
       <dependency>
           <groupId>org.springframework</groupId>
           <artifactId>spring-websocket</artifactId>
           <version>${spring.version}</version>
       </dependency>
       <dependency>
           <groupId>org.springframework</groupId>
           <artifactId>spring-messaging</artifactId>
           <version>${spring.version}</version>
       </dependency>
```

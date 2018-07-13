## 如何在Spring Boot 2 应用程序中使用携程Apollo配置中心

本文通过 Intellj IDEA 的 Spring Initializr 创建的 Spring 项目. 增加Apollo支持的详细步骤如下

假设项目的根目录为 

$PROJECT_ROOT=/User/test/demo-ctrip-apollo


```
# 创建要求的目录和文件, 并设置环境
mkdir $PROJECT_ROOT/META-INF
touch $PROJECT_ROOT/META-INF/app.properties
echo 'app.id=democtripapollo' > $PROJECT_ROOT/META-INF/app.properties

# 创建环境配置文件
touch /opt/settings/server.properties
echo 'env=dev' > /opt/settings/server.properties
```

添加到Apollo中的配置如下:

```
spring.application.name = spring-data-repository-fragment
server.port = 8083
spring.main.banner-mode = off
server.http2.enabled = true
spring.datasource.url = jdbc:mysql://127.0.0.1:3306/spring_data_repository_fragment?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&useSSL=false&createDatabaseIfNotExist=true
spring.datasource.username = root
spring.datasource.password = root
spring.datasource.driver-class-name = com.mysql.jdbc.Driver
spring.datasource.hikari.minimum-idle = 1
spring.datasource.hikari.maximum-pool-size = 100
spring.datasource.hikari.driver-class-name = com.mysql.jdbc.Driver
test = test111111111
```
![image](https://user-images.githubusercontent.com/725190/42687949-118055bc-86cd-11e8-8a52-97ca01a4c629.png)

![image](https://user-images.githubusercontent.com/725190/42687901-ed36a2f6-86cc-11e8-8aab-bbca1279fee5.png)


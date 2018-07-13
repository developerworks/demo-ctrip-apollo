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

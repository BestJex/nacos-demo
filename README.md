1、SpringCloud Alibaba-Nacos：注册中心（服务发现/注册）

2、SpringCloud Alibaba-Nacos：配置中心（动态配置管理）

3、SpringCloud-Feign：声明式HTTP客户端（调用远程服务）

# Nacos

下载安装包 https://github.com/alibaba/nacos/releases 选择zip文件

解压后运行命令 startup.cmd -m standalone（windows） 或 sh startup.sh -m standalone(Linux) 运行单机模式nacos

此时使用的是内嵌数据库，而我们需要使用mysql作为外置数据库，而且项目的配置文件也在配置中心设置了，导入nacos_config.sql到新建数据库nacos_config，修改解压后nacos目录下 conf/application.properties

```
#*************** Config Module Related Configurations ***************#
### If use MySQL as datasource:
spring.datasource.platform=mysql

### Count of DB:
db.num=1

### Connect URL of DB:
db.url.0=jdbc:mysql://127.0.0.1:3306/nacos_config?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true&useUnicode=true&useSSL=false&serverTimezone=UTC
db.user=root
db.password=123456
```

在 http://localhost:8848/nacos/ 访问nacos

默认使用nacos/nacos进行登录

如果需要修改配置文件，在nacos配置中心修改
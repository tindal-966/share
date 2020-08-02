# Tomcat 相关

## 官方安装说明
版本说明：Core 的 zip 版本

解压后在 README.md 中可以看到安装教程在 RUNNING.txt 文件中（与安装 JDK1.8 差不多）

> 实际上不建议添加 tomat 相关的环境变量，因为开发环境下可能使用多版本 tomcat。不设置环境变量时需要在 tomcat 目录下执行

## Tomcat 启动乱码
修改 `Tomcat安装目录/conf/logging.properties` 下的  `java.util.logging.ConsoleHandler.encoding = utf-8` 改为 `GBK` 即可

> 或在 Run->Edit Configurations->Tomcat server->VM Options 加上 `-Dfile.encoding=UTF-8` （未经测试）
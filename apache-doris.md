# Apache Doris
> [https://doris.apache.org/zh-CN/](https://doris.apache.org/zh-CN/)
> 
> 以下内容可能已经过时，建议参考官方文档

## 编译 Doris 有关
1. 使用镜像地址下载 Doris 源码

   例：下载 1.13.0 推荐的是清华的镜像地址 `wget https://mirrors.tuna.tsinghua.edu.cn/apache/incubator/doris/0.13.0-incubating/apache-doris-0.13.0-incubating-src.tar.gz`

## 常见问题
1. 根据官方 CentOS 安装 Docker 方法提示 `File "/bin/yum-config-manager", line 135 except yum.Errors.RepoError, e:`

   `yum-config-manager` 依赖 python 2.x，如果系统默认的版本不是 2.x 则提示报错，参考 [这里](https://www.wonder1999.com/index.php/archives/427.html) 解决

   > 可以使用 `python --version` 查看当前系统 python 的默认版本
2. 编译过程中出现 Maven 下载依赖找不到的情况
    - `net.sourceforge.czt.dev:cup-maven-plugin:1.6-cdh`
    - `org.codehaus.mojo:exec-maven-plugin:3.0.0`

   具体错误提示如下：
    ``` shell script
    Plugin net.sourceforge.czt.dev:cup-maven-plugin:1.6-cdh or one of its dependencies could not be resolved: Failed to read artifact descriptor for net.sourceforge.czt.dev:cup-maven-plugin:jar:1.6-cdh: Could not transfer artifact net.sourceforge.czt.dev:cup-maven-plugin:pom:1.6-cdh from/to spring-plugins (https://repo.spring.io/plugins-release/): Authentication failed for https://repo.spring.io/plugins-release/net/sourceforge/czt/dev/cup-maven-plugin/1.6-cdh/cup-maven-plugin-1.6-cdh.pom 401 Unauthorized

    Plugin org.codehaus.mojo:exec-maven-plugin:3.0.0 or one of its dependencies could not be resolved: Failed to read artifact descriptor for org.codehaus.mojo:exec-maven-plugin:jar:3.0.0: Could not transfer artifact org.codehaus.mojo:mojo-parent:pom:50 from/to spring-plugins (https://repo.spring.io/plugins-release/): Authentication failed for https://repo.spring.io/plugins-release/org/codehaus/mojo/mojo-parent/50/mojo-parent-50.pom 401 Unauthorized
    ```

    - [官方解决方案](https://github.com/apache/incubator-doris/pull/4636#issuecomment-707635045)
      > 确认有效

    - 其他解决方案（比较麻烦，但是可以作为思路）
      貌似 [仓库](https://mvnrepository.com/) 都有这些包，但是下载不到（第一个是因为官方库跳的是三方下载，第三方打不开了）

      解决：查到 https://maven.aliyun.com 有之后，通过在本地随便一个 maven 项目添加对应依赖然后手动将包放到 `.m2/repository` 仓库下，另，需要删除包中的 `_remote.repositories` 文件，否则依旧请求下载，参考 [这里](https://www.jianshu.com/p/edb92a816519)
      > 关于 `_remote.repositories` 的更多 [参考](https://blog.csdn.net/lovepeacee/article/details/103094247)
3. 启动 BE 失败，报 `E0329 10:53:59.341493 24618 storage_engine.cpp:366] File descriptor number is less than 60000. Please use (ulimit -n) to set a value equal or greater than 60000`

   直接在 Linux 中执行一下 `ulimit -n 65536` 即可
   > 参考了官方的 [常见问题](http://doris.apache.org/master/zh-CN/installing/install-deploy.html#%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98) 的第 5 个来解决

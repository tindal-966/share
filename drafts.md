### trans
- [Improve your code by separating mechanism from policy](https://lambdaisland.com/blog/2022-03-10-mechanism-vs-policy)
- [The Most Important Performance Management Rule For Software Engineers](https://staysaasy.com/startups/2022/04/03/performance-management.html)
- [7 Reasons Your Growth Startup Is Hiring Too Junior](https://staysaasy.com/management/2020/09/11/Hiring-Too-Junior.html)
- [Professional Programming: The First 10 Years](https://thorstenball.com/blog/2022/05/17/professional-programming-the-first-10-years/)
- [Metrics, tracing, and logging](https://peter.bourgon.org/blog/2017/02/21/metrics-tracing-and-logging.html)
    > [OpenTelemetry](https://opentelemetry.io/)

### note
- Manjaro 配置
    1. pacman-mirrors 换中国源
    2. pacman -Syu 更新系统
    3. 安装中文输入法 `manjaro-asian-input-support-fcitx5`
    4. 设置 swap（4G 内存设 8G swap 支撑多任务）

        [参考](https://wiki.archlinux.org/title/Swap#Swap_file)
    5. 安装必要软件
        - chromium 导入书签，安装插件之类的
        - Code - oss(Visual Code) 安装插件之类的
        - Vim
        - DBeaver
        - IntelliJ Idea
    6. 启用 TimeShift 并进行第一次备份
    7. 启用 AUR 并安装 AUR 软件
        - netease cloud music
        - WPS
        - xunlei
    8. 可选软件包
        - 图标 Papirus（个人觉得换个图标就够看了）
        - 离线词典 Artha
- 一种基于已有 markdown 文档做笔记的方式（模仿 PDF 的操作）
    > 未验证
    - 高亮操作，为选中的内容添加 `<div class="highlight">高亮内容</div>`
    - 笔记操作，为选中的内容添加 `<div class="note">笔记内容</div>`
    - 高亮+笔记（即批注）操作，为选中的内容添加 `<div calss="highlight"><div class="note">笔记内容</div>高亮内容</div>`
- K8s 集群打包方案 https://github.com/fanux
- [confd](https://github.com/kelseyhightower/confd) 操作系统级别的配置中心（类似微服务的配置中心）
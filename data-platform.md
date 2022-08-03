# Data Platform

## 开源项目
| 序号 | 项目名 | 项目简介 | 技术栈 | 核心功能 | 应用场景 |
| ---- | ---- | ---- | ---- | ---- | ---- |
|  1 | [Scriptis - 微众](https://github.com/WeBankFinTech/Scriptis) | Scriptis 是一款支持在线写 SQL、Pyspark、HiveQL 等脚本，提交给 [Linkis](https://github.com/WeBankFinTech/Linkis/blob/master/docs/zh_CN/README.md) 执行的数据分析 Web 工具，且支持 UDF、函数、资源管控和智能诊断等企业级特性。 |  | 脚本编辑/对接多计算引擎/执行日志/ | 建立调度任务前的测试\调试，因为多数任务调度工具的调试功能都比较弱，貌似执行类型还不多 |
|  2 | [DolphinScheduler - Apache](https://github.com/apache/incubator-dolphinscheduler) | 一个分布式易扩展的可视化 DAG(有向无环图) 工作流任务调度系统。致力于解决数据处理流程中错综复杂的依赖关系，使调度系统在数据处理流程中开箱即用 | | 分布式/可视化，简单易用/任务日志/高拓展 | 简单的 ETL（因为支持的执行类型比较少），貌似还可以作为运维工具 |
|  3 | [Griffin - Apache](http://griffin.apache.org/) <br/> [docs](http://griffin.apache.org/docs/quickstart-cn.html) | 开源的大数据数据质量解决方案，支持批处理和流模式两种数据质量检测方式，可以从不同维度（比如离线任务执行完毕后检查源端和目标端的数据数量是否一致、源表的数据空值数量等）度量数据资产，从而提升数据的准确度、可信度。 |  | 可配置、可自定义的数据质量验证/基于spark的数据分析，可以快速计算数据校验结果/历史数据质量趋势可视化。 | 数据质量监控 |
|  4 | [CDH - Cloudera](https://www.cloudera.com/products/open-source/apache-hadoop/key-cdh-components.html) | Hadoop 发行版，包括 Hive, Spark, HDFS, YARN, MR, ZK 等基础组件（对应阿里数据中台架构里面的 IaaS 部分） |  | 数据存储和基础分析 |  |
|  5 | [Flink - Apache](https://flink.apache.org/zh/) | 分布式流数据流引擎 |  | 流数据采集分析 | [更多](https://flink.apache.org/zh/usecases.html) （阿里使用了内部版本） |
|  6 | [dataX - Alibaba](https://github.com/alibaba/DataX) | DataX 是阿里巴巴集团内被广泛使用的离线数据同步工具/平台，实现包括 MySQL、Oracle、SqlServer、Postgre、HDFS、Hive、ADS、HBase、TableStore(OTS)、MaxCompute(ODPS)、DRDS 等各种异构数据源之间高效的数据同步功能。 |  | 离线数据同步工具/平台 | 异构数据源之间高效的数据同步 |
|  7 | [Flume - Apache](http://flume.apache.org/) | Flume 是一种分布式、可靠且可用的服务，用于有效地收集，聚合和移动大量日志数据。具有基于流数据流的简单灵活的体系结构，具有可调整的可靠性机制以及许多故障转移和恢复机制，具有强大的功能和容错能力。 |  | 实时场景的数据同步 | 用于有效地收集，聚合和移动大量日志数据，另外允许在线分析应用程序 |
|  8 | [Azkaban - Linkedin](https://azkaban.github.io/) | Azkaban 是 LinkedIn 为运行 Hadoop （不要求 Hadoop 环境）作业而创建的一个批处理工作流作业调度程序。Azkaban 通过作业依赖关系来解析排序，并提供一个易于使用的 web 用户界面来维护和跟踪您的工作流程。 | Java | 分布式调度 + 设计工作流程（xxl-job 没有设计工作这一块） | 二次开发容易 |
|  9 | [DataCleaner - HumanInterface](https://datacleaner.github.io/) & [source_code](https://github.com/datacleaner/DataCleaner) | DataCleaner 是一个数据质量工具包，可让您分析，更正和丰富您的数据。人们将其用于即时分析，重复清洗，并作为匹配和主数据管理解决方案的瑞士军刀。 | java | 数据质量分析（DQC） |  |
| 10 | [atlas - apache](https://atlas.apache.org/index.html#/) | Atlas 是一组可伸缩和可扩展的核心基础治理服务，使企业能够有效和高效地满足其在 Hadoop 中的遵从性需求，并允许与整个企业数据生态系统集成。 |  | 主要是元数据管理 | 据说部署比较难 |
| 11 | [DataHub - Linkedin](https://linkedin.github.io/datahub/) | DataHub 是LinkedIn 的通用元数据搜索和发现工具。 | | 元数据管理 | 社区活跃度不如 Atlas，其他介绍 [1](https://mp.weixin.qq.com/s?__biz=MzI0NTIxNzE1Ng==&mid=2651219955&idx=1&sn=ea613c4d8691deb509eed5d11255c637), [2](https://www.cnblogs.com/tree1123/p/12840871.html) |
| 12 | [DataGear](https://gitee.com/datagear/datagear) | DataGear提供了多种报表可视化分析界面 | | 数据可视化分析平台 | 支持多种数据库驱动、多种格式的数据集、多数据集聚合图表、插件式图表类型、丰富的看板API |
| 13 | [DataBand](https://gitee.com/475660/databand?_from=gitee_search) | DataBand是一个轻量级的大数据管理平台 | | 提供数据清洗、数据采集、数据分析、数据批处理等功能 | 目前该项目刚起步，可以持续关注 |
| 14 | [superset](https://superset.apache.org/) | superset是一个可视化的数据可视化开源项目 | | 可自助分析、自定义仪表盘、分析结果可视化（导出）、用户/角色权限控制、SQL编辑器生成可视化视图 | 可用余BI的分析报表 |
| 15 | [redash](https://redash.io/) | redash是一个可视化的数据分析工具| | 它主要的特点是支持非常多的数据源甚至json | 可用余BI的分析报表 |
| 16 | [Logstash](https://www.elastic.co/cn/logstash) | 数据采集框架| | 它主要的特点除了支持各种数据源外，还支持业务代码、流量入口、服务系统数据采集 | 可用于数据采集 |
| 17 | [OpenRefine](https://openrefine.org/) & [source code](https://github.com/OpenRefine/OpenRefine/) | 数据质控，数据分析工具| Java | 强大的聚类算法完成条目分组。在聚类完成后，分析即可开始 | 可用于临时大数据量的清洗分析。如对大量的 Excel、CSV 等格式数据进行第一步的清洗，也能处理数据库，但支持较少，PostgreSQL, MySQL, MariaDB, and SQLite |
| 18 | [plotly](https://plotly.com/python/reference/) | 数据可视化工具| | 具有多样化的可视化视图，快速的进行视图映射 | 可用于数据可视化进行分析数据 |
| 19 | [MetaModel - Apache](https://metamodel.apache.org/) | 不同类型数据源查询的通用接口 | java | 统一异构数据源的操作接口，支持关系型、非关系型、文本文件 | |
| 20 | [Kylin](http://kylin.apache.org/cn/) | Scan大量数据进行聚合分析 | |Cube 数据模型和 Cuboid 的算法 | 数据聚合分析 |
| 21 | [DBus](https://github.com/BriData/DBus) | 数据总线，DBUS源端数据采集、多租户数据分发、无侵入方式接入多种数据源、海量数据实时传输 | | 数据采集 | |
| 22 | [Open Source Data Quality and Profiling](https://sourceforge.net/projects/dataquality/) & [官网](http://www.arrahtech.com/) | 数据质控，该项目致力于开源数据质量和数据准备解决方案。数据质量包括策略定义的概要分析，过滤，治理，相似性检查，数据充实变更，实时警报，购物篮分析，气泡图仓库验证，单个客户视图等。| java | | |
| 23 | [Talend Open Studio for Data Quality](https://sourceforge.net/projects/talendprofiler/) & [官网](https://www.talend.com/products/data-quality/data-quality-open-studio/) & [source_code_1](https://github.com/Talend/data-quality) & [source_code_2](https://github.com/Talend/tdq-studio-se) | 数据质控，Open Studio for Data Quality 很容易连接到数百个数据源并生成分析，以帮助定义清理数据的下一步步骤。根据自定义的阈值评估数据质量，并度量与内部标准或外部标准的一致性。找出如何连接数据与模糊匹配或相关分析。| Java | | | 

## 技术资料

| 序号 | 分类 | 简介 | 链接 | 亮点 | 启发 | 
| ---- | --- | ---- | ---- | ---- | ---- |
|  1 | 产品 | 阿里数据中台架构图 | [点击查看](https://zhuanlan.zhihu.com/p/121047371) | 两幅阿里数据中台的架构图 | 1. **数据中台方法论** 中提到 `One ID`，可能与 EMPI 类似<br/>2. 日志是也数据中台管理的数据<br/> |
|  2 | 概念 | 数据仓库，数据平台，数据中台区别 | [点击查看](https://zhuanlan.zhihu.com/p/95550564) | 数据仓库，数据平台，数据中台区别 | 1. 数据仓库：输出报表；<br/>2. 数据平台：输出数据集<br/>3. 数据中台：输出 API<br/> |
|  3 | 实践 | 浙江移动的数据中台实践 | [点击查看](https://www.jianshu.com/p/f8a7c33709b3) | 数据中台的三个分层 | 三分层：<br/>1. 数据模型（大致等同数据仓库）<br/>2. 数据服务（封装常用服务，个性化交由数据开发）<br/>3. 数据开发<br/>`中台的中是相对的，没有绝对的标准` |
|  4 | 产品 | 科杰大数据-数据中台系列产品2.0 | [点击查看](http://www.keendata.com/news/19090702.html) | 分析了该厂数据中台包括产品（6个） | 我们已有部分产品，虽功能不够该厂的完善 |
|  5 | 概念 | 数仓DW, ODS, DM 概念 | [点击查看](https://www.jianshu.com/p/3e1386d6052e) | 不同概念的特征 | ODS 类似于临时库 |
|  6 | 实践 | 基金行业的数据中台实践 | [点击查看](http://www.keendata.com/case/fund.html) | 架构图 | 比较简单的中台，基本就是数仓+基于数仓的应用 |
|  7 | 概念 | 国云数据关于“数据中台”的说明 | [点击查看](https://zhuanlan.zhihu.com/p/297760638) | 数据中台的应用方式和建设内容 | `数据中台应用方式二为帮助技术单元和业务单元，甚至外部单元灵活地创建应用` 的一个场景：我们要去拿医院的数据库都是问医院要一个数据库的账号，有时候信息科部门管理不规范，给的账户不控制权限，是存在安全隐患的。有数据中台之后，只给一个 API 接口，有利于控制权限和监控预警什么的，将数据库层面的控制上升到数据中台层面 |
|  8 | 概念 | 探码科技关于“数据中台”的说明 | [点击查看](https://www.sohu.com/a/440239886_506171) | 后面的一句话 | `构建一套持续不断把数据变成资产并服务于业务的机制` |
|  9 | 实践 | 《阿里巴巴数据中台实践》解读 | [点击查看](https://zhuanlan.zhihu.com/p/81920495) | - `当然，很多写PPT的用词没这么严谨，临时造概念的不少，或者是独特的说法` <br/> - `一般意义上的平台具备业务无关性，潜心技术就可以了，而中台是业务的收敛，跟业务的相关性很大，对于数据中台，其核心竞争力不是平台级的技术，而是数据的理解、处理和挖掘。让一个做平台技术的人跑到前端去理解数据诉求沉淀共性是不现实的，而这是当前数据中台创造价值的核心。` <br/> - 数据中台赋能的四大典型场景：1. 全局数据监控 2. 数据化运营-智能CRM 3. 数据植入业务-智能推荐 4. 数据业务化-生意参谋 <br/> - `其实数据中台要搞好不是简单的引进几个工具就可以了，技术仅仅是技术，你能COPY技术但COPY不了管理和文化，而这恰恰是数据中台成功的关键。` <br/> - `数据中台的更大挑战是：你的企业对于数据的理解是否已经达到了一定的阶段，你是否能够驱动公司去建立一套适合自己企业的数据管理机制和流程，而这个是最难的，你得走出自己的路。` | - 如左 <br/> - 如果以 “阿里巴巴数据中台全景图” 为图，我们是否要做 IaaS 部分的内容，还是只做 DaaS 部分 <br/> - 可以模仿阿里的 数据资产管理IPaaS 平台拓展我们的 主数据管理 <br/> - 阿里的 OneMeta 是业务系统层面的数据权限管理工具，满足 7 的需求 |
| 10 | 概念 | 数据处理需求的演进历程 | [点击查看](https://zhuanlan.zhihu.com/p/88537265) | 数据处理需求的演进历程 | 数据库->数据仓->数据平台->数据中台 |
| 11 | 实践 | 零成本构建私有化 DataWorks 平台 | [点击查看](https://zhuanlan.zhihu.com/p/86274138) | - “数据中台” 中 “数据开发平台” 使用到的开源项目:<br/>1. 任务开发IDE(测试流程)：[微众银行 Scriptis](https://github.com/WeBankFinTech/Scriptis) <br/>2. 工作流调度引擎：[易观 Easy Scheduler](https://github.com/apache/incubator-dolphinscheduler) | 数据中台需要包含的内容 |
| 12 | 概念 | 什么是中台？什么不是中台？ | [点击查看](https://zhuanlan.zhihu.com/p/76631826) | 从什么不是中台得出什么是中台 | 中台一定是带有业务属性的 |
| 13 | 概念 | IaaS,PaaS,SaaS 概念 | [点击查看](https://www.ibm.com/cn-zh/cloud/learn/iaas-paas-saas) | 概念解析 | - IaaS 基础架构即服务：1. 云应用：有点像 JVM 环境，Node 环境这些，只要把对应环境内运行的应用部署上去就可以使用，例如，上传个 jar 包就能跑；2. 云存储：云端的 MySQL，不需要自己安装，直接连接就能用 <br/> - PaaS 平台即服务：就一台云电脑，你爱装什么装什么，装上 JVM，装上 MySQL，能提供类似 IaaS 的能力（实际上还是有差别） <br/> - SaaS 软件即服务：用别人的软件。要么直接用，类似禅道企业版这些，要么调用别人提供的 API，类似某某APP允许使用微信授权登录就是调用了微信提供的 API |
| 14 | 实践 | 饿了么元数据管理实践之路 | [点击查看](https://dbaplus.cn/news-73-2143-1.html) | SQL 埋点的实现 | 可能可以用来优化 dgp 中 SQL 语句生成 |
| 15 | 概念 | 数仓建设架构 | [点击查看](https://www.jianshu.com/p/91d9955c98ff) | 数仓建设流程 | 可用于理解数仓建设的建设原理和流程 |
| 16 | 概念+实践 | 日志埋点系列 | [点击查看](https://www.jianshu.com/p/553ab7bb42c4) | 从埋点的概念、作用、到实践全方面理解日志埋点 | 业务系统前后端日志买点，数据采集后分析 |
| 17 | 概念 | 数据中台数据来源 | [点击查看](https://mp.weixin.qq.com/s/enYb8sTS09cj6fmfHTomig) | 数据中台数据来源 | 数据中台的数据来源期望是全域数据包括 **业务数据库，日志数据，埋点数据，爬虫数据，外部数据** 等，包括结构化和非结构化数据 |
| 18 | 实践 | 希嘉-高校数据中台实践 | [点击查看](https://www.zhihu.com/people/mo-ni-56-19/posts) | 介绍了比较少有的数据资产，数据计算，数据安全等方面的内容 |  |
| 19 | 实践 | 宜信敏捷数据中台建设 | [点击查看](http://www.elecfans.com/d/950112.html) | 内含了多个开源的数据中台相关的项目,基于这些中间件建设了整套数据中台体系,很有参考意义 |  |
| 20 | 实践 | 快手数据中台实践 | [点击查看](https://developer.51cto.com/art/202101/642850.htm) | 数据加速与数据资产的结合 | 从多个数据源摄入原始数据(如 Kafka，MySQL、线上访问日志等)，进行加工建模后，得到数据资产，定时将数据资产从 Hive 同步至其他高速存储中（Redis、Hbase、Druid） |
| 21 | 实践 | 大公司闭源的数据质控平台架构 | [点击查看](https://zhuanlan.zhihu.com/p/41679658) | 美团的 DataMan 平台比较有参考价值 + Griffin 数据质量维度 | 1. 系统功能层：配置管理，过程监控，问题跟踪，实时同步，知识库创建 <br/> 2. 维度：Accuracy(准确性), Completeness(完整性), Timeliness(及时性), Uniqueness(唯一性), Validity(有效性), Consistency(一致性) |
| 22 | 实践 | 美团旅行数据质量监管平台实践 | [点击查看](https://tech.meituan.com/2018/03/21/mtdp-dataman.html) |  | 1. 数据质量检核管理 PDCA 方法论 <br/> 2. 系统的管理流程（包括了不同角色的人） <br/> 3. 有个故障等级的概念 <br/> 4. 数据模型中对应的表 <br/> 5. 两个美团自研的中间件 [RDS](https://tech.meituan.com/2016/09/03/rds-introduction.html) 和 [Zebra](https://github.com/Meituan-Dianping/Zebra) |
| 23 | 产品 | 阿里云 DataWorks-数据质量部分 | [点击查看](https://help.aliyun.com/document_detail/73660.html) | 感觉这里的数据质量功能十分有限，只有数值有关的 | [配置规则](https://help.aliyun.com/document_detail/73829.html) & [规则内置模板](https://help.aliyun.com/document_detail/159177.htm) & [DataWorks学习路径](https://help.aliyun.com/learn/learningpath/dataworks.html) |
| 24 | 实践 | 网易数据中台实践 | [点击查看](https://www.cnblogs.com/163yun/p/12016727.html) | 未读 | |
| 25 | 实践 | 网易数据质量实践 | [点击查看](https://www.cnblogs.com/163yun/p/9675553.html) | 截图内容 | 貌似质量分析都是基于 SQL 语句实现的 |

## 类似产品
| 名称 | 官网 | 备注 |
| --- | --- | --- |
| 阿里云数据中台 | [点击查看](https://dp.alibaba.com/index) | |
| 国云数据中台 | [点击查看](http://www.data-god.com/#/product/dcenter) | |
| 科杰大数据-数据中台 | [点击查看](http://www.keendata.com/) | |
| 探码科技-数据中台 | [点击查看](http://www.tanmer.com/) | 貌似比较重视爬虫类型的数据采集 |
| 希嘉-数据中台 | [点击查看](http://www.xjgreat.com/ProductsSt_sjzt.html) | 参考一下这里的案例 |
| 网易-易数 | [点击查看](https://bigdata.163yun.com/mammut) | 感觉和阿里云的 DataWorker 类似 |

## 其他
- [https://36kr.com/p/1030216540669959](https://36kr.com/p/1030216540669959)
- 大致有关的项目推荐：
    1. [从零构建数据中台平台](https://zhuanlan.zhihu.com/p/85030875)
    2. [史上最全企业数据产品选型对比（含数仓、报表、BI、中台、数据治理）](https://my.oschina.net/u/4197558/blog/4694600)
- [哥不是小萝莉-博客园（大量大数据相关的文章）](https://www.cnblogs.com/smartloli/)
- [阿里云数据中台-阿里云](https://developer.aliyun.com/group/alidata)

  其中，包含了书籍 《大数据之路：阿里巴巴大数据实践》 的节选：[连载6：阿里巴巴大数据实践：大数据建设方法论OneData](https://developer.aliyun.com/article/771546), [连载7：阿里巴巴大数据实践：OneData模型实施介绍](https://developer.aliyun.com/article/771960 )，这两个链接中有其他的部分

- 有关书籍
    - [大数据之路 阿里巴巴大数据实践](https://item.jd.com/10021928840114.html)
    - [数据中台实战：手把手教你搭建数据中台](https://item.jd.com/12956752.html#)
- [Oracle ODI](https://www.cnblogs.com/nnzhang/p/10615866.html)
  > ETL 工具，Oracle 官方
- [网易易数-知乎专栏](https://www.zhihu.com/org/wang-yi-yun-54-1)
- Griffin 的两篇使用
    - [数据质量监控工具-Apache Griffin](https://blog.csdn.net/vipshop_fin_dev/article/details/86362706)
    - [数据质量监控工具——Griffin](https://blog.csdn.net/u012543380/article/details/110070286)

--- 

# 数据质量有关
数据质量模块 分析总结

### 开源工具推荐
1. [Griffin](https://github.com/apache/griffin)
    - 国内使用者：华为, 京东, 平安银行, 美团, 唯品会, 网易
    - 缺点:依赖较多，Hadoop, Hive, Spark, Livy, ES（可能可以使用 CDH）
2. [DataCleaner](https://github.com/datacleaner/DataCleaner)

### 模块使用流程
- 基本流程
    1. 定义数据质量需求
    2. 按照需求分析数据质量
    3. 生成分析报告
- 符合 `PDCA(plan, do, check, act)` 的流程（来源于美团旅行数据质量分析实践）
    1. 质量需求【对应 基本流程-定义数据质量需求】
       > 发现问题，收集需求，检核需求
    2. 提炼规则【大致对应 基本流程-定义数据质量需求】
       > 梳理指标，确定指标，检核指标
    3. 规则库【大致对应 基本流程-定义数据质量需求】
       > 检核对象，检核调度，配置规则，检核范围，检核标准
    4. 执行检核【对应 基本流程-按照需求分析数据质量】
       > 调度执行，检核代码，配置调度，执行调度
    5. 问题数据【大致对应 基本流程-生成分析报告】
       > 问题展示，问题分类，质量分析，严重程度
    6. 分析报告【对应 基本流程-生成分析报告】
       > 评估等级，趋势分析，影响范围，解决方案
    7. 落实处理
       > 落实方案，跟踪管理，发现问题，标准化
    8. 知识库（暂时还不知道意义）
       > 知识积累，知识应用，体系标准，专家经验

总结：开源工具貌似都只是能做到基本流程里的功能，剩下的都需要额外实现，
不过，多数也算是基本流程功能的完善，“提炼规则” 和 “规则库” 其实数据质量需求的抽象， “问题数据” 则属于分析报告中的一部分

### 数据质量的维度
- 常规维度
    1. Accuracy(准确性)
    2. Completeness(完整性)
    3. Timeliness(及时性)
       > 基于 Griffin 和 DataCleaner 进行及时性维度的计算规则暂时还不清除，可能实现：比较当前时间和当前分析数据里面的时间的差值，求平均值即为及时性判断
       >
       > 计算公式：sum(当前时间 - 每一行数据的时间字段时间) / 数据行数
    4. Uniqueness(唯一性)
    5. Validity(有效性)
    6. Consistency(一致性)

> 比较常用的是：准确性，完整性，及时性，一致性

### 其他
- DataCleaner 里面的 `Analyze` 功能貌似对应了 Griffin 里面的 `Data Profiling` 功能，Griffin 的另一个功能 `Accuracy` 主要用来检测源表和目标表的数据是否一致
- 疑问：现在已经看到三个比较大的平台是使用 SQL 作为规则的底层实现的，难道 DataCleaner 底层也是如此？

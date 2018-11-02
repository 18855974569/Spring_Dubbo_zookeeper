# Spring_Dubbo_zookeeper
zookeper的下载地址：http://www.apache.org/dist/zookeeper/

这里面是个Spring + Dubbo + Zookeep的一个很简单的例子
其中
controller的module对应消费者 端口是：9001
serviceimpl对应生产者，  端口是：9000
service对应的是接口，没有什么意义，纯碎是为了练习maven的分层架构

这个是eclipse例子，启动是：
在IDE eclipse 中右键Run As 或 Debug As –> Maven build... ，
在Goals中输入： clean tomcat7:redeploy 或 clean tomcat7:run，点击 Apply 保存设置 ，然后run 或 debug。

启动服务顺序，先启动生产者注册个服务，在启动消费者获取服务

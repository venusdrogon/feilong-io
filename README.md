feilong-platform feilong-io
================

[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
![build](https://img.shields.io/jenkins/s/https/jenkins.qa.ubuntu.com/precise-desktop-amd64_default.svg "build")
![JDK](https://img.shields.io/badge/JDK-1.7-green.svg "JDK")

Reduce development, Release ideas

#Welcome to feilong-platform feilong-io

`封装了io操作的常用类`


# Javadoc:
在此,我们提供在线的Javadoc,以便查阅,参见 [Javadoc](http://venusdrogon.github.io/feilong-platform/javadocs/feilong-io/)



# :dragon: Maven使用配置

feilong-io jar 你可以在这里 https://github.com/venusdrogon/feilong-platform/tree/repository/com/feilong/platform/feilong-io 浏览 

在maven `pom.xml` 中,您可以通过以下方式来配置:

```XML

	<project>
	
		....
		<properties>
			<version.feilong-platform>1.8.3</version.feilong-platform>
			....
		</properties>
		
		....
		<repositories>
			<repository>
				<id>feilong-repository</id>
				<url>https://raw.github.com/venusdrogon/feilong-platform/repository</url>
			</repository>
		</repositories>
		
		....
		<dependencies>
			....
			<dependency>
				<groupId>com.feilong.platform</groupId>
				<artifactId>feilong-io</artifactId>
				<version>${version.feilong-platform}</version>
			</dependency>
			....
		</dependencies>
		
		....
		
	</project>
```

# :memo: 说明

1. 基于`Apache2` 协议,您可以下载,代码用于闭源项目,但每个修改的过的文件必须放置版权说明;
1. 基于`maven3.3`构建;
1. 需要`jdk1.7`及以上环境;

# :panda_face: About

如果您对feilong core 有任何建议和批评,可以使用下面的联系方式：

* iteye博客:http://feitianbenyue.iteye.com/
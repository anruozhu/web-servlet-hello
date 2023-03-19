package com.itranswarp.learnjava;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

public class Main {

	public static void main(String[] args) throws Exception {
		Tomcat tomcat = new Tomcat();//创建tomcat实例
		tomcat.setPort(Integer.getInteger("port", 8080));//设置端口
		tomcat.getConnector();//获取连接器
		Context ctx = tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());//添加webapp
		WebResourceRoot resources = new StandardRoot(ctx);//创建资源根
		resources.addPreResources(//添加资源
				new DirResourceSet(resources, "/WEB-INF/classes", new File("target/classes").getAbsolutePath(), "/"));//添加资源
		ctx.setResources(resources);//设置资源
		tomcat.start();//启动tomcat
		tomcat.getServer().await();//等待请求
	}
}

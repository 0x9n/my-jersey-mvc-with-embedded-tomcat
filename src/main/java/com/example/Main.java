package com.example;

import com.example.servlets.HelloWorldServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * Created by tie303802 on 15/10/05.
 */
public class Main {

    public static void main (String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9000);

        String baseDoc = new File("src/main/webapp").getAbsolutePath();
        Context ctx = tomcat.addContext("/servletSample", baseDoc);

        tomcat.addWebapp(null, "", baseDoc);
        tomcat.addServlet(ctx, "HelloWorld", new HelloWorldServlet());
        ctx.addServletMapping("/*", "HelloWorld");

        try {
            tomcat.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

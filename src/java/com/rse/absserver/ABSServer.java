package com.rse.absserver;

import com.rse.middleware.ABSServlet;
import java.io.File;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Server;
import org.apache.catalina.startup.Tomcat;


public class ABSServer {
  public ABSServer() {}

  public static void main(String[] args) {
    ABSServer server = new ABSServer();
    server.run();
  }

  public void run() {
    run("8082");
  }

  public void run(String port) {
    Tomcat tomcat = new Tomcat();
    String webPort = port;
    tomcat.setPort(Integer.valueOf(webPort).intValue());

    try {
      Context ctx = tomcat.addWebapp("", new File("./").getAbsolutePath());
      Tomcat.addServlet(ctx, "absservlet", new ABSServlet());
      ctx.addServletMapping("", "absservlet");
      ctx.addServletMapping("*.abs", "absservlet");
      System.out.println("configuring app with basedir: " + new File("./").getAbsolutePath());
      try {
        tomcat.start();
      } catch (LifecycleException ex) {
        Logger.getLogger(ABSServer.class.getName()).log(Level.SEVERE, null, ex);
      }
      tomcat.getServer().await();
    } catch (ServletException ex) {
      Logger.getLogger(ABSServer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}

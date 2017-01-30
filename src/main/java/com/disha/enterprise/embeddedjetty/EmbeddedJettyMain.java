package com.disha.enterprise.embeddedjetty;

import javax.servlet.Servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import com.disha.enterprise.servlet.ExampleServlet;

public class EmbeddedJettyMain {
	
	public static void main(String[] args) throws Exception {

		Server server = new Server(7171);
		ServletContextHandler handler = new ServletContextHandler(server, "/example1");
		handler.addServlet(ExampleServlet.class, "/");
		server.start();
	}
}

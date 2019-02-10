package com.aw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GSTServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final AsyncContext asyncContext = req.startAsync();
		// release request pool thread and don't commit the response

		/**
		 * Handle your processing in a separate thread of processing
		 */
		new Thread() {
			public void run() {
				System.out.println("job running");
				ServletResponse response = asyncContext.getResponse();
				// long running job
				try {
					Thread.sleep(8000L);

					PrintWriter out = response.getWriter();
					out.println("Long running Job");
					System.out.println("job completed...");
					out.close();
					
					asyncContext.complete();
				} catch (InterruptedException | IOException e) {
					throw new RuntimeException(e);
				}
			}

		}.start();
	}

}










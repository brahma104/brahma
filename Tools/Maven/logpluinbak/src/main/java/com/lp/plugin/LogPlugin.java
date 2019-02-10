package com.lp.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;


public class LogPlugin extends AbstractMojo {
	/**
	 * 
	 * @goal log
	 *
	 */
	public void execute() throws MojoExecutionException, MojoFailureException {
		super.getLog().info("Log Plug-In has been executed");
	}

}

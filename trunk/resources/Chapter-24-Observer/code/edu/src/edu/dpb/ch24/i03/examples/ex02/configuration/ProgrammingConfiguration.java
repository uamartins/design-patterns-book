package edu.dpb.ch24.i03.examples.ex02.configuration;

import java.io.File;
import java.util.HashSet;

public class ProgrammingConfiguration extends Subject {
	private String systemPath;
	private File javaConfigFile;
	private File csharpConfigFile;

	public ProgrammingConfiguration() {
		observers = new HashSet<Observer>();
	}

	@Override
	public void notifyObservers() {
		System.out.println("[ProgramConfig] Notify all observers." + toString());
		for (Observer observer : observers) {
			observer.update(systemPath, javaConfigFile, csharpConfigFile);
		}
	}

	// setter methods + toString() overriding
	// ...
	public void setSystemPath(String systemPath) {
		this.systemPath = systemPath;
	}

	public void setCSharpConfigFile(File csharpConfigFile) {
		this.csharpConfigFile = csharpConfigFile;
	}

	public void setJavaConfigFile(File javaConfigFile) {
		this.javaConfigFile = javaConfigFile;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nConfiguration: systemPath='" + systemPath
				+ "', javaConfigFile='" + javaConfigFile
				+ "', csharpConfigFile='" + csharpConfigFile + "'");
		return builder.toString();
	}
}

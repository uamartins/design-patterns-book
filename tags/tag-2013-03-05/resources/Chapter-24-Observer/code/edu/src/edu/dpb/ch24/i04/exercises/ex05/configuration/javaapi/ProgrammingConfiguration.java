package edu.dpb.ch24.i04.exercises.ex05.configuration.javaapi;

import java.io.File;
import java.util.Observable;

public class ProgrammingConfiguration extends Observable {
	private String systemPath;
	private File javaConfigFile;
	private File csharpConfigFile;

	// setter methods + toString() overriding
	public void setSystemPath(String systemPath) {
		this.systemPath = systemPath;
	}

	public void setCSharpConfigFile(File csharpConfigFile) {
		this.csharpConfigFile = csharpConfigFile;
	}

	public void setJavaConfigFile(File javaConfigFile) {
		this.javaConfigFile = javaConfigFile;
	}

	public String getSystemPath() {
		return systemPath;
	}

	public File getJavaConfigFile() {
		return javaConfigFile;
	}

	public File getCsharpConfigFile() {
		return csharpConfigFile;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nConfiguration: systemPath='" + systemPath
				+ "', javaConfigFile='" + javaConfigFile
				+ "', csharpConfigFile='" + csharpConfigFile + "'");
		return builder.toString();
	}

	public void notifyChange() {
		setChanged();
		System.out.println("hasChanged-before ->"+ hasChanged());
		notifyObservers();
		System.out.println("hasChanged-after ->"+ hasChanged());
	}
}

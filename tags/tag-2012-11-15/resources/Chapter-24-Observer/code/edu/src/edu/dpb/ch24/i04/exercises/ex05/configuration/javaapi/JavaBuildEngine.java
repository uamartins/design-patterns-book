package edu.dpb.ch24.i04.exercises.ex05.configuration.javaapi;

import java.io.File;
import java.util.Observable;
import java.util.Observer;

public class JavaBuildEngine implements Observer {
	private String systemPath;
	private File javaConfigFile;

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof ProgrammingConfiguration) {
			ProgrammingConfiguration newConfig = (ProgrammingConfiguration) observable;
			systemPath = newConfig.getSystemPath();
			javaConfigFile = newConfig.getJavaConfigFile();
			runJavaProjects();
		}
	}

	private void runJavaProjects() {
		System.out.printf("[JavaBE] Java Projects have run. "
				+ "SystemPath: %s, JavaConfigFile: %s.\n", systemPath,
				javaConfigFile);
	}

	@Override
	public String toString() {
		return "Java-BuildEngine";
	}
}

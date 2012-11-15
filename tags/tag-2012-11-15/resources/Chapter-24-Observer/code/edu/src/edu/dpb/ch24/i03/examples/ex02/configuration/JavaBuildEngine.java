package edu.dpb.ch24.i03.examples.ex02.configuration;

import java.io.File;

public class JavaBuildEngine implements Observer {
	private String systemPath;
	private File javaConfigFile;
	private boolean configChanged;

	@Override
	public void update(String newSystemPath, File newJavaConfigFile,
			File newCSharpConfigFile) {
		System.out.println("[JavaBE] Configuration updated.");
		if ((newSystemPath != null) && (!newSystemPath.equals(systemPath))) {
			systemPath = newSystemPath;
			configChanged = true;
		}
		if ((newJavaConfigFile != null)
				&& (!newJavaConfigFile.equals(javaConfigFile))) {
			javaConfigFile = newJavaConfigFile;
			configChanged = true;
		}
		if (configChanged) {
			runJavaProjects();
		}
		configChanged = false;
	}

	private void runJavaProjects() {
		System.out.println("[JavaBE] Java Projects have run.");
	}
	
	@Override
	public String toString() {
		return "Java-BuildEngine";
	}
}

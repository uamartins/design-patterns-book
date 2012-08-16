package edu.dpb.ch24.i03.examples.ex02.configuration;

import java.io.File;

public class BuildAdministrator {
	private static final String SYSTEM_PATH = "D:\\projects";
	private static final File JAVA_CONFIG_FILE = new File("java.conf");
	private static final File CSHARP_CONFIG_FILE = new File("csharp.conf");
	private static final File JAVA_UPDATED_CONFIG_FILE = new File(
			"java-update.conf");
	private ProgrammingConfiguration configuration;

	public BuildAdministrator(ProgrammingConfiguration configuration) {
		this.configuration = configuration;
	}

	public void runNightlyBuild() {
		System.out.println("[BuildAdmin] NightlyBuild.");
		configuration.setSystemPath(SYSTEM_PATH);
		configuration.setJavaConfigFile(JAVA_CONFIG_FILE);
		configuration.setCSharpConfigFile(CSHARP_CONFIG_FILE);
		configuration.notifyObservers();
	}

	public void runJavaUpdatedBuild() {
		System.out.println("[BuildAdmin] JavaBuild.");
		configuration.setJavaConfigFile(JAVA_UPDATED_CONFIG_FILE);
		configuration.notifyObservers();
	}
}

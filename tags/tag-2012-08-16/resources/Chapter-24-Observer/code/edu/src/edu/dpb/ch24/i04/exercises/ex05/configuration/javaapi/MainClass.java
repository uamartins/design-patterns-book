package edu.dpb.ch24.i04.exercises.ex05.configuration.javaapi;

public class MainClass {
	public static void main(String[] args) {
		// 1. create observable object
		ProgrammingConfiguration configuration = new ProgrammingConfiguration();
		// 2. create observers
		JavaBuildEngine javaEngine = new JavaBuildEngine();
		CSharpBuildEngine csharpEngine = new CSharpBuildEngine();
		// 3. register observers
		configuration.addObserver(javaEngine);
		configuration.addObserver(csharpEngine);
		// 4. create notifier
		BuildAdministrator administrator = new BuildAdministrator(configuration);
		// 5.1 update configuration
		System.out.println("============\n");
		administrator.runNightlyBuild();

		// 5.2 update configuration again
		// System.out.println("============\n");
		// administrator.runJavaUpdatedBuild();
	}
}

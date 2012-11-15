package edu.dpb.ch24.i03.examples.ex02.configuration;

public class MainClass {
	public static void main(String[] args) {
		// 1. create observable object
		ProgrammingConfiguration configuration = new ProgrammingConfiguration();
		// 2. create observers
		JavaBuildEngine javaEngine = new JavaBuildEngine();
		CSharpBuildEngine csharpEngine = new CSharpBuildEngine();
		// 3. register observers
		configuration.register(javaEngine);
		configuration.register(csharpEngine);
		// 4. create notifier
		BuildAdministrator administrator = new BuildAdministrator(configuration);
		// 5.1 update configuration
		System.out.println("============\n");
		administrator.runNightlyBuild();
		// 5.2 update configuration again
		System.out.println("============\n");
		administrator.runJavaUpdatedBuild();
	}
}

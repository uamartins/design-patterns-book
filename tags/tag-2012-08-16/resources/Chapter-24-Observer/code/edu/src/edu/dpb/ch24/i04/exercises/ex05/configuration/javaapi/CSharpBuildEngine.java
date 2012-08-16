package edu.dpb.ch24.i04.exercises.ex05.configuration.javaapi;

import java.io.File;
import java.util.Observable;
import java.util.Observer;

public class CSharpBuildEngine implements Observer {
	private String systemPath;
	private File csharpConfigFile;

	private void runCSharpProjects() {
		System.out.printf("[CSharpBE] CSharp Projects have run. "
				+ "SystemPath: %s, CSharpConfigFile: %s.\n", systemPath,
				csharpConfigFile);
	}

	@Override
	public String toString() {
		return "CSharp-BuildEngine";
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof ProgrammingConfiguration) {
			ProgrammingConfiguration newConfig = (ProgrammingConfiguration) observable;
			systemPath = newConfig.getSystemPath();
			csharpConfigFile = newConfig.getCsharpConfigFile();
			runCSharpProjects();
		}

	}
}

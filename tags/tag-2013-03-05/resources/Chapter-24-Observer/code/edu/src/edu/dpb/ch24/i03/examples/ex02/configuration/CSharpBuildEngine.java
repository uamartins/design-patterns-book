package edu.dpb.ch24.i03.examples.ex02.configuration;

import java.io.File;

public class CSharpBuildEngine implements Observer {
	private String systemPath;
	private File csharpConfigFile;
	private boolean configChanged;

	@Override
	public void update(String newSystemPath, File newJavaConfigFile,
			File newCSharpConfigFile) {
		System.out.println("[CSharpBE] Configuration updated.");
		if ((newSystemPath != null) && (!newSystemPath.equals(systemPath))) {
			systemPath = newSystemPath;
			configChanged = true;
		}
		if ((newCSharpConfigFile != null)
				&& (!newCSharpConfigFile.equals(csharpConfigFile))) {
			csharpConfigFile = newCSharpConfigFile;
			configChanged = true;
		}

		if (configChanged) {
			runCSharpProjects();
		}
		configChanged = false;
	}

	private void runCSharpProjects() {
		System.out.println("[CSharpBE] CSharp Projects have run.");
	}

	@Override
	public String toString() {
		return "CSharp-BuildEngine";
	}
}

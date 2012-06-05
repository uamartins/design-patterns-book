package edu.dpb.ch24.i03.examples.ex02.configuration;

import java.io.File;

public interface Observer {
	public void update(String systemPath, File javaConfigFile,
			File csharpConfigFile);
}

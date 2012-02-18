public class File {
	private String fileName;

	private File() {
	}

	public String getFileName() {
		return fileName;
	}

	public static File openFile(String fileName) {
		// Check if the file exists...
		File f = new File();
		f.fileName = fileName;

		// Open stream...
		return f;
	}
}

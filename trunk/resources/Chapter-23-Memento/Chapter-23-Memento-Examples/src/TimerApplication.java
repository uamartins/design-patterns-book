public class TimerApplication {
	// There are one million nanoseconds in a millisecond.
	private static final int NS_IN_MS = 1000000;

	public static class Settings {
		private long milliseconds;

		private Settings() {
		}

		private long getMilliseconds() {
			return milliseconds;
		}

		private void setMilliseconds(long value) {
			milliseconds = value;
		}
	}

	private long milliseconds;

	private long beginNanoTime;

	public long getMilliseconds() {
		return milliseconds;
	}

	public Settings createSettings() {
		Settings settings = new Settings();
		settings.setMilliseconds(milliseconds);

		return settings;
	}

	public void setSettings(Settings settings) {
		milliseconds = settings.getMilliseconds();
	}

	public void start() {
		beginNanoTime = System.nanoTime();
	}

	public void stop() {
		long endNanoTime = System.nanoTime();
		milliseconds += (endNanoTime - beginNanoTime) 
				/ NS_IN_MS;
	}
}

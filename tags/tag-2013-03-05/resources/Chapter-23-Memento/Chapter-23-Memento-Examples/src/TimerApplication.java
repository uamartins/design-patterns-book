public class TimerApplication {
	public static class Settings {
		private long milliseconds;

		private Settings() {
		}

		private long getMilliseconds() {
			return this.milliseconds;
		}

		private void setMilliseconds(long value) {
			this.milliseconds = value;
		}
	}

	private long milliseconds;

	private long startTimeInNanoseconds;

	public long getMilliseconds() {
		return this.milliseconds;
	}

	public Settings getSettings() {
		Settings settings = new Settings();
		settings.setMilliseconds(this.milliseconds);

		return settings;
	}

	public void setSettings(Settings settings) {
		this.milliseconds = settings.getMilliseconds();
	}

	public void start() {
		this.startTimeInNanoseconds = System.nanoTime();
	}

	public void stop() {
		long endTimeInNanoseconds = System.nanoTime();
		this.milliseconds += (endTimeInNanoseconds - this.startTimeInNanoseconds) / 1000000;
	}
}


public class TimerApplication {
	private long startTimeInNanoseconds;
	private long milliseconds;
	
	private class Settings {
		private long milliseconds;
		
		public long getMilliseconds() {
			return this.milliseconds;
		}

		public void setMilliseconds(long value) {
			this.milliseconds = value;
		}
	}
	
	public Object getSettings() {
		Settings settings = new Settings();
		settings.setMilliseconds(this.milliseconds);
		
		return (Settings)settings;
	}
	
	public void setSettings(Object settings){
		this.milliseconds = ((Settings)settings).getMilliseconds();
	}

	public void start() {
		this.startTimeInNanoseconds = System.nanoTime();		
	}

	public void stop() {
		long endTimeInNanoseconds = System.nanoTime(); 
		this.milliseconds += (endTimeInNanoseconds - this.startTimeInNanoseconds) / 1000000;
	}
	
	public long getMilliseconds() {
		return this.milliseconds;
	}
}

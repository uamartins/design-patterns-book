
public class TimerApplication {
	private int milliseconds;
	
	private interface PrivateSettings {
		int getMilliseconds();
		void setMilliseconds(int value);
	}
	
	public class Settings 
		implements PrivateSettings {
		
		private int milliseconds;
		
		public Settings(){
		}

		@Override
		public int getMilliseconds() {
			return this.milliseconds;
		}

		@Override
		public void setMilliseconds(int value) {
			this.milliseconds = value;
		}
	}
	
	public Settings getSettings() {
		PrivateSettings settings = new Settings();
		settings.setMilliseconds(this.milliseconds);
		
		return (Settings)settings;
	}
	
	public void setSettings(Settings settings){
		this.milliseconds = ((PrivateSettings)settings).getMilliseconds();
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}
}

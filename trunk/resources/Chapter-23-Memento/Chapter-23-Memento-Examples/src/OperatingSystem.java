
public class OperatingSystem {
	private TimerApplication.Settings timerSettings;
	private TimerApplication timerApplication;
	
	public void startTimerApplication() {
		this.timerApplication = new TimerApplication();
        
		if (this.timerSettings != null) {
			this.timerApplication.setSettings(this.timerSettings);
		}
		
		this.timerApplication.start();
	}
	
	public void stopTimerApplication() {
		if (this.timerApplication != null) {
			this.timerApplication.stop();
			this.timerSettings = this.timerApplication.getSettings();
		}
	}

}

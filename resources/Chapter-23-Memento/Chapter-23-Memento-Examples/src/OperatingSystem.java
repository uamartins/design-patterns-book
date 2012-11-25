
public class OperatingSystem {
	private Object timerSettings;
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
			
			System.out.println(this.timerApplication.getMilliseconds());
		}
	}

}

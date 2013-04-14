public class OperatingSystem {
    private TimerApplication startedTimerApp;
    private Repository repository;

    public OperatingSystem() {
	repository = new Repository();
    }

    public void startTimerApplication() {
	startedTimerApp = new TimerApplication();

	TimerApplication.Settings timerSettings = repository
		.restoreSettings();

	if (timerSettings != null) {
	    startedTimerApp.setSettings(timerSettings);
	}

	startedTimerApp.start();
    }

    public void stopTimerApplication() {
	if (startedTimerApp != null) {
	    startedTimerApp.stop();

	    System.out.println(startedTimerApp
		    .getMilliseconds());

	    TimerApplication.Settings timerSettings = 
		    startedTimerApp.createSettings();
	    repository.saveSettings(timerSettings);
	    
	    startedTimerApp = null;
	}
    }
}

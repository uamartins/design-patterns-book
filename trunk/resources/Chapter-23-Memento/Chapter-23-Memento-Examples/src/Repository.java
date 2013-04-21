public class Repository {
	private TimerApplication.Settings savedSettings;

	public void saveSettings(
			TimerApplication.Settings settings) {
		savedSettings = settings;
	}

	public TimerApplication.Settings restoreSettings() {
		return savedSettings;
	}
}

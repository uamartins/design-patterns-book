public class Program {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args)
	    throws InterruptedException {
	OperatingSystem operatingSystem = new OperatingSystem();

	operatingSystem.startTimerApplication();
	Thread.sleep(2000);
	operatingSystem.stopTimerApplication();

	operatingSystem.startTimerApplication();
	Thread.sleep(2000);
	operatingSystem.stopTimerApplication();

	operatingSystem.startTimerApplication();
	Thread.sleep(2000);
	operatingSystem.stopTimerApplication();
    }
}
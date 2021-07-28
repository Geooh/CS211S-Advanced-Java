
// M2 HOMEWORK ENUM
public enum TestDrive {

	TEST_DRIVE_AVAILABLE("TD", "Test Drive Available"), TEST_DRIVE_UNAVAILABLE("TDU", "Test Drive NOT Available");

	private String testdriveStatus;
	private String outputString;

	private TestDrive(String testdriveStatus, String outputString) {
		this.testdriveStatus = testdriveStatus;
		this.outputString = outputString;
	}

	public String getTestDriveAvail() {
		return testdriveStatus;
	}

	@Override
	public String toString() {
		return outputString;
	}

}

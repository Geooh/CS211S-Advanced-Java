import java.util.ArrayList;
import java.util.Collections;

public class ManufacturerTest {

	public static void main(String[] args) {
		// M2 HOMEWORK ENUM USE
		Honda civic01 = new Civic(1, "Civic (Base)", "Black", TestDrive.TEST_DRIVE_AVAILABLE);
		Honda civic02 = new Civic(0, "Civic (Sport)", "Red", TestDrive.TEST_DRIVE_UNAVAILABLE);
		// M2 HOMEWORK ENUM USEC
		Honda accord01 = new Accord(3, "Accord (Base)", "White", TestDrive.TEST_DRIVE_AVAILABLE);
//		Honda accord02 = new Accord(5, "Accord (Sport)", "Black", TestDrive.TEST_DRIVE_AVAILABLE);

		// M2 HOMEWORK ENUM USE
		Honda fit01 = new Fit(4, "Fit (Base)", "Black", TestDrive.TEST_DRIVE_UNAVAILABLE);
//		Honda fit02 = new Fit(0, "Fit (Sport)", "White", TestDrive.TEST_DRIVE_AVAILABLE);

		// M2 HOMEWORK STATIC + // M2 HOMEWORK ENUM USE
		ArrayList<Honda> hondaList = new ArrayList<>();
		hondaList.add(civic01);
		hondaList.add(accord01);
		hondaList.add(fit01);
		hondaList.add(new Civic(2, "Civic (Sport)", "Red", TestDrive.TEST_DRIVE_AVAILABLE));
		hondaList.add(new Accord(1, "Accord (EX)", "White", TestDrive.TEST_DRIVE_AVAILABLE));
		hondaList.add(new Fit(0, "Fit (Base)", "Gray", TestDrive.TEST_DRIVE_AVAILABLE));

		// M2 HOMEWORK 2-16-2020
		System.out.println(hondaList);
		Collections.sort(hondaList);
		System.out.println(hondaList);

		// M2 HOMEWORK 2-16-2020
		// invoking test drive method
		for (Honda h : hondaList) {
			h.testDriveAvailability();
		}

		for (Honda h : hondaList) {
			System.out.print(h);
		}

		// invoking Civic class
		System.out.println("Stock: " + civic01.getStock() + "\n" + "Model: " + civic01.getModel() + "\n" + "Color: "
				+ civic01.getColor() + "\n");
		// invoking Accord class
		System.out.println("Stock: " + accord01.getStock() + "\n" + "Model: " + accord01.getModel() + "\n" + "Color: "
				+ accord01.getColor() + "\n");
		// invoking Fit class
		System.out.println("Stock: " + fit01.getStock() + "\n" + "Model: " + fit01.getModel() + "\n" + "Color: "
				+ fit01.getColor() + "\n");
		System.out.println("Invoking classes individually with @Override methods:" + "\n");

		// invoking methods individually
		civic01.stockAvail();
		civic01.modelAvail();
		civic01.colorAvail();
		System.out.println("\n");
		/*
		 * civic02.stockAvail(); civic02.modelAvail(); civic02.colorAvail();
		 * System.out.println("\n");
		 */
		accord01.stockAvail();
		accord01.modelAvail();
		accord01.colorAvail();
		System.out.println("\n");
		/*
		 * accord02.stockAvail(); accord02.modelAvail(); accord02.colorAvail();
		 * System.out.println("\n");
		 */
		fit01.stockAvail();
		fit01.modelAvail();
		fit01.colorAvail();
		System.out.println("\n");
		/*
		 * fit02.stockAvail(); fit02.modelAvail(); fit02.colorAvail();
		 */

	}
}

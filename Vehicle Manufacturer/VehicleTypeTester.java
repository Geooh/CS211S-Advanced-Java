import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Builder Tester Class 2/22/2021
public class VehicleTypeTester {

	public static void main(String[] args) {

		ArrayList<Honda> honList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the model name:");
			String model = scan.nextLine();
			System.out.println("Enter the model color:");
			String color = scan.nextLine();

			// M3 USING COMPARATOR
			InStock inStock = null;
			if (model.equalsIgnoreCase("Civic")) {
				System.out.println("Choose a color:");
				String colorChoice = scan.nextLine();
				if (colorChoice.equalsIgnoreCase("White")) {
					inStock = new CivicAvailability();
				} else if (colorChoice.equalsIgnoreCase("Black")) {
					inStock = new CivicAvailability();
				} else {

					throw new IllegalArgumentException();
				}
			}

			// Getting unknown invoking error, not sure where it's coming from

//			Honda h = HondaFactory.newHonda(inStock, model); 
//          honList.add(h);
		}
		for (Honda hon : honList) {
			hon.vehicleSold();
		}

		System.out.println(honList);
		Collections.sort(honList, Honda.STOCK_AMOUNT_COMPARATOR);
		System.out.println(honList);
	}

	/*
	 * ArrayList<Honda> hondaList = new ArrayList<>(); for(int i=0; i<2; i++) {
	 * hondaList.add(HondaFactory.newHonda()); } for(Honda h : hondaList) {
	 * h.stockAvail(); }
	 * 
	 * System.out.println(hondaList); Collections.sort(hondaList,
	 * Honda.MODEL_COMPARATOR); System.out.println(hondaList);
	 * 
	 * 
	 * }
	 */
	/*
	 * VehicleType vehicleType1 = new VehicleType("white", "black", "red", "gray");
	 * VehicleType vehicleType2 = new VehicleType("white", "black", "red", "gray",
	 * "blue");
	 * 
	 * VehicleType vehicleType3 = new VehicleType(); vehicleType3.setWhite("White");
	 * 
	 * VehicleType t1 = new VehicleType.VehicleTypeBuilder() .White("White")
	 * .Black("black") .Red("red") .build(); VehicleType t2 = new
	 * VehicleType.VehicleTypeBuilder() .White("White") .Black("black") .build();
	 * 
	 * }
	 */

}

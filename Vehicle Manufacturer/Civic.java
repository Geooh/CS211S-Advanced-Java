
public class Civic extends Honda { // child

	// M2 HOMEWORK STATIC
	private static int civicStock;
	public static int vehicleSold;

	public static final int ITEM_STOCK_MIN = 0;
	public static final int ITEM_STOCK_MAX = 20;

	// M2 HOMEWORK STATIC
	private static TestDrive testDrive;

	// M2 HOMEWORK STATIC
	// updated the static method calls 2/22/2021
	public Civic(int stock, String model, String color, TestDrive testDrive) {
		super(stock, model, color);
		Civic.civicStock = civicStock;
		Civic.testDrive = testDrive;
	}

	// updated the static method calls 2/22/2021
	public Civic(int civicStock, String model) {
		super(model);
		Civic.civicStock = civicStock;
	}

	public Civic(String model) {
		this(ITEM_STOCK_MIN, model);
	}

	public int getCivicStock() { // getter method
		return civicStock;
	}

	// updated the static method calls 2/22/2021
	public void setCivicStock() { // setter method
		if (civicStock > ITEM_STOCK_MIN && civicStock <= ITEM_STOCK_MAX) {
			Civic.civicStock = civicStock;
		}
	}

	/*
	 * @Override public String toString() { if(civicStock > ITEM_STOCK_MIN &&
	 * civicStock <= ITEM_STOCK_MAX) { return("Available for purchase."); }else {
	 * return("No Honda Civic models available."); } }
	 */
	@Override // compares getModel() method using super from parent
	public boolean equals(Object obj) {
		if (obj instanceof Civic) {
			Civic civicInfo = (Civic) obj;
			return super.equals(obj) && civicStock == civicInfo.civicStock;
		} else {
			return false;
		}
	}

	// M2 HOMEWORK 2-16-2020 + M2 HOMEWORK ENUM USE
	@Override // returns test drive availability
	public void testDriveAvailability() {
		if (testDrive == testDrive.TEST_DRIVE_AVAILABLE) {
			System.out.println(super.getModel() + ": Vehicle is available for test drive");
		} else {
			System.out.println(super.getModel() + ": NOT Available For Test Drive");
		}
	}

	// M2 HOMEWORK 2-16-2020 + M2 HOMEWORK ENUM USE
	@Override // returns test drive availability status
	public String toString() {
		String s = super.toString();
		s += " (Status: " + testDrive.toString() + ")";
		return s;
	}

	@Override // determines if any stock is available
	public void stockAvail() {
		if (stock != ITEM_STOCK_MIN && stock <= ITEM_STOCK_MAX) {
			System.out.println("Honda Civic Stock Amount: " + super.getStock());
		} else {
			System.out.println("Honda Civic Stock - Currently Unavailable");
		}
	}

	@Override // determines if any models are available
	public void modelAvail() {
		if (stock != ITEM_STOCK_MIN && stock <= ITEM_STOCK_MAX) {
			System.out.println("Available Model(s): " + super.getModel());
		} else {
			System.out.println("Honda Civic Model(s) - Currently Unavailable");
		}
	}

	@Override // determines if any colors are available for a model
	public void colorAvail() {
		if (stock != ITEM_STOCK_MIN && stock <= ITEM_STOCK_MAX) {
			System.out.println("Available Color(s): " + super.getColor());
		} else {
			System.out.println("Honda Civic Color(s) - Currently Unavailable");
		}
	}

	// creating static method (still WIP)
	public static void vehicleSold() {
		if (vehicleSold == 1) {
			System.out.println("Enjoy Your New Car!");
		} else {
			if (vehicleSold == 0) {
				System.out.println("We'll be here if you need a new car!");
			}
		}
	}
}


public class Accord extends Honda { // child

	// M2 HOMEWORK STATIC
	private static int accordStock;

	public static final int ITEM_STOCK_MIN = 0;
	public static final int ITEM_STOCK_MAX = 20;

	// M2 HOMEWORK STATIC
	private static TestDrive testDrive;

	// M2 HOMEWORK STATIC
	// updated the static method calls 2/22/2021
	public Accord(int stock, String model, String color, TestDrive testDrive) {
		super(stock, model, color);
		Accord.accordStock = accordStock;
		Accord.testDrive = testDrive;
	}

	// updated the static method calls 2/22/2021
	public Accord(int accordStock, String model) {
		super(model);
		Accord.accordStock = accordStock;
	}

	public Accord(String model) {
		this(ITEM_STOCK_MAX, model);
	}

	public int getAccordStock() { // getter method
		return accordStock;
	}

	// updated the static method calls 2/22/2021
	public void setAccordStock() { // setter method
		if (accordStock > ITEM_STOCK_MIN && accordStock <= ITEM_STOCK_MAX) {
			Accord.accordStock = accordStock;
		}
	}

	/*
	 * @Override public String toString() { if(accordStock > ITEM_STOCK_MIN &&
	 * accordStock < ITEM_STOCK_MAX) { return("Available for purchase."); }else {
	 * return("No Honda Accord models available."); } }
	 */
	@Override // compares getModel() method using super from parent
	public boolean equals(Object obj) {
		if (obj instanceof Accord) {
			Accord accordInfo = (Accord) obj;
			return super.equals(obj) && accordStock == accordInfo.accordStock;
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
			System.out.println("Honda Accord Stock Amount: " + super.getStock());
		} else {
			System.out.println("Honda Accord Stock - Currently Unavailable");
		}
	}

	@Override // determines if any models are available
	public void modelAvail() {
		if (stock != ITEM_STOCK_MIN && stock <= ITEM_STOCK_MAX) {
			System.out.println("Available Model(s): " + super.getModel());
		} else {
			System.out.println("Honda Accord Model(s) - Currently Unavailable");
		}
	}

	@Override // determines if any colors are available for a model
	public void colorAvail() {
		if (stock != ITEM_STOCK_MIN && stock <= ITEM_STOCK_MAX) {
			System.out.println("Available Color(s): " + super.getColor());
		} else {
			System.out.println("Honda Accord Color(s) - Currently Unavailable");
		}
	}

}

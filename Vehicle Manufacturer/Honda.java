import java.util.Comparator;

// M2 HOMEWORK 2-16-2020 
public abstract class Honda implements Comparable<Honda> { // parent, constructors are not inherited by child classes

	public static int stock;
	public String model;
	public String color;
	private InStock inStock;

	public static int ITEM_STOCK_MIN = 0;

	// M3 USING COMPARATOR
	public final static Comparator<Honda> MODEL_COMPARATOR = new HondaModelComparator();
	public final static Comparator<Honda> STOCK_AMOUNT_COMPARATOR = new HondaModelAvailabilityComparator();

	// Comparator method to compare model name
	private static class HondaModelComparator implements Comparator<Honda> {

		@Override
		public int compare(Honda civic01, Honda civic02) {
			return civic01.model.compareTo(civic02.model); // comparing civic01 model to civic02
		}
	}

	// Comparator method to compare model name first then compares the stock
	private static class HondaModelAvailabilityComparator implements Comparator<Honda> {

		@Override
		public int compare(Honda civic01, Honda civic02) {
			if (civic01.model.compareToIgnoreCase(civic02.model) == 0) {
				return Integer.compare(Honda.stock, Honda.stock);
			} else {
				return civic01.model.compareToIgnoreCase(civic02.model);
			}
		}
	}

	public Honda(int stock, String model, String color) {
		this.stock = stock;
		this.model = model;
		this.color = color;
	}

	public Honda(String model) {
		this(ITEM_STOCK_MIN, model, model);
	}

	public int getStock() { // getter method for Stock
		return stock;
	}

	public void setStock() { // setter method for Stock
		if (stock >= 0) {
			this.stock = stock;
		} else {
			System.out.println("Vehicle is unavailable.");
		}
	}

	public String getModel() { // getter method for Model
		return model;
	}

	public void setModel() { // setter method for Model
		this.model = model;
	}

	public String getColor() { // getter method for Color
		return color;
	}

	public void setColor() { // setter method for Color
		this.color = color;
	}

	@Override
	public String toString() {
		return model + "," + " Color: " + color + "," + " Stock: " + stock;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Honda) {
			Honda modelInfo = (Honda) obj;
			int stockInfo = modelInfo.stock;
			String carModel = modelInfo.model;

			if (stock == modelInfo.stock && model.equalsIgnoreCase(carModel)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	// M2 HOMEWORK 2-16-2020
	// changed compareTo to compare due to compile error 2/22/2021
	@Override
	public int compareTo(Honda hondaModel) {
		if (model.compareTo(hondaModel.model) != 0) {
			return model.compareTo(hondaModel.model);
		} else {
			return Integer.compare(stock, hondaModel.stock);
		}
	}

	// M2 HOMEWORK 2-16-2020
	public abstract void testDriveAvailability();

	public void stockAvail() {
		System.out.println(stock);
	}

	public void modelAvail() {
		System.out.println(model);
	}

	public void colorAvail() {
		System.out.println(color);
	}

	// creating static method (still WIP)
	public static void vehicleSold() {
		System.out.println("Thank you for your purchase!");
	}
}


// M3 USING FACTORY
public class HondaFactory {

	public static Honda newHonda(String model, int stock) {
		if (model.equalsIgnoreCase("Civic (Base)")) {
			Honda h = new Civic(model);
			return h;
		} else {
			return newHonda(model, stock);
		}
	}

	public static Honda newHonda(String model, String color, int inStock) {
		Honda h;

		if (model.equalsIgnoreCase("Civic (Base)")) {
			h = new Civic(inStock, model);
		} else if (model.equalsIgnoreCase("Civic (Sport)")) {
			h = new Civic(model);
		} else {
			throw new IllegalArgumentException();
		}

		return h;
	}
}

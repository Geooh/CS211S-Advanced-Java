
// M3 USING BUILDER
public class VehicleType {

	private String white, black, red, gray, blue;

	private VehicleType(VehicleTypeBuilder builder) {
		this.white = builder.white;
		this.black = builder.black;
		this.red = builder.red;
		this.gray = builder.gray;
		this.blue = builder.blue;
	}

	public static class VehicleTypeBuilder {
		private String white, black, red, gray, blue;

		public VehicleTypeBuilder() {
			this.white = white;
			this.black = black;
			this.red = red;
		}

		public VehicleTypeBuilder White(String var) {
			this.white = var;
			return this;
		}

		public VehicleTypeBuilder Black(String var) {
			this.black = var;
			return this;
		}

		public VehicleTypeBuilder Red(String var) {
			this.red = var;
			return this;
		}

		public VehicleTypeBuilder Gray(String var) {
			this.gray = var;
			return this;
		}

		public VehicleTypeBuilder Blue(String var) {
			this.blue = var;
			return this;
		}

		public VehicleType build() {
			VehicleType vehicleType = new VehicleType(this);

			if (white == null || black == null || red == null || gray == null || blue == null) {
				throw new IllegalStateException();
			}
			return new VehicleType(this);
		}
	}

}
package L3Assignment.problem4;

	public class Triangle {
		private final double h;
		private final double b;
		public Triangle(double h, double b) {
			super();
			this.h = h;
			this.b = b;
		}
		public double getH() {
			return h;
		}
		public double getB() {
			return b;
		}
		public double computeArea(){
			return (h*b)*0.5;
		}
	}

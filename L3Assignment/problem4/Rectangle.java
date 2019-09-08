package L3Assignment.problem4;

public final class Rectangle {
	private final double h; private final double b;
	public Rectangle(double h, double b) {
		super();
		this.h = h; 
		this.b = b;
		}
	public double getH() {
		return h;
		}
	public double getB() { return b;
		}
	public double computeArea(){ return (h*b);
		}
	}

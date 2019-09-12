package W2L5Assignment.problem6;

public class Computer implements Cloneable {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return ramSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public double computePower() {

		return getRamSize() * getProcessorSpeed();
	}

	@Override
	public String toString() {

		return (manufacturer + " " + processor + " " + ramSize + " " + processorSpeed);
	}

	@Override
	public boolean equals(Object computer) {
		if (computer == null)
			return false;
		if (computer == this)
			return true;
		if (!(computer instanceof Computer))
			return false;
		Computer C = (Computer) computer;
		if (C.manufacturer.equals(manufacturer) && C.processor.contentEquals(processor) && C.ramSize == ramSize
				&& C.processorSpeed == processorSpeed)
			return true;
		else
			return false;
	}

	public int hashCode() {

		int hashValue = 11;
		long f = Double.doubleToLongBits(processorSpeed);
		int hashSum = hashValue + manufacturer.hashCode() + processor.hashCode() + ramSize + (int) (f ^ (f >>> 32));
		return hashSum;

	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public Object clone() throws CloneNotSupportedException {
		Computer Comp = (Computer) super.clone();
		return Comp;}

	

}


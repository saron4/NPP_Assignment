package W2L5Assignment.problem5;

public class Computer {
	
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed ){
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.processorSpeed = processorSpeed;
		this.ramSize = ramSize;
	}
	
	public int getRamSize() {
		return ramSize;
	}
	
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public double computePower() {
		return ramSize * processorSpeed;
	}
	
	@Override
	 public String toString() {
		
		return   "Computer includes---" +manufacturer + "\t\t\t" +processor + "\t\t\t" + ramSize + "\t\t\t" +processorSpeed ;
		}

	@Override
	public boolean equals(Object computer) {
			if (computer == null)
				return false;
			 if(computer==this)return true;
			if (!(computer instanceof Computer))
				return false;
			Computer C = (Computer) computer;
			boolean isequal = C.manufacturer.equals(manufacturer) && C.processor.equals(processor) && C.ramSize == ramSize
					&& C.processorSpeed == processorSpeed;
			return isequal;

		}

	public int hashCode() {

			int hashValue = 11;
			long f = Double.doubleToLongBits(processorSpeed);
			
			hashValue = hashValue + manufacturer.hashCode() + processor.hashCode() + (int) ramSize + (int) (f ^ (f >>> 32));
			return hashValue;

		}

}

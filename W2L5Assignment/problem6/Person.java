package W2L5Assignment.problem6;

public class Person implements Cloneable {

	private String name;
	private Computer computer;

	public Person(String name, Computer computer) {

		this.name = name;
		this.computer = computer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public Object clone() throws CloneNotSupportedException {
		Person obj = (Person) super.clone();
		this.computer = (Computer) this.computer.clone();
		return obj;
	}

	public String toString() {
		return (this.name + " " + computer.toString());
	}
	/*
	 * @Override public String toString() { return "Person [name=" + name +
	 * ", computer=" + computer.toString() + "]"; }
	 */

}
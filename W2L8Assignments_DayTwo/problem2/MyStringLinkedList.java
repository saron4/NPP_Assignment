package W2L8Assignments_DayTwo.problem2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addSort(String item) {
		Node first = header;

		if (first == null) {
			first = new Node(null, item, null);
			header = first;
		} else if (first.value.compareTo(item) > 0) {
			Node newNode = new Node(header, item, first);
			header = newNode;
			first.previous = newNode;

		} else {
			Node newNode;
			if (first.next == null) {
				newNode = new Node(first, item, null);
				first.next = newNode;
			} else {

				newNode = new Node(first, item, first.next);
				first.next.previous = newNode;
				first.next = newNode;
			}

		}

//		Node previous=null;
//		Node temp=header;
//		while(temp!=null&&item.compareTo(temp.value)>0) {
//			previous=temp;
//			temp=temp.next;
//			
//		}
//		if(previous==null) {
//			header=new Node(null,item,header);}
//				
//			
//			else
//				{Node newNode=new Node(temp.previous,item,temp);
//				previous.next=newNode;
//				newNode.next=temp;
//				}
	}

	public int size() {
		int count = 0;
		if (header != null) {
			while (header.next != null) {
				count++;
				header = header.next;
			}
		}
		return count;
	}

	public boolean isEmpty() {
		if (header == null)
			return true;
		else
			return false;
	}

	public Node getFirst() {
		return header;

	}

	public Node getLast() {
		if (header == null)
			return header;
		else {
			Node temp = header;
			while (temp.next != null) {
				temp = temp.next;
			}
			return temp;
		}

	}

	public void removeFirst() {
		if (header == null) {
			System.out.println("List is Empty can not delete.");
		}

		else if (header.next == null) {
			header = null;
		} 
		else {
			header.next.previous = null;
			header.next = header;
		}
	}

	void removeLast() {
		if (header == null)
			System.out.println("List is Empty can not delete.");
		else {
			Node temp = header;
			while (temp.next != null) {
				temp = temp.next;
				temp.previous.next = null;
				temp = null;
			}
		}
	}

	public void print() {
		print(header);
	}

	private void print(Node n) {
		if (n == null)
			return;
		else {
			System.out.println(n.value);
			print(n.next);
		}

	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();

		mySL.addSort("Merry");
		mySL.addSort("Hiwi");
		mySL.addSort("Beza");
		mySL.addSort("Blen");
		mySL.addSort("Sami");
		mySL.addSort("Sura");

		System.out.println("My Orignal list is: " + mySL);
		System.out.println("Print list using Recursive");
		mySL.print();
		System.out.println("My list size is: " + mySL.size());
		System.out.println("Checking if the list is empty...... " + mySL.isEmpty());
		System.out.println("The 1st node of the list is: " + mySL.getFirst());
		System.out.println("The last node of the list is: " + mySL.getLast());
		mySL.removeLast();
		System.out.println("Removed the last node from the list: " + mySL);
		mySL.removeFirst();
		System.out.println("Removed the first node from the list: " + mySL);

	}
}

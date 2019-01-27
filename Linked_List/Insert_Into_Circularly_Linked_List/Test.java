public class Test {

	static class Node {

		public int data;
		public Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public void insertNode(int newData) {
		
			for (Node temp = this; temp.next != null; temp=temp.next) {
				if (
					//  case: between two nodes
					(newData >= temp.data && newData <= temp.next.data) ||
					// case: inserting after final node
					(newData >= temp.data && temp.data >= temp.next.data)
					) {
					temp.next = new Node(newData,temp.next);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Node a = new Node(1,null);
		Node d = new Node(5,a);
		Node c = new Node(3,d);
		Node b = new Node(2,c);
		a.next = b;

		a.insertNode(3);

		for (Node temp = a; temp.next != null; temp=temp.next) {
			System.out.println("Data: " + temp.data);
		}
	}
}
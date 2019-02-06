public class Test {

	static class Node{

		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	static Node kReverse(Node node, int k) {
		Node cur = node;
		Node prev = null;
		Node pivot = null;

		int count = 0;

		while (count < k && cur != null) {
			cur = node.next;
			node.next = prev;
			prev = node;
			if (count == 0) 
				pivot = node;
			node = cur;
			++count;
		}

		if (cur != null)
			pivot.next = kReverse(cur,k);

		return prev;
	}
	
	public static void main(String[] args) {

		Node h = new Node(8,null);
	    Node g = new Node(7,h);
		Node f = new Node(6,g);
		Node e = new Node(5,f);
		Node d = new Node(4,e);
		Node c = new Node(3,d);
		Node b = new Node(2,c);
		Node a = new Node(1,b);

		a = kReverse(a,5);

		for (Node temp = a; temp != null; temp = temp.next) {
			System.out.print(temp.data + "->");
		}
		System.out.println("NULL");
	}
}
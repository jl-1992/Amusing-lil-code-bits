public class Test {

	static Node head = null;

	static void convertToDLL(Node node) {
		if (node == null)
			return;

		convertToDLL(node.left);
		node.left = head;

		if (head != null) {
			head.right = node;
		}
		head = node;
		
		convertToDLL(node.right);
	} 



	public static void main(String[] args) {
		Node a = new Node(null,null,39);
		Node b = new Node(null,null,9);
		Node c = new Node(null,null,4);
		Node d = new Node(null,a,23);
		Node e = new Node(null,null,14);
		Node f = new Node(b,c,103);
		Node g = new Node(null,null,-3);
		Node h = new Node(d,e,6);
		Node i = new Node(null,null,71);
		Node j = new Node(g,f,11);
		Node k = new Node(h,i,3);
		Node l = new Node(null,j,5);
		Node m = new Node(k,l,2);

	    convertToDLL(m);

		while (d != null) {
			System.out.println(d.data);
			d = d.right;
		}
	}
}
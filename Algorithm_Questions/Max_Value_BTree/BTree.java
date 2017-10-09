public class BTree{
	
	static class Node{

		int data;
		Node left;
		Node right;

		public Node(Node left, Node right, int data){
			this.left=left;
			this.right=right;
			this.data=data;
		}
	}

	public int findMax(Node n){
		if(n!=null){
			int max = n.data;
			int newMax=findMax(n.left);
			if(newMax>max)
				max=newMax;
			newMax=findMax(n.right);
			if(newMax>max)
				max=newMax;
			return max;
		}

		return Integer.MIN_VALUE;
	}

	public static void main(String[] args){
		BTree tree = new BTree();

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

		System.out.println(tree.findMax(m));
	}
}
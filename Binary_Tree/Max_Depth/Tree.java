public class Tree{

	public static int depth(Node n){
		int leftMax=0, rightMax=0;
		if(n.left==null && n.right==null)
			return 0;
		if(n.left!=null){
			++leftMax;
			leftMax+=depth(n.left);
		}
		if(n.right!=null){
			++rightMax;
			rightMax+=depth(n.right);
		}
		if(leftMax>rightMax)
			return leftMax;
		return rightMax;

	}
	
	public static void main(String[] args){
		Node e = new Node(null,null);
		Node f = new Node(null,null);
		Node i = new Node(null,null);
		Node h = new Node(null,i);
		Node d = new Node(e,f);
		Node g = new Node(h,null);
		Node j = new Node(null,null);
		Node b = new Node(d,null);
		Node c = new Node(g,j);
		Node a = new Node(b,c);

		System.out.println(depth(a));
	}
}
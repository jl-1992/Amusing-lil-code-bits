public class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data, TreeNode left, TreeNode right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}

	public static void inOrderTraversal(TreeNode t)
	{
		if(t!=null){
			inOrderTraversal(t.left);
			System.out.println(t.data);
			inOrderTraversal(t.right);
		}
	}

	public static void preOrderTraversal(TreeNode t)
	{
		if(t!=null){
		System.out.println(t.data);
		preOrderTraversal(t.left);
		preOrderTraversal(t.right);
		}

	}

	public static void postOrderTraversal(TreeNode t)
	{
		if(t!=null){
		postOrderTraversal(t.left);
		postOrderTraversal(t.right);
		System.out.println(t.data);
		}

	}
	public static void main(String[] args)
	{
		TreeNode a = new TreeNode(1, null, null);
		TreeNode b = new TreeNode(2, null, null);
		TreeNode c = new TreeNode(3, null, null);
		TreeNode d = new TreeNode(4, null, null);
		TreeNode e = new TreeNode(5, a, b);
		TreeNode f = new TreeNode(6, c, d);
		TreeNode g = new TreeNode(7, e, f);
		inOrderTraversal(g);
		//preOrderTraversal(g);
		//postOrderTraversal(g);
	}
}
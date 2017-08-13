import java.util.*;

public class DFS_Tree{

	public void Depth_FS_preorder(Node n){
		if(n!=null){
			System.out.println(n.data);
			Depth_FS(n.left);
			Depth_FS(n.right);
		}
	}

	public void Depth_FS_inorder(Node n){
		if(n!=null){
			Depth_FS(n.left);
			System.out.println(n.data);
			Depth_FS(n.right);
		}
	}

	public void Depth_FS_postorder(Node n){
		if(n!=null){
			Depth_FS(n.left);
			Depth_FS(n.right);
			System.out.println(n.data);
		}
	}
	
	public static void main(String[] args){

	DFS_Tree t = new DFS_Tree();

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

	t.Depth_FS_preorder(m);
	//t.Depth_FS_inorder(m);
	//t.Depth_FS_postorder(m);

	}
}
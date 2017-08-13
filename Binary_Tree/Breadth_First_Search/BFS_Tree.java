import java.util.*;

public class BFS_Tree{

	public void Breadth_FS(Node n){
		Queue<Node> q = new LinkedList<Node>();
		if(n==null)
			return;
		q.add(n);
		while(!q.isEmpty()){
			Node temp = q.remove();
			System.out.println(temp.data);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null) 
				q.add(temp.right);
		}
	}
	
	public static void main(String[] args){

	BFS_Tree t = new BFS_Tree();

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

	t.Breadth_FS(m);

	}
}
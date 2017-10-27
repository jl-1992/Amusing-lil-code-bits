import java.util.ArrayList;

public class TreeNode{
	String data;
	ArrayList<TreeNode> children=new ArrayList<TreeNode>();

	public TreeNode(String data, ArrayList<TreeNode> children){
		this.data=data;
		this.children=children;
	}

	public void print(){
		System.out.println(this.data);
	}
}
import java.util.*;

/*
Given an array of valid words and an array of 7 letters, return all the valid words you can make with those letters.
Assume Scrabble rules, so words must be >= 2 letters and you can only use each letter once.

Ex.
Dictionary = ["add", "fed", "feed", "bead", "bag"] (stored as an n-ary tree in this example)
Letters = ["a", "b", "c", "d", "d", "e", "f"]
Answer = ["add", "fed", "bead"]
 */

public class Solution{

	public static String scrabble(TreeNode n, ArrayList<String> s){
		String ans = "";
		ArrayList<String> temp;
		ArrayList<String> words = new ArrayList<String>();
		if(n.children==null)
			return ans;
		for(TreeNode t : n.children){
			temp=new ArrayList<String>(s);
			if(temp.contains(t.data)){
				temp.remove(t.data);
				ans = t.data + scrabble(t,temp);
				words.add(ans);
			} 
		}

		if(n.data=="*"){
			System.out.println(words);
		}

		return ans;
	}

	/*public static String printTree(TreeNode t){
		if(t.children==null)
			return "";
		for(TreeNode n : t.children){
			n.print();
			printTree(n);
		}

		return "";
	}*/
	
	public static void main(String[] args){
		//construct n-ary tree

		TreeNode d3 = new TreeNode("d",null);
		ArrayList<TreeNode> d3_ = new ArrayList<TreeNode>();
		d3_.add(d3);

		TreeNode d2 = new TreeNode("d", d3_);
		ArrayList<TreeNode> d2_ = new ArrayList<TreeNode>();
		d2_.add(d2);

		TreeNode a1 = new TreeNode("a", d2_);

		TreeNode g = new TreeNode("g",null);
		ArrayList<TreeNode> g_ = new ArrayList<TreeNode>();
		g_.add(g);

		TreeNode a2 = new TreeNode("a",g_);
		ArrayList<TreeNode> a2_ = new ArrayList<TreeNode>();
		a2_.add(a2);

		TreeNode d4 = new TreeNode("d",null);
		ArrayList<TreeNode> d4_ = new ArrayList<TreeNode>();
		d4_.add(d4);

		TreeNode a3 = new TreeNode("a",d4_);
		ArrayList<TreeNode> a3_ = new ArrayList<TreeNode>();
		a3_.add(a3);

		TreeNode e1 = new TreeNode("e",a3_);
		
		ArrayList<TreeNode> b_ = new ArrayList<TreeNode>();
		b_.add(a2);
		b_.add(e1);
		TreeNode b = new TreeNode("b",b_);

		TreeNode d5 = new TreeNode("d", null);
		ArrayList<TreeNode> d5_ = new ArrayList<TreeNode>();
		d5_.add(d5);

		TreeNode e2 = new TreeNode("e", d5_);
		ArrayList<TreeNode> e2_ = new ArrayList<TreeNode>();
		e2_.add(e2);

		TreeNode d6 = new TreeNode("d", null);
		ArrayList<TreeNode> d6_ = new ArrayList<TreeNode>();
		d6_.add(d6);

		ArrayList<TreeNode> e3_ = new ArrayList<TreeNode>();
		e3_.add(e2);
		e3_.add(d6);
		TreeNode e3 = new TreeNode("e", e3_);

		ArrayList<TreeNode> f_ = new ArrayList<TreeNode>();
		f_.add(e3);
		TreeNode f = new TreeNode("f", f_);

		ArrayList<TreeNode> root_ = new ArrayList<TreeNode>();
		root_.add(a1);
		root_.add(b);
		root_.add(f);
		TreeNode root = new TreeNode("*", root_);

		//construct letters array

		ArrayList<String> letters = new ArrayList<String>();
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");
		letters.add("d");
		letters.add("e");
		letters.add("f");

		//printTree(root);
		//solve
		scrabble(root,letters);
	}
}
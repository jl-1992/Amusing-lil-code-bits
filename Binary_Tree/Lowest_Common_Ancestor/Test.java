import java.util.ArrayList;

import java.lang.Math;

public class Test {

	static ArrayList<Integer> pathToNode1 = new ArrayList<>();
	static ArrayList<Integer> pathToNode2 = new ArrayList<>();

	static ArrayList<Integer> leftParent = new ArrayList<>();
	static ArrayList<Integer> rightParent = new ArrayList<>();

	static boolean found1 = false;
	static boolean found2 = false;

	static void findPaths(int node1, int node2, Node root) {
		if (found1 && found2)
			return;

		if (root != null) {
			findPaths(node1, node2, root.left);
			if (root.data == node1) {
				found1 = true;
				pathToNode1.add(root.data);
			}
			if (root.data == node2) {
				found2 = true;
				pathToNode2.add(root.data);
			}
			if (found1 == false)
				pathToNode1.add(root.data);
			if (found2 == false)
				pathToNode2.add(root.data);
			findPaths(node1, node2, root.right);
		}
	}

	static void findLeft(Node root) {
		if (root != null) {
			leftParent.add(root.data);
			findLeft(root.left);
		}
	}

	static void findRight(Node root) {
		if (root != null) {
			rightParent.add(root.data);
			findRight(root.right);
		}
	}

	static int findLCA(ArrayList<Integer> arr1, ArrayList<Integer> arr2, Node root) {
		ArrayList<Integer> parents = null;
		// Nodes from different sides
		if ((arr1.contains(root.data) && !arr2.contains(root.data)) ||
			(arr2.contains(root.data) && !arr1.contains(root.data)))
			return root.data;

		// Same node
		else if (arr1.size() == arr2.size())
			return arr1.get(arr1.size() - 1);

		// Nodes from same side
		else {
			if (arr1.contains(root.data)) {
				parents = rightParent;
			}
			else{
				parents = leftParent;
			}
			if (parents == leftParent) {
				if (arr1.size() > arr2.size()) {
					for (int i = arr1.size() - 1; i >= 0; --i) {
						if (parents.contains(arr1.get(i)))
							return arr1.get(i);
					}
				} else {
					for (int i = arr2.size() - 1; i >= 0; --i) {
						if (parents.contains(arr2.get(i)))
							return arr2.get(i);
					}
				}
			} else {
				if (arr1.size() > arr2.size()) {
					for (int i = arr2.size() - 1; i < arr1.size(); ++i) {
						if (parents.contains(arr1.get(i)))
							return arr1.get(i);
					}
				} else {
					for (int i = arr1.size() - 1; i < arr2.size(); ++i) {
						if (parents.contains(arr2.get(i)))
							return arr2.get(i);
					}
				}
			}
		}
		return -1;
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

	    findPaths(9,5,m);
	    findLeft(m);
	    findRight(m);

	    // System.out.println(pathToNode1);
	    // System.out.println(pathToNode2);

	    // System.out.println(leftParent);
	    // System.out.println(rightParent);

	    System.out.println("answer: " + findLCA(pathToNode1, pathToNode2, m));

	}
}
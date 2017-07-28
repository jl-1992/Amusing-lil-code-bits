public class Node{
	int data;
	Node next;

	Node(int data, Node next)
	{
		this.data=data;
		this.next=next;
	}

	public static Node reverseList(Node n)
	{
		Node cur=n;
		Node prev=null;

		while(cur!=null)
		{
			n=n.next;
			cur.next=prev;
			prev=cur;
			cur=n;
		}

		return prev;
	}

	public static void main(String[] args)
	{
		Node a = new Node(1,null);
		Node b = new Node(2,a);
		Node c = new Node(3,b);
		Node d = new Node(4,c);
		Node e = new Node(5,d);
		Node f = reverseList(e);

		for(Node temp = f; temp!=null; temp=temp.next)
			System.out.println(temp.data);

	}
} 
public class Radix_Sort{
	
	//Initializes Node-list for hash-function
	public Node[] init_node_array(){
		Node[] a = new Node[10];
		a[0]= new Node(0,null);
		a[1]= new Node(1,null);
		a[2]= new Node(2,null);
		a[3]= new Node(3,null);
		a[4]= new Node(4,null);
		a[5]= new Node(5,null);
		a[6]= new Node(6,null);
		a[7]= new Node(7,null);
		a[8]= new Node(8,null);
		a[9]= new Node(9,null);
		return a;
	}

	//Find Max number to mod with array
	public int findMaxMod(int[] arr){
		int mod = 10;
		int count=0;
		while(count==0){
			for(int i=0;i<arr.length;++i){
				if(arr[i]%mod!=arr[i])
					break;
				if(i==arr.length-1)
					++count;
			}
			if(count==0)
				mod*=10;
		}
		return mod;
	}

	public void addArray(Node[] a, int[] n, int mod, int norm){
		for(int i=0;i<n.length;++i){
			int index = (n[i]%mod)/norm;
			Node temp=a[index];
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new Node(n[i],null);
		}
	}

	public void print_from_nodes(Node[] a, int mod, int norm){
		System.out.println("--------------------");
		System.out.println("(mod " + mod + ")/" + norm);
		System.out.println("--------------------");
		for(int i=0;i<a.length;++i){
			System.out.print(a[i].data + ": ");
			Node temp=a[i].next;
			while(temp!=null){
				System.out.print(temp.data + " ");
				temp=temp.next;
			}
			System.out.println();
		}
	}

	public int[] node_to_array(Node[] a, int size){
		int[] n = new int[size];
		for(int i=0,k=0;i<a.length;++i){
			Node temp=a[i].next;
			while(temp!=null){
				n[k]=temp.data;
				temp=temp.next;
				++k;
			}
		}
		return n;
	}

	public void sort(int[] arr){
		int max_mod = findMaxMod(arr);
		int mod = 10;
		int norm = 1;
		Node[] digit_array = init_node_array();

		while(mod<=max_mod){
			addArray(digit_array, arr, mod,norm);
			//uncomment to see digit list trace
			/*print_from_nodes(digit_array,mod,norm);
			System.out.println();*/
			arr=node_to_array(digit_array, arr.length);
			digit_array=init_node_array();
			mod*=10;
			norm*=10;
		}

		System.out.print("[");
		for(int i=0;i<arr.length-1;++i){
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1] + "]");
	}

	public static void main(String[] args){
		Radix_Sort r = new Radix_Sort();
		int[] z = {4,546,777,34,2,12,1234,276};
		r.sort(z);
	}
}
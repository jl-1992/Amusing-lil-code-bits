public class HashTable{
	public Node[] arr = new Node[12];

	public int HashFunc(String s){
		int sum=0;
		char[] t=s.toCharArray();
		for(int i=0;i<t.length;++i){
			sum+=(int) t[i];
		}
		return sum % arr.length;
	}

	public void printHash(){
		for(int i=0;i<arr.length;++i){
			for(Node temp=arr[i];temp!=null;temp=temp.next){
				System.out.println("key: "+temp.key+", value: " + temp.value);
			}
		}
	}

	public void put(String key, int value){
		if(arr[HashFunc(key)]!=null){
			Node temp=arr[HashFunc(key)];
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new Node(key,value,null);
		}
		else{
			arr[HashFunc(key)] = new Node(key, value, null);
		}
	}

	public int get(String key){
		if(arr[HashFunc(key)].next!=null){
			Node temp=arr[HashFunc(key)];
			while(temp.key!=key){
				temp=temp.next;
			}
			return temp.value;
		}
		else{
			return arr[HashFunc(key)].value;
		}
	}
}
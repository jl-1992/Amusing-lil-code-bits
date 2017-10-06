public class Sort{
	
	public static int[] bubble(int[] n){
		for(int j = 0;j<n.length;++j){
			for(int i=0;i<n.length-1;++i){
				if(n[i]>n[i+1]){
					int temp = n[i+1];
					n[i+1]=n[i];
					n[i]=temp;
				}
			}
		}	
		return n;
	}

	public static void main(String[] args){
		int[] n = {10,7,23,200,2345,-4,-3,0,21,1};
		n = bubble(n);
		for(int i=0;i<n.length;++i)
			System.out.println(n[i]);
	}
}
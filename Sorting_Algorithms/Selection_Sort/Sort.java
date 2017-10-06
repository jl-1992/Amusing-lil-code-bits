public class Sort{
	
	public static int[] selection(int[] n){
		for(int i=0;i<n.length;++i){
			int min = n[i];
			for(int j=i+1;j<n.length;++j){
				if(n[j]<n[i]){
					min=n[j];
					int temp=n[i];
					n[i]=min;
					n[j]=temp;
				}
			}
		}
		return n;
	}

	public static void main(String[] args){
		int[] n = {10,7,23,200,2345,-4,-3,0,21,1};
		n = selection(n);
		for(int i=0;i<n.length;++i)
			System.out.println(n[i]);
	}
}
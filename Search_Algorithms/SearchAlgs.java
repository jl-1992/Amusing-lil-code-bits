public class SearchAlgs{
	
	public int[] bubble(int[] n){
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

	public int[] selection(int[] n){
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
		SearchAlgs s = new SearchAlgs();
		int[] n = {10,7,23,200,2345,-4,-3,0,21,1};
		int[] t = s.bubble(n);
		for(int i=0;i<t.length;++i)
			System.out.println(t[i]);
			
	}
}
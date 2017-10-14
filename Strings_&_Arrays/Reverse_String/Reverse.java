public class Reverse{
	
	public String reverse_iterative(String s){
		char[] c = s.toCharArray();
		char temp=' ';
		for(int i=0;i<c.length/2;++i){
			temp=c[i];
			c[i]=c[c.length-1-i];
			c[c.length-1-i]=temp;
		}
		String t = new String(c);
		return t;
	}

	public String reverse_recursively(String s){
		if(s.length()==1)
			return s;
		else
			return reverse_recursively(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args){
		Reverse r = new Reverse();
		System.out.println(r.reverse_recursively("dog"));
	}
}
public class BufferExample{
	
	public static void main(String[] args){
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append("world");
		System.out.println(buffer);
		buffer.insert(5, " ");
		System.out.println(buffer);

	}
}
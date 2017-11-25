public class BuilderExample{
	
	public static void main(String[] args){
		StringBuilder builder = new StringBuilder("Hello");
		builder.append("world");
		System.out.println(builder);
		builder.insert(5, " ");
		System.out.println(builder);

	}
}
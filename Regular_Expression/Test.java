import java.util.regex.*;

public class Test{

	public static void regexChecker(String regex, String check){
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(check);
		while(m.find()){
			if(m.group().length()!=0){
				System.out.println(m.group().trim());
			}

			System.out.println("Start index: " + m.start());
			System.out.println("End index: " + m.end());
		}
	}
	
	public static void main(String[] args){
		String reg = "\\s[A-Za-z]{2,20}\\s";
		String reg1 = "\\d{10}";
		String reg2="[A-Za-z]{1,10}+@[A-Za-z]{1,10}\\.[a-z]{2,4}";
		String str="fishludy@gmail.com 6092896376 github.com/jl-1992" 
		+ " University of California, Irvine" 
		+ " Rutgers University";
		regexChecker(reg2,str);
	}
}
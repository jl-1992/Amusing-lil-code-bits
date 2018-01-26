import java.util.*;
import java.util.regex.*;

public class Solution{

	public static ArrayList<Integer> getIdsByMessage(String xml, String message){
		Pattern p = Pattern.compile("\\d");
		Pattern q = Pattern.compile("[a-zA-Z]{11}\\s[a-z]{3}\\s[a-z]{5}");
		Matcher m = p.matcher(xml);
		Matcher n = q.matcher(xml);


		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashMap<Integer, String> h = new HashMap<Integer,String>();

		while(m.find() && n.find()){
				h.put(Integer.parseInt(m.group()),n.group());
		}

		for(Integer i : h.keySet()){
			if(h.get(i).equals(message))
				ans.add(i);
		}

		return ans;

	}
	

	public static void main(String[] args){
		String str = "<log> <entry id=\"1\"> <message>Application has" +
					 " started</message></entry>" +
					 "<entry id=\"2\"> <message>Application has" +
					 " ended</message></entry></log>";

		ArrayList<Integer> res = getIdsByMessage(str, "Application has ended");
		System.out.println(res);
	}
}
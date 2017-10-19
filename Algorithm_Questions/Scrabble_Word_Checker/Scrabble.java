import java.util.*;

/*
Given an array of valid words and an array of 7 letters, return all the valid words you can make with those letters.
Assume Scrabble rules, so words must be >= 2 letters and you can only use each letter once.

Ex.
Dictionary = ["add", "fed", "feed", "bead", "bag"]
Letters = ["a", "b", "c", "d", "d", "e", "f"]
Answer = ["add", "fed", "bead"]
 */

public class Scrabble{
  public static void scrabble(ArrayList<String> a, ArrayList<Character> b) {
    ArrayList<String> strings = new ArrayList<String>();
    
    for(int i=0; i<a.size(); i++){
      int count=0;
      String temp = a.get(i);
      for(int j=0; j<b.size(); j++){
        for(int k=0; k<temp.length(); k++){
          if(b.get(j)==temp.charAt(k)){
            ++count;
            temp=temp.substring(0,k) + temp.substring(k+1);
            break;
          } 
        }
      }
      if(count==a.get(i).length())
        strings.add(a.get(i));
    }
    for(String s : strings)
      System.out.println(s);
  }
  
  public static void main(String[] args){
    ArrayList<String> Dictionary = new ArrayList<String>();
    ArrayList<Character> Letters = new ArrayList<Character>();
    
    Dictionary.add("add");
    Dictionary.add("fed");
    Dictionary.add("feed");
    Dictionary.add("bead");
    Dictionary.add("bag");

    Letters.add('a');
    Letters.add('b');
    Letters.add('c');
    Letters.add('d');
    Letters.add('d');
    Letters.add('e');
    Letters.add('f');
    
    scrabble(Dictionary,Letters);
  }
}

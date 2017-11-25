public class TimeTest{
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Hello");  
        for (int i=0; i<100000; i++){  
            sb.append("word");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Hello");  
        for (int i=0; i<100000; i++){  
            sb2.append("word");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	}
}
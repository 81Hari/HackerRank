import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TimeConversion{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(Result.timeConversion(s));
		
	}
	
}

class Result {


    public static String timeConversion(String s) {
    	
    	 int t;
         int n = s.length();
         
         t = Character.getNumericValue(s.charAt(0));
         t = t*10 + Character.getNumericValue(s.charAt(1));
         
         StringBuilder s1 = new StringBuilder(s);
         
         if(s.charAt(8) == 'P' && t!=12) {
             
             s1.setCharAt(0,Character.forDigit(((t + 12)/10),10));
             s1.setCharAt(1,Character.forDigit((t + 12)%10,10));
             
             
         }
         else if(s.charAt(8) == 'A' && t==12) {
             s1.setCharAt(0,'0');
             s1.setCharAt(1,'0');
             
         }
         s1.delete(n-2, n);
         return s1.toString();

     }

        
        		


}

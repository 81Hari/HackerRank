import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


class Result {

   

    public static String pangrams(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> count = new HashMap<Character,Integer>();
        char []alphaCharArr = alpha.toCharArray();
        char []sCharArr = s.toLowerCase().toCharArray();
        for(char c : alphaCharArr) {
            if(count.containsKey(c)) {
                
            }    
            else {
                count.put(c, 0);
            }
        }
            
        for(char c : sCharArr) {
            if(count.containsKey(c)) {
                count.put(c, 1);
            }
        }    
    
        if(count.containsValue(0)) {
            return "not pangram";
        }
        else {
            return "pangram";
                
        }
  

    }
}


public class Pangrams{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine().trim();
		String result = Result.pangrams(s);
		System.out.println(result);
	}
	
}
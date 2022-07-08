import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
    
    	char[] sCharArr = s.toCharArray();
    	int count,i;
    	count=i=0;
    	
    	for(char c:sCharArr) {
    		if((i%3 == 0 || i%3 == 2) && c != 'S') {
    			count++;
    			
    			
    		}
    		else if(i%3 == 1 && c != 'O') {
    			count++;
    		}
    		i++;
    		
    	}
    	return count;
    }

}


public class MarsExploration{
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String msg = bf.readLine().trim();
		
		int result = Result.marsExploration(msg);
		
		System.out.println(result);
		
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result{
	
	 public static int countingValleys(int steps, String path) {
		    	int pos,valley;
		    	pos = valley =0;
		    	boolean deep = false;
		    	
		    	
		    	for(int i=0;i<steps;i++) {
		    		
		    		if(path.charAt(i) == 'U') {
		    			pos++;
		    		}
		    		else if(path.charAt(i) == 'D') {
		    			pos--;
		    		}
		    		
		    		if(pos == 0) {
		    			if(deep) {
		    				valley++;
		    			}
		    			deep = false;
		    		}
		    		else if(pos<0) {
		    		
		    			deep= true;
		    		}
		    		
		    			
		    		}
		    	
		    	return valley ;

		    }
	
}

public class CountingValleys{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int steps = Integer.parseInt(bf.readLine());
		String path = bf.readLine().trim();
		
		int result = Result.countingValleys(steps, path);
		System.out.println(result);
		
		
	}
	
}
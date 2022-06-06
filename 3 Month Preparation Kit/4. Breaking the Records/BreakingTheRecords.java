import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class BreakingTheRecords {
	
	public static void main(String[] args)throws IOException{
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		List<Integer> scores = new ArrayList<Integer>();
		String[] input = new String[n];
		input = br.readLine().split(" ");
		for(int i =0;i<n;i++) {
			scores.add(Integer.parseInt(input[i]));
		}
		
		
		
		List<Integer> result = Result.breakingRecords(scores);
		
		System.out.println(result.get(0)+" "+result.get(1));
	}
}

class Result {


    public static List<Integer> breakingRecords(List<Integer> scores) {
    int l,h;
    l=h=0;
    int n = scores.size();
    int low = scores.get(0);
    int high = scores.get(0);
    for(int i=0;i<n;i++) {
    	if(scores.get(i)<low){
    		l++;
    		low = scores.get(i);
    		
    	}
    	else if(scores.get(i)>high) {
    		
    		h++;
    		high = scores.get(i);
    	}
    }
    
    List<Integer> count =new ArrayList<Integer>();
    count.add(h);
    count.add(l);
    
    return count;
    }

}

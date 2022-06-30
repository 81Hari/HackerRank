import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    
    		
    	List<Integer> freqArr = new ArrayList<Integer>();
    	
    	for(int i=0;i<100;i++) {
    		freqArr.add(0);
    	}
    		

    	for(int i =0;i<arr.size();i++) {
    		
    
			
			freqArr.set(arr.get(i), freqArr.get(arr.get(i))+1);		
		}
		
	
        
        
    	return freqArr;
        

    }

}


public class CountingSort1{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		List<Integer> arr = Stream.of(bf.readLine().trim().split(" "))
				.map(Integer::parseInt).collect(toList());
		List<Integer> result = Result.countingSort(arr);
		System.out.println(result);
		
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> arr) {
    
    	int flag = 0;
    	for(int i =0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    			if((arr.get(i) + arr.get(j))%k == 0) {
    				flag++;
    			}
    		}
    	}
    	return flag;
    }

}


public class DivisibleSumPairs{
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] rawInput = bf.readLine().replaceAll("\\s+$", "").split(" ");
		
		/*
		 	s.replaceAll("\\s", "") Replace each space character with nothing.

			s.replaceAll("\\s+", "") Replace each group of 1 or more spaces with nothing.

			s.replaceAll("\\s+$", "") Replace each group of 1 or more spaces at the end of the string with nothing.
		 */
		
		int n = Integer.parseInt(rawInput[0]);
		int k = Integer.parseInt(rawInput[1]);
		
		List<Integer> arr = Stream.of(bf.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());
		
		int result = Result.divisibleSumPairs(n, k, arr);
		System.out.println(result);
		
				
	}
}
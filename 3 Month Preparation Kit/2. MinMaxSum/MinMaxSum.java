import java.util.*;

public class MinMaxSum{
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int temp;
		for(int i = 0;i<n;i++) {
			temp = scan.nextInt();
			arr.add(temp);
		}
		Result.miniMaxSum(arr);
		
	}
}
class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    	Collections.sort(arr);
    	int n = arr.size();
    	long min_sum=0;
    	long max_sum=0;
    	for(int i=0;i<n;i++) {
    		if(i==0) {
    			min_sum+=arr.get(i); 
    		}
    		else if(i==n-1) {
    			max_sum+=arr.get(i);
    		}
    		else {
    		min_sum+=arr.get(i);
    		max_sum+=arr.get(i);
    		}
    		
    	}
    	System.out.println(min_sum);
    	System.out.println(max_sum);

    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.IOException;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    	Collections.sort(a);
    	for(int i=0;i<a.size()-1;i=i+2) {
    		if(a.get(i)!=a.get(i+1)) {
    			return a.get(i);
    		}
    	}
    	return a.get(a.size()-1);

    }
}
public class LonelyInteger {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] raw_array = bf.readLine().replaceAll("\\s+$", "").split(" ");
		List<Integer> arr = new ArrayList<>();
		for(int i =0;i<n;i++) {
			arr.add(Integer.parseInt(raw_array[i]));
		}
		int result = Result.lonelyinteger(arr);
		System.out.println(result);
	}
}
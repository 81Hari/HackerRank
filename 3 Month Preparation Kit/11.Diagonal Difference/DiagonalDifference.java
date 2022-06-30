import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int left,right;
    	left = right = 0;
    	for(int i=0;i<arr.size();i++) {
    		left = left + arr.get(i).get(i);
    		right = right + arr.get(i).get(arr.size()-i-1);
    	}
    	
    	return Math.abs(right-left);

    }

}

public class DiagonalDifference{
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine().trim());
		
		List<List<Integer>> arr = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			List<Integer> tempArr = Stream.of(bf.readLine().trim().split(" ")).map(Integer::parseInt).collect(toList());
			arr.add(tempArr);
		}
		int result = Result.diagonalDifference(arr);
		System.out.println(result);
		bf.close();
		
	}
}
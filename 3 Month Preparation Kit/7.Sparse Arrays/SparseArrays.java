import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.util.stream.Collectors.toList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.io.IOException;
class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    	List<Integer> res = new ArrayList<Integer>();
    	for(String i : queries ) {
    		int flag = 0;
    		for(String j : strings) {
    			if(i.equals(j)) {
    				flag++;
    			}
    		}
    		res.add(flag);
    	}
    	
    	return res;
    	

    }

}

public class SparseArrays{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int stringCount = Integer.parseInt(bf.readLine().trim());
		
		List<String> strings = IntStream.range(0, stringCount).mapToObj(i -> {
            try {
                return bf.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());
		
		int queryCount = Integer.parseInt(bf.readLine().trim());
		
		List<String> queries = IntStream.range(0, queryCount).mapToObj(i -> {
            try {
                return bf.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());
		
		List<Integer> res = Result.matchingStrings(strings, queries);
		System.out.println(res);
		
	}
}
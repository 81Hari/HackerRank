import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.TooManyListenersException;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    	
    	for(int i=0;i<grades.size();i++) {
    		int grade = grades.get(i);
    		if(grade>=38) {
    			int diff = grade%5; 			
    			if(diff != 0 && (5-diff)<3) {
    				grades.set(i, grade+(5-diff));
    			}
    		}
    	}
    	
    	
    	return grades;
    }

}


public class GradingStudents{
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		List<Integer> grades = Stream.of(bf.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
	            .collect(toList());
		
		List<Integer> result = Result.gradingStudents(grades);
		
		System.out.println(result);
		
		
	}
}
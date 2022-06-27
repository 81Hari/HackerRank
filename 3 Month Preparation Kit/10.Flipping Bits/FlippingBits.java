import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long binNum) {
    	long num = 0;
    	StringBuilder binString1 = new StringBuilder("00000000000000000000000000000000");
    	
    	if(Math.pow(2, 32)>=binNum) {
    		int i =0;
    		while(binNum!=0) {
    			char ch = Long.toString(binNum%2).charAt(0);
    			binNum = binNum/2;
    			binString1.setCharAt(31-i++, ch);
    		}
    	}
    	System.out.println(binString1);
    	
    	String binString = binString1.toString();
    	
    	binString = binString.replaceAll(Character.toString('1'), Character.toString('2'));
    	binString = binString.replaceAll(Character.toString('0'), Character.toString('1'));
    	binString = binString.replaceAll(Character.toString('2'), Character.toString('0'));
    	System.out.println(binString);
    	num = Long.parseLong(binString,2);
    	
    	return num;
    	
    	

    }

}

public class FlippingBits{
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine().trim());
		
		long binNum;
		for(int i=0;i<n;i++) {
			binNum=Long.parseLong(bf.readLine().trim());
			long result = Result.flippingBits(binNum);
			System.out.println(result);
		}
	}
}
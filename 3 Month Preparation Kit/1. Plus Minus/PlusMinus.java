import java.util.*;
import java.util.Scanner;
public class PlusMinus{
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int temp;
		for(int i =0;i<n;i++) {
			temp=scan.nextInt();
			arr.add(temp);
		}
		Result.plusMinus(arr);
	}
}
class Result {


    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        float pos,neg,zero;
        pos = neg = zero = 0;
        for(int i = 0;i<n;i++){
            if(arr.get(i)<0){
                neg++;
            }
            else if(arr.get(i)>0){
                pos++;
            }
            else{
                zero++;
            }
        }
        System.out.println(String.format("%.6f", (pos/n)));
        System.out.println(String.format("%.6f", (neg/n)));
        System.out.println(String.format("%.6f", (zero/n)));

    }

}

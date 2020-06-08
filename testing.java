import java.util.Scanner;
import java.util.Arrays;
public class testing {
	public static int search(int []A,int v) {
		int a=Arrays.binarySearch(A,v);
		return a;
	}
	public static void main(String[]args) {
		int Q[]= {4,2,5,9};
		System.out.println(search(Q,9));
		int a = 9;
		while (a > 4) {
		a--;
		System.out.println(a+a);
		--a;
		} // end while
		System.out.println("a = " + a);
		
	}
	
		
		
	

}

import java.util.Scanner;
import java.security.SecureRandom;
public class shee {
//Q1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner too=new Scanner(System.in);
		SecureRandom r= new SecureRandom();
		//a
		int [][]t =new int [2][3];
		//b
		for(int i=0;i<t.length;i++) {
			System.out.println();
			for(int j=0;j< t[i].length ;j++) {
				t[i][j]=3;
				System.out.print(t[i][j] + " ");}}
		int [][]a =new int [2][3];
		System.out.println();
		System.out.println();
//c
		for(int e=0;e<a.length;e++) {
			System.out.println();
			for(int i=0;i<a[e].length;i++) {
				a[e][i]=1+r.nextInt(6);
				System.out.print(a[e][i] + " ");}
		}
		System.out.println();
//d
		int s=a[1][1];
		for(int w=0;w<a.length;w++) {
			for(int j=0;j<a[w].length;j++) {
				if(t[w][j]<s) {
					s=a[w][j];
				}
			}
		}
		System.out.println(s);
//e

			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[0][j] + " ");}
			System.out.println();
//f
			int sum=0;
			for(int j=0;j<a.length;j++) {
				sum+=a[j][2];
				
			}
			System.out.println(sum);
//g
			System.out.println("\t0\t1\t2");
			for(int i=0;i<a.length;i++) {
				System.out.print(i +"\t");
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j] +"\t" );
				}
				System.out.println();
			}
		
	}

}

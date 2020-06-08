import java.util.Scanner;
import java.security.SecureRandom;
public class tyyg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner too=new Scanner(System.in);
SecureRandom r1=new SecureRandom();

int a1=1+r1.nextInt(6);
sequre( a1);
System.out.println("enter the rows and colums of mat a &&b");
int r=too.nextInt();
int c=too.nextInt();
System.out.println("enter the elements of mat 1");
int A[][]=new int [r][c];
int B[][]=new int [r][c];

for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		A[i][j]=too.nextInt();
	}
}
for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		B[i][j]=too.nextInt();
	}
	
}System.out.println("A  +   B");
int s[][]=new int [r][c];
for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		s[i][j]=B[i][j]+A[i][j];
	}
	
}
for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		System.out.print(s[i][j]+ " ");
	}System.out.println();
	
}
int t[]= {1,2,3,3,2,1,1,2,3,3,2,1,3,3,3,2,1,1,2,3};
int f[]=new int [4];
for(int i=0;i<t.length;i++) {
	++f[t[i]];
}
for(int i=1;i<f.length;i++) {
	System.out.println(f[i]);
}
	}
static boolean ispos(int a) {
	boolean f;
	if (a>0) {
		 f=true;
	}
	else {
		 f=false;
	}
	return f;
}
static void sequre(int a) {
	for (int i=1;i<=a;i++) {
		for(int j=1;j<=a;j++) {
			System.out.print("#");
		}System.out.println();
	}
}
}

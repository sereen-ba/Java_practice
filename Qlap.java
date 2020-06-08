import java.util.Scanner;
public class Qlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner too=new Scanner(System.in);
	/*	int a=too.nextInt();
		int s=0;
		while(a>0) {
			int d=a%10;
			s+=d;
			a=a/10;
		}
		System.out.println(s);
		int n=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d  ",n);
				++n;
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				if (i==j) {
					System.out.printf("%d  ",1);

				}
				else if ((i%2==0 &&j%2==0) || (i%2!=0 &&j%2!=0) ) {
					System.out.printf("%d  ",1);

				}
				else
					System.out.printf("%d  ",0);

				
}
			System.out.println();

		}*/
		for (int i=1;i<=8;i++) {
			System.out.println();
			for (int j=1;j<=8;j++) {
				if (i==1||j==1||i==8) {
					System.out.printf("* ");

				}
				else if (j==8) {
					System.out.printf(" %12s ","*");

				}
			}
		}
		int r=too.nextInt();
		int w=0;
	while(r>0) {
			r=r/10;
			w++;
		}
	if (w==5)
		System.out.println("the num is  a five digit");
	else
				
				System.out.println("the num is not a five digit");

	
			
		//Q4/37
	int x=5;
	int p=1;
	for (int i=5;i>=1;i--) {
		p=p*i;
	}

	System.out.println(p);
		
	double q=too.nextInt();
	double e=1;
	double s=1;
	if (q>0) {
				
		for (double i=1;i<=q;i++) {
			
			s=s*i;
			e+=(1/s);
	
		}
		
	}	System.out.println(s);
	System.out.println(e);

	}

}

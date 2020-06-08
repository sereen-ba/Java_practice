
public class Timetest {
	private int h,m,s;
	public void setTime(int h,int m,int s)  {
		if(h<0||h>=24||m<0||m>=60||s<0||s>=60) {
			throw new IllegalArgumentException ();}
		this .h=h;
		this.m=m;
		this .s =s;
	}
	public String touniversal() {
		return String.format("%02d:%02d:%02d", h,m,s);
		
	}
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((h==0||h==12)?12:h%12),m,s,(h<12?"AM":"PM"));
	}
private static void displaytime(String header,Timetest time) {
		
		System.out.printf("%s%nunversal time: %s%n Standerd time:%s%n", header,time.touniversal(),time.toString());
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timetest time =new Timetest();
		displaytime("After time object id created ",time);

		
		
		
		try {
		
			time.setTime(13,27,6);
			System.out.println();
			displaytime("After time object is intilized ",time);
			System.out.println();
			time.setTime(99, 99, 99);
			time.setTime(1,27,6);
			System.out.println();
			displaytime("After time object is intilized ",time);
			
		}catch (IllegalArgumentException e) 
		{
			System.out.printf("Expejdk %s%n%n", e);
		}
		displaytime("After  object is intilized ",time);

		

	}
	

}

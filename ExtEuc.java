import java.util.Scanner;


public class ExtEuc 
{
	int r,gcd;
	 void  exEucl(int a, int b)
	{
		int r1, r2,q,s1,s2,t1,t2,s,t;
		r1=a;
		r2=b;
		q=r1/r2;
		s1=1;
		s2=0;
		t1=0;
		t2=1;
		while(r2>0)
		{
			q=r1/r2;
			r=r1-q*r2;
			r1=r2;
			r2=r;
			s=s1-q*s2;
			s1=s2;
			s2=s;
			t=t1-q*t2;
			t1=t2;
			t2=t;
			
		}
		s=s1;
		t=t1;
		gcd=a*s+b*t;
		System.out.println("The GCD of ("+a+","+b+") is r1="+ r1);
		System.out.println("GCD by the equation as+bt="+gcd);
	}
	

	public static void main(String[] args) 
	{
		ExtEuc E=new ExtEuc();
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers:");
		a=in.nextInt ();
		b=in.nextInt();
		E.exEucl(a,b);
		
	}

}
/*		OUTPUT
Enter two integers:
45
66
The GCD of (45,66) is r1=3
GCD by the equation as+bt=3
*/

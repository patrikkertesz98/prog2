package kodolasscratch;

public class pi {
     
	public static double mod(double n, double k)
	{
		double t =1;
		double r = 1;
		double b = 16;
		
		while(t<=n)
		{
			t= t*2;
		}
		
		while(true)
		{
			if(n>=t)
			{
			r = (b*r)%k;
			n = n-t; 
			}
			t = t/2;
			if(t>=1)
			{
				r = (r*r) % k;
			}else break;
		}
		return r;
	}
	
	public static double alakit(double s)
	{
		if(s<0)
		{
			s = s - (int )s;
			s = s + 1;
			
		}else
		{
			s = s - (int )s;	 
		}
		return s;
	}
	
	
	
	public static void main(String [] args)
	{
		double S1=0, S4=0,S5=0, S6=0;
		
		
		
		for(int i=0; i<=1000000; i++)
		{ 
			S1 =S1 + mod(1000000-i, 8*i+1)/(8*i + 1);
			S4 =S4 + mod(1000000-i, 8*i+4)/(8*i + 4);
			S5 =S5 + mod(1000000-i, 8*i+5)/(8*i + 5);
			S6 =S6 + mod(1000000-i, 8*i+6)/(8*i + 6);
		}
		
		S1 = alakit(S1);
		S4 = alakit(S4);
		S5 = alakit(S5);
		S6 = alakit(S6);
		System.out.println(S1);
		System.out.println(S4);
		System.out.println(S5);
		System.out.println(S6);
		
		double pi=0;
		pi = (4 * S1)-(2 * S4) - S5 - S6;
		pi = alakit(pi);
		
		int kuka = 0;
		int i=0;
		String[] hex = {"A", "B", "C", "D", "E", "F"};
		System.out.println("Hexadecimal format: ");
		while(pi > 0)
		{
			pi = pi * 16;
			kuka = (int)pi;
			pi = pi - (int )pi;
			//System.out.println(kuka);
			
			if(kuka >= 10)
			{
				System.out.print(hex[kuka-10]);
			}else
			{
				System.out.print(kuka);
			}
			
		}
			
	}
	
	
}

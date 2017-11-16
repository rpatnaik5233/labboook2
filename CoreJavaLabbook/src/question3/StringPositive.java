package question3;

import java.util.Scanner;

public class StringPositive {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s;
		int m=0,k=0;
		System.out.println("Enter the string which is to be checked: ");
		s=sc.next();
		int i,j,l;
		l=s.length();
		for(i=0;i<l;i++)
		{
			char c=s.charAt(i);
			for(j=i+1;j<l;j++)
			{
				char d=s.charAt(j);
				int x=(int)c;
				int y=(int)d;
				if(x<y){
					m++;
				}
				else
				{
					break;
				}
			}
			if(m>0)
			{
				m=0;
				k=1;
			}
			else
			{
				break;
			}
		}
		if(k==1)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	
	}

}

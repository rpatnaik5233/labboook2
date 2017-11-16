package question3;

import java.util.Scanner;

public class Stringprog1 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String input,out=" ";
		int c=0;
		System.out.println("Enter your choice: \n1.Addition\n2.Replace\n3.Remove\n4.Change");
		c=sc.nextInt();
		System.out.println("Enter the string: ");
		input=sc.next();
		switch(c)
		{
		case 1:
		{
			out=input.concat(input);
			System.out.println("After addition: "+out);
			break;
		}
		
		case 2:
		{
			for (int i=0; i < input.length(); i++){
		        if (i % 2 != 0){
		          out=out+input.charAt(i);
		        }
		        else
		        {
		        	out=out+"#";
		        }
		      }
			System.out.println(out);
			break;
		}
		
		case 3:
		{
			for (int i = 0; i < input.length(); i++) {
	            for (int j = 1; j < input.length();j++) {
	            	char a=input.charAt(i);
	            	char b=input.charAt(j);
	                if (a==b) {
	                     c++;
	                }
	            }
	                if(c==1)
	                {
	                	
						out=out+ input.charAt(i);
	                	c=0;
	                }
	            }
System.out.println(out);
			break;
		}
		
		case 4:
		{
			for (int i=0; i < input.length(); i++){
		        if (i % 2 != 0){
		          out=out+input.charAt(i);
		        }
		        else
		        {
		        	char b=input.charAt(i);
		        	out=out+Character.toUpperCase(b);
		        }
		      }
			System.out.println(out);
			break;
		}
		
		default:
		{
			System.out.println("Wrong Choice");
			break;
		}
		}
		
	}

}

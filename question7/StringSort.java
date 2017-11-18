package question7;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String a[]={"Roshan","Patnaik","Capgemini","Akshay", "Tech", "Park"};
		Arrays.sort(a);
		for (String string : a) {
			System.out.println(string);
		}
	}

}

package question7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
			list.add("Array");  
			list.add("Ravi");  
			list.add("Vijay");  
			list.add("Roshan");
Collections.sort(list);
		  Iterator itr=list.iterator();  
		  		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}

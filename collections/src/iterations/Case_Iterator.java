package iterations;

import java.util.Iterator;
import java.util.LinkedHashSet;

// The Iterator interface is available for all collection
public class Case_Iterator {

	public static void main(String[] args) {
		
		// In this case we will iterate through a LinkedHashset class		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		//populate the list
		lhs.add("Cessouma");
		lhs.add("is");
		lhs.add("my");		
		lhs.add("best");
		lhs.add("friend");
		
// Use the standard print of lhs
		System.out.println("lhs contains: "+lhs);

//Let's explore a few methods availed by iterator
// Get a reference of a new iterator pointing to the collection
Iterator <String> itr = lhs.iterator();	
System.out.println("Check if lhs conatins at leat one element");
System.out.println("lhs is not empty: "+ itr.hasNext());

//Cycle through the iterator and print the elements
while(itr.hasNext()){
	//String st = itr.next();
	//System.out.print(st+" ");
	System.out.print(itr.next()+" ");
}

System.out.println();
//The iterator can also be used to remove elements from the collection
//Cycle through the iterator and print the elements

//Another iterator that contains elements to be removed
Iterator <String> itr2 = lhs.iterator();	
while(itr2.hasNext()){
	  String st = itr2.next();
	  itr2.remove();	
      System.out.println(st.toUpperCase()+" is removed ");
	
}

//Ensure all the elements are removed 
System.out.println("itr2 still contains elements:"+itr2.hasNext());
	}

}

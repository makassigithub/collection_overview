package lists;

// ArrayList implements AbstractList
import java.util.ArrayList;

public class Case_ArrayList {
	
	public static void main(String...args){
		
		// initialize new ArrayList of String	
		ArrayList <String> aList = new ArrayList<String>();
		
		// Add strings to the ArrayList
		aList.add("I");
		aList.add("am");
		aList.add("happy");
		aList.add("since");
		aList.add(4,"morning");// add at a specific location
		
		// get The size of aList
		System.out.println("Size of aList is: "+ aList.size());
		
		//Quick print of aList elements. this call the toString() from AbstractList
		System.out.println("aList  initially contains: "+ aList);
		
		//add one more element to the list and print it again
		aList.add(2,"not");
		System.out.println("aList after increasing contains: "+aList);
		
		//remove 2 elements and Print again
		aList.remove("not");//remove using reference
		aList.remove(4);    // remove using index
		System.out.println("aList is decreased to: "+aList);
		
		//Allocate enough capacity for element we will storing in aList
		aList.ensureCapacity(7);
		
		//Subsequent extension of aList will not relocate memory again, up to size()=7
		aList.add("because of this");		
		System.out.println("We currently have "+ aList.size()+" elements in aList");
		
		//Let's trim aList to the current size.
		aList.trimToSize();
		
		//still aList can kepp growing
		aList.add("ok!");
		System.out.println("aLIst now contains: "+aList);
		
		//if we need a array of string instead of an ArrayList for further coding, we have 2 options
		System.out.println("Convert aList to array of Object");
		
		Object [] arr_obj = aList.toArray();
		//print the array
		for(Object o : arr_obj)System.out.println(o);
		
		System.out.println();
		
		System.out.println("Convert aList to Array of specific object it contains: String in this case");
		
		//This takes an empty array of the specific object initialize with the size of ArrayList
		String [] arr_str = aList.toArray(new String[aList.size()]);
		//print the array
		for(String s : arr_str) System.out.println(s);
		
		//If the type of object in the ArrayList matters, the 2nd method is necessary
		//otherwise the an explicit casting is needed
		
		
		
		
		
		
	
	}

}

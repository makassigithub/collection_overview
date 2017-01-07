package iterations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//ListIterator is similar to Iterator but only available for collections that implements the List interface
public class Case_LisIterator {

public static void main(String...args){
	
//Instantiate an ArrayList from an Array of Integer
Integer[] intArr = new Integer[]{1,2,3,4,5};
List <Integer> intList = new ArrayList<Integer>(Arrays.asList(intArr));

//Print intList using a ListIterator
ListIterator <Integer> liter = intList.listIterator();

//Print element from liter
System.out.print("intList contains: ");
while(liter.hasNext()){
	Integer i = liter.next();
	System.out.print(i+" ");	
}

System.out.println();

//Modify the content of the ListIterator
liter = intList.listIterator();
while(liter.hasNext()){
	Integer i = liter.next();
	liter.set(i+5);	
}

//print the new content of liter2
liter = intList.listIterator();
System.out.print("intList now contains: ");
while(liter.hasNext()){
	Integer i = liter.next();
	System.out.print(i+" ");	
}
System.out.println();
System.out.println("Now we display the list backward");
System.out.println("List read from the queue");
while(liter.hasPrevious()){
	Integer i = liter.previous();
	System.out.print(i+" ");	
}

}
}

package sets;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//Extends AbstractSet and implements NavigableSet
public class Case_Treeset {

	
public static void main(String...args) {
	
	TreeSet <Integer> tSet = new TreeSet<Integer>();
	// make tSet grow
	tSet.add(5);
	tSet.add(3);
	tSet.add(1);
	tSet.add(10);
	tSet.add(12);
	
	System.out.println("TreeSet elements are sorted in storage: "+tSet);
	System.out.println("\nTreeSet can aso be constructed using SortedSet reference as argument");
	System.out.println();
	
// Let's practice some NavigableSet interface methods
// Get the elements immediately >= than the argument
   System.out.println("The elements that's >= 5 in the list is: "+tSet.ceiling(5));
   System.out.println("The elements that's =< 3 in the list is: "+tSet.floor(3));
   System.out.println();
  
   
//  If the search parameter is not the the list, the closest one greater than the parameter is return
   System.out.println("The elements that's >= 6 in the list is: "+tSet.ceiling(6));
   System.out.println("The elements that's =< 2 in the list is: "+tSet.floor(2));
   System.out.println();
   
//get the larger element than the search parameter(immediate greater than)
// and the smaller element than the search parameter(immediate lower than)
   System.out.println();
   System.out.println("The largest amongst those greater than 5 is: "+tSet.higher(9));
   System.out.println("The largest amongst those greater than 5 is: "+tSet.lower(4));
   System.out.println();
   
//Remove items from the set
   System.out.println("Remove and return the first item(smallest) from the set: "+tSet.pollFirst());
   System.out.println("Remove and return the last item(highest) from the set: "+tSet.pollLast());
   System.out.println();
   
//Print tSet using an Iterator
   System.out.println("tSet print with iterator()");
   Iterator tSet_itr = tSet.iterator();
   while(tSet_itr.hasNext()){
	// the next() returns an Object: Casting is needed, unless we specify the type parameter
	   Integer i =(Integer) tSet_itr.next();
	   System.out.print(" "+i);
   }
   System.out.println();
   
//Print tSet using DescendingIterator
   System.out.println("tSet print with descendingIterator()");
   Iterator <Integer> desc_tSet_itr = tSet.descendingIterator();
   while(desc_tSet_itr.hasNext()){
	   Integer i = desc_tSet_itr.next();
	   System.out.print(" "+i);
   }
   
   System.out.println();
   System.out.println();
   
   //Now let's get a subSet of tSet referenced by a NaviguableSet and print  
   NavigableSet <Integer> sub_tSet = tSet.subSet(3,true,5,true);// booleans are about inclusion of boundaries
   System.out.println("the subset stored in reference of a NaviguableSet: "+sub_tSet); 
   
 //We could get a subSet of tSet referenced by a SortedSet and print  
   SortedSet <Integer> sub_tSet2 = tSet.subSet(3, 10);
   System.out.println("the subset stored in reference of a SortedSet: "+sub_tSet2); //subSet(E start,E end+1)		
}
}

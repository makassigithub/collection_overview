package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;


//HashSet extends AbstractSet and implement Set interface
public class Case_HashSet_LinkedHashSet {

	public static void main(String...args){
		
		//Empty HashSet instance
		HashSet <String> hSet = new HashSet<String>();
		
		//Add elements to hs
		hSet.add("I");
		hSet.add("am");
		hSet.add("happy");
		hSet.add("today");
		
		//The HashSet does not not keep the order in which elements are added.
		System.out.println("hSet stored elements in the following order: "+hSet);	
		
		//When the order in which elements are stored matters, use the LinkedHashSet class
		LinkedHashSet <String> lhSet = new LinkedHashSet<String>(hSet);
		
		//The order will be inherited from hSet
		System.out.println("LinkedHashSet from the hasset: "+ lhSet); 
		
		//Now let's add new element and see the order in wish they are stored
		lhSet.add("because");
		lhSet.add("my");
		lhSet.add("family");
		lhSet.add("is");
		lhSet.add("around");
		
		//Print lhSet and see the order in which it stored the new added elements 
		System.out.println("lsSet now contains: "+lhSet);
		
		
		
	}
}

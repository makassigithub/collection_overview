package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestClass {

	
	public static void main(String...args){
		
		// declare an empty collection of type Class_A;		
		List <Class_A> cls;
		
		// In this case we will an ArrayList
		cls = new ArrayList<Class_A>();
		
		//Create instances of A and add them them to the collection;
		// The add object returns a boolean thats true if the object is added and false otherwise;
		Class_A A1 = new Class_A("A1_name");
		Class_A A2 = new Class_A("A2_name");					
		boolean a1 = cls.add(A1);
		boolean A1_added_again = cls.add(A1); // A1 will will be added again
		boolean a2 = cls.add(A2);
		System.out.println("A1 is added: "+ a1+"\nA2 is added: "+ a2+"\nA1 is added again: "+A1_added_again);
		
		// We could also add a collection of Class_A to cls
		Class_A A3 = new Class_A("A3_name");
		Class_A A4 = new Class_A("A4_name");
		ArrayList<Class_A> arL_A = new ArrayList<Class_A>();
		arL_A.add(A3);
		arL_A.add(A4);
		
		boolean result = cls.addAll(arL_A);
		System.out.println("List of Class_A added: "+result);
		
		// Now let's add A1 and A2 to arL_A: they are already inside cls
		arL_A.add(A1);
		arL_A.add(A2);
		System.out.println(arL_A);
		
		//because Class_B extends Class_A, we can also add Class_B objects
		Class_B B1 = new Class_B("B1_name");
		Class_B B2 = new Class_B("B2_name");
		ArrayList<Class_B> arL_B = new ArrayList<Class_B>();
		arL_B.add(B2);
		arL_B.add(B1);
		
		//Add an element using add(int index,E Object) that is availed by ArrayList
		//arL_B had 2 element, we now insert Bn in between add(int,E) returns void
		// a subCollection can also be added using add(int,Collection<E>)
		Class_B Bn = new Class_B("Bn_name");
		arL_B.add(1,Bn);
		
		// we can check the index of Bn to make sure it is inserted as planned
		int index_Bn = arL_B.indexOf(Bn);
		System.out.println("Index of Bn inside arL_B: "+index_Bn);
		
		// indexOf() vs lastIndexOf()		
		int index_A1 = arL_A.indexOf(A1);
		int last_index_A1 = arL_A.lastIndexOf(A1);	
		System.out.println("Index of A1: "+index_A1+"\nLast index of A1: "+last_index_A1);
		
		//We finally add arL_B to cls
		boolean B_list_Added =cls.addAll(arL_B);
		System.out.println("List of B added: "+B_list_Added);
		
		//Let's print cls and see what is inside
		System.out.println("\nStatus of cls with arL_A and arL_B");
		for(Class_A c :cls){
			System.out.print(c+"; ");
		}
		
		//because Class_C also extends Class_A, we can also add Class_B objects
				Class_C C1 = new Class_C("C1_name");
				Class_C C2 = new Class_C("C2_name");
				ArrayList<Class_C> arL_C = new ArrayList<Class_C>();
				arL_C.add(new Class_C("C3_name"));
				arL_C.add(new Class_C("C4_name"));
	   // add C3_name and C4_name to cls through arL_C
				cls.addAll(arL_C);
			boolean c1_added= cls.add(C1);
			boolean c2_added= cls.add(C2);
				
	    System.out.println("\nC1 added: "+c1_added+"\nC2 added: "+c2_added);
		
		//Check if the collection contains a particular element
		boolean contains_A1 = cls.contains(A1);
		System.out.println("\ncls contains A1: "+contains_A1);
		
		//Get the size of the collection
		System.out.println("Size of cls: "+cls.size()+" elements");
							
		//remove an element from the collection
		boolean A2_removed = cls.remove(A2);
		System.out.println("\nA2 is removed: "+A2_removed );
						
		//get the hashcode of cls		
		int cls_hashCode = cls.hashCode();
		System.out.println("\nhashcode of cls: "+ cls_hashCode);
		
		//Convert cls collection to array of object
		System.out.println("\nStatus of cls with arL_A ,arL_B and arL_C");
		Object [] obj_Arr = cls.toArray();
		for(Object o: obj_Arr){System.out.print(o +";");}
		System.out.println();
		System.out.println("\ncls converted to Array of Class_A");
		//Convert cls to a specific array of object
		Class_A [] A_arr = cls.toArray(new Class_A[cls.size()]);
		for(Object a: A_arr){System.out.print(a+"*");}
		
		System.out.println();
		
		System.out.println("\nprinting cls through the iterator interface");
		//Printing cls through the iterator interface
		
		 Iterator<Class_A> iter = cls.iterator();
		 Object ob;
		 while(iter.hasNext()){
			 ob = (Class_A) iter.next();
			 System.out.print(ob+"--");
		 }
		
		 
		 
		 //Using removeAll() to remove subClass B elements
		 boolean B_elmt_removed = cls.removeAll(arL_B);
		 System.out.println("\nB elements are removed: " +B_elmt_removed );
		 
		 // printing cls to see changes
		 System.out.println("\nPrinting cls after arL_B is removed");
		 Class_A [] new_A_arr = cls.toArray(new Class_A[cls.size()]);
		 for(Object a: new_A_arr){System.out.println(a);}
		 
		 //Let's remove all except Class_C elements	 
		 System.out.println("\nPrinting cls after only arL_C is kept");
		 boolean keepOnlyClass_C = cls.retainAll(arL_C);
		 				 
		 System.out.println("\ncls contains Class_C only: "+keepOnlyClass_C  );
		// printing cls to see changes
				 Class_C [] cls_with_Class_C_Only = cls.toArray(new Class_C[arL_C.size()]);
				 for(Object a: cls_with_Class_C_Only){System.out.println(" "+a);}
				 	   
				 
	   // Let's remove everything from cls;
		cls.clear();

	  //Check if cls is empty
		boolean cls_isEmpty = cls.isEmpty();
		System.out.println("\ncls is now empty: "+ cls_isEmpty);
		
	 //Let's change the first element of arL_C using the set method and print again
		System.out.println("\nPrint arL_C after setting Czero");
		arL_C.set(0, new Class_C("Czero_Name"));
		System.out.println(arL_C);
		
		// Get a subList of arL_C it returns a List and must be casted if we need a list
		// Add more element to arL_C
		
		arL_C.add(new Class_C("C5_name"));
		arL_C.add(new Class_C("C6_name"));
		arL_C.add(new Class_C("C7_name"));
				List<Class_C> subL = arL_C.subList(0,3);
				System.out.println("\nPrinting the subList");
				System.out.println(subL);
		
	}
}

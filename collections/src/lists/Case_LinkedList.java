package lists;


import java.util.LinkedList;

//LinkedList extends AbstractSequentialList, implements List,Queue,Dequeue interfaces
public class Case_LinkedList {
	
	public static void main(String...args){
	
		//Instantiate an empty LinkedList		
		LinkedList<Integer> lkd = new LinkedList<Integer>();
		
		//add elements to lkd: Autoboxing will set ints as Integers
		lkd.add(1);
		lkd.add(3);
		lkd.add(4);		
		//Print lkd
		System.out.println("lkd contanis: "+lkd);
		
		//insert one element and print lkd again
		lkd.add(1,2);
		System.out.println("lkd now after adding 2: "+lkd);
		
		//Because LinkedList implements DEQUEUE interface, elmts can be added both a the start and the end
		System.out.println("Adding element at the start of the List using addFirst() or offerFirst() and print");
		lkd.addFirst(0);   
		lkd.offerFirst(100);
		System.out.println("lkd after addFirst() and offerFirst(): "+lkd);
		
		System.out.println("Adding element at the end of the List using addLast() or offerLast()");
		lkd.offerLast(5);  
		lkd.addLast(200);
		System.out.println("lkd after addLast() and offerLast(): "+lkd);
		System.out.println();
		System.out.println("getting elements from the start using getFirst(),getLast(),peekFirst(),peekLast()");
		System.out.println("using getFirst(): "+lkd.getFirst());
		System.out.println("using peekFirst(): "+lkd.peekFirst());
		System.out.println("using getLast(): "+lkd.getLast());
		System.out.println("using peekLast(): "+lkd.peekLast());
		
		// the above methods return the elements without deleting them from the list
		System.out.println("lkd still contains: "+lkd);
		System.out.println();
		System.out.println("getting elements from the start using removeFirst(),removeLast(),pollFirst(),pollLast()");
		System.out.println("using removetFirst(): "+lkd.removeFirst());
		System.out.println("using pollFirst(): "+lkd.pollFirst());
		System.out.println("using removeLast(): "+lkd.removeLast());
		System.out.println("using pollLast(): "+lkd.pollLast());
		
		// those methods return and delete elements from the list
		System.out.println("lkd now contains: "+lkd);
		
		//because linkedList also implement List interface, use add() is similar to addFirst() and offerFirst();
		
		
	}

}

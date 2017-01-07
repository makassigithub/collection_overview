package queues;

import java.util.ArrayDeque;

//ArrrayDeque extends AbstractCollection and implements Queue
//It has an unlimited capacity although the default is 16
public class Case_ArrayDeque {

	public static void main(String...args){
		
		// instantiate a new collection 
		ArrayDeque <String> aDeq = new ArrayDeque <String>();
		
		// add elements to aDeq; the push() adds elements at the head of the queue
		aDeq.push("My");
		aDeq.push("son");
		aDeq.push("is");
		aDeq.push("a");
		aDeq.push("genius");
		
		
		//Print aDeq to see the order in wish elements are stored
		System.out.println("aDeq contains: "+ aDeq);
		System.out.println();
		System.out.println("Let's go through some methods availed by the inheritance chain");
		
		//getting elements from the queue
		//element() returns the element at the head without removal. throw NosuchElementException is aDeq is empty
		System.out.println("element at head of aDeq with element(): "+aDeq.element());
		
		try{
			System.out.println(new ArrayDeque<String>().element());
		}catch(Exception ex){System.out.println("Excpetion decrided as: "+ex.getMessage());}
		
		//peek() returns the element at the head without removal. returns null is aDeq is empty
		System.out.println("element at head of aDeq with peek(): "+aDeq.peek());
		System.out.println("The new collection is empty: "+new ArrayDeque<String>().peek());
		
		System.out.println("aDeq contains after element() and peek calls: "+aDeq);
		
		//remove() returns the element at the head with removal. throw NosuchElementException is aDeq is empty
		System.out.println("element at head of aDeq with remove(): "+aDeq.remove());
				
		try{
				System.out.println(new ArrayDeque<String>().remove());
		}catch(Exception ex){System.out.println(ex.getMessage());}
		
		//print and see aDeq status
				System.out.println("aDeq contains after remove() call: "+aDeq);
		
		
		//poll() returns the element at the head with removal. returns null is aDeq is empty
				System.out.println("element at head of aDeq with poll(): "+aDeq.poll());
				System.out.println("The new collection is empty: "+new ArrayDeque<String>().poll());
				
		//print and see aDeq status
		System.out.println("aDeq contains after poll() call: "+aDeq);
		
		//Let's restore the ArrayDeque 
		aDeq.addFirst("a");
		aDeq.addFirst("genuis");
		System.out.println("aDeq is restored to: "+aDeq);
		
		//the pop() operate like the remove().It's inherited from the Deque interface
		//Now let's remove all the elements from aDeq and print them
		System.out.println();
		System.out.println("Poping the stack");
		
		while(aDeq.peek() !=null){
			System.out.println(aDeq.pop()+" ");
		}
		
		
		// Check that aDeq is now empty
		System.out.println("aDeq is now empty: "+ aDeq.isEmpty());
				
	}
}

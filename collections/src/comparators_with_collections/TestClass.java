package comparators_with_collections;

import java.util.TreeSet;

public class TestClass {

	public static void main(String...args){
		
//NB: we cannot operate on our cars if  use standart treeSet constructor i.e. new TreeSet<Car>()
// Because Car is a Custom Class and does not implements Comparator interface

// get an instance of the Car_comparator to create the set
	Car_Comparator1 carComp = new Car_Comparator1();
	
 // we will use comparator on the collections first
  
		System.out.println("Instanciate a TreeSet of Cars");

	   TreeSet<Car> cars = new TreeSet<Car>(carComp);
	   cars.add(new Car("Toyota","Rav4",25000,true));
	   cars.add(new Car("Toyota","Highlander",123000,false));
	   cars.add(new Car("Nissan","PathFinder",3000,true));
	   cars.add(new Car("Honda","Civic",135000,true));
	   cars.add(new Car("Mazda","Tribute",46000,false));
	   
//Print and see how cars are stored in the set	
System.out.println("Cars will be compared using the 'series' property");
	   for(Car c:cars){
		   System.out.println(c);
	   }
	System.out.println();
	
//Let's use the second comparator i.e. Car_Comparator2
	   
	   Car_Comparator2 carComp2 = new Car_Comparator2();
	   
//	   override the instance of the TreeSet
	   TreeSet<Car> cars2 = new TreeSet<Car>(carComp2);
	   cars2.add(new Car("Toyota","Rav4",25000,true));
	   cars2.add(new Car("Toyota","Highlander",123000,false));
	   cars2.add(new Car("Nissan","PathFinder",3000,true));
	   cars2.add(new Car("Honda","Civic",135000,true));
	   cars2.add(new Car("Mazda","Tribute",46000,false));
	        
	   System.out.println("Cars will be compared using the 'millage' property in reverse order");
	   for(Car c:cars2){
		   System.out.println(c);
		 
	   }
	   
	   System.out.println();
//Let's use the second comparator i.e. Car_Comparator3
	   
	   Car_Comparator3 carComp3 = new Car_Comparator3();
	   
//	   override the instance of the TreeSet
	   TreeSet<Car> cars3 = new TreeSet<Car>(carComp3);
	   cars3.add(new Car("Toyota","Rav4",25000,true));
	   cars3.add(new Car("Toyota","Highlander",123000,false));
	   cars3.add(new Car("Nissan","PathFinder",3000,true));
	   cars3.add(new Car("Honda","Civic",135000,true));
	   cars3.add(new Car("Mazda","Tribute",46000,false));
	        
	   System.out.println("Cars will be compared using the 'millage' property in reverse order");
	   for(Car c:cars3){
		   System.out.println(c);
	   }
	   
	}
}

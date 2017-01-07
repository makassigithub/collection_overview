package comparator_with_maps;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

import comparators_with_collections.Car;

public class TestClass {

	
	public static void main(String...args){
		
	//instantiate a new TreepMap to store cars and owner as keys	
	
	TreeMap<String,Car> cars = new TreeMap<String,Car>();
	   cars.put("Brahima",new Car("Toyota","Rav4",25000,true));
	   cars.put("Doudou",new Car("Toyota","Highlander",123000,false));
	   cars.put("Dix",new Car("Nissan","PathFinder",3000,true));
	   cars.put("Tahirou",new Car("Honda","Civic",135000,true));
	   cars.put("Fanta",new Car("Mazda","Tribute",46000,false));

//Get the set of entries from the Map
Set<Map.Entry<String,Car>> carSet = cars.entrySet();

// The TreeMap is by deafult sorted using the natural sort
System.out.println("The Map contains:");
      for(Map.Entry<String, Car> car_entry: carSet){
    	  System.out.println(car_entry);
    	  
      }

//Ordering using a Comparator constructed TreeMap 
      
      System.out.println();
// get the entries in descending Owners' order

      TreeMap<String,Car> cars2 = new TreeMap<String,Car>(new Car_Comparator());
      cars2.put("Brahima",new Car("Toyota","Rav4",25000,true));
	   cars2.put("Doudou",new Car("Toyota","Highlander",123000,false));
	   cars2.put("Dix",new Car("Nissan","PathFinder",3000,true));
	   cars2.put("Tahirou",new Car("Honda","Civic",135000,true));
	   cars2.put("Fanta",new Car("Mazda","Tribute",46000,false));
	
	 //Get the set of entries from the Map
	   Set<Map.Entry<String,Car>> carSet2 = cars2.entrySet();
	
	System.out.println("The Map contains:");
    for(Map.Entry<String, Car> car_entry: carSet2){
  	  System.out.println(car_entry);
  	  
    }
	}
}

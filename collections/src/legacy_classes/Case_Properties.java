package legacy_classes;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

//A non-generic class that extends a genereic class (Hashtable), 
//then defines several generic methods
public class Case_Properties {

//Properties are a list of key/value pairs, all being String
//They define one important instance varibale: a list storing default Proprety object
//They deifne 2 constructors; new Properties()&new Properties(Properties default)

public static void main(String...args){

//Create a Property storing names age countries without defaul value
  
	//using put() from Hastable
	Properties origins = new Properties();
	origins.put("Alban", "Cote d'Ivoire");
	origins.put("Jake", "United State");
	origins.put("Brahima", "Burkina Faso");
	//using its own setProperty()
	origins.setProperty("Patrick","Canada");
	origins.setProperty("Teeya","Vietnam");
	origins.setProperty("Basha","Israel");
	origins.setProperty("Miya","Korea");
	
System.out.println("getting particular value with or without default value");
	System.out.println("The country of Jake is: "+origins.getProperty("Jake"));
	System.out.println("The country of Toufik is: "+origins.getProperty("Toufik","Not Found"));
	System.out.println("The country of Basha is: "+origins.get("Basha"));//inherited
	
	System.out.println("\nGetting  keys and values through enumeration");
	Enumeration<?> keys = origins.propertyNames();
	System.out.println("Peoples and their countries");
	while(keys.hasMoreElements()){
		String name = (String)keys.nextElement(); //Casting keys is a raw enum. type
		System.out.println(name+":"+origins.getProperty(name));}
	
	System.out.println();
	
	System.out.println("\ngetting values trough a keyset");
	Set<?> names = origins.keySet();//returns raw Object
	System.out.println("People and countries");
	for(Object name:names){
	System.out.println("Name:"+name+" : "+"Country: "+origins.getProperty((String)name));}
	
	// Create a Default property obj for use with the second constructor

	Properties default_prop = new Properties();
	default_prop.setProperty("Oumar","Bengladesh");
	default_prop.setProperty("Haytem","Tunisia");
	
	//Create a new Property with default values
	Properties origins2 = new Properties(default_prop);
	origins.setProperty("Patrick","Canada");
	origins.setProperty("Teeya","Vietnam");
	origins.setProperty("Basha","Israel");
	origins.setProperty("Miya","Korea");
	
// get value associated to "Oumar" that is retuned from the default Property object
	System.out.println("\nOumar is from :"+origins2.getProperty("Oumar"));

	
	}
	
}



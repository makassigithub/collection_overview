package legacy_classes;

import java.util.Enumeration;
import java.util.Hashtable;

//It extends the Dictionay Abstract Class and implements the Map interface
//It stores entires based on hey/value pairs, then keys are hashed to index values
//But it does not allow null value for keys or values.
public class Case_HashTable {

public static void main(String...args){
Hashtable<String,Double> balances  = new Hashtable<String,Double>(10,0.8F);//eventually set initial size an filling ratio

//add data to balances
balances.put("John Cena",234000.6);
balances.put("Eddy Da Costa",12873.85);
balances.put("Sonia Careda",65772.67);
balances.put("Remy Tontepambo",65772.67);

//the key() and elements() return an enumeration of keys and the value form the table
//hatable does not implement Iterable interface, we will use built-in enumeration methods
Enumeration<String> bal_keys = balances.keys();
System.out.println("keys and vaules in table: ");
while(bal_keys.hasMoreElements()){
	String key = bal_keys.nextElement();
	System.out.println(key+" : "+balances.get(key)+"USD");
}

System.out.println();
//Assuming we want to calculate the sum of values in the table
Enumeration bal_vals = balances.elements();
Double sum = 0.0;
while(bal_vals.hasMoreElements()){
Double val = (Double) bal_vals.nextElement();
sum +=val;
}
System.out.println("balances amounts to: " +sum);
System.out.println();
//Get the hashcode that indexes every value in the table

Enumeration<String> bal_keys2 = balances.keys();
System.out.println("KEYS\t\tVALUES\t\tHASHCODES");
System.out.println();
while(bal_keys2.hasMoreElements()){
	String key = bal_keys2.nextElement();	
	System.out.println(key+"\t"+balances.get(key)+"\t"+balances.get(key).hashCode());
}
System.out.println();

//Check if table contains some specific data using containsKey(),
//containsValue or contains() similar
System.out.println("balances contains the key 'John Cena': "+balances.containsKey("John Cena"));
System.out.println("balances contains the value '65772.67': "+balances.containsValue(65772.67));
System.out.println("balances contains the value '65772.67': "+balances.contains(65772.67));
System.out.println("balances contains the value 'Sonia Careda': "+balances.contains("Sonia Careda"));

System.out.println();

//The remove() return the values and returns it if found, return false otherwise
System.out.println("remove 'Brahima Traore' if found: "+balances.remove("Brahima Traore"));

}
}

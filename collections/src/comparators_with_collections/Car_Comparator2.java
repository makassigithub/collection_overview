package comparators_with_collections;

import java.util.Comparator;

public class Car_Comparator2 implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
    
	//compare millages and order in reverse order
	return  new Long(c2.getMillage()).toString().compareTo(new Long(c1.getMillage()).toString());
	
	//This comparator compares the String obeject of millage after wrapping using toString(). It's then 
	//tricky cause 'new Long(3).toString()' is greater than 'new Long(20).to string()' for 3>2.
	// This could result in unexpected result (see the output of cars2 printed in TestClass.java)
	
    // Car_Comparator3 is an alternative to this situation
	}

	
}

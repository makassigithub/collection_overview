package arrays;

import java.util.Comparator;

public class Car_Comparator implements Comparator<Car>{

	
	@Override
	public int compare(Car c1, Car c2) {
		int comparator = 0;

      if (c2.getMillage()>c1.getMillage()) {comparator=1;
      
      }else comparator = -1;
		return comparator;
	}
	

}

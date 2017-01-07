package comparators_with_collections;

import java.util.Comparator;

public class Car_Comparator1 implements Comparator <Car>{

	@Override
	public int compare(Car c1, Car c2) {
		// This comparison will be based on the series
		String c1_series = c1.getSeries();
		String c2_series = c2.getSeries();	

        //compare based on natural ordering
		return c1_series.compareTo(c2_series);
	}

}

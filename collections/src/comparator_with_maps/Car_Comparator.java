package comparator_with_maps;

import java.util.Comparator;

public class Car_Comparator implements Comparator<String>{

	// with want our comparator to order based on the series property
	@Override
	public int compare(String key1, String key2) {
		
		// get Natural ordering based on the series property
		 
		return key2.compareTo(key1);
	}

}

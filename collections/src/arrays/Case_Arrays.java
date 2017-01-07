package arrays;

// Let's create a simple method to dispya arrays

import java.util.Arrays;
import java.util.Spliterator;

// The Arrays class is part of collections and defines several useful method to manipulate arrays
public class Case_Arrays {
	
	public static void main(String...args){
		
//Instanciate different type of Arrays to work with	
byte[] byte_arr = new byte[]{69,66,65,68,67,70};
char[] char_arr = new char[]{'D','F','C','A','E','B'};
double[] double_arr = new double[6];
float [] float_arr = new float[]{25F,21F,27F,19F,59F,3F};
int[] int_arr = new int[]{16,7,28,9,13,10};
long [] long_arr = new long[]{25L,16L,37L,8L,9L,20L};
short[] short_arr = new short[]{15,66,37,68,69,70};
String[] str_arr = new String[]{"One","Two","Three","Four","Five"};//will be used for Objects
//Will use the the car array to work with comaparotr
Car[] car_arr = new Car[]{new Car("Toyota Rav4",12300),new Car("Nissan Almera",65000),new Car("Honda Civic",132000)};


// use of the static sort() method// it returns void
System.out.println("SORTING AN ARRAY");
Arrays.sort(byte_arr);
System.out.print("byte_arr sorted: ");
for(byte b:byte_arr){ System.out.print(b+" ");}

System.out.println();

Arrays.sort(float_arr);
System.out.print("float_arr sorted: ");
for(float f:float_arr){ System.out.print(f+" ");}

System.out.println();

Arrays.sort(str_arr);
System.out.print("str_arr sorted: ");
for(String s:str_arr){ System.out.print(s+" ");}

System.out.println();

//Because Car is an Object and does not implement Comparable interface, it's sorted using a comparator
//Our comparator compares based on the millage in descending order
Arrays.sort(car_arr,new Car_Comparator());
System.out.print("car_arr sorted: ");
for(Car c:car_arr){ System.out.print(c+" ");}

System.out.println();
System.out.println("\nSEARCHING FOR AN ELEMENT IN AN ARRAY WITH binarySearch()");

//The binarySearch() search for an element and returns the index
//It is useful when when the array is sorted
System.out.println("Index of 'One' for long_arr unsorted: "+Arrays.binarySearch(long_arr,37L));
Arrays.sort(long_arr);
System.out.println("Index of 'One' for long_arr sorted: "+Arrays.binarySearch(long_arr,37L));

System.out.println("\nCOPYING AN ARRAY TO ANOTHER");
short[] short_arr_copy1 = Arrays.copyOf(short_arr, 6);
System.out.print("copy of short_arr for length=6: ");
for(short sh:short_arr_copy1){
	System.out.print(sh+" ");
}
System.out.println("\nIf lenght<short_arr, short_arr is partially copied from the beginning: ");
short[] short_arr_copy2 = Arrays.copyOf(short_arr, 3);
System.out.print("copy of short_arr for length=3: ");
for(short sh:short_arr_copy2){
	System.out.print(sh+" ");
}

System.out.println();
System.out.println("\nIf lenght>short_arr, the copy is populated with zeros: ");
short[] short_arr_copy3 = Arrays.copyOf(short_arr, 8);
System.out.print("copy of short_arr for length=8: ");
for(short sh:short_arr_copy3){
	System.out.print(sh+" ");
}
 
System.out.println();
System.out.println("\nCOPYING A RANGE OF AN ARRAY TO ANOTHER");
int[] int_arr_range_copy = Arrays.copyOfRange(int_arr,2,4);
System.out.print("initial int_arr: ");
for(int i:int_arr)System.out.print(i+" ");
System.out.print("\ncopy of int_arr from index 2 to 4: ");
for(int sh:int_arr_range_copy){
	System.out.print(sh+" ");
}

System.out.println();
System.out.println("\nCOMPARE AN ARRAYS USING equals()");
//retruns true if both arrays have the same content, otherwise, fasle
System.out.println("Compare int_arr to its duplicate: "+Arrays.equals(int_arr, new int[]{16,7,28,9,13,10}));
System.out.println("Compare int_arr to a different one: "+Arrays.equals(int_arr, new int[6]));

System.out.println();
System.out.println("\nFILL AN ARRAY OR PORTION OF ARRAY USING fill(): ");
System.out.print("char_arr contains: ");
for(char c : char_arr)System.out.print(c+" ");
//fill char_arr with a special value
Arrays.fill(char_arr,'T');
System.out.print("\nchar_arr now contains: ");
for(char c : char_arr)System.out.print(c+" ");
//Fill a portion of char_arr
Arrays.fill(char_arr,2, 5, 'E');
System.out.print("\nchar_arr now contains: ");
for(char c : char_arr)System.out.print(c+" ");
	
	System.out.println();
	System.out.println("\nUSE OF SPLITERATOR WITH ARRAYS: ");
	//Populate the double_arr
	for(int i=0;i<double_arr.length;i++){
		double_arr[i] = i*(-1*2.17)+1;}
	
	
	//print double_arr
	System.out.print("\ndouble_arr now contains: ");
	for(double d : double_arr)System.out.print(d+" ");
		
}
}

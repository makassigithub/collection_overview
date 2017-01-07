package arrays;

public class Car {

	private String series;
	private int millage;
	
	public Car(String ser,int mil){
		
		series = ser;
		millage=mil;
		
	}
	
	
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public long getMillage() {
		return millage;
	}
	public void setMillage(int millage) {
		this.millage = millage;
	}
	

	@Override
	public String toString() {
		return "["+ series + "-"+ millage + "]";
	}
	
	
}

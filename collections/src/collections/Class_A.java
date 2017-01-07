package collections;

public class Class_A {
   String name;
	int a,b;
	
	Class_A(String nm){
		this.name = nm;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return name ;
	}
	
	
}

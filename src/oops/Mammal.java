package oops;

public class Mammal extends Animal {
	private String name;

//	public void abc() {
//		System.out.println("1");
//	}
//	public void abc() {
//		System.out.println("2");
//	}
	public void abc(String a,String b ) {
		System.out.println("3");
	}
	public static void main(String[] args) {
		Mammal m=new Mammal();
		m.abc("1","1");
	}
	
}

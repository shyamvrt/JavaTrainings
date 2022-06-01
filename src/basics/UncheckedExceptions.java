package basics;

public class UncheckedExceptions {
  public static void main(String args[]) {
	  try {
		  int a=5/0;
		  System.out.println(a);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  System.out.println("completed");
  }
}

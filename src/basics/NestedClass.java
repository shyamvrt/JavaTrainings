package basics;

//public class NestedClass {
//	private class Class1{
//		
//	}
//	private class Class2{
//		
//	}
//	
	abstract class AnonymousInner {
		   public abstract void mymethod();
		}

		public class NestedClass {

		   public static void main(String args[]) {
		      AnonymousInner inner = new AnonymousInner() {
		         public void mymethod() {
		            System.out.println("This is an example of anonymous inner class");
		         }
		      };
		      inner.mymethod();	
		   }
		}
	
//}

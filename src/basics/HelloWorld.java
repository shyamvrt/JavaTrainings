package basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import exam.ExamBlueprint;

public class HelloWorld {
	
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
//		ExamBlueprint exam=new ExamBlueprint(1,2,3);
//		
//		exam.setOneMark(15);
//		System.out.println(exam.getOneMark());
//		for(int i=0;i<100;i=i+3) { //entry check loop
//		
//		String result = i>50 ? "alex" : "shyam";
//		System.out.println(result + " " + i);
//		}
		String stringArray2[]=new String[10];
		
		String[] stringArray={"alex","ab","musical","thiruvotriyuur","chennai","600049"};
	//	System.out.println(stringArray[0] + stringArray[1]);
//		for(int i=stringArray.length-1;i>=0;i--) {
//			System.out.println(stringArray[i]);
//		}
//		for(String i :stringArray) {
//			System.out.println(i);
//		}
//		
		String cloneArray[]=stringArray.clone();
		for(String i :cloneArray) {
			System.out.println(i);
		}
		
		String a = "Alex";
		String b = " MBA";
		String c = a.concat(b);
	//	System.out.println(c);
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder(); 
	//	System.out.println(a.length());
		int i=5;
		String n="5";
//		if(i == Integer.valueOf(n)) {
//			System.out.println("yes "+"\r"+"\"alex\"");
//		}
//		
//		int i=null;
//		Integer ii=null;
		
		double d=0;
		Double asjdfhb=0.0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
//		
//		
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<10);
		Date date=new Date();
		System.out.println(date);
		Date customDate=new SimpleDateFormat( "MM/dd/yyyy" ).parse( "05/01/2022" );
		System.out.println(customDate);
		System.out.println(date.after(customDate));

	}

}

package basics;

import exam.ExamBlueprint;

public class HelloWorld {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ExamBlueprint exam=new ExamBlueprint(1,2,3);
//		
//		exam.setOneMark(15);
//		System.out.println(exam.getOneMark());
		for(int i=0;i<100;i=i+3) { //entry check loop
		
		String result = i>50 ? "alex" : "shyam";
		System.out.println(result + " " + i);
		}
		
//		int i=0;
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
		
	}

}

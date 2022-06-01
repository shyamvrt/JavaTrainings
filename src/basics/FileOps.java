package basics;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOps {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream in = null;
	     FileOutputStream out = null;

	      try {
	         in = new FileInputStream("src/basics/shyam.txt");
	         out = new FileOutputStream("src/basics/alex.txt");
	         
	         int c;
//	         BufferedReader br =new BufferedReader(new InputStreamReader(in));
//	         StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
//	         String line;  
//	         while((line=br.readLine())!=null)  
//	         {  
//	         sb.append(line);      //appends line to string buffer  
//	         sb.append("\n");     //line feed   
//	         }  
//	         System.out.println(sb);
	         while ((c = in.read()) != -1) {
	             out.write(c);
	          }
	      }finally {
	         if (in != null) {	
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }

	}

}

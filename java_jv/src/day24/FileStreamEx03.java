package day24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamEx03 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			
			  fw = new FileWriter("test.txt"); 
			  char ch = '\u0000';
			  for(int i =0; i<200;i++)
				  fw.write(ch++);
			  fw.close();
			 

			fr = new FileReader("test.txt");
			int num;
			for (int i = 0; i < 200; i++) {
				num = fr.read();
				System.out.print((char) num);
			}
			fr.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}

	}

}

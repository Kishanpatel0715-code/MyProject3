package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_write_textFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\testing2\\temp.txt");
		f.createNewFile();
		
		//write data into text file
		FileWriter w = new FileWriter("C:\\testing2\\temp.txt");
		BufferedWriter rd = new BufferedWriter(w);
		rd.write("This is line 1");
		rd.newLine();
		rd.write("This is line 2");
		rd.newLine();
		rd.write("This is line 3");
		rd.newLine();
		rd.write("This is line 4");
		rd.newLine();
		rd.write("This is line 5");
		rd.newLine();
		rd.write("This is line 6");
		rd.flush();
		
		
		//read data from the text file
		FileReader r = new FileReader("C:\\testing2\\temp.txt");
		BufferedReader br = new BufferedReader(r);
		/*
		 * System.out.println(br.readLine()); System.out.println(br.readLine());
		 * System.out.println(br.readLine()); System.out.println(br.readLine());
		 * System.out.println(br.readLine()); System.out.println(br.readLine());
		 * System.out.println(br.readLine())
		 */;
		 
		 String x;
		 int i = 0;
		 while((x=br.readLine())!=null) {
			 System.out.println(x);
			 i++;
		 }
		 System.out.println("Number of rows: "+ i);
	}

}

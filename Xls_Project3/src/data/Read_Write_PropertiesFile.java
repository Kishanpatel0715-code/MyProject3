package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Write_PropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream ip = new FileInputStream("C:\\testing2\\prop.properties");
		Properties prop = new Properties();
		prop.load(ip);
		
		//read data from properties file
		String b = prop.getProperty("browser");
		System.out.println(b);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("surname"));
		
		//write data into properties file
		prop.setProperty("hema", "malini");
		prop.setProperty("virat", "kohli");
		System.out.println(prop.getProperty("hema"));
		FileOutputStream o = new FileOutputStream("C:\\testing2\\prop.properties");
		prop.store(o, "adding to the properties file");
	}

}

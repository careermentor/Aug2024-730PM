package firstPkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandling 
{
	
	public static void readProp() 
	{
		FileReader fr = null;
		try {
			fr = new FileReader("./Data/test.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		try {
			prop.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.get("browser"));
		
		
		
		System.out.println(prop.get("url"));
		System.out.println(prop.get("username"));
		
	}

	public static void writedata() throws Exception
	{
		File f = new File("./Data/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nthis is fifth line");
		fw.flush();
		fw.close();
		
	}
	
	public static void readdata() throws Exception
	{
		File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int a = fr.read(); //t
		
		while(a!=-1)
		{
			System.out.print((char)a);  //t
			a = fr.read();  //h
		}
		
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		//FileHandling.readdata();
		writedata();
		readProp();
		
	}
	
}

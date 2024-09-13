package org.wipro.automation.amazon.utilitiesPkg;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropFile 
{

	public static String readconfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./Data/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr = new FileReader("./Data/element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
}

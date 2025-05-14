package com.qspiders.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtils 
{
	static Properties prop;
	
	public static String getproperties(String propKey)
	{
		try
		{
			prop=new Properties();
			FileInputStream file=new FileInputStream(System.getProperty("user.dir") +"\\Resources\\Properties\\TestData.properties");
			prop.load(file);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return prop.getProperty(propKey);
	}
}

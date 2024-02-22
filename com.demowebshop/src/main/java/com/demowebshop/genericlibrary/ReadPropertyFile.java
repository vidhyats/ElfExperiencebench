package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile 
{
public static void main(String[] args) throws IOException
{
	File file=new File("./src/test/resources/propertyFile/config.properties");
	FileInputStream fis=new FileInputStream(file);
	Properties prop=new Properties();
	prop.load(fis);
	System.out.println(prop.getProperty("browser"));
}
}

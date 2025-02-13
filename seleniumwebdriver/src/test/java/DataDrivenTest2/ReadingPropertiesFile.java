package DataDrivenTest2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Create object of properties file
		Properties propertyobj = new Properties();
		
		//location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\config.properties");
		
		//Loading properties file
		propertyobj.load(file);
		
		//Reading data from properties file
		
		
	}
}

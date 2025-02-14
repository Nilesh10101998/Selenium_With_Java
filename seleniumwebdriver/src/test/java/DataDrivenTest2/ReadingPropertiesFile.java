package DataDrivenTest2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Create object of properties file
		Properties propertyobj = new Properties();
		
		//location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\config.properties");
		
		//Loading properties file
		propertyobj.load(file);
		
		//Reading data from properties file
		String url = propertyobj.getProperty("appurl");
		String email = propertyobj.getProperty("email");
		String pwd = propertyobj.getProperty("password");	
		String orid = propertyobj.getProperty("orderid");	
		String custid = propertyobj.getProperty("customerid");	
		
		System.out.println(url + " " + email + " " + pwd + " " + orid + " " + custid + " ");
		
		//Reading all the keys from the properties file
		Set<String> keys = propertyobj.stringPropertyNames(); //capturing all keys from the properties file
		System.out.println(keys);
		
		//Reading all the values from the properties file
		Collection<Object> values = propertyobj.values();
		System.out.println(values);
		
		file.close();
		
	}
}

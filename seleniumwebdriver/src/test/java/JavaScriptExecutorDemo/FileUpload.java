package JavaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
//		//Single file upload => API-1.png
//		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Nitin sir API notes\\API-1.png");
//		
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("API-1.png")) 
//		{
//			System.out.println("File is successfully uploaded");
//		}
//		else
//		{
//			System.out.println("Upload is failed..!!");
//		}
		
		//Upload multiple files
		String file1 = "C:\\Nitin sir API notes\\API-1.png"; //stored file in the variable
		String file2 = "C:\\Nitin sir API notes\\API-2.png";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int filesuploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//Validation of uploaded file numbers
		if(filesuploaded == 2) 
		{
			System.out.println("All files are uplaoded..!!");
		}
		else 
		{
			System.out.println("Files are not uploaded");
		}
		
		//Validation of file names
		if(driver.findElement(By.xpath("(//ul[@id='fileList']//li)[1]")).getText().equals("API-1.png")
				&&
		driver.findElement(By.xpath("(//ul[@id='fileList']//li)[2]")).getText().equals("API-2.png"))	
		{
			System.out.println("File names correct..!!");
		}
		else 
		{
			System.out.println("File names are not matching..");
		}
			
	}

}

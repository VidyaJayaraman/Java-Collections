package Week3.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioShoppingOnline {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Chrome Setup and Disable Browser Notifications
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		// Launch URL
		
		        ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.ajio.com");
			    driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	  // Click on Search Button and search for bags
				
				driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags");
				driver.findElement(By.xpath("//span[@class='ic-search']")).click();
				
      //Click on Men
				
				driver.findElement(By.xpath("//label[@for='Men']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				Thread.sleep(3000);
				
	  //To print the no of items found under Men-Fashion Bag
				
		        String text1 = driver.findElement(By.xpath("//div[@class='length']")).getText();
		        System.out.println(text1);
		        
	  // Add all the webelements in the list and check the size which is the count of brandnames
		        
		        List<WebElement> bagBrandName = driver.findElements(By.xpath("//div[@class='brand']"));
		 
		        System.out.println("No of Brands under Men's Fashion Category is "+bagBrandName.size()); 
		       
	 // To print the Brand Names from the Webelements list under "Class = brand"
		       
		        System.out.println("******************************************");
		        System.out.println("Men Bag Brand names under Fashion Category");
		        System.out.println("******************************************");
		        
    // Iterate through webelement list and get the text which is brand name
		        
		        for (WebElement webElement1 : bagBrandName) {
		        	
		        	String text2 = webElement1.getText();
					System.out.println(text2);
	
		        }
		        
	// To print the bag names under brands in Men's fashon bag category which is under class="nameCls"	        
		        
		        System.out.println("******************************************");
		        System.out.println("Men Bag names under Brands found in Men's Fashion Bag Category");
		        System.out.println("******************************************");
	           
   // Add all the webelements in the list

		List<WebElement> bagNamesUnderBrands = driver.findElements(By.xpath("//div[@class='nameCls']"));        
        
   // Iterate through webelement list and get the text which is bag name
		
		  for (WebElement webElement2 : bagNamesUnderBrands) {
			
			  String text3 = webElement2.getText();
			  System.out.println(text3);
		}      
		  System.out.println("count"+bagNamesUnderBrands.size());        
	}

}

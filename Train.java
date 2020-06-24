package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
        driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("Chennai",Keys.ENTER);
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();

		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("Nagercoil",Keys.ENTER);
		driver.findElementByXPath("//input[@id='buttonFromTo']").click();
		 Thread.sleep(3000);
         List<WebElement> elements = driver.findElementsByXPath("//td[@style=';']//a");
   		List<String> list  = new ArrayList<String>();
        
         for(int i =0; i<elements.size(); i++)

         {
       	  WebElement element = elements.get(i);
       	  list.add(element.getText());
       	  System.out.println( i +")"+ list.get(i)+"\t");
       	  System.out.println("*****************************************************************");
         }
         System.out.println( "Size of the list  "+elements.size());
 		Set<String> set = new LinkedHashSet<String>();
 		set.addAll(list);
 		System.out.println(set);
 		System.out.println(set.size());
 		if (list.size()==set.size()) {
 			System.out.println("Train names are unique");
 		}
 		else 
 		{
 			System.out.println("Train names or not unique");
 		}

		//a[@title='Click on train number to View fare and schedule']

		
		

		
	}

}

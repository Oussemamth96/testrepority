//
//
////import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
////import org.junit.Assert;
//
//public class ElectronicSystem {
//   
//	
//	WebDriver driver;
//
//	@Before
//	public void initData() {
//
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
//
//		String url = "https://szimek.github.io/signature_pad//";
//
//		driver = new ChromeDriver();
//
//		driver.get(url);
//
//	}
//	
//	@Test 
//public void drawSignatureAndSavePNG() {
//
//		
//		//WebElement target = driver.findElement(By.xpath("// body/div[@id='signature-pad']/div[1]/canvas[1]"));
//		WebElement target = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/canvas[1]" ));
//		WebElement clear = driver.findElement(By.xpath( "//button[normalize-space()='Clear']"));
//		
//		Actions draw = new Actions(driver); 
//				
//		Action act = draw.moveToElement(target, 1, 1)  
//				.clickAndHold(target)   
//				.moveByOffset(100, 60)
//				.moveByOffset(0, 0)
//				.moveByOffset(90, 50)
//				.moveByOffset(100, 0)
//				.moveByOffset(-300, 0)
//				.moveByOffset(-50, -200)
//				.release(target)
//				.build()
//				;
//		
//		
//		act.perform();
//		clear.click();
//
//	
//	}
//
//	}

package autoFramework;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExSixScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Downloads\\Desktop\\e2\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "http://toolsqa.com/automation-practice-form/";
        driver.get(url);
        List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
         boolean bvalue = false;
         bvalue = rdBtn_Sex.get(0).isSelected();
         if(bvalue == true)
         {
        	 rdBtn_Sex .get(1).click();
         }else {
        	 rdBtn_Sex .get(0).click();
         }
         WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
         rdBtn_Exp.click();
         List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
         int iSize = chkBx_Profession.size();
         for(int i=0; i < iSize; i++) {
        	 String sValue = chkBx_Profession.get(i).getAttribute("value");
        	 if(sValue.equalsIgnoreCase("Automation Tester")) {
        		 chkBx_Profession.get(i).click();
        		 break;
        		
        	 }
         }
         
        WebElement oCheck_Box = driver.findElement(By.cssSelector("input[value = 'Selenium IDE']"));
          oCheck_Box.click();
         
        	
	}

}

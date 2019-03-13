package autoFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExEightScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\Desktop\\e2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://toolsqa.com/Automation-practice-form/";
		driver.get(url);
          driver.findElement(By.partialLinkText("Partial Link Test")).click();
        System.out.println("partialLinkText is pass");
        String sClass = driver.findElements(By.tagName("button")).toString();
        System.out.println(sClass);
        driver.findElement(By.linkText("Link Test")).click();
        System.out.println("link test is pass");
        
        
        
	}

}

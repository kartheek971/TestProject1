package autoFramework;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ExFourScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HOME\\Downloads\\Desktop\\e2\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.toolsqa.com/selenium-webdriver/findelement-and-findelements-command/");
        driver.findElement(By.id("primary-menu"));
        List<WebElement> objlink = driver.findElements(By.tagName("a"));
        for(WebElement objCurrentLink : objlink) {
        	String strlText = objCurrentLink.getText();
        	System.out.println(  strlText);
        }

        		driver.close();
        
	}

}

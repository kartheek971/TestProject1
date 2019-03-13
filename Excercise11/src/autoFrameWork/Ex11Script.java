package autoFrameWork;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ex11Script {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\Desktop\\e2\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      String url = "http://toolsqa.com/automation-practice-form/";
      driver.get(url);
      Select oSelection = new Select(driver.findElement(By.id("continents")));
      oSelection.selectByVisibleText("Europe");
      Thread.sleep(2000);
      oSelection.selectByIndex(2);
      Thread.sleep(2000);
      List<WebElement> oSize = oSelection.getOptions();
      int iListSize = oSize.size();
        for(int i =0; i<iListSize; i++) {
        	String sValue = oSelection.getOptions().get(i).getText();
        	System.out.println(sValue);
        	if(sValue.equals("Africa")) {
        		oSelection.selectByIndex(i);
        		break;
        	}
        }
      
      
      
      
	}

}

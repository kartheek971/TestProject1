package autoFrameWork;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExenScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Downloads\\Desktop\\e2\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://toolsqa.com/automation-practice-form/";
		driver.get(url);
		List<WebElement> rdb_Sex = driver.findElements(By.name("sex"));
		boolean bValue = false;
		bValue = rdb_Sex.get(0).isSelected();
		if(bValue == true) {
			rdb_Sex.get(1).isSelected();
		}else {
			rdb_Sex.get(0).isSelected();
		}
	  WebElement rdb_Exp = driver.findElement(By.id("exp-2"));
	  rdb_Exp.click();
	  List<WebElement> chk_bkP = driver.findElements(By.name("profession"));
	  int iSize = chk_bkP.size();
	  for(int i=0;i<iSize;i++) {
		  String sValue = chk_bkP.get(i).getAttribute("value");
		  if(sValue.equalsIgnoreCase("Automation Tester")) {
			  chk_bkP.get(1).click();
			  break;
			  
		  }
	  }
	  WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
	  
	  oCheckBox.click();
	}

}

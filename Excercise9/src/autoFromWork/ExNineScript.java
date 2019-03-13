package autoFromWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExNineScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\Desktop\\e2\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.justrechargeit.com/";
        driver.get(url);
        driver.findElement(By.id("jriTop_signin9")).click();
        driver.findElement(By.name("txtUserName")).sendKeys("sivakartheek4@gmail.com");
        driver.findElement(By.name("txtPasswd")).sendKeys("123456");
        driver.findElement(By.id("imgbtnSignin")).click();
        driver.findElement(By.id("jriTop_signOut")).click();
        
	}

}

package autoFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ExSevenScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HOME\\Downloads\\Desktop\\e2\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String url = "https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession";
        driver.get(url);
        driver.findElement(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Create account']/self::SPAN")).click();
        driver.findElement(By.id("firstName")).sendKeys("kartheek");
        driver.findElement(By.id("lastName")).sendKeys("jalluri");
        driver.findElement(By.name("Username")).sendKeys("sri.kartheek");
        driver.findElement(By.name("Passwd")).sendKeys("Jsvsk@971");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Jsvsk@971");
        driver.findElement(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Next']/..")).click();

     	}

}

package test1;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	private WebDriver driver;
	String baseUrl;
	
	@Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.Chrome.Driver","/Users/1003750/ChromeDriver");

        driver = new ChromeDriver();
  
    }
    @Test
    public void browser_open() throws Exception {
        driver.get("http://www.11st.co.kr/html/main.html");
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.manage().window().maximize();

			
		assertEquals("Upgrade Your Life - 11번가", driver.getTitle());
  		
        WebElement search = driver.findElement(By.name("kwd"));
        search.sendKeys("nike");
        
        WebElement click = driver.findElement(By.id("gnbTxtAd"));
        click.click();
    }
    @After
    public void quit() throws Exception {
       driver.quit();
    }
}
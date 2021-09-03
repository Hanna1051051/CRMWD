import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Settings {
    public WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.name("_username")).sendKeys("Applanatest1");
        driver.findElement(By.name("_password")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();

    }


    @After
    public void tearDown() {
        driver.quit();
    }

}

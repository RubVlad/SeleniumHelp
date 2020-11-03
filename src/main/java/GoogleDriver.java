import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

public class GoogleDriver {
    public static WebDriver driver;

    @BeforeClass
    public static void setupwebdriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://drugwars.io/login");
    }

    @AfterClass
    public static void tearDown() {
        if(driver != null)
        {
            driver.quit();
            driver.close();
        }
    }
}

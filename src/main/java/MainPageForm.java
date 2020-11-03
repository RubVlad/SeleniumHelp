import org.openqa.selenium.By;

public class MainPageForm extends GoogleDriver {

    public static String ChooseServerButton= ".btn-orange";
    public static String ServerButton = ".btn-yellow";
    public static String LoginByKey = ".button-blue";
    public static String HeaderButton = ".header";

    public static void ChooseServer()
    {
        driver.findElement(By.cssSelector(ChooseServerButton)).click();
        driver.findElement(By.cssSelector(ServerButton)).click();
        driver.findElement(By.cssSelector(LoginByKey)).click();
    }

    public String GetHeaderText(){
        return driver.findElement(By.cssSelector(HeaderButton)).getText();
    }
}

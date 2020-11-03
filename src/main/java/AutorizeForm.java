import org.openqa.selenium.By;

public class AutorizeForm extends GoogleDriver {

    public static String ContinueStartButton = ".btn-large";
    public static String LoginText = ".m-0";
    public static String UsernameField = "#username";
    public static String PassWordField = "#password";

    public void Autorize(String login, String key)
    {
        driver.findElement(By.cssSelector(ContinueStartButton)).click();
        driver.findElement(By.cssSelector(UsernameField)).sendKeys(login);
        driver.findElement(By.cssSelector(PassWordField)).sendKeys(key);
        driver.findElement(By.cssSelector(ContinueStartButton)).click();
    }

    public String GetLoginText()
    {
        return driver.findElement(By.cssSelector(LoginText)).getText();
    }


}

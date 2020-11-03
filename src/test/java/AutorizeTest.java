import org.junit.Assert;
import org.junit.Test;

public class AutorizeTest extends AutorizeForm {

    @Test
    public void CheckHeaderText()
    {
        MainPageTest.ChooseServer();
        Autorize("login", "key");
        Assert.assertEquals(GetLoginText(),"Steem Login");
    }


}

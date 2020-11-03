import org.junit.Assert;
import org.junit.Test;

public class MainPageTest extends MainPageForm{

    @Test
    public void CheckHeaderText()
    {
        ChooseServer();
        Assert.assertEquals(GetHeaderText(),"Log in request (posting)");
    }
}

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
    PHPTravelsLoginPage loginPage;

    @Test
    public void verify_login_page_with_valid_credentials(){
        loginPage = new PHPTravelsLoginPage(driver);
        loginPage.login("user@phptravels.com","demouser");
        Assert.assertTrue(loginPage.verifyLoginUser("Demo User"));
    }
    
    @Test
    public void verify_login_page_with_valid_credentials_2(){
        loginPage = new PHPTravelsLoginPage(driver);
        loginPage.login("user@phptravels.com","demouser");
        Assert.assertTrue(loginPage.verifyLoginUser("Demo User"));
    }
}

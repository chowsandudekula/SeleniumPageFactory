import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PHPTravelsLoginPage extends BasePage{

    @FindBy(name = "username")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//form[@id='loginfrm']//button[@type='submit']")
    private WebElement loginBtn;

    private By labelUserTitle;

    PHPTravelsLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void login(String userName, String passwordToEnter){
        email.sendKeys(userName);
        password.sendKeys(passwordToEnter);
        loginBtn.click();

    }
    public Boolean verifyLoginUser(String userName){
        labelUserTitle = By.xpath("//h3[contains(text(),'"+userName+"')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(labelUserTitle));
        return  driver.findElement(labelUserTitle).isDisplayed();
    }


}

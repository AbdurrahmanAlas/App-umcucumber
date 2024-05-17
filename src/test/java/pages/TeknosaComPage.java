package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class TeknosaComPage {

    public TeknosaComPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//android.widget.EditText[@text=\"Marka ara\"]")
    public MobileElement marka_Ara;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[12]")
    public MobileElement birinciUrunFiyati;
    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[17]")
    public MobileElement ikinciUrunFiyati;

    @FindBy(xpath = "//*[@bounds='[137,666][378,714]']")
    public WebElement kutucuk;

}

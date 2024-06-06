package pages.AppPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class TelegramPage {

    public TelegramPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Country\"]/android.widget.LinearLayout/android.widget.ImageView")
    public MobileElement USA;

    @FindBy(xpath="//android.widget.EditText[@content-desc=\"Phone number\"]")
    public MobileElement phone;



    @FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Done\"]/android.view.View")
    public MobileElement sağokButton;



}

package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class FacebookPage {

    public FacebookPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }


    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Search Facebook\"]")
    public MobileElement facesearchbox;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    public MobileElement kayserisahibinden;


    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Member tools more options\"]")
    public MobileElement ucnokta;


    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Manage your content\"]")
    public MobileElement manageryourcontent;

}

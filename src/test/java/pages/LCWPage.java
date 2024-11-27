package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class LCWPage {

    public LCWPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(id = "com.lcwaikiki.android:id/searchFilterEditText")
    public MobileElement searchbox;

    @FindBy(xpath = "//*[@text=\"Aradığınız kelimeye uygun sonuç bulunamadı. Geçerli bir kelime yazarak tekrar deneyiniz.\"]")
    public MobileElement gelenkelime;


}

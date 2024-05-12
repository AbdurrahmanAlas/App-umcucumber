package pages.AppPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ResuableMethods;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class AileButcemPage {

    public AileButcemPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//*[@text=\"E-mail Adresi\"]")
    public MobileElement emailAdres;

    @FindBy(xpath = "//*[@text=\"Şifre\"]")
    public MobileElement password;

    @FindBy(xpath = "//*[@text=\"Giriş Yap\"]")
    public  MobileElement girisyap;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    private MobileElement girisYapildiText;


    @FindBy(xpath = "(//*[@class=\"android.widget.ImageView\"])[1]")
    public MobileElement solustmenu;

    @FindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[1]")
    private MobileElement isimKutusu;
    @FindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[2]")
    private MobileElement soyisimKutusu;
    @FindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[3]")
    private MobileElement sehirKutusu;
    @FindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[4]")
    private MobileElement yasKutusu;
    @FindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[5]")
    private MobileElement meslekKutusu;

public  void HesabımBilgiDegisikligi(String isim,String soyisim,String sehir,String yas,String meslek,String Kaydet){

    isimKutusu.clear();
    isimKutusu.sendKeys(isim);

    soyisimKutusu.clear();
    soyisimKutusu.sendKeys(soyisim);

    sehirKutusu.clear();
    sehirKutusu.sendKeys(sehir);

    yasKutusu.clear();
    yasKutusu.sendKeys(yas);

    meslekKutusu.clear();
    meslekKutusu.sendKeys(meslek);

    ResuableMethods.wait(2);
    ResuableMethods.scrollWithUiScrollable("Kaydet");
}

public void  HesabımBilgiDegisikligiAssert(){

    String actual=isimKutusu.getText();
    String excepted="Abdurrahman";
    assertEquals("bilgiler uyusmuyor",excepted,actual);


    String actualsoyisim=soyisimKutusu.getText();
    String exceptedsoyisim="Alas";
    assertEquals("bilgiler uyusmuyor",exceptedsoyisim,actualsoyisim);

    String expectedSehir="Kayseri";
    String actualSehir=sehirKutusu.getText();
    assertEquals("bilgiler uyusmuyor",expectedSehir,actualSehir);

    String actualYas=yasKutusu.getText();
    String expectedYas="33";
    assertEquals("bilgiler uyusmuyor",expectedYas,actualYas);

}




    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement aciklamaKutusu;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement TutarKutusu;

    @FindBy(id = "android:id/button1")
    public MobileElement okButonu;

    @FindBy(xpath = "//*[@text='Gelir eklendi.']")
    public MobileElement gelirEklemeCheck;
    public void girisBasariliMethodu(){
        String actual=girisYapildiText.getText();
        String expected="Başarıyla giriş yapıldı.";
        assertEquals("Giris Başarısız",expected,actual);
    }
}


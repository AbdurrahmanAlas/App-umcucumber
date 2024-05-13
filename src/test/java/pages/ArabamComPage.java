package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class ArabamComPage {

    public ArabamComPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }
    @FindBy(xpath = "//*[@text=\"E-posta Adresi veya Cep Telefonu\"]")
    public MobileElement emailAdres;

    @FindBy(xpath = "//*[@text=\"Şifre\"]")
    public MobileElement password;

    @FindBy(xpath = "(//*[@text=\"Giriş Yap\"])[2]")
    public MobileElement GırısYap;

    @FindBy(id = "com.dogan.arabam:id/imageViewOptions")
    public MobileElement ucNokta;

    @FindBy(id = "com.dogan.arabam:id/dailog_editText_price")
    public MobileElement fiyati_degistir_input;
    @FindBy(id = "com.dogan.arabam:id/textViewAdvertPrice")
    public MobileElement fiyatlari_karsilastir;


    @FindBy(id = "com.dogan.arabam:id/iv_B01001")
    public MobileElement onkaputdegisen;


    @FindBy(xpath = "(//*[@class=\"android.widget.ImageView\"])[2]")
    public MobileElement ucnokta2;



    @FindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[1]")
    public MobileElement ilanbasligi;
    @FindBy(id = "com.dogan.arabam:id/iv_B0801")
    public MobileElement solkapidegisen;


    @FindBy(xpath = "//*[@text=\"Düzenle ve Yayınla\"]")
    public MobileElement duzenlebuttongorundumu;

    @FindBy(xpath = "//*[@text=\"Tamam\"]")
    public MobileElement tamamButton;

    @FindBy(xpath = "//*[@text=\"Tramer Yok\"]")
    public MobileElement tramerYokGorundumu;

    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[10]")
    public MobileElement kasaTipi;



    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[12]")
    public MobileElement renk;
    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[14]")
    public MobileElement cekis;

    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[16]")
    public MobileElement koltuksayisi;
    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[18]")
    public MobileElement araccinsi;

    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[20]")
    public MobileElement aracdurumu;


    @FindBy(id = "com.dogan.arabam:id/etPhone")
    public MobileElement telefonNo;


    @FindBy(id = "com.dogan.arabam:id/tvPhoneOptionSelected")
    public MobileElement iletisimTelefon;


    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.dogan.arabam:id/tvLocationSelected\"]")
    public MobileElement il_ilce_adres;
    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[2]")
    public MobileElement kalınYaziSatinAl;




    @FindBy(xpath = "//*[@text=\"2011\"]")
    public MobileElement yil;


    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[12]")
    public MobileElement vitestipi;


    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[14]")
    public MobileElement vitesSayisi;

    @FindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[16]")
    public MobileElement yakitlitre;


    @FindBy(xpath = "(//*[@class=\"android.widget.LinearLayout\"])[9]")
    public MobileElement kmyayındadegil;


    @FindBy(id = "com.dogan.arabam:id/etPriceValue")
    public MobileElement fiyatInput;

    @FindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[3]")
    public MobileElement km;
    @FindBy(xpath = "//*[@text=\"Dizel\"]")
    public MobileElement dizel;

    @FindBy(xpath = "//*[@class=\"android.widget.EditText\"]")
    public MobileElement aciklamaSil;

    @FindBy(id = "android.widget.RelativeLayout/android.widget.LinearLayout")
    public MobileElement yeniAciklamaEkle;



    @FindBy(xpath = "(//*[@class=\"android.widget.ImageView\"])[5]")
    public MobileElement fotografSil;




}

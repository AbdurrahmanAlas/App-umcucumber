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


    @FindBy(id = "com.dogan.arabam:id/texViewTitle")
    public MobileElement ekspertizsayfasigeldimi;


    @FindBy(id = "com.dogan.arabam:id/textViewExpertisePointName")
    public MobileElement adres_geldimi;


    @FindBy(xpath = "//*[@text=\"Şubeleri incele\"]")
    public MobileElement sube_incele;


    @FindBy(id = "com.dogan.arabam:id/imageViewClose")
    public MobileElement expertiz_Carpı;


    @FindBy(xpath = "(//*[@class=\"android.widget.FrameLayout\"])[5]")
    public MobileElement basliklargorunuyormu;

























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


    @FindBy(xpath = "(//*[@text=\"Sil\"])[1]")
    public MobileElement mesajlar_SON;

    @FindBy(xpath = "(//*[@text=\"Mesaj Yaz\"])[1]")
    public MobileElement mesajlar_mesajyaz;

    @FindBy(xpath = "//*[@text=\"Merhaba aracımız hala satılıktır.\"]")
    public MobileElement mesajlar_Mesajyazıldımıkontrol;


    @FindBy(id = "com.dogan.arabam:id/clItemAdvertList")
    public MobileElement mesajlar_TumIlanlarGeldimi;

    @FindBy(id = "com.dogan.arabam:id/action_settings")
    public MobileElement mesajlar_ucnokta;


    @FindBy(id = "com.dogan.arabam:id/textViewDescriptionTitle")
    public MobileElement kayitli_favori_yok;


    @FindBy(id = "com.dogan.arabam:id/etIndvQueryNumber")
    public MobileElement plakayi_girin;


    @FindBy(id = "com.dogan.arabam:id/et_address_description")
    public MobileElement adres_yaz;

    @FindBy(id = "com.dogan.arabam:id/spn_city")
    public MobileElement adres_ilsec;

    @FindBy(id = "com.dogan.arabam:id/spn_county")
    public MobileElement adres_ilcesec;
    @FindBy(id = "com.dogan.arabam:id/spn_district")
    public MobileElement adres_semtsec;

    @FindBy(id = "com.dogan.arabam:id/et_postal_code")
    public MobileElement adres_postakodusec;


    @FindBy(id = "com.dogan.arabam:id/et_email")
    public MobileElement eposta;

    @FindBy(id = "com.dogan.arabam:id/et_identity_number")
    public MobileElement tckimlikno;

    @FindBy(id = "com.dogan.arabam:id/et_tax_office")
    public MobileElement vergidairesi;

    @FindBy(id = "com.dogan.arabam:id/et_tax_no")
    public MobileElement vergiNo;














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

package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TrendyolPage;
import utils.Driver;
import utils.ResuableMethods;

public class TrendyolStepdefinitions {

TrendyolPage trendyolPage=new TrendyolPage();
    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();


    @Given("{string} yazan kismina tikla")
    public void yazan_kismina_tikla(String erkek) {

        ResuableMethods.wait(15);
        ResuableMethods.scrollWithUiScrollable(erkek);


    }
    @Given("Ana sayfada {string} kismina tikla")
    public void ana_sayfada_kismina_tikla(String kategoriler) {

   ResuableMethods.scrollWithUiScrollable(kategoriler);

    }
    @Given("Mouse scroll ile asagı kaydır ve {string} kismini sec")
    public void mouse_scroll_ile_asagı_kaydır_ve_kismini_sec(String elektronik) {



        Actions actions = new Actions(driver);
        for (int i = 0; i < 2; i++) { // 5 kez kaydırır
            actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        }
        ResuableMethods.wait(3);

        ResuableMethods.scrollWithUiScrollable(elektronik);

    }
    @Given("{string} yazana tikla")
    public void yazana_tikla(String telefon) throws InterruptedException {


      ResuableMethods.koordinatTiklamaMethodu(685,255,3);
       ResuableMethods.wait(2);

     trendyolPage.telefon.click();
    }


    @Given("{string}  tikla")
    public void tikla(String android) throws InterruptedException {

        trendyolPage.androidtelefon.click();

    }

    @Given("{string} kisminaa tikla")
    public void kisminaa_tikla(String filtrele) {

        ResuableMethods.scrollWithUiScrollable(filtrele);


    }
    @Given("{string} ne2 tikla ve arama kismina 8GB yaz ve tikla")
    public void ne2_tikla_ve_arama_kismina_8gb_yaz_ve_tikla(String ramkapasite) throws InterruptedException {

        ResuableMethods.scrollWithUiScrollable(ramkapasite);

        ResuableMethods.scrollWithUiScrollable("8 GB");
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable("UYGULA");
        ResuableMethods.wait(2);
        ResuableMethods.scrollWithUiScrollable("Daha Fazla Filtre");
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable("Dahili Hafıza ");
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable("256 GB");
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable("UYGULA");
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable("NFC ");
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable("Var");
        ResuableMethods.scrollWithUiScrollable("UYGULA");
        ResuableMethods.wait(2);
        ResuableMethods.scrollWithUiScrollable("Mobil Bağlantı Hızı ");
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable("5G");
        ResuableMethods.scrollWithUiScrollable("UYGULA");

        trendyolPage.urunlerilistele.click();
    }

}

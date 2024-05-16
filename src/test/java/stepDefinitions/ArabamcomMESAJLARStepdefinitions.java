package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ArabamComPage;
import utils.ResuableMethods;

public class ArabamcomMESAJLARStepdefinitions {

    ArabamComPage arabamComPage=new ArabamComPage();

    @Given("{string} a tiklaa")
    public void a_tiklaa(String mesajlar) {
        ResuableMethods.wait(3);

        ResuableMethods.scrollWithUiScrollable(mesajlar);


    }
    @Given("Son gelen mesaja tikla mesajı yaz gonder")
    public void son_gelen_mesaja_tikla_mesajı_yaz_gonder() {

        arabamComPage.mesajlar_SON.click();
        arabamComPage.mesajlar_mesajyaz.sendKeys("Merhaba aracımız hala satılıktır.");

        ResuableMethods.scrollWithUiScrollable("Gönder");

        String expectedKelime="Merhaba aracımız hala satılıktır.";
        String actualKelime=arabamComPage.mesajlar_Mesajyazıldımıkontrol.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));

    }


    @Given("Son gelen mesaja tikla")
    public void son_gelen_mesaja_tikla() {

        arabamComPage.mesajlar_SON.click();


    }
    @Given("{string} linkine tikla")
    public void linkine_tikla(String tum_ilanlari_goster) {

        ResuableMethods.scrollWithUiScrollable("Tüm İlanlarını Göster");

        ResuableMethods.wait(3);
        Assert.assertTrue(arabamComPage.mesajlar_TumIlanlarGeldimi.isDisplayed());


    }
    @Given("Üc noktayaa tikla")
    public void üc_noktayaa_tikla() {

        arabamComPage.mesajlar_ucnokta.click();


    }
    @Given("{string} butonuna tikla ve dogrula")
    public void butonuna_tikla_ve_dogrula(String vazgec) {


        ResuableMethods.scrollWithUiScrollable(vazgec);

        Assert.assertTrue(arabamComPage.mesajlar_ucnokta.isDisplayed());


    }

    @Given("{string} a tiklayin")
    public void a_tiklayin(String favori_ilanlar) {

    ResuableMethods.scrollWithUiScrollable(favori_ilanlar);


    }
    @Given("{string} ne tiklayin")
    public void ne_tiklayin(String favori_listesi) {

ResuableMethods.scrollWithUiScrollable(favori_listesi);


    }
    @Given("{string} {string} {string} a tıklayın")
    public void a_tıklayın(String tumu, String yayında, String yayında_olmayan) {

ResuableMethods.scrollWithUiScrollable(tumu);
ResuableMethods.wait(2);
ResuableMethods.scrollWithUiScrollable(yayında);
ResuableMethods.wait(2);
ResuableMethods.scrollWithUiScrollable(yayında_olmayan);


    }

    @Given("Favori aramalar sayfasina girdigini dogrula")
    public void favori_aramalar_sayfasina_girdigini_dogrula() {

        ResuableMethods.wait(2);

        Assert.assertTrue(arabamComPage.kayitli_favori_yok.isDisplayed());


    }


    @Given("{string} e tıkla ve Bildirimlerin geldigini dogrula")
    public void e_tıkla_ve_bildirimlerin_geldigini_dogrula(String bildirimlerim) {

        ResuableMethods.scrollWithUiScrollable(bildirimlerim);



    }

}

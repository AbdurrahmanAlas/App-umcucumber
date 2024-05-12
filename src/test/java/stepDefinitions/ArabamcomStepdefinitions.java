package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ArabamComPage;
import utils.ConfigReader;
import utils.ResuableMethods;

public class ArabamcomStepdefinitions {

    ArabamComPage arabamComPage=new ArabamComPage();

    @Given("Ana Ekranda bulunan {string} a tiklayin ve ardindan Giris yapı ulasın")
    public void ana_ekranda_bulunan_a_tiklayin_ve_ardindan_giris_yapı_ulasın(String panelim) {

        ResuableMethods.scrollWithUiScrollable(panelim);


    }
    @Given("{string} a tiklayin ve ardindan login sayfasina ulasin")
    public void a_tiklayin_ve_ardindan_login_sayfasina_ulasin(String girisYap) {

        ResuableMethods.scrollWithUiScrollable(girisYap);
    }
    @Given("{string} ve {string} bilgilerini  girerek kullanici bilgileriyle {string} a tikla")
    public void ve_bilgilerini_girerek_kullanici_bilgileriyle_a_tikla(String mail, String password, String girisYap) {

        ResuableMethods.wait(2);
        arabamComPage.emailAdres.sendKeys(ConfigReader.getProperty(mail));
        arabamComPage.password.sendKeys(ConfigReader.getProperty(password));
        arabamComPage.GırısYap.click();

    }
    @Given("{string} e tiklayin")
    public void e_tiklayin(String panelim) {

        ResuableMethods.scrollWithUiScrollable(panelim);

    }
    @Given("{string} a tikla")
    public void a_tikla(String ilanlar) {

        ResuableMethods.scrollWithUiScrollable(ilanlar);

    }
    @Given("{string} butonuna tikla")
    public void butonuna_tikla(String yayındakiler) {

        ResuableMethods.scrollWithUiScrollable(yayındakiler);

    }
    @Given("Üc noktaya tikla")
    public void üc_noktaya_tikla() {

        arabamComPage.ucNokta.click();
    }
    @Given("{string} e tikla")
    public void e_tikla(String fiyatdegistir) {

        ResuableMethods.scrollWithUiScrollable(fiyatdegistir);

    }
    @Given("Araç fiyatının sorunsuz şekilde degiştigini dogrula")
    public void araç_fiyatının_sorunsuz_şekilde_degiştigini_dogrula() {

        arabamComPage.fiyati_degistir_input.clear();
        arabamComPage.fiyati_degistir_input.sendKeys("436.000");


    }

    @Given("Düzenle linkinin görüntülendigi dogrulanmalı")
    public void düzenle_linkinin_görüntülendigi_dogrulanmalı() {


      //  Assert.assertTrue(arabamComPage.duzenlebuttongorundumu.isDisplayed());
    }


    @Given("{string} ne tikla")
    public void ne_tikla(String boya_degısen) {

        ResuableMethods.scrollWithUiScrollable(boya_degısen);

    }
    @Given("Aracın tramer bilgisine tıkla ve tramer kaydı olup olmadıgını belirle ve dogrula")
    public void aracın_tramer_bilgisine_tıkla_ve_tramer_kaydı_olup_olmadıgını_belirle_ve_dogrula() {

        arabamComPage.onkaputdegisen.click();
        ResuableMethods.scrollWithUiScrollable("Boyanmış");

        ResuableMethods.scrollWithUiScrollable("Tramer");
        ResuableMethods.scrollWithUiScrollable("Tramer Yok");
        ResuableMethods.wait(3);
        //arabamComPage.tamamtramer.click();

    }
    @Given("Aracın boya-tramer bilgisinin degistigini dogrula")
    public void aracın_boya_tramer_bilgisinin_degistigini_dogrula() {





    }

}

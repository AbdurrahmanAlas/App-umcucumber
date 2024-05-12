package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ArabamComPage;
import utils.ConfigReader;
import utils.Driver;
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


        Assert.assertTrue(arabamComPage.duzenlebuttongorundumu.isDisplayed());
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
        ResuableMethods.wait(1);
       ResuableMethods.scrollWithUiScrollable("Tamam");
       ResuableMethods.wait(1);

    }
    @Given("Aracın boya-tramer bilgisinin degistigini dogrula")
    public void aracın_boya_tramer_bilgisinin_degistigini_dogrula() {

// "Tamam" metninin ekranın görünür olduğunu doğrula
        Assert.assertTrue(arabamComPage.tramerYokGorundumu.isDisplayed());
        Assert.assertTrue(arabamComPage.tamamButton.isDisplayed());




    }


    @Given("{string} na tikla ve ilan detaylarını gir dogru girildigini dogrula")
    public void na_tikla_ve_ilan_detaylarını_gir_dogru_girildigini_dogrula(String ilandetaylari) {

        ResuableMethods.scrollWithUiScrollable(ilandetaylari);

        arabamComPage.ilanbasligi.clear();
        arabamComPage.ilanbasligi.sendKeys("CADDY 2007 1.9 TDI ACİLL SATILIK");

        String actualBaslik = arabamComPage.ilanbasligi.getText();
        String expectedBaslik = "CADDY 2007 1.9 TDI ACİLL SATILIK";
        Assert.assertEquals(expectedBaslik, actualBaslik);


        arabamComPage.fiyatInput.clear();
        arabamComPage.fiyatInput.sendKeys("437.000");

        String actualFiyat = arabamComPage.fiyatInput.getText();
        String expectedFiyat = "437.000";
        Assert.assertEquals(expectedFiyat, actualFiyat);

        arabamComPage.km.clear();
        arabamComPage.km.sendKeys("360.000");

        String actualKm = arabamComPage.km.getText();
        String expectedKm = "360.000";
        Assert.assertEquals(expectedKm, actualKm);

        arabamComPage.dizel.click();
        ResuableMethods.scrollWithUiScrollable("Dizel");

        arabamComPage.kasaTipi.click();
        ResuableMethods.scrollWithUiScrollable("Camlı Van");

        String expectedKasaTipi = "Camlı Van";
        String actualKasaTipi = arabamComPage.kasaTipi.getText();
        Assert.assertEquals(expectedKasaTipi, actualKasaTipi);


        arabamComPage.renk.click();
        ResuableMethods.scrollWithUiScrollable("Gri (Gümüş)");

        arabamComPage.cekis.click();
        ResuableMethods.scrollWithUiScrollable("4x2 (Önden Çekişli)");

        arabamComPage.koltuksayisi.click();
        ResuableMethods.scrollWithUiScrollable("5+1");

        arabamComPage.araccinsi.click();
        ResuableMethods.scrollWithUiScrollable("Kamyonet");

        arabamComPage.aracdurumu.click();
        ResuableMethods.scrollWithUiScrollable("İkinci El");

        ResuableMethods.scrollWithUiScrollable("Açıklama");
        ResuableMethods.wait(2);
        arabamComPage.aciklamaSil.clear();
        ResuableMethods.wait(5);
        arabamComPage.aciklamaSil.sendKeys(" 2007 MODEL 1.9 TDI 358 BİN KM 435 BİN TL PAZARLIK PAYI VARDIR.");

        ResuableMethods.scrollWithUiScrollable("Tamam");
        ResuableMethods.wait(2);




// Renk seçeneğinin doğru seçildiğini doğrulama
        String expectedRenk = "Gri (Gümüş)";
        String actualRenk = arabamComPage.renk.getText();
        Assert.assertEquals(expectedRenk, actualRenk);

// Çekişin doğru seçildiğini doğrulama
        String expectedCekis = "4x2 (Önden Çekişli)";
        String actualCekis = arabamComPage.cekis.getText();
        Assert.assertEquals(expectedCekis, actualCekis);

// Koltuk sayısının doğru seçildiğini doğrulama
        String expectedKoltukSayisi = "5+1";
        String actualKoltukSayisi = arabamComPage.koltuksayisi.getText();
        Assert.assertEquals(expectedKoltukSayisi, actualKoltukSayisi);

// Araç tipinin doğru seçildiğini doğrulama
        String expectedAracCinsi = "Kamyonet";
        String actualAracCinsi = arabamComPage.araccinsi.getText();
        Assert.assertEquals(expectedAracCinsi, actualAracCinsi);

// Araç durumunun doğru seçildiğini doğrulama
        String expectedAracDurumu = "İkinci El";
        String actualAracDurumu = arabamComPage.aracdurumu.getText();
        Assert.assertEquals(expectedAracDurumu, actualAracDurumu);



        ResuableMethods.scrollWithUiScrollable("Tamam");
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable("DEVAM ET");
        ResuableMethods.wait(1);



    }


    @Given("* İletisim sayfasına  gir bilgileri gir ve dogrula")
    public void iletisim_sayfasına_gir_bilgileri_gir_ve_dogrula() {


        ResuableMethods.scrollWithUiScrollable("İletişim Bilgileri");

        arabamComPage.telefonNo.clear();
        arabamComPage.telefonNo.sendKeys("5395524681");

        arabamComPage.iletisimTelefon.click();

        ResuableMethods.wait(3);


        ResuableMethods.scrollWithUiScrollable("Kendi numaram görünsün");
        ResuableMethods.scrollWithUiScrollable("DEVAM");

        ResuableMethods.wait(3);
        arabamComPage.il_ilce_adres.click();
        ResuableMethods.wait(2);
        ResuableMethods.scrollWithUiScrollable("Kayseri");
        ResuableMethods.scrollWithUiScrollable("Kocasinan");
        ResuableMethods.scrollWithUiScrollable("Zümrüt Mahallesi");
        ResuableMethods.scrollWithUiScrollable("Tamam");

        ResuableMethods.wait(3);
        ResuableMethods.scrollWithUiScrollable("İletişim Bilgileri");

        Assert.assertTrue(arabamComPage.telefonNo.isDisplayed());

        String expectedKelime="Kayseri / Kocasinan / Zümrüt Mahallesi";
        String actualKelime =arabamComPage.il_ilce_adres.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));


    }

    @Given("{string} butonuna tıkla ve Acil satılık durumunu satın al ve dogrula")
    public void butonuna_tıkla_ve_acil_satılık_durumunu_satın_al_ve_dogrula(String turboAl) {

        ResuableMethods.scrollWithUiScrollable(turboAl);
        ResuableMethods.wait(3);
        arabamComPage.kalınYaziSatinAl.click();
        ResuableMethods.scrollWithUiScrollable("Devam");
        ResuableMethods.wait(2);
        Driver.getAndroidDriver().navigate().back();

    }


}

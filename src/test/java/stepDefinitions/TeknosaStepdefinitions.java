package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TeknosaComPage;
import utils.ResuableMethods;

public class TeknosaStepdefinitions {

    TeknosaComPage teknosaComPage=new TeknosaComPage();

    @Given("ilk ekran bolumunden {string} tiklanir")
    public void ilk_ekran_bolumunden_tiklanir(String atla) {

        ResuableMethods.wait(4);
        ResuableMethods.scrollWithUiScrollable(atla);

    }

    @Given("footer bolumunden {string} bolumune tiklanir")
    public void footer_bolumunden_bolumune_tiklanir(String kategoriler) {

        ResuableMethods.wait(3);
        ResuableMethods.scrollWithUiScrollable(kategoriler);
        ResuableMethods.wait(3);


    }

    @Given("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_bolumune_tiklanir(String telefon) {

        ResuableMethods.wait(2);
        ResuableMethods.scrollWithUiScrollable(telefon);


    }

    @Given("telefon sayfasindan cihaz secimi {string} yapilir")
    public void telefon_sayfasindan_cihaz_secimi_yapilir(String cep_Telefonu) {


        ResuableMethods.wait(2);
        ResuableMethods.scrollWithUiScrollable(cep_Telefonu);

    }

    @Given("cep telefonu sayfasinda {string} bolumune tiklanir")
    public void cep_telefonu_sayfasinda_bolumune_tiklanir(String siralama) {

        ResuableMethods.wait(3);
        ResuableMethods.scrollWithUiScrollable(siralama);

    }

    @Given("filtrele sayfasindan herhangi bir {string} filtreleme yapilir")
    public void filtrele_sayfasindan_herhangi_bir_filtreleme_yapilir(String marka) {
        ResuableMethods.wait(5);
        ResuableMethods.scrollWithUiScrollable(marka);

    }

    @Given("marka bolumunden bir cihaz {string} filtrelemesi yapilir")
    public void marka_bolumunden_bir_cihaz_filtrelemesi_yapilir(String apple) {

        ResuableMethods.wait(3);

        teknosaComPage.marka_Ara.sendKeys(apple);
        teknosaComPage.kutucuk.click();

        ResuableMethods.wait(3);

       ResuableMethods.scrollWithUiScrollable("Sonuçları Göster");
    }

    @Given("siralama sayfasından {string} siralamasi secilir")
    public void siralama_sayfasından_siralamasi_secilir(String sirala) {

        ResuableMethods.wait(3);
        ResuableMethods.scrollWithUiScrollable(sirala);

    }

    @Given("fiyatlarin azalan duzende oldugu test edilir")
    public void fiyatlarin_azalan_duzende_oldugu_test_edilir() {


        ResuableMethods.wait(3);
       // ResuableMethods.ekranKaydirmaMethodu(530,2032,750,530,667);
        String birinciUrunFiyatiText=teknosaComPage.birinciUrunFiyati.getText(); // 4.529,00 TL
        ResuableMethods.wait(2);
        String ikinciUrunFiyatiText= teknosaComPage.ikinciUrunFiyati.getText();
        birinciUrunFiyatiText=birinciUrunFiyatiText.replaceAll("\\D","");
        System.out.println(birinciUrunFiyatiText);
        ikinciUrunFiyatiText=ikinciUrunFiyatiText.replaceAll("\\D","");
        System.out.println(ikinciUrunFiyatiText);
        Assert.assertTrue(Integer.parseInt(birinciUrunFiyatiText)>Integer.parseInt(ikinciUrunFiyatiText));

    }

}

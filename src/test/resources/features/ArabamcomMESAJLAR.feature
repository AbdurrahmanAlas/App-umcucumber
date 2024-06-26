
  Feature: US_02 ARABAM COM MESAJLAR KISMINDA KONTROLLER


    @alas
    Scenario: TC_0201 Kullanici Arabam com girerek Mesajlar sayfasında> Gelen mesaja cevap verir ve dogrulama yapar

      Given kullanıcı kurulumları tamamlar
      * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
      *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
      * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
      * "Panelim" e tiklayin
      * "Mesajlar" a tiklaa
      * Son gelen mesaja tikla mesajı yaz gonder




      Scenario: TC_0202 Kullanici Arabam com girerek Mesajlar > Son mesaj > UcNoktaya tıkla mesaj atanın tüm mesajlarını kontrol et
        Given kullanıcı kurulumları tamamlar
        * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
        *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
        * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
        * "Panelim" e tiklayin
        * "Mesajlar" a tiklaa
        * Son gelen mesaja tikla
        * Üc noktayaa tikla
        * "Tüm İlanlarını Göster" linkine tikla


    Scenario: TC_0203 Kullanici Arabam com girerek Mesajlar > Son mesaj > UcNokta> Vazgec
      Given kullanıcı kurulumları tamamlar
      * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
      *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
      * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
      * "Panelim" e tiklayin
      * "Mesajlar" a tiklaa
      * Son gelen mesaja tikla
      * Üc noktayaa tikla
      * "Vazgeç" butonuna tikla ve dogrula




    Scenario: TC_0204 Kullanici Arabam com girerek Mesajlar > Son mesaj > UcNoktaya tıkla mesaj atanın tüm mesajlarını kontrol et
      Given kullanıcı kurulumları tamamlar
      * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
      *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
      * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
      * "Panelim" e tiklayin
      * "Favori aramalar" a tiklayin
      * Favori aramalar sayfasina girdigini dogrula


    @alas
    Scenario: US_0401 Arabamcom>Panelim> Bildirimlerim e tikla bildirmlerin geldigini dogrula

      Given kullanıcı kurulumları tamamlar
      * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
      *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
      * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
      * "Panelim" e tiklayin
      * "Bildirimlerim" e tıkla ve Bildirimlerin geldigini dogrula


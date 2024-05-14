

Feature: US_01 ARABAM COM İLANLAR > YAYINDAKI ILANLAR  MODULUNDE ISLEMLER


 Scenario: TC_0101 Kullanici Arabam com apksına girerek siteye giris yapar ve ilanlar > Yayındaki ilanlar > fiyat degisimini sorunsuz dogrulama yapar

   Given kullanıcı kurulumları tamamlar
   * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
   *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
   * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
   * "Panelim" e tiklayin
   * "İlanlar" a tikla
   * "Yayındakiler" butonuna tikla
   * Üc noktaya tikla
   * "Düzenle" e tikla
   * Düzenle linkinin görüntülendigi dogrulanmalı


  Scenario: TC_0102 Arabamcom sitesinde gerekli bilgileri girerek aracın Ilanlar>Yayındaki ilanlar> Düzenle kısmında aracın Boya-Degisen-Tramer bilgilerini girer ve dogrulama yapar

    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "İlanlar" a tikla
    * "Yayındakiler" butonuna tikla
    * Üc noktaya tikla
    * "Düzenle" e tikla
    * "Boya - Değişen - Tramer Bilgileri" ne tikla
    * Aracın tramer bilgisine tıkla ve tramer kaydı olup olmadıgını belirle ve dogrula
    * "Boya - Değişen - Tramer Bilgileri" ne tikla
    *  Aracın boya-tramer bilgisinin degistigini dogrula


  Scenario: TC_0103 Arabamcom sitesinde gerekli bilgileri girerek aracın Ilanlar>Yayındaki ilanlar> Düzenle kısmında aracın Boya-Degisen-Tramer bilgilerini girer ve dogrulama yapar

    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "İlanlar" a tikla
    * "Yayındakiler" butonuna tikla
    * Üc noktaya tikla
    * "Düzenle" e tikla
    * "İlan Detayları" na tikla ve ilan detaylarını gir dogru girildigini dogrula


  @alas
    Scenario: TC_0104 Arabamcom sitesinde gerekli bilgileri girerek aracın Ilanlar>Yayindaki ilanlar> Düzenle kısmında aracın İletisim bilgilerine tıklar  detay girer ve dogrulama yapar

      Given kullanıcı kurulumları tamamlar
      * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
      *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
      * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
      * "Panelim" e tiklayin
      * "İlanlar" a tikla
      * "Yayındakiler" butonuna tikla
      * Üc noktaya tikla
      * "Düzenle" e tikla
      * * İletisim sayfasına  gir bilgileri gir ve dogrula


  Scenario: TC_0105 Arabamcom sitesinde gerekli bilgileri girerek aracın Ilanlar>Yayindaki ilanlar> Düzenle kısmında aracın İletisim bilgilerine tıklar  detay girer ve dogrulama yapar

    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "İlanlar" a tikla
    * "Yayındakiler" butonuna tikla
    * Üc noktaya tikla
    * "Turbo Al" butonuna tıkla ve Acil satılık durumunu satın al ve dogrula



  Scenario: TC_0106 Arabamcom sitesinde gerekli bilgileri girerek aracın Ilanlar>Yayindaki ilanlar> Kalıcı olarak sil ve Yayından kaldır linklerinde ayrı ayrı dogrulama yapar

    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "İlanlar" a tikla
    * "Yayındakiler" butonuna tikla
    * Üc noktaya tikla
    *  Yayından kaldır linkine tıkla ve silme sebebini tıkla ve dogrulama yap


  Scenario: TC_0107 Arabamcom sitesinde gerekli bilgileri girerek aracın Ilanlar>Yayindaki ilanlar> Paylaş >Vazgeç butonuna tıkla ve  dogrulama yapar
    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "İlanlar" a tikla
    * "Yayındakiler" butonuna tikla
    * Üc noktaya tikla
    * "Vazgeç" butonuna tikla ve geri geldigini dogrula



  Scenario: TC_0108 Arabamcom sitesinde gerekli bilgileri girerek aracın Ilanlar>YAYINDA OLMAYAN ILANLAR> Uc nokta> Düzenle ve yayınla >Ilan detayları butonuna tıkla ve  dogrulama yapar

    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "İlanlar" a tikla
    * "Yayında Olmayanlar" butonuna tiklaa
    * Üc noktaya tikla
    * "Düzenle ve Yayınla" ya tikla
    * Yayinda Olmayanlar "İlan Detayları" na tikla ve ilan detaylarını gir dogru girildigini dogrula

  @alas
    Scenario: TC_0109  Ilan fotografları linkine tıkla ve son resmi sil ve silindigini dogrula

      Given kullanıcı kurulumları tamamlar
      * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
      *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
      * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
      * "Panelim" e tiklayin
      * "İlanlar" a tikla
      * ikinci Üc noktaya tikla
     * "Düzenle" e tikla
      * Ilan fotografları linkine tıkla ve son resmi sil ve silindigini dogrula


  @alas
  Scenario: TC_0110  Ilan fotografları linkine tıkla ve son resmi sil ve silindigini dogrula

    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "İlanlar" a tikla
    * "Yayında Olmayanlar" butonuna tiklaa
    * Üc noktaya tikla
    * "Vazgeç" butonuna tikla ve geri geldigini dogrula
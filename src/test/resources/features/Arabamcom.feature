

Feature: US_01 ARABAM COM İLANLAR > YAYINDAKI ILANLAR  MODULUNDE ISLEMLER

  @alas
 Scenario: TC_0101 Kullanici Arabam com apksına girerek siteye giris yapar ve ilanlar > Yayındaki ilanlar > fiyat degisimini sorunsuz dogrulama yapar

   Given kullanıcı kurulumları tamamlar
   * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
   *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
   * "mailArabam" ve "sifreArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
   * "Panelim" e tiklayin
   * "İlanlar" a tikla
   * "Yayındakiler" butonuna tikla
   * Üc noktaya tikla
   * "Fiyatı Değiştir" e tikla
   * Araç fiyatının sorunsuz şekilde degiştigini dogrula

  @alas
  Scenario: TC_0102 Arabamcom sitesinde gerekli bilgileri girerek aracın Ilanlar>Yayındaki ilanlar> Düzenle kısmında aracın Boya-Degisen-Tramer bilgilerini girer ve dogrulama yapar

    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "sifreArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "İlanlar" a tikla
    * "Yayındakiler" butonuna tikla
    * Üc noktaya tikla
    * "Düzenle" e tikla
    * "Boya - Değişen - Tramer Bilgileri" ne tikla
    * Aracın tramer bilgisine tıkla ve tramer kaydı olup olmadıgını belirle ve dogrula
    * "Boya - Değişen - Tramer Bilgileri" ne tikla
    *  Aracın boya-tramer bilgisinin degistigini dogrula

  @alas
  Scenario: TC_0103 Arabamcom sitesinde gerekli bilgileri girerek aracın Ilanlar>Yayındaki ilanlar> Düzenle kısmında aracın Boya-Degisen-Tramer bilgilerini girer ve dogrulama yapar

    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "sifreArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "İlanlar" a tikla
    * "Yayındakiler" butonuna tikla
    * Üc noktaya tikla
    * "Düzenle" e tikla
    * "İlan Detayları" na tikla ve ilan detaylarını gir dogru girildigini dogrula



  Scenario: Kullanici arabamcom uygulamasına basarili bir sekilde giris yaparak ilgili gorevleri yerine getirir

    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "sifreArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin ve "İlanlar" a tiklayin
  #  * sol kisimdaki menuden "Hesabım" bolumune gidin
  #  * hesabim sayfasindaki bilgileri "Abdurrahman" "Alas" "Kayseri" "33" "Software Engineer" degistirerek degisikleri kaydedin
  #  * ardindan degisiklerin yapil"digini dogrulayinddddd

#*** burda bug var İl adı VE ilce adı  yazılamıyor
Feature: US_04 Arabamcom  Hasar Sorgulama kontrol et

  @alas
  Scenario: TC_0401 Arabamcom>Panelim>HasarSorgulama ya tikla ve plaka ile sorgula
    Given kullanıcı kurulumları tamamlar
    * Ana Ekranda bulunan "Panelim" a tiklayin ve ardindan Giris yapı ulasın
    *  "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
    * "mailArabam" ve "passwordArabam" bilgilerini  girerek kullanici bilgileriyle "Giriş Yap" a tikla
    * "Panelim" e tiklayin
    * "Hasar Sorgulama" ya tikla
    * Plakayi gir ve sorgula butonuna tikla
    * "Adres Ekle" ve "Kaydet" ye tikla ve adresi ekle
    * Telefon E-Posta* TC Kimlik Numarası Vergi Dairesi Vergi No Kredi Kartı na tikla ve islemleri yap ve yapildigini dogrula

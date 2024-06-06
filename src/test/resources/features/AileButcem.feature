



  Feature:Aile Butcem Login Test

    Scenario: Kullanici aile butcem uygulamasına basarili bir sekilde giris yaparak ilgili gorevleri yerine getirir

      Given kullanıcı kurulumları tamamlar
      * ilk ekran ayarlarini yapin "Giriş Yap" a tiklayin ve ardindan login sayfasina ulasin
      * "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap" a tikla
      * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
      * sol kisimdaki menuden "Hesabım" bolumune gidin
      * hesabim sayfasindaki bilgileri "Abdurrahmann" "Alas" "Kayseri" "33" "Software Engineer" degistirerek degisikleri kaydedin
      * ardindan degisiklerin yapildigini dogrulayin
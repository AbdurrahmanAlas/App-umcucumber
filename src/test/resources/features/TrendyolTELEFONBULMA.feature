
  Feature: Trendyol sitesinden Akıllı Telefon bulma

    @trendyol
    Scenario: Trendyolda isteklere uygun akıllı telefon bulma
      Given kullanıcı kurulumları tamamlar
      * "ERKEK" yazan kismina tikla
      * Ana sayfada "Kategoriler" kismina tikla
      * Mouse scroll ile asagı kaydır ve "Elektronik" kismini sec
      * "Telefon" yazana tikla
      * "Android Cep Telef..."  tikla
      * "Filtrele" kisminaa tikla
      * "RAM Kapasitesi " ne2 tikla ve arama kismina 8GB yaz ve tikla


      @trendyol2
      Scenario: Trendyolda aradığın özellikte laptop bulma
        Given kullanıcı kurulumları tamamlar
        * "ERKEK" yazan kismina tikla
        * Ana sayfada "Kategoriler" kismina tikla
        * Mouse scroll ile asagı kaydır ve "Elektronik" kismini sec
        * Elektronik kisminda "Bilgisayar & Tablet" alanina tikla
        * "Laptop" a tikla
        * "Filtrele" kisminaa tikla
        * "Marka " ya tiklaa
        * Marka Ara kismina "LENOVO" yaz ve tikla tekrar sil ve "HP" yaz ve tikla
        * "UYGULA" butonuna tikla
        * "Ram (Sistem Belleği) " ne tiklaa ve 32GB ram seç
        * "UYGULA" butonuna tikla
        * "Ekran Kartı " na tikla ve "Nvidia GeForce RTX 3050" seç
        * "UYGULA" butonuna tikla




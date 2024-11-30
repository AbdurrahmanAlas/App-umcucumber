
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



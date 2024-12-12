
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

    @trendyol3
        Scenario: Trendyolda en cok favorilenen vestiyer bulma

          Given kullanıcı kurulumları tamamlar
          * "ERKEK" yazan kismina tikla
          * Ana ekranda searchbox kutusuna "vestiyer" yaz ve ara
          * "Sırala" butonuna tikla ve "En Favoriler" butonuna tikla
          * Ilk gelen urune tikla
        *   "Sepete Ekle" ye tikla
        *   sonra "Devam Et" e tikla ve Ekhizmet carpısına tikla
        *   "Sepeti Onayla" ya tiklaaa
        *    Sepeti onayladıktan sonra acılan "Üye Olmadan Devam Et" butonuna tikla
        *    "VAZGEÇ" de bitir.

    @trendyol4

    Scenario: Trendyolda beyaz eşyadan buzdolabı sec 40000-50000 arası tikla

      Given  kullanıcı kurulumları tamamlar
      * "ERKEK" yazan kismina tikla
      *  Ana sayfada "Kategoriler" kismina tikla
      * Mouse scroll ile asagı kaydır ve "Elektronik" kismini sec
      * Elektronik kisminda "Beyaz Eşya" alanina tikla
     *  "Buzdolabı" sec ve "Fiyat" a tikla
      * "40000 TL - 50000 TL" ye tiklaa
      * "Uygula" butonuna tikla
      * "Sepete Ekle" ye tikla
      *   sonra "Devam Et" e tikla ve Ekhizmet carpısına tikla
      *   "Sepeti Onayla" ya tiklaaa
      *    Sepeti onayladıktan sonra acılan "Üye Olmadan Devam Et" butonuna tikla
      *    "VAZGEÇ" de bitir.




  Feature: US_04 Teknosa  kontrolleri

    @alas
    Scenario: TC_0401 Teknosa kurulumu yap

      Given kullanıcı kurulumları tamamlar
      * ilk ekran bolumunden "Atla" tiklanir
      * footer bolumunden "Kategoriler" bolumune tiklanir
      * kategoriler bolumunden "Telefon" bolumune tiklanir
      * telefon sayfasindan cihaz secimi "Cep Telefonu" yapilir
      * cep telefonu sayfasinda "Filtrele" bolumune tiklanir
      * filtrele sayfasindan herhangi bir "Marka" filtreleme yapilir
      * marka bolumunden bir cihaz "Apple" filtrelemesi yapilir
      * cep telefonu sayfasinda "Sırala" bolumune tiklanir
      * siralama sayfasından "Azalan Fiyat" siralamasi secilir
      * fiyatlarin azalan duzende oldugu test edilir



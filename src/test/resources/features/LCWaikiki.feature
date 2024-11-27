
  Feature:
    @lcw1

      # BUG VAR RENKTE SİYAH YAZINCA SİYAH GELMİYOR
    Scenario:
      Given kullanıcı kurulumları tamamlar
      * "Kategoriler" kismina tikla
      * Kategoriler bolumunden "Erkek" linkine tikla
      * Erkek kismından "Ayakkabı" ya tikla
      * Ayakkabı bolumunden "Bot" a tikla
      * "Filtrele"  butonuna tikla
      * "Beden" kismina tikla ve arama kismina ilgili bedeni(42) yaz gelen kutucugu isaretle
      * "Uygula" kismina tiklaa
      * "Ürün Tipi" yi tikla ve arama kismina bot yaz ve ara gelen kutucugu isaretle
      * "Renk" i tikla ve "Siyah" sec ve "Uygula" ya tikla


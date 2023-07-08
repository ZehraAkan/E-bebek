@Ebebek
Feature: Kullanıcı sepete eklenen ürünü kontrol edebimelidir.

  @Sepeteürünkontrolü

  Scenario: Sepete eklenen ürün kontrol edilmeli

    Given E-bebek ana sayfasına gidilir
    And  Arama çubuğuna biberon yazılır ve aratılır
    And Çıkan ilk ürüne tıklanır
    And İlgili ürün sepete eklenir
    Then Sepete eklendiği kontrol edilir
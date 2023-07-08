package com.ebebek.pages;

import com.ebebek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //div[@class='custom-breadcrumb']
    @FindBy(xpath = " //div[@class='custom-breadcrumb']")
    public WebElement AnaSayfa;

    public void AramaCubugunaBiberonYazilirveAratilir(String kelime){};
    //div[@class='search-wrapper']
    @FindBy(id = "txtSearchBox")
    public WebElement Biberon;

    public void Çıkanilkürünetıklanır(){};
    //div[@class='product-item']
    @FindBy(xpath = "(//h2[@class='product-item__brand'])[1]")
    public WebElement IlkUrun;

    public void İlgiliürünsepeteeklenir(){};
    //div[@class='product-item-content']
    @FindBy(xpath ="//button[@class='btn btn-add ng-star-inserted']")

    public WebElement Sepet;
    @FindBy(id ="btnShowCart")
    public WebElement SepetiGoster;

    public void Sepeteeklendiğikontroledilir(){};
    //div[@class='ng-star-inserted']
    @FindBy(xpath = "//div[@class='basket-product-item']")
    public WebElement Kontrol;








}






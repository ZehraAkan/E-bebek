package com.ebebek.step_definitions;

import com.ebebek.pages.BasePage;
import com.ebebek.utilities.BrowserUtilies;
import com.ebebek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.*;

public class EbebekStepDefinitions {
    BasePage basePage = new BasePage();

    @Given("E-bebek ana sayfasına gidilir")
    public void step_goto_ebebek_homepage(){

        Driver.getDriver().get("https://www.e-bebek.com/");
        BrowserUtilies.waitFor(5);
    }

    @And("Arama çubuğuna biberon yazılır ve aratılır")
    public void step_search_product(){
        basePage.Biberon.sendKeys("biberon"+ Keys.ENTER);

    }

    @And("Çıkan ilk ürüne tıklanır")
    public void step_click_first_product(){
        basePage.IlkUrun.click();
    }

    @And("İlgili ürün sepete eklenir")
    public void step_add_product_to_cart(){
        basePage.Sepet.click();
        basePage.SepetiGoster.click();

    }

    @Then("Sepete eklendiği kontrol edilir")
    public void step_verify_product_added_to_cart(){
        Assert.assertTrue(basePage.Kontrol.isDisplayed());

    }



}

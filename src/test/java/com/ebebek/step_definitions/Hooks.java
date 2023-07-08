package com.ebebek.step_definitions;

import com.ebebek.utilities.ConfigurationReader;
import com.ebebek.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {

    private static int id = 1;

    @Before
    public void setDriver() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonHomePage"));
    }

    @After
    public void teardownScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", (id++) + scenario.getName());
        }
        Driver.closeDriver();
    }
}

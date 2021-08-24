package comsetpdefinitionswagmobile;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utility.Log;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/swagmobileapp", glue = { "hookdefinitions",
		"comsetpdefinitionswagmobile" }, monochrome = true, plugin = { "pretty", "html:target/cucumber",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, dryRun = false)//, tags="@test")
public class TestRunner {

	@BeforeClass
	public static void runthejar() throws IOException, InterruptedException {
		Log.info("the swag mobile app open");
	}

}
package hookdefinitions;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.Log;

public class HookIntialisation {
	public static WebDriver driver;

	@Before
	public void openapp() throws IOException, InterruptedException {
		DOMConfigurator.configure("log4j.xml");
		Log.info("app has been started");
	}

}

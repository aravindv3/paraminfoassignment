package commoduledefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.CheckoutInfoSwagAppPageObject;
import compageobjectdefinition.ProductsSwagAppPageObject;
import cucumber.api.Scenario;
import gherkin.ast.Step;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.HandlingElementValidation;

public class CheckoutInfoSwagApp extends CheckoutInfoSwagAppPageObject {

	public CheckoutInfoSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static void verifyCheckoutInfo(AppiumDriver driver) throws IOException {
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_firstname)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_firstname,
					HandlingElementValidation.getDataFromProperties().getProperty("firstname"));
		}
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_lastname)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_lastname,
					HandlingElementValidation.getDataFromProperties().getProperty("lastname"));
		}
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_postalcode)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_postalcode,
					HandlingElementValidation.getDataFromProperties().getProperty("postalcode"));
		}

		CheckoutInfoSwagAppPageObject.btn_continue.click();
	}
	
	public static void verifyCheckoutInfoEmpty(AppiumDriver driver) throws IOException {
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_firstname)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_firstname,"");
		}
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_lastname)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_lastname,"");
		}
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_postalcode)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_postalcode,"");
		}

		CheckoutInfoSwagAppPageObject.btn_continue.click();
	}

}

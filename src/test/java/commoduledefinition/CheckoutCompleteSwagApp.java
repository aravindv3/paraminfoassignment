package commoduledefinition;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.CheckoutCompleteSwagAppPageObject;
import compageobjectdefinition.ProductsSwagAppPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutCompleteSwagApp extends CheckoutCompleteSwagAppPageObject {

	public CheckoutCompleteSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static void validateCheckoutComplete(AppiumDriver driver) {
		assertTrue(CheckoutCompleteSwagAppPageObject.lbl_checkoutcomplete.getText().contains("COMPLETE"));
	}
}

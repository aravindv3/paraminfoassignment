package commoduledefinition;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.ProductsSwagAppPageObject;
import compageobjectdefinition.YourCartSwagAppPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.HandlingElementValidation;

public class YourCartSwagApp extends YourCartSwagAppPageObject {

	public YourCartSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public static void validateYourCart(AppiumDriver driver) {
		if(HandlingElementValidation.ElementPresent(driver, YourCartSwagAppPageObject.lbl_description)) {
			YourCartSwagAppPageObject.btn_checkout.click();
		}
	}
	
	public static void removeItemsFromYourCart(AndroidDriver driver) {
		assertTrue(YourCartSwagAppPageObject.btn_remove.size()>0);
		YourCartSwagAppPageObject.btn_remove.get(0).click();
		}
}

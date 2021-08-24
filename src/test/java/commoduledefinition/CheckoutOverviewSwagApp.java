package commoduledefinition;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.CheckoutCompleteSwagAppPageObject;
import compageobjectdefinition.CheckoutOverviewSwagAppPageObject;
import compageobjectdefinition.ProductsSwagAppPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import utility.HandlingElementValidation;

public class CheckoutOverviewSwagApp extends CheckoutOverviewSwagAppPageObject {

	public CheckoutOverviewSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public static void verifyCheckoutOverview(AppiumDriver driver) {
		if(HandlingElementValidation.ElementPresent(driver, CheckoutOverviewSwagAppPageObject.lbl_checkoutdescription)) {
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			         ".scrollIntoView(new UiSelector().text(\"FINISH\"))"));
			CheckoutOverviewSwagAppPageObject.btn_finish.click();
			
		}
	}
}

package compageobjectdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import basedriver.AndroidBaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutOverviewSwagAppPageObject extends AndroidBaseClass {

	public CheckoutOverviewSwagAppPageObject(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//overview
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-Description']")
	public static AndroidElement lbl_checkoutdescription;
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-FINISH']")
	public static AndroidElement btn_finish;
	
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
	        ".scrollIntoView(new UiSelector().text(\"FINISH\"))")
	MobileElement element;

}

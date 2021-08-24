package compageobjectdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import basedriver.AndroidBaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class YourCartSwagAppPageObject extends AndroidBaseClass {

	public YourCartSwagAppPageObject(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// your cart
	@AndroidFindBy(xpath = "//*[@content-desc='test-Description']")
	public static WebElement lbl_description;
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-CHECKOUT']")
	public static WebElement btn_checkout;
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-REMOVE']")
	public static List<WebElement> btn_remove;
	
}

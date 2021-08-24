package compageobjectdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import basedriver.AndroidBaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CheckoutCompleteSwagAppPageObject extends AndroidBaseClass {

	public CheckoutCompleteSwagAppPageObject(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	//checkout complete
	
	@AndroidFindBy(xpath="//*[@text='CHECKOUT: COMPLETE!']")
	public static WebElement lbl_checkoutcomplete;
	
	@iOSXCUITFindBy(xpath="//*[@text='CHECKOUT: COMPLETE!']")
	public static IOSElement lbl_checkoutfinal;
}

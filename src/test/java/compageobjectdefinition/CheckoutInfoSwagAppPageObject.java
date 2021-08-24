package compageobjectdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import basedriver.AndroidBaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CheckoutInfoSwagAppPageObject extends AndroidBaseClass {

	public CheckoutInfoSwagAppPageObject(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	//checkout review
	@iOSXCUITFindBy(xpath = "//*[@content-desc='test-First Name']")
	@AndroidFindBy(xpath = "//*[@content-desc='test-First Name']")
	public static WebElement txt_firstname;
	
	@iOSXCUITFindBy(xpath = "//*[@content-desc='test-Last Name']")
	@AndroidFindBy(xpath = "//*[@content-desc='test-Last Name']")
	public static WebElement txt_lastname;
	
	@iOSXCUITFindBy(xpath = "//*[@content-desc='test-Zip/Postal Code']")
	@AndroidFindBy(xpath = "//*[@content-desc='test-Zip/Postal Code']")
	public static WebElement txt_postalcode;
	
	@iOSXCUITFindBy(xpath = "//*[@content-desc='test-CONTINUE']")
	@AndroidFindBy(xpath = "//*[@content-desc='test-CONTINUE']")
	public static WebElement btn_continue;
	
	
}

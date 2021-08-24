package compageobjectdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import basedriver.AndroidBaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginSwagAppPageObject extends AndroidBaseClass {

	public LoginSwagAppPageObject(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(xpath = "//*[@text='Username' ]")
	@AndroidFindBy(xpath = "//*[@text='Username' and @content-desc='test-Username']")
	public static WebElement txt_username;
	
	@iOSXCUITFindBy(xpath = "//*[@text='Password' and @content-desc='test-Password']")
	@AndroidFindBy(xpath = "//*[@text='Password' and @content-desc='test-Password']")
	public static WebElement txt_password;
	
	@iOSXCUITFindBy(xpath ="//*[@content-desc='test-LOGIN']")
	@AndroidFindBy(xpath ="//*[@content-desc='test-LOGIN']")
	public static WebElement btn_login;

	@iOSXCUITFindBy(xpath = "//*[@text='PRODUCTS']")
	@AndroidFindBy(xpath = "//*[@text='PRODUCTS']")
	public static WebElement lbl_products;
	
	@AndroidFindBy(xpath= "//*[@content-desc='test-Error message']/android.widget.TextView")
	public static AndroidElement err_message;
}

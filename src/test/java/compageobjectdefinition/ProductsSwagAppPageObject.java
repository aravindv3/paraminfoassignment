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

public class ProductsSwagAppPageObject extends AndroidBaseClass {

	public ProductsSwagAppPageObject(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(xpath = "//*[@text='PRODUCTS']")
	@AndroidFindBy(xpath = "//*[@text='PRODUCTS']")
	public static WebElement lbl_products;
	
	@iOSXCUITFindBy(xpath = "//*[@text='ADD TO CART']")
	@AndroidFindBy(xpath = "//*[@text='ADD TO CART']")
	public static List<WebElement> btn_addtocart;
	
	@iOSXCUITFindBy(xpath = "//*[@content-desc='test-REMOVE']")
	@AndroidFindBy(xpath = "//*[@content-desc='test-REMOVE']")
	public static WebElement btn_remove;
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-Cart']//android.widget.TextView")
	public static WebElement btn_cart;
	
	
}

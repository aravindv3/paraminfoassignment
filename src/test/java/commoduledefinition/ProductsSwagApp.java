package commoduledefinition;

import static org.junit.Assert.assertTrue;
import java.util.Random;

import org.openqa.selenium.support.PageFactory;

import compageobjectdefinition.LoginSwagAppPageObject;
import compageobjectdefinition.ProductsSwagAppPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.HandlingElementValidation;

public class ProductsSwagApp extends ProductsSwagAppPageObject {

	public ProductsSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public static void verifyDashboardProducts(AppiumDriver driver) {
		HandlingElementValidation.expectedconditionWebElement(driver, LoginSwagAppPageObject.lbl_products, 30);
		assertTrue(HandlingElementValidation.ElementPresent(driver, LoginSwagAppPageObject.lbl_products));
		assertTrue(ProductsSwagAppPageObject.btn_addtocart.size()>0);
	}

	public static void verifyAddtocart(AppiumDriver driver) {
		if(ProductsSwagAppPageObject.btn_addtocart.size()>0) {
			int randomaddtocart = new Random().nextInt(ProductsSwagAppPageObject.btn_addtocart.size());
			ProductsSwagAppPageObject.btn_addtocart.get(randomaddtocart).click();
		}else {
			assertTrue(ProductsSwagAppPageObject.btn_addtocart.size()>0);
		}
	}
	
	public static void verifyMultipleAddtocart(AppiumDriver driver) {
		if(ProductsSwagAppPageObject.btn_addtocart.size()>1) {
			for (int i = 0; i < 3; i++) {
				int randomaddtocart = new Random().nextInt(ProductsSwagAppPageObject.btn_addtocart.size());
				ProductsSwagAppPageObject.btn_addtocart.get(randomaddtocart).click();	
			}
			
		}else {
			assertTrue(ProductsSwagAppPageObject.btn_addtocart.size()>1);
		}
	}
	
	public static void clickCart(AppiumDriver driver) {
		ProductsSwagAppPageObject.btn_cart.click();
	}

}

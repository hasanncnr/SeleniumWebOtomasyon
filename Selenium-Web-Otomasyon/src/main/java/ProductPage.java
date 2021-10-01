import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage<SeeMore> extends BasePage {
    SeeMore seeMore;

    By shippingOptionLocator = By.className("breadcrumb");
    By productNameLocator = By.className("title");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean İsOnProductPage() {
        return isDisplayed(shippingOptionLocator);
    }

    public SeeMore seeMore() {
        return seeMore;
    }

    public void selectProduct(int i){
        getAllproducts().get(i).click();


    }


    private List<WebElement> getAllproducts(){
        return findAll(productNameLocator);
    }
}

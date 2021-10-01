import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.id("search");
    By submitButtonLocator = By.className("search-button");

    public SearchBox(WebDriver driver) {
        super(driver);
    }


    public void search(String text) {
        type(searchBoxLocator,text);
        click(submitButtonLocator);

    }
}




package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;
import utils.PropertyReader;

import static org.testng.AssertJUnit.assertTrue;

public class HomePage extends LoadableComponent<HomePage> {

    WebDriver driver;
    SearchResultsPage searchResultsPage;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(className = "nav-input")
    private WebElement submitText;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public SearchResultsPage searchItem() {
        searchTextBox.sendKeys("Kindle");
        submitText.click();
        return searchResultsPage;
    }

    @Override
    protected void load() {
     driver.get(new PropertyReader().readProperty("applicationURL"));
    }

    @Override
    protected void isLoaded() throws Error {
        System.out.println(">>>>>>><<<<<<");
        assertTrue("HomePage is not loaded!", driver.getCurrentUrl().equals(
                new PropertyReader().readProperty("applicationURL")));
    }
}






package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
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
        return searchResultsPage=new SearchResultsPage(driver);
    }
}






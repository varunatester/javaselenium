package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageBeforePageFactory {
    WebDriver driver;
    SearchResultsPage searchResultsPage;
    private By searchTextBox=By.id("twotabsearchtextbox");
    private By submitText=By.className("nav-input");

    public HomePageBeforePageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public void searchItem() {
        driver.findElement(searchTextBox).sendKeys("Kindle");
        driver.findElement(submitText).click();
       //return searchResultsPage=new SearchResultsPage(driver,);
    }
}





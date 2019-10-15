package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.testng.Assert.assertEquals;

public class SearchResultsPage extends LoadableComponent<SearchResultsPage> {
    private WebDriver driver;
    private LoadableComponent<HomePage> parent;

    SearchResultsPage(WebDriver driver, LoadableComponent<HomePage> parent) {
        this.driver = driver;
        this.parent = parent;
    }
    public void verifySearchResultsSortByFeature() {
        assertEquals(driver.findElement(
                By.cssSelector("span#a-autoid-0-announce > span.a-dropdown-prompt")).getText(),
                "Featured");
    }

    @Override
    protected void load() {
        parent.get().searchItem();
    }

    @Override
    protected void isLoaded() throws Error {

    }
}
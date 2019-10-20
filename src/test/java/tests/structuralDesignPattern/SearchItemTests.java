package tests.structuralDesignPattern;

import org.testng.annotations.Test;
import tests.BaseTest;
import utils.Categories;

public class SearchItemTests extends BaseTest {
    @Test(groups = Categories.SANITY)
    public void verifySearchResults(){
       homePage
               .searchItem()
               .verifySearchResultsSortByFeature();
    }
}

package Experitest.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com")
public class GooglePage extends PageObject {

    @FindBy(name="q")
    protected WebElementFacade searchBar;

    @FindBy(name="btnK")
    protected WebElementFacade searchButton;

    public void searchFor(String searchTerm){
        typeInto(searchBar,searchTerm);
        clickOn(searchButton);
    }

    public void lookForResult(String text){
        find(By.xpath("//*[contains(text(),"+text+")]"));
    }

}

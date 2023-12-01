package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefination.BaseClass;

import java.util.List;

public class SearchCustomerPage extends BaseClass {
    public SearchCustomerPage(){
        super();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "SearchEmail")
    WebElement emailAdd;

    @FindBy(id = "search-customers")
    WebElement searchBtn;

    @FindBy(xpath = "//table[@role='grid']")
    WebElement searchResult;

    @FindBy(xpath="//table[@id='customers-grid']//tbody/tr")
    List<WebElement> tableRows;

    @FindBy(id="SearchFirstName")
    WebElement firstName;

    @FindBy(id="SearchLastName")
    WebElement lastName;

    public void enterEmailAdd(String email){
        emailAdd.sendKeys(email);
    }

    public void clickOnSearchButton(){
        searchBtn.click();
    }
    public boolean searchCustomerByEmail(String email){
        boolean found = false;
        int ttlRows = tableRows.size();
        for (int i = 1; i<=ttlRows;i++){
            System.out.println("Searching row:"+i);
            WebElement webElementEmail = driver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[\" + i  + \"]/td[2]"));
            String actualEmailAdd = webElementEmail.getText();
            System.out.println(actualEmailAdd);
            if(actualEmailAdd.equals(email)){
                found = true;
            }
        }
        return found;
    }

}
